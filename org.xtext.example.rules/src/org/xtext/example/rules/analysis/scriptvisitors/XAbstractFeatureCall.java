package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XAbstractFeatureCallImpl;

/**
 * 
 * @author cnandi
 *
 */
public class XAbstractFeatureCall extends org.eclipse.xtext.xbase.impl.XAbstractFeatureCallImpl implements Expression {

	private XAbstractFeatureCallImpl expression;
	
	public XAbstractFeatureCall(XAbstractFeatureCallImpl exp) {
		expression = exp;
	}
	
	public XAbstractFeatureCallImpl getExpression(){
		return expression;
	}
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);
	}
}
