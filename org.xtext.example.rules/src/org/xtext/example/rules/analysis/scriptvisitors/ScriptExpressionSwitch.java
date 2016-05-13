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

public class ScriptExpressionSwitch extends ScriptSwitch<String> {
	public String caseXExpression(XExpression object) {
		ExpressionVisitor expressionVisitor = new ExpressionVisitorImpl();
		switch (object.getClass().getSimpleName()) {
		case ("XAbstractFeatureCallImpl"):
			XAbstractFeatureCall abstractFeatureCall = new XAbstractFeatureCall((XAbstractFeatureCallImpl) object);
			abstractFeatureCall.accept(expressionVisitor);
			break;
		case ("XAbstractWhileExpressionImpl"):
			XAbstractWhileExpression whileExpression = new XAbstractWhileExpression(
					(XAbstractWhileExpressionImpl) object);
			whileExpression.accept(expressionVisitor);
			break;
		case ("XAssignmentImpl"):
			XAssignment xAssignment = new XAssignment((XAssignmentImpl) object);
			xAssignment.accept(expressionVisitor);
			break;
		case ("XAssignmentImplCustom"):
			XAssignmentCustom xAssignmentCustom = new XAssignmentCustom((XAssignmentImplCustom) object);
			xAssignmentCustom.accept(expressionVisitor);
			break;
		case ("XBasicForLoopExpressionImpl"):
			XBasicForLoopExpression xBasicForLoopExpression = new XBasicForLoopExpression(
					(XBasicForLoopExpressionImpl) object);
			xBasicForLoopExpression.accept(expressionVisitor);
			break;
		case ("XBinaryOperationImpl"):
			XBinaryOperation xBinaryOperation = new XBinaryOperation((XBinaryOperationImpl) object);
			xBinaryOperation.accept(expressionVisitor);
			break;
		case ("XBinaryOperationImplCustom"):
			XBinaryOperationCustom xbinaryOperationCustom = new XBinaryOperationCustom(
					(XBinaryOperationImplCustom) object);
			xbinaryOperationCustom.accept(expressionVisitor);
			break;
		case ("XBlockExpressionImpl"):
			XBlockExpression xBlockExpression = new XBlockExpression((XBlockExpressionImpl) object);
			xBlockExpression.accept(expressionVisitor);
			break;
		case ("XBlockExpressionImplCustom"):
			XBlockExpressionCustom xBlockExpressionCustom = new XBlockExpressionCustom(
					(XBlockExpressionImplCustom) object);
			xBlockExpressionCustom.accept(expressionVisitor);
			break;
		case ("XBooleanLiteralImpl"):
			XBooleanLiteral xBooleanLiteral = new XBooleanLiteral((XBooleanLiteralImpl) object);
			xBooleanLiteral.accept(expressionVisitor);
			break;
		case ("XCastPartImpl"):
			// TODO fix the casting later
			XCasePart xCasePart = new XCasePart(object);
			xCasePart.accept(expressionVisitor);
			break;
		case ("XCastedExpressionImpl"):
			XCastedExpression xCastedExpressionImpl = new XCastedExpression((XCastedExpressionImpl) object);
			xCastedExpressionImpl.accept(expressionVisitor);
			break;
		case ("XCatchClauseImpl"):
			// TODO fix the casting later
			XCatchClause xCatchClause = new XCatchClause(object);
			xCatchClause.accept(expressionVisitor);
			break;
		case ("XClosureImpl"):
			XClosure xClosure = new XClosure((XClosureImpl) object);
			xClosure.accept(expressionVisitor);
			break;
		case ("XClosureImplCustom"):
			XClosureCustom xClosureCustom = new XClosureCustom((XClosureImplCustom) object);
			xClosureCustom.accept(expressionVisitor);
			break;
		case ("XCollectionLiteralImpl"):
			XCollectionLiteral xCollectionLiteral = new XCollectionLiteral((XCollectionLiteralImpl) object);
			xCollectionLiteral.accept(expressionVisitor);
			break;
		case ("XConstructorCallImpl"):
			XConstructorCall xConstructorCall = new XConstructorCall((XConstructorCallImpl) object);
			xConstructorCall.accept(expressionVisitor);
			break;
		case ("XConstructorCallImplCustom"):
			XConstructorCallCustom xConstructorCallCustom = new XConstructorCallCustom(
					(XConstructorCallImplCustom) object);
			xConstructorCallCustom.accept(expressionVisitor);
			break;
		case ("XDoWhileExpressionImpl"):
			XDoWhileExpression xDoWhileExpression = new XDoWhileExpression((XDoWhileExpressionImpl) object);
			xDoWhileExpression.accept(expressionVisitor);
			break;
		case ("XExpressionImpl"):
			ScriptXExpression xExpression = new ScriptXExpression((XExpression) object);
			xExpression.accept(expressionVisitor);
			break;
		case ("XFeatureCallImpl"):
			XFeatureCall xFeatureCall = new XFeatureCall((XFeatureCallImpl) object);
			xFeatureCall.accept(expressionVisitor);
			break;
		case ("XFeatureCallImplCustom"):
			XFeatureCallCustom xFeatureCallCustom = new XFeatureCallCustom((XFeatureCallImplCustom) object);
			xFeatureCallCustom.accept(expressionVisitor);
			break;
		case ("XForLoopExpressionImpl"):
			XForLoopExpression xForLoopExpression = new XForLoopExpression((XForLoopExpressionImpl) object);
			xForLoopExpression.accept(expressionVisitor);
			break;
		case ("XIfExpressionImpl"):
			XIfExpression xIfExpression = new XIfExpression((XIfExpressionImpl) object);
			xIfExpression.accept(expressionVisitor);
			break;
		case ("XInstanceOfExpressionImpl"):
			XInstanceOfExpression xInstanceOfExpression = new XInstanceOfExpression((XInstanceOfExpressionImpl) object);
			xInstanceOfExpression.accept(expressionVisitor);
			break;
		case ("XListLiteralImpl"):
			XListLiteral xListLiteral = new XListLiteral((XListLiteralImpl) object);
			xListLiteral.accept(expressionVisitor);
			break;
		case ("XMemberFeatureCallImpl"):
			XMemberFeatureCall xMemberFeature = new XMemberFeatureCall((XMemberFeatureCallImpl) object);
			xMemberFeature.accept(expressionVisitor);
			break;
		case ("XMemberFeatureCallImplCustom"):
			XMemberFeatureCallCustom xMemberFeatureCallCustom = new XMemberFeatureCallCustom(
					(XMemberFeatureCallImplCustom) object);
			xMemberFeatureCallCustom.accept(expressionVisitor);
			break;
		case ("XNullLiteralImpl"):
			XNullLiteral xNullLiteral = new XNullLiteral((XNullLiteralImpl) object);
			xNullLiteral.accept(expressionVisitor);
			break;
		case ("XNullLiteralImplCustom"):
			XNullLiteralCustom xNullLiteralCustom = new XNullLiteralCustom((XNullLiteralImplCustom) object);
			xNullLiteralCustom.accept(expressionVisitor);
			break;
		case ("XNumberLiteralImpl"):
			XNumberLiteral xNumberLiteral = new XNumberLiteral((XNumberLiteralImpl) object);
			xNumberLiteral.accept(expressionVisitor);
			break;
		case ("XPostfixOperationImpl"):
			XPostfixOperation xPostfixOperation = new XPostfixOperation((XPostfixOperationImpl) object);
			xPostfixOperation.accept(expressionVisitor);
			break;
		case ("XReturnExpressionImpl"):
			XReturnExpression xReturnExpression = new XReturnExpression((XReturnExpressionImpl) object);
			xReturnExpression.accept(expressionVisitor);
			break;
		case ("XSetLiteralImpl"):
			XSetLiteral xSetLiteral = new XSetLiteral((XSetLiteralImpl) object);
			xSetLiteral.accept(expressionVisitor);
			break;
		case ("XStringLiteralImpl"):
			XStringLiteral xStringLiteral = new XStringLiteral((XStringLiteralImpl) object);
			xStringLiteral.accept(expressionVisitor);
			break;
		case ("XSwitchExpressionImpl"):
			XSwitchExpression xSwitchExpression = new XSwitchExpression((XSwitchExpressionImpl) object);
			xSwitchExpression.accept(expressionVisitor);
			break;
		case ("XSynchronizedExpressionImpl"):
			XSynchronizedExpression xSynchronizedExpression = new XSynchronizedExpression(
					(XSynchronizedExpressionImpl) object);
			xSynchronizedExpression.accept(expressionVisitor);
			break;
		case ("XThrowExpressionImpl"):
			XThrowExpression xThrowExpression = new XThrowExpression((XThrowExpressionImpl) object);
			xThrowExpression.accept(expressionVisitor);
			break;
		case ("XTryCatchFinallyExpressionImpl"):
			XTryCatchFinallyExpression xTryCatchFinallyExpression = new XTryCatchFinallyExpression(
					(XTryCatchFinallyExpressionImpl) object);
			xTryCatchFinallyExpression.accept(expressionVisitor);
			break;
		case ("XTypeLiteralImpl"):
			XTypeLiteral xTypeLiteral = new XTypeLiteral((XTypeLiteralImpl) object);
			xTypeLiteral.accept(expressionVisitor);
			break;
		case ("XUnaryOperationImpl"):
			XUnaryOperation xUnaryOperation = new XUnaryOperation((XUnaryOperationImpl) object);
			xUnaryOperation.accept(expressionVisitor);
			break;
		case ("XUnaryOperationImplCustom"):
			XUnaryOperationCustom xUnaryOperationCustom = new XUnaryOperationCustom((XUnaryOperationImplCustom) object);
			xUnaryOperationCustom.accept(expressionVisitor);
			break;
		case ("XVariableDeclarationImplCustom"):
			XVariableDeclarationCustom xVariableDeclaration = new XVariableDeclarationCustom(
					(XVariableDeclarationImplCustom) object);
			xVariableDeclaration.accept(expressionVisitor);
			break;
		case ("XWhileExpressionImpl"):
			XWhileExpression xWhileExpression = new XWhileExpression((XWhileExpressionImpl) object);
			xWhileExpression.accept(expressionVisitor);
			break;
		default:
			ConflictAvoidanceChecker.ast_writer.println("default:"+object.getClass().getSimpleName());
			break;
		}
		return null;
	}

}
