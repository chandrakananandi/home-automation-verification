package org.xtext.example.items.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.items.services.ItemsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalItemsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'('", "','", "')'", "'{'", "'}'", "'Group'", "':'", "'Switch'", "'Rollershutter'", "'Number'", "'String'", "'Dimmer'", "'Contact'", "'DateTime'", "'Color'", "'Location'", "'='", "'AND'", "'OR'", "'NAND'", "'NOR'", "'AVG'", "'SUM'", "'MAX'", "'MIN'", "'COUNT'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalItemsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalItemsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalItemsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalItems.g"; }



     	private ItemsGrammarAccess grammarAccess;

        public InternalItemsParser(TokenStream input, ItemsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ItemModel";
       	}

       	@Override
       	protected ItemsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleItemModel"
    // InternalItems.g:65:1: entryRuleItemModel returns [EObject current=null] : iv_ruleItemModel= ruleItemModel EOF ;
    public final EObject entryRuleItemModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemModel = null;


        try {
            // InternalItems.g:65:50: (iv_ruleItemModel= ruleItemModel EOF )
            // InternalItems.g:66:2: iv_ruleItemModel= ruleItemModel EOF
            {
             newCompositeNode(grammarAccess.getItemModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemModel=ruleItemModel();

            state._fsp--;

             current =iv_ruleItemModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemModel"


    // $ANTLR start "ruleItemModel"
    // InternalItems.g:72:1: ruleItemModel returns [EObject current=null] : ( () ( (lv_items_1_0= ruleModelItem ) )* ) ;
    public final EObject ruleItemModel() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalItems.g:78:2: ( ( () ( (lv_items_1_0= ruleModelItem ) )* ) )
            // InternalItems.g:79:2: ( () ( (lv_items_1_0= ruleModelItem ) )* )
            {
            // InternalItems.g:79:2: ( () ( (lv_items_1_0= ruleModelItem ) )* )
            // InternalItems.g:80:3: () ( (lv_items_1_0= ruleModelItem ) )*
            {
            // InternalItems.g:80:3: ()
            // InternalItems.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getItemModelAccess().getItemModelAction_0(),
            					current);
            			

            }

            // InternalItems.g:87:3: ( (lv_items_1_0= ruleModelItem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==18||(LA1_0>=20 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalItems.g:88:4: (lv_items_1_0= ruleModelItem )
            	    {
            	    // InternalItems.g:88:4: (lv_items_1_0= ruleModelItem )
            	    // InternalItems.g:89:5: lv_items_1_0= ruleModelItem
            	    {

            	    					newCompositeNode(grammarAccess.getItemModelAccess().getItemsModelItemParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_items_1_0=ruleModelItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getItemModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_1_0,
            	    						"org.xtext.example.items.Items.ModelItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemModel"


    // $ANTLR start "entryRuleModelItem"
    // InternalItems.g:110:1: entryRuleModelItem returns [EObject current=null] : iv_ruleModelItem= ruleModelItem EOF ;
    public final EObject entryRuleModelItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelItem = null;


        try {
            // InternalItems.g:110:50: (iv_ruleModelItem= ruleModelItem EOF )
            // InternalItems.g:111:2: iv_ruleModelItem= ruleModelItem EOF
            {
             newCompositeNode(grammarAccess.getModelItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelItem=ruleModelItem();

            state._fsp--;

             current =iv_ruleModelItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelItem"


    // $ANTLR start "ruleModelItem"
    // InternalItems.g:117:1: ruleModelItem returns [EObject current=null] : ( (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )? (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= '{' ( (lv_bindings_13_0= ruleModelBinding ) ) (otherlv_14= ',' ( (lv_bindings_15_0= ruleModelBinding ) ) )* otherlv_16= '}' )? ) ;
    public final EObject ruleModelItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token lv_icon_5_1=null;
        Token lv_icon_5_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_groups_8_0=null;
        Token otherlv_9=null;
        Token lv_groups_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject this_ModelNormalItem_0 = null;

        EObject this_ModelGroupItem_1 = null;

        EObject lv_bindings_13_0 = null;

        EObject lv_bindings_15_0 = null;



        	enterRule();

        try {
            // InternalItems.g:123:2: ( ( (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )? (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= '{' ( (lv_bindings_13_0= ruleModelBinding ) ) (otherlv_14= ',' ( (lv_bindings_15_0= ruleModelBinding ) ) )* otherlv_16= '}' )? ) )
            // InternalItems.g:124:2: ( (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )? (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= '{' ( (lv_bindings_13_0= ruleModelBinding ) ) (otherlv_14= ',' ( (lv_bindings_15_0= ruleModelBinding ) ) )* otherlv_16= '}' )? )
            {
            // InternalItems.g:124:2: ( (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )? (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= '{' ( (lv_bindings_13_0= ruleModelBinding ) ) (otherlv_14= ',' ( (lv_bindings_15_0= ruleModelBinding ) ) )* otherlv_16= '}' )? )
            // InternalItems.g:125:3: (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_label_3_0= RULE_STRING ) )? (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )? (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )? (otherlv_12= '{' ( (lv_bindings_13_0= ruleModelBinding ) ) (otherlv_14= ',' ( (lv_bindings_15_0= ruleModelBinding ) ) )* otherlv_16= '}' )?
            {
            // InternalItems.g:125:3: (this_ModelNormalItem_0= ruleModelNormalItem | this_ModelGroupItem_1= ruleModelGroupItem )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=20 && LA2_0<=28)) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalItems.g:126:4: this_ModelNormalItem_0= ruleModelNormalItem
                    {

                    				newCompositeNode(grammarAccess.getModelItemAccess().getModelNormalItemParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_ModelNormalItem_0=ruleModelNormalItem();

                    state._fsp--;


                    				current = this_ModelNormalItem_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalItems.g:135:4: this_ModelGroupItem_1= ruleModelGroupItem
                    {

                    				newCompositeNode(grammarAccess.getModelItemAccess().getModelGroupItemParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_ModelGroupItem_1=ruleModelGroupItem();

                    state._fsp--;


                    				current = this_ModelGroupItem_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalItems.g:144:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalItems.g:145:4: (lv_name_2_0= RULE_ID )
            {
            // InternalItems.g:145:4: (lv_name_2_0= RULE_ID )
            // InternalItems.g:146:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModelItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalItems.g:162:3: ( (lv_label_3_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalItems.g:163:4: (lv_label_3_0= RULE_STRING )
                    {
                    // InternalItems.g:163:4: (lv_label_3_0= RULE_STRING )
                    // InternalItems.g:164:5: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_label_3_0, grammarAccess.getModelItemAccess().getLabelSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelItemRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"label",
                    						lv_label_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalItems.g:180:3: (otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalItems.g:181:4: otherlv_4= '<' ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) ) otherlv_6= '>'
                    {
                    otherlv_4=(Token)match(input,11,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelItemAccess().getLessThanSignKeyword_3_0());
                    			
                    // InternalItems.g:185:4: ( ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) ) )
                    // InternalItems.g:186:5: ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) )
                    {
                    // InternalItems.g:186:5: ( (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING ) )
                    // InternalItems.g:187:6: (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING )
                    {
                    // InternalItems.g:187:6: (lv_icon_5_1= RULE_ID | lv_icon_5_2= RULE_STRING )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_STRING) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalItems.g:188:7: lv_icon_5_1= RULE_ID
                            {
                            lv_icon_5_1=(Token)match(input,RULE_ID,FOLLOW_8); 

                            							newLeafNode(lv_icon_5_1, grammarAccess.getModelItemAccess().getIconIDTerminalRuleCall_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelItemRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"icon",
                            								lv_icon_5_1,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalItems.g:203:7: lv_icon_5_2= RULE_STRING
                            {
                            lv_icon_5_2=(Token)match(input,RULE_STRING,FOLLOW_8); 

                            							newLeafNode(lv_icon_5_2, grammarAccess.getModelItemAccess().getIconSTRINGTerminalRuleCall_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelItemRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"icon",
                            								lv_icon_5_2,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelItemAccess().getGreaterThanSignKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalItems.g:225:3: (otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalItems.g:226:4: otherlv_7= '(' ( (lv_groups_8_0= RULE_ID ) ) (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getModelItemAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalItems.g:230:4: ( (lv_groups_8_0= RULE_ID ) )
                    // InternalItems.g:231:5: (lv_groups_8_0= RULE_ID )
                    {
                    // InternalItems.g:231:5: (lv_groups_8_0= RULE_ID )
                    // InternalItems.g:232:6: lv_groups_8_0= RULE_ID
                    {
                    lv_groups_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_groups_8_0, grammarAccess.getModelItemAccess().getGroupsIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelItemRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"groups",
                    							lv_groups_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalItems.g:248:4: (otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalItems.g:249:5: otherlv_9= ',' ( (lv_groups_10_0= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getModelItemAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalItems.g:253:5: ( (lv_groups_10_0= RULE_ID ) )
                    	    // InternalItems.g:254:6: (lv_groups_10_0= RULE_ID )
                    	    {
                    	    // InternalItems.g:254:6: (lv_groups_10_0= RULE_ID )
                    	    // InternalItems.g:255:7: lv_groups_10_0= RULE_ID
                    	    {
                    	    lv_groups_10_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    							newLeafNode(lv_groups_10_0, grammarAccess.getModelItemAccess().getGroupsIDTerminalRuleCall_4_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelItemRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_10_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getModelItemAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalItems.g:277:3: (otherlv_12= '{' ( (lv_bindings_13_0= ruleModelBinding ) ) (otherlv_14= ',' ( (lv_bindings_15_0= ruleModelBinding ) ) )* otherlv_16= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalItems.g:278:4: otherlv_12= '{' ( (lv_bindings_13_0= ruleModelBinding ) ) (otherlv_14= ',' ( (lv_bindings_15_0= ruleModelBinding ) ) )* otherlv_16= '}'
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getModelItemAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalItems.g:282:4: ( (lv_bindings_13_0= ruleModelBinding ) )
                    // InternalItems.g:283:5: (lv_bindings_13_0= ruleModelBinding )
                    {
                    // InternalItems.g:283:5: (lv_bindings_13_0= ruleModelBinding )
                    // InternalItems.g:284:6: lv_bindings_13_0= ruleModelBinding
                    {

                    						newCompositeNode(grammarAccess.getModelItemAccess().getBindingsModelBindingParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_bindings_13_0=ruleModelBinding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelItemRule());
                    						}
                    						add(
                    							current,
                    							"bindings",
                    							lv_bindings_13_0,
                    							"org.xtext.example.items.Items.ModelBinding");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalItems.g:301:4: (otherlv_14= ',' ( (lv_bindings_15_0= ruleModelBinding ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalItems.g:302:5: otherlv_14= ',' ( (lv_bindings_15_0= ruleModelBinding ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getModelItemAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalItems.g:306:5: ( (lv_bindings_15_0= ruleModelBinding ) )
                    	    // InternalItems.g:307:6: (lv_bindings_15_0= ruleModelBinding )
                    	    {
                    	    // InternalItems.g:307:6: (lv_bindings_15_0= ruleModelBinding )
                    	    // InternalItems.g:308:7: lv_bindings_15_0= ruleModelBinding
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelItemAccess().getBindingsModelBindingParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_bindings_15_0=ruleModelBinding();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelItemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"bindings",
                    	    								lv_bindings_15_0,
                    	    								"org.xtext.example.items.Items.ModelBinding");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getModelItemAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelItem"


    // $ANTLR start "entryRuleModelGroupItem"
    // InternalItems.g:335:1: entryRuleModelGroupItem returns [EObject current=null] : iv_ruleModelGroupItem= ruleModelGroupItem EOF ;
    public final EObject entryRuleModelGroupItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelGroupItem = null;


        try {
            // InternalItems.g:335:55: (iv_ruleModelGroupItem= ruleModelGroupItem EOF )
            // InternalItems.g:336:2: iv_ruleModelGroupItem= ruleModelGroupItem EOF
            {
             newCompositeNode(grammarAccess.getModelGroupItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelGroupItem=ruleModelGroupItem();

            state._fsp--;

             current =iv_ruleModelGroupItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelGroupItem"


    // $ANTLR start "ruleModelGroupItem"
    // InternalItems.g:342:1: ruleModelGroupItem returns [EObject current=null] : ( () otherlv_1= 'Group' (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )? ) ;
    public final EObject ruleModelGroupItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_args_7_1=null;
        Token lv_args_7_2=null;
        Token otherlv_8=null;
        Token lv_args_9_1=null;
        Token lv_args_9_2=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        Enumerator lv_function_5_0 = null;



        	enterRule();

        try {
            // InternalItems.g:348:2: ( ( () otherlv_1= 'Group' (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )? ) )
            // InternalItems.g:349:2: ( () otherlv_1= 'Group' (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )? )
            {
            // InternalItems.g:349:2: ( () otherlv_1= 'Group' (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )? )
            // InternalItems.g:350:3: () otherlv_1= 'Group' (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )?
            {
            // InternalItems.g:350:3: ()
            // InternalItems.g:351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelGroupItemAccess().getModelGroupItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getModelGroupItemAccess().getGroupKeyword_1());
            		
            // InternalItems.g:361:3: (otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalItems.g:362:4: otherlv_2= ':' ( (lv_type_3_0= ruleModelItemType ) ) (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )?
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelGroupItemAccess().getColonKeyword_2_0());
                    			
                    // InternalItems.g:366:4: ( (lv_type_3_0= ruleModelItemType ) )
                    // InternalItems.g:367:5: (lv_type_3_0= ruleModelItemType )
                    {
                    // InternalItems.g:367:5: (lv_type_3_0= ruleModelItemType )
                    // InternalItems.g:368:6: lv_type_3_0= ruleModelItemType
                    {

                    						newCompositeNode(grammarAccess.getModelGroupItemAccess().getTypeModelItemTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_3_0=ruleModelItemType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelGroupItemRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.xtext.example.items.Items.ModelItemType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalItems.g:385:4: (otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==19) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalItems.g:386:5: otherlv_4= ':' ( (lv_function_5_0= ruleModelGroupFunction ) ) (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )?
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_15); 

                            					newLeafNode(otherlv_4, grammarAccess.getModelGroupItemAccess().getColonKeyword_2_2_0());
                            				
                            // InternalItems.g:390:5: ( (lv_function_5_0= ruleModelGroupFunction ) )
                            // InternalItems.g:391:6: (lv_function_5_0= ruleModelGroupFunction )
                            {
                            // InternalItems.g:391:6: (lv_function_5_0= ruleModelGroupFunction )
                            // InternalItems.g:392:7: lv_function_5_0= ruleModelGroupFunction
                            {

                            							newCompositeNode(grammarAccess.getModelGroupItemAccess().getFunctionModelGroupFunctionEnumRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_function_5_0=ruleModelGroupFunction();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getModelGroupItemRule());
                            							}
                            							set(
                            								current,
                            								"function",
                            								lv_function_5_0,
                            								"org.xtext.example.items.Items.ModelGroupFunction");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalItems.g:409:5: (otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')' )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==13) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalItems.g:410:6: otherlv_6= '(' ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) ) (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )* otherlv_10= ')'
                                    {
                                    otherlv_6=(Token)match(input,13,FOLLOW_7); 

                                    						newLeafNode(otherlv_6, grammarAccess.getModelGroupItemAccess().getLeftParenthesisKeyword_2_2_2_0());
                                    					
                                    // InternalItems.g:414:6: ( ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) ) )
                                    // InternalItems.g:415:7: ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) )
                                    {
                                    // InternalItems.g:415:7: ( (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING ) )
                                    // InternalItems.g:416:8: (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING )
                                    {
                                    // InternalItems.g:416:8: (lv_args_7_1= RULE_ID | lv_args_7_2= RULE_STRING )
                                    int alt10=2;
                                    int LA10_0 = input.LA(1);

                                    if ( (LA10_0==RULE_ID) ) {
                                        alt10=1;
                                    }
                                    else if ( (LA10_0==RULE_STRING) ) {
                                        alt10=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 10, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt10) {
                                        case 1 :
                                            // InternalItems.g:417:9: lv_args_7_1= RULE_ID
                                            {
                                            lv_args_7_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                                            									newLeafNode(lv_args_7_1, grammarAccess.getModelGroupItemAccess().getArgsIDTerminalRuleCall_2_2_2_1_0_0());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getModelGroupItemRule());
                                            									}
                                            									addWithLastConsumed(
                                            										current,
                                            										"args",
                                            										lv_args_7_1,
                                            										"org.eclipse.xtext.common.Terminals.ID");
                                            								

                                            }
                                            break;
                                        case 2 :
                                            // InternalItems.g:432:9: lv_args_7_2= RULE_STRING
                                            {
                                            lv_args_7_2=(Token)match(input,RULE_STRING,FOLLOW_10); 

                                            									newLeafNode(lv_args_7_2, grammarAccess.getModelGroupItemAccess().getArgsSTRINGTerminalRuleCall_2_2_2_1_0_1());
                                            								

                                            									if (current==null) {
                                            										current = createModelElement(grammarAccess.getModelGroupItemRule());
                                            									}
                                            									addWithLastConsumed(
                                            										current,
                                            										"args",
                                            										lv_args_7_2,
                                            										"org.eclipse.xtext.common.Terminals.STRING");
                                            								

                                            }
                                            break;

                                    }


                                    }


                                    }

                                    // InternalItems.g:449:6: (otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) ) )*
                                    loop12:
                                    do {
                                        int alt12=2;
                                        int LA12_0 = input.LA(1);

                                        if ( (LA12_0==14) ) {
                                            alt12=1;
                                        }


                                        switch (alt12) {
                                    	case 1 :
                                    	    // InternalItems.g:450:7: otherlv_8= ',' ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) )
                                    	    {
                                    	    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                                    	    							newLeafNode(otherlv_8, grammarAccess.getModelGroupItemAccess().getCommaKeyword_2_2_2_2_0());
                                    	    						
                                    	    // InternalItems.g:454:7: ( ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) ) )
                                    	    // InternalItems.g:455:8: ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) )
                                    	    {
                                    	    // InternalItems.g:455:8: ( (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING ) )
                                    	    // InternalItems.g:456:9: (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING )
                                    	    {
                                    	    // InternalItems.g:456:9: (lv_args_9_1= RULE_ID | lv_args_9_2= RULE_STRING )
                                    	    int alt11=2;
                                    	    int LA11_0 = input.LA(1);

                                    	    if ( (LA11_0==RULE_ID) ) {
                                    	        alt11=1;
                                    	    }
                                    	    else if ( (LA11_0==RULE_STRING) ) {
                                    	        alt11=2;
                                    	    }
                                    	    else {
                                    	        NoViableAltException nvae =
                                    	            new NoViableAltException("", 11, 0, input);

                                    	        throw nvae;
                                    	    }
                                    	    switch (alt11) {
                                    	        case 1 :
                                    	            // InternalItems.g:457:10: lv_args_9_1= RULE_ID
                                    	            {
                                    	            lv_args_9_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                                    	            										newLeafNode(lv_args_9_1, grammarAccess.getModelGroupItemAccess().getArgsIDTerminalRuleCall_2_2_2_2_1_0_0());
                                    	            									

                                    	            										if (current==null) {
                                    	            											current = createModelElement(grammarAccess.getModelGroupItemRule());
                                    	            										}
                                    	            										addWithLastConsumed(
                                    	            											current,
                                    	            											"args",
                                    	            											lv_args_9_1,
                                    	            											"org.eclipse.xtext.common.Terminals.ID");
                                    	            									

                                    	            }
                                    	            break;
                                    	        case 2 :
                                    	            // InternalItems.g:472:10: lv_args_9_2= RULE_STRING
                                    	            {
                                    	            lv_args_9_2=(Token)match(input,RULE_STRING,FOLLOW_10); 

                                    	            										newLeafNode(lv_args_9_2, grammarAccess.getModelGroupItemAccess().getArgsSTRINGTerminalRuleCall_2_2_2_2_1_0_1());
                                    	            									

                                    	            										if (current==null) {
                                    	            											current = createModelElement(grammarAccess.getModelGroupItemRule());
                                    	            										}
                                    	            										addWithLastConsumed(
                                    	            											current,
                                    	            											"args",
                                    	            											lv_args_9_2,
                                    	            											"org.eclipse.xtext.common.Terminals.STRING");
                                    	            									

                                    	            }
                                    	            break;

                                    	    }


                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop12;
                                        }
                                    } while (true);

                                    otherlv_10=(Token)match(input,15,FOLLOW_2); 

                                    						newLeafNode(otherlv_10, grammarAccess.getModelGroupItemAccess().getRightParenthesisKeyword_2_2_2_3());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelGroupItem"


    // $ANTLR start "entryRuleModelNormalItem"
    // InternalItems.g:501:1: entryRuleModelNormalItem returns [EObject current=null] : iv_ruleModelNormalItem= ruleModelNormalItem EOF ;
    public final EObject entryRuleModelNormalItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelNormalItem = null;


        try {
            // InternalItems.g:501:56: (iv_ruleModelNormalItem= ruleModelNormalItem EOF )
            // InternalItems.g:502:2: iv_ruleModelNormalItem= ruleModelNormalItem EOF
            {
             newCompositeNode(grammarAccess.getModelNormalItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelNormalItem=ruleModelNormalItem();

            state._fsp--;

             current =iv_ruleModelNormalItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelNormalItem"


    // $ANTLR start "ruleModelNormalItem"
    // InternalItems.g:508:1: ruleModelNormalItem returns [EObject current=null] : ( (lv_type_0_0= ruleModelItemType ) ) ;
    public final EObject ruleModelNormalItem() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalItems.g:514:2: ( ( (lv_type_0_0= ruleModelItemType ) ) )
            // InternalItems.g:515:2: ( (lv_type_0_0= ruleModelItemType ) )
            {
            // InternalItems.g:515:2: ( (lv_type_0_0= ruleModelItemType ) )
            // InternalItems.g:516:3: (lv_type_0_0= ruleModelItemType )
            {
            // InternalItems.g:516:3: (lv_type_0_0= ruleModelItemType )
            // InternalItems.g:517:4: lv_type_0_0= ruleModelItemType
            {

            				newCompositeNode(grammarAccess.getModelNormalItemAccess().getTypeModelItemTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=ruleModelItemType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelNormalItemRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.xtext.example.items.Items.ModelItemType");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelNormalItem"


    // $ANTLR start "entryRuleModelItemType"
    // InternalItems.g:537:1: entryRuleModelItemType returns [String current=null] : iv_ruleModelItemType= ruleModelItemType EOF ;
    public final String entryRuleModelItemType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModelItemType = null;


        try {
            // InternalItems.g:537:53: (iv_ruleModelItemType= ruleModelItemType EOF )
            // InternalItems.g:538:2: iv_ruleModelItemType= ruleModelItemType EOF
            {
             newCompositeNode(grammarAccess.getModelItemTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelItemType=ruleModelItemType();

            state._fsp--;

             current =iv_ruleModelItemType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelItemType"


    // $ANTLR start "ruleModelItemType"
    // InternalItems.g:544:1: ruleModelItemType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Switch' | kw= 'Rollershutter' | kw= 'Number' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Location' | this_ID_9= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleModelItemType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_9=null;


        	enterRule();

        try {
            // InternalItems.g:550:2: ( (kw= 'Switch' | kw= 'Rollershutter' | kw= 'Number' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Location' | this_ID_9= RULE_ID ) )
            // InternalItems.g:551:2: (kw= 'Switch' | kw= 'Rollershutter' | kw= 'Number' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Location' | this_ID_9= RULE_ID )
            {
            // InternalItems.g:551:2: (kw= 'Switch' | kw= 'Rollershutter' | kw= 'Number' | kw= 'String' | kw= 'Dimmer' | kw= 'Contact' | kw= 'DateTime' | kw= 'Color' | kw= 'Location' | this_ID_9= RULE_ID )
            int alt16=10;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt16=1;
                }
                break;
            case 21:
                {
                alt16=2;
                }
                break;
            case 22:
                {
                alt16=3;
                }
                break;
            case 23:
                {
                alt16=4;
                }
                break;
            case 24:
                {
                alt16=5;
                }
                break;
            case 25:
                {
                alt16=6;
                }
                break;
            case 26:
                {
                alt16=7;
                }
                break;
            case 27:
                {
                alt16=8;
                }
                break;
            case 28:
                {
                alt16=9;
                }
                break;
            case RULE_ID:
                {
                alt16=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalItems.g:552:3: kw= 'Switch'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getSwitchKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalItems.g:558:3: kw= 'Rollershutter'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getRollershutterKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalItems.g:564:3: kw= 'Number'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getNumberKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalItems.g:570:3: kw= 'String'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getStringKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalItems.g:576:3: kw= 'Dimmer'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getDimmerKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalItems.g:582:3: kw= 'Contact'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getContactKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalItems.g:588:3: kw= 'DateTime'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getDateTimeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalItems.g:594:3: kw= 'Color'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getColorKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalItems.g:600:3: kw= 'Location'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModelItemTypeAccess().getLocationKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalItems.g:606:3: this_ID_9= RULE_ID
                    {
                    this_ID_9=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_9);
                    		

                    			newLeafNode(this_ID_9, grammarAccess.getModelItemTypeAccess().getIDTerminalRuleCall_9());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelItemType"


    // $ANTLR start "entryRuleModelBinding"
    // InternalItems.g:617:1: entryRuleModelBinding returns [EObject current=null] : iv_ruleModelBinding= ruleModelBinding EOF ;
    public final EObject entryRuleModelBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelBinding = null;


        try {
            // InternalItems.g:617:53: (iv_ruleModelBinding= ruleModelBinding EOF )
            // InternalItems.g:618:2: iv_ruleModelBinding= ruleModelBinding EOF
            {
             newCompositeNode(grammarAccess.getModelBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelBinding=ruleModelBinding();

            state._fsp--;

             current =iv_ruleModelBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelBinding"


    // $ANTLR start "ruleModelBinding"
    // InternalItems.g:624:1: ruleModelBinding returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_configuration_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleModelBinding() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_configuration_2_0=null;


        	enterRule();

        try {
            // InternalItems.g:630:2: ( ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_configuration_2_0= RULE_STRING ) ) ) )
            // InternalItems.g:631:2: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_configuration_2_0= RULE_STRING ) ) )
            {
            // InternalItems.g:631:2: ( ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_configuration_2_0= RULE_STRING ) ) )
            // InternalItems.g:632:3: ( (lv_type_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_configuration_2_0= RULE_STRING ) )
            {
            // InternalItems.g:632:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalItems.g:633:4: (lv_type_0_0= RULE_ID )
            {
            // InternalItems.g:633:4: (lv_type_0_0= RULE_ID )
            // InternalItems.g:634:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_type_0_0, grammarAccess.getModelBindingAccess().getTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getModelBindingAccess().getEqualsSignKeyword_1());
            		
            // InternalItems.g:654:3: ( (lv_configuration_2_0= RULE_STRING ) )
            // InternalItems.g:655:4: (lv_configuration_2_0= RULE_STRING )
            {
            // InternalItems.g:655:4: (lv_configuration_2_0= RULE_STRING )
            // InternalItems.g:656:5: lv_configuration_2_0= RULE_STRING
            {
            lv_configuration_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_configuration_2_0, grammarAccess.getModelBindingAccess().getConfigurationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"configuration",
            						lv_configuration_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelBinding"


    // $ANTLR start "ruleModelGroupFunction"
    // InternalItems.g:676:1: ruleModelGroupFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NAND' ) | (enumLiteral_3= 'NOR' ) | (enumLiteral_4= 'AVG' ) | (enumLiteral_5= 'SUM' ) | (enumLiteral_6= 'MAX' ) | (enumLiteral_7= 'MIN' ) | (enumLiteral_8= 'COUNT' ) ) ;
    public final Enumerator ruleModelGroupFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalItems.g:682:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NAND' ) | (enumLiteral_3= 'NOR' ) | (enumLiteral_4= 'AVG' ) | (enumLiteral_5= 'SUM' ) | (enumLiteral_6= 'MAX' ) | (enumLiteral_7= 'MIN' ) | (enumLiteral_8= 'COUNT' ) ) )
            // InternalItems.g:683:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NAND' ) | (enumLiteral_3= 'NOR' ) | (enumLiteral_4= 'AVG' ) | (enumLiteral_5= 'SUM' ) | (enumLiteral_6= 'MAX' ) | (enumLiteral_7= 'MIN' ) | (enumLiteral_8= 'COUNT' ) )
            {
            // InternalItems.g:683:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NAND' ) | (enumLiteral_3= 'NOR' ) | (enumLiteral_4= 'AVG' ) | (enumLiteral_5= 'SUM' ) | (enumLiteral_6= 'MAX' ) | (enumLiteral_7= 'MIN' ) | (enumLiteral_8= 'COUNT' ) )
            int alt17=9;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            case 33:
                {
                alt17=4;
                }
                break;
            case 34:
                {
                alt17=5;
                }
                break;
            case 35:
                {
                alt17=6;
                }
                break;
            case 36:
                {
                alt17=7;
                }
                break;
            case 37:
                {
                alt17=8;
                }
                break;
            case 38:
                {
                alt17=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalItems.g:684:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalItems.g:684:3: (enumLiteral_0= 'AND' )
                    // InternalItems.g:685:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModelGroupFunctionAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalItems.g:692:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalItems.g:692:3: (enumLiteral_1= 'OR' )
                    // InternalItems.g:693:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModelGroupFunctionAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalItems.g:700:3: (enumLiteral_2= 'NAND' )
                    {
                    // InternalItems.g:700:3: (enumLiteral_2= 'NAND' )
                    // InternalItems.g:701:4: enumLiteral_2= 'NAND'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getNANDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getModelGroupFunctionAccess().getNANDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalItems.g:708:3: (enumLiteral_3= 'NOR' )
                    {
                    // InternalItems.g:708:3: (enumLiteral_3= 'NOR' )
                    // InternalItems.g:709:4: enumLiteral_3= 'NOR'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getNOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getModelGroupFunctionAccess().getNOREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalItems.g:716:3: (enumLiteral_4= 'AVG' )
                    {
                    // InternalItems.g:716:3: (enumLiteral_4= 'AVG' )
                    // InternalItems.g:717:4: enumLiteral_4= 'AVG'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getAVGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getModelGroupFunctionAccess().getAVGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalItems.g:724:3: (enumLiteral_5= 'SUM' )
                    {
                    // InternalItems.g:724:3: (enumLiteral_5= 'SUM' )
                    // InternalItems.g:725:4: enumLiteral_5= 'SUM'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getSUMEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getModelGroupFunctionAccess().getSUMEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalItems.g:732:3: (enumLiteral_6= 'MAX' )
                    {
                    // InternalItems.g:732:3: (enumLiteral_6= 'MAX' )
                    // InternalItems.g:733:4: enumLiteral_6= 'MAX'
                    {
                    enumLiteral_6=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getMAXEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getModelGroupFunctionAccess().getMAXEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalItems.g:740:3: (enumLiteral_7= 'MIN' )
                    {
                    // InternalItems.g:740:3: (enumLiteral_7= 'MIN' )
                    // InternalItems.g:741:4: enumLiteral_7= 'MIN'
                    {
                    enumLiteral_7=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getMINEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getModelGroupFunctionAccess().getMINEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalItems.g:748:3: (enumLiteral_8= 'COUNT' )
                    {
                    // InternalItems.g:748:3: (enumLiteral_8= 'COUNT' )
                    // InternalItems.g:749:4: enumLiteral_8= 'COUNT'
                    {
                    enumLiteral_8=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getModelGroupFunctionAccess().getCOUNTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getModelGroupFunctionAccess().getCOUNTEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelGroupFunction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000001FF40012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012822L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001FF00010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000007FC0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});

}