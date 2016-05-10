package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XSetLiteralImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XSetLiteral extends org.eclipse.xtext.xbase.impl.XSetLiteralImpl implements Expression {

private XSetLiteralImpl expression;
	
	public XSetLiteral(XSetLiteralImpl exp) {
		expression = exp;
	}
	
	public XSetLiteralImpl getExpression(){
		return expression;
	}
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
