package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XNumberLiteralImpl;
import org.eclipse.xtext.xbase.impl.XPostfixOperationImpl;
import org.eclipse.xtext.xbase.impl.XReturnExpressionImpl;
import org.eclipse.xtext.xbase.impl.XSetLiteralImpl;
import org.eclipse.xtext.xbase.impl.XStringLiteralImpl;
import org.eclipse.xtext.xbase.impl.XSwitchExpressionImpl;
import org.eclipse.xtext.xbase.impl.XSynchronizedExpressionImpl;
import org.eclipse.xtext.xbase.impl.XThrowExpressionImpl;
import org.eclipse.xtext.xbase.impl.XTryCatchFinallyExpressionImpl;
import org.eclipse.xtext.xbase.impl.XUnaryOperationImpl;
import org.eclipse.xtext.xbase.impl.XUnaryOperationImplCustom;
import org.eclipse.xtext.xbase.impl.XVariableDeclarationImplCustom;
import org.eclipse.xtext.xbase.impl.XWhileExpressionImpl;
import org.xtext.example.rules.analysis.ConflictAvoidanceChecker;
import org.xtext.example.script.script.util.ScriptSwitch;
import org.eclipse.xtext.xbase.impl.XAbstractFeatureCallImpl;
import org.eclipse.xtext.xbase.impl.XAbstractWhileExpressionImpl;
import org.eclipse.xtext.xbase.impl.XAssignmentImpl;
import org.eclipse.xtext.xbase.impl.XAssignmentImplCustom;
import org.eclipse.xtext.xbase.impl.XBasicForLoopExpressionImpl;
import org.eclipse.xtext.xbase.impl.XBinaryOperationImpl;
import org.eclipse.xtext.xbase.impl.XBinaryOperationImplCustom;
import org.eclipse.xtext.xbase.impl.XBlockExpressionImpl;
import org.eclipse.xtext.xbase.impl.XBlockExpressionImplCustom;
import org.eclipse.xtext.xbase.impl.XBooleanLiteralImpl;
import org.eclipse.xtext.xbase.impl.XCastedExpressionImpl;
import org.eclipse.xtext.xbase.impl.XClosureImpl;
import org.eclipse.xtext.xbase.impl.XClosureImplCustom;
import org.eclipse.xtext.xbase.impl.XCollectionLiteralImpl;
import org.eclipse.xtext.xbase.impl.XConstructorCallImpl;
import org.eclipse.xtext.xbase.impl.XConstructorCallImplCustom;
import org.eclipse.xtext.xbase.impl.XDoWhileExpressionImpl;
import org.eclipse.xtext.xbase.impl.XFeatureCallImpl;
import org.eclipse.xtext.xbase.impl.XFeatureCallImplCustom;
import org.eclipse.xtext.xbase.impl.XForLoopExpressionImpl;
import org.eclipse.xtext.xbase.impl.XIfExpressionImpl;
import org.eclipse.xtext.xbase.impl.XInstanceOfExpressionImpl;
import org.eclipse.xtext.xbase.impl.XListLiteralImpl;
import org.eclipse.xtext.xbase.impl.XMemberFeatureCallImpl;
import org.eclipse.xtext.xbase.impl.XMemberFeatureCallImplCustom;
import org.eclipse.xtext.xbase.impl.XNullLiteralImpl;
import org.eclipse.xtext.xbase.impl.XNullLiteralImplCustom;
import org.eclipse.xtext.xbase.impl.XTypeLiteralImpl;

public class ScriptExpressionSwitch<R> extends ScriptSwitch<Object> {
	public R caseXExpression(XExpression object) {
		ExpressionVisitor<R> expressionVisitor = new ExpressionVisitorImpl();
		switch (object.getClass().getSimpleName()) {
		case ("XAbstractFeatureCallImpl"):
			XAbstractFeatureCall abstractFeatureCall = new XAbstractFeatureCall((XAbstractFeatureCallImpl) object);
			return abstractFeatureCall.accept(expressionVisitor);
			
		case ("XAbstractWhileExpressionImpl"):
			XAbstractWhileExpression whileExpression = new XAbstractWhileExpression(
					(XAbstractWhileExpressionImpl) object);
			return whileExpression.accept(expressionVisitor);
			
		case ("XAssignmentImpl"):
			XAssignment xAssignment = new XAssignment((XAssignmentImpl) object);
			return xAssignment.accept(expressionVisitor);
			
		case ("XAssignmentImplCustom"):
			XAssignmentCustom xAssignmentCustom = new XAssignmentCustom((XAssignmentImplCustom) object);
			return xAssignmentCustom.accept(expressionVisitor);
		
		case ("XBasicForLoopExpressionImpl"):
			XBasicForLoopExpression xBasicForLoopExpression = new XBasicForLoopExpression(
					(XBasicForLoopExpressionImpl) object);
			return xBasicForLoopExpression.accept(expressionVisitor);
			
		case ("XBinaryOperationImpl"):
			XBinaryOperation xBinaryOperation = new XBinaryOperation((XBinaryOperationImpl) object);
			return xBinaryOperation.accept(expressionVisitor);
			
		case ("XBinaryOperationImplCustom"):
			XBinaryOperationCustom xbinaryOperationCustom = new XBinaryOperationCustom(
					(XBinaryOperationImplCustom) object);
			return xbinaryOperationCustom.accept(expressionVisitor);
			
		case ("XBlockExpressionImpl"):
			XBlockExpression xBlockExpression = new XBlockExpression((XBlockExpressionImpl) object);
			return xBlockExpression.accept(expressionVisitor);
			
		case ("XBlockExpressionImplCustom"):
			XBlockExpressionCustom xBlockExpressionCustom = new XBlockExpressionCustom(
					(XBlockExpressionImplCustom) object);
			return xBlockExpressionCustom.accept(expressionVisitor);
			
		case ("XBooleanLiteralImpl"):
			XBooleanLiteral xBooleanLiteral = new XBooleanLiteral((XBooleanLiteralImpl) object);
		    return xBooleanLiteral.accept(expressionVisitor);
			
		case ("XCastPartImpl"):
			// TODO fix the casting later
			XCasePart xCasePart = new XCasePart(object);
			return xCasePart.accept(expressionVisitor);
			
		case ("XCastedExpressionImpl"):
			XCastedExpression xCastedExpressionImpl = new XCastedExpression((XCastedExpressionImpl) object);
			return xCastedExpressionImpl.accept(expressionVisitor);
			
		case ("XCatchClauseImpl"):
			// TODO fix the casting later
			XCatchClause xCatchClause = new XCatchClause(object);
			return xCatchClause.accept(expressionVisitor);
			
		case ("XClosureImpl"):
			XClosure xClosure = new XClosure((XClosureImpl) object);
			return xClosure.accept(expressionVisitor);
			
		case ("XClosureImplCustom"):
			XClosureCustom xClosureCustom = new XClosureCustom((XClosureImplCustom) object);
			return xClosureCustom.accept(expressionVisitor);
			
		case ("XCollectionLiteralImpl"):
			XCollectionLiteral xCollectionLiteral = new XCollectionLiteral((XCollectionLiteralImpl) object);
			return xCollectionLiteral.accept(expressionVisitor);
			
		case ("XConstructorCallImpl"):
			XConstructorCall xConstructorCall = new XConstructorCall((XConstructorCallImpl) object);
			return xConstructorCall.accept(expressionVisitor);
			
		case ("XConstructorCallImplCustom"):
			XConstructorCallCustom xConstructorCallCustom = new XConstructorCallCustom(
					(XConstructorCallImplCustom) object);
			return xConstructorCallCustom.accept(expressionVisitor);
			
		case ("XDoWhileExpressionImpl"):
			XDoWhileExpression xDoWhileExpression = new XDoWhileExpression((XDoWhileExpressionImpl) object);
			return xDoWhileExpression.accept(expressionVisitor);
			
		case ("XExpressionImpl"):
			ScriptXExpression xExpression = new ScriptXExpression((XExpression) object);
			return xExpression.accept(expressionVisitor);
			
		case ("XFeatureCallImpl"):
			XFeatureCall xFeatureCall = new XFeatureCall((XFeatureCallImpl) object);
			return xFeatureCall.accept(expressionVisitor);
			
		case ("XFeatureCallImplCustom"):
			XFeatureCallCustom xFeatureCallCustom = new XFeatureCallCustom((XFeatureCallImplCustom) object);
			return xFeatureCallCustom.accept(expressionVisitor);
			
		case ("XForLoopExpressionImpl"):
			XForLoopExpression xForLoopExpression = new XForLoopExpression((XForLoopExpressionImpl) object);
			return xForLoopExpression.accept(expressionVisitor);
	
		case ("XIfExpressionImpl"):
			XIfExpression xIfExpression = new XIfExpression((XIfExpressionImpl) object);
			return xIfExpression.accept(expressionVisitor);
			
		case ("XInstanceOfExpressionImpl"):
			XInstanceOfExpression xInstanceOfExpression = new XInstanceOfExpression((XInstanceOfExpressionImpl) object);
			return xInstanceOfExpression.accept(expressionVisitor);
			
		case ("XListLiteralImpl"):
			XListLiteral xListLiteral = new XListLiteral((XListLiteralImpl) object);
			return xListLiteral.accept(expressionVisitor);
			
		case ("XMemberFeatureCallImpl"):
			XMemberFeatureCall xMemberFeature = new XMemberFeatureCall((XMemberFeatureCallImpl) object);
			return xMemberFeature.accept(expressionVisitor);
			
		case ("XMemberFeatureCallImplCustom"):
			XMemberFeatureCallCustom xMemberFeatureCallCustom = new XMemberFeatureCallCustom(
					(XMemberFeatureCallImplCustom) object);
			return xMemberFeatureCallCustom.accept(expressionVisitor);
			
		case ("XNullLiteralImpl"):
			XNullLiteral xNullLiteral = new XNullLiteral((XNullLiteralImpl) object);
			return xNullLiteral.accept(expressionVisitor);
			
		case ("XNullLiteralImplCustom"):
			XNullLiteralCustom xNullLiteralCustom = new XNullLiteralCustom((XNullLiteralImplCustom) object);
			return xNullLiteralCustom.accept(expressionVisitor);
	
		case ("XNumberLiteralImpl"):
			XNumberLiteral xNumberLiteral = new XNumberLiteral((XNumberLiteralImpl) object);
			return xNumberLiteral.accept(expressionVisitor);
		
		case ("XPostfixOperationImpl"):
			XPostfixOperation xPostfixOperation = new XPostfixOperation((XPostfixOperationImpl) object);
			return xPostfixOperation.accept(expressionVisitor);
			
		case ("XReturnExpressionImpl"):
			XReturnExpression xReturnExpression = new XReturnExpression((XReturnExpressionImpl) object);
			return xReturnExpression.accept(expressionVisitor);
	
		case ("XSetLiteralImpl"):
			XSetLiteral xSetLiteral = new XSetLiteral((XSetLiteralImpl) object);
			return xSetLiteral.accept(expressionVisitor);
		
		case ("XStringLiteralImpl"):
			XStringLiteral xStringLiteral = new XStringLiteral((XStringLiteralImpl) object);
			return xStringLiteral.accept(expressionVisitor);
		
		case ("XSwitchExpressionImpl"):
			XSwitchExpression xSwitchExpression = new XSwitchExpression((XSwitchExpressionImpl) object);
			return xSwitchExpression.accept(expressionVisitor);
	
		case ("XSynchronizedExpressionImpl"):
			XSynchronizedExpression xSynchronizedExpression = new XSynchronizedExpression(
					(XSynchronizedExpressionImpl) object);
			return xSynchronizedExpression.accept(expressionVisitor);
			
		case ("XThrowExpressionImpl"):
			XThrowExpression xThrowExpression = new XThrowExpression((XThrowExpressionImpl) object);
			return xThrowExpression.accept(expressionVisitor);
		
		case ("XTryCatchFinallyExpressionImpl"):
			XTryCatchFinallyExpression xTryCatchFinallyExpression = new XTryCatchFinallyExpression(
					(XTryCatchFinallyExpressionImpl) object);
			return xTryCatchFinallyExpression.accept(expressionVisitor);
		
		case ("XTypeLiteralImpl"):
			XTypeLiteral xTypeLiteral = new XTypeLiteral((XTypeLiteralImpl) object);
			return xTypeLiteral.accept(expressionVisitor);
		
		case ("XUnaryOperationImpl"):
			XUnaryOperation xUnaryOperation = new XUnaryOperation((XUnaryOperationImpl) object);
			return xUnaryOperation.accept(expressionVisitor);
		
		case ("XUnaryOperationImplCustom"):
			XUnaryOperationCustom xUnaryOperationCustom = new XUnaryOperationCustom((XUnaryOperationImplCustom) object);
			return xUnaryOperationCustom.accept(expressionVisitor);
		
		case ("XVariableDeclarationImplCustom"):
			XVariableDeclarationCustom xVariableDeclaration = new XVariableDeclarationCustom(
					(XVariableDeclarationImplCustom) object);
			return xVariableDeclaration.accept(expressionVisitor);
		
		case ("XWhileExpressionImpl"):
			XWhileExpression xWhileExpression = new XWhileExpression((XWhileExpressionImpl) object);
			return xWhileExpression.accept(expressionVisitor);
		
		default:
			ConflictAvoidanceChecker.ast_writer.println("default:"+object.getClass().getSimpleName());
			return null;
			
		}		
		
	}

}
