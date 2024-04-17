package persons.tasks.parser.antlr.internal;

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
import persons.tasks.services.TaskDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTaskDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Planning'", "'anonymous'", "'INT'", "'Array:'", "':='", "'['", "','", "']'", "'ARRAY'", "'*'", "'..'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'duration:'", "'Lunch'", "'Meeting'", "'Report'", "'If'", "'Pay'", "'euro'", "'+'", "'-'", "'/'", "'max'", "'min'", "'mod'", "'^'", "'('", "')'", "'NOT'", "'hour'", "'day'", "'week'", "'balance'", "'AND'", "'OR'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__48=48;
    public static final int T__49=49;
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


        public InternalTaskDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaskDSL.g"; }



     	private TaskDSLGrammarAccess grammarAccess;

        public InternalTaskDSLParser(TokenStream input, TaskDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Planning";
       	}

       	@Override
       	protected TaskDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePlanning"
    // InternalTaskDSL.g:65:1: entryRulePlanning returns [EObject current=null] : iv_rulePlanning= rulePlanning EOF ;
    public final EObject entryRulePlanning() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanning = null;


        try {
            // InternalTaskDSL.g:65:49: (iv_rulePlanning= rulePlanning EOF )
            // InternalTaskDSL.g:66:2: iv_rulePlanning= rulePlanning EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlanningRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlanning=rulePlanning();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlanning; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlanning"


    // $ANTLR start "rulePlanning"
    // InternalTaskDSL.g:72:1: rulePlanning returns [EObject current=null] : (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) | ( (lv_arrays_5_0= ruleArraySpecificationInit ) ) )* ( (lv_myintegers_6_0= ruleMyInteger ) )* ( (lv_myarrays_7_0= ruleMyArray ) )* ) ;
    public final EObject rulePlanning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_anonymous_2_0=null;
        EObject lv_persons_3_0 = null;

        EObject lv_tasks_4_0 = null;

        EObject lv_arrays_5_0 = null;

        EObject lv_myintegers_6_0 = null;

        EObject lv_myarrays_7_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:78:2: ( (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) | ( (lv_arrays_5_0= ruleArraySpecificationInit ) ) )* ( (lv_myintegers_6_0= ruleMyInteger ) )* ( (lv_myarrays_7_0= ruleMyArray ) )* ) )
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) | ( (lv_arrays_5_0= ruleArraySpecificationInit ) ) )* ( (lv_myintegers_6_0= ruleMyInteger ) )* ( (lv_myarrays_7_0= ruleMyArray ) )* )
            {
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) | ( (lv_arrays_5_0= ruleArraySpecificationInit ) ) )* ( (lv_myintegers_6_0= ruleMyInteger ) )* ( (lv_myarrays_7_0= ruleMyArray ) )* )
            // InternalTaskDSL.g:80:3: otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) | ( (lv_arrays_5_0= ruleArraySpecificationInit ) ) )* ( (lv_myintegers_6_0= ruleMyInteger ) )* ( (lv_myarrays_7_0= ruleMyArray ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPlanningAccess().getPlanningKeyword_0());
              		
            }
            // InternalTaskDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPlanningRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalTaskDSL.g:102:3: ( (lv_anonymous_2_0= 'anonymous' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:103:4: (lv_anonymous_2_0= 'anonymous' )
                    {
                    // InternalTaskDSL.g:103:4: (lv_anonymous_2_0= 'anonymous' )
                    // InternalTaskDSL.g:104:5: lv_anonymous_2_0= 'anonymous'
                    {
                    lv_anonymous_2_0=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_anonymous_2_0, grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPlanningRule());
                      					}
                      					setWithLastConsumed(current, "anonymous", lv_anonymous_2_0 != null, "anonymous");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalTaskDSL.g:116:3: ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) | ( (lv_arrays_5_0= ruleArraySpecificationInit ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    alt2=1;
                    }
                    break;
                case 24:
                    {
                    alt2=2;
                    }
                    break;
                case 20:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalTaskDSL.g:117:4: ( (lv_persons_3_0= rulePerson ) )
            	    {
            	    // InternalTaskDSL.g:117:4: ( (lv_persons_3_0= rulePerson ) )
            	    // InternalTaskDSL.g:118:5: (lv_persons_3_0= rulePerson )
            	    {
            	    // InternalTaskDSL.g:118:5: (lv_persons_3_0= rulePerson )
            	    // InternalTaskDSL.g:119:6: lv_persons_3_0= rulePerson
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_persons_3_0=rulePerson();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlanningRule());
            	      						}
            	      						add(
            	      							current,
            	      							"persons",
            	      							lv_persons_3_0,
            	      							"persons.tasks.TaskDSL.Person");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTaskDSL.g:137:4: ( (lv_tasks_4_0= ruleTask ) )
            	    {
            	    // InternalTaskDSL.g:137:4: ( (lv_tasks_4_0= ruleTask ) )
            	    // InternalTaskDSL.g:138:5: (lv_tasks_4_0= ruleTask )
            	    {
            	    // InternalTaskDSL.g:138:5: (lv_tasks_4_0= ruleTask )
            	    // InternalTaskDSL.g:139:6: lv_tasks_4_0= ruleTask
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_tasks_4_0=ruleTask();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlanningRule());
            	      						}
            	      						add(
            	      							current,
            	      							"tasks",
            	      							lv_tasks_4_0,
            	      							"persons.tasks.TaskDSL.Task");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTaskDSL.g:157:4: ( (lv_arrays_5_0= ruleArraySpecificationInit ) )
            	    {
            	    // InternalTaskDSL.g:157:4: ( (lv_arrays_5_0= ruleArraySpecificationInit ) )
            	    // InternalTaskDSL.g:158:5: (lv_arrays_5_0= ruleArraySpecificationInit )
            	    {
            	    // InternalTaskDSL.g:158:5: (lv_arrays_5_0= ruleArraySpecificationInit )
            	    // InternalTaskDSL.g:159:6: lv_arrays_5_0= ruleArraySpecificationInit
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlanningAccess().getArraysArraySpecificationInitParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_arrays_5_0=ruleArraySpecificationInit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlanningRule());
            	      						}
            	      						add(
            	      							current,
            	      							"arrays",
            	      							lv_arrays_5_0,
            	      							"persons.tasks.TaskDSL.ArraySpecificationInit");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalTaskDSL.g:177:3: ( (lv_myintegers_6_0= ruleMyInteger ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTaskDSL.g:178:4: (lv_myintegers_6_0= ruleMyInteger )
            	    {
            	    // InternalTaskDSL.g:178:4: (lv_myintegers_6_0= ruleMyInteger )
            	    // InternalTaskDSL.g:179:5: lv_myintegers_6_0= ruleMyInteger
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPlanningAccess().getMyintegersMyIntegerParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_myintegers_6_0=ruleMyInteger();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPlanningRule());
            	      					}
            	      					add(
            	      						current,
            	      						"myintegers",
            	      						lv_myintegers_6_0,
            	      						"persons.tasks.TaskDSL.MyInteger");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalTaskDSL.g:196:3: ( (lv_myarrays_7_0= ruleMyArray ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTaskDSL.g:197:4: (lv_myarrays_7_0= ruleMyArray )
            	    {
            	    // InternalTaskDSL.g:197:4: (lv_myarrays_7_0= ruleMyArray )
            	    // InternalTaskDSL.g:198:5: lv_myarrays_7_0= ruleMyArray
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPlanningAccess().getMyarraysMyArrayParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_myarrays_7_0=ruleMyArray();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPlanningRule());
            	      					}
            	      					add(
            	      						current,
            	      						"myarrays",
            	      						lv_myarrays_7_0,
            	      						"persons.tasks.TaskDSL.MyArray");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRuleMyInteger"
    // InternalTaskDSL.g:219:1: entryRuleMyInteger returns [EObject current=null] : iv_ruleMyInteger= ruleMyInteger EOF ;
    public final EObject entryRuleMyInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyInteger = null;


        try {
            // InternalTaskDSL.g:219:50: (iv_ruleMyInteger= ruleMyInteger EOF )
            // InternalTaskDSL.g:220:2: iv_ruleMyInteger= ruleMyInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMyIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMyInteger=ruleMyInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMyInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMyInteger"


    // $ANTLR start "ruleMyInteger"
    // InternalTaskDSL.g:226:1: ruleMyInteger returns [EObject current=null] : (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_number_2_0= ruleIntExpression ) ) ) ;
    public final EObject ruleMyInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_number_2_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:232:2: ( (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_number_2_0= ruleIntExpression ) ) ) )
            // InternalTaskDSL.g:233:2: (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_number_2_0= ruleIntExpression ) ) )
            {
            // InternalTaskDSL.g:233:2: (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_number_2_0= ruleIntExpression ) ) )
            // InternalTaskDSL.g:234:3: otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ( (lv_number_2_0= ruleIntExpression ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMyIntegerAccess().getINTKeyword_0());
              		
            }
            // InternalTaskDSL.g:238:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:239:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:239:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:240:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMyIntegerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMyIntegerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalTaskDSL.g:256:3: ( (lv_number_2_0= ruleIntExpression ) )
            // InternalTaskDSL.g:257:4: (lv_number_2_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:257:4: (lv_number_2_0= ruleIntExpression )
            // InternalTaskDSL.g:258:5: lv_number_2_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMyIntegerAccess().getNumberIntExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_number_2_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMyIntegerRule());
              					}
              					set(
              						current,
              						"number",
              						lv_number_2_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMyInteger"


    // $ANTLR start "entryRuleMyArray"
    // InternalTaskDSL.g:279:1: entryRuleMyArray returns [EObject current=null] : iv_ruleMyArray= ruleMyArray EOF ;
    public final EObject entryRuleMyArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyArray = null;


        try {
            // InternalTaskDSL.g:279:48: (iv_ruleMyArray= ruleMyArray EOF )
            // InternalTaskDSL.g:280:2: iv_ruleMyArray= ruleMyArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMyArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMyArray=ruleMyArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMyArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMyArray"


    // $ANTLR start "ruleMyArray"
    // InternalTaskDSL.g:286:1: ruleMyArray returns [EObject current=null] : (otherlv_0= 'Array:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= '[' ( ( (lv_elements_4_0= ruleExpressionConstantInt ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleExpressionConstantInt ) ) )* )? otherlv_7= ']' ) ;
    public final EObject ruleMyArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:292:2: ( (otherlv_0= 'Array:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= '[' ( ( (lv_elements_4_0= ruleExpressionConstantInt ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleExpressionConstantInt ) ) )* )? otherlv_7= ']' ) )
            // InternalTaskDSL.g:293:2: (otherlv_0= 'Array:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= '[' ( ( (lv_elements_4_0= ruleExpressionConstantInt ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleExpressionConstantInt ) ) )* )? otherlv_7= ']' )
            {
            // InternalTaskDSL.g:293:2: (otherlv_0= 'Array:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= '[' ( ( (lv_elements_4_0= ruleExpressionConstantInt ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleExpressionConstantInt ) ) )* )? otherlv_7= ']' )
            // InternalTaskDSL.g:294:3: otherlv_0= 'Array:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= '[' ( ( (lv_elements_4_0= ruleExpressionConstantInt ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleExpressionConstantInt ) ) )* )? otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMyArrayAccess().getArrayKeyword_0());
              		
            }
            // InternalTaskDSL.g:298:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:299:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:299:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:300:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMyArrayAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMyArrayRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMyArrayAccess().getColonEqualsSignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMyArrayAccess().getLeftSquareBracketKeyword_3());
              		
            }
            // InternalTaskDSL.g:324:3: ( ( (lv_elements_4_0= ruleExpressionConstantInt ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleExpressionConstantInt ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTaskDSL.g:325:4: ( (lv_elements_4_0= ruleExpressionConstantInt ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleExpressionConstantInt ) ) )*
                    {
                    // InternalTaskDSL.g:325:4: ( (lv_elements_4_0= ruleExpressionConstantInt ) )
                    // InternalTaskDSL.g:326:5: (lv_elements_4_0= ruleExpressionConstantInt )
                    {
                    // InternalTaskDSL.g:326:5: (lv_elements_4_0= ruleExpressionConstantInt )
                    // InternalTaskDSL.g:327:6: lv_elements_4_0= ruleExpressionConstantInt
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMyArrayAccess().getElementsExpressionConstantIntParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_elements_4_0=ruleExpressionConstantInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMyArrayRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_4_0,
                      							"persons.tasks.TaskDSL.ExpressionConstantInt");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTaskDSL.g:344:4: (otherlv_5= ',' ( (lv_elements_6_0= ruleExpressionConstantInt ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTaskDSL.g:345:5: otherlv_5= ',' ( (lv_elements_6_0= ruleExpressionConstantInt ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getMyArrayAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalTaskDSL.g:349:5: ( (lv_elements_6_0= ruleExpressionConstantInt ) )
                    	    // InternalTaskDSL.g:350:6: (lv_elements_6_0= ruleExpressionConstantInt )
                    	    {
                    	    // InternalTaskDSL.g:350:6: (lv_elements_6_0= ruleExpressionConstantInt )
                    	    // InternalTaskDSL.g:351:7: lv_elements_6_0= ruleExpressionConstantInt
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMyArrayAccess().getElementsExpressionConstantIntParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_elements_6_0=ruleExpressionConstantInt();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMyArrayRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_6_0,
                    	      								"persons.tasks.TaskDSL.ExpressionConstantInt");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMyArrayAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMyArray"


    // $ANTLR start "entryRuleArraySpecificationInit"
    // InternalTaskDSL.g:378:1: entryRuleArraySpecificationInit returns [EObject current=null] : iv_ruleArraySpecificationInit= ruleArraySpecificationInit EOF ;
    public final EObject entryRuleArraySpecificationInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecificationInit = null;


        try {
            // InternalTaskDSL.g:378:63: (iv_ruleArraySpecificationInit= ruleArraySpecificationInit EOF )
            // InternalTaskDSL.g:379:2: iv_ruleArraySpecificationInit= ruleArraySpecificationInit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySpecificationInitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArraySpecificationInit=ruleArraySpecificationInit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySpecificationInit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArraySpecificationInit"


    // $ANTLR start "ruleArraySpecificationInit"
    // InternalTaskDSL.g:385:1: ruleArraySpecificationInit returns [EObject current=null] : (otherlv_0= 'ARRAY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_init_2_0= ruleArraySpecification ) ) (otherlv_3= ':=' ( (lv_values_4_0= ruleArrayInitialization ) ) )? ) ;
    public final EObject ruleArraySpecificationInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_init_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:391:2: ( (otherlv_0= 'ARRAY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_init_2_0= ruleArraySpecification ) ) (otherlv_3= ':=' ( (lv_values_4_0= ruleArrayInitialization ) ) )? ) )
            // InternalTaskDSL.g:392:2: (otherlv_0= 'ARRAY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_init_2_0= ruleArraySpecification ) ) (otherlv_3= ':=' ( (lv_values_4_0= ruleArrayInitialization ) ) )? )
            {
            // InternalTaskDSL.g:392:2: (otherlv_0= 'ARRAY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_init_2_0= ruleArraySpecification ) ) (otherlv_3= ':=' ( (lv_values_4_0= ruleArrayInitialization ) ) )? )
            // InternalTaskDSL.g:393:3: otherlv_0= 'ARRAY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_init_2_0= ruleArraySpecification ) ) (otherlv_3= ':=' ( (lv_values_4_0= ruleArrayInitialization ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArraySpecificationInitAccess().getARRAYKeyword_0());
              		
            }
            // InternalTaskDSL.g:397:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:398:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:398:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:399:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getArraySpecificationInitAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArraySpecificationInitRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalTaskDSL.g:415:3: ( (lv_init_2_0= ruleArraySpecification ) )
            // InternalTaskDSL.g:416:4: (lv_init_2_0= ruleArraySpecification )
            {
            // InternalTaskDSL.g:416:4: (lv_init_2_0= ruleArraySpecification )
            // InternalTaskDSL.g:417:5: lv_init_2_0= ruleArraySpecification
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArraySpecificationInitAccess().getInitArraySpecificationParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_init_2_0=ruleArraySpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArraySpecificationInitRule());
              					}
              					set(
              						current,
              						"init",
              						lv_init_2_0,
              						"persons.tasks.TaskDSL.ArraySpecification");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTaskDSL.g:434:3: (otherlv_3= ':=' ( (lv_values_4_0= ruleArrayInitialization ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTaskDSL.g:435:4: otherlv_3= ':=' ( (lv_values_4_0= ruleArrayInitialization ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArraySpecificationInitAccess().getColonEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalTaskDSL.g:439:4: ( (lv_values_4_0= ruleArrayInitialization ) )
                    // InternalTaskDSL.g:440:5: (lv_values_4_0= ruleArrayInitialization )
                    {
                    // InternalTaskDSL.g:440:5: (lv_values_4_0= ruleArrayInitialization )
                    // InternalTaskDSL.g:441:6: lv_values_4_0= ruleArrayInitialization
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArraySpecificationInitAccess().getValuesArrayInitializationParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_values_4_0=ruleArrayInitialization();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArraySpecificationInitRule());
                      						}
                      						set(
                      							current,
                      							"values",
                      							lv_values_4_0,
                      							"persons.tasks.TaskDSL.ArrayInitialization");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArraySpecificationInit"


    // $ANTLR start "entryRuleArraySpecification"
    // InternalTaskDSL.g:463:1: entryRuleArraySpecification returns [EObject current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final EObject entryRuleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecification = null;


        try {
            // InternalTaskDSL.g:463:59: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // InternalTaskDSL.g:464:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArraySpecification=ruleArraySpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySpecification; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArraySpecification"


    // $ANTLR start "ruleArraySpecification"
    // InternalTaskDSL.g:470:1: ruleArraySpecification returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_interval_1_0= ruleArrayInterval ) ) | otherlv_2= '*' ) otherlv_3= ']' ) ;
    public final EObject ruleArraySpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_interval_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:476:2: ( (otherlv_0= '[' ( ( (lv_interval_1_0= ruleArrayInterval ) ) | otherlv_2= '*' ) otherlv_3= ']' ) )
            // InternalTaskDSL.g:477:2: (otherlv_0= '[' ( ( (lv_interval_1_0= ruleArrayInterval ) ) | otherlv_2= '*' ) otherlv_3= ']' )
            {
            // InternalTaskDSL.g:477:2: (otherlv_0= '[' ( ( (lv_interval_1_0= ruleArrayInterval ) ) | otherlv_2= '*' ) otherlv_3= ']' )
            // InternalTaskDSL.g:478:3: otherlv_0= '[' ( ( (lv_interval_1_0= ruleArrayInterval ) ) | otherlv_2= '*' ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalTaskDSL.g:482:3: ( ( (lv_interval_1_0= ruleArrayInterval ) ) | otherlv_2= '*' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||(LA8_0>=34 && LA8_0<=35)||LA8_0==41||LA8_0==47) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDSL.g:483:4: ( (lv_interval_1_0= ruleArrayInterval ) )
                    {
                    // InternalTaskDSL.g:483:4: ( (lv_interval_1_0= ruleArrayInterval ) )
                    // InternalTaskDSL.g:484:5: (lv_interval_1_0= ruleArrayInterval )
                    {
                    // InternalTaskDSL.g:484:5: (lv_interval_1_0= ruleArrayInterval )
                    // InternalTaskDSL.g:485:6: lv_interval_1_0= ruleArrayInterval
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArraySpecificationAccess().getIntervalArrayIntervalParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_interval_1_0=ruleArrayInterval();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArraySpecificationRule());
                      						}
                      						set(
                      							current,
                      							"interval",
                      							lv_interval_1_0,
                      							"persons.tasks.TaskDSL.ArrayInterval");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:503:4: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getArraySpecificationAccess().getAsteriskKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArraySpecification"


    // $ANTLR start "entryRuleArrayInterval"
    // InternalTaskDSL.g:516:1: entryRuleArrayInterval returns [EObject current=null] : iv_ruleArrayInterval= ruleArrayInterval EOF ;
    public final EObject entryRuleArrayInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayInterval = null;


        try {
            // InternalTaskDSL.g:516:54: (iv_ruleArrayInterval= ruleArrayInterval EOF )
            // InternalTaskDSL.g:517:2: iv_ruleArrayInterval= ruleArrayInterval EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayIntervalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayInterval=ruleArrayInterval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayInterval; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayInterval"


    // $ANTLR start "ruleArrayInterval"
    // InternalTaskDSL.g:523:1: ruleArrayInterval returns [EObject current=null] : ( ( (lv_start_0_0= ruleIntExpression ) ) otherlv_1= '..' ( (lv_end_2_0= ruleIntExpression ) ) ) ;
    public final EObject ruleArrayInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:529:2: ( ( ( (lv_start_0_0= ruleIntExpression ) ) otherlv_1= '..' ( (lv_end_2_0= ruleIntExpression ) ) ) )
            // InternalTaskDSL.g:530:2: ( ( (lv_start_0_0= ruleIntExpression ) ) otherlv_1= '..' ( (lv_end_2_0= ruleIntExpression ) ) )
            {
            // InternalTaskDSL.g:530:2: ( ( (lv_start_0_0= ruleIntExpression ) ) otherlv_1= '..' ( (lv_end_2_0= ruleIntExpression ) ) )
            // InternalTaskDSL.g:531:3: ( (lv_start_0_0= ruleIntExpression ) ) otherlv_1= '..' ( (lv_end_2_0= ruleIntExpression ) )
            {
            // InternalTaskDSL.g:531:3: ( (lv_start_0_0= ruleIntExpression ) )
            // InternalTaskDSL.g:532:4: (lv_start_0_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:532:4: (lv_start_0_0= ruleIntExpression )
            // InternalTaskDSL.g:533:5: lv_start_0_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayIntervalAccess().getStartIntExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_start_0_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayIntervalRule());
              					}
              					set(
              						current,
              						"start",
              						lv_start_0_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayIntervalAccess().getFullStopFullStopKeyword_1());
              		
            }
            // InternalTaskDSL.g:554:3: ( (lv_end_2_0= ruleIntExpression ) )
            // InternalTaskDSL.g:555:4: (lv_end_2_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:555:4: (lv_end_2_0= ruleIntExpression )
            // InternalTaskDSL.g:556:5: lv_end_2_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayIntervalAccess().getEndIntExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_end_2_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayIntervalRule());
              					}
              					set(
              						current,
              						"end",
              						lv_end_2_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayInterval"


    // $ANTLR start "entryRuleArrayInitialization"
    // InternalTaskDSL.g:577:1: entryRuleArrayInitialization returns [EObject current=null] : iv_ruleArrayInitialization= ruleArrayInitialization EOF ;
    public final EObject entryRuleArrayInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayInitialization = null;


        try {
            // InternalTaskDSL.g:577:60: (iv_ruleArrayInitialization= ruleArrayInitialization EOF )
            // InternalTaskDSL.g:578:2: iv_ruleArrayInitialization= ruleArrayInitialization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayInitializationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayInitialization=ruleArrayInitialization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayInitialization; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayInitialization"


    // $ANTLR start "ruleArrayInitialization"
    // InternalTaskDSL.g:584:1: ruleArrayInitialization returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleIntExpression ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleIntExpression ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayInitialization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:590:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleIntExpression ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleIntExpression ) ) )* otherlv_4= ']' ) )
            // InternalTaskDSL.g:591:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleIntExpression ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleIntExpression ) ) )* otherlv_4= ']' )
            {
            // InternalTaskDSL.g:591:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleIntExpression ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleIntExpression ) ) )* otherlv_4= ']' )
            // InternalTaskDSL.g:592:3: otherlv_0= '[' ( (lv_elements_1_0= ruleIntExpression ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleIntExpression ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayInitializationAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalTaskDSL.g:596:3: ( (lv_elements_1_0= ruleIntExpression ) )
            // InternalTaskDSL.g:597:4: (lv_elements_1_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:597:4: (lv_elements_1_0= ruleIntExpression )
            // InternalTaskDSL.g:598:5: lv_elements_1_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayInitializationAccess().getElementsIntExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_elements_1_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayInitializationRule());
              					}
              					add(
              						current,
              						"elements",
              						lv_elements_1_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTaskDSL.g:615:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleIntExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTaskDSL.g:616:4: otherlv_2= ',' ( (lv_elements_3_0= ruleIntExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getArrayInitializationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalTaskDSL.g:620:4: ( (lv_elements_3_0= ruleIntExpression ) )
            	    // InternalTaskDSL.g:621:5: (lv_elements_3_0= ruleIntExpression )
            	    {
            	    // InternalTaskDSL.g:621:5: (lv_elements_3_0= ruleIntExpression )
            	    // InternalTaskDSL.g:622:6: lv_elements_3_0= ruleIntExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArrayInitializationAccess().getElementsIntExpressionParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_elements_3_0=ruleIntExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArrayInitializationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"elements",
            	      							lv_elements_3_0,
            	      							"persons.tasks.TaskDSL.IntExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getArrayInitializationAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayInitialization"


    // $ANTLR start "entryRulePerson"
    // InternalTaskDSL.g:648:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalTaskDSL.g:648:47: (iv_rulePerson= rulePerson EOF )
            // InternalTaskDSL.g:649:2: iv_rulePerson= rulePerson EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPersonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePerson; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalTaskDSL.g:655:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:661:2: ( (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:662:2: (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:662:2: (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:663:3: otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
              		
            }
            // InternalTaskDSL.g:667:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:668:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:668:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:669:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPersonRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:689:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalTaskDSL.g:689:45: (iv_ruleTask= ruleTask EOF )
            // InternalTaskDSL.g:690:2: iv_ruleTask= ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTask; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTaskDSL.g:696:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_prio_5_0=null;
        Token otherlv_6=null;
        EObject lv_action_1_0 = null;

        EObject lv_duration_7_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:702:2: ( (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? ) )
            // InternalTaskDSL.g:703:2: (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? )
            {
            // InternalTaskDSL.g:703:2: (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? )
            // InternalTaskDSL.g:704:3: otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
              		
            }
            // InternalTaskDSL.g:708:3: ( (lv_action_1_0= ruleAction ) )
            // InternalTaskDSL.g:709:4: (lv_action_1_0= ruleAction )
            {
            // InternalTaskDSL.g:709:4: (lv_action_1_0= ruleAction )
            // InternalTaskDSL.g:710:5: lv_action_1_0= ruleAction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_action_1_0=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTaskRule());
              					}
              					set(
              						current,
              						"action",
              						lv_action_1_0,
              						"persons.tasks.TaskDSL.Action");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getPersonsKeyword_2());
              		
            }
            // InternalTaskDSL.g:731:3: ( (otherlv_3= RULE_ID ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTaskDSL.g:732:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalTaskDSL.g:732:4: (otherlv_3= RULE_ID )
            	    // InternalTaskDSL.g:733:5: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getTaskRule());
            	      					}
            	      				
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getPriorityKeyword_4());
              		
            }
            // InternalTaskDSL.g:748:3: ( (lv_prio_5_0= RULE_INT ) )
            // InternalTaskDSL.g:749:4: (lv_prio_5_0= RULE_INT )
            {
            // InternalTaskDSL.g:749:4: (lv_prio_5_0= RULE_INT )
            // InternalTaskDSL.g:750:5: lv_prio_5_0= RULE_INT
            {
            lv_prio_5_0=(Token)match(input,RULE_INT,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prio_5_0, grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTaskRule());
              					}
              					setWithLastConsumed(
              						current,
              						"prio",
              						lv_prio_5_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalTaskDSL.g:766:3: (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTaskDSL.g:767:4: otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getDurationKeyword_6_0());
                      			
                    }
                    // InternalTaskDSL.g:771:4: ( (lv_duration_7_0= ruleDuration ) )
                    // InternalTaskDSL.g:772:5: (lv_duration_7_0= ruleDuration )
                    {
                    // InternalTaskDSL.g:772:5: (lv_duration_7_0= ruleDuration )
                    // InternalTaskDSL.g:773:6: lv_duration_7_0= ruleDuration
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_duration_7_0=ruleDuration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTaskRule());
                      						}
                      						set(
                      							current,
                      							"duration",
                      							lv_duration_7_0,
                      							"persons.tasks.TaskDSL.Duration");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleDuration"
    // InternalTaskDSL.g:795:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalTaskDSL.g:795:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalTaskDSL.g:796:2: iv_ruleDuration= ruleDuration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDuration=ruleDuration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDuration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalTaskDSL.g:802:1: ruleDuration returns [EObject current=null] : ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token lv_dl_0_0=null;
        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:808:2: ( ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) )
            // InternalTaskDSL.g:809:2: ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            {
            // InternalTaskDSL.g:809:2: ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            // InternalTaskDSL.g:810:3: ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) )
            {
            // InternalTaskDSL.g:810:3: ( (lv_dl_0_0= RULE_INT ) )
            // InternalTaskDSL.g:811:4: (lv_dl_0_0= RULE_INT )
            {
            // InternalTaskDSL.g:811:4: (lv_dl_0_0= RULE_INT )
            // InternalTaskDSL.g:812:5: lv_dl_0_0= RULE_INT
            {
            lv_dl_0_0=(Token)match(input,RULE_INT,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_dl_0_0, grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDurationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"dl",
              						lv_dl_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalTaskDSL.g:828:3: ( (lv_unit_1_0= ruleTimeUnit ) )
            // InternalTaskDSL.g:829:4: (lv_unit_1_0= ruleTimeUnit )
            {
            // InternalTaskDSL.g:829:4: (lv_unit_1_0= ruleTimeUnit )
            // InternalTaskDSL.g:830:5: lv_unit_1_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_unit_1_0=ruleTimeUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDurationRule());
              					}
              					set(
              						current,
              						"unit",
              						lv_unit_1_0,
              						"persons.tasks.TaskDSL.TimeUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:851:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalTaskDSL.g:851:47: (iv_ruleAction= ruleAction EOF )
            // InternalTaskDSL.g:852:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalTaskDSL.g:858:1: ruleAction returns [EObject current=null] : (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_LunchAction_0 = null;

        EObject this_MeetingAction_1 = null;

        EObject this_PaperAction_2 = null;

        EObject this_PaymentAction_3 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:864:2: ( (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction ) )
            // InternalTaskDSL.g:865:2: (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction )
            {
            // InternalTaskDSL.g:865:2: (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 31:
            case 32:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTaskDSL.g:866:3: this_LunchAction_0= ruleLunchAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LunchAction_0=ruleLunchAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LunchAction_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:875:3: this_MeetingAction_1= ruleMeetingAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MeetingAction_1=ruleMeetingAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MeetingAction_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:884:3: this_PaperAction_2= rulePaperAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PaperAction_2=rulePaperAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PaperAction_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:893:3: this_PaymentAction_3= rulePaymentAction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PaymentAction_3=rulePaymentAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PaymentAction_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleLunchAction"
    // InternalTaskDSL.g:905:1: entryRuleLunchAction returns [EObject current=null] : iv_ruleLunchAction= ruleLunchAction EOF ;
    public final EObject entryRuleLunchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunchAction = null;


        try {
            // InternalTaskDSL.g:905:52: (iv_ruleLunchAction= ruleLunchAction EOF )
            // InternalTaskDSL.g:906:2: iv_ruleLunchAction= ruleLunchAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLunchActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLunchAction=ruleLunchAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLunchAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLunchAction"


    // $ANTLR start "ruleLunchAction"
    // InternalTaskDSL.g:912:1: ruleLunchAction returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLunchAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:918:2: ( (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:919:2: (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:919:2: (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:920:3: otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLunchActionAccess().getLunchKeyword_0());
              		
            }
            // InternalTaskDSL.g:924:3: ( (lv_location_1_0= RULE_ID ) )
            // InternalTaskDSL.g:925:4: (lv_location_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:925:4: (lv_location_1_0= RULE_ID )
            // InternalTaskDSL.g:926:5: lv_location_1_0= RULE_ID
            {
            lv_location_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_location_1_0, grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLunchActionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"location",
              						lv_location_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLunchAction"


    // $ANTLR start "entryRuleMeetingAction"
    // InternalTaskDSL.g:946:1: entryRuleMeetingAction returns [EObject current=null] : iv_ruleMeetingAction= ruleMeetingAction EOF ;
    public final EObject entryRuleMeetingAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingAction = null;


        try {
            // InternalTaskDSL.g:946:54: (iv_ruleMeetingAction= ruleMeetingAction EOF )
            // InternalTaskDSL.g:947:2: iv_ruleMeetingAction= ruleMeetingAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeetingActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMeetingAction=ruleMeetingAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeetingAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMeetingAction"


    // $ANTLR start "ruleMeetingAction"
    // InternalTaskDSL.g:953:1: ruleMeetingAction returns [EObject current=null] : (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMeetingAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_topic_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:959:2: ( (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) ) )
            // InternalTaskDSL.g:960:2: (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) )
            {
            // InternalTaskDSL.g:960:2: (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) )
            // InternalTaskDSL.g:961:3: otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMeetingActionAccess().getMeetingKeyword_0());
              		
            }
            // InternalTaskDSL.g:965:3: ( (lv_topic_1_0= RULE_STRING ) )
            // InternalTaskDSL.g:966:4: (lv_topic_1_0= RULE_STRING )
            {
            // InternalTaskDSL.g:966:4: (lv_topic_1_0= RULE_STRING )
            // InternalTaskDSL.g:967:5: lv_topic_1_0= RULE_STRING
            {
            lv_topic_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_topic_1_0, grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMeetingActionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"topic",
              						lv_topic_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMeetingAction"


    // $ANTLR start "entryRulePaperAction"
    // InternalTaskDSL.g:987:1: entryRulePaperAction returns [EObject current=null] : iv_rulePaperAction= rulePaperAction EOF ;
    public final EObject entryRulePaperAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaperAction = null;


        try {
            // InternalTaskDSL.g:987:52: (iv_rulePaperAction= rulePaperAction EOF )
            // InternalTaskDSL.g:988:2: iv_rulePaperAction= rulePaperAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPaperActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePaperAction=rulePaperAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePaperAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePaperAction"


    // $ANTLR start "rulePaperAction"
    // InternalTaskDSL.g:994:1: rulePaperAction returns [EObject current=null] : (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) ) ;
    public final EObject rulePaperAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_report_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1000:2: ( (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:1001:2: (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:1001:2: (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:1002:3: otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPaperActionAccess().getReportKeyword_0());
              		
            }
            // InternalTaskDSL.g:1006:3: ( (lv_report_1_0= RULE_ID ) )
            // InternalTaskDSL.g:1007:4: (lv_report_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:1007:4: (lv_report_1_0= RULE_ID )
            // InternalTaskDSL.g:1008:5: lv_report_1_0= RULE_ID
            {
            lv_report_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_report_1_0, grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPaperActionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"report",
              						lv_report_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePaperAction"


    // $ANTLR start "entryRulePaymentAction"
    // InternalTaskDSL.g:1028:1: entryRulePaymentAction returns [EObject current=null] : iv_rulePaymentAction= rulePaymentAction EOF ;
    public final EObject entryRulePaymentAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaymentAction = null;


        try {
            // InternalTaskDSL.g:1028:54: (iv_rulePaymentAction= rulePaymentAction EOF )
            // InternalTaskDSL.g:1029:2: iv_rulePaymentAction= rulePaymentAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPaymentActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePaymentAction=rulePaymentAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePaymentAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePaymentAction"


    // $ANTLR start "rulePaymentAction"
    // InternalTaskDSL.g:1035:1: rulePaymentAction returns [EObject current=null] : ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )? otherlv_2= 'Pay' ( (lv_amount_3_0= ruleIntExpression ) ) otherlv_4= 'euro' ) ;
    public final EObject rulePaymentAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_amount_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1041:2: ( ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )? otherlv_2= 'Pay' ( (lv_amount_3_0= ruleIntExpression ) ) otherlv_4= 'euro' ) )
            // InternalTaskDSL.g:1042:2: ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )? otherlv_2= 'Pay' ( (lv_amount_3_0= ruleIntExpression ) ) otherlv_4= 'euro' )
            {
            // InternalTaskDSL.g:1042:2: ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )? otherlv_2= 'Pay' ( (lv_amount_3_0= ruleIntExpression ) ) otherlv_4= 'euro' )
            // InternalTaskDSL.g:1043:3: (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )? otherlv_2= 'Pay' ( (lv_amount_3_0= ruleIntExpression ) ) otherlv_4= 'euro'
            {
            // InternalTaskDSL.g:1043:3: (otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTaskDSL.g:1044:4: otherlv_0= 'If' ( (lv_condition_1_0= ruleBooleanExpression ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPaymentActionAccess().getIfKeyword_0_0());
                      			
                    }
                    // InternalTaskDSL.g:1048:4: ( (lv_condition_1_0= ruleBooleanExpression ) )
                    // InternalTaskDSL.g:1049:5: (lv_condition_1_0= ruleBooleanExpression )
                    {
                    // InternalTaskDSL.g:1049:5: (lv_condition_1_0= ruleBooleanExpression )
                    // InternalTaskDSL.g:1050:6: lv_condition_1_0= ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPaymentActionAccess().getConditionBooleanExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_25);
                    lv_condition_1_0=ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPaymentActionRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_1_0,
                      							"persons.tasks.TaskDSL.BooleanExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,32,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPaymentActionAccess().getPayKeyword_1());
              		
            }
            // InternalTaskDSL.g:1072:3: ( (lv_amount_3_0= ruleIntExpression ) )
            // InternalTaskDSL.g:1073:4: (lv_amount_3_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:1073:4: (lv_amount_3_0= ruleIntExpression )
            // InternalTaskDSL.g:1074:5: lv_amount_3_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_amount_3_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPaymentActionRule());
              					}
              					set(
              						current,
              						"amount",
              						lv_amount_3_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPaymentActionAccess().getEuroKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePaymentAction"


    // $ANTLR start "entryRuleIntExpression"
    // InternalTaskDSL.g:1099:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalTaskDSL.g:1099:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalTaskDSL.g:1100:2: iv_ruleIntExpression= ruleIntExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntExpression=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalTaskDSL.g:1106:1: ruleIntExpression returns [EObject current=null] : this_ExpressionLevel1_0= ruleExpressionLevel1 ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1112:2: (this_ExpressionLevel1_0= ruleExpressionLevel1 )
            // InternalTaskDSL.g:1113:2: this_ExpressionLevel1_0= ruleExpressionLevel1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ExpressionLevel1_0=ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExpressionLevel1_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalTaskDSL.g:1124:1: entryRuleExpressionLevel1 returns [EObject current=null] : iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF ;
    public final EObject entryRuleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel1 = null;


        try {
            // InternalTaskDSL.g:1124:57: (iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF )
            // InternalTaskDSL.g:1125:2: iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel1=ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel1; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalTaskDSL.g:1131:1: ruleExpressionLevel1 returns [EObject current=null] : (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1137:2: ( (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* ) )
            // InternalTaskDSL.g:1138:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* )
            {
            // InternalTaskDSL.g:1138:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* )
            // InternalTaskDSL.g:1139:3: this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_ExpressionLevel2_0=ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel2_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTaskDSL.g:1147:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }
                else if ( (LA14_0==35) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTaskDSL.g:1148:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalTaskDSL.g:1148:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) )
            	    // InternalTaskDSL.g:1149:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalTaskDSL.g:1149:5: ()
            	    // InternalTaskDSL.g:1150:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:1160:5: ( (lv_right_3_0= ruleExpressionLevel2 ) )
            	    // InternalTaskDSL.g:1161:6: (lv_right_3_0= ruleExpressionLevel2 )
            	    {
            	    // InternalTaskDSL.g:1161:6: (lv_right_3_0= ruleExpressionLevel2 )
            	    // InternalTaskDSL.g:1162:7: lv_right_3_0= ruleExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel2");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTaskDSL.g:1181:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalTaskDSL.g:1181:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) )
            	    // InternalTaskDSL.g:1182:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalTaskDSL.g:1182:5: ()
            	    // InternalTaskDSL.g:1183:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,35,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:1193:5: ( (lv_right_6_0= ruleExpressionLevel2 ) )
            	    // InternalTaskDSL.g:1194:6: (lv_right_6_0= ruleExpressionLevel2 )
            	    {
            	    // InternalTaskDSL.g:1194:6: (lv_right_6_0= ruleExpressionLevel2 )
            	    // InternalTaskDSL.g:1195:7: lv_right_6_0= ruleExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_right_6_0=ruleExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel2");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalTaskDSL.g:1218:1: entryRuleExpressionLevel2 returns [EObject current=null] : iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF ;
    public final EObject entryRuleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel2 = null;


        try {
            // InternalTaskDSL.g:1218:57: (iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF )
            // InternalTaskDSL.g:1219:2: iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel2=ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalTaskDSL.g:1225:1: ruleExpressionLevel2 returns [EObject current=null] : (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject this_ExpressionLevel3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;

        EObject lv_right_15_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1231:2: ( (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* ) )
            // InternalTaskDSL.g:1232:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* )
            {
            // InternalTaskDSL.g:1232:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* )
            // InternalTaskDSL.g:1233:3: this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_ExpressionLevel3_0=ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel3_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTaskDSL.g:1241:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )*
            loop15:
            do {
                int alt15=6;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    alt15=1;
                    }
                    break;
                case 36:
                    {
                    alt15=2;
                    }
                    break;
                case 37:
                    {
                    alt15=3;
                    }
                    break;
                case 38:
                    {
                    alt15=4;
                    }
                    break;
                case 39:
                    {
                    alt15=5;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalTaskDSL.g:1242:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:1242:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:1243:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:1243:5: ()
            	    // InternalTaskDSL.g:1244:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:1254:5: ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:1255:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:1255:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:1256:7: lv_right_3_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTaskDSL.g:1275:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:1275:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:1276:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:1276:5: ()
            	    // InternalTaskDSL.g:1277:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:1287:5: ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:1288:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:1288:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:1289:7: lv_right_6_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_6_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTaskDSL.g:1308:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:1308:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:1309:5: () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:1309:5: ()
            	    // InternalTaskDSL.g:1310:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,37,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:1320:5: ( (lv_right_9_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:1321:6: (lv_right_9_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:1321:6: (lv_right_9_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:1322:7: lv_right_9_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_9_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_9_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTaskDSL.g:1341:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:1341:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:1342:5: () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:1342:5: ()
            	    // InternalTaskDSL.g:1343:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_11=(Token)match(input,38,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:1353:5: ( (lv_right_12_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:1354:6: (lv_right_12_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:1354:6: (lv_right_12_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:1355:7: lv_right_12_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_12_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_12_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTaskDSL.g:1374:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:1374:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:1375:5: () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:1375:5: ()
            	    // InternalTaskDSL.g:1376:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_14=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_14, grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1());
            	      				
            	    }
            	    // InternalTaskDSL.g:1386:5: ( (lv_right_15_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:1387:6: (lv_right_15_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:1387:6: (lv_right_15_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:1388:7: lv_right_15_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_15_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_15_0,
            	      								"persons.tasks.TaskDSL.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalTaskDSL.g:1411:1: entryRuleExpressionLevel3 returns [EObject current=null] : iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF ;
    public final EObject entryRuleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel3 = null;


        try {
            // InternalTaskDSL.g:1411:57: (iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF )
            // InternalTaskDSL.g:1412:2: iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel3=ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel3; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalTaskDSL.g:1418:1: ruleExpressionLevel3 returns [EObject current=null] : (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? ) ;
    public final EObject ruleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExpressionLevel4_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1424:2: ( (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? ) )
            // InternalTaskDSL.g:1425:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? )
            {
            // InternalTaskDSL.g:1425:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? )
            // InternalTaskDSL.g:1426:3: this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_ExpressionLevel4_0=ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel4_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTaskDSL.g:1434:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTaskDSL.g:1435:4: () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) )
                    {
                    // InternalTaskDSL.g:1435:4: ()
                    // InternalTaskDSL.g:1436:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1());
                      			
                    }
                    // InternalTaskDSL.g:1446:4: ( (lv_right_3_0= ruleExpressionLevel3 ) )
                    // InternalTaskDSL.g:1447:5: (lv_right_3_0= ruleExpressionLevel3 )
                    {
                    // InternalTaskDSL.g:1447:5: (lv_right_3_0= ruleExpressionLevel3 )
                    // InternalTaskDSL.g:1448:6: lv_right_3_0= ruleExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"persons.tasks.TaskDSL.ExpressionLevel3");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalTaskDSL.g:1470:1: entryRuleExpressionLevel4 returns [EObject current=null] : iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF ;
    public final EObject entryRuleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel4 = null;


        try {
            // InternalTaskDSL.g:1470:57: (iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF )
            // InternalTaskDSL.g:1471:2: iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel4Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel4=ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel4; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalTaskDSL.g:1477:1: ruleExpressionLevel4 returns [EObject current=null] : (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 ) ;
    public final EObject ruleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionMinus_0 = null;

        EObject this_ExpressionPlus_1 = null;

        EObject this_ExpressionLevel5_2 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1483:2: ( (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:1484:2: (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:1484:2: (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt17=1;
                }
                break;
            case 34:
                {
                alt17=2;
                }
                break;
            case RULE_INT:
            case 41:
            case 47:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalTaskDSL.g:1485:3: this_ExpressionMinus_0= ruleExpressionMinus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionMinus_0=ruleExpressionMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionMinus_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1494:3: this_ExpressionPlus_1= ruleExpressionPlus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionPlus_1=ruleExpressionPlus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionPlus_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1503:3: this_ExpressionLevel5_2= ruleExpressionLevel5
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionLevel5_2=ruleExpressionLevel5();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionLevel5_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalTaskDSL.g:1515:1: entryRuleExpressionMinus returns [EObject current=null] : iv_ruleExpressionMinus= ruleExpressionMinus EOF ;
    public final EObject entryRuleExpressionMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMinus = null;


        try {
            // InternalTaskDSL.g:1515:56: (iv_ruleExpressionMinus= ruleExpressionMinus EOF )
            // InternalTaskDSL.g:1516:2: iv_ruleExpressionMinus= ruleExpressionMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionMinus=ruleExpressionMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalTaskDSL.g:1522:1: ruleExpressionMinus returns [EObject current=null] : (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) ;
    public final EObject ruleExpressionMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1528:2: ( (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) )
            // InternalTaskDSL.g:1529:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            {
            // InternalTaskDSL.g:1529:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            // InternalTaskDSL.g:1530:3: otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalTaskDSL.g:1534:3: ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:1535:4: (lv_sub_1_0= ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:1535:4: (lv_sub_1_0= ruleExpressionLevel5 )
            // InternalTaskDSL.g:1536:5: lv_sub_1_0= ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionMinusRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"persons.tasks.TaskDSL.ExpressionLevel5");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalTaskDSL.g:1557:1: entryRuleExpressionPlus returns [EObject current=null] : iv_ruleExpressionPlus= ruleExpressionPlus EOF ;
    public final EObject entryRuleExpressionPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPlus = null;


        try {
            // InternalTaskDSL.g:1557:55: (iv_ruleExpressionPlus= ruleExpressionPlus EOF )
            // InternalTaskDSL.g:1558:2: iv_ruleExpressionPlus= ruleExpressionPlus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionPlus=ruleExpressionPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionPlus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalTaskDSL.g:1564:1: ruleExpressionPlus returns [EObject current=null] : (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) ;
    public final EObject ruleExpressionPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1570:2: ( (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) )
            // InternalTaskDSL.g:1571:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            {
            // InternalTaskDSL.g:1571:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            // InternalTaskDSL.g:1572:3: otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0());
              		
            }
            // InternalTaskDSL.g:1576:3: ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:1577:4: (lv_sub_1_0= ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:1577:4: (lv_sub_1_0= ruleExpressionLevel5 )
            // InternalTaskDSL.g:1578:5: lv_sub_1_0= ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionPlusRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"persons.tasks.TaskDSL.ExpressionLevel5");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalTaskDSL.g:1599:1: entryRuleExpressionLevel5 returns [EObject current=null] : iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF ;
    public final EObject entryRuleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel5 = null;


        try {
            // InternalTaskDSL.g:1599:57: (iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF )
            // InternalTaskDSL.g:1600:2: iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel5Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel5=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel5; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalTaskDSL.g:1606:1: ruleExpressionLevel5 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance ) ;
    public final EObject ruleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBracket_0 = null;

        EObject this_ExpressionConstantInt_1 = null;

        EObject this_ExpressionBalance_2 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1612:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance ) )
            // InternalTaskDSL.g:1613:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance )
            {
            // InternalTaskDSL.g:1613:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=2;
                }
                break;
            case 47:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalTaskDSL.g:1614:3: this_ExpressionBracket_0= ruleExpressionBracket
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionBracket_0=ruleExpressionBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionBracket_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1623:3: this_ExpressionConstantInt_1= ruleExpressionConstantInt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantInt_1=ruleExpressionConstantInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionConstantInt_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1632:3: this_ExpressionBalance_2= ruleExpressionBalance
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionBalance_2=ruleExpressionBalance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionBalance_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalTaskDSL.g:1644:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalTaskDSL.g:1644:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalTaskDSL.g:1645:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBracket=ruleExpressionBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionBracket; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalTaskDSL.g:1651:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1657:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' ) )
            // InternalTaskDSL.g:1658:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' )
            {
            // InternalTaskDSL.g:1658:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' )
            // InternalTaskDSL.g:1659:3: otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTaskDSL.g:1663:3: ( (lv_sub_1_0= ruleIntExpression ) )
            // InternalTaskDSL.g:1664:4: (lv_sub_1_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:1664:4: (lv_sub_1_0= ruleIntExpression )
            // InternalTaskDSL.g:1665:5: lv_sub_1_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_sub_1_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionBracketRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalTaskDSL.g:1690:1: entryRuleExpressionConstantInt returns [EObject current=null] : iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF ;
    public final EObject entryRuleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantInt = null;


        try {
            // InternalTaskDSL.g:1690:62: (iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF )
            // InternalTaskDSL.g:1691:2: iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionConstantIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantInt=ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionConstantInt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalTaskDSL.g:1697:1: ruleExpressionConstantInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1703:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTaskDSL.g:1704:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTaskDSL.g:1704:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTaskDSL.g:1705:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTaskDSL.g:1705:3: (lv_value_0_0= RULE_INT )
            // InternalTaskDSL.g:1706:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getExpressionConstantIntRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleExpressionBalance"
    // InternalTaskDSL.g:1725:1: entryRuleExpressionBalance returns [EObject current=null] : iv_ruleExpressionBalance= ruleExpressionBalance EOF ;
    public final EObject entryRuleExpressionBalance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBalance = null;


        try {
            // InternalTaskDSL.g:1725:58: (iv_ruleExpressionBalance= ruleExpressionBalance EOF )
            // InternalTaskDSL.g:1726:2: iv_ruleExpressionBalance= ruleExpressionBalance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionBalanceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBalance=ruleExpressionBalance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionBalance; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionBalance"


    // $ANTLR start "ruleExpressionBalance"
    // InternalTaskDSL.g:1732:1: ruleExpressionBalance returns [EObject current=null] : ( (lv_value_0_0= ruleBalance ) ) ;
    public final EObject ruleExpressionBalance() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1738:2: ( ( (lv_value_0_0= ruleBalance ) ) )
            // InternalTaskDSL.g:1739:2: ( (lv_value_0_0= ruleBalance ) )
            {
            // InternalTaskDSL.g:1739:2: ( (lv_value_0_0= ruleBalance ) )
            // InternalTaskDSL.g:1740:3: (lv_value_0_0= ruleBalance )
            {
            // InternalTaskDSL.g:1740:3: (lv_value_0_0= ruleBalance )
            // InternalTaskDSL.g:1741:4: lv_value_0_0= ruleBalance
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBalance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getExpressionBalanceRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"persons.tasks.TaskDSL.Balance");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionBalance"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalTaskDSL.g:1761:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalTaskDSL.g:1761:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalTaskDSL.g:1762:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalTaskDSL.g:1768:1: ruleBooleanExpression returns [EObject current=null] : this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1 ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1774:2: (this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1 )
            // InternalTaskDSL.g:1775:2: this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_BooleanExpressionLevel1_0=ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_BooleanExpressionLevel1_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel1"
    // InternalTaskDSL.g:1786:1: entryRuleBooleanExpressionLevel1 returns [EObject current=null] : iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF ;
    public final EObject entryRuleBooleanExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel1 = null;


        try {
            // InternalTaskDSL.g:1786:64: (iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF )
            // InternalTaskDSL.g:1787:2: iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel1=ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel1; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel1"


    // $ANTLR start "ruleBooleanExpressionLevel1"
    // InternalTaskDSL.g:1793:1: ruleBooleanExpressionLevel1 returns [EObject current=null] : (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* ) ;
    public final EObject ruleBooleanExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpressionLevel2_0 = null;

        Enumerator lv_bop_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1799:2: ( (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* ) )
            // InternalTaskDSL.g:1800:2: (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* )
            {
            // InternalTaskDSL.g:1800:2: (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* )
            // InternalTaskDSL.g:1801:3: this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_31);
            this_BooleanExpressionLevel2_0=ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BooleanExpressionLevel2_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTaskDSL.g:1809:3: ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=48 && LA19_0<=49)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTaskDSL.g:1810:4: () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) )
            	    {
            	    // InternalTaskDSL.g:1810:4: ()
            	    // InternalTaskDSL.g:1811:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTaskDSL.g:1817:4: ( (lv_bop_2_0= ruleBinaryBooleanOperator ) )
            	    // InternalTaskDSL.g:1818:5: (lv_bop_2_0= ruleBinaryBooleanOperator )
            	    {
            	    // InternalTaskDSL.g:1818:5: (lv_bop_2_0= ruleBinaryBooleanOperator )
            	    // InternalTaskDSL.g:1819:6: lv_bop_2_0= ruleBinaryBooleanOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_bop_2_0=ruleBinaryBooleanOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBooleanExpressionLevel1Rule());
            	      						}
            	      						set(
            	      							current,
            	      							"bop",
            	      							lv_bop_2_0,
            	      							"persons.tasks.TaskDSL.BinaryBooleanOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTaskDSL.g:1836:4: ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) )
            	    // InternalTaskDSL.g:1837:5: (lv_right_3_0= ruleBooleanExpressionLevel2 )
            	    {
            	    // InternalTaskDSL.g:1837:5: (lv_right_3_0= ruleBooleanExpressionLevel2 )
            	    // InternalTaskDSL.g:1838:6: lv_right_3_0= ruleBooleanExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleBooleanExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBooleanExpressionLevel1Rule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"persons.tasks.TaskDSL.BooleanExpressionLevel2");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpressionLevel1"


    // $ANTLR start "entryRuleBooleanExpressionLevel2"
    // InternalTaskDSL.g:1860:1: entryRuleBooleanExpressionLevel2 returns [EObject current=null] : iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF ;
    public final EObject entryRuleBooleanExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel2 = null;


        try {
            // InternalTaskDSL.g:1860:64: (iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF )
            // InternalTaskDSL.g:1861:2: iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel2=ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel2"


    // $ANTLR start "ruleBooleanExpressionLevel2"
    // InternalTaskDSL.g:1867:1: ruleBooleanExpressionLevel2 returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 ) ;
    public final EObject ruleBooleanExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_BooleanExpressionLevel3_1 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1873:2: ( (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 ) )
            // InternalTaskDSL.g:1874:2: (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 )
            {
            // InternalTaskDSL.g:1874:2: (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_INT||LA20_0==RULE_BOOL_LITERAL||(LA20_0>=34 && LA20_0<=35)||LA20_0==41||LA20_0==47) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalTaskDSL.g:1875:3: this_NotExpression_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NotExpression_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NotExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1884:3: this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionLevel3_1=ruleBooleanExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionLevel3_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpressionLevel2"


    // $ANTLR start "entryRuleNotExpression"
    // InternalTaskDSL.g:1896:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalTaskDSL.g:1896:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalTaskDSL.g:1897:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalTaskDSL.g:1903:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1909:2: ( (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) ) )
            // InternalTaskDSL.g:1910:2: (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) )
            {
            // InternalTaskDSL.g:1910:2: (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) )
            // InternalTaskDSL.g:1911:3: otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getNOTKeyword_0());
              		
            }
            // InternalTaskDSL.g:1915:3: ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) )
            // InternalTaskDSL.g:1916:4: (lv_sub_1_0= ruleBooleanExpressionLevel3 )
            {
            // InternalTaskDSL.g:1916:4: (lv_sub_1_0= ruleBooleanExpressionLevel3 )
            // InternalTaskDSL.g:1917:5: lv_sub_1_0= ruleBooleanExpressionLevel3
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"persons.tasks.TaskDSL.BooleanExpressionLevel3");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel3"
    // InternalTaskDSL.g:1938:1: entryRuleBooleanExpressionLevel3 returns [EObject current=null] : iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF ;
    public final EObject entryRuleBooleanExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel3 = null;


        try {
            // InternalTaskDSL.g:1938:64: (iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF )
            // InternalTaskDSL.g:1939:2: iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel3=ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel3; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel3"


    // $ANTLR start "ruleBooleanExpressionLevel3"
    // InternalTaskDSL.g:1945:1: ruleBooleanExpressionLevel3 returns [EObject current=null] : ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant ) ;
    public final EObject ruleBooleanExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        EObject this_BooleanExpressionBracket_1 = null;

        EObject this_BooleanExpressionConstant_2 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1951:2: ( ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant ) )
            // InternalTaskDSL.g:1952:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant )
            {
            // InternalTaskDSL.g:1952:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) && (synpred1_InternalTaskDSL())) {
                alt21=1;
            }
            else if ( (LA21_0==34) && (synpred1_InternalTaskDSL())) {
                alt21=1;
            }
            else if ( (LA21_0==41) ) {
                int LA21_3 = input.LA(2);

                if ( (synpred1_InternalTaskDSL()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_INT) && (synpred1_InternalTaskDSL())) {
                alt21=1;
            }
            else if ( (LA21_0==47) && (synpred1_InternalTaskDSL())) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_BOOL_LITERAL) ) {
                alt21=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTaskDSL.g:1953:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    {
                    // InternalTaskDSL.g:1953:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    // InternalTaskDSL.g:1954:4: ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ComparisonExpression_0=ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ComparisonExpression_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1965:3: this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionBracket_1=ruleBooleanExpressionBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionBracket_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1974:3: this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionConstant_2=ruleBooleanExpressionConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionConstant_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpressionLevel3"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalTaskDSL.g:1986:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalTaskDSL.g:1986:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalTaskDSL.g:1987:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalTaskDSL.g:1993:1: ruleComparisonExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1999:2: ( ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) ) )
            // InternalTaskDSL.g:2000:2: ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) )
            {
            // InternalTaskDSL.g:2000:2: ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) )
            // InternalTaskDSL.g:2001:3: () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) )
            {
            // InternalTaskDSL.g:2001:3: ()
            // InternalTaskDSL.g:2002:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0(),
              					current);
              			
            }

            }

            // InternalTaskDSL.g:2008:3: ( (lv_left_1_0= ruleIntExpression ) )
            // InternalTaskDSL.g:2009:4: (lv_left_1_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:2009:4: (lv_left_1_0= ruleIntExpression )
            // InternalTaskDSL.g:2010:5: lv_left_1_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_left_1_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTaskDSL.g:2027:3: ( (lv_op_2_0= ruleCompareOperator ) )
            // InternalTaskDSL.g:2028:4: (lv_op_2_0= ruleCompareOperator )
            {
            // InternalTaskDSL.g:2028:4: (lv_op_2_0= ruleCompareOperator )
            // InternalTaskDSL.g:2029:5: lv_op_2_0= ruleCompareOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_op_2_0=ruleCompareOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_2_0,
              						"persons.tasks.TaskDSL.CompareOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTaskDSL.g:2046:3: ( (lv_right_3_0= ruleIntExpression ) )
            // InternalTaskDSL.g:2047:4: (lv_right_3_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:2047:4: (lv_right_3_0= ruleIntExpression )
            // InternalTaskDSL.g:2048:5: lv_right_3_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"persons.tasks.TaskDSL.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBooleanExpressionBracket"
    // InternalTaskDSL.g:2069:1: entryRuleBooleanExpressionBracket returns [EObject current=null] : iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF ;
    public final EObject entryRuleBooleanExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionBracket = null;


        try {
            // InternalTaskDSL.g:2069:65: (iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF )
            // InternalTaskDSL.g:2070:2: iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionBracket=ruleBooleanExpressionBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionBracket; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpressionBracket"


    // $ANTLR start "ruleBooleanExpressionBracket"
    // InternalTaskDSL.g:2076:1: ruleBooleanExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBooleanExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:2082:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' ) )
            // InternalTaskDSL.g:2083:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' )
            {
            // InternalTaskDSL.g:2083:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' )
            // InternalTaskDSL.g:2084:3: otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalTaskDSL.g:2088:3: ( (lv_sub_1_0= ruleBooleanExpression ) )
            // InternalTaskDSL.g:2089:4: (lv_sub_1_0= ruleBooleanExpression )
            {
            // InternalTaskDSL.g:2089:4: (lv_sub_1_0= ruleBooleanExpression )
            // InternalTaskDSL.g:2090:5: lv_sub_1_0= ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_sub_1_0=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanExpressionBracketRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"persons.tasks.TaskDSL.BooleanExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpressionBracket"


    // $ANTLR start "entryRuleBooleanExpressionConstant"
    // InternalTaskDSL.g:2115:1: entryRuleBooleanExpressionConstant returns [EObject current=null] : iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF ;
    public final EObject entryRuleBooleanExpressionConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionConstant = null;


        try {
            // InternalTaskDSL.g:2115:66: (iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF )
            // InternalTaskDSL.g:2116:2: iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionConstant=ruleBooleanExpressionConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanExpressionConstant"


    // $ANTLR start "ruleBooleanExpressionConstant"
    // InternalTaskDSL.g:2122:1: ruleBooleanExpressionConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) ;
    public final EObject ruleBooleanExpressionConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:2128:2: ( ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) )
            // InternalTaskDSL.g:2129:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            {
            // InternalTaskDSL.g:2129:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            // InternalTaskDSL.g:2130:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            {
            // InternalTaskDSL.g:2130:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            // InternalTaskDSL.g:2131:4: lv_value_0_0= RULE_BOOL_LITERAL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getBooleanExpressionConstantRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"persons.tasks.TaskDSL.BOOL_LITERAL");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanExpressionConstant"


    // $ANTLR start "ruleTimeUnit"
    // InternalTaskDSL.g:2150:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:2156:2: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) ) )
            // InternalTaskDSL.g:2157:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) )
            {
            // InternalTaskDSL.g:2157:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt22=1;
                }
                break;
            case 44:
                {
                alt22=2;
                }
                break;
            case 45:
                {
                alt22=3;
                }
                break;
            case 46:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalTaskDSL.g:2158:3: (enumLiteral_0= 'min' )
                    {
                    // InternalTaskDSL.g:2158:3: (enumLiteral_0= 'min' )
                    // InternalTaskDSL.g:2159:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:2166:3: (enumLiteral_1= 'hour' )
                    {
                    // InternalTaskDSL.g:2166:3: (enumLiteral_1= 'hour' )
                    // InternalTaskDSL.g:2167:4: enumLiteral_1= 'hour'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:2174:3: (enumLiteral_2= 'day' )
                    {
                    // InternalTaskDSL.g:2174:3: (enumLiteral_2= 'day' )
                    // InternalTaskDSL.g:2175:4: enumLiteral_2= 'day'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:2182:3: (enumLiteral_3= 'week' )
                    {
                    // InternalTaskDSL.g:2182:3: (enumLiteral_3= 'week' )
                    // InternalTaskDSL.g:2183:4: enumLiteral_3= 'week'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleBalance"
    // InternalTaskDSL.g:2193:1: ruleBalance returns [Enumerator current=null] : (enumLiteral_0= 'balance' ) ;
    public final Enumerator ruleBalance() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:2199:2: ( (enumLiteral_0= 'balance' ) )
            // InternalTaskDSL.g:2200:2: (enumLiteral_0= 'balance' )
            {
            // InternalTaskDSL.g:2200:2: (enumLiteral_0= 'balance' )
            // InternalTaskDSL.g:2201:3: enumLiteral_0= 'balance'
            {
            enumLiteral_0=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBalance"


    // $ANTLR start "ruleBinaryBooleanOperator"
    // InternalTaskDSL.g:2210:1: ruleBinaryBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBinaryBooleanOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:2216:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalTaskDSL.g:2217:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalTaskDSL.g:2217:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            else if ( (LA23_0==49) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTaskDSL.g:2218:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalTaskDSL.g:2218:3: (enumLiteral_0= 'AND' )
                    // InternalTaskDSL.g:2219:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:2226:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalTaskDSL.g:2226:3: (enumLiteral_1= 'OR' )
                    // InternalTaskDSL.g:2227:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBinaryBooleanOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalTaskDSL.g:2237:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:2243:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalTaskDSL.g:2244:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalTaskDSL.g:2244:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt24=1;
                }
                break;
            case 51:
                {
                alt24=2;
                }
                break;
            case 52:
                {
                alt24=3;
                }
                break;
            case 53:
                {
                alt24=4;
                }
                break;
            case 54:
                {
                alt24=5;
                }
                break;
            case 55:
                {
                alt24=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalTaskDSL.g:2245:3: (enumLiteral_0= '==' )
                    {
                    // InternalTaskDSL.g:2245:3: (enumLiteral_0= '==' )
                    // InternalTaskDSL.g:2246:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:2253:3: (enumLiteral_1= '!=' )
                    {
                    // InternalTaskDSL.g:2253:3: (enumLiteral_1= '!=' )
                    // InternalTaskDSL.g:2254:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:2261:3: (enumLiteral_2= '>=' )
                    {
                    // InternalTaskDSL.g:2261:3: (enumLiteral_2= '>=' )
                    // InternalTaskDSL.g:2262:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:2269:3: (enumLiteral_3= '>' )
                    {
                    // InternalTaskDSL.g:2269:3: (enumLiteral_3= '>' )
                    // InternalTaskDSL.g:2270:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDSL.g:2277:3: (enumLiteral_4= '<=' )
                    {
                    // InternalTaskDSL.g:2277:3: (enumLiteral_4= '<=' )
                    // InternalTaskDSL.g:2278:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTaskDSL.g:2285:3: (enumLiteral_5= '<' )
                    {
                    // InternalTaskDSL.g:2285:3: (enumLiteral_5= '<' )
                    // InternalTaskDSL.g:2286:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompareOperator"

    // $ANTLR start synpred1_InternalTaskDSL
    public final void synpred1_InternalTaskDSL_fragment() throws RecognitionException {   
        // InternalTaskDSL.g:1954:4: ( ruleComparisonExpression )
        // InternalTaskDSL.g:1954:5: ruleComparisonExpression
        {
        pushFollow(FOLLOW_2);
        ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTaskDSL

    // Delegated rules

    public final boolean synpred1_InternalTaskDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTaskDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000190E002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000190C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000820C00000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000820C00200020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000704000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00008A0C000000A0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000F000200002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00FC000000000000L});

}