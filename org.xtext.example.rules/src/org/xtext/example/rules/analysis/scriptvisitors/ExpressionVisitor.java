package org.xtext.example.rules.analysis.scriptvisitors;

/**
 * 
 * @author cnandi
 *
 */
public interface ExpressionVisitor <R> {

	public R visit(XIfExpression xIfExpression);

	public R visit(XSwitchExpression xSwitchExpression);

	public R visit(XCasePart xCasePart);

	public R visit(XBlockExpression xBlockExpression);

	public R visit(XVariableDeclarationCustom xvariableDeclarationCustom);

	public R visit(XAbstractFeatureCall xAbstractFeatureCall);

	public R visit(XMemberFeatureCall xMemberFeatureCall);

	public R visit(XFeatureCall xFeatureCall);

	public R visit(XConstructorCall xConstructorCall);

	public R visit(XBooleanLiteral xBooleanLiteral);

	public R visit(XNullLiteral xNullLiteral);

	public R visit(XNumberLiteral xNumberLiteral);

	public R visit(XStringLiteral xStringLiteral);

	public R visit(XCollectionLiteral xCollectionLiteral);

	public R visit(XListLiteral xListLiteral);

	public R visit(XSetLiteral xSetLiteral);

	public R visit(XClosure xClosure);

	public R visit(XCastedExpression xCastedExpression);

	public R visit(XBinaryOperation xBinaryOperation);

	public R visit(XUnaryOperation xUnaryOperation);

	public R visit(XPostfixOperation xPostfixOperation);

	public R visit(XForLoopExpression xForLoopExpression);

	public R visit(XBasicForLoopExpression xBasicForLoopExpression);

	public R visit(XAbstractWhileExpression xAbstractWhileExpression);

	public R visit(XDoWhileExpression xDoWhileExpression);

	public R visit(XWhileExpression xWhileExpression);

	public R visit(XTypeLiteral xTypeLiteral);

	public R visit(XInstanceOfExpression xInstanceOfExpression);

	public R visit(XThrowExpression xThrowExpression);

	public R visit(XTryCatchFinallyExpression xTryCatchFinallyExpression);

	public R visit(XCatchClause xCatchClause);

	public R visit(XAssignment xAssignment);

	public R visit(XReturnExpression xReturnExpression);

	public R visit(XSynchronizedExpression xSynchronizedExpression);

	public R visit(XBinaryOperationCustom xBinaryOperationImplCustom);

	public R visit(XFeatureCallCustom xFeatureCallImplCustom);

	public R visit(XMemberFeatureCallCustom xMemberFeatureCallImplCustom);

	public R visit(XNullLiteralCustom xNullLiteralCustom);

	public R visit(XClosureCustom xClosureCustom);

	public R visit(ScriptXExpression scriptXExpression);

	public R visit(XBlockExpressionCustom xBlockExpressionCustom);

	public R visit(XAssignmentCustom xAssignmentCustom);

	public R visit(XUnaryOperationCustom xUnaryOperationCustom);

	public R visit(XConstructorCallCustom xConstructorCallCustom);
}
