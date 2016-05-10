package org.xtext.example.rules.analysis.scriptvisitors;
/**
 * 
 * @author cnandi
 *
 */
public interface ExpressionVisitor {

	public void visit(XIfExpression xIfExpression);

	public void visit(XSwitchExpression xSwitchExpression);

	public void visit(XCasePart xCasePart);

	public void visit(XBlockExpression xBlockExpression);

	public void visit(XVariableDeclarationCustom xvariableDeclarationCustom);

	public void visit(XAbstractFeatureCall xAbstractFeatureCall);

	public void visit(XMemberFeatureCall xMemberFeatureCall);

	public void visit(XFeatureCall xFeatureCall);

	public void visit(XConstructorCall xConstructorCall);

	public void visit(XBooleanLiteral xBooleanLiteral);

	public void visit(XNullLiteral xNullLiteral);

	public void visit(XNumberLiteral xNumberLiteral);

	public void visit(XStringLiteral xStringLiteral);

	public void visit(XCollectionLiteral xCollectionLiteral);

	public void visit(XListLiteral xListLiteral);

	public void visit(XSetLiteral xSetLiteral);

	public void visit(XClosure xClosure);

	public void visit(XCastedExpression xCastedExpression);

	public void visit(XBinaryOperation xBinaryOperation);

	public void visit(XUnaryOperation xUnaryOperation);

	public void visit(XPostfixOperation xPostfixOperation);

	public void visit(XForLoopExpression xForLoopExpression);

	public void visit(XBasicForLoopExpression xBasicForLoopExpression);

	public void visit(XAbstractWhileExpression xAbstractWhileExpression);

	public void visit(XDoWhileExpression xDoWhileExpression);

	public void visit(XWhileExpression xWhileExpression);

	public void visit(XTypeLiteral xTypeLiteral);

	public void visit(XInstanceOfExpression xInstanceOfExpression);

	public void visit(XThrowExpression xThrowExpression);

	public void visit(XTryCatchFinallyExpression xTryCatchFinallyExpression);

	public void visit(XCatchClause xCatchClause);

	public void visit(XAssignment xAssignment);

	public void visit(XReturnExpression xReturnExpression);

	public void visit(XSynchronizedExpression xSynchronizedExpression);

	public void visit(XBinaryOperationCustom xBinaryOperationImplCustom);

	public void visit(XFeatureCallCustom xFeatureCallImplCustom);

	public void visit(XMemberFeatureCallCustom xMemberFeatureCallImplCustom);

	public void visit(XNullLiteralCustom xNullLiteralCustom);

	public void visit(XClosureCustom xClosureCustom);

	public void visit(ScriptXExpression scriptXExpression);

	public void visit(XBlockExpressionCustom xBlockExpressionCustom);

	public void visit(XAssignmentCustom xAssignmentCustom);
}
