package org.xtext.example.rules.analysis.scriptvisitors;

import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.XExpression;
import org.xtext.example.rules.analysis.ConflictAvoidanceChecker;
import org.xtext.example.rules.analysis.statements.BinaryCondition;
import org.xtext.example.rules.analysis.statements.FeatureInvocation;
import org.xtext.example.rules.analysis.statements.IfThenElse;
import org.xtext.example.rules.analysis.statements.MemberFeatureInvocation;
import org.xtext.example.rules.analysis.statements.UnaryCondition;

/**
 * 
 * @author cnandi
 *
 */
public class ExpressionVisitorImpl implements ExpressionVisitor {	

	public static ArrayList<String> member_states_involved=new ArrayList<String>();
	private ScriptExpressionSwitch expressionSwitch = new ScriptExpressionSwitch ();
	private static int if_counter = 0;
	private static int feature_counter = 0;
	private static int member_feature_counter = 0;

	@Override
	public IfThenElse visit(XIfExpression xIfExpression) {
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
		return null;
	}

	@Override
	public String visit(XFeatureCallCustom xFeatureCallImplCustom) {
		
		FeatureInvocation featureInvocation=new FeatureInvocation();
		
		feature_counter++;
		int old_feature_counter = feature_counter;
		ConflictAvoidanceChecker.ast_writer.println("Feature:"+feature_counter);
		ConflictAvoidanceChecker.ast_writer.println("Feature name:" + feature_counter);
		featureInvocation.setMethodName(xFeatureCallImplCustom.getExpression().getConcreteSyntaxFeatureName());
		ConflictAvoidanceChecker.ast_writer
				.println(xFeatureCallImplCustom.getExpression().getConcreteSyntaxFeatureName());

		if (xFeatureCallImplCustom.getExpression().getActualReceiver() != null) {
			ConflictAvoidanceChecker.ast_writer.println("Target:" + feature_counter);
			featureInvocation.setTarget((String)expressionSwitch.caseXExpression(xFeatureCallImplCustom.getExpression().getActualReceiver()));
		}
		if (xFeatureCallImplCustom.getExpression().getImplicitReceiver() != null) {
			ConflictAvoidanceChecker.ast_writer.println("Target:" + feature_counter);
			expressionSwitch.caseXExpression(xFeatureCallImplCustom.getExpression().getActualReceiver());
		}

		if (xFeatureCallImplCustom.getExpression().getActualArguments().size() != 0) {
			old_feature_counter = feature_counter;
			ConflictAvoidanceChecker.ast_writer.println("Arguments:" + old_feature_counter);
			ArrayList<String>args=new ArrayList<String>();
			for (XExpression argument : xFeatureCallImplCustom.getExpression().getActualArguments()) {
				if(expressionSwitch.caseXExpression(argument) instanceof String){
					args.add((String) expressionSwitch.caseXExpression(argument));	
				}
				
			}
			featureInvocation.setArgument(args);
			
		}

		ConflictAvoidanceChecker.ast_writer.println("Feature ends:" + old_feature_counter);
		return featureInvocation.getMethodName();
	}

	@Override
	public String visit(XMemberFeatureCallCustom xMemberFeatureCallImplCustom) {
		
		MemberFeatureInvocation memberFeatureInvocation=new MemberFeatureInvocation();
		member_feature_counter++;
		int old_member_feature_counter = member_feature_counter;
		ConflictAvoidanceChecker.ast_writer.println("Member feature:"+member_feature_counter);	
		

		if (xMemberFeatureCallImplCustom.getExpression().getActualReceiver() != null) {
			ConflictAvoidanceChecker.ast_writer.println("Member target:" + member_feature_counter);
			if(expressionSwitch.caseXExpression(xMemberFeatureCallImplCustom.getExpression().getMemberCallTarget()) instanceof String){
				memberFeatureInvocation.setFeatureName((String)expressionSwitch.caseXExpression(xMemberFeatureCallImplCustom.getExpression().getMemberCallTarget()));
					member_states_involved.add((String)expressionSwitch.caseXExpression(xMemberFeatureCallImplCustom.getExpression().getMemberCallTarget()));
			}			
		}
		ConflictAvoidanceChecker.ast_writer.println("Member feature name:" + member_feature_counter);
		ConflictAvoidanceChecker.ast_writer
		.println(xMemberFeatureCallImplCustom.getExpression().getConcreteSyntaxFeatureName());
		memberFeatureInvocation.setMemberName(xMemberFeatureCallImplCustom.getExpression().getConcreteSyntaxFeatureName());
		
		if (xMemberFeatureCallImplCustom.getExpression().getActualArguments().size() != 0) {
			old_member_feature_counter = member_feature_counter;
			ConflictAvoidanceChecker.ast_writer.println("Member arguments:");
			ArrayList<String>args=new ArrayList<String>();
			for (XExpression argument : xMemberFeatureCallImplCustom.getExpression().getActualArguments()) {
				String st=(String)expressionSwitch.caseXExpression(argument);
				args.add(st);
			}
			memberFeatureInvocation.setArgument(args);
		}
		ConflictAvoidanceChecker.ast_writer.println("Member feature ends:" + old_member_feature_counter);
		return memberFeatureInvocation.getMemberName();
	}

	@Override
	public XExpression visit(XVariableDeclarationCustom xVariableDeclaration) {
		ConflictAvoidanceChecker.ast_writer.println("Variable declaration:");
		ConflictAvoidanceChecker.ast_writer
				.println("var name: " + xVariableDeclaration.getExpression().getSimpleName());
		if (xVariableDeclaration.getExpression().getRight() instanceof XExpression) {
			expressionSwitch.caseXExpression((XExpression) xVariableDeclaration.getExpression().getRight());
		}
		return null;
	}

	@Override
	public BinaryCondition visit(XBinaryOperationCustom xBinaryOperationImplCustom) {
		ConflictAvoidanceChecker.ast_writer.println("Binary operation:");
		
		ConflictAvoidanceChecker.ast_writer.println("Left operand:");
		expressionSwitch.caseXExpression(xBinaryOperationImplCustom.getExpression().getLeftOperand());
		
		ConflictAvoidanceChecker.ast_writer.println("Right operand:");				
		expressionSwitch.caseXExpression(xBinaryOperationImplCustom.getExpression().getRightOperand());
			
		ConflictAvoidanceChecker.ast_writer
				.println("operator: " + xBinaryOperationImplCustom.getExpression().getConcreteSyntaxFeatureName());
		return null;
	}

	@Override
	public XExpression visit(XBlockExpressionCustom xBlockExpressionCustom) {
		for (EObject child : xBlockExpressionCustom.getExpression().eContents()) {
			if (child instanceof XExpression) {
				expressionSwitch.caseXExpression((XExpression) child);
			}
		}
		return null;
	}

	@Override
	public XExpression visit(XAssignmentCustom xAssignmentCustom) {
		ConflictAvoidanceChecker.ast_writer.println("Assignment:");
		if (xAssignmentCustom.getExpession().getActualReceiver() != null) {
			expressionSwitch.caseXExpression(xAssignmentCustom.getExpession().getActualReceiver());
		}
		ConflictAvoidanceChecker.ast_writer.println(xAssignmentCustom.getExpession().getConcreteSyntaxFeatureName());

		expressionSwitch.caseXExpression(xAssignmentCustom.getExpession().getValue());
		return null;
	}

	@Override
	public UnaryCondition visit(XUnaryOperationCustom xUnaryOperationCustom) {
		ConflictAvoidanceChecker.ast_writer.println("Unary operation:");
		ConflictAvoidanceChecker.ast_writer.println("Operand:");
		expressionSwitch.caseXExpression((XExpression) xUnaryOperationCustom.getExpression().getOperand());
		
		ConflictAvoidanceChecker.ast_writer
				.println("operator: " + xUnaryOperationCustom.getExpression().getConcreteSyntaxFeatureName());
		return null;
	}

	@Override
	public XExpression visit(XConstructorCallCustom xConstructorCallCustom) {
		ConflictAvoidanceChecker.ast_writer.println("Constructor call:");
		for (EObject child : xConstructorCallCustom.getExpression().eContents()) {
			if (child instanceof XExpression) {
				expressionSwitch.caseXExpression((XExpression) child);
			}
		}
		return null;
	}

	@Override
	public String visit(XNullLiteralCustom xNullLiteralCustom) {
		ConflictAvoidanceChecker.ast_writer.println(xNullLiteralCustom.getExpression());
		return xNullLiteralCustom.getExpression().toString();
	}

	@Override
	public XExpression visit(XClosureCustom xClosureCustom) {
		ConflictAvoidanceChecker.ast_writer.println("Closure:");
		expressionSwitch.caseXExpression(xClosureCustom.getExpression().getExpression());
		return null;
	}

	@Override
	public XExpression visit(ScriptXExpression scriptXExpression) {
		if (scriptXExpression.eContents().size() <= 1) {
			ConflictAvoidanceChecker.ast_writer.println(scriptXExpression.getExpression());
		}
		return scriptXExpression.getExpression();
	}

	@Override
	public String visit(XNumberLiteral xNumberLiteral) {
		ConflictAvoidanceChecker.ast_writer.println("value: " + xNumberLiteral.getExpression().getValue());
		return xNumberLiteral.getExpression().getValue();
	}

	@Override
	public String visit(XStringLiteral xStringLiteral) {
		ConflictAvoidanceChecker.ast_writer.println("string: " + xStringLiteral.getExpression().getValue());
		return xStringLiteral.getExpression().getValue();
	}

	@Override
	public Boolean visit(XBooleanLiteral xBooleanLiteral) {
		ConflictAvoidanceChecker.ast_writer.println(xBooleanLiteral.getExpression().isIsTrue());
		return (Boolean)xBooleanLiteral.getExpression().isIsTrue();
	}

	@Override
	public XExpression visit(XSwitchExpression xSwitchExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XCasePart xCasePart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XBlockExpression xBlockExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XAbstractFeatureCall xAbstractFeatureCall) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XMemberFeatureCall xMemberFeatureCall) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XFeatureCall xFeatureCall) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XConstructorCall xConstructorCall) {
		// TODO Auto-generated method stub
		return null;

	}

	@Override
	public XExpression visit(XNullLiteral xNullLiteral) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XCollectionLiteral xCollectionLiteral) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XListLiteral xListLiteral) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XSetLiteral xSetLiteral) {
		// TODO Auto-generated method stub
		return null;

	}

	@Override
	public XExpression visit(XClosure xClosure) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XCastedExpression xCastedExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XBinaryOperation xBinaryOperation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XUnaryOperation xUnaryOperation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XPostfixOperation xPostfixOperation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XBasicForLoopExpression xBasicForLoopExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XAbstractWhileExpression xAbstractWhileExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XDoWhileExpression xDoWhileExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XWhileExpression xWhileExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XTypeLiteral xTypeLiteral) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XInstanceOfExpression xInstanceOfExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XThrowExpression xThrowExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XTryCatchFinallyExpression xTryCatchFinallyExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XCatchClause xCatchClause) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XAssignment xAssignment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XReturnExpression xReturnExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XSynchronizedExpression xSynchronizedExpression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XExpression visit(XForLoopExpression xForLoopExpression) {
		// TODO Auto-generated method stub
		return null;
	}

}
