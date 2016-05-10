package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XTypeLiteralImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XTypeLiteral extends org.eclipse.xtext.xbase.impl.XTypeLiteralImpl implements Expression {

private XTypeLiteralImpl expression;
	
	public XTypeLiteral(XTypeLiteralImpl exp) {
		expression = exp;
	}
	
	public XTypeLiteralImpl getExpression(){
		return expression;
	}
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
