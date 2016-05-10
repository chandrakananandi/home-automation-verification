/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.items.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ItemsGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ItemModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.items.Items.ItemModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cItemModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cItemsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cItemsModelItemParserRuleCall_1_0 = (RuleCall)cItemsAssignment_1.eContents().get(0);
		
		//ItemModel:
		//	{ItemModel} items+=ModelItem*;
		@Override public ParserRule getRule() { return rule; }
		
		//{ItemModel} items+=ModelItem*
		public Group getGroup() { return cGroup; }
		
		//{ItemModel}
		public Action getItemModelAction_0() { return cItemModelAction_0; }
		
		//items+=ModelItem*
		public Assignment getItemsAssignment_1() { return cItemsAssignment_1; }
		
		//ModelItem
		public RuleCall getItemsModelItemParserRuleCall_1_0() { return cItemsModelItemParserRuleCall_1_0; }
	}
	public class ModelItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.items.Items.ModelItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cModelNormalItemParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cModelGroupItemParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cLabelAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLabelSTRINGTerminalRuleCall_2_0 = (RuleCall)cLabelAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLessThanSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cIconAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final Alternatives cIconAlternatives_3_1_0 = (Alternatives)cIconAssignment_3_1.eContents().get(0);
		private final RuleCall cIconIDTerminalRuleCall_3_1_0_0 = (RuleCall)cIconAlternatives_3_1_0.eContents().get(0);
		private final RuleCall cIconSTRINGTerminalRuleCall_3_1_0_1 = (RuleCall)cIconAlternatives_3_1_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cGroupsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cGroupsIDTerminalRuleCall_4_1_0 = (RuleCall)cGroupsAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cGroupsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cGroupsIDTerminalRuleCall_4_2_1_0 = (RuleCall)cGroupsAssignment_4_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cBindingsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cBindingsModelBindingParserRuleCall_5_1_0 = (RuleCall)cBindingsAssignment_5_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cGroup_5.eContents().get(2);
		private final Keyword cCommaKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Assignment cBindingsAssignment_5_2_1 = (Assignment)cGroup_5_2.eContents().get(1);
		private final RuleCall cBindingsModelBindingParserRuleCall_5_2_1_0 = (RuleCall)cBindingsAssignment_5_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		
		//ModelItem:
		//	(ModelNormalItem | ModelGroupItem) name=ID
		//	label=STRING? ('<' icon=(ID | STRING) '>')? ('(' groups+=ID (',' groups+=ID)* ')')? ('{' bindings+=ModelBinding (','
		//	bindings+=ModelBinding)* '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//(ModelNormalItem | ModelGroupItem) name=ID label=STRING? ('<' icon=(ID | STRING) '>')? ('(' groups+=ID (',' groups+=ID)*
		//')')? ('{' bindings+=ModelBinding (',' bindings+=ModelBinding)* '}')?
		public Group getGroup() { return cGroup; }
		
		//(ModelNormalItem | ModelGroupItem)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//ModelNormalItem
		public RuleCall getModelNormalItemParserRuleCall_0_0() { return cModelNormalItemParserRuleCall_0_0; }
		
		//ModelGroupItem
		public RuleCall getModelGroupItemParserRuleCall_0_1() { return cModelGroupItemParserRuleCall_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//label=STRING?
		public Assignment getLabelAssignment_2() { return cLabelAssignment_2; }
		
		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_2_0() { return cLabelSTRINGTerminalRuleCall_2_0; }
		
		//('<' icon=(ID | STRING) '>')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'<'
		public Keyword getLessThanSignKeyword_3_0() { return cLessThanSignKeyword_3_0; }
		
		//icon=(ID | STRING)
		public Assignment getIconAssignment_3_1() { return cIconAssignment_3_1; }
		
		//(ID | STRING)
		public Alternatives getIconAlternatives_3_1_0() { return cIconAlternatives_3_1_0; }
		
		//ID
		public RuleCall getIconIDTerminalRuleCall_3_1_0_0() { return cIconIDTerminalRuleCall_3_1_0_0; }
		
		//STRING
		public RuleCall getIconSTRINGTerminalRuleCall_3_1_0_1() { return cIconSTRINGTerminalRuleCall_3_1_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3_2() { return cGreaterThanSignKeyword_3_2; }
		
		//('(' groups+=ID (',' groups+=ID)* ')')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4_0() { return cLeftParenthesisKeyword_4_0; }
		
		//groups+=ID
		public Assignment getGroupsAssignment_4_1() { return cGroupsAssignment_4_1; }
		
		//ID
		public RuleCall getGroupsIDTerminalRuleCall_4_1_0() { return cGroupsIDTerminalRuleCall_4_1_0; }
		
		//(',' groups+=ID)*
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//','
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }
		
		//groups+=ID
		public Assignment getGroupsAssignment_4_2_1() { return cGroupsAssignment_4_2_1; }
		
		//ID
		public RuleCall getGroupsIDTerminalRuleCall_4_2_1_0() { return cGroupsIDTerminalRuleCall_4_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4_3() { return cRightParenthesisKeyword_4_3; }
		
		//('{' bindings+=ModelBinding (',' bindings+=ModelBinding)* '}')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_0() { return cLeftCurlyBracketKeyword_5_0; }
		
		//bindings+=ModelBinding
		public Assignment getBindingsAssignment_5_1() { return cBindingsAssignment_5_1; }
		
		//ModelBinding
		public RuleCall getBindingsModelBindingParserRuleCall_5_1_0() { return cBindingsModelBindingParserRuleCall_5_1_0; }
		
		//(',' bindings+=ModelBinding)*
		public Group getGroup_5_2() { return cGroup_5_2; }
		
		//','
		public Keyword getCommaKeyword_5_2_0() { return cCommaKeyword_5_2_0; }
		
		//bindings+=ModelBinding
		public Assignment getBindingsAssignment_5_2_1() { return cBindingsAssignment_5_2_1; }
		
		//ModelBinding
		public RuleCall getBindingsModelBindingParserRuleCall_5_2_1_0() { return cBindingsModelBindingParserRuleCall_5_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_3() { return cRightCurlyBracketKeyword_5_3; }
	}
	public class ModelGroupItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.items.Items.ModelGroupItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelGroupItemAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGroupKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTypeModelItemTypeParserRuleCall_2_1_0 = (RuleCall)cTypeAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cColonKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cFunctionAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cFunctionModelGroupFunctionEnumRuleCall_2_2_1_0 = (RuleCall)cFunctionAssignment_2_2_1.eContents().get(0);
		private final Group cGroup_2_2_2 = (Group)cGroup_2_2.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_2_2_0 = (Keyword)cGroup_2_2_2.eContents().get(0);
		private final Assignment cArgsAssignment_2_2_2_1 = (Assignment)cGroup_2_2_2.eContents().get(1);
		private final Alternatives cArgsAlternatives_2_2_2_1_0 = (Alternatives)cArgsAssignment_2_2_2_1.eContents().get(0);
		private final RuleCall cArgsIDTerminalRuleCall_2_2_2_1_0_0 = (RuleCall)cArgsAlternatives_2_2_2_1_0.eContents().get(0);
		private final RuleCall cArgsSTRINGTerminalRuleCall_2_2_2_1_0_1 = (RuleCall)cArgsAlternatives_2_2_2_1_0.eContents().get(1);
		private final Group cGroup_2_2_2_2 = (Group)cGroup_2_2_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_2_2_0 = (Keyword)cGroup_2_2_2_2.eContents().get(0);
		private final Assignment cArgsAssignment_2_2_2_2_1 = (Assignment)cGroup_2_2_2_2.eContents().get(1);
		private final Alternatives cArgsAlternatives_2_2_2_2_1_0 = (Alternatives)cArgsAssignment_2_2_2_2_1.eContents().get(0);
		private final RuleCall cArgsIDTerminalRuleCall_2_2_2_2_1_0_0 = (RuleCall)cArgsAlternatives_2_2_2_2_1_0.eContents().get(0);
		private final RuleCall cArgsSTRINGTerminalRuleCall_2_2_2_2_1_0_1 = (RuleCall)cArgsAlternatives_2_2_2_2_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2_2_3 = (Keyword)cGroup_2_2_2.eContents().get(3);
		
		//ModelGroupItem:
		//	{ModelGroupItem} 'Group' (':' type=ModelItemType (':' function=ModelGroupFunction ('(' args+=(ID | STRING) (','
		//	args+=(ID | STRING))* ')')?)?)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{ModelGroupItem} 'Group' (':' type=ModelItemType (':' function=ModelGroupFunction ('(' args+=(ID | STRING) (','
		//args+=(ID | STRING))* ')')?)?)?
		public Group getGroup() { return cGroup; }
		
		//{ModelGroupItem}
		public Action getModelGroupItemAction_0() { return cModelGroupItemAction_0; }
		
		//'Group'
		public Keyword getGroupKeyword_1() { return cGroupKeyword_1; }
		
		//(':' type=ModelItemType (':' function=ModelGroupFunction ('(' args+=(ID | STRING) (',' args+=(ID | STRING))* ')')?)?)?
		public Group getGroup_2() { return cGroup_2; }
		
		//':'
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }
		
		//type=ModelItemType
		public Assignment getTypeAssignment_2_1() { return cTypeAssignment_2_1; }
		
		//ModelItemType
		public RuleCall getTypeModelItemTypeParserRuleCall_2_1_0() { return cTypeModelItemTypeParserRuleCall_2_1_0; }
		
		//(':' function=ModelGroupFunction ('(' args+=(ID | STRING) (',' args+=(ID | STRING))* ')')?)?
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//':'
		public Keyword getColonKeyword_2_2_0() { return cColonKeyword_2_2_0; }
		
		//function=ModelGroupFunction
		public Assignment getFunctionAssignment_2_2_1() { return cFunctionAssignment_2_2_1; }
		
		//ModelGroupFunction
		public RuleCall getFunctionModelGroupFunctionEnumRuleCall_2_2_1_0() { return cFunctionModelGroupFunctionEnumRuleCall_2_2_1_0; }
		
		//('(' args+=(ID | STRING) (',' args+=(ID | STRING))* ')')?
		public Group getGroup_2_2_2() { return cGroup_2_2_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_2_2_0() { return cLeftParenthesisKeyword_2_2_2_0; }
		
		//args+=(ID | STRING)
		public Assignment getArgsAssignment_2_2_2_1() { return cArgsAssignment_2_2_2_1; }
		
		//(ID | STRING)
		public Alternatives getArgsAlternatives_2_2_2_1_0() { return cArgsAlternatives_2_2_2_1_0; }
		
		//ID
		public RuleCall getArgsIDTerminalRuleCall_2_2_2_1_0_0() { return cArgsIDTerminalRuleCall_2_2_2_1_0_0; }
		
		//STRING
		public RuleCall getArgsSTRINGTerminalRuleCall_2_2_2_1_0_1() { return cArgsSTRINGTerminalRuleCall_2_2_2_1_0_1; }
		
		//(',' args+=(ID | STRING))*
		public Group getGroup_2_2_2_2() { return cGroup_2_2_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_2_2_0() { return cCommaKeyword_2_2_2_2_0; }
		
		//args+=(ID | STRING)
		public Assignment getArgsAssignment_2_2_2_2_1() { return cArgsAssignment_2_2_2_2_1; }
		
		//(ID | STRING)
		public Alternatives getArgsAlternatives_2_2_2_2_1_0() { return cArgsAlternatives_2_2_2_2_1_0; }
		
		//ID
		public RuleCall getArgsIDTerminalRuleCall_2_2_2_2_1_0_0() { return cArgsIDTerminalRuleCall_2_2_2_2_1_0_0; }
		
		//STRING
		public RuleCall getArgsSTRINGTerminalRuleCall_2_2_2_2_1_0_1() { return cArgsSTRINGTerminalRuleCall_2_2_2_2_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_2_2_3() { return cRightParenthesisKeyword_2_2_2_3; }
	}
	public class ModelNormalItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.items.Items.ModelNormalItem");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTypeModelItemTypeParserRuleCall_0 = (RuleCall)cTypeAssignment.eContents().get(0);
		
		//ModelNormalItem:
		//	type=ModelItemType;
		@Override public ParserRule getRule() { return rule; }
		
		//type=ModelItemType
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//ModelItemType
		public RuleCall getTypeModelItemTypeParserRuleCall_0() { return cTypeModelItemTypeParserRuleCall_0; }
	}
	public class ModelItemTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.items.Items.ModelItemType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cSwitchKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cRollershutterKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cNumberKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cStringKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cDimmerKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cContactKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cDateTimeKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cColorKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cLocationKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		private final RuleCall cIDTerminalRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		
		//ModelItemType:
		//	'Switch' | 'Rollershutter' | 'Number' | 'String' | 'Dimmer' | 'Contact' | 'DateTime' | 'Color' | 'Location' | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'Switch' | 'Rollershutter' | 'Number' | 'String' | 'Dimmer' | 'Contact' | 'DateTime' | 'Color' | 'Location' | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'Switch'
		public Keyword getSwitchKeyword_0() { return cSwitchKeyword_0; }
		
		//'Rollershutter'
		public Keyword getRollershutterKeyword_1() { return cRollershutterKeyword_1; }
		
		//'Number'
		public Keyword getNumberKeyword_2() { return cNumberKeyword_2; }
		
		//'String'
		public Keyword getStringKeyword_3() { return cStringKeyword_3; }
		
		//'Dimmer'
		public Keyword getDimmerKeyword_4() { return cDimmerKeyword_4; }
		
		//'Contact'
		public Keyword getContactKeyword_5() { return cContactKeyword_5; }
		
		//'DateTime'
		public Keyword getDateTimeKeyword_6() { return cDateTimeKeyword_6; }
		
		//'Color'
		public Keyword getColorKeyword_7() { return cColorKeyword_7; }
		
		//'Location'
		public Keyword getLocationKeyword_8() { return cLocationKeyword_8; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_9() { return cIDTerminalRuleCall_9; }
	}
	public class ModelBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.items.Items.ModelBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeIDTerminalRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConfigurationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConfigurationSTRINGTerminalRuleCall_2_0 = (RuleCall)cConfigurationAssignment_2.eContents().get(0);
		
		//ModelBinding:
		//	type=ID '=' configuration=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//type=ID '=' configuration=STRING
		public Group getGroup() { return cGroup; }
		
		//type=ID
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_0_0() { return cTypeIDTerminalRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//configuration=STRING
		public Assignment getConfigurationAssignment_2() { return cConfigurationAssignment_2; }
		
		//STRING
		public RuleCall getConfigurationSTRINGTerminalRuleCall_2_0() { return cConfigurationSTRINGTerminalRuleCall_2_0; }
	}
	
	public class ModelGroupFunctionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.items.Items.ModelGroupFunction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cANDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cANDANDKeyword_0_0 = (Keyword)cANDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOREnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cORORKeyword_1_0 = (Keyword)cOREnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cNANDEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cNANDNANDKeyword_2_0 = (Keyword)cNANDEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cNOREnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cNORNORKeyword_3_0 = (Keyword)cNOREnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cAVGEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cAVGAVGKeyword_4_0 = (Keyword)cAVGEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cSUMEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cSUMSUMKeyword_5_0 = (Keyword)cSUMEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cMAXEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cMAXMAXKeyword_6_0 = (Keyword)cMAXEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cMINEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cMINMINKeyword_7_0 = (Keyword)cMINEnumLiteralDeclaration_7.eContents().get(0);
		private final EnumLiteralDeclaration cCOUNTEnumLiteralDeclaration_8 = (EnumLiteralDeclaration)cAlternatives.eContents().get(8);
		private final Keyword cCOUNTCOUNTKeyword_8_0 = (Keyword)cCOUNTEnumLiteralDeclaration_8.eContents().get(0);
		
		//enum ModelGroupFunction:
		//	AND | OR | NAND | NOR | AVG | SUM | MAX | MIN | COUNT;
		public EnumRule getRule() { return rule; }
		
		//AND | OR | NAND | NOR | AVG | SUM | MAX | MIN | COUNT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AND
		public EnumLiteralDeclaration getANDEnumLiteralDeclaration_0() { return cANDEnumLiteralDeclaration_0; }
		
		//'AND'
		public Keyword getANDANDKeyword_0_0() { return cANDANDKeyword_0_0; }
		
		//OR
		public EnumLiteralDeclaration getOREnumLiteralDeclaration_1() { return cOREnumLiteralDeclaration_1; }
		
		//'OR'
		public Keyword getORORKeyword_1_0() { return cORORKeyword_1_0; }
		
		//NAND
		public EnumLiteralDeclaration getNANDEnumLiteralDeclaration_2() { return cNANDEnumLiteralDeclaration_2; }
		
		//'NAND'
		public Keyword getNANDNANDKeyword_2_0() { return cNANDNANDKeyword_2_0; }
		
		//NOR
		public EnumLiteralDeclaration getNOREnumLiteralDeclaration_3() { return cNOREnumLiteralDeclaration_3; }
		
		//'NOR'
		public Keyword getNORNORKeyword_3_0() { return cNORNORKeyword_3_0; }
		
		//AVG
		public EnumLiteralDeclaration getAVGEnumLiteralDeclaration_4() { return cAVGEnumLiteralDeclaration_4; }
		
		//'AVG'
		public Keyword getAVGAVGKeyword_4_0() { return cAVGAVGKeyword_4_0; }
		
		//SUM
		public EnumLiteralDeclaration getSUMEnumLiteralDeclaration_5() { return cSUMEnumLiteralDeclaration_5; }
		
		//'SUM'
		public Keyword getSUMSUMKeyword_5_0() { return cSUMSUMKeyword_5_0; }
		
		//MAX
		public EnumLiteralDeclaration getMAXEnumLiteralDeclaration_6() { return cMAXEnumLiteralDeclaration_6; }
		
		//'MAX'
		public Keyword getMAXMAXKeyword_6_0() { return cMAXMAXKeyword_6_0; }
		
		//MIN
		public EnumLiteralDeclaration getMINEnumLiteralDeclaration_7() { return cMINEnumLiteralDeclaration_7; }
		
		//'MIN'
		public Keyword getMINMINKeyword_7_0() { return cMINMINKeyword_7_0; }
		
		//COUNT
		public EnumLiteralDeclaration getCOUNTEnumLiteralDeclaration_8() { return cCOUNTEnumLiteralDeclaration_8; }
		
		//'COUNT'
		public Keyword getCOUNTCOUNTKeyword_8_0() { return cCOUNTCOUNTKeyword_8_0; }
	}
	
	private final ItemModelElements pItemModel;
	private final ModelItemElements pModelItem;
	private final ModelGroupItemElements pModelGroupItem;
	private final ModelGroupFunctionElements eModelGroupFunction;
	private final ModelNormalItemElements pModelNormalItem;
	private final ModelItemTypeElements pModelItemType;
	private final ModelBindingElements pModelBinding;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ItemsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pItemModel = new ItemModelElements();
		this.pModelItem = new ModelItemElements();
		this.pModelGroupItem = new ModelGroupItemElements();
		this.eModelGroupFunction = new ModelGroupFunctionElements();
		this.pModelNormalItem = new ModelNormalItemElements();
		this.pModelItemType = new ModelItemTypeElements();
		this.pModelBinding = new ModelBindingElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.items.Items".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ItemModel:
	//	{ItemModel} items+=ModelItem*;
	public ItemModelElements getItemModelAccess() {
		return pItemModel;
	}
	
	public ParserRule getItemModelRule() {
		return getItemModelAccess().getRule();
	}
	
	//ModelItem:
	//	(ModelNormalItem | ModelGroupItem) name=ID
	//	label=STRING? ('<' icon=(ID | STRING) '>')? ('(' groups+=ID (',' groups+=ID)* ')')? ('{' bindings+=ModelBinding (','
	//	bindings+=ModelBinding)* '}')?;
	public ModelItemElements getModelItemAccess() {
		return pModelItem;
	}
	
	public ParserRule getModelItemRule() {
		return getModelItemAccess().getRule();
	}
	
	//ModelGroupItem:
	//	{ModelGroupItem} 'Group' (':' type=ModelItemType (':' function=ModelGroupFunction ('(' args+=(ID | STRING) (','
	//	args+=(ID | STRING))* ')')?)?)?;
	public ModelGroupItemElements getModelGroupItemAccess() {
		return pModelGroupItem;
	}
	
	public ParserRule getModelGroupItemRule() {
		return getModelGroupItemAccess().getRule();
	}
	
	//enum ModelGroupFunction:
	//	AND | OR | NAND | NOR | AVG | SUM | MAX | MIN | COUNT;
	public ModelGroupFunctionElements getModelGroupFunctionAccess() {
		return eModelGroupFunction;
	}
	
	public EnumRule getModelGroupFunctionRule() {
		return getModelGroupFunctionAccess().getRule();
	}
	
	//ModelNormalItem:
	//	type=ModelItemType;
	public ModelNormalItemElements getModelNormalItemAccess() {
		return pModelNormalItem;
	}
	
	public ParserRule getModelNormalItemRule() {
		return getModelNormalItemAccess().getRule();
	}
	
	//ModelItemType:
	//	'Switch' | 'Rollershutter' | 'Number' | 'String' | 'Dimmer' | 'Contact' | 'DateTime' | 'Color' | 'Location' | ID;
	public ModelItemTypeElements getModelItemTypeAccess() {
		return pModelItemType;
	}
	
	public ParserRule getModelItemTypeRule() {
		return getModelItemTypeAccess().getRule();
	}
	
	//ModelBinding:
	//	type=ID '=' configuration=STRING;
	public ModelBindingElements getModelBindingAccess() {
		return pModelBinding;
	}
	
	public ParserRule getModelBindingRule() {
		return getModelBindingAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
