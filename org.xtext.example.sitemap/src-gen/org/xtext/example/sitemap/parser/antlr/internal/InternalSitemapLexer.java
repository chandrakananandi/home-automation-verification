package org.xtext.example.sitemap.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSitemapLexer extends Lexer {
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

    public InternalSitemapLexer() {;} 
    public InternalSitemapLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSitemapLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSitemap.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:11:7: ( 'sitemap' )
            // InternalSitemap.g:11:9: 'sitemap'
            {
            match("sitemap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:12:7: ( 'label=' )
            // InternalSitemap.g:12:9: 'label='
            {
            match("label="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:13:7: ( 'icon=' )
            // InternalSitemap.g:13:9: 'icon='
            {
            match("icon="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:14:7: ( '{' )
            // InternalSitemap.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:15:7: ( '}' )
            // InternalSitemap.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:16:7: ( 'Frame' )
            // InternalSitemap.g:16:9: 'Frame'
            {
            match("Frame"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:17:7: ( 'item=' )
            // InternalSitemap.g:17:9: 'item='
            {
            match("item="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:18:7: ( 'labelcolor=[' )
            // InternalSitemap.g:18:9: 'labelcolor=['
            {
            match("labelcolor=["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:19:7: ( ',' )
            // InternalSitemap.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:20:7: ( ']' )
            // InternalSitemap.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:21:7: ( 'valuecolor=[' )
            // InternalSitemap.g:21:9: 'valuecolor=['
            {
            match("valuecolor=["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:22:7: ( 'visibility=[' )
            // InternalSitemap.g:22:9: 'visibility=['
            {
            match("visibility=["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:23:7: ( 'Text' )
            // InternalSitemap.g:23:9: 'Text'
            {
            match("Text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:24:7: ( 'Group' )
            // InternalSitemap.g:24:9: 'Group'
            {
            match("Group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:25:7: ( 'Image' )
            // InternalSitemap.g:25:9: 'Image'
            {
            match("Image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:26:7: ( 'url=' )
            // InternalSitemap.g:26:9: 'url='
            {
            match("url="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:27:7: ( 'refresh=' )
            // InternalSitemap.g:27:9: 'refresh='
            {
            match("refresh="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:28:7: ( 'iconcolor=[' )
            // InternalSitemap.g:28:9: 'iconcolor=['
            {
            match("iconcolor=["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:29:7: ( 'Video' )
            // InternalSitemap.g:29:9: 'Video'
            {
            match("Video"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:30:7: ( 'encoding=' )
            // InternalSitemap.g:30:9: 'encoding='
            {
            match("encoding="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:31:7: ( 'Chart' )
            // InternalSitemap.g:31:9: 'Chart'
            {
            match("Chart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:32:7: ( 'service=' )
            // InternalSitemap.g:32:9: 'service='
            {
            match("service="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:33:7: ( 'period=' )
            // InternalSitemap.g:33:9: 'period='
            {
            match("period="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:34:7: ( 'Webview' )
            // InternalSitemap.g:34:9: 'Webview'
            {
            match("Webview"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:35:7: ( 'height=' )
            // InternalSitemap.g:35:9: 'height='
            {
            match("height="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:36:7: ( 'Mapview' )
            // InternalSitemap.g:36:9: 'Mapview'
            {
            match("Mapview"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:37:7: ( 'Switch' )
            // InternalSitemap.g:37:9: 'Switch'
            {
            match("Switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:38:7: ( 'mappings=[' )
            // InternalSitemap.g:38:9: 'mappings=['
            {
            match("mappings=["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:39:7: ( 'Slider' )
            // InternalSitemap.g:39:9: 'Slider'
            {
            match("Slider"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:40:7: ( 'sendFrequency=' )
            // InternalSitemap.g:40:9: 'sendFrequency='
            {
            match("sendFrequency="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:41:7: ( 'switchSupport' )
            // InternalSitemap.g:41:9: 'switchSupport'
            {
            match("switchSupport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:42:7: ( 'Selection' )
            // InternalSitemap.g:42:9: 'Selection'
            {
            match("Selection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:43:7: ( 'List' )
            // InternalSitemap.g:43:9: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:44:7: ( 'separator=' )
            // InternalSitemap.g:44:9: 'separator='
            {
            match("separator="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:45:7: ( 'Setpoint' )
            // InternalSitemap.g:45:9: 'Setpoint'
            {
            match("Setpoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:46:7: ( 'minValue=' )
            // InternalSitemap.g:46:9: 'minValue='
            {
            match("minValue="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:47:7: ( 'maxValue=' )
            // InternalSitemap.g:47:9: 'maxValue='
            {
            match("maxValue="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:48:7: ( 'step=' )
            // InternalSitemap.g:48:9: 'step='
            {
            match("step="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:49:7: ( 'Colorpicker' )
            // InternalSitemap.g:49:9: 'Colorpicker'
            {
            match("Colorpicker"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:50:7: ( '=' )
            // InternalSitemap.g:50:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:51:7: ( '==' )
            // InternalSitemap.g:51:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:52:7: ( '>' )
            // InternalSitemap.g:52:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:53:7: ( '<' )
            // InternalSitemap.g:53:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:54:7: ( '>=' )
            // InternalSitemap.g:54:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:55:7: ( '<=' )
            // InternalSitemap.g:55:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:56:7: ( '!=' )
            // InternalSitemap.g:56:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:57:7: ( '-' )
            // InternalSitemap.g:57:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:58:7: ( '+' )
            // InternalSitemap.g:58:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:6718:9: ( ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | ( '0' .. '9' )+ ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )* ) )
            // InternalSitemap.g:6718:11: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | ( '0' .. '9' )+ ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            {
            // InternalSitemap.g:6718:11: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | ( '0' .. '9' )+ ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='A' && LA5_0<='Z')||(LA5_0>='^' && LA5_0<='_')||(LA5_0>='a' && LA5_0<='z')) ) {
                alt5=1;
            }
            else if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSitemap.g:6718:12: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    // InternalSitemap.g:6718:12: ( '^' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='^') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalSitemap.g:6718:12: '^'
                            {
                            match('^'); 

                            }
                            break;

                    }

                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSitemap.g:6718:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSitemap.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalSitemap.g:6718:75: ( '0' .. '9' )+ ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
                    {
                    // InternalSitemap.g:6718:75: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSitemap.g:6718:76: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalSitemap.g:6718:111: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSitemap.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:6720:12: ( ( '-' )? RULE_INT '.' RULE_INT )
            // InternalSitemap.g:6720:14: ( '-' )? RULE_INT '.' RULE_INT
            {
            // InternalSitemap.g:6720:14: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSitemap.g:6720:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:6722:10: ( ( '0' .. '9' )+ )
            // InternalSitemap.g:6722:12: ( '0' .. '9' )+
            {
            // InternalSitemap.g:6722:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSitemap.g:6722:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:6724:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSitemap.g:6724:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSitemap.g:6724:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSitemap.g:6724:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSitemap.g:6724:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSitemap.g:6724:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSitemap.g:6724:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSitemap.g:6724:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSitemap.g:6724:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSitemap.g:6724:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSitemap.g:6724:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:6726:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSitemap.g:6726:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSitemap.g:6726:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSitemap.g:6726:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:6728:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSitemap.g:6728:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSitemap.g:6728:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSitemap.g:6728:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalSitemap.g:6728:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSitemap.g:6728:41: ( '\\r' )? '\\n'
                    {
                    // InternalSitemap.g:6728:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSitemap.g:6728:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:6730:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSitemap.g:6730:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSitemap.g:6730:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSitemap.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSitemap.g:6732:16: ( . )
            // InternalSitemap.g:6732:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSitemap.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_ID | RULE_FLOAT | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=56;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalSitemap.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalSitemap.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalSitemap.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalSitemap.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalSitemap.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalSitemap.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalSitemap.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalSitemap.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalSitemap.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalSitemap.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalSitemap.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalSitemap.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalSitemap.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalSitemap.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalSitemap.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalSitemap.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalSitemap.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalSitemap.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalSitemap.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalSitemap.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalSitemap.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalSitemap.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalSitemap.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalSitemap.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalSitemap.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalSitemap.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalSitemap.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalSitemap.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalSitemap.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalSitemap.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalSitemap.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalSitemap.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalSitemap.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalSitemap.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalSitemap.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalSitemap.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalSitemap.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalSitemap.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalSitemap.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalSitemap.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalSitemap.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalSitemap.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalSitemap.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalSitemap.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalSitemap.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalSitemap.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalSitemap.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalSitemap.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalSitemap.g:1:298: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 50 :
                // InternalSitemap.g:1:306: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 51 :
                // InternalSitemap.g:1:317: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // InternalSitemap.g:1:326: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalSitemap.g:1:338: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 54 :
                // InternalSitemap.g:1:354: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 55 :
                // InternalSitemap.g:1:370: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 56 :
                // InternalSitemap.g:1:378: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\3\53\2\uffff\1\53\2\uffff\20\53\1\112\1\114\1\116\1\46\1\120\1\uffff\1\46\1\uffff\1\123\3\46\2\uffff\4\53\1\uffff\3\53\2\uffff\1\53\2\uffff\25\53\13\uffff\1\123\4\uffff\55\53\1\u00a8\2\53\1\uffff\20\53\1\u00bb\5\53\1\uffff\1\53\1\uffff\1\53\1\uffff\1\u00c4\2\53\1\uffff\1\u00c7\1\u00c8\1\53\1\u00ca\1\53\1\u00cc\14\53\1\uffff\5\53\1\uffff\2\53\1\uffff\2\53\2\uffff\1\53\1\uffff\1\53\1\uffff\5\53\1\u00e9\1\u00ea\5\53\1\u00f0\13\53\1\uffff\1\u00fc\1\uffff\1\u00fd\2\uffff\5\53\2\uffff\7\53\1\uffff\2\53\2\uffff\1\53\1\u010d\12\53\1\uffff\1\53\1\u0119\4\uffff\1\53\1\uffff\2\53\1\uffff\3\53\1\uffff\2\53\3\uffff\1\u0122\2\53\1\uffff\1\53\1\u0126\2\uffff";
    static final String DFA16_eofS =
        "\u0127\uffff";
    static final String DFA16_minS =
        "\1\0\1\145\1\141\1\143\2\uffff\1\162\2\uffff\1\141\1\145\1\162\1\155\1\162\1\145\1\151\1\156\1\150\3\145\1\141\1\145\1\141\1\151\4\75\1\60\1\uffff\1\101\1\uffff\1\56\2\0\1\52\2\uffff\1\164\1\156\1\151\1\145\1\uffff\1\142\1\157\1\145\2\uffff\1\141\2\uffff\1\154\1\163\1\170\1\157\1\141\1\154\1\146\1\144\1\143\1\141\1\154\1\162\1\142\1\151\1\160\2\151\1\154\1\160\1\156\1\163\13\uffff\1\56\4\uffff\1\145\1\166\1\144\1\141\1\164\1\160\1\145\1\156\2\155\1\165\1\151\1\164\1\165\1\147\1\75\1\162\1\145\1\157\1\162\1\157\1\151\1\166\1\147\1\166\1\164\1\144\1\145\2\160\2\126\1\164\1\155\1\151\1\106\1\162\1\143\1\75\1\154\2\75\2\145\1\142\1\60\1\160\1\145\1\uffff\1\145\1\157\1\144\1\164\1\162\1\157\1\151\1\150\1\151\1\143\1\145\1\143\1\157\1\151\2\141\1\60\1\141\1\143\1\162\1\141\1\150\1\uffff\1\75\1\uffff\1\157\1\uffff\1\60\1\143\1\151\1\uffff\2\60\1\163\1\60\1\151\1\60\1\160\1\144\1\145\1\164\1\145\1\150\1\162\1\164\1\151\1\156\2\154\1\uffff\1\160\2\145\1\164\1\123\1\uffff\1\157\1\154\1\uffff\1\157\1\154\2\uffff\1\150\1\uffff\1\156\1\uffff\1\151\1\75\1\167\1\75\1\167\2\60\1\151\1\156\1\147\2\165\1\60\1\75\1\161\1\157\1\165\1\154\1\157\1\154\1\151\1\75\1\147\1\143\1\uffff\1\60\1\uffff\1\60\2\uffff\1\157\1\164\1\163\2\145\2\uffff\1\165\1\162\1\160\1\157\1\162\1\157\1\164\1\uffff\1\75\1\153\2\uffff\1\156\1\60\3\75\1\145\1\75\1\160\1\162\1\75\1\162\1\171\1\uffff\1\145\1\60\4\uffff\1\156\1\uffff\1\157\1\75\1\uffff\2\75\1\162\1\uffff\1\143\1\162\3\uffff\1\60\1\171\1\164\1\uffff\1\75\1\60\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\167\1\141\1\164\2\uffff\1\162\2\uffff\1\151\1\145\1\162\1\155\1\162\1\145\1\151\1\156\1\157\3\145\1\141\1\167\2\151\4\75\1\71\1\uffff\1\172\1\uffff\1\172\2\uffff\1\57\2\uffff\1\164\1\162\1\151\1\145\1\uffff\1\142\1\157\1\145\2\uffff\1\141\2\uffff\1\154\1\163\1\170\1\157\1\141\1\154\1\146\1\144\1\143\1\141\1\154\1\162\1\142\1\151\1\160\2\151\1\164\1\170\1\156\1\163\13\uffff\1\172\4\uffff\1\145\1\166\1\144\1\141\1\164\1\160\1\145\1\156\2\155\1\165\1\151\1\164\1\165\1\147\1\75\1\162\1\145\1\157\1\162\1\157\1\151\1\166\1\147\1\166\1\164\1\144\1\145\2\160\2\126\1\164\1\155\1\151\1\106\1\162\1\143\1\75\1\154\1\143\1\75\2\145\1\142\1\172\1\160\1\145\1\uffff\1\145\1\157\1\144\1\164\1\162\1\157\1\151\1\150\1\151\1\143\1\145\1\143\1\157\1\151\2\141\1\172\1\141\1\143\1\162\1\141\1\150\1\uffff\1\143\1\uffff\1\157\1\uffff\1\172\1\143\1\151\1\uffff\2\172\1\163\1\172\1\151\1\172\1\160\1\144\1\145\1\164\1\145\1\150\1\162\1\164\1\151\1\156\2\154\1\uffff\1\160\2\145\1\164\1\123\1\uffff\1\157\1\154\1\uffff\1\157\1\154\2\uffff\1\150\1\uffff\1\156\1\uffff\1\151\1\75\1\167\1\75\1\167\2\172\1\151\1\156\1\147\2\165\1\172\1\75\1\161\1\157\1\165\1\154\1\157\1\154\1\151\1\75\1\147\1\143\1\uffff\1\172\1\uffff\1\172\2\uffff\1\157\1\164\1\163\2\145\2\uffff\1\165\1\162\1\160\1\157\1\162\1\157\1\164\1\uffff\1\75\1\153\2\uffff\1\156\1\172\3\75\1\145\1\75\1\160\1\162\1\75\1\162\1\171\1\uffff\1\145\1\172\4\uffff\1\156\1\uffff\1\157\1\75\1\uffff\2\75\1\162\1\uffff\1\143\1\162\3\uffff\1\172\1\171\1\164\1\uffff\1\75\1\172\2\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\1\5\1\uffff\1\11\1\12\25\uffff\1\60\1\uffff\1\61\4\uffff\1\67\1\70\4\uffff\1\61\3\uffff\1\4\1\5\1\uffff\1\11\1\12\25\uffff\1\51\1\50\1\54\1\52\1\55\1\53\1\56\1\57\1\62\1\60\1\63\1\uffff\1\64\1\65\1\66\1\67\60\uffff\1\20\26\uffff\1\46\1\uffff\1\3\1\uffff\1\7\3\uffff\1\15\22\uffff\1\41\5\uffff\1\2\2\uffff\1\6\2\uffff\1\16\1\17\1\uffff\1\23\1\uffff\1\25\30\uffff\1\27\1\uffff\1\31\1\uffff\1\33\1\35\5\uffff\1\1\1\26\7\uffff\1\21\2\uffff\1\30\1\32\14\uffff\1\24\2\uffff\1\43\1\34\1\45\1\44\1\uffff\1\42\2\uffff\1\22\3\uffff\1\40\2\uffff\1\10\1\13\1\14\3\uffff\1\47\2\uffff\1\36\1\37";
    static final String DFA16_specialS =
        "\1\0\41\uffff\1\1\1\2\u0103\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\34\1\42\4\46\1\43\3\46\1\36\1\7\1\35\1\46\1\44\12\41\2\46\1\33\1\31\1\32\2\46\2\40\1\21\2\40\1\6\1\13\1\40\1\14\2\40\1\30\1\25\5\40\1\26\1\12\1\40\1\17\1\23\3\40\2\46\1\10\1\37\1\40\1\46\4\40\1\20\2\40\1\24\1\3\2\40\1\2\1\27\2\40\1\22\1\40\1\16\1\1\1\40\1\15\1\11\4\40\1\4\1\46\1\5\uff82\46",
            "\1\50\3\uffff\1\47\12\uffff\1\52\2\uffff\1\51",
            "\1\54",
            "\1\55\20\uffff\1\56",
            "",
            "",
            "\1\61",
            "",
            "",
            "\1\64\7\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\6\uffff\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\105\6\uffff\1\104\12\uffff\1\103",
            "\1\106\7\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\113",
            "\1\115",
            "\1\117",
            "\12\121",
            "",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\121\1\uffff\12\124\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\0\125",
            "\0\125",
            "\1\126\4\uffff\1\127",
            "",
            "",
            "\1\131",
            "\1\133\1\uffff\1\134\1\uffff\1\132",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164\7\uffff\1\165",
            "\1\166\7\uffff\1\167",
            "\1\170",
            "\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\121\1\uffff\12\124\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\45\uffff\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1\45\uffff\1\u00c2",
            "",
            "\1\u00c3",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00c9",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00cb",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "",
            "",
            "\1\u010c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "\1\u0118",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\u011a",
            "",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\u0125",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_ID | RULE_FLOAT | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='s') ) {s = 1;}

                        else if ( (LA16_0=='l') ) {s = 2;}

                        else if ( (LA16_0=='i') ) {s = 3;}

                        else if ( (LA16_0=='{') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0=='F') ) {s = 6;}

                        else if ( (LA16_0==',') ) {s = 7;}

                        else if ( (LA16_0==']') ) {s = 8;}

                        else if ( (LA16_0=='v') ) {s = 9;}

                        else if ( (LA16_0=='T') ) {s = 10;}

                        else if ( (LA16_0=='G') ) {s = 11;}

                        else if ( (LA16_0=='I') ) {s = 12;}

                        else if ( (LA16_0=='u') ) {s = 13;}

                        else if ( (LA16_0=='r') ) {s = 14;}

                        else if ( (LA16_0=='V') ) {s = 15;}

                        else if ( (LA16_0=='e') ) {s = 16;}

                        else if ( (LA16_0=='C') ) {s = 17;}

                        else if ( (LA16_0=='p') ) {s = 18;}

                        else if ( (LA16_0=='W') ) {s = 19;}

                        else if ( (LA16_0=='h') ) {s = 20;}

                        else if ( (LA16_0=='M') ) {s = 21;}

                        else if ( (LA16_0=='S') ) {s = 22;}

                        else if ( (LA16_0=='m') ) {s = 23;}

                        else if ( (LA16_0=='L') ) {s = 24;}

                        else if ( (LA16_0=='=') ) {s = 25;}

                        else if ( (LA16_0=='>') ) {s = 26;}

                        else if ( (LA16_0=='<') ) {s = 27;}

                        else if ( (LA16_0=='!') ) {s = 28;}

                        else if ( (LA16_0=='-') ) {s = 29;}

                        else if ( (LA16_0=='+') ) {s = 30;}

                        else if ( (LA16_0=='^') ) {s = 31;}

                        else if ( ((LA16_0>='A' && LA16_0<='B')||(LA16_0>='D' && LA16_0<='E')||LA16_0=='H'||(LA16_0>='J' && LA16_0<='K')||(LA16_0>='N' && LA16_0<='R')||LA16_0=='U'||(LA16_0>='X' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='d')||(LA16_0>='f' && LA16_0<='g')||(LA16_0>='j' && LA16_0<='k')||(LA16_0>='n' && LA16_0<='o')||LA16_0=='q'||LA16_0=='t'||(LA16_0>='w' && LA16_0<='z')) ) {s = 32;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 33;}

                        else if ( (LA16_0=='\"') ) {s = 34;}

                        else if ( (LA16_0=='\'') ) {s = 35;}

                        else if ( (LA16_0=='/') ) {s = 36;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 37;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='*')||LA16_0=='.'||(LA16_0>=':' && LA16_0<=';')||(LA16_0>='?' && LA16_0<='@')||(LA16_0>='[' && LA16_0<='\\')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_34 = input.LA(1);

                        s = -1;
                        if ( ((LA16_34>='\u0000' && LA16_34<='\uFFFF')) ) {s = 85;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_35 = input.LA(1);

                        s = -1;
                        if ( ((LA16_35>='\u0000' && LA16_35<='\uFFFF')) ) {s = 85;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}