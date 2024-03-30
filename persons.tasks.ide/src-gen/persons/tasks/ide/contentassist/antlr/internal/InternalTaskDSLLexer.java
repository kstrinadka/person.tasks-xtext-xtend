package persons.tasks.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskDSLLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
    public static final int RULE_BOOL_LITERAL=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalTaskDSLLexer() {;} 
    public InternalTaskDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTaskDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTaskDSL.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDSL.g:11:7: ( 'balance' )
            // InternalTaskDSL.g:11:9: 'balance'
            {
            match("balance"); 


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
            // InternalTaskDSL.g:12:7: ( 'min' )
            // InternalTaskDSL.g:12:9: 'min'
            {
            match("min"); 


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
            // InternalTaskDSL.g:13:7: ( 'hour' )
            // InternalTaskDSL.g:13:9: 'hour'
            {
            match("hour"); 


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
            // InternalTaskDSL.g:14:7: ( 'day' )
            // InternalTaskDSL.g:14:9: 'day'
            {
            match("day"); 


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
            // InternalTaskDSL.g:15:7: ( 'week' )
            // InternalTaskDSL.g:15:9: 'week'
            {
            match("week"); 


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
            // InternalTaskDSL.g:16:7: ( 'AND' )
            // InternalTaskDSL.g:16:9: 'AND'
            {
            match("AND"); 


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
            // InternalTaskDSL.g:17:7: ( 'OR' )
            // InternalTaskDSL.g:17:9: 'OR'
            {
            match("OR"); 


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
            // InternalTaskDSL.g:18:7: ( '==' )
            // InternalTaskDSL.g:18:9: '=='
            {
            match("=="); 


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
            // InternalTaskDSL.g:19:7: ( '!=' )
            // InternalTaskDSL.g:19:9: '!='
            {
            match("!="); 


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
            // InternalTaskDSL.g:20:7: ( '>=' )
            // InternalTaskDSL.g:20:9: '>='
            {
            match(">="); 


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
            // InternalTaskDSL.g:21:7: ( '>' )
            // InternalTaskDSL.g:21:9: '>'
            {
            match('>'); 

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
            // InternalTaskDSL.g:22:7: ( '<=' )
            // InternalTaskDSL.g:22:9: '<='
            {
            match("<="); 


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
            // InternalTaskDSL.g:23:7: ( '<' )
            // InternalTaskDSL.g:23:9: '<'
            {
            match('<'); 

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
            // InternalTaskDSL.g:24:7: ( 'Planning' )
            // InternalTaskDSL.g:24:9: 'Planning'
            {
            match("Planning"); 


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
            // InternalTaskDSL.g:25:7: ( 'Person:' )
            // InternalTaskDSL.g:25:9: 'Person:'
            {
            match("Person:"); 


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
            // InternalTaskDSL.g:26:7: ( 'Task:' )
            // InternalTaskDSL.g:26:9: 'Task:'
            {
            match("Task:"); 


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
            // InternalTaskDSL.g:27:7: ( 'persons:' )
            // InternalTaskDSL.g:27:9: 'persons:'
            {
            match("persons:"); 


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
            // InternalTaskDSL.g:28:7: ( 'priority:' )
            // InternalTaskDSL.g:28:9: 'priority:'
            {
            match("priority:"); 


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
            // InternalTaskDSL.g:29:7: ( 'duration:' )
            // InternalTaskDSL.g:29:9: 'duration:'
            {
            match("duration:"); 


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
            // InternalTaskDSL.g:30:7: ( 'Lunch' )
            // InternalTaskDSL.g:30:9: 'Lunch'
            {
            match("Lunch"); 


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
            // InternalTaskDSL.g:31:7: ( 'Meeting' )
            // InternalTaskDSL.g:31:9: 'Meeting'
            {
            match("Meeting"); 


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
            // InternalTaskDSL.g:32:7: ( 'Report' )
            // InternalTaskDSL.g:32:9: 'Report'
            {
            match("Report"); 


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
            // InternalTaskDSL.g:33:7: ( 'Pay' )
            // InternalTaskDSL.g:33:9: 'Pay'
            {
            match("Pay"); 


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
            // InternalTaskDSL.g:34:7: ( 'euro' )
            // InternalTaskDSL.g:34:9: 'euro'
            {
            match("euro"); 


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
            // InternalTaskDSL.g:35:7: ( 'If' )
            // InternalTaskDSL.g:35:9: 'If'
            {
            match("If"); 


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
            // InternalTaskDSL.g:36:7: ( '+' )
            // InternalTaskDSL.g:36:9: '+'
            {
            match('+'); 

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
            // InternalTaskDSL.g:37:7: ( '-' )
            // InternalTaskDSL.g:37:9: '-'
            {
            match('-'); 

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
            // InternalTaskDSL.g:38:7: ( '*' )
            // InternalTaskDSL.g:38:9: '*'
            {
            match('*'); 

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
            // InternalTaskDSL.g:39:7: ( '/' )
            // InternalTaskDSL.g:39:9: '/'
            {
            match('/'); 

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
            // InternalTaskDSL.g:40:7: ( 'max' )
            // InternalTaskDSL.g:40:9: 'max'
            {
            match("max"); 


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
            // InternalTaskDSL.g:41:7: ( 'mod' )
            // InternalTaskDSL.g:41:9: 'mod'
            {
            match("mod"); 


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
            // InternalTaskDSL.g:42:7: ( '^' )
            // InternalTaskDSL.g:42:9: '^'
            {
            match('^'); 

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
            // InternalTaskDSL.g:43:7: ( '(' )
            // InternalTaskDSL.g:43:9: '('
            {
            match('('); 

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
            // InternalTaskDSL.g:44:7: ( ')' )
            // InternalTaskDSL.g:44:9: ')'
            {
            match(')'); 

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
            // InternalTaskDSL.g:45:7: ( 'NOT' )
            // InternalTaskDSL.g:45:9: 'NOT'
            {
            match("NOT"); 


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
            // InternalTaskDSL.g:46:7: ( 'anonymous' )
            // InternalTaskDSL.g:46:9: 'anonymous'
            {
            match("anonymous"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_BOOL_LITERAL"
    public final void mRULE_BOOL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDSL.g:3862:19: ( ( 'true' | 'false' | 'TRUE' | 'FALSE' ) )
            // InternalTaskDSL.g:3862:21: ( 'true' | 'false' | 'TRUE' | 'FALSE' )
            {
            // InternalTaskDSL.g:3862:21: ( 'true' | 'false' | 'TRUE' | 'FALSE' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            case 'T':
                {
                alt1=3;
                }
                break;
            case 'F':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:3862:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:3862:29: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:3862:37: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:3862:44: 'FALSE'
                    {
                    match("FALSE"); 


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
    // $ANTLR end "RULE_BOOL_LITERAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDSL.g:3864:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTaskDSL.g:3864:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTaskDSL.g:3864:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTaskDSL.g:3864:11: '^'
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

            // InternalTaskDSL.g:3864:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTaskDSL.g:
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
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDSL.g:3866:10: ( ( '0' .. '9' )+ )
            // InternalTaskDSL.g:3866:12: ( '0' .. '9' )+
            {
            // InternalTaskDSL.g:3866:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTaskDSL.g:3866:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalTaskDSL.g:3868:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTaskDSL.g:3868:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTaskDSL.g:3868:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTaskDSL.g:3868:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTaskDSL.g:3868:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTaskDSL.g:3868:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTaskDSL.g:3868:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:3868:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTaskDSL.g:3868:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTaskDSL.g:3868:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTaskDSL.g:3868:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalTaskDSL.g:3870:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTaskDSL.g:3870:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTaskDSL.g:3870:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTaskDSL.g:3870:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalTaskDSL.g:3872:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTaskDSL.g:3872:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTaskDSL.g:3872:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTaskDSL.g:3872:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalTaskDSL.g:3872:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTaskDSL.g:3872:41: ( '\\r' )? '\\n'
                    {
                    // InternalTaskDSL.g:3872:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalTaskDSL.g:3872:41: '\\r'
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
            // InternalTaskDSL.g:3874:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTaskDSL.g:3874:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTaskDSL.g:3874:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTaskDSL.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalTaskDSL.g:3876:16: ( . )
            // InternalTaskDSL.g:3876:18: .
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
        // InternalTaskDSL.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_BOOL_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=44;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalTaskDSL.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalTaskDSL.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalTaskDSL.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalTaskDSL.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalTaskDSL.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalTaskDSL.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalTaskDSL.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalTaskDSL.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalTaskDSL.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalTaskDSL.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalTaskDSL.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalTaskDSL.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalTaskDSL.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalTaskDSL.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalTaskDSL.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalTaskDSL.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalTaskDSL.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalTaskDSL.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalTaskDSL.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalTaskDSL.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalTaskDSL.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalTaskDSL.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalTaskDSL.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalTaskDSL.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalTaskDSL.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalTaskDSL.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalTaskDSL.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalTaskDSL.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalTaskDSL.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalTaskDSL.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalTaskDSL.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalTaskDSL.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalTaskDSL.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalTaskDSL.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalTaskDSL.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalTaskDSL.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalTaskDSL.g:1:226: RULE_BOOL_LITERAL
                {
                mRULE_BOOL_LITERAL(); 

                }
                break;
            case 38 :
                // InternalTaskDSL.g:1:244: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // InternalTaskDSL.g:1:252: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // InternalTaskDSL.g:1:261: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // InternalTaskDSL.g:1:273: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // InternalTaskDSL.g:1:289: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // InternalTaskDSL.g:1:305: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // InternalTaskDSL.g:1:313: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\7\47\2\45\1\64\1\66\10\47\3\uffff\1\110\1\111\2\uffff\5\47\2\uffff\2\45\2\uffff\1\47\1\uffff\10\47\1\135\6\uffff\13\47\1\151\11\uffff\5\47\3\uffff\1\47\1\160\1\161\1\162\1\47\1\164\2\47\1\167\1\uffff\2\47\1\172\10\47\1\uffff\1\u0083\5\47\3\uffff\1\u0089\1\uffff\1\47\1\u008b\1\uffff\2\47\1\uffff\1\47\1\u008f\5\47\1\u0095\1\uffff\1\47\1\u008f\3\47\1\uffff\1\47\1\uffff\2\47\2\uffff\2\47\1\u009f\2\47\1\uffff\1\47\2\u008f\6\47\1\uffff\1\47\1\u00aa\1\47\1\u00ac\2\47\1\uffff\2\47\1\u00b1\1\uffff\1\47\1\uffff\1\47\1\u00b4\1\uffff\1\47\1\uffff\1\47\3\uffff\1\u00b7\1\uffff";
    static final String DFA13_eofS =
        "\u00b8\uffff";
    static final String DFA13_minS =
        "\1\0\2\141\1\157\1\141\1\145\1\116\1\122\4\75\1\141\1\122\1\145\1\165\2\145\1\165\1\146\3\uffff\1\52\1\101\2\uffff\1\117\1\156\1\162\1\141\1\101\2\uffff\2\0\2\uffff\1\154\1\uffff\1\156\1\170\1\144\1\165\1\171\1\162\1\145\1\104\1\60\6\uffff\1\141\1\162\1\171\1\163\1\125\1\162\1\151\1\156\1\145\1\160\1\162\1\60\11\uffff\1\124\1\157\1\165\1\154\1\114\3\uffff\1\141\3\60\1\162\1\60\1\141\1\153\1\60\1\uffff\1\156\1\163\1\60\1\153\1\105\1\163\1\157\1\143\1\164\2\157\1\uffff\1\60\1\156\1\145\1\163\1\123\1\156\3\uffff\1\60\1\uffff\1\164\1\60\1\uffff\1\156\1\157\1\uffff\1\72\1\60\1\157\1\162\1\150\1\151\1\162\1\60\1\uffff\1\171\1\60\1\145\1\105\1\143\1\uffff\1\151\1\uffff\1\151\1\156\2\uffff\1\156\1\151\1\60\1\156\1\164\1\uffff\1\155\2\60\1\145\1\157\1\156\1\72\1\163\1\164\1\uffff\1\147\1\60\1\157\1\60\1\156\1\147\1\uffff\1\72\1\171\1\60\1\uffff\1\165\1\uffff\1\72\1\60\1\uffff\1\72\1\uffff\1\163\3\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\141\2\157\1\165\1\145\1\116\1\122\4\75\1\154\1\141\1\162\1\165\2\145\1\165\1\146\3\uffff\1\57\1\172\2\uffff\1\117\1\156\1\162\1\141\1\101\2\uffff\2\uffff\2\uffff\1\154\1\uffff\1\156\1\170\1\144\1\165\1\171\1\162\1\145\1\104\1\172\6\uffff\1\141\1\162\1\171\1\163\1\125\1\162\1\151\1\156\1\145\1\160\1\162\1\172\11\uffff\1\124\1\157\1\165\1\154\1\114\3\uffff\1\141\3\172\1\162\1\172\1\141\1\153\1\172\1\uffff\1\156\1\163\1\172\1\153\1\105\1\163\1\157\1\143\1\164\2\157\1\uffff\1\172\1\156\1\145\1\163\1\123\1\156\3\uffff\1\172\1\uffff\1\164\1\172\1\uffff\1\156\1\157\1\uffff\1\72\1\172\1\157\1\162\1\150\1\151\1\162\1\172\1\uffff\1\171\1\172\1\145\1\105\1\143\1\uffff\1\151\1\uffff\1\151\1\156\2\uffff\1\156\1\151\1\172\1\156\1\164\1\uffff\1\155\2\172\1\145\1\157\1\156\1\72\1\163\1\164\1\uffff\1\147\1\172\1\157\1\172\1\156\1\147\1\uffff\1\72\1\171\1\172\1\uffff\1\165\1\uffff\1\72\1\172\1\uffff\1\72\1\uffff\1\163\3\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\24\uffff\1\32\1\33\1\34\2\uffff\1\41\1\42\5\uffff\1\46\1\47\2\uffff\1\53\1\54\1\uffff\1\46\11\uffff\1\10\1\11\1\12\1\13\1\14\1\15\14\uffff\1\32\1\33\1\34\1\51\1\52\1\35\1\40\1\41\1\42\5\uffff\1\47\1\50\1\53\11\uffff\1\7\13\uffff\1\31\6\uffff\1\2\1\36\1\37\1\uffff\1\4\2\uffff\1\6\2\uffff\1\27\10\uffff\1\43\5\uffff\1\3\1\uffff\1\5\2\uffff\1\20\1\45\5\uffff\1\30\11\uffff\1\24\6\uffff\1\17\3\uffff\1\26\1\uffff\1\1\2\uffff\1\21\1\uffff\1\25\1\uffff\1\23\1\16\1\22\1\uffff\1\44";
    static final String DFA13_specialS =
        "\1\2\41\uffff\1\1\1\0\u0094\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\11\1\42\4\45\1\43\1\31\1\32\1\26\1\24\1\45\1\25\1\45\1\27\12\41\2\45\1\13\1\10\1\12\2\45\1\6\4\40\1\37\2\40\1\23\2\40\1\17\1\20\1\33\1\7\1\14\1\40\1\21\1\40\1\15\6\40\3\45\1\30\1\40\1\45\1\34\1\1\1\40\1\4\1\22\1\36\1\40\1\3\4\40\1\2\2\40\1\16\3\40\1\35\2\40\1\5\3\40\uff85\45",
            "\1\46",
            "\1\51\7\uffff\1\50\5\uffff\1\52",
            "\1\53",
            "\1\54\23\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65",
            "\1\71\3\uffff\1\70\6\uffff\1\67",
            "\1\73\16\uffff\1\72",
            "\1\74\14\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\106\4\uffff\1\107",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "\0\122",
            "\0\122",
            "",
            "",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "",
            "\1\157",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\163",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\165",
            "\1\166",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\170",
            "\1\171",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u008a",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0096",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "\1\u009d",
            "\1\u009e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ab",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_BOOL_LITERAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_35 = input.LA(1);

                        s = -1;
                        if ( ((LA13_35>='\u0000' && LA13_35<='\uFFFF')) ) {s = 82;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_34 = input.LA(1);

                        s = -1;
                        if ( ((LA13_34>='\u0000' && LA13_34<='\uFFFF')) ) {s = 82;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='b') ) {s = 1;}

                        else if ( (LA13_0=='m') ) {s = 2;}

                        else if ( (LA13_0=='h') ) {s = 3;}

                        else if ( (LA13_0=='d') ) {s = 4;}

                        else if ( (LA13_0=='w') ) {s = 5;}

                        else if ( (LA13_0=='A') ) {s = 6;}

                        else if ( (LA13_0=='O') ) {s = 7;}

                        else if ( (LA13_0=='=') ) {s = 8;}

                        else if ( (LA13_0=='!') ) {s = 9;}

                        else if ( (LA13_0=='>') ) {s = 10;}

                        else if ( (LA13_0=='<') ) {s = 11;}

                        else if ( (LA13_0=='P') ) {s = 12;}

                        else if ( (LA13_0=='T') ) {s = 13;}

                        else if ( (LA13_0=='p') ) {s = 14;}

                        else if ( (LA13_0=='L') ) {s = 15;}

                        else if ( (LA13_0=='M') ) {s = 16;}

                        else if ( (LA13_0=='R') ) {s = 17;}

                        else if ( (LA13_0=='e') ) {s = 18;}

                        else if ( (LA13_0=='I') ) {s = 19;}

                        else if ( (LA13_0=='+') ) {s = 20;}

                        else if ( (LA13_0=='-') ) {s = 21;}

                        else if ( (LA13_0=='*') ) {s = 22;}

                        else if ( (LA13_0=='/') ) {s = 23;}

                        else if ( (LA13_0=='^') ) {s = 24;}

                        else if ( (LA13_0=='(') ) {s = 25;}

                        else if ( (LA13_0==')') ) {s = 26;}

                        else if ( (LA13_0=='N') ) {s = 27;}

                        else if ( (LA13_0=='a') ) {s = 28;}

                        else if ( (LA13_0=='t') ) {s = 29;}

                        else if ( (LA13_0=='f') ) {s = 30;}

                        else if ( (LA13_0=='F') ) {s = 31;}

                        else if ( ((LA13_0>='B' && LA13_0<='E')||(LA13_0>='G' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='K')||LA13_0=='Q'||LA13_0=='S'||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='c'||LA13_0=='g'||(LA13_0>='i' && LA13_0<='l')||(LA13_0>='n' && LA13_0<='o')||(LA13_0>='q' && LA13_0<='s')||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 32;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 33;}

                        else if ( (LA13_0=='\"') ) {s = 34;}

                        else if ( (LA13_0=='\'') ) {s = 35;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 36;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||LA13_0==','||LA13_0=='.'||(LA13_0>=':' && LA13_0<=';')||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}