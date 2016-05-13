package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XMemberFeatureCallImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XMemberFeatureCall extends org.eclipse.xtext.xbase.impl.XMemberFeatureCallImpl implements Expression {

	private XMemberFeatureCallImpl expression;

	public XMemberFeatureCall(XMemberFeatureCallImpl exp) {
		expression = exp;
	}

	public XMemberFeatureCallImpl getExpression() {
		return expression;
	}

	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
