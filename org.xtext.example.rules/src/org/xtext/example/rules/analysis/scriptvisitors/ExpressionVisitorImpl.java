package org.xtext.example.rules.analysis.scriptvisitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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

	ScriptExpressionSwitch expressionSwitch=new ScriptExpressionSwitch();
	
	@Override
	public void visit(XIfExpression xIfExpression) {
		if(xIfExpression.getExpression().eContents().size()==3){
			System.out.println("condition: ");
			expressionSwitch.caseXExpression(xIfExpression.getExpression().getIf());
			System.out.println("then part: ");
			expressionSwitch.caseXExpression(xIfExpression.getExpression().getThen());
			System.out.println("else part: ");
			expressionSwitch.caseXExpression(xIfExpression.getExpression().getElse());
		}
		else{
			System.out.println("condition: ");
			expressionSwitch.caseXExpression(xIfExpression.getExpression().getIf());
			System.out.println("then part: ");
			expressionSwitch.caseXExpression(xIfExpression.getExpression().getThen());
		}	
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
	public void visit(XVariableDeclarationCustom xVariableDeclaration) {
		System.out.println("var name: "+xVariableDeclaration.getExpression().getSimpleName());
		if(xVariableDeclaration.getExpression().getRight() instanceof XExpression){
				expressionSwitch.caseXExpression((XExpression)xVariableDeclaration.getExpression().getRight());
		}		
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
	public void visit(XBooleanLiteral xBooleanLiteral) {
		// TODO Auto-generated method stub
		System.out.println(xBooleanLiteral.getExpression().isIsTrue());
	}

	@Override
	public void visit(XNullLiteral xNullLiteral) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(XNumberLiteral xNumberLiteral) {
		System.out.println("value: "+xNumberLiteral.getExpression().getValue());
	}

	@Override
	public void visit(XStringLiteral xStringLiteral) {
		System.out.println("string: "+xStringLiteral.getExpression().getValue());
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

	@Override
	public void visit(XBinaryOperationCustom xBinaryOperationImplCustom) {
		if(xBinaryOperationImplCustom.getExpression().getLeftOperand().eContents().size()==0){
			expressionSwitch.caseXExpression(xBinaryOperationImplCustom.getExpression().getLeftOperand());	
		}
		else {
			for(EObject child: xBinaryOperationImplCustom.getExpression().getLeftOperand().eContents()){
				expressionSwitch.caseXExpression((XExpression)child);		
			}
		}
		System.out.println("operator: "+xBinaryOperationImplCustom.getExpression().getConcreteSyntaxFeatureName());
		
		if(xBinaryOperationImplCustom.getExpression().getRightOperand().eContents().size()==0){
			expressionSwitch.caseXExpression(xBinaryOperationImplCustom.getExpression().getRightOperand());	
		}
		else {
			for(EObject child: xBinaryOperationImplCustom.getExpression().getRightOperand().eContents()){				
				expressionSwitch.caseXExpression((XExpression)child);
			}
		}
	}

	@Override
	public void visit(XFeatureCallCustom xFeatureCallImplCustom) {
		if(xFeatureCallImplCustom.getExpression().getActualReceiver()!=null){
			expressionSwitch.caseXExpression(xFeatureCallImplCustom.getExpression().getActualReceiver());
		}
		if(xFeatureCallImplCustom.getExpression().getImplicitReceiver()!=null){
			expressionSwitch.caseXExpression(xFeatureCallImplCustom.getExpression().getImplicitReceiver());
		}
		System.out.println(xFeatureCallImplCustom.getExpression().getConcreteSyntaxFeatureName());
		if(xFeatureCallImplCustom.getExpression().getActualArguments().size()!=0){
			for(XExpression argument: xFeatureCallImplCustom.getExpression().getActualArguments()){
				expressionSwitch.caseXExpression(argument);
			}			
		}		
	}

	@Override
	public void visit(XMemberFeatureCallCustom xMemberFeatureCallImplCustom) {
		if(xMemberFeatureCallImplCustom.getExpression().getMemberCallTarget()!=null){
			expressionSwitch.caseXExpression(xMemberFeatureCallImplCustom.getExpression().getMemberCallTarget());			
		}
		System.out.println(xMemberFeatureCallImplCustom.getExpression().getConcreteSyntaxFeatureName());
		if(xMemberFeatureCallImplCustom.getExpression().getActualArguments().size()!=0){
			for(XExpression argument: xMemberFeatureCallImplCustom.getExpression().getActualArguments()){
				expressionSwitch.caseXExpression(argument);
			}
		}
		
	}

	@Override
	public void visit(XNullLiteralCustom xNullLiteralCustom) {
		System.out.println(xNullLiteralCustom.getExpression());
	}

	@Override
	public void visit(XClosureCustom xClosureCustom) {
		expressionSwitch.caseXExpression(xClosureCustom.getExpression().getExpression());
	}

	@Override
	public void visit(ScriptXExpression scriptXExpression) {
		if(scriptXExpression.eContents().size()<=1){
			System.out.println(scriptXExpression.getExpression());
		}		
	}

	@Override
	public void visit(XBlockExpressionCustom xBlockExpressionCustom) {
		for(EObject child: xBlockExpressionCustom.getExpression().eContents()){
			if(child instanceof XExpression){
				expressionSwitch.caseXExpression((XExpression)child);
			}
		}
		
		ArrayList<String> custom_expressions=new ArrayList<String>();
		for(XExpression exp: xBlockExpressionCustom.getExpression().getExpressions()){			
			custom_expressions.add(exp.toString());
		}
		xBlockExpressionCustomInformation.put(xBlockExpressionCustom.getExpression().toString(), custom_expressions);
	}

	@Override
	public void visit(XAssignmentCustom xAssignmentCustom) {
		if(xAssignmentCustom.getExpession().getActualReceiver()!=null){
			expressionSwitch.caseXExpression(xAssignmentCustom.getExpession().getActualReceiver());
		}
		System.out.println(xAssignmentCustom.getExpession().getConcreteSyntaxFeatureName());
		expressionSwitch.caseXExpression(xAssignmentCustom.getExpession().getValue());
	}

	@Override
	public void visit(XUnaryOperationCustom xUnaryOperationCustom) {		
		expressionSwitch.caseXExpression((XExpression)xUnaryOperationCustom.getExpression().getOperand());
		System.out.println(xUnaryOperationCustom.getExpression().getConcreteSyntaxFeatureName());
	}

	@Override
	public void visit(XConstructorCallCustom xConstructorCallCustom) {
		for(EObject child: xConstructorCallCustom.getExpression().eContents()){
			if(child instanceof XExpression){
				expressionSwitch.caseXExpression((XExpression) child);				
			}
		}		
	}
}
