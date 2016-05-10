package org.xtext.example.sitemap.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.sitemap.services.SitemapGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSitemapParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sitemap'", "'label='", "'icon='", "'{'", "'}'", "'Frame'", "'item='", "'labelcolor=['", "','", "']'", "'valuecolor=['", "'visibility=['", "'Text'", "'Group'", "'Image'", "'url='", "'refresh='", "'iconcolor=['", "'Video'", "'encoding='", "'Chart'", "'service='", "'period='", "'Webview'", "'height='", "'Mapview'", "'Switch'", "'mappings=['", "'Slider'", "'sendFrequency='", "'switchSupport'", "'Selection'", "'List'", "'separator='", "'Setpoint'", "'minValue='", "'maxValue='", "'step='", "'Colorpicker'", "'='", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'-'", "'+'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSitemapParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSitemapParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSitemapParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSitemap.g"; }



     	private SitemapGrammarAccess grammarAccess;

        public InternalSitemapParser(TokenStream input, SitemapGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SitemapModel";
       	}

       	@Override
       	protected SitemapGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSitemapModel"
    // InternalSitemap.g:64:1: entryRuleSitemapModel returns [EObject current=null] : iv_ruleSitemapModel= ruleSitemapModel EOF ;
    public final EObject entryRuleSitemapModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitemapModel = null;


        try {
            // InternalSitemap.g:64:53: (iv_ruleSitemapModel= ruleSitemapModel EOF )
            // InternalSitemap.g:65:2: iv_ruleSitemapModel= ruleSitemapModel EOF
            {
             newCompositeNode(grammarAccess.getSitemapModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSitemapModel=ruleSitemapModel();

            state._fsp--;

             current =iv_ruleSitemapModel; 
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
    // $ANTLR end "entryRuleSitemapModel"


    // $ANTLR start "ruleSitemapModel"
    // InternalSitemap.g:71:1: ruleSitemapModel returns [EObject current=null] : (otherlv_0= 'sitemap' this_Sitemap_1= ruleSitemap ) ;
    public final EObject ruleSitemapModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Sitemap_1 = null;



        	enterRule();

        try {
            // InternalSitemap.g:77:2: ( (otherlv_0= 'sitemap' this_Sitemap_1= ruleSitemap ) )
            // InternalSitemap.g:78:2: (otherlv_0= 'sitemap' this_Sitemap_1= ruleSitemap )
            {
            // InternalSitemap.g:78:2: (otherlv_0= 'sitemap' this_Sitemap_1= ruleSitemap )
            // InternalSitemap.g:79:3: otherlv_0= 'sitemap' this_Sitemap_1= ruleSitemap
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSitemapModelAccess().getSitemapKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSitemapModelAccess().getSitemapParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Sitemap_1=ruleSitemap();

            state._fsp--;


            			current = this_Sitemap_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleSitemapModel"


    // $ANTLR start "entryRuleSitemap"
    // InternalSitemap.g:95:1: entryRuleSitemap returns [EObject current=null] : iv_ruleSitemap= ruleSitemap EOF ;
    public final EObject entryRuleSitemap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSitemap = null;


        try {
            // InternalSitemap.g:95:48: (iv_ruleSitemap= ruleSitemap EOF )
            // InternalSitemap.g:96:2: iv_ruleSitemap= ruleSitemap EOF
            {
             newCompositeNode(grammarAccess.getSitemapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSitemap=ruleSitemap();

            state._fsp--;

             current =iv_ruleSitemap; 
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
    // $ANTLR end "entryRuleSitemap"


    // $ANTLR start "ruleSitemap"
    // InternalSitemap.g:102:1: ruleSitemap returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'label=' ( (lv_label_2_0= RULE_STRING ) ) )? (otherlv_3= 'icon=' ( (lv_icon_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_children_6_0= ruleWidget ) )+ otherlv_7= '}' ) ;
    public final EObject ruleSitemap() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token lv_icon_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_children_6_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:108:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'label=' ( (lv_label_2_0= RULE_STRING ) ) )? (otherlv_3= 'icon=' ( (lv_icon_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_children_6_0= ruleWidget ) )+ otherlv_7= '}' ) )
            // InternalSitemap.g:109:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'label=' ( (lv_label_2_0= RULE_STRING ) ) )? (otherlv_3= 'icon=' ( (lv_icon_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_children_6_0= ruleWidget ) )+ otherlv_7= '}' )
            {
            // InternalSitemap.g:109:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'label=' ( (lv_label_2_0= RULE_STRING ) ) )? (otherlv_3= 'icon=' ( (lv_icon_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_children_6_0= ruleWidget ) )+ otherlv_7= '}' )
            // InternalSitemap.g:110:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'label=' ( (lv_label_2_0= RULE_STRING ) ) )? (otherlv_3= 'icon=' ( (lv_icon_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_children_6_0= ruleWidget ) )+ otherlv_7= '}'
            {
            // InternalSitemap.g:110:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSitemap.g:111:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSitemap.g:111:4: (lv_name_0_0= RULE_ID )
            // InternalSitemap.g:112:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSitemapAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSitemapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.sitemap.Sitemap.ID");
            				

            }


            }

            // InternalSitemap.g:128:3: (otherlv_1= 'label=' ( (lv_label_2_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSitemap.g:129:4: otherlv_1= 'label=' ( (lv_label_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSitemapAccess().getLabelKeyword_1_0());
                    			
                    // InternalSitemap.g:133:4: ( (lv_label_2_0= RULE_STRING ) )
                    // InternalSitemap.g:134:5: (lv_label_2_0= RULE_STRING )
                    {
                    // InternalSitemap.g:134:5: (lv_label_2_0= RULE_STRING )
                    // InternalSitemap.g:135:6: lv_label_2_0= RULE_STRING
                    {
                    lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_label_2_0, grammarAccess.getSitemapAccess().getLabelSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSitemapRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSitemap.g:152:3: (otherlv_3= 'icon=' ( (lv_icon_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSitemap.g:153:4: otherlv_3= 'icon=' ( (lv_icon_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSitemapAccess().getIconKeyword_2_0());
                    			
                    // InternalSitemap.g:157:4: ( (lv_icon_4_0= RULE_STRING ) )
                    // InternalSitemap.g:158:5: (lv_icon_4_0= RULE_STRING )
                    {
                    // InternalSitemap.g:158:5: (lv_icon_4_0= RULE_STRING )
                    // InternalSitemap.g:159:6: lv_icon_4_0= RULE_STRING
                    {
                    lv_icon_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_icon_4_0, grammarAccess.getSitemapAccess().getIconSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSitemapRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"icon",
                    							lv_icon_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getSitemapAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSitemap.g:180:3: ( (lv_children_6_0= ruleWidget ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||(LA3_0>=24 && LA3_0<=26)||LA3_0==30||LA3_0==32||LA3_0==35||(LA3_0>=37 && LA3_0<=38)||LA3_0==40||(LA3_0>=43 && LA3_0<=44)||LA3_0==46||LA3_0==50) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSitemap.g:181:4: (lv_children_6_0= ruleWidget )
            	    {
            	    // InternalSitemap.g:181:4: (lv_children_6_0= ruleWidget )
            	    // InternalSitemap.g:182:5: lv_children_6_0= ruleWidget
            	    {

            	    					newCompositeNode(grammarAccess.getSitemapAccess().getChildrenWidgetParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_children_6_0=ruleWidget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSitemapRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_6_0,
            	    						"org.xtext.example.sitemap.Sitemap.Widget");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSitemapAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSitemap"


    // $ANTLR start "entryRuleWidget"
    // InternalSitemap.g:207:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalSitemap.g:207:47: (iv_ruleWidget= ruleWidget EOF )
            // InternalSitemap.g:208:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalSitemap.g:214:1: ruleWidget returns [EObject current=null] : (this_LinkableWidget_0= ruleLinkableWidget | this_NonLinkableWidget_1= ruleNonLinkableWidget ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        EObject this_LinkableWidget_0 = null;

        EObject this_NonLinkableWidget_1 = null;



        	enterRule();

        try {
            // InternalSitemap.g:220:2: ( (this_LinkableWidget_0= ruleLinkableWidget | this_NonLinkableWidget_1= ruleNonLinkableWidget ) )
            // InternalSitemap.g:221:2: (this_LinkableWidget_0= ruleLinkableWidget | this_NonLinkableWidget_1= ruleNonLinkableWidget )
            {
            // InternalSitemap.g:221:2: (this_LinkableWidget_0= ruleLinkableWidget | this_NonLinkableWidget_1= ruleNonLinkableWidget )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17||(LA4_0>=24 && LA4_0<=26)) ) {
                alt4=1;
            }
            else if ( (LA4_0==30||LA4_0==32||LA4_0==35||(LA4_0>=37 && LA4_0<=38)||LA4_0==40||(LA4_0>=43 && LA4_0<=44)||LA4_0==46||LA4_0==50) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSitemap.g:222:3: this_LinkableWidget_0= ruleLinkableWidget
                    {

                    			newCompositeNode(grammarAccess.getWidgetAccess().getLinkableWidgetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LinkableWidget_0=ruleLinkableWidget();

                    state._fsp--;


                    			current = this_LinkableWidget_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSitemap.g:231:3: this_NonLinkableWidget_1= ruleNonLinkableWidget
                    {

                    			newCompositeNode(grammarAccess.getWidgetAccess().getNonLinkableWidgetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonLinkableWidget_1=ruleNonLinkableWidget();

                    state._fsp--;


                    			current = this_NonLinkableWidget_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleNonLinkableWidget"
    // InternalSitemap.g:243:1: entryRuleNonLinkableWidget returns [EObject current=null] : iv_ruleNonLinkableWidget= ruleNonLinkableWidget EOF ;
    public final EObject entryRuleNonLinkableWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonLinkableWidget = null;


        try {
            // InternalSitemap.g:243:58: (iv_ruleNonLinkableWidget= ruleNonLinkableWidget EOF )
            // InternalSitemap.g:244:2: iv_ruleNonLinkableWidget= ruleNonLinkableWidget EOF
            {
             newCompositeNode(grammarAccess.getNonLinkableWidgetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonLinkableWidget=ruleNonLinkableWidget();

            state._fsp--;

             current =iv_ruleNonLinkableWidget; 
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
    // $ANTLR end "entryRuleNonLinkableWidget"


    // $ANTLR start "ruleNonLinkableWidget"
    // InternalSitemap.g:250:1: ruleNonLinkableWidget returns [EObject current=null] : (this_Switch_0= ruleSwitch | this_Selection_1= ruleSelection | this_Slider_2= ruleSlider | this_List_3= ruleList | this_Setpoint_4= ruleSetpoint | this_Video_5= ruleVideo | this_Chart_6= ruleChart | this_Webview_7= ruleWebview | this_Colorpicker_8= ruleColorpicker | this_Mapview_9= ruleMapview ) ;
    public final EObject ruleNonLinkableWidget() throws RecognitionException {
        EObject current = null;

        EObject this_Switch_0 = null;

        EObject this_Selection_1 = null;

        EObject this_Slider_2 = null;

        EObject this_List_3 = null;

        EObject this_Setpoint_4 = null;

        EObject this_Video_5 = null;

        EObject this_Chart_6 = null;

        EObject this_Webview_7 = null;

        EObject this_Colorpicker_8 = null;

        EObject this_Mapview_9 = null;



        	enterRule();

        try {
            // InternalSitemap.g:256:2: ( (this_Switch_0= ruleSwitch | this_Selection_1= ruleSelection | this_Slider_2= ruleSlider | this_List_3= ruleList | this_Setpoint_4= ruleSetpoint | this_Video_5= ruleVideo | this_Chart_6= ruleChart | this_Webview_7= ruleWebview | this_Colorpicker_8= ruleColorpicker | this_Mapview_9= ruleMapview ) )
            // InternalSitemap.g:257:2: (this_Switch_0= ruleSwitch | this_Selection_1= ruleSelection | this_Slider_2= ruleSlider | this_List_3= ruleList | this_Setpoint_4= ruleSetpoint | this_Video_5= ruleVideo | this_Chart_6= ruleChart | this_Webview_7= ruleWebview | this_Colorpicker_8= ruleColorpicker | this_Mapview_9= ruleMapview )
            {
            // InternalSitemap.g:257:2: (this_Switch_0= ruleSwitch | this_Selection_1= ruleSelection | this_Slider_2= ruleSlider | this_List_3= ruleList | this_Setpoint_4= ruleSetpoint | this_Video_5= ruleVideo | this_Chart_6= ruleChart | this_Webview_7= ruleWebview | this_Colorpicker_8= ruleColorpicker | this_Mapview_9= ruleMapview )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt5=1;
                }
                break;
            case 43:
                {
                alt5=2;
                }
                break;
            case 40:
                {
                alt5=3;
                }
                break;
            case 44:
                {
                alt5=4;
                }
                break;
            case 46:
                {
                alt5=5;
                }
                break;
            case 30:
                {
                alt5=6;
                }
                break;
            case 32:
                {
                alt5=7;
                }
                break;
            case 35:
                {
                alt5=8;
                }
                break;
            case 50:
                {
                alt5=9;
                }
                break;
            case 37:
                {
                alt5=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSitemap.g:258:3: this_Switch_0= ruleSwitch
                    {

                    			newCompositeNode(grammarAccess.getNonLinkableWidgetAccess().getSwitchParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Switch_0=ruleSwitch();

                    state._fsp--;


                    			current = this_Switch_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSitemap.g:267:3: this_Selection_1= ruleSelection
                    {

                    			newCompositeNode(grammarAccess.getNonLinkableWidgetAccess().getSelectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Selection_1=ruleSelection();

                    state._fsp--;


                    			current = this_Selection_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSitemap.g:276:3: this_Slider_2= ruleSlider
                    {

                    			newCompositeNode(grammarAccess.getNonLinkableWidgetAccess().getSliderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Slider_2=ruleSlider();

                    state._fsp--;


                    			current = this_Slider_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSitemap.g:285:3: this_List_3= ruleList
                    {

                    			newCompositeNode(grammarAccess.getNonLinkableWidgetAccess().getListParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_3=ruleList();

                    state._fsp--;


                    			current = this_List_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSitemap.g:294:3: this_Setpoint_4= ruleSetpoint
                    {

                    			newCompositeNode(grammarAccess.getNonLinkableWidgetAccess().getSetpointParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Setpoint_4=ruleSetpoint();

                    state._fsp--;


                    			current = this_Setpoint_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSitemap.g:303:3: this_Video_5= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getNonLinkableWidgetAccess().getVideoParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_5=ruleVideo();

                    state._fsp--;


                    			current = this_Video_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSitemap.g:312:3: this_Chart_6= ruleChart
                    {

                    			newCompositeNode(grammarAccess.getNonLinkableWidgetAccess().getChartParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Chart_6=ruleChart();

                    state._fsp--;


                    			current = this_Chart_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSitemap.g:321:3: this_Webview_7= ruleWebview
                    {

                    			newCompositeNode(grammarAccess.getNonLinkableWidgetAccess().getWebviewParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Webview_7=ruleWebview();

                    state._fsp--;


                    			current = this_Webview_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSitemap.g:330:3: this_Colorpicker_8= ruleColorpicker
                    {

                    			newCompositeNode(grammarAccess.getNonLinkableWidgetAccess().getColorpickerParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Colorpicker_8=ruleColorpicker();

                    state._fsp--;


                    			current = this_Colorpicker_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSitemap.g:339:3: this_Mapview_9= ruleMapview
                    {

                    			newCompositeNode(grammarAccess.getNonLinkableWidgetAccess().getMapviewParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mapview_9=ruleMapview();

                    state._fsp--;


                    			current = this_Mapview_9;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleNonLinkableWidget"


    // $ANTLR start "entryRuleLinkableWidget"
    // InternalSitemap.g:351:1: entryRuleLinkableWidget returns [EObject current=null] : iv_ruleLinkableWidget= ruleLinkableWidget EOF ;
    public final EObject entryRuleLinkableWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkableWidget = null;


        try {
            // InternalSitemap.g:351:55: (iv_ruleLinkableWidget= ruleLinkableWidget EOF )
            // InternalSitemap.g:352:2: iv_ruleLinkableWidget= ruleLinkableWidget EOF
            {
             newCompositeNode(grammarAccess.getLinkableWidgetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkableWidget=ruleLinkableWidget();

            state._fsp--;

             current =iv_ruleLinkableWidget; 
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
    // $ANTLR end "entryRuleLinkableWidget"


    // $ANTLR start "ruleLinkableWidget"
    // InternalSitemap.g:358:1: ruleLinkableWidget returns [EObject current=null] : ( (this_Text_0= ruleText | this_Group_1= ruleGroup | this_Image_2= ruleImage | this_Frame_3= ruleFrame ) (otherlv_4= '{' ( (lv_children_5_0= ruleWidget ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleLinkableWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Text_0 = null;

        EObject this_Group_1 = null;

        EObject this_Image_2 = null;

        EObject this_Frame_3 = null;

        EObject lv_children_5_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:364:2: ( ( (this_Text_0= ruleText | this_Group_1= ruleGroup | this_Image_2= ruleImage | this_Frame_3= ruleFrame ) (otherlv_4= '{' ( (lv_children_5_0= ruleWidget ) )+ otherlv_6= '}' )? ) )
            // InternalSitemap.g:365:2: ( (this_Text_0= ruleText | this_Group_1= ruleGroup | this_Image_2= ruleImage | this_Frame_3= ruleFrame ) (otherlv_4= '{' ( (lv_children_5_0= ruleWidget ) )+ otherlv_6= '}' )? )
            {
            // InternalSitemap.g:365:2: ( (this_Text_0= ruleText | this_Group_1= ruleGroup | this_Image_2= ruleImage | this_Frame_3= ruleFrame ) (otherlv_4= '{' ( (lv_children_5_0= ruleWidget ) )+ otherlv_6= '}' )? )
            // InternalSitemap.g:366:3: (this_Text_0= ruleText | this_Group_1= ruleGroup | this_Image_2= ruleImage | this_Frame_3= ruleFrame ) (otherlv_4= '{' ( (lv_children_5_0= ruleWidget ) )+ otherlv_6= '}' )?
            {
            // InternalSitemap.g:366:3: (this_Text_0= ruleText | this_Group_1= ruleGroup | this_Image_2= ruleImage | this_Frame_3= ruleFrame )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSitemap.g:367:4: this_Text_0= ruleText
                    {

                    				newCompositeNode(grammarAccess.getLinkableWidgetAccess().getTextParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_Text_0=ruleText();

                    state._fsp--;


                    				current = this_Text_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSitemap.g:376:4: this_Group_1= ruleGroup
                    {

                    				newCompositeNode(grammarAccess.getLinkableWidgetAccess().getGroupParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Group_1=ruleGroup();

                    state._fsp--;


                    				current = this_Group_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalSitemap.g:385:4: this_Image_2= ruleImage
                    {

                    				newCompositeNode(grammarAccess.getLinkableWidgetAccess().getImageParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_10);
                    this_Image_2=ruleImage();

                    state._fsp--;


                    				current = this_Image_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalSitemap.g:394:4: this_Frame_3= ruleFrame
                    {

                    				newCompositeNode(grammarAccess.getLinkableWidgetAccess().getFrameParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_10);
                    this_Frame_3=ruleFrame();

                    state._fsp--;


                    				current = this_Frame_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalSitemap.g:403:3: (otherlv_4= '{' ( (lv_children_5_0= ruleWidget ) )+ otherlv_6= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSitemap.g:404:4: otherlv_4= '{' ( (lv_children_5_0= ruleWidget ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkableWidgetAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalSitemap.g:408:4: ( (lv_children_5_0= ruleWidget ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17||(LA7_0>=24 && LA7_0<=26)||LA7_0==30||LA7_0==32||LA7_0==35||(LA7_0>=37 && LA7_0<=38)||LA7_0==40||(LA7_0>=43 && LA7_0<=44)||LA7_0==46||LA7_0==50) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSitemap.g:409:5: (lv_children_5_0= ruleWidget )
                    	    {
                    	    // InternalSitemap.g:409:5: (lv_children_5_0= ruleWidget )
                    	    // InternalSitemap.g:410:6: lv_children_5_0= ruleWidget
                    	    {

                    	    						newCompositeNode(grammarAccess.getLinkableWidgetAccess().getChildrenWidgetParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_children_5_0=ruleWidget();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLinkableWidgetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"children",
                    	    							lv_children_5_0,
                    	    							"org.xtext.example.sitemap.Sitemap.Widget");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkableWidgetAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleLinkableWidget"


    // $ANTLR start "entryRuleFrame"
    // InternalSitemap.g:436:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // InternalSitemap.g:436:46: (iv_ruleFrame= ruleFrame EOF )
            // InternalSitemap.g:437:2: iv_ruleFrame= ruleFrame EOF
            {
             newCompositeNode(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrame=ruleFrame();

            state._fsp--;

             current =iv_ruleFrame; 
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
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalSitemap.g:443:1: ruleFrame returns [EObject current=null] : ( () otherlv_1= 'Frame' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_label_6_1=null;
        Token lv_label_6_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_item_4_0 = null;

        AntlrDatatypeRuleToken lv_icon_8_0 = null;

        EObject lv_LabelColor_10_0 = null;

        EObject lv_LabelColor_12_0 = null;

        EObject lv_ValueColor_15_0 = null;

        EObject lv_ValueColor_17_0 = null;

        EObject lv_Visibility_20_0 = null;

        EObject lv_Visibility_22_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:449:2: ( ( () otherlv_1= 'Frame' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) ) ) )
            // InternalSitemap.g:450:2: ( () otherlv_1= 'Frame' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) ) )
            {
            // InternalSitemap.g:450:2: ( () otherlv_1= 'Frame' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) ) )
            // InternalSitemap.g:451:3: () otherlv_1= 'Frame' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) )
            {
            // InternalSitemap.g:451:3: ()
            // InternalSitemap.g:452:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFrameAccess().getFrameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFrameAccess().getFrameKeyword_1());
            		
            // InternalSitemap.g:462:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) )
            // InternalSitemap.g:463:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) )
            {
            // InternalSitemap.g:463:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) )
            // InternalSitemap.g:464:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFrameAccess().getUnorderedGroup_2());
            				
            // InternalSitemap.g:467:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* )
            // InternalSitemap.g:468:6: ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )*
            {
            // InternalSitemap.g:468:6: ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )*
            loop13:
            do {
                int alt13=7;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 4) ) {
                    alt13=5;
                }
                else if ( LA13_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 5) ) {
                    alt13=6;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSitemap.g:469:4: ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:469:4: ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:470:5: {...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalSitemap.g:470:102: ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:471:6: ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalSitemap.g:474:9: ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:474:10: {...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalSitemap.g:474:19: (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:474:20: otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getFrameAccess().getItemKeyword_2_0_0());
            	    								
            	    // InternalSitemap.g:478:9: ( (lv_item_4_0= ruleItemRef ) )
            	    // InternalSitemap.g:479:10: (lv_item_4_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:479:10: (lv_item_4_0= ruleItemRef )
            	    // InternalSitemap.g:480:11: lv_item_4_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getFrameAccess().getItemItemRefParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_item_4_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getFrameRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_4_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:503:4: ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:503:4: ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:504:5: {...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalSitemap.g:504:102: ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:505:6: ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalSitemap.g:508:9: ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:508:10: {...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalSitemap.g:508:19: (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:508:20: otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_5, grammarAccess.getFrameAccess().getLabelKeyword_2_1_0());
            	    								
            	    // InternalSitemap.g:512:9: ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:513:10: ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:513:10: ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) )
            	    // InternalSitemap.g:514:11: (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:514:11: (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==RULE_STRING) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalSitemap.g:515:12: lv_label_6_1= RULE_ID
            	            {
            	            lv_label_6_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            	            												newLeafNode(lv_label_6_1, grammarAccess.getFrameAccess().getLabelIDTerminalRuleCall_2_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getFrameRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_6_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:530:12: lv_label_6_2= RULE_STRING
            	            {
            	            lv_label_6_2=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	            												newLeafNode(lv_label_6_2, grammarAccess.getFrameAccess().getLabelSTRINGTerminalRuleCall_2_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getFrameRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_6_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:553:4: ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:553:4: ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:554:5: {...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalSitemap.g:554:102: ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:555:6: ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalSitemap.g:558:9: ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:558:10: {...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalSitemap.g:558:19: (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) )
            	    // InternalSitemap.g:558:20: otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFrameAccess().getIconKeyword_2_2_0());
            	    								
            	    // InternalSitemap.g:562:9: ( (lv_icon_8_0= ruleIcon ) )
            	    // InternalSitemap.g:563:10: (lv_icon_8_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:563:10: (lv_icon_8_0= ruleIcon )
            	    // InternalSitemap.g:564:11: lv_icon_8_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getFrameAccess().getIconIconParserRuleCall_2_2_1_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_icon_8_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getFrameRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_8_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:587:4: ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:587:4: ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) )
            	    // InternalSitemap.g:588:5: {...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalSitemap.g:588:102: ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) )
            	    // InternalSitemap.g:589:6: ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalSitemap.g:592:9: ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) )
            	    // InternalSitemap.g:592:10: {...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalSitemap.g:592:19: (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) )
            	    // InternalSitemap.g:592:20: otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' )
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getFrameAccess().getLabelcolorKeyword_2_3_0());
            	    								
            	    // InternalSitemap.g:596:9: ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' )
            	    // InternalSitemap.g:597:10: ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']'
            	    {
            	    // InternalSitemap.g:597:10: ( (lv_LabelColor_10_0= ruleColorArray ) )
            	    // InternalSitemap.g:598:11: (lv_LabelColor_10_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:598:11: (lv_LabelColor_10_0= ruleColorArray )
            	    // InternalSitemap.g:599:12: lv_LabelColor_10_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getFrameAccess().getLabelColorColorArrayParserRuleCall_2_3_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_10_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getFrameRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_10_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:616:10: (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==20) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalSitemap.g:617:11: otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_11, grammarAccess.getFrameAccess().getCommaKeyword_2_3_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:621:11: ( (lv_LabelColor_12_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:622:12: (lv_LabelColor_12_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:622:12: (lv_LabelColor_12_0= ruleColorArray )
            	    	    // InternalSitemap.g:623:13: lv_LabelColor_12_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getFrameAccess().getLabelColorColorArrayParserRuleCall_2_3_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_12_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getFrameRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_12_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    otherlv_13=(Token)match(input,21,FOLLOW_11); 

            	    										newLeafNode(otherlv_13, grammarAccess.getFrameAccess().getRightSquareBracketKeyword_2_3_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:652:4: ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:652:4: ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) )
            	    // InternalSitemap.g:653:5: {...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalSitemap.g:653:102: ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) )
            	    // InternalSitemap.g:654:6: ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalSitemap.g:657:9: ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) )
            	    // InternalSitemap.g:657:10: {...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalSitemap.g:657:19: (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) )
            	    // InternalSitemap.g:657:20: otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' )
            	    {
            	    otherlv_14=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getFrameAccess().getValuecolorKeyword_2_4_0());
            	    								
            	    // InternalSitemap.g:661:9: ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' )
            	    // InternalSitemap.g:662:10: ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']'
            	    {
            	    // InternalSitemap.g:662:10: ( (lv_ValueColor_15_0= ruleColorArray ) )
            	    // InternalSitemap.g:663:11: (lv_ValueColor_15_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:663:11: (lv_ValueColor_15_0= ruleColorArray )
            	    // InternalSitemap.g:664:12: lv_ValueColor_15_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getFrameAccess().getValueColorColorArrayParserRuleCall_2_4_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_15_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getFrameRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_15_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:681:10: (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==20) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalSitemap.g:682:11: otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_16, grammarAccess.getFrameAccess().getCommaKeyword_2_4_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:686:11: ( (lv_ValueColor_17_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:687:12: (lv_ValueColor_17_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:687:12: (lv_ValueColor_17_0= ruleColorArray )
            	    	    // InternalSitemap.g:688:13: lv_ValueColor_17_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getFrameAccess().getValueColorColorArrayParserRuleCall_2_4_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_17_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getFrameRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_17_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,21,FOLLOW_11); 

            	    										newLeafNode(otherlv_18, grammarAccess.getFrameAccess().getRightSquareBracketKeyword_2_4_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:717:4: ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:717:4: ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) )
            	    // InternalSitemap.g:718:5: {...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalSitemap.g:718:102: ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalSitemap.g:719:6: ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalSitemap.g:722:9: ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) )
            	    // InternalSitemap.g:722:10: {...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalSitemap.g:722:19: (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) )
            	    // InternalSitemap.g:722:20: otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' )
            	    {
            	    otherlv_19=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getFrameAccess().getVisibilityKeyword_2_5_0());
            	    								
            	    // InternalSitemap.g:726:9: ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' )
            	    // InternalSitemap.g:727:10: ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']'
            	    {
            	    // InternalSitemap.g:727:10: ( (lv_Visibility_20_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:728:11: (lv_Visibility_20_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:728:11: (lv_Visibility_20_0= ruleVisibilityRule )
            	    // InternalSitemap.g:729:12: lv_Visibility_20_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getFrameAccess().getVisibilityVisibilityRuleParserRuleCall_2_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_20_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getFrameRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_20_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:746:10: (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==20) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalSitemap.g:747:11: otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_21, grammarAccess.getFrameAccess().getCommaKeyword_2_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:751:11: ( (lv_Visibility_22_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:752:12: (lv_Visibility_22_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:752:12: (lv_Visibility_22_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:753:13: lv_Visibility_22_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getFrameAccess().getVisibilityVisibilityRuleParserRuleCall_2_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_22_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getFrameRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_22_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,21,FOLLOW_11); 

            	    										newLeafNode(otherlv_23, grammarAccess.getFrameAccess().getRightSquareBracketKeyword_2_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFrameAccess().getUnorderedGroup_2());
            				

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
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleText"
    // InternalSitemap.g:793:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalSitemap.g:793:45: (iv_ruleText= ruleText EOF )
            // InternalSitemap.g:794:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalSitemap.g:800:1: ruleText returns [EObject current=null] : ( () otherlv_1= 'Text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_label_6_1=null;
        Token lv_label_6_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_item_4_0 = null;

        AntlrDatatypeRuleToken lv_icon_8_0 = null;

        EObject lv_LabelColor_10_0 = null;

        EObject lv_LabelColor_12_0 = null;

        EObject lv_ValueColor_15_0 = null;

        EObject lv_ValueColor_17_0 = null;

        EObject lv_Visibility_20_0 = null;

        EObject lv_Visibility_22_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:806:2: ( ( () otherlv_1= 'Text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) ) ) )
            // InternalSitemap.g:807:2: ( () otherlv_1= 'Text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) ) )
            {
            // InternalSitemap.g:807:2: ( () otherlv_1= 'Text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) ) )
            // InternalSitemap.g:808:3: () otherlv_1= 'Text' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) )
            {
            // InternalSitemap.g:808:3: ()
            // InternalSitemap.g:809:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextAccess().getTextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
            		
            // InternalSitemap.g:819:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) ) )
            // InternalSitemap.g:820:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) )
            {
            // InternalSitemap.g:820:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* ) )
            // InternalSitemap.g:821:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTextAccess().getUnorderedGroup_2());
            				
            // InternalSitemap.g:824:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )* )
            // InternalSitemap.g:825:6: ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )*
            {
            // InternalSitemap.g:825:6: ( ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) ) )*
            loop18:
            do {
                int alt18=7;
                int LA18_0 = input.LA(1);

                if ( LA18_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
                    alt18=3;
                }
                else if ( LA18_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
                    alt18=4;
                }
                else if ( LA18_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
                    alt18=5;
                }
                else if ( LA18_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
                    alt18=6;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSitemap.g:826:4: ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:826:4: ({...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:827:5: {...}? => ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalSitemap.g:827:101: ( ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:828:6: ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalSitemap.g:831:9: ({...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:831:10: {...}? => (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // InternalSitemap.g:831:19: (otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:831:20: otherlv_3= 'item=' ( (lv_item_4_0= ruleItemRef ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTextAccess().getItemKeyword_2_0_0());
            	    								
            	    // InternalSitemap.g:835:9: ( (lv_item_4_0= ruleItemRef ) )
            	    // InternalSitemap.g:836:10: (lv_item_4_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:836:10: (lv_item_4_0= ruleItemRef )
            	    // InternalSitemap.g:837:11: lv_item_4_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getTextAccess().getItemItemRefParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_item_4_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTextRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_4_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:860:4: ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:860:4: ({...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:861:5: {...}? => ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalSitemap.g:861:101: ( ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:862:6: ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalSitemap.g:865:9: ({...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:865:10: {...}? => (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // InternalSitemap.g:865:19: (otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:865:20: otherlv_5= 'label=' ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_5, grammarAccess.getTextAccess().getLabelKeyword_2_1_0());
            	    								
            	    // InternalSitemap.g:869:9: ( ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:870:10: ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:870:10: ( (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING ) )
            	    // InternalSitemap.g:871:11: (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:871:11: (lv_label_6_1= RULE_ID | lv_label_6_2= RULE_STRING )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_ID) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==RULE_STRING) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalSitemap.g:872:12: lv_label_6_1= RULE_ID
            	            {
            	            lv_label_6_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            	            												newLeafNode(lv_label_6_1, grammarAccess.getTextAccess().getLabelIDTerminalRuleCall_2_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getTextRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_6_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:887:12: lv_label_6_2= RULE_STRING
            	            {
            	            lv_label_6_2=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	            												newLeafNode(lv_label_6_2, grammarAccess.getTextAccess().getLabelSTRINGTerminalRuleCall_2_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getTextRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_6_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:910:4: ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:910:4: ({...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:911:5: {...}? => ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalSitemap.g:911:101: ( ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:912:6: ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalSitemap.g:915:9: ({...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:915:10: {...}? => (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // InternalSitemap.g:915:19: (otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) ) )
            	    // InternalSitemap.g:915:20: otherlv_7= 'icon=' ( (lv_icon_8_0= ruleIcon ) )
            	    {
            	    otherlv_7=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTextAccess().getIconKeyword_2_2_0());
            	    								
            	    // InternalSitemap.g:919:9: ( (lv_icon_8_0= ruleIcon ) )
            	    // InternalSitemap.g:920:10: (lv_icon_8_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:920:10: (lv_icon_8_0= ruleIcon )
            	    // InternalSitemap.g:921:11: lv_icon_8_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getTextAccess().getIconIconParserRuleCall_2_2_1_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_icon_8_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTextRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_8_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:944:4: ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:944:4: ({...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) ) )
            	    // InternalSitemap.g:945:5: {...}? => ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalSitemap.g:945:101: ( ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) ) )
            	    // InternalSitemap.g:946:6: ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalSitemap.g:949:9: ({...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) ) )
            	    // InternalSitemap.g:949:10: {...}? => (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // InternalSitemap.g:949:19: (otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' ) )
            	    // InternalSitemap.g:949:20: otherlv_9= 'labelcolor=[' ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' )
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTextAccess().getLabelcolorKeyword_2_3_0());
            	    								
            	    // InternalSitemap.g:953:9: ( ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']' )
            	    // InternalSitemap.g:954:10: ( (lv_LabelColor_10_0= ruleColorArray ) ) (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )* otherlv_13= ']'
            	    {
            	    // InternalSitemap.g:954:10: ( (lv_LabelColor_10_0= ruleColorArray ) )
            	    // InternalSitemap.g:955:11: (lv_LabelColor_10_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:955:11: (lv_LabelColor_10_0= ruleColorArray )
            	    // InternalSitemap.g:956:12: lv_LabelColor_10_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getTextAccess().getLabelColorColorArrayParserRuleCall_2_3_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_10_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getTextRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_10_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:973:10: (otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==20) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalSitemap.g:974:11: otherlv_11= ',' ( (lv_LabelColor_12_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_11, grammarAccess.getTextAccess().getCommaKeyword_2_3_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:978:11: ( (lv_LabelColor_12_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:979:12: (lv_LabelColor_12_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:979:12: (lv_LabelColor_12_0= ruleColorArray )
            	    	    // InternalSitemap.g:980:13: lv_LabelColor_12_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getTextAccess().getLabelColorColorArrayParserRuleCall_2_3_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_12_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getTextRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_12_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);

            	    otherlv_13=(Token)match(input,21,FOLLOW_11); 

            	    										newLeafNode(otherlv_13, grammarAccess.getTextAccess().getRightSquareBracketKeyword_2_3_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:1009:4: ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1009:4: ({...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) )
            	    // InternalSitemap.g:1010:5: {...}? => ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalSitemap.g:1010:101: ( ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) )
            	    // InternalSitemap.g:1011:6: ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalSitemap.g:1014:9: ({...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) )
            	    // InternalSitemap.g:1014:10: {...}? => (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // InternalSitemap.g:1014:19: (otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) )
            	    // InternalSitemap.g:1014:20: otherlv_14= 'valuecolor=[' ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' )
            	    {
            	    otherlv_14=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getTextAccess().getValuecolorKeyword_2_4_0());
            	    								
            	    // InternalSitemap.g:1018:9: ( ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' )
            	    // InternalSitemap.g:1019:10: ( (lv_ValueColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )* otherlv_18= ']'
            	    {
            	    // InternalSitemap.g:1019:10: ( (lv_ValueColor_15_0= ruleColorArray ) )
            	    // InternalSitemap.g:1020:11: (lv_ValueColor_15_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:1020:11: (lv_ValueColor_15_0= ruleColorArray )
            	    // InternalSitemap.g:1021:12: lv_ValueColor_15_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getTextAccess().getValueColorColorArrayParserRuleCall_2_4_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_15_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getTextRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_15_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:1038:10: (otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==20) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalSitemap.g:1039:11: otherlv_16= ',' ( (lv_ValueColor_17_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_16, grammarAccess.getTextAccess().getCommaKeyword_2_4_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:1043:11: ( (lv_ValueColor_17_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:1044:12: (lv_ValueColor_17_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:1044:12: (lv_ValueColor_17_0= ruleColorArray )
            	    	    // InternalSitemap.g:1045:13: lv_ValueColor_17_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getTextAccess().getValueColorColorArrayParserRuleCall_2_4_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_17_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getTextRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_17_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,21,FOLLOW_11); 

            	    										newLeafNode(otherlv_18, grammarAccess.getTextAccess().getRightSquareBracketKeyword_2_4_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:1074:4: ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1074:4: ({...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) ) )
            	    // InternalSitemap.g:1075:5: {...}? => ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleText", "getUnorderedGroupHelper().canSelect(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalSitemap.g:1075:101: ( ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalSitemap.g:1076:6: ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTextAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalSitemap.g:1079:9: ({...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) ) )
            	    // InternalSitemap.g:1079:10: {...}? => (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleText", "true");
            	    }
            	    // InternalSitemap.g:1079:19: (otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' ) )
            	    // InternalSitemap.g:1079:20: otherlv_19= 'visibility=[' ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' )
            	    {
            	    otherlv_19=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getTextAccess().getVisibilityKeyword_2_5_0());
            	    								
            	    // InternalSitemap.g:1083:9: ( ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']' )
            	    // InternalSitemap.g:1084:10: ( (lv_Visibility_20_0= ruleVisibilityRule ) ) (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )* otherlv_23= ']'
            	    {
            	    // InternalSitemap.g:1084:10: ( (lv_Visibility_20_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:1085:11: (lv_Visibility_20_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:1085:11: (lv_Visibility_20_0= ruleVisibilityRule )
            	    // InternalSitemap.g:1086:12: lv_Visibility_20_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getTextAccess().getVisibilityVisibilityRuleParserRuleCall_2_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_20_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getTextRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_20_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:1103:10: (otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==20) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalSitemap.g:1104:11: otherlv_21= ',' ( (lv_Visibility_22_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_21, grammarAccess.getTextAccess().getCommaKeyword_2_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:1108:11: ( (lv_Visibility_22_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:1109:12: (lv_Visibility_22_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:1109:12: (lv_Visibility_22_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:1110:13: lv_Visibility_22_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getTextAccess().getVisibilityVisibilityRuleParserRuleCall_2_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_22_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getTextRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_22_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,21,FOLLOW_11); 

            	    										newLeafNode(otherlv_23, grammarAccess.getTextAccess().getRightSquareBracketKeyword_2_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTextAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTextAccess().getUnorderedGroup_2());
            				

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleGroup"
    // InternalSitemap.g:1150:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalSitemap.g:1150:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalSitemap.g:1151:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalSitemap.g:1157:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'Group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_LabelColor_9_0 = null;

        EObject lv_LabelColor_11_0 = null;

        EObject lv_ValueColor_14_0 = null;

        EObject lv_ValueColor_16_0 = null;

        EObject lv_Visibility_19_0 = null;

        EObject lv_Visibility_21_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:1163:2: ( (otherlv_0= 'Group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:1164:2: (otherlv_0= 'Group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:1164:2: (otherlv_0= 'Group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:1165:3: otherlv_0= 'Group' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalSitemap.g:1169:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:1170:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:1170:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:1171:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:1174:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:1175:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:1175:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=7;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
                    alt23=3;
                }
                else if ( LA23_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
                    alt23=4;
                }
                else if ( LA23_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4) ) {
                    alt23=5;
                }
                else if ( LA23_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 5) ) {
                    alt23=6;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSitemap.g:1176:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1176:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:1177:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:1177:102: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) ) )
            	    // InternalSitemap.g:1178:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:1181:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) ) )
            	    // InternalSitemap.g:1181:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // InternalSitemap.g:1181:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) ) )
            	    // InternalSitemap.g:1181:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleGroupItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:1185:9: ( (lv_item_3_0= ruleGroupItemRef ) )
            	    // InternalSitemap.g:1186:10: (lv_item_3_0= ruleGroupItemRef )
            	    {
            	    // InternalSitemap.g:1186:10: (lv_item_3_0= ruleGroupItemRef )
            	    // InternalSitemap.g:1187:11: lv_item_3_0= ruleGroupItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getGroupAccess().getItemGroupItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_item_3_0=ruleGroupItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGroupRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.GroupItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:1210:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1210:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:1211:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:1211:102: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:1212:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:1215:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:1215:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // InternalSitemap.g:1215:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:1215:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:1219:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:1220:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:1220:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:1221:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:1221:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_ID) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==RULE_STRING) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalSitemap.g:1222:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getGroupAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getGroupRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:1237:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getGroupAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getGroupRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:1260:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1260:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:1261:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:1261:102: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:1262:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:1265:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:1265:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // InternalSitemap.g:1265:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:1265:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:1269:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:1270:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:1270:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:1271:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getGroupAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getGroupRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:1294:4: ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1294:4: ({...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) ) )
            	    // InternalSitemap.g:1295:5: {...}? => ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:1295:102: ( ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) ) )
            	    // InternalSitemap.g:1296:6: ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:1299:9: ({...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) ) )
            	    // InternalSitemap.g:1299:10: {...}? => (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // InternalSitemap.g:1299:19: (otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' ) )
            	    // InternalSitemap.g:1299:20: otherlv_8= 'labelcolor=[' ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getLabelcolorKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:1303:9: ( ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']' )
            	    // InternalSitemap.g:1304:10: ( (lv_LabelColor_9_0= ruleColorArray ) ) (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )* otherlv_12= ']'
            	    {
            	    // InternalSitemap.g:1304:10: ( (lv_LabelColor_9_0= ruleColorArray ) )
            	    // InternalSitemap.g:1305:11: (lv_LabelColor_9_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:1305:11: (lv_LabelColor_9_0= ruleColorArray )
            	    // InternalSitemap.g:1306:12: lv_LabelColor_9_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getGroupAccess().getLabelColorColorArrayParserRuleCall_1_3_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_9_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getGroupRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_9_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:1323:10: (otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==20) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalSitemap.g:1324:11: otherlv_10= ',' ( (lv_LabelColor_11_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_10, grammarAccess.getGroupAccess().getCommaKeyword_1_3_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:1328:11: ( (lv_LabelColor_11_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:1329:12: (lv_LabelColor_11_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:1329:12: (lv_LabelColor_11_0= ruleColorArray )
            	    	    // InternalSitemap.g:1330:13: lv_LabelColor_11_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getGroupAccess().getLabelColorColorArrayParserRuleCall_1_3_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_11_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_11_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,21,FOLLOW_11); 

            	    										newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_1_3_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:1359:4: ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1359:4: ({...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) )
            	    // InternalSitemap.g:1360:5: {...}? => ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:1360:102: ( ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) )
            	    // InternalSitemap.g:1361:6: ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:1364:9: ({...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) )
            	    // InternalSitemap.g:1364:10: {...}? => (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // InternalSitemap.g:1364:19: (otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) )
            	    // InternalSitemap.g:1364:20: otherlv_13= 'valuecolor=[' ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' )
            	    {
            	    otherlv_13=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getValuecolorKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:1368:9: ( ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' )
            	    // InternalSitemap.g:1369:10: ( (lv_ValueColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )* otherlv_17= ']'
            	    {
            	    // InternalSitemap.g:1369:10: ( (lv_ValueColor_14_0= ruleColorArray ) )
            	    // InternalSitemap.g:1370:11: (lv_ValueColor_14_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:1370:11: (lv_ValueColor_14_0= ruleColorArray )
            	    // InternalSitemap.g:1371:12: lv_ValueColor_14_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getGroupAccess().getValueColorColorArrayParserRuleCall_1_4_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_14_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getGroupRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_14_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:1388:10: (otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==20) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalSitemap.g:1389:11: otherlv_15= ',' ( (lv_ValueColor_16_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_15, grammarAccess.getGroupAccess().getCommaKeyword_1_4_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:1393:11: ( (lv_ValueColor_16_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:1394:12: (lv_ValueColor_16_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:1394:12: (lv_ValueColor_16_0= ruleColorArray )
            	    	    // InternalSitemap.g:1395:13: lv_ValueColor_16_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getGroupAccess().getValueColorColorArrayParserRuleCall_1_4_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_16_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_16_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,21,FOLLOW_11); 

            	    										newLeafNode(otherlv_17, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_1_4_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:1424:4: ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1424:4: ({...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) ) )
            	    // InternalSitemap.g:1425:5: {...}? => ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:1425:102: ( ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) ) )
            	    // InternalSitemap.g:1426:6: ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGroupAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:1429:9: ({...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) ) )
            	    // InternalSitemap.g:1429:10: {...}? => (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGroup", "true");
            	    }
            	    // InternalSitemap.g:1429:19: (otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' ) )
            	    // InternalSitemap.g:1429:20: otherlv_18= 'visibility=[' ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' )
            	    {
            	    otherlv_18=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_18, grammarAccess.getGroupAccess().getVisibilityKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:1433:9: ( ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']' )
            	    // InternalSitemap.g:1434:10: ( (lv_Visibility_19_0= ruleVisibilityRule ) ) (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )* otherlv_22= ']'
            	    {
            	    // InternalSitemap.g:1434:10: ( (lv_Visibility_19_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:1435:11: (lv_Visibility_19_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:1435:11: (lv_Visibility_19_0= ruleVisibilityRule )
            	    // InternalSitemap.g:1436:12: lv_Visibility_19_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getGroupAccess().getVisibilityVisibilityRuleParserRuleCall_1_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_19_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getGroupRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_19_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:1453:10: (otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==20) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalSitemap.g:1454:11: otherlv_20= ',' ( (lv_Visibility_21_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_20=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_20, grammarAccess.getGroupAccess().getCommaKeyword_1_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:1458:11: ( (lv_Visibility_21_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:1459:12: (lv_Visibility_21_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:1459:12: (lv_Visibility_21_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:1460:13: lv_Visibility_21_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getGroupAccess().getVisibilityVisibilityRuleParserRuleCall_1_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_21_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_21_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);

            	    otherlv_22=(Token)match(input,21,FOLLOW_11); 

            	    										newLeafNode(otherlv_22, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_1_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGroupAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getGroupAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGroupAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleImage"
    // InternalSitemap.g:1501:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalSitemap.g:1501:46: (iv_ruleImage= ruleImage EOF )
            // InternalSitemap.g:1502:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalSitemap.g:1508:1: ruleImage returns [EObject current=null] : (otherlv_0= 'Image' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_url_9_0=null;
        Token otherlv_10=null;
        Token lv_refresh_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_LabelColor_13_0 = null;

        EObject lv_LabelColor_15_0 = null;

        EObject lv_ValueColor_18_0 = null;

        EObject lv_ValueColor_20_0 = null;

        EObject lv_IconColor_23_0 = null;

        EObject lv_IconColor_25_0 = null;

        EObject lv_Visibility_28_0 = null;

        EObject lv_Visibility_30_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:1514:2: ( (otherlv_0= 'Image' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:1515:2: (otherlv_0= 'Image' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:1515:2: (otherlv_0= 'Image' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:1516:3: otherlv_0= 'Image' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getImageAccess().getImageKeyword_0());
            		
            // InternalSitemap.g:1520:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:1521:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:1521:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:1522:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getImageAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:1525:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:1526:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:1526:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=10;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // InternalSitemap.g:1527:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1527:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:1528:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:1528:102: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:1529:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:1532:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:1532:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalSitemap.g:1532:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:1532:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getImageAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:1536:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:1537:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:1537:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:1538:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getImageAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getImageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:1561:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1561:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:1562:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:1562:102: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:1563:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:1566:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:1566:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalSitemap.g:1566:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:1566:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getImageAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:1570:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:1571:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:1571:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:1572:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:1572:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==RULE_ID) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==RULE_STRING) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalSitemap.g:1573:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getImageAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getImageRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:1588:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getImageAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getImageRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:1611:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1611:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:1612:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:1612:102: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:1613:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:1616:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:1616:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalSitemap.g:1616:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:1616:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getImageAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:1620:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:1621:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:1621:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:1622:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getImageAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getImageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:1645:4: ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1645:4: ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:1646:5: {...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:1646:102: ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:1647:6: ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:1650:9: ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:1650:10: {...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalSitemap.g:1650:19: (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) )
            	    // InternalSitemap.g:1650:20: otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getImageAccess().getUrlKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:1654:9: ( (lv_url_9_0= RULE_STRING ) )
            	    // InternalSitemap.g:1655:10: (lv_url_9_0= RULE_STRING )
            	    {
            	    // InternalSitemap.g:1655:10: (lv_url_9_0= RULE_STRING )
            	    // InternalSitemap.g:1656:11: lv_url_9_0= RULE_STRING
            	    {
            	    lv_url_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_url_9_0, grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getImageRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:1678:4: ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1678:4: ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) )
            	    // InternalSitemap.g:1679:5: {...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:1679:102: ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) )
            	    // InternalSitemap.g:1680:6: ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:1683:9: ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) )
            	    // InternalSitemap.g:1683:10: {...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalSitemap.g:1683:19: (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) )
            	    // InternalSitemap.g:1683:20: otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_18); 

            	    									newLeafNode(otherlv_10, grammarAccess.getImageAccess().getRefreshKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:1687:9: ( (lv_refresh_11_0= RULE_INT ) )
            	    // InternalSitemap.g:1688:10: (lv_refresh_11_0= RULE_INT )
            	    {
            	    // InternalSitemap.g:1688:10: (lv_refresh_11_0= RULE_INT )
            	    // InternalSitemap.g:1689:11: lv_refresh_11_0= RULE_INT
            	    {
            	    lv_refresh_11_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    											newLeafNode(lv_refresh_11_0, grammarAccess.getImageAccess().getRefreshINTTerminalRuleCall_1_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getImageRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"refresh",
            	    												lv_refresh_11_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:1711:4: ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1711:4: ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) )
            	    // InternalSitemap.g:1712:5: {...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:1712:102: ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) )
            	    // InternalSitemap.g:1713:6: ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:1716:9: ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) )
            	    // InternalSitemap.g:1716:10: {...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalSitemap.g:1716:19: (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) )
            	    // InternalSitemap.g:1716:20: otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' )
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_12, grammarAccess.getImageAccess().getLabelcolorKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:1720:9: ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' )
            	    // InternalSitemap.g:1721:10: ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']'
            	    {
            	    // InternalSitemap.g:1721:10: ( (lv_LabelColor_13_0= ruleColorArray ) )
            	    // InternalSitemap.g:1722:11: (lv_LabelColor_13_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:1722:11: (lv_LabelColor_13_0= ruleColorArray )
            	    // InternalSitemap.g:1723:12: lv_LabelColor_13_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getImageAccess().getLabelColorColorArrayParserRuleCall_1_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_13_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getImageRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_13_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:1740:10: (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==20) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalSitemap.g:1741:11: otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_14, grammarAccess.getImageAccess().getCommaKeyword_1_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:1745:11: ( (lv_LabelColor_15_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:1746:12: (lv_LabelColor_15_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:1746:12: (lv_LabelColor_15_0= ruleColorArray )
            	    	    // InternalSitemap.g:1747:13: lv_LabelColor_15_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getImageAccess().getLabelColorColorArrayParserRuleCall_1_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_15_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getImageRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_15_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,21,FOLLOW_17); 

            	    										newLeafNode(otherlv_16, grammarAccess.getImageAccess().getRightSquareBracketKeyword_1_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSitemap.g:1776:4: ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1776:4: ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) )
            	    // InternalSitemap.g:1777:5: {...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalSitemap.g:1777:102: ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) )
            	    // InternalSitemap.g:1778:6: ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalSitemap.g:1781:9: ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) )
            	    // InternalSitemap.g:1781:10: {...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalSitemap.g:1781:19: (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) )
            	    // InternalSitemap.g:1781:20: otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' )
            	    {
            	    otherlv_17=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getImageAccess().getValuecolorKeyword_1_6_0());
            	    								
            	    // InternalSitemap.g:1785:9: ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' )
            	    // InternalSitemap.g:1786:10: ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']'
            	    {
            	    // InternalSitemap.g:1786:10: ( (lv_ValueColor_18_0= ruleColorArray ) )
            	    // InternalSitemap.g:1787:11: (lv_ValueColor_18_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:1787:11: (lv_ValueColor_18_0= ruleColorArray )
            	    // InternalSitemap.g:1788:12: lv_ValueColor_18_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getImageAccess().getValueColorColorArrayParserRuleCall_1_6_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_18_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getImageRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_18_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:1805:10: (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==20) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // InternalSitemap.g:1806:11: otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_19, grammarAccess.getImageAccess().getCommaKeyword_1_6_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:1810:11: ( (lv_ValueColor_20_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:1811:12: (lv_ValueColor_20_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:1811:12: (lv_ValueColor_20_0= ruleColorArray )
            	    	    // InternalSitemap.g:1812:13: lv_ValueColor_20_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getImageAccess().getValueColorColorArrayParserRuleCall_1_6_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_20_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getImageRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_20_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,21,FOLLOW_17); 

            	    										newLeafNode(otherlv_21, grammarAccess.getImageAccess().getRightSquareBracketKeyword_1_6_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalSitemap.g:1841:4: ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1841:4: ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) )
            	    // InternalSitemap.g:1842:5: {...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // InternalSitemap.g:1842:102: ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) )
            	    // InternalSitemap.g:1843:6: ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_1(), 7);
            	    					
            	    // InternalSitemap.g:1846:9: ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) )
            	    // InternalSitemap.g:1846:10: {...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalSitemap.g:1846:19: (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) )
            	    // InternalSitemap.g:1846:20: otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' )
            	    {
            	    otherlv_22=(Token)match(input,29,FOLLOW_13); 

            	    									newLeafNode(otherlv_22, grammarAccess.getImageAccess().getIconcolorKeyword_1_7_0());
            	    								
            	    // InternalSitemap.g:1850:9: ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' )
            	    // InternalSitemap.g:1851:10: ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']'
            	    {
            	    // InternalSitemap.g:1851:10: ( (lv_IconColor_23_0= ruleColorArray ) )
            	    // InternalSitemap.g:1852:11: (lv_IconColor_23_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:1852:11: (lv_IconColor_23_0= ruleColorArray )
            	    // InternalSitemap.g:1853:12: lv_IconColor_23_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getImageAccess().getIconColorColorArrayParserRuleCall_1_7_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_IconColor_23_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getImageRule());
            	    												}
            	    												add(
            	    													current,
            	    													"IconColor",
            	    													lv_IconColor_23_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:1870:10: (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==20) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalSitemap.g:1871:11: otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_24, grammarAccess.getImageAccess().getCommaKeyword_1_7_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:1875:11: ( (lv_IconColor_25_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:1876:12: (lv_IconColor_25_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:1876:12: (lv_IconColor_25_0= ruleColorArray )
            	    	    // InternalSitemap.g:1877:13: lv_IconColor_25_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getImageAccess().getIconColorColorArrayParserRuleCall_1_7_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_IconColor_25_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getImageRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"IconColor",
            	    	    														lv_IconColor_25_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);

            	    otherlv_26=(Token)match(input,21,FOLLOW_17); 

            	    										newLeafNode(otherlv_26, grammarAccess.getImageAccess().getRightSquareBracketKeyword_1_7_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalSitemap.g:1906:4: ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:1906:4: ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) )
            	    // InternalSitemap.g:1907:5: {...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // InternalSitemap.g:1907:102: ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) )
            	    // InternalSitemap.g:1908:6: ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getImageAccess().getUnorderedGroup_1(), 8);
            	    					
            	    // InternalSitemap.g:1911:9: ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) )
            	    // InternalSitemap.g:1911:10: {...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleImage", "true");
            	    }
            	    // InternalSitemap.g:1911:19: (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) )
            	    // InternalSitemap.g:1911:20: otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' )
            	    {
            	    otherlv_27=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getImageAccess().getVisibilityKeyword_1_8_0());
            	    								
            	    // InternalSitemap.g:1915:9: ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' )
            	    // InternalSitemap.g:1916:10: ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']'
            	    {
            	    // InternalSitemap.g:1916:10: ( (lv_Visibility_28_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:1917:11: (lv_Visibility_28_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:1917:11: (lv_Visibility_28_0= ruleVisibilityRule )
            	    // InternalSitemap.g:1918:12: lv_Visibility_28_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getImageAccess().getVisibilityVisibilityRuleParserRuleCall_1_8_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_28_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getImageRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_28_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:1935:10: (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==20) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalSitemap.g:1936:11: otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_29, grammarAccess.getImageAccess().getCommaKeyword_1_8_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:1940:11: ( (lv_Visibility_30_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:1941:12: (lv_Visibility_30_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:1941:12: (lv_Visibility_30_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:1942:13: lv_Visibility_30_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getImageAccess().getVisibilityVisibilityRuleParserRuleCall_1_8_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_30_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getImageRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_30_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);

            	    otherlv_31=(Token)match(input,21,FOLLOW_17); 

            	    										newLeafNode(otherlv_31, grammarAccess.getImageAccess().getRightSquareBracketKeyword_1_8_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getImageAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getImageAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleImage", "getUnorderedGroupHelper().canLeave(grammarAccess.getImageAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getImageAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleVideo"
    // InternalSitemap.g:1983:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalSitemap.g:1983:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalSitemap.g:1984:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalSitemap.g:1990:1: ruleVideo returns [EObject current=null] : (otherlv_0= 'Video' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_url_9_0=null;
        Token otherlv_10=null;
        Token lv_encoding_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_LabelColor_13_0 = null;

        EObject lv_LabelColor_15_0 = null;

        EObject lv_ValueColor_18_0 = null;

        EObject lv_ValueColor_20_0 = null;

        EObject lv_Visibility_23_0 = null;

        EObject lv_Visibility_25_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:1996:2: ( (otherlv_0= 'Video' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:1997:2: (otherlv_0= 'Video' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:1997:2: (otherlv_0= 'Video' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:1998:3: otherlv_0= 'Video' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoAccess().getVideoKeyword_0());
            		
            // InternalSitemap.g:2002:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:2003:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:2003:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:2004:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVideoAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:2007:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:2008:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:2008:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=9;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // InternalSitemap.g:2009:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2009:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:2010:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:2010:102: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:2011:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:2014:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:2014:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "true");
            	    }
            	    // InternalSitemap.g:2014:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:2014:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getVideoAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:2018:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:2019:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:2019:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:2020:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getVideoAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_20);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVideoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVideoAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:2043:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2043:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:2044:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:2044:102: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:2045:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:2048:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:2048:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "true");
            	    }
            	    // InternalSitemap.g:2048:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:2048:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getVideoAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:2052:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:2053:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:2053:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:2054:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:2054:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==RULE_ID) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==RULE_STRING) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalSitemap.g:2055:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getVideoAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getVideoRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:2070:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_20); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getVideoAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getVideoRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVideoAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:2093:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2093:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:2094:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:2094:102: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:2095:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:2098:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:2098:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "true");
            	    }
            	    // InternalSitemap.g:2098:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:2098:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVideoAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:2102:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:2103:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:2103:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:2104:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getVideoAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_20);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVideoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVideoAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:2127:4: ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2127:4: ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:2128:5: {...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:2128:102: ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:2129:6: ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:2132:9: ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:2132:10: {...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "true");
            	    }
            	    // InternalSitemap.g:2132:19: (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) )
            	    // InternalSitemap.g:2132:20: otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getVideoAccess().getUrlKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:2136:9: ( (lv_url_9_0= RULE_STRING ) )
            	    // InternalSitemap.g:2137:10: (lv_url_9_0= RULE_STRING )
            	    {
            	    // InternalSitemap.g:2137:10: (lv_url_9_0= RULE_STRING )
            	    // InternalSitemap.g:2138:11: lv_url_9_0= RULE_STRING
            	    {
            	    lv_url_9_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            	    											newLeafNode(lv_url_9_0, grammarAccess.getVideoAccess().getUrlSTRINGTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVideoRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVideoAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:2160:4: ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2160:4: ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:2161:5: {...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:2161:102: ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:2162:6: ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:2165:9: ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:2165:10: {...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "true");
            	    }
            	    // InternalSitemap.g:2165:19: (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) )
            	    // InternalSitemap.g:2165:20: otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,31,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVideoAccess().getEncodingKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:2169:9: ( (lv_encoding_11_0= RULE_STRING ) )
            	    // InternalSitemap.g:2170:10: (lv_encoding_11_0= RULE_STRING )
            	    {
            	    // InternalSitemap.g:2170:10: (lv_encoding_11_0= RULE_STRING )
            	    // InternalSitemap.g:2171:11: lv_encoding_11_0= RULE_STRING
            	    {
            	    lv_encoding_11_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            	    											newLeafNode(lv_encoding_11_0, grammarAccess.getVideoAccess().getEncodingSTRINGTerminalRuleCall_1_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVideoRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"encoding",
            	    												lv_encoding_11_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVideoAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:2193:4: ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2193:4: ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) )
            	    // InternalSitemap.g:2194:5: {...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:2194:102: ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) )
            	    // InternalSitemap.g:2195:6: ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:2198:9: ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) )
            	    // InternalSitemap.g:2198:10: {...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "true");
            	    }
            	    // InternalSitemap.g:2198:19: (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) )
            	    // InternalSitemap.g:2198:20: otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' )
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_12, grammarAccess.getVideoAccess().getLabelcolorKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:2202:9: ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' )
            	    // InternalSitemap.g:2203:10: ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']'
            	    {
            	    // InternalSitemap.g:2203:10: ( (lv_LabelColor_13_0= ruleColorArray ) )
            	    // InternalSitemap.g:2204:11: (lv_LabelColor_13_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:2204:11: (lv_LabelColor_13_0= ruleColorArray )
            	    // InternalSitemap.g:2205:12: lv_LabelColor_13_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getVideoAccess().getLabelColorColorArrayParserRuleCall_1_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_13_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getVideoRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_13_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:2222:10: (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==20) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalSitemap.g:2223:11: otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_14, grammarAccess.getVideoAccess().getCommaKeyword_1_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:2227:11: ( (lv_LabelColor_15_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:2228:12: (lv_LabelColor_15_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:2228:12: (lv_LabelColor_15_0= ruleColorArray )
            	    	    // InternalSitemap.g:2229:13: lv_LabelColor_15_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getVideoAccess().getLabelColorColorArrayParserRuleCall_1_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_15_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getVideoRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_15_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,21,FOLLOW_20); 

            	    										newLeafNode(otherlv_16, grammarAccess.getVideoAccess().getRightSquareBracketKeyword_1_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVideoAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSitemap.g:2258:4: ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2258:4: ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) )
            	    // InternalSitemap.g:2259:5: {...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalSitemap.g:2259:102: ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) )
            	    // InternalSitemap.g:2260:6: ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalSitemap.g:2263:9: ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) )
            	    // InternalSitemap.g:2263:10: {...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "true");
            	    }
            	    // InternalSitemap.g:2263:19: (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) )
            	    // InternalSitemap.g:2263:20: otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' )
            	    {
            	    otherlv_17=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getVideoAccess().getValuecolorKeyword_1_6_0());
            	    								
            	    // InternalSitemap.g:2267:9: ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' )
            	    // InternalSitemap.g:2268:10: ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']'
            	    {
            	    // InternalSitemap.g:2268:10: ( (lv_ValueColor_18_0= ruleColorArray ) )
            	    // InternalSitemap.g:2269:11: (lv_ValueColor_18_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:2269:11: (lv_ValueColor_18_0= ruleColorArray )
            	    // InternalSitemap.g:2270:12: lv_ValueColor_18_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getVideoAccess().getValueColorColorArrayParserRuleCall_1_6_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_18_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getVideoRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_18_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:2287:10: (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==20) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalSitemap.g:2288:11: otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_19, grammarAccess.getVideoAccess().getCommaKeyword_1_6_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:2292:11: ( (lv_ValueColor_20_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:2293:12: (lv_ValueColor_20_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:2293:12: (lv_ValueColor_20_0= ruleColorArray )
            	    	    // InternalSitemap.g:2294:13: lv_ValueColor_20_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getVideoAccess().getValueColorColorArrayParserRuleCall_1_6_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_20_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getVideoRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_20_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,21,FOLLOW_20); 

            	    										newLeafNode(otherlv_21, grammarAccess.getVideoAccess().getRightSquareBracketKeyword_1_6_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVideoAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalSitemap.g:2323:4: ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2323:4: ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) )
            	    // InternalSitemap.g:2324:5: {...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // InternalSitemap.g:2324:102: ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) )
            	    // InternalSitemap.g:2325:6: ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 7);
            	    					
            	    // InternalSitemap.g:2328:9: ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) )
            	    // InternalSitemap.g:2328:10: {...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVideo", "true");
            	    }
            	    // InternalSitemap.g:2328:19: (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) )
            	    // InternalSitemap.g:2328:20: otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' )
            	    {
            	    otherlv_22=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getVideoAccess().getVisibilityKeyword_1_7_0());
            	    								
            	    // InternalSitemap.g:2332:9: ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' )
            	    // InternalSitemap.g:2333:10: ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']'
            	    {
            	    // InternalSitemap.g:2333:10: ( (lv_Visibility_23_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:2334:11: (lv_Visibility_23_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:2334:11: (lv_Visibility_23_0= ruleVisibilityRule )
            	    // InternalSitemap.g:2335:12: lv_Visibility_23_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getVideoAccess().getVisibilityVisibilityRuleParserRuleCall_1_7_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_23_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getVideoRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_23_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:2352:10: (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==20) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalSitemap.g:2353:11: otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_24, grammarAccess.getVideoAccess().getCommaKeyword_1_7_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:2357:11: ( (lv_Visibility_25_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:2358:12: (lv_Visibility_25_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:2358:12: (lv_Visibility_25_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:2359:13: lv_Visibility_25_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getVideoAccess().getVisibilityVisibilityRuleParserRuleCall_1_7_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_25_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getVideoRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_25_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    otherlv_26=(Token)match(input,21,FOLLOW_20); 

            	    										newLeafNode(otherlv_26, grammarAccess.getVideoAccess().getRightSquareBracketKeyword_1_7_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVideoAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVideoAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleVideo", "getUnorderedGroupHelper().canLeave(grammarAccess.getVideoAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getVideoAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleChart"
    // InternalSitemap.g:2400:1: entryRuleChart returns [EObject current=null] : iv_ruleChart= ruleChart EOF ;
    public final EObject entryRuleChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChart = null;


        try {
            // InternalSitemap.g:2400:46: (iv_ruleChart= ruleChart EOF )
            // InternalSitemap.g:2401:2: iv_ruleChart= ruleChart EOF
            {
             newCompositeNode(grammarAccess.getChartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChart=ruleChart();

            state._fsp--;

             current =iv_ruleChart; 
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
    // $ANTLR end "entryRuleChart"


    // $ANTLR start "ruleChart"
    // InternalSitemap.g:2407:1: ruleChart returns [EObject current=null] : (otherlv_0= 'Chart' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_service_9_0=null;
        Token otherlv_10=null;
        Token lv_refresh_11_0=null;
        Token otherlv_12=null;
        Token lv_period_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_LabelColor_15_0 = null;

        EObject lv_LabelColor_17_0 = null;

        EObject lv_ValueColor_20_0 = null;

        EObject lv_ValueColor_22_0 = null;

        EObject lv_Visibility_25_0 = null;

        EObject lv_Visibility_27_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:2413:2: ( (otherlv_0= 'Chart' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:2414:2: (otherlv_0= 'Chart' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:2414:2: (otherlv_0= 'Chart' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:2415:3: otherlv_0= 'Chart' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getChartAccess().getChartKeyword_0());
            		
            // InternalSitemap.g:2419:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:2420:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:2420:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:2421:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getChartAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:2424:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:2425:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:2425:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=10;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // InternalSitemap.g:2426:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2426:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:2427:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:2427:102: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:2428:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChartAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:2431:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:2431:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "true");
            	    }
            	    // InternalSitemap.g:2431:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:2431:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getChartAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:2435:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:2436:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:2436:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:2437:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getChartAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_22);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChartAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:2460:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2460:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:2461:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:2461:102: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:2462:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChartAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:2465:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:2465:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "true");
            	    }
            	    // InternalSitemap.g:2465:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:2465:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getChartAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:2469:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:2470:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:2470:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:2471:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:2471:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_ID) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==RULE_STRING) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalSitemap.g:2472:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getChartAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getChartRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:2487:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getChartAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getChartRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChartAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:2510:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2510:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:2511:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:2511:102: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:2512:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChartAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:2515:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:2515:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "true");
            	    }
            	    // InternalSitemap.g:2515:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:2515:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getChartAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:2519:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:2520:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:2520:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:2521:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getChartAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_22);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChartRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChartAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:2544:4: ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2544:4: ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:2545:5: {...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:2545:102: ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:2546:6: ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChartAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:2549:9: ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:2549:10: {...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "true");
            	    }
            	    // InternalSitemap.g:2549:19: (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) )
            	    // InternalSitemap.g:2549:20: otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,33,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getChartAccess().getServiceKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:2553:9: ( (lv_service_9_0= RULE_STRING ) )
            	    // InternalSitemap.g:2554:10: (lv_service_9_0= RULE_STRING )
            	    {
            	    // InternalSitemap.g:2554:10: (lv_service_9_0= RULE_STRING )
            	    // InternalSitemap.g:2555:11: lv_service_9_0= RULE_STRING
            	    {
            	    lv_service_9_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	    											newLeafNode(lv_service_9_0, grammarAccess.getChartAccess().getServiceSTRINGTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getChartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"service",
            	    												lv_service_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChartAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:2577:4: ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2577:4: ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) )
            	    // InternalSitemap.g:2578:5: {...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:2578:102: ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) )
            	    // InternalSitemap.g:2579:6: ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChartAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:2582:9: ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) )
            	    // InternalSitemap.g:2582:10: {...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "true");
            	    }
            	    // InternalSitemap.g:2582:19: (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) )
            	    // InternalSitemap.g:2582:20: otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_18); 

            	    									newLeafNode(otherlv_10, grammarAccess.getChartAccess().getRefreshKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:2586:9: ( (lv_refresh_11_0= RULE_INT ) )
            	    // InternalSitemap.g:2587:10: (lv_refresh_11_0= RULE_INT )
            	    {
            	    // InternalSitemap.g:2587:10: (lv_refresh_11_0= RULE_INT )
            	    // InternalSitemap.g:2588:11: lv_refresh_11_0= RULE_INT
            	    {
            	    lv_refresh_11_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            	    											newLeafNode(lv_refresh_11_0, grammarAccess.getChartAccess().getRefreshINTTerminalRuleCall_1_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getChartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"refresh",
            	    												lv_refresh_11_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChartAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:2610:4: ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2610:4: ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) )
            	    // InternalSitemap.g:2611:5: {...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:2611:102: ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) )
            	    // InternalSitemap.g:2612:6: ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChartAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:2615:9: ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) )
            	    // InternalSitemap.g:2615:10: {...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "true");
            	    }
            	    // InternalSitemap.g:2615:19: (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) )
            	    // InternalSitemap.g:2615:20: otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getChartAccess().getPeriodKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:2619:9: ( (lv_period_13_0= RULE_ID ) )
            	    // InternalSitemap.g:2620:10: (lv_period_13_0= RULE_ID )
            	    {
            	    // InternalSitemap.g:2620:10: (lv_period_13_0= RULE_ID )
            	    // InternalSitemap.g:2621:11: lv_period_13_0= RULE_ID
            	    {
            	    lv_period_13_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    											newLeafNode(lv_period_13_0, grammarAccess.getChartAccess().getPeriodIDTerminalRuleCall_1_5_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getChartRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"period",
            	    												lv_period_13_0,
            	    												"org.xtext.example.sitemap.Sitemap.ID");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChartAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSitemap.g:2643:4: ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2643:4: ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) )
            	    // InternalSitemap.g:2644:5: {...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalSitemap.g:2644:102: ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) )
            	    // InternalSitemap.g:2645:6: ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChartAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalSitemap.g:2648:9: ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) )
            	    // InternalSitemap.g:2648:10: {...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "true");
            	    }
            	    // InternalSitemap.g:2648:19: (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) )
            	    // InternalSitemap.g:2648:20: otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' )
            	    {
            	    otherlv_14=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getChartAccess().getLabelcolorKeyword_1_6_0());
            	    								
            	    // InternalSitemap.g:2652:9: ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' )
            	    // InternalSitemap.g:2653:10: ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']'
            	    {
            	    // InternalSitemap.g:2653:10: ( (lv_LabelColor_15_0= ruleColorArray ) )
            	    // InternalSitemap.g:2654:11: (lv_LabelColor_15_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:2654:11: (lv_LabelColor_15_0= ruleColorArray )
            	    // InternalSitemap.g:2655:12: lv_LabelColor_15_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getChartAccess().getLabelColorColorArrayParserRuleCall_1_6_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_15_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getChartRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_15_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:2672:10: (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==20) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalSitemap.g:2673:11: otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_16, grammarAccess.getChartAccess().getCommaKeyword_1_6_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:2677:11: ( (lv_LabelColor_17_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:2678:12: (lv_LabelColor_17_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:2678:12: (lv_LabelColor_17_0= ruleColorArray )
            	    	    // InternalSitemap.g:2679:13: lv_LabelColor_17_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getChartAccess().getLabelColorColorArrayParserRuleCall_1_6_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_17_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getChartRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_17_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,21,FOLLOW_22); 

            	    										newLeafNode(otherlv_18, grammarAccess.getChartAccess().getRightSquareBracketKeyword_1_6_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChartAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalSitemap.g:2708:4: ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2708:4: ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) )
            	    // InternalSitemap.g:2709:5: {...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // InternalSitemap.g:2709:102: ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalSitemap.g:2710:6: ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChartAccess().getUnorderedGroup_1(), 7);
            	    					
            	    // InternalSitemap.g:2713:9: ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) )
            	    // InternalSitemap.g:2713:10: {...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "true");
            	    }
            	    // InternalSitemap.g:2713:19: (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) )
            	    // InternalSitemap.g:2713:20: otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' )
            	    {
            	    otherlv_19=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_19, grammarAccess.getChartAccess().getValuecolorKeyword_1_7_0());
            	    								
            	    // InternalSitemap.g:2717:9: ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' )
            	    // InternalSitemap.g:2718:10: ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']'
            	    {
            	    // InternalSitemap.g:2718:10: ( (lv_ValueColor_20_0= ruleColorArray ) )
            	    // InternalSitemap.g:2719:11: (lv_ValueColor_20_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:2719:11: (lv_ValueColor_20_0= ruleColorArray )
            	    // InternalSitemap.g:2720:12: lv_ValueColor_20_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getChartAccess().getValueColorColorArrayParserRuleCall_1_7_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_20_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getChartRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_20_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:2737:10: (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==20) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // InternalSitemap.g:2738:11: otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_21, grammarAccess.getChartAccess().getCommaKeyword_1_7_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:2742:11: ( (lv_ValueColor_22_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:2743:12: (lv_ValueColor_22_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:2743:12: (lv_ValueColor_22_0= ruleColorArray )
            	    	    // InternalSitemap.g:2744:13: lv_ValueColor_22_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getChartAccess().getValueColorColorArrayParserRuleCall_1_7_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_22_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getChartRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_22_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,21,FOLLOW_22); 

            	    										newLeafNode(otherlv_23, grammarAccess.getChartAccess().getRightSquareBracketKeyword_1_7_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChartAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalSitemap.g:2773:4: ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2773:4: ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalSitemap.g:2774:5: {...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // InternalSitemap.g:2774:102: ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalSitemap.g:2775:6: ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChartAccess().getUnorderedGroup_1(), 8);
            	    					
            	    // InternalSitemap.g:2778:9: ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) )
            	    // InternalSitemap.g:2778:10: {...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChart", "true");
            	    }
            	    // InternalSitemap.g:2778:19: (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) )
            	    // InternalSitemap.g:2778:20: otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' )
            	    {
            	    otherlv_24=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getChartAccess().getVisibilityKeyword_1_8_0());
            	    								
            	    // InternalSitemap.g:2782:9: ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' )
            	    // InternalSitemap.g:2783:10: ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']'
            	    {
            	    // InternalSitemap.g:2783:10: ( (lv_Visibility_25_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:2784:11: (lv_Visibility_25_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:2784:11: (lv_Visibility_25_0= ruleVisibilityRule )
            	    // InternalSitemap.g:2785:12: lv_Visibility_25_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getChartAccess().getVisibilityVisibilityRuleParserRuleCall_1_8_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_25_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getChartRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_25_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:2802:10: (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==20) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalSitemap.g:2803:11: otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_26=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_26, grammarAccess.getChartAccess().getCommaKeyword_1_8_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:2807:11: ( (lv_Visibility_27_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:2808:12: (lv_Visibility_27_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:2808:12: (lv_Visibility_27_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:2809:13: lv_Visibility_27_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getChartAccess().getVisibilityVisibilityRuleParserRuleCall_1_8_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_27_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getChartRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_27_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop38;
            	        }
            	    } while (true);

            	    otherlv_28=(Token)match(input,21,FOLLOW_22); 

            	    										newLeafNode(otherlv_28, grammarAccess.getChartAccess().getRightSquareBracketKeyword_1_8_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChartAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getChartAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleChart", "getUnorderedGroupHelper().canLeave(grammarAccess.getChartAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getChartAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleChart"


    // $ANTLR start "entryRuleWebview"
    // InternalSitemap.g:2850:1: entryRuleWebview returns [EObject current=null] : iv_ruleWebview= ruleWebview EOF ;
    public final EObject entryRuleWebview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebview = null;


        try {
            // InternalSitemap.g:2850:48: (iv_ruleWebview= ruleWebview EOF )
            // InternalSitemap.g:2851:2: iv_ruleWebview= ruleWebview EOF
            {
             newCompositeNode(grammarAccess.getWebviewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebview=ruleWebview();

            state._fsp--;

             current =iv_ruleWebview; 
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
    // $ANTLR end "entryRuleWebview"


    // $ANTLR start "ruleWebview"
    // InternalSitemap.g:2857:1: ruleWebview returns [EObject current=null] : (otherlv_0= 'Webview' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleWebview() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_height_9_0=null;
        Token otherlv_10=null;
        Token lv_url_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_LabelColor_13_0 = null;

        EObject lv_LabelColor_15_0 = null;

        EObject lv_ValueColor_18_0 = null;

        EObject lv_ValueColor_20_0 = null;

        EObject lv_Visibility_23_0 = null;

        EObject lv_Visibility_25_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:2863:2: ( (otherlv_0= 'Webview' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:2864:2: (otherlv_0= 'Webview' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:2864:2: (otherlv_0= 'Webview' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:2865:3: otherlv_0= 'Webview' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getWebviewAccess().getWebviewKeyword_0());
            		
            // InternalSitemap.g:2869:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:2870:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:2870:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:2871:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getWebviewAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:2874:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:2875:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:2875:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=9;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // InternalSitemap.g:2876:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2876:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:2877:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:2877:104: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:2878:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:2881:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:2881:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "true");
            	    }
            	    // InternalSitemap.g:2881:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:2881:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getWebviewAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:2885:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:2886:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:2886:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:2887:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getWebviewAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_24);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getWebviewRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWebviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:2910:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2910:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:2911:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:2911:104: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:2912:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:2915:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:2915:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "true");
            	    }
            	    // InternalSitemap.g:2915:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:2915:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getWebviewAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:2919:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:2920:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:2920:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:2921:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:2921:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==RULE_ID) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==RULE_STRING) ) {
            	        alt40=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalSitemap.g:2922:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getWebviewAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getWebviewRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:2937:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_24); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getWebviewAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getWebviewRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWebviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:2960:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2960:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:2961:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:2961:104: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:2962:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:2965:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:2965:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "true");
            	    }
            	    // InternalSitemap.g:2965:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:2965:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getWebviewAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:2969:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:2970:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:2970:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:2971:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getWebviewAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_24);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getWebviewRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWebviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:2994:4: ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:2994:4: ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) )
            	    // InternalSitemap.g:2995:5: {...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:2995:104: ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) )
            	    // InternalSitemap.g:2996:6: ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:2999:9: ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) )
            	    // InternalSitemap.g:2999:10: {...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "true");
            	    }
            	    // InternalSitemap.g:2999:19: (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) )
            	    // InternalSitemap.g:2999:20: otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,36,FOLLOW_18); 

            	    									newLeafNode(otherlv_8, grammarAccess.getWebviewAccess().getHeightKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:3003:9: ( (lv_height_9_0= RULE_INT ) )
            	    // InternalSitemap.g:3004:10: (lv_height_9_0= RULE_INT )
            	    {
            	    // InternalSitemap.g:3004:10: (lv_height_9_0= RULE_INT )
            	    // InternalSitemap.g:3005:11: lv_height_9_0= RULE_INT
            	    {
            	    lv_height_9_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            	    											newLeafNode(lv_height_9_0, grammarAccess.getWebviewAccess().getHeightINTTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getWebviewRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"height",
            	    												lv_height_9_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWebviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:3027:4: ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3027:4: ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:3028:5: {...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:3028:104: ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:3029:6: ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:3032:9: ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:3032:10: {...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "true");
            	    }
            	    // InternalSitemap.g:3032:19: (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) )
            	    // InternalSitemap.g:3032:20: otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,27,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getWebviewAccess().getUrlKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:3036:9: ( (lv_url_11_0= RULE_STRING ) )
            	    // InternalSitemap.g:3037:10: (lv_url_11_0= RULE_STRING )
            	    {
            	    // InternalSitemap.g:3037:10: (lv_url_11_0= RULE_STRING )
            	    // InternalSitemap.g:3038:11: lv_url_11_0= RULE_STRING
            	    {
            	    lv_url_11_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            	    											newLeafNode(lv_url_11_0, grammarAccess.getWebviewAccess().getUrlSTRINGTerminalRuleCall_1_4_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getWebviewRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_11_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWebviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:3060:4: ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3060:4: ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) )
            	    // InternalSitemap.g:3061:5: {...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:3061:104: ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) )
            	    // InternalSitemap.g:3062:6: ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:3065:9: ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) )
            	    // InternalSitemap.g:3065:10: {...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "true");
            	    }
            	    // InternalSitemap.g:3065:19: (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) )
            	    // InternalSitemap.g:3065:20: otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' )
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_12, grammarAccess.getWebviewAccess().getLabelcolorKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:3069:9: ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' )
            	    // InternalSitemap.g:3070:10: ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']'
            	    {
            	    // InternalSitemap.g:3070:10: ( (lv_LabelColor_13_0= ruleColorArray ) )
            	    // InternalSitemap.g:3071:11: (lv_LabelColor_13_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:3071:11: (lv_LabelColor_13_0= ruleColorArray )
            	    // InternalSitemap.g:3072:12: lv_LabelColor_13_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getWebviewAccess().getLabelColorColorArrayParserRuleCall_1_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_13_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getWebviewRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_13_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:3089:10: (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==20) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalSitemap.g:3090:11: otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_14, grammarAccess.getWebviewAccess().getCommaKeyword_1_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:3094:11: ( (lv_LabelColor_15_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:3095:12: (lv_LabelColor_15_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:3095:12: (lv_LabelColor_15_0= ruleColorArray )
            	    	    // InternalSitemap.g:3096:13: lv_LabelColor_15_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getWebviewAccess().getLabelColorColorArrayParserRuleCall_1_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_15_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getWebviewRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_15_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,21,FOLLOW_24); 

            	    										newLeafNode(otherlv_16, grammarAccess.getWebviewAccess().getRightSquareBracketKeyword_1_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWebviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSitemap.g:3125:4: ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3125:4: ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) )
            	    // InternalSitemap.g:3126:5: {...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalSitemap.g:3126:104: ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) )
            	    // InternalSitemap.g:3127:6: ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalSitemap.g:3130:9: ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) )
            	    // InternalSitemap.g:3130:10: {...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "true");
            	    }
            	    // InternalSitemap.g:3130:19: (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) )
            	    // InternalSitemap.g:3130:20: otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' )
            	    {
            	    otherlv_17=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getWebviewAccess().getValuecolorKeyword_1_6_0());
            	    								
            	    // InternalSitemap.g:3134:9: ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' )
            	    // InternalSitemap.g:3135:10: ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']'
            	    {
            	    // InternalSitemap.g:3135:10: ( (lv_ValueColor_18_0= ruleColorArray ) )
            	    // InternalSitemap.g:3136:11: (lv_ValueColor_18_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:3136:11: (lv_ValueColor_18_0= ruleColorArray )
            	    // InternalSitemap.g:3137:12: lv_ValueColor_18_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getWebviewAccess().getValueColorColorArrayParserRuleCall_1_6_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_18_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getWebviewRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_18_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:3154:10: (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==20) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalSitemap.g:3155:11: otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_19, grammarAccess.getWebviewAccess().getCommaKeyword_1_6_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:3159:11: ( (lv_ValueColor_20_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:3160:12: (lv_ValueColor_20_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:3160:12: (lv_ValueColor_20_0= ruleColorArray )
            	    	    // InternalSitemap.g:3161:13: lv_ValueColor_20_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getWebviewAccess().getValueColorColorArrayParserRuleCall_1_6_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_20_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getWebviewRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_20_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop42;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,21,FOLLOW_24); 

            	    										newLeafNode(otherlv_21, grammarAccess.getWebviewAccess().getRightSquareBracketKeyword_1_6_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWebviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalSitemap.g:3190:4: ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3190:4: ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) )
            	    // InternalSitemap.g:3191:5: {...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // InternalSitemap.g:3191:104: ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) )
            	    // InternalSitemap.g:3192:6: ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 7);
            	    					
            	    // InternalSitemap.g:3195:9: ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) )
            	    // InternalSitemap.g:3195:10: {...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWebview", "true");
            	    }
            	    // InternalSitemap.g:3195:19: (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) )
            	    // InternalSitemap.g:3195:20: otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' )
            	    {
            	    otherlv_22=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getWebviewAccess().getVisibilityKeyword_1_7_0());
            	    								
            	    // InternalSitemap.g:3199:9: ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' )
            	    // InternalSitemap.g:3200:10: ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']'
            	    {
            	    // InternalSitemap.g:3200:10: ( (lv_Visibility_23_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:3201:11: (lv_Visibility_23_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:3201:11: (lv_Visibility_23_0= ruleVisibilityRule )
            	    // InternalSitemap.g:3202:12: lv_Visibility_23_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getWebviewAccess().getVisibilityVisibilityRuleParserRuleCall_1_7_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_23_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getWebviewRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_23_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:3219:10: (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==20) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // InternalSitemap.g:3220:11: otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_24, grammarAccess.getWebviewAccess().getCommaKeyword_1_7_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:3224:11: ( (lv_Visibility_25_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:3225:12: (lv_Visibility_25_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:3225:12: (lv_Visibility_25_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:3226:13: lv_Visibility_25_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getWebviewAccess().getVisibilityVisibilityRuleParserRuleCall_1_7_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_25_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getWebviewRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_25_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);

            	    otherlv_26=(Token)match(input,21,FOLLOW_24); 

            	    										newLeafNode(otherlv_26, grammarAccess.getWebviewAccess().getRightSquareBracketKeyword_1_7_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWebviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getWebviewAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleWebview", "getUnorderedGroupHelper().canLeave(grammarAccess.getWebviewAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getWebviewAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleWebview"


    // $ANTLR start "entryRuleMapview"
    // InternalSitemap.g:3267:1: entryRuleMapview returns [EObject current=null] : iv_ruleMapview= ruleMapview EOF ;
    public final EObject entryRuleMapview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapview = null;


        try {
            // InternalSitemap.g:3267:48: (iv_ruleMapview= ruleMapview EOF )
            // InternalSitemap.g:3268:2: iv_ruleMapview= ruleMapview EOF
            {
             newCompositeNode(grammarAccess.getMapviewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapview=ruleMapview();

            state._fsp--;

             current =iv_ruleMapview; 
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
    // $ANTLR end "entryRuleMapview"


    // $ANTLR start "ruleMapview"
    // InternalSitemap.g:3274:1: ruleMapview returns [EObject current=null] : (otherlv_0= 'Mapview' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleMapview() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_height_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_LabelColor_11_0 = null;

        EObject lv_LabelColor_13_0 = null;

        EObject lv_ValueColor_16_0 = null;

        EObject lv_ValueColor_18_0 = null;

        EObject lv_Visibility_21_0 = null;

        EObject lv_Visibility_23_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:3280:2: ( (otherlv_0= 'Mapview' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:3281:2: (otherlv_0= 'Mapview' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:3281:2: (otherlv_0= 'Mapview' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:3282:3: otherlv_0= 'Mapview' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getMapviewAccess().getMapviewKeyword_0());
            		
            // InternalSitemap.g:3286:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:3287:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:3287:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:3288:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMapviewAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:3291:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:3292:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:3292:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=8;
                int LA49_0 = input.LA(1);

                if ( LA49_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 2) ) {
                    alt49=3;
                }
                else if ( LA49_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 3) ) {
                    alt49=4;
                }
                else if ( LA49_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 4) ) {
                    alt49=5;
                }
                else if ( LA49_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 5) ) {
                    alt49=6;
                }
                else if ( LA49_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 6) ) {
                    alt49=7;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalSitemap.g:3293:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3293:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:3294:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:3294:104: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:3295:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:3298:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:3298:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "true");
            	    }
            	    // InternalSitemap.g:3298:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:3298:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getMapviewAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:3302:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:3303:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:3303:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:3304:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getMapviewAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMapviewRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:3327:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3327:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:3328:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:3328:104: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:3329:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:3332:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:3332:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "true");
            	    }
            	    // InternalSitemap.g:3332:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:3332:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMapviewAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:3336:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:3337:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:3337:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:3338:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:3338:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==RULE_ID) ) {
            	        alt45=1;
            	    }
            	    else if ( (LA45_0==RULE_STRING) ) {
            	        alt45=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 45, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalSitemap.g:3339:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getMapviewAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMapviewRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:3354:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_26); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getMapviewAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMapviewRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:3377:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3377:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:3378:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:3378:104: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:3379:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:3382:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:3382:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "true");
            	    }
            	    // InternalSitemap.g:3382:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:3382:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMapviewAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:3386:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:3387:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:3387:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:3388:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getMapviewAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMapviewRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:3411:4: ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3411:4: ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) )
            	    // InternalSitemap.g:3412:5: {...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:3412:104: ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) )
            	    // InternalSitemap.g:3413:6: ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:3416:9: ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) )
            	    // InternalSitemap.g:3416:10: {...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "true");
            	    }
            	    // InternalSitemap.g:3416:19: (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) )
            	    // InternalSitemap.g:3416:20: otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,36,FOLLOW_18); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMapviewAccess().getHeightKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:3420:9: ( (lv_height_9_0= RULE_INT ) )
            	    // InternalSitemap.g:3421:10: (lv_height_9_0= RULE_INT )
            	    {
            	    // InternalSitemap.g:3421:10: (lv_height_9_0= RULE_INT )
            	    // InternalSitemap.g:3422:11: lv_height_9_0= RULE_INT
            	    {
            	    lv_height_9_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            	    											newLeafNode(lv_height_9_0, grammarAccess.getMapviewAccess().getHeightINTTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMapviewRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"height",
            	    												lv_height_9_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:3444:4: ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3444:4: ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) )
            	    // InternalSitemap.g:3445:5: {...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:3445:104: ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) )
            	    // InternalSitemap.g:3446:6: ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:3449:9: ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) )
            	    // InternalSitemap.g:3449:10: {...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "true");
            	    }
            	    // InternalSitemap.g:3449:19: (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) )
            	    // InternalSitemap.g:3449:20: otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' )
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getMapviewAccess().getLabelcolorKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:3453:9: ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' )
            	    // InternalSitemap.g:3454:10: ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']'
            	    {
            	    // InternalSitemap.g:3454:10: ( (lv_LabelColor_11_0= ruleColorArray ) )
            	    // InternalSitemap.g:3455:11: (lv_LabelColor_11_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:3455:11: (lv_LabelColor_11_0= ruleColorArray )
            	    // InternalSitemap.g:3456:12: lv_LabelColor_11_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getMapviewAccess().getLabelColorColorArrayParserRuleCall_1_4_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_11_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getMapviewRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_11_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:3473:10: (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==20) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // InternalSitemap.g:3474:11: otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_12, grammarAccess.getMapviewAccess().getCommaKeyword_1_4_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:3478:11: ( (lv_LabelColor_13_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:3479:12: (lv_LabelColor_13_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:3479:12: (lv_LabelColor_13_0= ruleColorArray )
            	    	    // InternalSitemap.g:3480:13: lv_LabelColor_13_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getMapviewAccess().getLabelColorColorArrayParserRuleCall_1_4_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_13_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getMapviewRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_13_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop46;
            	        }
            	    } while (true);

            	    otherlv_14=(Token)match(input,21,FOLLOW_26); 

            	    										newLeafNode(otherlv_14, grammarAccess.getMapviewAccess().getRightSquareBracketKeyword_1_4_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:3509:4: ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3509:4: ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) )
            	    // InternalSitemap.g:3510:5: {...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:3510:104: ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) )
            	    // InternalSitemap.g:3511:6: ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:3514:9: ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) )
            	    // InternalSitemap.g:3514:10: {...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "true");
            	    }
            	    // InternalSitemap.g:3514:19: (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) )
            	    // InternalSitemap.g:3514:20: otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' )
            	    {
            	    otherlv_15=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMapviewAccess().getValuecolorKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:3518:9: ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' )
            	    // InternalSitemap.g:3519:10: ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']'
            	    {
            	    // InternalSitemap.g:3519:10: ( (lv_ValueColor_16_0= ruleColorArray ) )
            	    // InternalSitemap.g:3520:11: (lv_ValueColor_16_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:3520:11: (lv_ValueColor_16_0= ruleColorArray )
            	    // InternalSitemap.g:3521:12: lv_ValueColor_16_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getMapviewAccess().getValueColorColorArrayParserRuleCall_1_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_16_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getMapviewRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_16_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:3538:10: (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==20) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // InternalSitemap.g:3539:11: otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_17, grammarAccess.getMapviewAccess().getCommaKeyword_1_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:3543:11: ( (lv_ValueColor_18_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:3544:12: (lv_ValueColor_18_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:3544:12: (lv_ValueColor_18_0= ruleColorArray )
            	    	    // InternalSitemap.g:3545:13: lv_ValueColor_18_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getMapviewAccess().getValueColorColorArrayParserRuleCall_1_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_18_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getMapviewRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_18_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,21,FOLLOW_26); 

            	    										newLeafNode(otherlv_19, grammarAccess.getMapviewAccess().getRightSquareBracketKeyword_1_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSitemap.g:3574:4: ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3574:4: ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) )
            	    // InternalSitemap.g:3575:5: {...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalSitemap.g:3575:104: ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) )
            	    // InternalSitemap.g:3576:6: ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMapviewAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalSitemap.g:3579:9: ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) )
            	    // InternalSitemap.g:3579:10: {...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMapview", "true");
            	    }
            	    // InternalSitemap.g:3579:19: (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) )
            	    // InternalSitemap.g:3579:20: otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' )
            	    {
            	    otherlv_20=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMapviewAccess().getVisibilityKeyword_1_6_0());
            	    								
            	    // InternalSitemap.g:3583:9: ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' )
            	    // InternalSitemap.g:3584:10: ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']'
            	    {
            	    // InternalSitemap.g:3584:10: ( (lv_Visibility_21_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:3585:11: (lv_Visibility_21_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:3585:11: (lv_Visibility_21_0= ruleVisibilityRule )
            	    // InternalSitemap.g:3586:12: lv_Visibility_21_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getMapviewAccess().getVisibilityVisibilityRuleParserRuleCall_1_6_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_21_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getMapviewRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_21_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:3603:10: (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==20) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalSitemap.g:3604:11: otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_22=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_22, grammarAccess.getMapviewAccess().getCommaKeyword_1_6_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:3608:11: ( (lv_Visibility_23_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:3609:12: (lv_Visibility_23_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:3609:12: (lv_Visibility_23_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:3610:13: lv_Visibility_23_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getMapviewAccess().getVisibilityVisibilityRuleParserRuleCall_1_6_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_23_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getMapviewRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_23_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);

            	    otherlv_24=(Token)match(input,21,FOLLOW_26); 

            	    										newLeafNode(otherlv_24, grammarAccess.getMapviewAccess().getRightSquareBracketKeyword_1_6_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapviewAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMapviewAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleMapview", "getUnorderedGroupHelper().canLeave(grammarAccess.getMapviewAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMapviewAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleMapview"


    // $ANTLR start "entryRuleSwitch"
    // InternalSitemap.g:3651:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalSitemap.g:3651:47: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalSitemap.g:3652:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
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
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalSitemap.g:3658:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'Switch' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_mappings_9_0 = null;

        EObject lv_mappings_11_0 = null;

        EObject lv_LabelColor_14_0 = null;

        EObject lv_LabelColor_16_0 = null;

        EObject lv_ValueColor_19_0 = null;

        EObject lv_ValueColor_21_0 = null;

        EObject lv_Visibility_24_0 = null;

        EObject lv_Visibility_26_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:3664:2: ( (otherlv_0= 'Switch' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:3665:2: (otherlv_0= 'Switch' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:3665:2: (otherlv_0= 'Switch' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:3666:3: otherlv_0= 'Switch' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
            		
            // InternalSitemap.g:3670:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:3671:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:3671:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:3672:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSwitchAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:3675:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:3676:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:3676:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=8;
                int LA55_0 = input.LA(1);

                if ( LA55_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 0) ) {
                    alt55=1;
                }
                else if ( LA55_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 1) ) {
                    alt55=2;
                }
                else if ( LA55_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 2) ) {
                    alt55=3;
                }
                else if ( LA55_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 3) ) {
                    alt55=4;
                }
                else if ( LA55_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 4) ) {
                    alt55=5;
                }
                else if ( LA55_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 5) ) {
                    alt55=6;
                }
                else if ( LA55_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 6) ) {
                    alt55=7;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalSitemap.g:3677:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3677:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:3678:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:3678:103: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:3679:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:3682:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:3682:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "true");
            	    }
            	    // InternalSitemap.g:3682:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:3682:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getSwitchAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:3686:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:3687:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:3687:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:3688:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getSwitchAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSwitchAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:3711:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3711:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:3712:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:3712:103: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:3713:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:3716:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:3716:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "true");
            	    }
            	    // InternalSitemap.g:3716:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:3716:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:3720:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:3721:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:3721:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:3722:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:3722:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==RULE_ID) ) {
            	        alt50=1;
            	    }
            	    else if ( (LA50_0==RULE_STRING) ) {
            	        alt50=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 50, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalSitemap.g:3723:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getSwitchAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getSwitchRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:3738:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getSwitchAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getSwitchRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSwitchAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:3761:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3761:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:3762:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:3762:103: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:3763:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:3766:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:3766:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "true");
            	    }
            	    // InternalSitemap.g:3766:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:3766:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSwitchAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:3770:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:3771:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:3771:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:3772:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getSwitchAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSwitchAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:3795:4: ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) )
            	    {
            	    // InternalSitemap.g:3795:4: ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) )
            	    // InternalSitemap.g:3796:5: {...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:3796:103: ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) )
            	    // InternalSitemap.g:3797:6: ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:3800:9: ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) )
            	    // InternalSitemap.g:3800:10: {...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "true");
            	    }
            	    // InternalSitemap.g:3800:19: (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' )
            	    // InternalSitemap.g:3800:20: otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']'
            	    {
            	    otherlv_8=(Token)match(input,39,FOLLOW_29); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSwitchAccess().getMappingsKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:3804:9: ( (lv_mappings_9_0= ruleMapping ) )
            	    // InternalSitemap.g:3805:10: (lv_mappings_9_0= ruleMapping )
            	    {
            	    // InternalSitemap.g:3805:10: (lv_mappings_9_0= ruleMapping )
            	    // InternalSitemap.g:3806:11: lv_mappings_9_0= ruleMapping
            	    {

            	    											newCompositeNode(grammarAccess.getSwitchAccess().getMappingsMappingParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_mappings_9_0=ruleMapping();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    											}
            	    											add(
            	    												current,
            	    												"mappings",
            	    												lv_mappings_9_0,
            	    												"org.xtext.example.sitemap.Sitemap.Mapping");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalSitemap.g:3823:9: (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==20) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // InternalSitemap.g:3824:10: otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,20,FOLLOW_29); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getSwitchAccess().getCommaKeyword_1_3_2_0());
            	    	    									
            	    	    // InternalSitemap.g:3828:10: ( (lv_mappings_11_0= ruleMapping ) )
            	    	    // InternalSitemap.g:3829:11: (lv_mappings_11_0= ruleMapping )
            	    	    {
            	    	    // InternalSitemap.g:3829:11: (lv_mappings_11_0= ruleMapping )
            	    	    // InternalSitemap.g:3830:12: lv_mappings_11_0= ruleMapping
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSwitchAccess().getMappingsMappingParserRuleCall_1_3_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_mappings_11_0=ruleMapping();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"mappings",
            	    	    													lv_mappings_11_0,
            	    	    													"org.xtext.example.sitemap.Sitemap.Mapping");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,21,FOLLOW_28); 

            	    									newLeafNode(otherlv_12, grammarAccess.getSwitchAccess().getRightSquareBracketKeyword_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSwitchAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:3858:4: ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3858:4: ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) )
            	    // InternalSitemap.g:3859:5: {...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:3859:103: ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) )
            	    // InternalSitemap.g:3860:6: ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:3863:9: ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) )
            	    // InternalSitemap.g:3863:10: {...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "true");
            	    }
            	    // InternalSitemap.g:3863:19: (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) )
            	    // InternalSitemap.g:3863:20: otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' )
            	    {
            	    otherlv_13=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_13, grammarAccess.getSwitchAccess().getLabelcolorKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:3867:9: ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' )
            	    // InternalSitemap.g:3868:10: ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']'
            	    {
            	    // InternalSitemap.g:3868:10: ( (lv_LabelColor_14_0= ruleColorArray ) )
            	    // InternalSitemap.g:3869:11: (lv_LabelColor_14_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:3869:11: (lv_LabelColor_14_0= ruleColorArray )
            	    // InternalSitemap.g:3870:12: lv_LabelColor_14_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getSwitchAccess().getLabelColorColorArrayParserRuleCall_1_4_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_14_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_14_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:3887:10: (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==20) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // InternalSitemap.g:3888:11: otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_15, grammarAccess.getSwitchAccess().getCommaKeyword_1_4_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:3892:11: ( (lv_LabelColor_16_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:3893:12: (lv_LabelColor_16_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:3893:12: (lv_LabelColor_16_0= ruleColorArray )
            	    	    // InternalSitemap.g:3894:13: lv_LabelColor_16_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSwitchAccess().getLabelColorColorArrayParserRuleCall_1_4_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_16_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_16_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop52;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,21,FOLLOW_28); 

            	    										newLeafNode(otherlv_17, grammarAccess.getSwitchAccess().getRightSquareBracketKeyword_1_4_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSwitchAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:3923:4: ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3923:4: ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) )
            	    // InternalSitemap.g:3924:5: {...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:3924:103: ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) )
            	    // InternalSitemap.g:3925:6: ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:3928:9: ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) )
            	    // InternalSitemap.g:3928:10: {...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "true");
            	    }
            	    // InternalSitemap.g:3928:19: (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) )
            	    // InternalSitemap.g:3928:20: otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' )
            	    {
            	    otherlv_18=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_18, grammarAccess.getSwitchAccess().getValuecolorKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:3932:9: ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' )
            	    // InternalSitemap.g:3933:10: ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']'
            	    {
            	    // InternalSitemap.g:3933:10: ( (lv_ValueColor_19_0= ruleColorArray ) )
            	    // InternalSitemap.g:3934:11: (lv_ValueColor_19_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:3934:11: (lv_ValueColor_19_0= ruleColorArray )
            	    // InternalSitemap.g:3935:12: lv_ValueColor_19_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getSwitchAccess().getValueColorColorArrayParserRuleCall_1_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_19_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_19_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:3952:10: (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( (LA53_0==20) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // InternalSitemap.g:3953:11: otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_20=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_20, grammarAccess.getSwitchAccess().getCommaKeyword_1_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:3957:11: ( (lv_ValueColor_21_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:3958:12: (lv_ValueColor_21_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:3958:12: (lv_ValueColor_21_0= ruleColorArray )
            	    	    // InternalSitemap.g:3959:13: lv_ValueColor_21_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSwitchAccess().getValueColorColorArrayParserRuleCall_1_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_21_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_21_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop53;
            	        }
            	    } while (true);

            	    otherlv_22=(Token)match(input,21,FOLLOW_28); 

            	    										newLeafNode(otherlv_22, grammarAccess.getSwitchAccess().getRightSquareBracketKeyword_1_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSwitchAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSitemap.g:3988:4: ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:3988:4: ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) )
            	    // InternalSitemap.g:3989:5: {...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "getUnorderedGroupHelper().canSelect(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalSitemap.g:3989:103: ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) )
            	    // InternalSitemap.g:3990:6: ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSwitchAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalSitemap.g:3993:9: ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) )
            	    // InternalSitemap.g:3993:10: {...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSwitch", "true");
            	    }
            	    // InternalSitemap.g:3993:19: (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) )
            	    // InternalSitemap.g:3993:20: otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' )
            	    {
            	    otherlv_23=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_23, grammarAccess.getSwitchAccess().getVisibilityKeyword_1_6_0());
            	    								
            	    // InternalSitemap.g:3997:9: ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' )
            	    // InternalSitemap.g:3998:10: ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']'
            	    {
            	    // InternalSitemap.g:3998:10: ( (lv_Visibility_24_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:3999:11: (lv_Visibility_24_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:3999:11: (lv_Visibility_24_0= ruleVisibilityRule )
            	    // InternalSitemap.g:4000:12: lv_Visibility_24_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getSwitchAccess().getVisibilityVisibilityRuleParserRuleCall_1_6_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_24_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_24_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:4017:10: (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        int LA54_0 = input.LA(1);

            	        if ( (LA54_0==20) ) {
            	            alt54=1;
            	        }


            	        switch (alt54) {
            	    	case 1 :
            	    	    // InternalSitemap.g:4018:11: otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_25=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_25, grammarAccess.getSwitchAccess().getCommaKeyword_1_6_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:4022:11: ( (lv_Visibility_26_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:4023:12: (lv_Visibility_26_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:4023:12: (lv_Visibility_26_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:4024:13: lv_Visibility_26_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSwitchAccess().getVisibilityVisibilityRuleParserRuleCall_1_6_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_26_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_26_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop54;
            	        }
            	    } while (true);

            	    otherlv_27=(Token)match(input,21,FOLLOW_28); 

            	    										newLeafNode(otherlv_27, grammarAccess.getSwitchAccess().getRightSquareBracketKeyword_1_6_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSwitchAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSwitchAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSwitch", "getUnorderedGroupHelper().canLeave(grammarAccess.getSwitchAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSwitchAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleSlider"
    // InternalSitemap.g:4065:1: entryRuleSlider returns [EObject current=null] : iv_ruleSlider= ruleSlider EOF ;
    public final EObject entryRuleSlider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlider = null;


        try {
            // InternalSitemap.g:4065:47: (iv_ruleSlider= ruleSlider EOF )
            // InternalSitemap.g:4066:2: iv_ruleSlider= ruleSlider EOF
            {
             newCompositeNode(grammarAccess.getSliderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlider=ruleSlider();

            state._fsp--;

             current =iv_ruleSlider; 
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
    // $ANTLR end "entryRuleSlider"


    // $ANTLR start "ruleSlider"
    // InternalSitemap.g:4072:1: ruleSlider returns [EObject current=null] : (otherlv_0= 'Slider' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleSlider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_frequency_9_0=null;
        Token lv_switchEnabled_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_LabelColor_12_0 = null;

        EObject lv_LabelColor_14_0 = null;

        EObject lv_ValueColor_17_0 = null;

        EObject lv_ValueColor_19_0 = null;

        EObject lv_Visibility_22_0 = null;

        EObject lv_Visibility_24_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:4078:2: ( (otherlv_0= 'Slider' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:4079:2: (otherlv_0= 'Slider' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:4079:2: (otherlv_0= 'Slider' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:4080:3: otherlv_0= 'Slider' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSliderAccess().getSliderKeyword_0());
            		
            // InternalSitemap.g:4084:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:4085:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:4085:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:4086:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSliderAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:4089:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:4090:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:4090:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=9;
                alt60 = dfa60.predict(input);
                switch (alt60) {
            	case 1 :
            	    // InternalSitemap.g:4091:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4091:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:4092:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:4092:103: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:4093:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:4096:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:4096:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "true");
            	    }
            	    // InternalSitemap.g:4096:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:4096:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getSliderAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:4100:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:4101:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:4101:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:4102:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getSliderAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSliderRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSliderAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:4125:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4125:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:4126:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:4126:103: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:4127:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:4130:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:4130:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "true");
            	    }
            	    // InternalSitemap.g:4130:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:4130:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSliderAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:4134:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:4135:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:4135:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:4136:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:4136:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==RULE_ID) ) {
            	        alt56=1;
            	    }
            	    else if ( (LA56_0==RULE_STRING) ) {
            	        alt56=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 56, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // InternalSitemap.g:4137:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getSliderAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getSliderRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:4152:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getSliderAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getSliderRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSliderAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:4175:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4175:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:4176:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:4176:103: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:4177:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:4180:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:4180:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "true");
            	    }
            	    // InternalSitemap.g:4180:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:4180:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSliderAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:4184:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:4185:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:4185:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:4186:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getSliderAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSliderRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSliderAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:4209:4: ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4209:4: ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) )
            	    // InternalSitemap.g:4210:5: {...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:4210:103: ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) )
            	    // InternalSitemap.g:4211:6: ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:4214:9: ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) )
            	    // InternalSitemap.g:4214:10: {...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "true");
            	    }
            	    // InternalSitemap.g:4214:19: (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) )
            	    // InternalSitemap.g:4214:20: otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,41,FOLLOW_18); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSliderAccess().getSendFrequencyKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:4218:9: ( (lv_frequency_9_0= RULE_INT ) )
            	    // InternalSitemap.g:4219:10: (lv_frequency_9_0= RULE_INT )
            	    {
            	    // InternalSitemap.g:4219:10: (lv_frequency_9_0= RULE_INT )
            	    // InternalSitemap.g:4220:11: lv_frequency_9_0= RULE_INT
            	    {
            	    lv_frequency_9_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            	    											newLeafNode(lv_frequency_9_0, grammarAccess.getSliderAccess().getFrequencyINTTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSliderRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"frequency",
            	    												lv_frequency_9_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSliderAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:4242:4: ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4242:4: ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) )
            	    // InternalSitemap.g:4243:5: {...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:4243:103: ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) )
            	    // InternalSitemap.g:4244:6: ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:4247:9: ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) )
            	    // InternalSitemap.g:4247:10: {...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "true");
            	    }
            	    // InternalSitemap.g:4247:19: ( (lv_switchEnabled_10_0= 'switchSupport' ) )
            	    // InternalSitemap.g:4247:20: (lv_switchEnabled_10_0= 'switchSupport' )
            	    {
            	    // InternalSitemap.g:4247:20: (lv_switchEnabled_10_0= 'switchSupport' )
            	    // InternalSitemap.g:4248:10: lv_switchEnabled_10_0= 'switchSupport'
            	    {
            	    lv_switchEnabled_10_0=(Token)match(input,42,FOLLOW_31); 

            	    										newLeafNode(lv_switchEnabled_10_0, grammarAccess.getSliderAccess().getSwitchEnabledSwitchSupportKeyword_1_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getSliderRule());
            	    										}
            	    										setWithLastConsumed(current, "switchEnabled", true, "switchSupport");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSliderAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:4265:4: ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4265:4: ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalSitemap.g:4266:5: {...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:4266:103: ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalSitemap.g:4267:6: ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:4270:9: ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) )
            	    // InternalSitemap.g:4270:10: {...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "true");
            	    }
            	    // InternalSitemap.g:4270:19: (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) )
            	    // InternalSitemap.g:4270:20: otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' )
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_11, grammarAccess.getSliderAccess().getLabelcolorKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:4274:9: ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' )
            	    // InternalSitemap.g:4275:10: ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']'
            	    {
            	    // InternalSitemap.g:4275:10: ( (lv_LabelColor_12_0= ruleColorArray ) )
            	    // InternalSitemap.g:4276:11: (lv_LabelColor_12_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:4276:11: (lv_LabelColor_12_0= ruleColorArray )
            	    // InternalSitemap.g:4277:12: lv_LabelColor_12_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getSliderAccess().getLabelColorColorArrayParserRuleCall_1_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_12_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSliderRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_12_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:4294:10: (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )*
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==20) ) {
            	            alt57=1;
            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // InternalSitemap.g:4295:11: otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_13, grammarAccess.getSliderAccess().getCommaKeyword_1_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:4299:11: ( (lv_LabelColor_14_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:4300:12: (lv_LabelColor_14_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:4300:12: (lv_LabelColor_14_0= ruleColorArray )
            	    	    // InternalSitemap.g:4301:13: lv_LabelColor_14_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSliderAccess().getLabelColorColorArrayParserRuleCall_1_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_14_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSliderRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_14_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop57;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,21,FOLLOW_31); 

            	    										newLeafNode(otherlv_15, grammarAccess.getSliderAccess().getRightSquareBracketKeyword_1_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSliderAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSitemap.g:4330:4: ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4330:4: ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) )
            	    // InternalSitemap.g:4331:5: {...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalSitemap.g:4331:103: ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) )
            	    // InternalSitemap.g:4332:6: ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalSitemap.g:4335:9: ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) )
            	    // InternalSitemap.g:4335:10: {...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "true");
            	    }
            	    // InternalSitemap.g:4335:19: (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) )
            	    // InternalSitemap.g:4335:20: otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' )
            	    {
            	    otherlv_16=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_16, grammarAccess.getSliderAccess().getValuecolorKeyword_1_6_0());
            	    								
            	    // InternalSitemap.g:4339:9: ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' )
            	    // InternalSitemap.g:4340:10: ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']'
            	    {
            	    // InternalSitemap.g:4340:10: ( (lv_ValueColor_17_0= ruleColorArray ) )
            	    // InternalSitemap.g:4341:11: (lv_ValueColor_17_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:4341:11: (lv_ValueColor_17_0= ruleColorArray )
            	    // InternalSitemap.g:4342:12: lv_ValueColor_17_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getSliderAccess().getValueColorColorArrayParserRuleCall_1_6_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_17_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSliderRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_17_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:4359:10: (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )*
            	    loop58:
            	    do {
            	        int alt58=2;
            	        int LA58_0 = input.LA(1);

            	        if ( (LA58_0==20) ) {
            	            alt58=1;
            	        }


            	        switch (alt58) {
            	    	case 1 :
            	    	    // InternalSitemap.g:4360:11: otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_18, grammarAccess.getSliderAccess().getCommaKeyword_1_6_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:4364:11: ( (lv_ValueColor_19_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:4365:12: (lv_ValueColor_19_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:4365:12: (lv_ValueColor_19_0= ruleColorArray )
            	    	    // InternalSitemap.g:4366:13: lv_ValueColor_19_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSliderAccess().getValueColorColorArrayParserRuleCall_1_6_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_19_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSliderRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_19_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop58;
            	        }
            	    } while (true);

            	    otherlv_20=(Token)match(input,21,FOLLOW_31); 

            	    										newLeafNode(otherlv_20, grammarAccess.getSliderAccess().getRightSquareBracketKeyword_1_6_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSliderAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalSitemap.g:4395:4: ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4395:4: ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) )
            	    // InternalSitemap.g:4396:5: {...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // InternalSitemap.g:4396:103: ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) )
            	    // InternalSitemap.g:4397:6: ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 7);
            	    					
            	    // InternalSitemap.g:4400:9: ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) )
            	    // InternalSitemap.g:4400:10: {...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSlider", "true");
            	    }
            	    // InternalSitemap.g:4400:19: (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) )
            	    // InternalSitemap.g:4400:20: otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' )
            	    {
            	    otherlv_21=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getSliderAccess().getVisibilityKeyword_1_7_0());
            	    								
            	    // InternalSitemap.g:4404:9: ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' )
            	    // InternalSitemap.g:4405:10: ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']'
            	    {
            	    // InternalSitemap.g:4405:10: ( (lv_Visibility_22_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:4406:11: (lv_Visibility_22_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:4406:11: (lv_Visibility_22_0= ruleVisibilityRule )
            	    // InternalSitemap.g:4407:12: lv_Visibility_22_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getSliderAccess().getVisibilityVisibilityRuleParserRuleCall_1_7_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_22_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSliderRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_22_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:4424:10: (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==20) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // InternalSitemap.g:4425:11: otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_23, grammarAccess.getSliderAccess().getCommaKeyword_1_7_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:4429:11: ( (lv_Visibility_24_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:4430:12: (lv_Visibility_24_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:4430:12: (lv_Visibility_24_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:4431:13: lv_Visibility_24_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSliderAccess().getVisibilityVisibilityRuleParserRuleCall_1_7_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_24_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSliderRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_24_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop59;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,21,FOLLOW_31); 

            	    										newLeafNode(otherlv_25, grammarAccess.getSliderAccess().getRightSquareBracketKeyword_1_7_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSliderAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSliderAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSlider", "getUnorderedGroupHelper().canLeave(grammarAccess.getSliderAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSliderAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleSlider"


    // $ANTLR start "entryRuleSelection"
    // InternalSitemap.g:4472:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // InternalSitemap.g:4472:50: (iv_ruleSelection= ruleSelection EOF )
            // InternalSitemap.g:4473:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
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
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalSitemap.g:4479:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'Selection' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_mappings_9_0 = null;

        EObject lv_mappings_11_0 = null;

        EObject lv_LabelColor_14_0 = null;

        EObject lv_LabelColor_16_0 = null;

        EObject lv_ValueColor_19_0 = null;

        EObject lv_ValueColor_21_0 = null;

        EObject lv_Visibility_24_0 = null;

        EObject lv_Visibility_26_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:4485:2: ( (otherlv_0= 'Selection' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:4486:2: (otherlv_0= 'Selection' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:4486:2: (otherlv_0= 'Selection' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:4487:3: otherlv_0= 'Selection' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectionKeyword_0());
            		
            // InternalSitemap.g:4491:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:4492:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:4492:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:4493:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSelectionAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:4496:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:4497:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:4497:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) ) )+
            int cnt66=0;
            loop66:
            do {
                int alt66=8;
                int LA66_0 = input.LA(1);

                if ( LA66_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 0) ) {
                    alt66=1;
                }
                else if ( LA66_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 1) ) {
                    alt66=2;
                }
                else if ( LA66_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 2) ) {
                    alt66=3;
                }
                else if ( LA66_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 3) ) {
                    alt66=4;
                }
                else if ( LA66_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 4) ) {
                    alt66=5;
                }
                else if ( LA66_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 5) ) {
                    alt66=6;
                }
                else if ( LA66_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 6) ) {
                    alt66=7;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalSitemap.g:4498:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4498:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:4499:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:4499:106: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:4500:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:4503:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:4503:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "true");
            	    }
            	    // InternalSitemap.g:4503:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:4503:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:4507:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:4508:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:4508:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:4509:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getSelectionAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSelectionAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:4532:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4532:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:4533:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:4533:106: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:4534:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:4537:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:4537:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "true");
            	    }
            	    // InternalSitemap.g:4537:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:4537:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSelectionAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:4541:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:4542:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:4542:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:4543:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:4543:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==RULE_ID) ) {
            	        alt61=1;
            	    }
            	    else if ( (LA61_0==RULE_STRING) ) {
            	        alt61=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 61, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // InternalSitemap.g:4544:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getSelectionAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getSelectionRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:4559:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getSelectionAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getSelectionRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSelectionAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:4582:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4582:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:4583:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:4583:106: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:4584:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:4587:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:4587:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "true");
            	    }
            	    // InternalSitemap.g:4587:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:4587:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSelectionAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:4591:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:4592:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:4592:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:4593:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getSelectionAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSelectionAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:4616:4: ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) )
            	    {
            	    // InternalSitemap.g:4616:4: ({...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) ) )
            	    // InternalSitemap.g:4617:5: {...}? => ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:4617:106: ( ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) ) )
            	    // InternalSitemap.g:4618:6: ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:4621:9: ({...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' ) )
            	    // InternalSitemap.g:4621:10: {...}? => (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "true");
            	    }
            	    // InternalSitemap.g:4621:19: (otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']' )
            	    // InternalSitemap.g:4621:20: otherlv_8= 'mappings=[' ( (lv_mappings_9_0= ruleMapping ) ) (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )* otherlv_12= ']'
            	    {
            	    otherlv_8=(Token)match(input,39,FOLLOW_29); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSelectionAccess().getMappingsKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:4625:9: ( (lv_mappings_9_0= ruleMapping ) )
            	    // InternalSitemap.g:4626:10: (lv_mappings_9_0= ruleMapping )
            	    {
            	    // InternalSitemap.g:4626:10: (lv_mappings_9_0= ruleMapping )
            	    // InternalSitemap.g:4627:11: lv_mappings_9_0= ruleMapping
            	    {

            	    											newCompositeNode(grammarAccess.getSelectionAccess().getMappingsMappingParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_mappings_9_0=ruleMapping();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    											}
            	    											add(
            	    												current,
            	    												"mappings",
            	    												lv_mappings_9_0,
            	    												"org.xtext.example.sitemap.Sitemap.Mapping");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalSitemap.g:4644:9: (otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) ) )*
            	    loop62:
            	    do {
            	        int alt62=2;
            	        int LA62_0 = input.LA(1);

            	        if ( (LA62_0==20) ) {
            	            alt62=1;
            	        }


            	        switch (alt62) {
            	    	case 1 :
            	    	    // InternalSitemap.g:4645:10: otherlv_10= ',' ( (lv_mappings_11_0= ruleMapping ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,20,FOLLOW_29); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getSelectionAccess().getCommaKeyword_1_3_2_0());
            	    	    									
            	    	    // InternalSitemap.g:4649:10: ( (lv_mappings_11_0= ruleMapping ) )
            	    	    // InternalSitemap.g:4650:11: (lv_mappings_11_0= ruleMapping )
            	    	    {
            	    	    // InternalSitemap.g:4650:11: (lv_mappings_11_0= ruleMapping )
            	    	    // InternalSitemap.g:4651:12: lv_mappings_11_0= ruleMapping
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSelectionAccess().getMappingsMappingParserRuleCall_1_3_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_mappings_11_0=ruleMapping();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"mappings",
            	    	    													lv_mappings_11_0,
            	    	    													"org.xtext.example.sitemap.Sitemap.Mapping");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop62;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,21,FOLLOW_28); 

            	    									newLeafNode(otherlv_12, grammarAccess.getSelectionAccess().getRightSquareBracketKeyword_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSelectionAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:4679:4: ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4679:4: ({...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) ) )
            	    // InternalSitemap.g:4680:5: {...}? => ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:4680:106: ( ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) ) )
            	    // InternalSitemap.g:4681:6: ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:4684:9: ({...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) ) )
            	    // InternalSitemap.g:4684:10: {...}? => (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "true");
            	    }
            	    // InternalSitemap.g:4684:19: (otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' ) )
            	    // InternalSitemap.g:4684:20: otherlv_13= 'labelcolor=[' ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' )
            	    {
            	    otherlv_13=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_13, grammarAccess.getSelectionAccess().getLabelcolorKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:4688:9: ( ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']' )
            	    // InternalSitemap.g:4689:10: ( (lv_LabelColor_14_0= ruleColorArray ) ) (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )* otherlv_17= ']'
            	    {
            	    // InternalSitemap.g:4689:10: ( (lv_LabelColor_14_0= ruleColorArray ) )
            	    // InternalSitemap.g:4690:11: (lv_LabelColor_14_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:4690:11: (lv_LabelColor_14_0= ruleColorArray )
            	    // InternalSitemap.g:4691:12: lv_LabelColor_14_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getSelectionAccess().getLabelColorColorArrayParserRuleCall_1_4_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_14_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_14_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:4708:10: (otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) ) )*
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==20) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // InternalSitemap.g:4709:11: otherlv_15= ',' ( (lv_LabelColor_16_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_15, grammarAccess.getSelectionAccess().getCommaKeyword_1_4_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:4713:11: ( (lv_LabelColor_16_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:4714:12: (lv_LabelColor_16_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:4714:12: (lv_LabelColor_16_0= ruleColorArray )
            	    	    // InternalSitemap.g:4715:13: lv_LabelColor_16_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSelectionAccess().getLabelColorColorArrayParserRuleCall_1_4_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_16_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_16_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop63;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,21,FOLLOW_28); 

            	    										newLeafNode(otherlv_17, grammarAccess.getSelectionAccess().getRightSquareBracketKeyword_1_4_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSelectionAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:4744:4: ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4744:4: ({...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) ) )
            	    // InternalSitemap.g:4745:5: {...}? => ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:4745:106: ( ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) ) )
            	    // InternalSitemap.g:4746:6: ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:4749:9: ({...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) ) )
            	    // InternalSitemap.g:4749:10: {...}? => (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "true");
            	    }
            	    // InternalSitemap.g:4749:19: (otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' ) )
            	    // InternalSitemap.g:4749:20: otherlv_18= 'valuecolor=[' ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' )
            	    {
            	    otherlv_18=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_18, grammarAccess.getSelectionAccess().getValuecolorKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:4753:9: ( ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']' )
            	    // InternalSitemap.g:4754:10: ( (lv_ValueColor_19_0= ruleColorArray ) ) (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )* otherlv_22= ']'
            	    {
            	    // InternalSitemap.g:4754:10: ( (lv_ValueColor_19_0= ruleColorArray ) )
            	    // InternalSitemap.g:4755:11: (lv_ValueColor_19_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:4755:11: (lv_ValueColor_19_0= ruleColorArray )
            	    // InternalSitemap.g:4756:12: lv_ValueColor_19_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getSelectionAccess().getValueColorColorArrayParserRuleCall_1_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_19_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_19_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:4773:10: (otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) ) )*
            	    loop64:
            	    do {
            	        int alt64=2;
            	        int LA64_0 = input.LA(1);

            	        if ( (LA64_0==20) ) {
            	            alt64=1;
            	        }


            	        switch (alt64) {
            	    	case 1 :
            	    	    // InternalSitemap.g:4774:11: otherlv_20= ',' ( (lv_ValueColor_21_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_20=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_20, grammarAccess.getSelectionAccess().getCommaKeyword_1_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:4778:11: ( (lv_ValueColor_21_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:4779:12: (lv_ValueColor_21_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:4779:12: (lv_ValueColor_21_0= ruleColorArray )
            	    	    // InternalSitemap.g:4780:13: lv_ValueColor_21_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSelectionAccess().getValueColorColorArrayParserRuleCall_1_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_21_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_21_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop64;
            	        }
            	    } while (true);

            	    otherlv_22=(Token)match(input,21,FOLLOW_28); 

            	    										newLeafNode(otherlv_22, grammarAccess.getSelectionAccess().getRightSquareBracketKeyword_1_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSelectionAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSitemap.g:4809:4: ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4809:4: ({...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) ) )
            	    // InternalSitemap.g:4810:5: {...}? => ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "getUnorderedGroupHelper().canSelect(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalSitemap.g:4810:106: ( ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) ) )
            	    // InternalSitemap.g:4811:6: ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSelectionAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalSitemap.g:4814:9: ({...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) ) )
            	    // InternalSitemap.g:4814:10: {...}? => (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSelection", "true");
            	    }
            	    // InternalSitemap.g:4814:19: (otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' ) )
            	    // InternalSitemap.g:4814:20: otherlv_23= 'visibility=[' ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' )
            	    {
            	    otherlv_23=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_23, grammarAccess.getSelectionAccess().getVisibilityKeyword_1_6_0());
            	    								
            	    // InternalSitemap.g:4818:9: ( ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']' )
            	    // InternalSitemap.g:4819:10: ( (lv_Visibility_24_0= ruleVisibilityRule ) ) (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )* otherlv_27= ']'
            	    {
            	    // InternalSitemap.g:4819:10: ( (lv_Visibility_24_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:4820:11: (lv_Visibility_24_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:4820:11: (lv_Visibility_24_0= ruleVisibilityRule )
            	    // InternalSitemap.g:4821:12: lv_Visibility_24_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getSelectionAccess().getVisibilityVisibilityRuleParserRuleCall_1_6_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_24_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_24_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:4838:10: (otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) ) )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==20) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalSitemap.g:4839:11: otherlv_25= ',' ( (lv_Visibility_26_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_25=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_25, grammarAccess.getSelectionAccess().getCommaKeyword_1_6_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:4843:11: ( (lv_Visibility_26_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:4844:12: (lv_Visibility_26_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:4844:12: (lv_Visibility_26_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:4845:13: lv_Visibility_26_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSelectionAccess().getVisibilityVisibilityRuleParserRuleCall_1_6_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_26_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSelectionRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_26_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop65;
            	        }
            	    } while (true);

            	    otherlv_27=(Token)match(input,21,FOLLOW_28); 

            	    										newLeafNode(otherlv_27, grammarAccess.getSelectionAccess().getRightSquareBracketKeyword_1_6_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSelectionAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSelectionAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSelection", "getUnorderedGroupHelper().canLeave(grammarAccess.getSelectionAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSelectionAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleList"
    // InternalSitemap.g:4886:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalSitemap.g:4886:45: (iv_ruleList= ruleList EOF )
            // InternalSitemap.g:4887:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalSitemap.g:4893:1: ruleList returns [EObject current=null] : (otherlv_0= 'List' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_separator_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_LabelColor_11_0 = null;

        EObject lv_LabelColor_13_0 = null;

        EObject lv_ValueColor_16_0 = null;

        EObject lv_ValueColor_18_0 = null;

        EObject lv_Visibility_21_0 = null;

        EObject lv_Visibility_23_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:4899:2: ( (otherlv_0= 'List' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:4900:2: (otherlv_0= 'List' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:4900:2: (otherlv_0= 'List' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:4901:3: otherlv_0= 'List' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
            		
            // InternalSitemap.g:4905:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:4906:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:4906:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:4907:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getListAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:4910:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:4911:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:4911:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=7;
                int LA72_0 = input.LA(1);

                if ( LA72_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 0) ) {
                    alt72=1;
                }
                else if ( LA72_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 1) ) {
                    alt72=2;
                }
                else if ( ( LA72_0 == 14 || LA72_0 == 45 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 2) ) {
                    alt72=3;
                }
                else if ( LA72_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 3) ) {
                    alt72=4;
                }
                else if ( LA72_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 4) ) {
                    alt72=5;
                }
                else if ( LA72_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 5) ) {
                    alt72=6;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalSitemap.g:4912:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4912:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:4913:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleList", "getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:4913:101: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:4914:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getListAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:4917:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:4917:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleList", "true");
            	    }
            	    // InternalSitemap.g:4917:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:4917:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getListAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:4921:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:4922:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:4922:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:4923:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getListAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_33);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getListRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getListAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:4946:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4946:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:4947:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleList", "getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:4947:101: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:4948:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getListAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:4951:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:4951:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleList", "true");
            	    }
            	    // InternalSitemap.g:4951:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:4951:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getListAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:4955:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:4956:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:4956:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:4957:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:4957:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==RULE_ID) ) {
            	        alt67=1;
            	    }
            	    else if ( (LA67_0==RULE_STRING) ) {
            	        alt67=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 67, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalSitemap.g:4958:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getListAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getListRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:4973:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_33); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getListAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getListRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getListAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:4996:4: ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:4996:4: ({...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:4997:5: {...}? => ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleList", "getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:4997:101: ( ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:4998:6: ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getListAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:5001:9: ({...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:5001:10: {...}? => ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleList", "true");
            	    }
            	    // InternalSitemap.g:5001:19: ( (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:5001:20: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )? (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) )
            	    {
            	    // InternalSitemap.g:5001:20: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==14) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalSitemap.g:5002:10: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	            										newLeafNode(otherlv_6, grammarAccess.getListAccess().getIconKeyword_1_2_0_0());
            	            									
            	            // InternalSitemap.g:5006:10: ( (lv_icon_7_0= ruleIcon ) )
            	            // InternalSitemap.g:5007:11: (lv_icon_7_0= ruleIcon )
            	            {
            	            // InternalSitemap.g:5007:11: (lv_icon_7_0= ruleIcon )
            	            // InternalSitemap.g:5008:12: lv_icon_7_0= ruleIcon
            	            {

            	            												newCompositeNode(grammarAccess.getListAccess().getIconIconParserRuleCall_1_2_0_1_0());
            	            											
            	            pushFollow(FOLLOW_34);
            	            lv_icon_7_0=ruleIcon();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getListRule());
            	            												}
            	            												set(
            	            													current,
            	            													"icon",
            	            													lv_icon_7_0,
            	            													"org.xtext.example.sitemap.Sitemap.Icon");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalSitemap.g:5026:9: (otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) ) )
            	    // InternalSitemap.g:5027:10: otherlv_8= 'separator=' ( (lv_separator_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,45,FOLLOW_5); 

            	    										newLeafNode(otherlv_8, grammarAccess.getListAccess().getSeparatorKeyword_1_2_1_0());
            	    									
            	    // InternalSitemap.g:5031:10: ( (lv_separator_9_0= RULE_STRING ) )
            	    // InternalSitemap.g:5032:11: (lv_separator_9_0= RULE_STRING )
            	    {
            	    // InternalSitemap.g:5032:11: (lv_separator_9_0= RULE_STRING )
            	    // InternalSitemap.g:5033:12: lv_separator_9_0= RULE_STRING
            	    {
            	    lv_separator_9_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            	    												newLeafNode(lv_separator_9_0, grammarAccess.getListAccess().getSeparatorSTRINGTerminalRuleCall_1_2_1_1_0());
            	    											

            	    												if (current==null) {
            	    													current = createModelElement(grammarAccess.getListRule());
            	    												}
            	    												setWithLastConsumed(
            	    													current,
            	    													"separator",
            	    													lv_separator_9_0,
            	    													"org.eclipse.xtext.common.Terminals.STRING");
            	    											

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getListAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:5056:4: ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5056:4: ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) )
            	    // InternalSitemap.g:5057:5: {...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleList", "getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:5057:101: ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) )
            	    // InternalSitemap.g:5058:6: ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getListAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:5061:9: ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) )
            	    // InternalSitemap.g:5061:10: {...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleList", "true");
            	    }
            	    // InternalSitemap.g:5061:19: (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) )
            	    // InternalSitemap.g:5061:20: otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' )
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getListAccess().getLabelcolorKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:5065:9: ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' )
            	    // InternalSitemap.g:5066:10: ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']'
            	    {
            	    // InternalSitemap.g:5066:10: ( (lv_LabelColor_11_0= ruleColorArray ) )
            	    // InternalSitemap.g:5067:11: (lv_LabelColor_11_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:5067:11: (lv_LabelColor_11_0= ruleColorArray )
            	    // InternalSitemap.g:5068:12: lv_LabelColor_11_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getListAccess().getLabelColorColorArrayParserRuleCall_1_3_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_11_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getListRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_11_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:5085:10: (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )*
            	    loop69:
            	    do {
            	        int alt69=2;
            	        int LA69_0 = input.LA(1);

            	        if ( (LA69_0==20) ) {
            	            alt69=1;
            	        }


            	        switch (alt69) {
            	    	case 1 :
            	    	    // InternalSitemap.g:5086:11: otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_12, grammarAccess.getListAccess().getCommaKeyword_1_3_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:5090:11: ( (lv_LabelColor_13_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:5091:12: (lv_LabelColor_13_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:5091:12: (lv_LabelColor_13_0= ruleColorArray )
            	    	    // InternalSitemap.g:5092:13: lv_LabelColor_13_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getListAccess().getLabelColorColorArrayParserRuleCall_1_3_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_13_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getListRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_13_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop69;
            	        }
            	    } while (true);

            	    otherlv_14=(Token)match(input,21,FOLLOW_33); 

            	    										newLeafNode(otherlv_14, grammarAccess.getListAccess().getRightSquareBracketKeyword_1_3_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getListAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:5121:4: ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5121:4: ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) )
            	    // InternalSitemap.g:5122:5: {...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleList", "getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:5122:101: ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) )
            	    // InternalSitemap.g:5123:6: ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getListAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:5126:9: ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) )
            	    // InternalSitemap.g:5126:10: {...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleList", "true");
            	    }
            	    // InternalSitemap.g:5126:19: (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) )
            	    // InternalSitemap.g:5126:20: otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' )
            	    {
            	    otherlv_15=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_15, grammarAccess.getListAccess().getValuecolorKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:5130:9: ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' )
            	    // InternalSitemap.g:5131:10: ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']'
            	    {
            	    // InternalSitemap.g:5131:10: ( (lv_ValueColor_16_0= ruleColorArray ) )
            	    // InternalSitemap.g:5132:11: (lv_ValueColor_16_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:5132:11: (lv_ValueColor_16_0= ruleColorArray )
            	    // InternalSitemap.g:5133:12: lv_ValueColor_16_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getListAccess().getValueColorColorArrayParserRuleCall_1_4_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_16_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getListRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_16_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:5150:10: (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==20) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // InternalSitemap.g:5151:11: otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_17, grammarAccess.getListAccess().getCommaKeyword_1_4_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:5155:11: ( (lv_ValueColor_18_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:5156:12: (lv_ValueColor_18_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:5156:12: (lv_ValueColor_18_0= ruleColorArray )
            	    	    // InternalSitemap.g:5157:13: lv_ValueColor_18_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getListAccess().getValueColorColorArrayParserRuleCall_1_4_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_18_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getListRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_18_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop70;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,21,FOLLOW_33); 

            	    										newLeafNode(otherlv_19, grammarAccess.getListAccess().getRightSquareBracketKeyword_1_4_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getListAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:5186:4: ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5186:4: ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) )
            	    // InternalSitemap.g:5187:5: {...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleList", "getUnorderedGroupHelper().canSelect(grammarAccess.getListAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:5187:101: ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) )
            	    // InternalSitemap.g:5188:6: ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getListAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:5191:9: ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) )
            	    // InternalSitemap.g:5191:10: {...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleList", "true");
            	    }
            	    // InternalSitemap.g:5191:19: (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) )
            	    // InternalSitemap.g:5191:20: otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' )
            	    {
            	    otherlv_20=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_20, grammarAccess.getListAccess().getVisibilityKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:5195:9: ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' )
            	    // InternalSitemap.g:5196:10: ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']'
            	    {
            	    // InternalSitemap.g:5196:10: ( (lv_Visibility_21_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:5197:11: (lv_Visibility_21_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:5197:11: (lv_Visibility_21_0= ruleVisibilityRule )
            	    // InternalSitemap.g:5198:12: lv_Visibility_21_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getListAccess().getVisibilityVisibilityRuleParserRuleCall_1_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_21_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getListRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_21_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:5215:10: (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )*
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);

            	        if ( (LA71_0==20) ) {
            	            alt71=1;
            	        }


            	        switch (alt71) {
            	    	case 1 :
            	    	    // InternalSitemap.g:5216:11: otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_22=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_22, grammarAccess.getListAccess().getCommaKeyword_1_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:5220:11: ( (lv_Visibility_23_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:5221:12: (lv_Visibility_23_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:5221:12: (lv_Visibility_23_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:5222:13: lv_Visibility_23_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getListAccess().getVisibilityVisibilityRuleParserRuleCall_1_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_23_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getListRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_23_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop71;
            	        }
            	    } while (true);

            	    otherlv_24=(Token)match(input,21,FOLLOW_33); 

            	    										newLeafNode(otherlv_24, grammarAccess.getListAccess().getRightSquareBracketKeyword_1_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getListAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getListAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleList", "getUnorderedGroupHelper().canLeave(grammarAccess.getListAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getListAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleSetpoint"
    // InternalSitemap.g:5263:1: entryRuleSetpoint returns [EObject current=null] : iv_ruleSetpoint= ruleSetpoint EOF ;
    public final EObject entryRuleSetpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetpoint = null;


        try {
            // InternalSitemap.g:5263:49: (iv_ruleSetpoint= ruleSetpoint EOF )
            // InternalSitemap.g:5264:2: iv_ruleSetpoint= ruleSetpoint EOF
            {
             newCompositeNode(grammarAccess.getSetpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetpoint=ruleSetpoint();

            state._fsp--;

             current =iv_ruleSetpoint; 
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
    // $ANTLR end "entryRuleSetpoint"


    // $ANTLR start "ruleSetpoint"
    // InternalSitemap.g:5270:1: ruleSetpoint returns [EObject current=null] : (otherlv_0= 'Setpoint' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleSetpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        AntlrDatatypeRuleToken lv_minValue_9_0 = null;

        AntlrDatatypeRuleToken lv_maxValue_11_0 = null;

        AntlrDatatypeRuleToken lv_step_13_0 = null;

        EObject lv_LabelColor_15_0 = null;

        EObject lv_LabelColor_17_0 = null;

        EObject lv_ValueColor_20_0 = null;

        EObject lv_ValueColor_22_0 = null;

        EObject lv_Visibility_25_0 = null;

        EObject lv_Visibility_27_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:5276:2: ( (otherlv_0= 'Setpoint' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:5277:2: (otherlv_0= 'Setpoint' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:5277:2: (otherlv_0= 'Setpoint' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:5278:3: otherlv_0= 'Setpoint' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getSetpointAccess().getSetpointKeyword_0());
            		
            // InternalSitemap.g:5282:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:5283:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:5283:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:5284:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:5287:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:5288:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:5288:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+
            int cnt77=0;
            loop77:
            do {
                int alt77=10;
                alt77 = dfa77.predict(input);
                switch (alt77) {
            	case 1 :
            	    // InternalSitemap.g:5289:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5289:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:5290:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:5290:105: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:5291:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:5294:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:5294:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "true");
            	    }
            	    // InternalSitemap.g:5294:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:5294:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getSetpointAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:5298:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:5299:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:5299:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:5300:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getSetpointAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:5323:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5323:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:5324:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:5324:105: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:5325:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:5328:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:5328:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "true");
            	    }
            	    // InternalSitemap.g:5328:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:5328:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSetpointAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:5332:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:5333:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:5333:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:5334:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:5334:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==RULE_ID) ) {
            	        alt73=1;
            	    }
            	    else if ( (LA73_0==RULE_STRING) ) {
            	        alt73=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 73, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalSitemap.g:5335:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_36); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getSetpointAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getSetpointRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:5350:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_36); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getSetpointAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getSetpointRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:5373:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5373:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:5374:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:5374:105: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:5375:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:5378:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:5378:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "true");
            	    }
            	    // InternalSitemap.g:5378:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:5378:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSetpointAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:5382:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:5383:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:5383:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:5384:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getSetpointAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:5407:4: ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5407:4: ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) )
            	    // InternalSitemap.g:5408:5: {...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:5408:105: ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) )
            	    // InternalSitemap.g:5409:6: ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:5412:9: ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) )
            	    // InternalSitemap.g:5412:10: {...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "true");
            	    }
            	    // InternalSitemap.g:5412:19: (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) )
            	    // InternalSitemap.g:5412:20: otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) )
            	    {
            	    otherlv_8=(Token)match(input,47,FOLLOW_37); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSetpointAccess().getMinValueKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:5416:9: ( (lv_minValue_9_0= ruleNumber ) )
            	    // InternalSitemap.g:5417:10: (lv_minValue_9_0= ruleNumber )
            	    {
            	    // InternalSitemap.g:5417:10: (lv_minValue_9_0= ruleNumber )
            	    // InternalSitemap.g:5418:11: lv_minValue_9_0= ruleNumber
            	    {

            	    											newCompositeNode(grammarAccess.getSetpointAccess().getMinValueNumberParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_minValue_9_0=ruleNumber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    											}
            	    											set(
            	    												current,
            	    												"minValue",
            	    												lv_minValue_9_0,
            	    												"org.xtext.example.sitemap.Sitemap.Number");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:5441:4: ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5441:4: ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) )
            	    // InternalSitemap.g:5442:5: {...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:5442:105: ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) )
            	    // InternalSitemap.g:5443:6: ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:5446:9: ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) )
            	    // InternalSitemap.g:5446:10: {...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "true");
            	    }
            	    // InternalSitemap.g:5446:19: (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) )
            	    // InternalSitemap.g:5446:20: otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) )
            	    {
            	    otherlv_10=(Token)match(input,48,FOLLOW_37); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSetpointAccess().getMaxValueKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:5450:9: ( (lv_maxValue_11_0= ruleNumber ) )
            	    // InternalSitemap.g:5451:10: (lv_maxValue_11_0= ruleNumber )
            	    {
            	    // InternalSitemap.g:5451:10: (lv_maxValue_11_0= ruleNumber )
            	    // InternalSitemap.g:5452:11: lv_maxValue_11_0= ruleNumber
            	    {

            	    											newCompositeNode(grammarAccess.getSetpointAccess().getMaxValueNumberParserRuleCall_1_4_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_maxValue_11_0=ruleNumber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    											}
            	    											set(
            	    												current,
            	    												"maxValue",
            	    												lv_maxValue_11_0,
            	    												"org.xtext.example.sitemap.Sitemap.Number");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:5475:4: ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5475:4: ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) )
            	    // InternalSitemap.g:5476:5: {...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:5476:105: ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) )
            	    // InternalSitemap.g:5477:6: ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:5480:9: ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) )
            	    // InternalSitemap.g:5480:10: {...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "true");
            	    }
            	    // InternalSitemap.g:5480:19: (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) )
            	    // InternalSitemap.g:5480:20: otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) )
            	    {
            	    otherlv_12=(Token)match(input,49,FOLLOW_37); 

            	    									newLeafNode(otherlv_12, grammarAccess.getSetpointAccess().getStepKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:5484:9: ( (lv_step_13_0= ruleNumber ) )
            	    // InternalSitemap.g:5485:10: (lv_step_13_0= ruleNumber )
            	    {
            	    // InternalSitemap.g:5485:10: (lv_step_13_0= ruleNumber )
            	    // InternalSitemap.g:5486:11: lv_step_13_0= ruleNumber
            	    {

            	    											newCompositeNode(grammarAccess.getSetpointAccess().getStepNumberParserRuleCall_1_5_1_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_step_13_0=ruleNumber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    											}
            	    											set(
            	    												current,
            	    												"step",
            	    												lv_step_13_0,
            	    												"org.xtext.example.sitemap.Sitemap.Number");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSitemap.g:5509:4: ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5509:4: ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) )
            	    // InternalSitemap.g:5510:5: {...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalSitemap.g:5510:105: ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) )
            	    // InternalSitemap.g:5511:6: ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalSitemap.g:5514:9: ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) )
            	    // InternalSitemap.g:5514:10: {...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "true");
            	    }
            	    // InternalSitemap.g:5514:19: (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) )
            	    // InternalSitemap.g:5514:20: otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' )
            	    {
            	    otherlv_14=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getSetpointAccess().getLabelcolorKeyword_1_6_0());
            	    								
            	    // InternalSitemap.g:5518:9: ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' )
            	    // InternalSitemap.g:5519:10: ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']'
            	    {
            	    // InternalSitemap.g:5519:10: ( (lv_LabelColor_15_0= ruleColorArray ) )
            	    // InternalSitemap.g:5520:11: (lv_LabelColor_15_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:5520:11: (lv_LabelColor_15_0= ruleColorArray )
            	    // InternalSitemap.g:5521:12: lv_LabelColor_15_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getSetpointAccess().getLabelColorColorArrayParserRuleCall_1_6_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_15_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_15_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:5538:10: (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )*
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==20) ) {
            	            alt74=1;
            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // InternalSitemap.g:5539:11: otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_16, grammarAccess.getSetpointAccess().getCommaKeyword_1_6_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:5543:11: ( (lv_LabelColor_17_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:5544:12: (lv_LabelColor_17_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:5544:12: (lv_LabelColor_17_0= ruleColorArray )
            	    	    // InternalSitemap.g:5545:13: lv_LabelColor_17_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSetpointAccess().getLabelColorColorArrayParserRuleCall_1_6_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_17_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_17_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop74;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,21,FOLLOW_36); 

            	    										newLeafNode(otherlv_18, grammarAccess.getSetpointAccess().getRightSquareBracketKeyword_1_6_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalSitemap.g:5574:4: ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5574:4: ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) )
            	    // InternalSitemap.g:5575:5: {...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // InternalSitemap.g:5575:105: ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalSitemap.g:5576:6: ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 7);
            	    					
            	    // InternalSitemap.g:5579:9: ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) )
            	    // InternalSitemap.g:5579:10: {...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "true");
            	    }
            	    // InternalSitemap.g:5579:19: (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) )
            	    // InternalSitemap.g:5579:20: otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' )
            	    {
            	    otherlv_19=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_19, grammarAccess.getSetpointAccess().getValuecolorKeyword_1_7_0());
            	    								
            	    // InternalSitemap.g:5583:9: ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' )
            	    // InternalSitemap.g:5584:10: ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']'
            	    {
            	    // InternalSitemap.g:5584:10: ( (lv_ValueColor_20_0= ruleColorArray ) )
            	    // InternalSitemap.g:5585:11: (lv_ValueColor_20_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:5585:11: (lv_ValueColor_20_0= ruleColorArray )
            	    // InternalSitemap.g:5586:12: lv_ValueColor_20_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getSetpointAccess().getValueColorColorArrayParserRuleCall_1_7_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_20_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_20_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:5603:10: (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )*
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==20) ) {
            	            alt75=1;
            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // InternalSitemap.g:5604:11: otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_21, grammarAccess.getSetpointAccess().getCommaKeyword_1_7_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:5608:11: ( (lv_ValueColor_22_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:5609:12: (lv_ValueColor_22_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:5609:12: (lv_ValueColor_22_0= ruleColorArray )
            	    	    // InternalSitemap.g:5610:13: lv_ValueColor_22_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSetpointAccess().getValueColorColorArrayParserRuleCall_1_7_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_22_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_22_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop75;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,21,FOLLOW_36); 

            	    										newLeafNode(otherlv_23, grammarAccess.getSetpointAccess().getRightSquareBracketKeyword_1_7_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalSitemap.g:5639:4: ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5639:4: ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalSitemap.g:5640:5: {...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // InternalSitemap.g:5640:105: ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalSitemap.g:5641:6: ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 8);
            	    					
            	    // InternalSitemap.g:5644:9: ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) )
            	    // InternalSitemap.g:5644:10: {...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSetpoint", "true");
            	    }
            	    // InternalSitemap.g:5644:19: (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) )
            	    // InternalSitemap.g:5644:20: otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' )
            	    {
            	    otherlv_24=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getSetpointAccess().getVisibilityKeyword_1_8_0());
            	    								
            	    // InternalSitemap.g:5648:9: ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' )
            	    // InternalSitemap.g:5649:10: ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']'
            	    {
            	    // InternalSitemap.g:5649:10: ( (lv_Visibility_25_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:5650:11: (lv_Visibility_25_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:5650:11: (lv_Visibility_25_0= ruleVisibilityRule )
            	    // InternalSitemap.g:5651:12: lv_Visibility_25_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getSetpointAccess().getVisibilityVisibilityRuleParserRuleCall_1_8_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_25_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_25_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:5668:10: (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )*
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( (LA76_0==20) ) {
            	            alt76=1;
            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // InternalSitemap.g:5669:11: otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_26=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_26, grammarAccess.getSetpointAccess().getCommaKeyword_1_8_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:5673:11: ( (lv_Visibility_27_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:5674:12: (lv_Visibility_27_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:5674:12: (lv_Visibility_27_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:5675:13: lv_Visibility_27_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getSetpointAccess().getVisibilityVisibilityRuleParserRuleCall_1_8_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_27_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getSetpointRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_27_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop76;
            	        }
            	    } while (true);

            	    otherlv_28=(Token)match(input,21,FOLLOW_36); 

            	    										newLeafNode(otherlv_28, grammarAccess.getSetpointAccess().getRightSquareBracketKeyword_1_8_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSetpointAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleSetpoint", "getUnorderedGroupHelper().canLeave(grammarAccess.getSetpointAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSetpointAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleSetpoint"


    // $ANTLR start "entryRuleColorpicker"
    // InternalSitemap.g:5716:1: entryRuleColorpicker returns [EObject current=null] : iv_ruleColorpicker= ruleColorpicker EOF ;
    public final EObject entryRuleColorpicker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorpicker = null;


        try {
            // InternalSitemap.g:5716:52: (iv_ruleColorpicker= ruleColorpicker EOF )
            // InternalSitemap.g:5717:2: iv_ruleColorpicker= ruleColorpicker EOF
            {
             newCompositeNode(grammarAccess.getColorpickerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorpicker=ruleColorpicker();

            state._fsp--;

             current =iv_ruleColorpicker; 
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
    // $ANTLR end "entryRuleColorpicker"


    // $ANTLR start "ruleColorpicker"
    // InternalSitemap.g:5723:1: ruleColorpicker returns [EObject current=null] : (otherlv_0= 'Colorpicker' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleColorpicker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_label_5_1=null;
        Token lv_label_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_frequency_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_item_3_0 = null;

        AntlrDatatypeRuleToken lv_icon_7_0 = null;

        EObject lv_LabelColor_11_0 = null;

        EObject lv_LabelColor_13_0 = null;

        EObject lv_ValueColor_16_0 = null;

        EObject lv_ValueColor_18_0 = null;

        EObject lv_Visibility_21_0 = null;

        EObject lv_Visibility_23_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:5729:2: ( (otherlv_0= 'Colorpicker' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalSitemap.g:5730:2: (otherlv_0= 'Colorpicker' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalSitemap.g:5730:2: (otherlv_0= 'Colorpicker' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) ) )
            // InternalSitemap.g:5731:3: otherlv_0= 'Colorpicker' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getColorpickerAccess().getColorpickerKeyword_0());
            		
            // InternalSitemap.g:5735:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) ) )
            // InternalSitemap.g:5736:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) )
            {
            // InternalSitemap.g:5736:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?) )
            // InternalSitemap.g:5737:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getColorpickerAccess().getUnorderedGroup_1());
            				
            // InternalSitemap.g:5740:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?)
            // InternalSitemap.g:5741:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+ {...}?
            {
            // InternalSitemap.g:5741:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) ) )+
            int cnt82=0;
            loop82:
            do {
                int alt82=8;
                int LA82_0 = input.LA(1);

                if ( LA82_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 0) ) {
                    alt82=1;
                }
                else if ( LA82_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 1) ) {
                    alt82=2;
                }
                else if ( LA82_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 2) ) {
                    alt82=3;
                }
                else if ( LA82_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 3) ) {
                    alt82=4;
                }
                else if ( LA82_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 4) ) {
                    alt82=5;
                }
                else if ( LA82_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 5) ) {
                    alt82=6;
                }
                else if ( LA82_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 6) ) {
                    alt82=7;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalSitemap.g:5742:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5742:4: ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) )
            	    // InternalSitemap.g:5743:5: {...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalSitemap.g:5743:108: ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) )
            	    // InternalSitemap.g:5744:6: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalSitemap.g:5747:9: ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) )
            	    // InternalSitemap.g:5747:10: {...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "true");
            	    }
            	    // InternalSitemap.g:5747:19: (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) )
            	    // InternalSitemap.g:5747:20: otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getColorpickerAccess().getItemKeyword_1_0_0());
            	    								
            	    // InternalSitemap.g:5751:9: ( (lv_item_3_0= ruleItemRef ) )
            	    // InternalSitemap.g:5752:10: (lv_item_3_0= ruleItemRef )
            	    {
            	    // InternalSitemap.g:5752:10: (lv_item_3_0= ruleItemRef )
            	    // InternalSitemap.g:5753:11: lv_item_3_0= ruleItemRef
            	    {

            	    											newCompositeNode(grammarAccess.getColorpickerAccess().getItemItemRefParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_39);
            	    lv_item_3_0=ruleItemRef();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getColorpickerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"item",
            	    												lv_item_3_0,
            	    												"org.xtext.example.sitemap.Sitemap.ItemRef");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorpickerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSitemap.g:5776:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5776:4: ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) )
            	    // InternalSitemap.g:5777:5: {...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalSitemap.g:5777:108: ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) )
            	    // InternalSitemap.g:5778:6: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalSitemap.g:5781:9: ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) )
            	    // InternalSitemap.g:5781:10: {...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "true");
            	    }
            	    // InternalSitemap.g:5781:19: (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) )
            	    // InternalSitemap.g:5781:20: otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getColorpickerAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalSitemap.g:5785:9: ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) )
            	    // InternalSitemap.g:5786:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    {
            	    // InternalSitemap.g:5786:10: ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) )
            	    // InternalSitemap.g:5787:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    {
            	    // InternalSitemap.g:5787:11: (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING )
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==RULE_ID) ) {
            	        alt78=1;
            	    }
            	    else if ( (LA78_0==RULE_STRING) ) {
            	        alt78=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 78, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // InternalSitemap.g:5788:12: lv_label_5_1= RULE_ID
            	            {
            	            lv_label_5_1=(Token)match(input,RULE_ID,FOLLOW_39); 

            	            												newLeafNode(lv_label_5_1, grammarAccess.getColorpickerAccess().getLabelIDTerminalRuleCall_1_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getColorpickerRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_1,
            	            													"org.xtext.example.sitemap.Sitemap.ID");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalSitemap.g:5803:12: lv_label_5_2= RULE_STRING
            	            {
            	            lv_label_5_2=(Token)match(input,RULE_STRING,FOLLOW_39); 

            	            												newLeafNode(lv_label_5_2, grammarAccess.getColorpickerAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getColorpickerRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"label",
            	            													lv_label_5_2,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorpickerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalSitemap.g:5826:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5826:4: ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) )
            	    // InternalSitemap.g:5827:5: {...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalSitemap.g:5827:108: ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) )
            	    // InternalSitemap.g:5828:6: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalSitemap.g:5831:9: ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) )
            	    // InternalSitemap.g:5831:10: {...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "true");
            	    }
            	    // InternalSitemap.g:5831:19: (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) )
            	    // InternalSitemap.g:5831:20: otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getColorpickerAccess().getIconKeyword_1_2_0());
            	    								
            	    // InternalSitemap.g:5835:9: ( (lv_icon_7_0= ruleIcon ) )
            	    // InternalSitemap.g:5836:10: (lv_icon_7_0= ruleIcon )
            	    {
            	    // InternalSitemap.g:5836:10: (lv_icon_7_0= ruleIcon )
            	    // InternalSitemap.g:5837:11: lv_icon_7_0= ruleIcon
            	    {

            	    											newCompositeNode(grammarAccess.getColorpickerAccess().getIconIconParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_39);
            	    lv_icon_7_0=ruleIcon();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getColorpickerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"icon",
            	    												lv_icon_7_0,
            	    												"org.xtext.example.sitemap.Sitemap.Icon");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorpickerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalSitemap.g:5860:4: ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5860:4: ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) )
            	    // InternalSitemap.g:5861:5: {...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalSitemap.g:5861:108: ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) )
            	    // InternalSitemap.g:5862:6: ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalSitemap.g:5865:9: ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) )
            	    // InternalSitemap.g:5865:10: {...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "true");
            	    }
            	    // InternalSitemap.g:5865:19: (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) )
            	    // InternalSitemap.g:5865:20: otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,41,FOLLOW_18); 

            	    									newLeafNode(otherlv_8, grammarAccess.getColorpickerAccess().getSendFrequencyKeyword_1_3_0());
            	    								
            	    // InternalSitemap.g:5869:9: ( (lv_frequency_9_0= RULE_INT ) )
            	    // InternalSitemap.g:5870:10: (lv_frequency_9_0= RULE_INT )
            	    {
            	    // InternalSitemap.g:5870:10: (lv_frequency_9_0= RULE_INT )
            	    // InternalSitemap.g:5871:11: lv_frequency_9_0= RULE_INT
            	    {
            	    lv_frequency_9_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            	    											newLeafNode(lv_frequency_9_0, grammarAccess.getColorpickerAccess().getFrequencyINTTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getColorpickerRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"frequency",
            	    												lv_frequency_9_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorpickerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalSitemap.g:5893:4: ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5893:4: ({...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) ) )
            	    // InternalSitemap.g:5894:5: {...}? => ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalSitemap.g:5894:108: ( ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) ) )
            	    // InternalSitemap.g:5895:6: ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalSitemap.g:5898:9: ({...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) ) )
            	    // InternalSitemap.g:5898:10: {...}? => (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "true");
            	    }
            	    // InternalSitemap.g:5898:19: (otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' ) )
            	    // InternalSitemap.g:5898:20: otherlv_10= 'labelcolor=[' ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' )
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getColorpickerAccess().getLabelcolorKeyword_1_4_0());
            	    								
            	    // InternalSitemap.g:5902:9: ( ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']' )
            	    // InternalSitemap.g:5903:10: ( (lv_LabelColor_11_0= ruleColorArray ) ) (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )* otherlv_14= ']'
            	    {
            	    // InternalSitemap.g:5903:10: ( (lv_LabelColor_11_0= ruleColorArray ) )
            	    // InternalSitemap.g:5904:11: (lv_LabelColor_11_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:5904:11: (lv_LabelColor_11_0= ruleColorArray )
            	    // InternalSitemap.g:5905:12: lv_LabelColor_11_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getColorpickerAccess().getLabelColorColorArrayParserRuleCall_1_4_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_LabelColor_11_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getColorpickerRule());
            	    												}
            	    												add(
            	    													current,
            	    													"LabelColor",
            	    													lv_LabelColor_11_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:5922:10: (otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) ) )*
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==20) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // InternalSitemap.g:5923:11: otherlv_12= ',' ( (lv_LabelColor_13_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_12, grammarAccess.getColorpickerAccess().getCommaKeyword_1_4_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:5927:11: ( (lv_LabelColor_13_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:5928:12: (lv_LabelColor_13_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:5928:12: (lv_LabelColor_13_0= ruleColorArray )
            	    	    // InternalSitemap.g:5929:13: lv_LabelColor_13_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getColorpickerAccess().getLabelColorColorArrayParserRuleCall_1_4_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_LabelColor_13_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getColorpickerRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"LabelColor",
            	    	    														lv_LabelColor_13_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop79;
            	        }
            	    } while (true);

            	    otherlv_14=(Token)match(input,21,FOLLOW_39); 

            	    										newLeafNode(otherlv_14, grammarAccess.getColorpickerAccess().getRightSquareBracketKeyword_1_4_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorpickerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalSitemap.g:5958:4: ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:5958:4: ({...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) ) )
            	    // InternalSitemap.g:5959:5: {...}? => ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalSitemap.g:5959:108: ( ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) ) )
            	    // InternalSitemap.g:5960:6: ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalSitemap.g:5963:9: ({...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) ) )
            	    // InternalSitemap.g:5963:10: {...}? => (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "true");
            	    }
            	    // InternalSitemap.g:5963:19: (otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' ) )
            	    // InternalSitemap.g:5963:20: otherlv_15= 'valuecolor=[' ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' )
            	    {
            	    otherlv_15=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_15, grammarAccess.getColorpickerAccess().getValuecolorKeyword_1_5_0());
            	    								
            	    // InternalSitemap.g:5967:9: ( ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']' )
            	    // InternalSitemap.g:5968:10: ( (lv_ValueColor_16_0= ruleColorArray ) ) (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )* otherlv_19= ']'
            	    {
            	    // InternalSitemap.g:5968:10: ( (lv_ValueColor_16_0= ruleColorArray ) )
            	    // InternalSitemap.g:5969:11: (lv_ValueColor_16_0= ruleColorArray )
            	    {
            	    // InternalSitemap.g:5969:11: (lv_ValueColor_16_0= ruleColorArray )
            	    // InternalSitemap.g:5970:12: lv_ValueColor_16_0= ruleColorArray
            	    {

            	    												newCompositeNode(grammarAccess.getColorpickerAccess().getValueColorColorArrayParserRuleCall_1_5_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_ValueColor_16_0=ruleColorArray();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getColorpickerRule());
            	    												}
            	    												add(
            	    													current,
            	    													"ValueColor",
            	    													lv_ValueColor_16_0,
            	    													"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:5987:10: (otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) ) )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==20) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // InternalSitemap.g:5988:11: otherlv_17= ',' ( (lv_ValueColor_18_0= ruleColorArray ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,20,FOLLOW_13); 

            	    	    											newLeafNode(otherlv_17, grammarAccess.getColorpickerAccess().getCommaKeyword_1_5_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:5992:11: ( (lv_ValueColor_18_0= ruleColorArray ) )
            	    	    // InternalSitemap.g:5993:12: (lv_ValueColor_18_0= ruleColorArray )
            	    	    {
            	    	    // InternalSitemap.g:5993:12: (lv_ValueColor_18_0= ruleColorArray )
            	    	    // InternalSitemap.g:5994:13: lv_ValueColor_18_0= ruleColorArray
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getColorpickerAccess().getValueColorColorArrayParserRuleCall_1_5_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_ValueColor_18_0=ruleColorArray();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getColorpickerRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"ValueColor",
            	    	    														lv_ValueColor_18_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.ColorArray");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,21,FOLLOW_39); 

            	    										newLeafNode(otherlv_19, grammarAccess.getColorpickerAccess().getRightSquareBracketKeyword_1_5_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorpickerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalSitemap.g:6023:4: ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) )
            	    {
            	    // InternalSitemap.g:6023:4: ({...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) ) )
            	    // InternalSitemap.g:6024:5: {...}? => ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "getUnorderedGroupHelper().canSelect(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalSitemap.g:6024:108: ( ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) ) )
            	    // InternalSitemap.g:6025:6: ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getColorpickerAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalSitemap.g:6028:9: ({...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) ) )
            	    // InternalSitemap.g:6028:10: {...}? => (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleColorpicker", "true");
            	    }
            	    // InternalSitemap.g:6028:19: (otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' ) )
            	    // InternalSitemap.g:6028:20: otherlv_20= 'visibility=[' ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' )
            	    {
            	    otherlv_20=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_20, grammarAccess.getColorpickerAccess().getVisibilityKeyword_1_6_0());
            	    								
            	    // InternalSitemap.g:6032:9: ( ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']' )
            	    // InternalSitemap.g:6033:10: ( (lv_Visibility_21_0= ruleVisibilityRule ) ) (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )* otherlv_24= ']'
            	    {
            	    // InternalSitemap.g:6033:10: ( (lv_Visibility_21_0= ruleVisibilityRule ) )
            	    // InternalSitemap.g:6034:11: (lv_Visibility_21_0= ruleVisibilityRule )
            	    {
            	    // InternalSitemap.g:6034:11: (lv_Visibility_21_0= ruleVisibilityRule )
            	    // InternalSitemap.g:6035:12: lv_Visibility_21_0= ruleVisibilityRule
            	    {

            	    												newCompositeNode(grammarAccess.getColorpickerAccess().getVisibilityVisibilityRuleParserRuleCall_1_6_1_0_0());
            	    											
            	    pushFollow(FOLLOW_14);
            	    lv_Visibility_21_0=ruleVisibilityRule();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getColorpickerRule());
            	    												}
            	    												add(
            	    													current,
            	    													"Visibility",
            	    													lv_Visibility_21_0,
            	    													"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalSitemap.g:6052:10: (otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) ) )*
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==20) ) {
            	            alt81=1;
            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // InternalSitemap.g:6053:11: otherlv_22= ',' ( (lv_Visibility_23_0= ruleVisibilityRule ) )
            	    	    {
            	    	    otherlv_22=(Token)match(input,20,FOLLOW_3); 

            	    	    											newLeafNode(otherlv_22, grammarAccess.getColorpickerAccess().getCommaKeyword_1_6_1_1_0());
            	    	    										
            	    	    // InternalSitemap.g:6057:11: ( (lv_Visibility_23_0= ruleVisibilityRule ) )
            	    	    // InternalSitemap.g:6058:12: (lv_Visibility_23_0= ruleVisibilityRule )
            	    	    {
            	    	    // InternalSitemap.g:6058:12: (lv_Visibility_23_0= ruleVisibilityRule )
            	    	    // InternalSitemap.g:6059:13: lv_Visibility_23_0= ruleVisibilityRule
            	    	    {

            	    	    													newCompositeNode(grammarAccess.getColorpickerAccess().getVisibilityVisibilityRuleParserRuleCall_1_6_1_1_1_0());
            	    	    												
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_Visibility_23_0=ruleVisibilityRule();

            	    	    state._fsp--;


            	    	    													if (current==null) {
            	    	    														current = createModelElementForParent(grammarAccess.getColorpickerRule());
            	    	    													}
            	    	    													add(
            	    	    														current,
            	    	    														"Visibility",
            	    	    														lv_Visibility_23_0,
            	    	    														"org.xtext.example.sitemap.Sitemap.VisibilityRule");
            	    	    													afterParserOrEnumRuleCall();
            	    	    												

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop81;
            	        }
            	    } while (true);

            	    otherlv_24=(Token)match(input,21,FOLLOW_39); 

            	    										newLeafNode(otherlv_24, grammarAccess.getColorpickerAccess().getRightSquareBracketKeyword_1_6_1_2());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getColorpickerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getColorpickerAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleColorpicker", "getUnorderedGroupHelper().canLeave(grammarAccess.getColorpickerAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getColorpickerAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleColorpicker"


    // $ANTLR start "entryRuleMapping"
    // InternalSitemap.g:6100:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalSitemap.g:6100:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalSitemap.g:6101:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalSitemap.g:6107:1: ruleMapping returns [EObject current=null] : ( ( (lv_cmd_0_0= ruleCommand ) ) otherlv_1= '=' ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_label_2_1=null;
        Token lv_label_2_2=null;
        AntlrDatatypeRuleToken lv_cmd_0_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:6113:2: ( ( ( (lv_cmd_0_0= ruleCommand ) ) otherlv_1= '=' ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) ) )
            // InternalSitemap.g:6114:2: ( ( (lv_cmd_0_0= ruleCommand ) ) otherlv_1= '=' ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) )
            {
            // InternalSitemap.g:6114:2: ( ( (lv_cmd_0_0= ruleCommand ) ) otherlv_1= '=' ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) ) )
            // InternalSitemap.g:6115:3: ( (lv_cmd_0_0= ruleCommand ) ) otherlv_1= '=' ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) )
            {
            // InternalSitemap.g:6115:3: ( (lv_cmd_0_0= ruleCommand ) )
            // InternalSitemap.g:6116:4: (lv_cmd_0_0= ruleCommand )
            {
            // InternalSitemap.g:6116:4: (lv_cmd_0_0= ruleCommand )
            // InternalSitemap.g:6117:5: lv_cmd_0_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getMappingAccess().getCmdCommandParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_cmd_0_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingRule());
            					}
            					set(
            						current,
            						"cmd",
            						lv_cmd_0_0,
            						"org.xtext.example.sitemap.Sitemap.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getEqualsSignKeyword_1());
            		
            // InternalSitemap.g:6138:3: ( ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) ) )
            // InternalSitemap.g:6139:4: ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) )
            {
            // InternalSitemap.g:6139:4: ( (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING ) )
            // InternalSitemap.g:6140:5: (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING )
            {
            // InternalSitemap.g:6140:5: (lv_label_2_1= RULE_ID | lv_label_2_2= RULE_STRING )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_STRING) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalSitemap.g:6141:6: lv_label_2_1= RULE_ID
                    {
                    lv_label_2_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_label_2_1, grammarAccess.getMappingAccess().getLabelIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_2_1,
                    							"org.xtext.example.sitemap.Sitemap.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalSitemap.g:6156:6: lv_label_2_2= RULE_STRING
                    {
                    lv_label_2_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_label_2_2, grammarAccess.getMappingAccess().getLabelSTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"label",
                    							lv_label_2_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleVisibilityRule"
    // InternalSitemap.g:6177:1: entryRuleVisibilityRule returns [EObject current=null] : iv_ruleVisibilityRule= ruleVisibilityRule EOF ;
    public final EObject entryRuleVisibilityRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilityRule = null;


        try {
            // InternalSitemap.g:6177:55: (iv_ruleVisibilityRule= ruleVisibilityRule EOF )
            // InternalSitemap.g:6178:2: iv_ruleVisibilityRule= ruleVisibilityRule EOF
            {
             newCompositeNode(grammarAccess.getVisibilityRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisibilityRule=ruleVisibilityRule();

            state._fsp--;

             current =iv_ruleVisibilityRule; 
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
    // $ANTLR end "entryRuleVisibilityRule"


    // $ANTLR start "ruleVisibilityRule"
    // InternalSitemap.g:6184:1: ruleVisibilityRule returns [EObject current=null] : ( ( (lv_item_0_0= RULE_ID ) ) ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) ) ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) ) ;
    public final EObject ruleVisibilityRule() throws RecognitionException {
        EObject current = null;

        Token lv_item_0_0=null;
        Token lv_condition_1_1=null;
        Token lv_condition_1_2=null;
        Token lv_condition_1_3=null;
        Token lv_condition_1_4=null;
        Token lv_condition_1_5=null;
        Token lv_condition_1_6=null;
        Token lv_sign_2_1=null;
        Token lv_sign_2_2=null;
        AntlrDatatypeRuleToken lv_state_3_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:6190:2: ( ( ( (lv_item_0_0= RULE_ID ) ) ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) ) ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) ) )
            // InternalSitemap.g:6191:2: ( ( (lv_item_0_0= RULE_ID ) ) ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) ) ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) )
            {
            // InternalSitemap.g:6191:2: ( ( (lv_item_0_0= RULE_ID ) ) ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) ) ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) )
            // InternalSitemap.g:6192:3: ( (lv_item_0_0= RULE_ID ) ) ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) ) ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) )
            {
            // InternalSitemap.g:6192:3: ( (lv_item_0_0= RULE_ID ) )
            // InternalSitemap.g:6193:4: (lv_item_0_0= RULE_ID )
            {
            // InternalSitemap.g:6193:4: (lv_item_0_0= RULE_ID )
            // InternalSitemap.g:6194:5: lv_item_0_0= RULE_ID
            {
            lv_item_0_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_item_0_0, grammarAccess.getVisibilityRuleAccess().getItemIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVisibilityRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"item",
            						lv_item_0_0,
            						"org.xtext.example.sitemap.Sitemap.ID");
            				

            }


            }

            // InternalSitemap.g:6210:3: ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) )
            // InternalSitemap.g:6211:4: ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) )
            {
            // InternalSitemap.g:6211:4: ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) )
            // InternalSitemap.g:6212:5: (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' )
            {
            // InternalSitemap.g:6212:5: (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' )
            int alt84=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt84=1;
                }
                break;
            case 53:
                {
                alt84=2;
                }
                break;
            case 54:
                {
                alt84=3;
                }
                break;
            case 55:
                {
                alt84=4;
                }
                break;
            case 56:
                {
                alt84=5;
                }
                break;
            case 57:
                {
                alt84=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalSitemap.g:6213:6: lv_condition_1_1= '=='
                    {
                    lv_condition_1_1=(Token)match(input,52,FOLLOW_13); 

                    						newLeafNode(lv_condition_1_1, grammarAccess.getVisibilityRuleAccess().getConditionEqualsSignEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisibilityRuleRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSitemap.g:6224:6: lv_condition_1_2= '>'
                    {
                    lv_condition_1_2=(Token)match(input,53,FOLLOW_13); 

                    						newLeafNode(lv_condition_1_2, grammarAccess.getVisibilityRuleAccess().getConditionGreaterThanSignKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisibilityRuleRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSitemap.g:6235:6: lv_condition_1_3= '<'
                    {
                    lv_condition_1_3=(Token)match(input,54,FOLLOW_13); 

                    						newLeafNode(lv_condition_1_3, grammarAccess.getVisibilityRuleAccess().getConditionLessThanSignKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisibilityRuleRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSitemap.g:6246:6: lv_condition_1_4= '>='
                    {
                    lv_condition_1_4=(Token)match(input,55,FOLLOW_13); 

                    						newLeafNode(lv_condition_1_4, grammarAccess.getVisibilityRuleAccess().getConditionGreaterThanSignEqualsSignKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisibilityRuleRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalSitemap.g:6257:6: lv_condition_1_5= '<='
                    {
                    lv_condition_1_5=(Token)match(input,56,FOLLOW_13); 

                    						newLeafNode(lv_condition_1_5, grammarAccess.getVisibilityRuleAccess().getConditionLessThanSignEqualsSignKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisibilityRuleRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_1_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalSitemap.g:6268:6: lv_condition_1_6= '!='
                    {
                    lv_condition_1_6=(Token)match(input,57,FOLLOW_13); 

                    						newLeafNode(lv_condition_1_6, grammarAccess.getVisibilityRuleAccess().getConditionExclamationMarkEqualsSignKeyword_1_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisibilityRuleRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_1_6, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSitemap.g:6281:3: ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=58 && LA86_0<=59)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalSitemap.g:6282:4: ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) )
                    {
                    // InternalSitemap.g:6282:4: ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) )
                    // InternalSitemap.g:6283:5: (lv_sign_2_1= '-' | lv_sign_2_2= '+' )
                    {
                    // InternalSitemap.g:6283:5: (lv_sign_2_1= '-' | lv_sign_2_2= '+' )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==58) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==59) ) {
                        alt85=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalSitemap.g:6284:6: lv_sign_2_1= '-'
                            {
                            lv_sign_2_1=(Token)match(input,58,FOLLOW_13); 

                            						newLeafNode(lv_sign_2_1, grammarAccess.getVisibilityRuleAccess().getSignHyphenMinusKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVisibilityRuleRule());
                            						}
                            						setWithLastConsumed(current, "sign", lv_sign_2_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalSitemap.g:6295:6: lv_sign_2_2= '+'
                            {
                            lv_sign_2_2=(Token)match(input,59,FOLLOW_13); 

                            						newLeafNode(lv_sign_2_2, grammarAccess.getVisibilityRuleAccess().getSignPlusSignKeyword_2_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getVisibilityRuleRule());
                            						}
                            						setWithLastConsumed(current, "sign", lv_sign_2_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalSitemap.g:6308:3: ( (lv_state_3_0= ruleXState ) )
            // InternalSitemap.g:6309:4: (lv_state_3_0= ruleXState )
            {
            // InternalSitemap.g:6309:4: (lv_state_3_0= ruleXState )
            // InternalSitemap.g:6310:5: lv_state_3_0= ruleXState
            {

            					newCompositeNode(grammarAccess.getVisibilityRuleAccess().getStateXStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_state_3_0=ruleXState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisibilityRuleRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_3_0,
            						"org.xtext.example.sitemap.Sitemap.XState");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleVisibilityRule"


    // $ANTLR start "entryRuleItemRef"
    // InternalSitemap.g:6331:1: entryRuleItemRef returns [String current=null] : iv_ruleItemRef= ruleItemRef EOF ;
    public final String entryRuleItemRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleItemRef = null;


        try {
            // InternalSitemap.g:6331:47: (iv_ruleItemRef= ruleItemRef EOF )
            // InternalSitemap.g:6332:2: iv_ruleItemRef= ruleItemRef EOF
            {
             newCompositeNode(grammarAccess.getItemRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemRef=ruleItemRef();

            state._fsp--;

             current =iv_ruleItemRef.getText(); 
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
    // $ANTLR end "entryRuleItemRef"


    // $ANTLR start "ruleItemRef"
    // InternalSitemap.g:6338:1: ruleItemRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleItemRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSitemap.g:6344:2: (this_ID_0= RULE_ID )
            // InternalSitemap.g:6345:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getItemRefAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleItemRef"


    // $ANTLR start "entryRuleGroupItemRef"
    // InternalSitemap.g:6355:1: entryRuleGroupItemRef returns [String current=null] : iv_ruleGroupItemRef= ruleGroupItemRef EOF ;
    public final String entryRuleGroupItemRef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGroupItemRef = null;


        try {
            // InternalSitemap.g:6355:52: (iv_ruleGroupItemRef= ruleGroupItemRef EOF )
            // InternalSitemap.g:6356:2: iv_ruleGroupItemRef= ruleGroupItemRef EOF
            {
             newCompositeNode(grammarAccess.getGroupItemRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupItemRef=ruleGroupItemRef();

            state._fsp--;

             current =iv_ruleGroupItemRef.getText(); 
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
    // $ANTLR end "entryRuleGroupItemRef"


    // $ANTLR start "ruleGroupItemRef"
    // InternalSitemap.g:6362:1: ruleGroupItemRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleGroupItemRef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSitemap.g:6368:2: (this_ID_0= RULE_ID )
            // InternalSitemap.g:6369:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getGroupItemRefAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleGroupItemRef"


    // $ANTLR start "entryRuleIcon"
    // InternalSitemap.g:6379:1: entryRuleIcon returns [String current=null] : iv_ruleIcon= ruleIcon EOF ;
    public final String entryRuleIcon() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIcon = null;


        try {
            // InternalSitemap.g:6379:44: (iv_ruleIcon= ruleIcon EOF )
            // InternalSitemap.g:6380:2: iv_ruleIcon= ruleIcon EOF
            {
             newCompositeNode(grammarAccess.getIconRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIcon=ruleIcon();

            state._fsp--;

             current =iv_ruleIcon.getText(); 
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
    // $ANTLR end "entryRuleIcon"


    // $ANTLR start "ruleIcon"
    // InternalSitemap.g:6386:1: ruleIcon returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleIcon() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSitemap.g:6392:2: (this_STRING_0= RULE_STRING )
            // InternalSitemap.g:6393:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getIconAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleIcon"


    // $ANTLR start "entryRuleColorArray"
    // InternalSitemap.g:6403:1: entryRuleColorArray returns [EObject current=null] : iv_ruleColorArray= ruleColorArray EOF ;
    public final EObject entryRuleColorArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorArray = null;


        try {
            // InternalSitemap.g:6403:51: (iv_ruleColorArray= ruleColorArray EOF )
            // InternalSitemap.g:6404:2: iv_ruleColorArray= ruleColorArray EOF
            {
             newCompositeNode(grammarAccess.getColorArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorArray=ruleColorArray();

            state._fsp--;

             current =iv_ruleColorArray; 
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
    // $ANTLR end "entryRuleColorArray"


    // $ANTLR start "ruleColorArray"
    // InternalSitemap.g:6410:1: ruleColorArray returns [EObject current=null] : ( ( ( (lv_item_0_0= RULE_ID ) )? ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) )? ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) otherlv_4= '=' )? ( (lv_arg_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleColorArray() throws RecognitionException {
        EObject current = null;

        Token lv_item_0_0=null;
        Token lv_condition_1_1=null;
        Token lv_condition_1_2=null;
        Token lv_condition_1_3=null;
        Token lv_condition_1_4=null;
        Token lv_condition_1_5=null;
        Token lv_condition_1_6=null;
        Token lv_sign_2_1=null;
        Token lv_sign_2_2=null;
        Token otherlv_4=null;
        Token lv_arg_5_0=null;
        AntlrDatatypeRuleToken lv_state_3_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:6416:2: ( ( ( ( (lv_item_0_0= RULE_ID ) )? ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) )? ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) otherlv_4= '=' )? ( (lv_arg_5_0= RULE_STRING ) ) ) )
            // InternalSitemap.g:6417:2: ( ( ( (lv_item_0_0= RULE_ID ) )? ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) )? ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) otherlv_4= '=' )? ( (lv_arg_5_0= RULE_STRING ) ) )
            {
            // InternalSitemap.g:6417:2: ( ( ( (lv_item_0_0= RULE_ID ) )? ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) )? ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) otherlv_4= '=' )? ( (lv_arg_5_0= RULE_STRING ) ) )
            // InternalSitemap.g:6418:3: ( ( (lv_item_0_0= RULE_ID ) )? ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) )? ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) otherlv_4= '=' )? ( (lv_arg_5_0= RULE_STRING ) )
            {
            // InternalSitemap.g:6418:3: ( ( (lv_item_0_0= RULE_ID ) )? ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) )? ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) otherlv_4= '=' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID||(LA92_0>=RULE_INT && LA92_0<=RULE_FLOAT)||(LA92_0>=52 && LA92_0<=59)) ) {
                alt92=1;
            }
            else if ( (LA92_0==RULE_STRING) ) {
                int LA92_2 = input.LA(2);

                if ( (LA92_2==51) ) {
                    alt92=1;
                }
            }
            switch (alt92) {
                case 1 :
                    // InternalSitemap.g:6419:4: ( (lv_item_0_0= RULE_ID ) )? ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) )? ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )? ( (lv_state_3_0= ruleXState ) ) otherlv_4= '='
                    {
                    // InternalSitemap.g:6419:4: ( (lv_item_0_0= RULE_ID ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==RULE_ID) ) {
                        int LA87_1 = input.LA(2);

                        if ( ((LA87_1>=RULE_ID && LA87_1<=RULE_FLOAT)||(LA87_1>=52 && LA87_1<=59)) ) {
                            alt87=1;
                        }
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalSitemap.g:6420:5: (lv_item_0_0= RULE_ID )
                            {
                            // InternalSitemap.g:6420:5: (lv_item_0_0= RULE_ID )
                            // InternalSitemap.g:6421:6: lv_item_0_0= RULE_ID
                            {
                            lv_item_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                            						newLeafNode(lv_item_0_0, grammarAccess.getColorArrayAccess().getItemIDTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getColorArrayRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"item",
                            							lv_item_0_0,
                            							"org.xtext.example.sitemap.Sitemap.ID");
                            					

                            }


                            }
                            break;

                    }

                    // InternalSitemap.g:6437:4: ( ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( ((LA89_0>=52 && LA89_0<=57)) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalSitemap.g:6438:5: ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) )
                            {
                            // InternalSitemap.g:6438:5: ( (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' ) )
                            // InternalSitemap.g:6439:6: (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' )
                            {
                            // InternalSitemap.g:6439:6: (lv_condition_1_1= '==' | lv_condition_1_2= '>' | lv_condition_1_3= '<' | lv_condition_1_4= '>=' | lv_condition_1_5= '<=' | lv_condition_1_6= '!=' )
                            int alt88=6;
                            switch ( input.LA(1) ) {
                            case 52:
                                {
                                alt88=1;
                                }
                                break;
                            case 53:
                                {
                                alt88=2;
                                }
                                break;
                            case 54:
                                {
                                alt88=3;
                                }
                                break;
                            case 55:
                                {
                                alt88=4;
                                }
                                break;
                            case 56:
                                {
                                alt88=5;
                                }
                                break;
                            case 57:
                                {
                                alt88=6;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 88, 0, input);

                                throw nvae;
                            }

                            switch (alt88) {
                                case 1 :
                                    // InternalSitemap.g:6440:7: lv_condition_1_1= '=='
                                    {
                                    lv_condition_1_1=(Token)match(input,52,FOLLOW_13); 

                                    							newLeafNode(lv_condition_1_1, grammarAccess.getColorArrayAccess().getConditionEqualsSignEqualsSignKeyword_0_1_0_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getColorArrayRule());
                                    							}
                                    							setWithLastConsumed(current, "condition", lv_condition_1_1, null);
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalSitemap.g:6451:7: lv_condition_1_2= '>'
                                    {
                                    lv_condition_1_2=(Token)match(input,53,FOLLOW_13); 

                                    							newLeafNode(lv_condition_1_2, grammarAccess.getColorArrayAccess().getConditionGreaterThanSignKeyword_0_1_0_1());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getColorArrayRule());
                                    							}
                                    							setWithLastConsumed(current, "condition", lv_condition_1_2, null);
                                    						

                                    }
                                    break;
                                case 3 :
                                    // InternalSitemap.g:6462:7: lv_condition_1_3= '<'
                                    {
                                    lv_condition_1_3=(Token)match(input,54,FOLLOW_13); 

                                    							newLeafNode(lv_condition_1_3, grammarAccess.getColorArrayAccess().getConditionLessThanSignKeyword_0_1_0_2());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getColorArrayRule());
                                    							}
                                    							setWithLastConsumed(current, "condition", lv_condition_1_3, null);
                                    						

                                    }
                                    break;
                                case 4 :
                                    // InternalSitemap.g:6473:7: lv_condition_1_4= '>='
                                    {
                                    lv_condition_1_4=(Token)match(input,55,FOLLOW_13); 

                                    							newLeafNode(lv_condition_1_4, grammarAccess.getColorArrayAccess().getConditionGreaterThanSignEqualsSignKeyword_0_1_0_3());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getColorArrayRule());
                                    							}
                                    							setWithLastConsumed(current, "condition", lv_condition_1_4, null);
                                    						

                                    }
                                    break;
                                case 5 :
                                    // InternalSitemap.g:6484:7: lv_condition_1_5= '<='
                                    {
                                    lv_condition_1_5=(Token)match(input,56,FOLLOW_13); 

                                    							newLeafNode(lv_condition_1_5, grammarAccess.getColorArrayAccess().getConditionLessThanSignEqualsSignKeyword_0_1_0_4());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getColorArrayRule());
                                    							}
                                    							setWithLastConsumed(current, "condition", lv_condition_1_5, null);
                                    						

                                    }
                                    break;
                                case 6 :
                                    // InternalSitemap.g:6495:7: lv_condition_1_6= '!='
                                    {
                                    lv_condition_1_6=(Token)match(input,57,FOLLOW_13); 

                                    							newLeafNode(lv_condition_1_6, grammarAccess.getColorArrayAccess().getConditionExclamationMarkEqualsSignKeyword_0_1_0_5());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getColorArrayRule());
                                    							}
                                    							setWithLastConsumed(current, "condition", lv_condition_1_6, null);
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    // InternalSitemap.g:6508:4: ( ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( ((LA91_0>=58 && LA91_0<=59)) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalSitemap.g:6509:5: ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) )
                            {
                            // InternalSitemap.g:6509:5: ( (lv_sign_2_1= '-' | lv_sign_2_2= '+' ) )
                            // InternalSitemap.g:6510:6: (lv_sign_2_1= '-' | lv_sign_2_2= '+' )
                            {
                            // InternalSitemap.g:6510:6: (lv_sign_2_1= '-' | lv_sign_2_2= '+' )
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==58) ) {
                                alt90=1;
                            }
                            else if ( (LA90_0==59) ) {
                                alt90=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 90, 0, input);

                                throw nvae;
                            }
                            switch (alt90) {
                                case 1 :
                                    // InternalSitemap.g:6511:7: lv_sign_2_1= '-'
                                    {
                                    lv_sign_2_1=(Token)match(input,58,FOLLOW_13); 

                                    							newLeafNode(lv_sign_2_1, grammarAccess.getColorArrayAccess().getSignHyphenMinusKeyword_0_2_0_0());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getColorArrayRule());
                                    							}
                                    							setWithLastConsumed(current, "sign", lv_sign_2_1, null);
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalSitemap.g:6522:7: lv_sign_2_2= '+'
                                    {
                                    lv_sign_2_2=(Token)match(input,59,FOLLOW_13); 

                                    							newLeafNode(lv_sign_2_2, grammarAccess.getColorArrayAccess().getSignPlusSignKeyword_0_2_0_1());
                                    						

                                    							if (current==null) {
                                    								current = createModelElement(grammarAccess.getColorArrayRule());
                                    							}
                                    							setWithLastConsumed(current, "sign", lv_sign_2_2, null);
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    // InternalSitemap.g:6535:4: ( (lv_state_3_0= ruleXState ) )
                    // InternalSitemap.g:6536:5: (lv_state_3_0= ruleXState )
                    {
                    // InternalSitemap.g:6536:5: (lv_state_3_0= ruleXState )
                    // InternalSitemap.g:6537:6: lv_state_3_0= ruleXState
                    {

                    						newCompositeNode(grammarAccess.getColorArrayAccess().getStateXStateParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_state_3_0=ruleXState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorArrayRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_3_0,
                    							"org.xtext.example.sitemap.Sitemap.XState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getColorArrayAccess().getEqualsSignKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalSitemap.g:6559:3: ( (lv_arg_5_0= RULE_STRING ) )
            // InternalSitemap.g:6560:4: (lv_arg_5_0= RULE_STRING )
            {
            // InternalSitemap.g:6560:4: (lv_arg_5_0= RULE_STRING )
            // InternalSitemap.g:6561:5: lv_arg_5_0= RULE_STRING
            {
            lv_arg_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_arg_5_0, grammarAccess.getColorArrayAccess().getArgSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"arg",
            						lv_arg_5_0,
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
    // $ANTLR end "ruleColorArray"


    // $ANTLR start "entryRuleCommand"
    // InternalSitemap.g:6581:1: entryRuleCommand returns [String current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final String entryRuleCommand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommand = null;


        try {
            // InternalSitemap.g:6581:47: (iv_ruleCommand= ruleCommand EOF )
            // InternalSitemap.g:6582:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand.getText(); 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalSitemap.g:6588:1: ruleCommand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Number_0= ruleNumber | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleCommand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_Number_0 = null;



        	enterRule();

        try {
            // InternalSitemap.g:6594:2: ( (this_Number_0= ruleNumber | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING ) )
            // InternalSitemap.g:6595:2: (this_Number_0= ruleNumber | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING )
            {
            // InternalSitemap.g:6595:2: (this_Number_0= ruleNumber | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING )
            int alt93=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case 58:
                {
                alt93=1;
                }
                break;
            case RULE_ID:
                {
                alt93=2;
                }
                break;
            case RULE_STRING:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalSitemap.g:6596:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current.merge(this_Number_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSitemap.g:6607:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getCommandAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSitemap.g:6615:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getCommandAccess().getSTRINGTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleNumber"
    // InternalSitemap.g:6626:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalSitemap.g:6626:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalSitemap.g:6627:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSitemap.g:6633:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= RULE_FLOAT ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_FLOAT_2=null;


        	enterRule();

        try {
            // InternalSitemap.g:6639:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= RULE_FLOAT ) ) )
            // InternalSitemap.g:6640:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= RULE_FLOAT ) )
            {
            // InternalSitemap.g:6640:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= RULE_FLOAT ) )
            // InternalSitemap.g:6641:3: (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= RULE_FLOAT )
            {
            // InternalSitemap.g:6641:3: (kw= '-' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==58) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSitemap.g:6642:4: kw= '-'
                    {
                    kw=(Token)match(input,58,FOLLOW_42); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumberAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSitemap.g:6648:3: (this_INT_1= RULE_INT | this_FLOAT_2= RULE_FLOAT )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_INT) ) {
                alt95=1;
            }
            else if ( (LA95_0==RULE_FLOAT) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalSitemap.g:6649:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSitemap.g:6657:4: this_FLOAT_2= RULE_FLOAT
                    {
                    this_FLOAT_2=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    				current.merge(this_FLOAT_2);
                    			

                    				newLeafNode(this_FLOAT_2, grammarAccess.getNumberAccess().getFLOATTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleXState"
    // InternalSitemap.g:6669:1: entryRuleXState returns [String current=null] : iv_ruleXState= ruleXState EOF ;
    public final String entryRuleXState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXState = null;


        try {
            // InternalSitemap.g:6669:46: (iv_ruleXState= ruleXState EOF )
            // InternalSitemap.g:6670:2: iv_ruleXState= ruleXState EOF
            {
             newCompositeNode(grammarAccess.getXStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXState=ruleXState();

            state._fsp--;

             current =iv_ruleXState.getText(); 
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
    // $ANTLR end "entryRuleXState"


    // $ANTLR start "ruleXState"
    // InternalSitemap.g:6676:1: ruleXState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_FLOAT_3= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleXState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token this_STRING_2=null;
        Token this_FLOAT_3=null;


        	enterRule();

        try {
            // InternalSitemap.g:6682:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_FLOAT_3= RULE_FLOAT ) )
            // InternalSitemap.g:6683:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_FLOAT_3= RULE_FLOAT )
            {
            // InternalSitemap.g:6683:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_STRING_2= RULE_STRING | this_FLOAT_3= RULE_FLOAT )
            int alt96=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt96=1;
                }
                break;
            case RULE_ID:
                {
                alt96=2;
                }
                break;
            case RULE_STRING:
                {
                alt96=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalSitemap.g:6684:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getXStateAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSitemap.g:6692:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getXStateAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSitemap.g:6700:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getXStateAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSitemap.g:6708:3: this_FLOAT_3= RULE_FLOAT
                    {
                    this_FLOAT_3=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    			current.merge(this_FLOAT_3);
                    		

                    			newLeafNode(this_FLOAT_3, grammarAccess.getXStateAccess().getFLOATTerminalRuleCall_3());
                    		

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
    // $ANTLR end "ruleXState"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA77 dfa77 = new DFA77(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\15\12\uffff";
    static final String dfa_4s = "\1\62\12\uffff";
    static final String dfa_5s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\1\0\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\4\3\1\1\2\1\7\2\uffff\1\10\1\12\3\1\1\5\1\6\1\11\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff\1\1\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 1526:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'iconcolor=[' ( ( (lv_IconColor_23_0= ruleColorArray ) ) (otherlv_24= ',' ( (lv_IconColor_25_0= ruleColorArray ) ) )* otherlv_26= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'visibility=[' ( ( (lv_Visibility_28_0= ruleVisibilityRule ) ) (otherlv_29= ',' ( (lv_Visibility_30_0= ruleVisibilityRule ) ) )* otherlv_31= ']' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==EOF||(LA29_0>=15 && LA29_0<=17)||(LA29_0>=24 && LA29_0<=26)||LA29_0==30||LA29_0==32||LA29_0==35||(LA29_0>=37 && LA29_0<=38)||LA29_0==40||(LA29_0>=43 && LA29_0<=44)||LA29_0==46||LA29_0==50) ) {s = 1;}

                        else if ( LA29_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA29_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA29_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA29_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA29_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA29_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA29_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA29_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA29_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getImageAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\1\11\uffff";
    static final String dfa_10s = "\1\15\11\uffff";
    static final String dfa_11s = "\1\62\11\uffff";
    static final String dfa_12s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_13s = "\1\0\11\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\1\4\1\uffff\2\1\1\2\1\7\2\uffff\1\10\1\11\3\1\1\5\2\uffff\1\1\1\6\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff\1\1\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 2008:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'url=' ( (lv_url_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'encoding=' ( (lv_encoding_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==EOF||(LA34_0>=16 && LA34_0<=17)||(LA34_0>=24 && LA34_0<=26)||LA34_0==30||LA34_0==32||LA34_0==35||(LA34_0>=37 && LA34_0<=38)||LA34_0==40||(LA34_0>=43 && LA34_0<=44)||LA34_0==46||LA34_0==50) ) {s = 1;}

                        else if ( LA34_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA34_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA34_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA34_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA34_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA34_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA34_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA34_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getVideoAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_15s = {
            "\1\3\1\4\1\uffff\2\1\1\2\1\10\2\uffff\1\11\1\12\3\1\1\uffff\1\6\1\uffff\1\1\1\uffff\1\1\1\5\1\7\1\1\1\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff\1\1\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "()+ loopback of 2425:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'service=' ( (lv_service_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'refresh=' ( (lv_refresh_11_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'period=' ( (lv_period_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_0 = input.LA(1);

                         
                        int index39_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_0==EOF||(LA39_0>=16 && LA39_0<=17)||(LA39_0>=24 && LA39_0<=26)||LA39_0==30||LA39_0==32||LA39_0==35||(LA39_0>=37 && LA39_0<=38)||LA39_0==40||(LA39_0>=43 && LA39_0<=44)||LA39_0==46||LA39_0==50) ) {s = 1;}

                        else if ( LA39_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA39_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA39_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA39_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA39_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA39_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA39_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA39_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA39_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getChartAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index39_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_16s = {
            "\1\3\1\4\1\uffff\2\1\1\2\1\7\2\uffff\1\10\1\11\3\1\1\6\2\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\5\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff\1\1\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "()+ loopback of 2875:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'height=' ( (lv_height_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'url=' ( (lv_url_11_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labelcolor=[' ( ( (lv_LabelColor_13_0= ruleColorArray ) ) (otherlv_14= ',' ( (lv_LabelColor_15_0= ruleColorArray ) ) )* otherlv_16= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'valuecolor=[' ( ( (lv_ValueColor_18_0= ruleColorArray ) ) (otherlv_19= ',' ( (lv_ValueColor_20_0= ruleColorArray ) ) )* otherlv_21= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'visibility=[' ( ( (lv_Visibility_23_0= ruleVisibilityRule ) ) (otherlv_24= ',' ( (lv_Visibility_25_0= ruleVisibilityRule ) ) )* otherlv_26= ']' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_0 = input.LA(1);

                         
                        int index44_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA44_0==EOF||(LA44_0>=16 && LA44_0<=17)||(LA44_0>=24 && LA44_0<=26)||LA44_0==30||LA44_0==32||LA44_0==35||(LA44_0>=37 && LA44_0<=38)||LA44_0==40||(LA44_0>=43 && LA44_0<=44)||LA44_0==46||LA44_0==50) ) {s = 1;}

                        else if ( LA44_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA44_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA44_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA44_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA44_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA44_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA44_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA44_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getWebviewAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                         
                        input.seek(index44_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_17s = {
            "\1\3\1\4\1\uffff\2\1\1\2\1\7\2\uffff\1\10\1\11\3\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1\5\1\6\2\1\1\uffff\1\1\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "()+ loopback of 4090:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'sendFrequency=' ( (lv_frequency_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_switchEnabled_10_0= 'switchSupport' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'labelcolor=[' ( ( (lv_LabelColor_12_0= ruleColorArray ) ) (otherlv_13= ',' ( (lv_LabelColor_14_0= ruleColorArray ) ) )* otherlv_15= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'valuecolor=[' ( ( (lv_ValueColor_17_0= ruleColorArray ) ) (otherlv_18= ',' ( (lv_ValueColor_19_0= ruleColorArray ) ) )* otherlv_20= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'visibility=[' ( ( (lv_Visibility_22_0= ruleVisibilityRule ) ) (otherlv_23= ',' ( (lv_Visibility_24_0= ruleVisibilityRule ) ) )* otherlv_25= ']' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_0 = input.LA(1);

                         
                        int index60_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_0==EOF||(LA60_0>=16 && LA60_0<=17)||(LA60_0>=24 && LA60_0<=26)||LA60_0==30||LA60_0==32||LA60_0==35||(LA60_0>=37 && LA60_0<=38)||LA60_0==40||(LA60_0>=43 && LA60_0<=44)||LA60_0==46||LA60_0==50) ) {s = 1;}

                        else if ( LA60_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA60_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA60_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA60_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA60_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA60_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA60_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA60_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSliderAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                         
                        input.seek(index60_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_18s = {
            "\1\3\1\4\1\uffff\2\1\1\2\1\10\2\uffff\1\11\1\12\3\1\3\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff\1\1\1\5\1\6\1\7\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()+ loopback of 5288:6: ( ({...}? => ( ({...}? => (otherlv_2= 'item=' ( (lv_item_3_0= ruleItemRef ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'label=' ( ( (lv_label_5_1= RULE_ID | lv_label_5_2= RULE_STRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'icon=' ( (lv_icon_7_0= ruleIcon ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'minValue=' ( (lv_minValue_9_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'maxValue=' ( (lv_maxValue_11_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'step=' ( (lv_step_13_0= ruleNumber ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'labelcolor=[' ( ( (lv_LabelColor_15_0= ruleColorArray ) ) (otherlv_16= ',' ( (lv_LabelColor_17_0= ruleColorArray ) ) )* otherlv_18= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'valuecolor=[' ( ( (lv_ValueColor_20_0= ruleColorArray ) ) (otherlv_21= ',' ( (lv_ValueColor_22_0= ruleColorArray ) ) )* otherlv_23= ']' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'visibility=[' ( ( (lv_Visibility_25_0= ruleVisibilityRule ) ) (otherlv_26= ',' ( (lv_Visibility_27_0= ruleVisibilityRule ) ) )* otherlv_28= ']' ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_0 = input.LA(1);

                         
                        int index77_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA77_0==EOF||(LA77_0>=16 && LA77_0<=17)||(LA77_0>=24 && LA77_0<=26)||LA77_0==30||LA77_0==32||LA77_0==35||(LA77_0>=37 && LA77_0<=38)||LA77_0==40||(LA77_0>=43 && LA77_0<=44)||LA77_0==46||LA77_0==50) ) {s = 1;}

                        else if ( LA77_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA77_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA77_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA77_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA77_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA77_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA77_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA77_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA77_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSetpointAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                         
                        input.seek(index77_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0004596947020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004596947030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000CC6002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0FF00000000000F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000CC6000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000038CC6000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000038CC6002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000088CC6000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000088CC6002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000610CC6000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000610CC6002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001008CC6000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001008CC6002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000CC6000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000CC6002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000CC6000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000CC6002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x04000000000000F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000060000CC6000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000060000CC6002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000CC6000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000CC6002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0003800000CC6000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0003800000CC6002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x04000000000000C0L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000CC6000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000CC6002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000000000C0L});

}
