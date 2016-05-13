package org.xtext.example.rules.analysis.scriptvisitors;

import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.XExpression;
import org.xtext.example.rules.analysis.ConflictAvoidanceChecker;
import org.xtext.example.rules.analysis.statements.FeatureInvocation;

/**
 * 
 * @author cnandi
 *
 */
public class ExpressionVisitorImpl implements ExpressionVisitor {
	
	

	private ScriptExpressionSwitch expressionSwitch = new ScriptExpressionSwitch();
	private static int if_counter = 0;
	private static int feature_counter = 0;
	private static int member_feature_counter = 0;

	@Override
	public void visit(XIfExpression xIfExpression) {
		if_counter++;
		ConflictAvoidanceChecker.ast_writer.println("If then else:" + if_counter);
		if (xIfExpression.getExpression().eContents().size() == 3) {
			ConflictAvoidanceChecker.ast_writer.println("condition: " + if_counter);
			expressionSwitch.caseXExpression(xIfExpression.getExpression().getIf());
			int old_if_counter = if_counter;
			ConflictAvoidanceChecker.ast_writer.println("then part:" + if_counter);
			expressionSwitch.caseXExpression(xIfExpression.getExpression().getThen());
			ConflictAvoidanceChecker.ast_writer.println("then part ends here:" + old_if_counter);
			ConflictAvoidanceChecker.ast_writer.println("else part: " + if_counter);
			expressionSwitch.caseXExpression(xIfExpression.getExpression().getElse());
			ConflictAvoidanceChecker.ast_writer.println("else part ends here:" + old_if_counter);
		} else {
			ConflictAvoidanceChecker.ast_writer.println("condition:" + if_counter);
			expressionSwitch.caseXExpression(xIfExpression.getExpression().getIf());
			ConflictAvoidanceChecker.ast_writer.println("then part:" + if_counter);
			int old_if_counter = if_counter;
			expressionSwitch.caseXExpression(xIfExpression.getExpression().getThen());
			ConflictAvoidanceChecker.ast_writer.println("then part ends here:" + old_if_counter);
		}
	}

	@Override
	public void visit(XFeatureCallCustom xFeatureCallImplCustom) {
		feature_counter++;
		int old_feature_counter = feature_counter;
		ConflictAvoidanceChecker.ast_writer.println("Feature:"+feature_counter);
		ConflictAvoidanceChecker.ast_writer.println("Feature name:" + feature_counter);
		ConflictAvoidanceChecker.ast_writer
				.println(xFeatureCallImplCustom.getExpression().getConcreteSyntaxFeatureName());

		if (xFeatureCallImplCustom.getExpression().getActualReceiver() != null) {
			ConflictAvoidanceChecker.ast_writer.println("Target:" + feature_counter);
			expressionSwitch.caseXExpression(xFeatureCallImplCustom.getExpression().getActualReceiver());
		}
		if (xFeatureCallImplCustom.getExpression().getImplicitReceiver() != null) {
			ConflictAvoidanceChecker.ast_writer.println("Target:" + feature_counter);
			expressionSwitch.caseXExpression(xFeatureCallImplCustom.getExpression().getImplicitReceiver());
		}

		if (xFeatureCallImplCustom.getExpression().getActualArguments().size() != 0) {
			old_feature_counter = feature_counter;
			ConflictAvoidanceChecker.ast_writer.println("Arguments:" + old_feature_counter);
			for (XExpression argument : xFeatureCallImplCustom.getExpression().getActualArguments()) {
				expressionSwitch.caseXExpression(argument);
			}
		}

		ConflictAvoidanceChecker.ast_writer.println("Feature ends:" + old_feature_counter);
	}

	@Override
	public void visit(XMemberFeatureCallCustom xMemberFeatureCallImplCustom) {
		member_feature_counter++;
		int old_member_feature_counter = member_feature_counter;
		ConflictAvoidanceChecker.ast_writer.println("Member feature:"+member_feature_counter);
		
		

		if (xMemberFeatureCallImplCustom.getExpression().getActualReceiver() != null) {
			ConflictAvoidanceChecker.ast_writer.println("Member target:" + member_feature_counter);
			expressionSwitch.caseXExpression(xMemberFeatureCallImplCustom.getExpression().getMemberCallTarget());
		}
		ConflictAvoidanceChecker.ast_writer.println("Member feature name:" + member_feature_counter);
		ConflictAvoidanceChecker.ast_writer
		.println(xMemberFeatureCallImplCustom.getExpression().getConcreteSyntaxFeatureName());
		
		if (xMemberFeatureCallImplCustom.getExpression().getActualArguments().size() != 0) {
			old_member_feature_counter = member_feature_counter;
			ConflictAvoidanceChecker.ast_writer.println("Member arguments:");
			for (XExpression argument : xMemberFeatureCallImplCustom.getExpression().getActualArguments()) {
				expressionSwitch.caseXExpression(argument);
			}
		}
		ConflictAvoidanceChecker.ast_writer.println("Member feature ends:" + old_member_feature_counter);
	}

	@Override
	public void visit(XVariableDeclarationCustom xVariableDeclaration) {
		ConflictAvoidanceChecker.ast_writer.println("Variable declaration:");
		ConflictAvoidanceChecker.ast_writer
				.println("var name: " + xVariableDeclaration.getExpression().getSimpleName());
		if (xVariableDeclaration.getExpression().getRight() instanceof XExpression) {
			expressionSwitch.caseXExpression((XExpression) xVariableDeclaration.getExpression().getRight());
		}
	}

	@Override
	public void visit(XBinaryOperationCustom xBinaryOperationImplCustom) {
		ConflictAvoidanceChecker.ast_writer.println("Binary operation:");
		
		ConflictAvoidanceChecker.ast_writer.println("Left operand:");
		expressionSwitch.caseXExpression(xBinaryOperationImplCustom.getExpression().getLeftOperand());
		
		ConflictAvoidanceChecker.ast_writer.println("Right operand:");				
		expressionSwitch.caseXExpression(xBinaryOperationImplCustom.getExpression().getRightOperand());
			
		ConflictAvoidanceChecker.ast_writer
				.println("operator: " + xBinaryOperationImplCustom.getExpression().getConcreteSyntaxFeatureName());
	}

	@Override
	public void visit(XBlockExpressionCustom xBlockExpressionCustom) {
		for (EObject child : xBlockExpressionCustom.getExpression().eContents()) {
			if (child instanceof XExpression) {
				expressionSwitch.caseXExpression((XExpression) child);
			}
		}
	}

	@Override
	public void visit(XAssignmentCustom xAssignmentCustom) {
		ConflictAvoidanceChecker.ast_writer.println("Assignment:");
		if (xAssignmentCustom.getExpession().getActualReceiver() != null) {
			expressionSwitch.caseXExpression(xAssignmentCustom.getExpession().getActualReceiver());
		}
		ConflictAvoidanceChecker.ast_writer.println(xAssignmentCustom.getExpession().getConcreteSyntaxFeatureName());

		expressionSwitch.caseXExpression(xAssignmentCustom.getExpession().getValue());
	}

	@Override
	public void visit(XUnaryOperationCustom xUnaryOperationCustom) {
		ConflictAvoidanceChecker.ast_writer.println("Unary operation:");
		ConflictAvoidanceChecker.ast_writer.println("Operand:");
		expressionSwitch.caseXExpression((XExpression) xUnaryOperationCustom.getExpression().getOperand());
		ConflictAvoidanceChecker.ast_writer
				.println("operator: " + xUnaryOperationCustom.getExpression().getConcreteSyntaxFeatureName());
	}

	@Override
	public void visit(XConstructorCallCustom xConstructorCallCustom) {
		ConflictAvoidanceChecker.ast_writer.println("Constructor call:");
		for (EObject child : xConstructorCallCustom.getExpression().eContents()) {
			if (child instanceof XExpression) {
				expressionSwitch.caseXExpression((XExpression) child);
			}
		}
	}

	@Override
	public void visit(XNullLiteralCustom xNullLiteralCustom) {
		ConflictAvoidanceChecker.ast_writer.println(xNullLiteralCustom.getExpression());
	}

	@Override
	public void visit(XClosureCustom xClosureCustom) {
		ConflictAvoidanceChecker.ast_writer.println("Closure:");
		expressionSwitch.caseXExpression(xClosureCustom.getExpression().getExpression());
	}

	@Override
	public void visit(ScriptXExpression scriptXExpression) {
		if (scriptXExpression.eContents().size() <= 1) {
			ConflictAvoidanceChecker.ast_writer.println(scriptXExpression.getExpression());
		}
	}

	@Override
	public void visit(XNumberLiteral xNumberLiteral) {
		ConflictAvoidanceChecker.ast_writer.println("value: " + xNumberLiteral.getExpression().getValue());
	}

	@Override
	public void visit(XStringLiteral xStringLiteral) {
		ConflictAvoidanceChecker.ast_writer.println("string: " + xStringLiteral.getExpression().getValue());
	}

	@Override
	public void visit(XBooleanLiteral xBooleanLiteral) {
		ConflictAvoidanceChecker.ast_writer.println(xBooleanLiteral.getExpression().isIsTrue());
	}

	@Override
	public void visit(XSwitchExpression xSwitchExpression) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(XCasePart xCasePart) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XBlockExpression xBlockExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XAbstractFeatureCall xAbstractFeatureCall) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XMemberFeatureCall xMemberFeatureCall) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XFeatureCall xFeatureCall) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XConstructorCall xConstructorCall) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(XNullLiteral xNullLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XCollectionLiteral xCollectionLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XListLiteral xListLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XSetLiteral xSetLiteral) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(XClosure xClosure) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XCastedExpression xCastedExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XBinaryOperation xBinaryOperation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XUnaryOperation xUnaryOperation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XPostfixOperation xPostfixOperation) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XBasicForLoopExpression xBasicForLoopExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XAbstractWhileExpression xAbstractWhileExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XDoWhileExpression xDoWhileExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XWhileExpression xWhileExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XTypeLiteral xTypeLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XInstanceOfExpression xInstanceOfExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XThrowExpression xThrowExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XTryCatchFinallyExpression xTryCatchFinallyExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XCatchClause xCatchClause) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XAssignment xAssignment) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XReturnExpression xReturnExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XSynchronizedExpression xSynchronizedExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XForLoopExpression xForLoopExpression) {
		// TODO Auto-generated method stub
	}

}
