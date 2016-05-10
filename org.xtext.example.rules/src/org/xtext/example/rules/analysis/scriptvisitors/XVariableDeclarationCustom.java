package org.xtext.example.rules.analysis.scriptvisitors;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XVariableDeclarationImpl;
import org.eclipse.xtext.xbase.impl.XVariableDeclarationImplCustom;

/**
 * 
 * @author cnandi
 *
 */
public class XVariableDeclarationCustom extends org.eclipse.xtext.xbase.impl.XVariableDeclarationImplCustom implements Expression {

private XVariableDeclarationImplCustom expression;
	
	public XVariableDeclarationCustom(XVariableDeclarationImplCustom exp) {
		expression = exp;
	}
	
	public XVariableDeclarationImplCustom getExpression(){
		return expression;
	}
	@Override
	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);

	}

}
