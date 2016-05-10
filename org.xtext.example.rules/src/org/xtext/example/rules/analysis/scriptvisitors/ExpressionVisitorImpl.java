package org.xtext.example.rules.analysis.scriptvisitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XAbstractFeatureCallImplCustom;
import org.eclipse.xtext.xbase.impl.XMemberFeatureCallImplCustom;
/**
 * 
 * @author cnandi
 *
 */
public class ExpressionVisitorImpl implements ExpressionVisitor {

	public String switchXExpressionInformation = new String();
	public HashMap<String, ArrayList<String>> xifExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xBlockExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xBlockExpressionCustomInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xVariableDeclarationInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xAbstractFeatureCallInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xFeatureCallInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xFeatureCallCustomInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xMemberFeatureCallInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xMemberFeatureCallCustomInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xConstructorCallInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, String> xBooleanLiteralInformation = new HashMap<String, String>();
	public HashMap<String, String> xNullLiteralInformation = new HashMap<String, String>();
	public HashMap<String, String> xNullLiteralCustomInformation = new HashMap<String, String>();
	public HashMap<String, String> xNumberLiteralInformation = new HashMap<String, String>();
	public HashMap<String, String> xStringLiteralInformation = new HashMap<String, String>();
	public HashMap<String, ArrayList<String>> xCollectionLiteralInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xListLiteralInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xSetLiteralInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xClosureInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xClosureCustomInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xCastedExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xBooleanOperationInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xUnaryOperationInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xPostFixOperationInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xBasicForLoopExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xAbstractWhilExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xDoWhilExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xWhilExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xTypeLiteralInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xInstanceOfExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xThrowExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xTryCatchFinallyExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xCatchClauseInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xAssignmentInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xAssignmentCustomInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xReturnExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, String> xScriptExpressionInformation = new HashMap<String, String>();
	public HashMap<String, ArrayList<String>> xSynchronizedExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xForLoopExpressionInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xBinaryOperationInformation = new HashMap<String, ArrayList<String>>();
	public HashMap<String, ArrayList<String>> xBinaryOperationCustomInformation = new HashMap<String, ArrayList<String>>();

	@Override
	public void visit(XIfExpression xIfExpression) {
		int i=0;
		System.out.println(xIfExpression.getExpression().eContents().size());
		while(i < xIfExpression.getExpression().eContents().size()){
			System.out.println(xIfExpression.getExpression().eContents().get(i));
			i++;
			
		}
		ArrayList<String> if_parts= new ArrayList<String>();
		if_parts.add(xIfExpression.getExpression().getIf().toString());
		if_parts.add(xIfExpression.getExpression().getThen().toString());
		if(xIfExpression.getExpression().eContents().size()==3){
			if_parts.add(xIfExpression.getExpression().getElse().toString());
		}
		xifExpressionInformation.put(xIfExpression.getExpression().toString(), if_parts);		
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
		ArrayList<String> expressions=new ArrayList<String>();
		for(XExpression exp: xBlockExpression.getExpression().getExpressions()){			
			expressions.add(exp.toString());
		}
		xBlockExpressionInformation.put(xBlockExpression.getExpression().toString(), expressions);
	}

	@Override
	public void visit(XVariableDeclarationCustom xVariableDeclaration) {
		ArrayList<String>variable_decl_parts=new ArrayList<String>();
		variable_decl_parts.add(xVariableDeclaration.getExpression().getSimpleName());
		variable_decl_parts.add(xVariableDeclaration.getExpression().getRight().toString());
		xVariableDeclarationInformation.put(xVariableDeclaration.toString(), variable_decl_parts);
	}

	@Override
	public void visit(XAbstractFeatureCall xAbstractFeatureCall) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XMemberFeatureCall xMemberFeatureCall) {
		ArrayList<String>member_feature_parts=new ArrayList<String>();
		member_feature_parts.add(xMemberFeatureCall.getExpression().getConcreteSyntaxFeatureName());
		for(XExpression actual_argument: xMemberFeatureCall.getExpression().getActualArguments()){
			member_feature_parts.add(actual_argument.toString());
		}
		xMemberFeatureCallInformation.put(xMemberFeatureCall.toString(), member_feature_parts);
	}

	@Override
	public void visit(XFeatureCall xFeatureCall) {
		ArrayList<String>feature_parts=new ArrayList<String>();
		feature_parts.add(xFeatureCall.getExpression().getConcreteSyntaxFeatureName());
		for(XExpression actual_argument: xFeatureCall.getExpression().getActualArguments()){
			feature_parts.add(actual_argument.toString());
		}
		xFeatureCallInformation.put(xFeatureCall.toString(), feature_parts);
	}

	@Override
	public void visit(XConstructorCall xConstructorCall) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(XBooleanLiteral xBooleanLiteral) {
		// TODO Auto-generated method stub
		xBooleanLiteralInformation.put(xBooleanLiteral.toString(), ((Boolean)xBooleanLiteral.getExpression().isIsTrue()).toString());
	}

	@Override
	public void visit(XNullLiteral xNullLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XNumberLiteral xNumberLiteral) {
		xNumberLiteralInformation.put(xNumberLiteral.toString(), xNumberLiteral.getExpression().getValue());
	
	}

	@Override
	public void visit(XStringLiteral xStringLiteral) {
		xStringLiteralInformation.put(xStringLiteral.toString(), xStringLiteral.getExpression().getValue());
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
		ArrayList<String> closure_parts=new ArrayList<String>();
		closure_parts.add(xClosure.getExpression().getExpression().toString());
		xClosureInformation.put(xClosure.toString(), closure_parts);
	}

	@Override
	public void visit(XCastedExpression xCastedExpression) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XBinaryOperation xBinaryOperation) {
		ArrayList<String>binary_operation_parts=new ArrayList<String>();
		binary_operation_parts.add(xBinaryOperation.getExpression().getConcreteSyntaxFeatureName());
		binary_operation_parts.add(xBinaryOperation.getExpression().getLeftOperand().toString());
		binary_operation_parts.add(xBinaryOperation.getExpression().getRightOperand().toString());
		xBinaryOperationInformation.put(xBinaryOperation.toString(), binary_operation_parts);
		System.out.println(xBinaryOperation.getExpression().getLeftOperand());
		System.out.println(xBinaryOperation.getExpression().getRightOperand());
	}

	@Override
	public void visit(XUnaryOperation xUnaryOperation) {
		ArrayList<String>unary_operation_parts=new ArrayList<String>();
		unary_operation_parts.add(xUnaryOperation.getExpression().getConcreteSyntaxFeatureName());
		unary_operation_parts.add(xUnaryOperation.getExpression().getOperand().toString());
		xUnaryOperationInformation.put(xUnaryOperation.toString(), unary_operation_parts);
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
		ArrayList<String>assignment_parts=new ArrayList<String>();
		assignment_parts.add(xAssignment.getExpression().getConcreteSyntaxFeatureName());
		assignment_parts.add(xAssignment.getExpression().getValue().toString());
		xAssignmentInformation.put(xAssignment.toString(), assignment_parts);
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

	@Override
	public void visit(XBinaryOperationCustom xBinaryOperationImplCustom) {
		ArrayList<String>binary_operation_custom_parts=new ArrayList<String>();
		binary_operation_custom_parts.add(xBinaryOperationImplCustom.getExpression().getConcreteSyntaxFeatureName());
		binary_operation_custom_parts.add(xBinaryOperationImplCustom.getExpression().getLeftOperand().toString());
		binary_operation_custom_parts.add(xBinaryOperationImplCustom.getExpression().getRightOperand().toString());	
		xBinaryOperationCustomInformation.put(xBinaryOperationImplCustom.toString(), binary_operation_custom_parts);
		System.out.println(xBinaryOperationImplCustom.getExpression().getLeftOperand());
		System.out.println(xBinaryOperationImplCustom.getExpression().getRightOperand());
	}

	@Override
	public void visit(XFeatureCallCustom xFeatureCallImplCustom) {
		ArrayList<String>feature_custom_parts=new ArrayList<String>();
		feature_custom_parts.add(xFeatureCallImplCustom.getExpression().getConcreteSyntaxFeatureName());
		for(XExpression actual_argument: xFeatureCallImplCustom.getExpression().getActualArguments()){
			feature_custom_parts.add(actual_argument.toString());
		}
		xFeatureCallInformation.put(xFeatureCallImplCustom.toString(), feature_custom_parts);
	
	}

	@Override
	public void visit(XMemberFeatureCallCustom xMemberFeatureCallImplCustom) {
		ArrayList<String>member_feature_custom_parts=new ArrayList<String>();
		member_feature_custom_parts.add(xMemberFeatureCallImplCustom.getExpression().getConcreteSyntaxFeatureName());
		for(XExpression actual_argument: xMemberFeatureCallImplCustom.getExpression().getActualArguments()){
			member_feature_custom_parts.add(actual_argument.toString());
		}
		xMemberFeatureCallCustomInformation.put(xMemberFeatureCallImplCustom.toString(), member_feature_custom_parts);
	
	}

	@Override
	public void visit(XNullLiteralCustom xNullLiteralCustom) {
		xNullLiteralCustomInformation.put(xNullLiteralCustom.toString(), xNullLiteralCustom.getExpression().toString());
		
	}

	@Override
	public void visit(XClosureCustom xClosureCustom) {
		ArrayList<String> closure_custom_parts=new ArrayList<String>();
		closure_custom_parts.add(xClosureCustom.getExpression().getExpression().toString());
		xClosureInformation.put(xClosureCustom.toString(), closure_custom_parts);	
	}

	@Override
	public void visit(ScriptXExpression scriptXExpression) {
		xScriptExpressionInformation.put(scriptXExpression.toString(),scriptXExpression.getExpression().toString());
	}

	@Override
	public void visit(XBlockExpressionCustom xBlockExpressionCustom) {
		ArrayList<String> custom_expressions=new ArrayList<String>();
		for(XExpression exp: xBlockExpressionCustom.getExpression().getExpressions()){			
			custom_expressions.add(exp.toString());
		}
		xBlockExpressionCustomInformation.put(xBlockExpressionCustom.getExpression().toString(), custom_expressions);
	}

	@Override
	public void visit(XAssignmentCustom xAssignmentCustom) {
		ArrayList<String>assignment_custom_parts=new ArrayList<String>();
		assignment_custom_parts.add(xAssignmentCustom.getExpession().getConcreteSyntaxFeatureName());
		assignment_custom_parts.add(xAssignmentCustom.getExpession().getValue().toString());
		xAssignmentCustomInformation.put(xAssignmentCustom.toString(), assignment_custom_parts);
	}

}
