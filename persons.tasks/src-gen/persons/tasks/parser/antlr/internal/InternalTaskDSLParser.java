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

@SuppressWarnings("all")
public class InternalTaskDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Planning'", "'anonymous'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'duration:'", "'Lunch'", "'Meeting'", "'Report'", "'Pay'", "'euro'", "'+'", "'-'", "'*'", "'/'", "'max'", "'min'", "'mod'", "'^'", "'('", "')'", "'hour'", "'day'", "'week'", "'balance'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
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
    public static final int RULE_INT=5;
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
             newCompositeNode(grammarAccess.getPlanningRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlanning=rulePlanning();

            state._fsp--;

             current =iv_rulePlanning; 
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
    // $ANTLR end "entryRulePlanning"


    // $ANTLR start "rulePlanning"
    // InternalTaskDSL.g:72:1: rulePlanning returns [EObject current=null] : (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )* ) ;
    public final EObject rulePlanning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_anonymous_2_0=null;
        EObject lv_persons_3_0 = null;

        EObject lv_tasks_4_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:78:2: ( (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )* ) )
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )* )
            {
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )* )
            // InternalTaskDSL.g:80:3: otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( (lv_anonymous_2_0= 'anonymous' ) )? ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlanningAccess().getPlanningKeyword_0());
            		
            // InternalTaskDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalTaskDSL.g:102:3: ( (lv_anonymous_2_0= 'anonymous' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:103:4: (lv_anonymous_2_0= 'anonymous' )
                    {
                    // InternalTaskDSL.g:103:4: (lv_anonymous_2_0= 'anonymous' )
                    // InternalTaskDSL.g:104:5: lv_anonymous_2_0= 'anonymous'
                    {
                    lv_anonymous_2_0=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(lv_anonymous_2_0, grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPlanningRule());
                    					}
                    					setWithLastConsumed(current, "anonymous", lv_anonymous_2_0 != null, "anonymous");
                    				

                    }


                    }
                    break;

            }

            // InternalTaskDSL.g:116:3: ( ( (lv_persons_3_0= rulePerson ) ) | ( (lv_tasks_4_0= ruleTask ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }
                else if ( (LA2_0==14) ) {
                    alt2=2;
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

            	    						newCompositeNode(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_persons_3_0=rulePerson();

            	    state._fsp--;


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

            	    						newCompositeNode(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_tasks_4_0=ruleTask();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRulePerson"
    // InternalTaskDSL.g:161:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalTaskDSL.g:161:47: (iv_rulePerson= rulePerson EOF )
            // InternalTaskDSL.g:162:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalTaskDSL.g:168:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:174:2: ( (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:175:2: (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:175:2: (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:176:3: otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalTaskDSL.g:180:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:181:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:181:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:182:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:202:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalTaskDSL.g:202:45: (iv_ruleTask= ruleTask EOF )
            // InternalTaskDSL.g:203:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTaskDSL.g:209:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? ) ;
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
            // InternalTaskDSL.g:215:2: ( (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? ) )
            // InternalTaskDSL.g:216:2: (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? )
            {
            // InternalTaskDSL.g:216:2: (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? )
            // InternalTaskDSL.g:217:3: otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalTaskDSL.g:221:3: ( (lv_action_1_0= ruleAction ) )
            // InternalTaskDSL.g:222:4: (lv_action_1_0= ruleAction )
            {
            // InternalTaskDSL.g:222:4: (lv_action_1_0= ruleAction )
            // InternalTaskDSL.g:223:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_action_1_0=ruleAction();

            state._fsp--;


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

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getPersonsKeyword_2());
            		
            // InternalTaskDSL.g:244:3: ( (otherlv_3= RULE_ID ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTaskDSL.g:245:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalTaskDSL.g:245:4: (otherlv_3= RULE_ID )
            	    // InternalTaskDSL.g:246:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTaskRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    					newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0());
            	    				

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

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getPriorityKeyword_4());
            		
            // InternalTaskDSL.g:261:3: ( (lv_prio_5_0= RULE_INT ) )
            // InternalTaskDSL.g:262:4: (lv_prio_5_0= RULE_INT )
            {
            // InternalTaskDSL.g:262:4: (lv_prio_5_0= RULE_INT )
            // InternalTaskDSL.g:263:5: lv_prio_5_0= RULE_INT
            {
            lv_prio_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_prio_5_0, grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0());
            				

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

            // InternalTaskDSL.g:279:3: (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:280:4: otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getDurationKeyword_6_0());
                    			
                    // InternalTaskDSL.g:284:4: ( (lv_duration_7_0= ruleDuration ) )
                    // InternalTaskDSL.g:285:5: (lv_duration_7_0= ruleDuration )
                    {
                    // InternalTaskDSL.g:285:5: (lv_duration_7_0= ruleDuration )
                    // InternalTaskDSL.g:286:6: lv_duration_7_0= ruleDuration
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_7_0=ruleDuration();

                    state._fsp--;


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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleDuration"
    // InternalTaskDSL.g:308:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalTaskDSL.g:308:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalTaskDSL.g:309:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration; 
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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalTaskDSL.g:315:1: ruleDuration returns [EObject current=null] : ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token lv_dl_0_0=null;
        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:321:2: ( ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) )
            // InternalTaskDSL.g:322:2: ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            {
            // InternalTaskDSL.g:322:2: ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            // InternalTaskDSL.g:323:3: ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) )
            {
            // InternalTaskDSL.g:323:3: ( (lv_dl_0_0= RULE_INT ) )
            // InternalTaskDSL.g:324:4: (lv_dl_0_0= RULE_INT )
            {
            // InternalTaskDSL.g:324:4: (lv_dl_0_0= RULE_INT )
            // InternalTaskDSL.g:325:5: lv_dl_0_0= RULE_INT
            {
            lv_dl_0_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_dl_0_0, grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0());
            				

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

            // InternalTaskDSL.g:341:3: ( (lv_unit_1_0= ruleTimeUnit ) )
            // InternalTaskDSL.g:342:4: (lv_unit_1_0= ruleTimeUnit )
            {
            // InternalTaskDSL.g:342:4: (lv_unit_1_0= ruleTimeUnit )
            // InternalTaskDSL.g:343:5: lv_unit_1_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_unit_1_0=ruleTimeUnit();

            state._fsp--;


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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:364:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalTaskDSL.g:364:47: (iv_ruleAction= ruleAction EOF )
            // InternalTaskDSL.g:365:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalTaskDSL.g:371:1: ruleAction returns [EObject current=null] : (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_LunchAction_0 = null;

        EObject this_MeetingAction_1 = null;

        EObject this_PaperAction_2 = null;

        EObject this_PaymentAction_3 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:377:2: ( (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction ) )
            // InternalTaskDSL.g:378:2: (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction )
            {
            // InternalTaskDSL.g:378:2: (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTaskDSL.g:379:3: this_LunchAction_0= ruleLunchAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LunchAction_0=ruleLunchAction();

                    state._fsp--;


                    			current = this_LunchAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:388:3: this_MeetingAction_1= ruleMeetingAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeetingAction_1=ruleMeetingAction();

                    state._fsp--;


                    			current = this_MeetingAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:397:3: this_PaperAction_2= rulePaperAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PaperAction_2=rulePaperAction();

                    state._fsp--;


                    			current = this_PaperAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:406:3: this_PaymentAction_3= rulePaymentAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PaymentAction_3=rulePaymentAction();

                    state._fsp--;


                    			current = this_PaymentAction_3;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleLunchAction"
    // InternalTaskDSL.g:418:1: entryRuleLunchAction returns [EObject current=null] : iv_ruleLunchAction= ruleLunchAction EOF ;
    public final EObject entryRuleLunchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunchAction = null;


        try {
            // InternalTaskDSL.g:418:52: (iv_ruleLunchAction= ruleLunchAction EOF )
            // InternalTaskDSL.g:419:2: iv_ruleLunchAction= ruleLunchAction EOF
            {
             newCompositeNode(grammarAccess.getLunchActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLunchAction=ruleLunchAction();

            state._fsp--;

             current =iv_ruleLunchAction; 
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
    // $ANTLR end "entryRuleLunchAction"


    // $ANTLR start "ruleLunchAction"
    // InternalTaskDSL.g:425:1: ruleLunchAction returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLunchAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:431:2: ( (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:432:2: (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:432:2: (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:433:3: otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchActionAccess().getLunchKeyword_0());
            		
            // InternalTaskDSL.g:437:3: ( (lv_location_1_0= RULE_ID ) )
            // InternalTaskDSL.g:438:4: (lv_location_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:438:4: (lv_location_1_0= RULE_ID )
            // InternalTaskDSL.g:439:5: lv_location_1_0= RULE_ID
            {
            lv_location_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_location_1_0, grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "ruleLunchAction"


    // $ANTLR start "entryRuleMeetingAction"
    // InternalTaskDSL.g:459:1: entryRuleMeetingAction returns [EObject current=null] : iv_ruleMeetingAction= ruleMeetingAction EOF ;
    public final EObject entryRuleMeetingAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingAction = null;


        try {
            // InternalTaskDSL.g:459:54: (iv_ruleMeetingAction= ruleMeetingAction EOF )
            // InternalTaskDSL.g:460:2: iv_ruleMeetingAction= ruleMeetingAction EOF
            {
             newCompositeNode(grammarAccess.getMeetingActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeetingAction=ruleMeetingAction();

            state._fsp--;

             current =iv_ruleMeetingAction; 
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
    // $ANTLR end "entryRuleMeetingAction"


    // $ANTLR start "ruleMeetingAction"
    // InternalTaskDSL.g:466:1: ruleMeetingAction returns [EObject current=null] : (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMeetingAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_topic_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:472:2: ( (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) ) )
            // InternalTaskDSL.g:473:2: (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) )
            {
            // InternalTaskDSL.g:473:2: (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) )
            // InternalTaskDSL.g:474:3: otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMeetingActionAccess().getMeetingKeyword_0());
            		
            // InternalTaskDSL.g:478:3: ( (lv_topic_1_0= RULE_STRING ) )
            // InternalTaskDSL.g:479:4: (lv_topic_1_0= RULE_STRING )
            {
            // InternalTaskDSL.g:479:4: (lv_topic_1_0= RULE_STRING )
            // InternalTaskDSL.g:480:5: lv_topic_1_0= RULE_STRING
            {
            lv_topic_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_topic_1_0, grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "ruleMeetingAction"


    // $ANTLR start "entryRulePaperAction"
    // InternalTaskDSL.g:500:1: entryRulePaperAction returns [EObject current=null] : iv_rulePaperAction= rulePaperAction EOF ;
    public final EObject entryRulePaperAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaperAction = null;


        try {
            // InternalTaskDSL.g:500:52: (iv_rulePaperAction= rulePaperAction EOF )
            // InternalTaskDSL.g:501:2: iv_rulePaperAction= rulePaperAction EOF
            {
             newCompositeNode(grammarAccess.getPaperActionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaperAction=rulePaperAction();

            state._fsp--;

             current =iv_rulePaperAction; 
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
    // $ANTLR end "entryRulePaperAction"


    // $ANTLR start "rulePaperAction"
    // InternalTaskDSL.g:507:1: rulePaperAction returns [EObject current=null] : (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) ) ;
    public final EObject rulePaperAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_report_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:513:2: ( (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:514:2: (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:514:2: (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:515:3: otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPaperActionAccess().getReportKeyword_0());
            		
            // InternalTaskDSL.g:519:3: ( (lv_report_1_0= RULE_ID ) )
            // InternalTaskDSL.g:520:4: (lv_report_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:520:4: (lv_report_1_0= RULE_ID )
            // InternalTaskDSL.g:521:5: lv_report_1_0= RULE_ID
            {
            lv_report_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_report_1_0, grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0());
            				

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
    // $ANTLR end "rulePaperAction"


    // $ANTLR start "entryRulePaymentAction"
    // InternalTaskDSL.g:541:1: entryRulePaymentAction returns [EObject current=null] : iv_rulePaymentAction= rulePaymentAction EOF ;
    public final EObject entryRulePaymentAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaymentAction = null;


        try {
            // InternalTaskDSL.g:541:54: (iv_rulePaymentAction= rulePaymentAction EOF )
            // InternalTaskDSL.g:542:2: iv_rulePaymentAction= rulePaymentAction EOF
            {
             newCompositeNode(grammarAccess.getPaymentActionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaymentAction=rulePaymentAction();

            state._fsp--;

             current =iv_rulePaymentAction; 
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
    // $ANTLR end "entryRulePaymentAction"


    // $ANTLR start "rulePaymentAction"
    // InternalTaskDSL.g:548:1: rulePaymentAction returns [EObject current=null] : (otherlv_0= 'Pay' ( (lv_amount_1_0= ruleIntExpression ) ) otherlv_2= 'euro' ) ;
    public final EObject rulePaymentAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_amount_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:554:2: ( (otherlv_0= 'Pay' ( (lv_amount_1_0= ruleIntExpression ) ) otherlv_2= 'euro' ) )
            // InternalTaskDSL.g:555:2: (otherlv_0= 'Pay' ( (lv_amount_1_0= ruleIntExpression ) ) otherlv_2= 'euro' )
            {
            // InternalTaskDSL.g:555:2: (otherlv_0= 'Pay' ( (lv_amount_1_0= ruleIntExpression ) ) otherlv_2= 'euro' )
            // InternalTaskDSL.g:556:3: otherlv_0= 'Pay' ( (lv_amount_1_0= ruleIntExpression ) ) otherlv_2= 'euro'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPaymentActionAccess().getPayKeyword_0());
            		
            // InternalTaskDSL.g:560:3: ( (lv_amount_1_0= ruleIntExpression ) )
            // InternalTaskDSL.g:561:4: (lv_amount_1_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:561:4: (lv_amount_1_0= ruleIntExpression )
            // InternalTaskDSL.g:562:5: lv_amount_1_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_amount_1_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPaymentActionRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"persons.tasks.TaskDSL.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPaymentActionAccess().getEuroKeyword_2());
            		

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
    // $ANTLR end "rulePaymentAction"


    // $ANTLR start "entryRuleIntExpression"
    // InternalTaskDSL.g:587:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalTaskDSL.g:587:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalTaskDSL.g:588:2: iv_ruleIntExpression= ruleIntExpression EOF
            {
             newCompositeNode(grammarAccess.getIntExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntExpression=ruleIntExpression();

            state._fsp--;

             current =iv_ruleIntExpression; 
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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalTaskDSL.g:594:1: ruleIntExpression returns [EObject current=null] : this_ExpressionLevel1_0= ruleExpressionLevel1 ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:600:2: (this_ExpressionLevel1_0= ruleExpressionLevel1 )
            // InternalTaskDSL.g:601:2: this_ExpressionLevel1_0= ruleExpressionLevel1
            {

            		newCompositeNode(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ExpressionLevel1_0=ruleExpressionLevel1();

            state._fsp--;


            		current = this_ExpressionLevel1_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalTaskDSL.g:612:1: entryRuleExpressionLevel1 returns [EObject current=null] : iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF ;
    public final EObject entryRuleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel1 = null;


        try {
            // InternalTaskDSL.g:612:57: (iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF )
            // InternalTaskDSL.g:613:2: iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel1=ruleExpressionLevel1();

            state._fsp--;

             current =iv_ruleExpressionLevel1; 
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
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalTaskDSL.g:619:1: ruleExpressionLevel1 returns [EObject current=null] : (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:625:2: ( (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* ) )
            // InternalTaskDSL.g:626:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* )
            {
            // InternalTaskDSL.g:626:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* )
            // InternalTaskDSL.g:627:3: this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_ExpressionLevel2_0=ruleExpressionLevel2();

            state._fsp--;


            			current = this_ExpressionLevel2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTaskDSL.g:635:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }
                else if ( (LA6_0==24) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTaskDSL.g:636:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalTaskDSL.g:636:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) )
            	    // InternalTaskDSL.g:637:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalTaskDSL.g:637:5: ()
            	    // InternalTaskDSL.g:638:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_13); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalTaskDSL.g:648:5: ( (lv_right_3_0= ruleExpressionLevel2 ) )
            	    // InternalTaskDSL.g:649:6: (lv_right_3_0= ruleExpressionLevel2 )
            	    {
            	    // InternalTaskDSL.g:649:6: (lv_right_3_0= ruleExpressionLevel2 )
            	    // InternalTaskDSL.g:650:7: lv_right_3_0= ruleExpressionLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_right_3_0=ruleExpressionLevel2();

            	    state._fsp--;


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
            	    break;
            	case 2 :
            	    // InternalTaskDSL.g:669:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalTaskDSL.g:669:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) )
            	    // InternalTaskDSL.g:670:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalTaskDSL.g:670:5: ()
            	    // InternalTaskDSL.g:671:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,24,FOLLOW_13); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalTaskDSL.g:681:5: ( (lv_right_6_0= ruleExpressionLevel2 ) )
            	    // InternalTaskDSL.g:682:6: (lv_right_6_0= ruleExpressionLevel2 )
            	    {
            	    // InternalTaskDSL.g:682:6: (lv_right_6_0= ruleExpressionLevel2 )
            	    // InternalTaskDSL.g:683:7: lv_right_6_0= ruleExpressionLevel2
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_right_6_0=ruleExpressionLevel2();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalTaskDSL.g:706:1: entryRuleExpressionLevel2 returns [EObject current=null] : iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF ;
    public final EObject entryRuleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel2 = null;


        try {
            // InternalTaskDSL.g:706:57: (iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF )
            // InternalTaskDSL.g:707:2: iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel2=ruleExpressionLevel2();

            state._fsp--;

             current =iv_ruleExpressionLevel2; 
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
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalTaskDSL.g:713:1: ruleExpressionLevel2 returns [EObject current=null] : (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* ) ;
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
            // InternalTaskDSL.g:719:2: ( (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* ) )
            // InternalTaskDSL.g:720:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* )
            {
            // InternalTaskDSL.g:720:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* )
            // InternalTaskDSL.g:721:3: this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_ExpressionLevel3_0=ruleExpressionLevel3();

            state._fsp--;


            			current = this_ExpressionLevel3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTaskDSL.g:729:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )*
            loop7:
            do {
                int alt7=6;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    alt7=1;
                    }
                    break;
                case 26:
                    {
                    alt7=2;
                    }
                    break;
                case 27:
                    {
                    alt7=3;
                    }
                    break;
                case 28:
                    {
                    alt7=4;
                    }
                    break;
                case 29:
                    {
                    alt7=5;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalTaskDSL.g:730:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:730:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:731:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:731:5: ()
            	    // InternalTaskDSL.g:732:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_13); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalTaskDSL.g:742:5: ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:743:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:743:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:744:7: lv_right_3_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleExpressionLevel3();

            	    state._fsp--;


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
            	    break;
            	case 2 :
            	    // InternalTaskDSL.g:763:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:763:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:764:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:764:5: ()
            	    // InternalTaskDSL.g:765:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,26,FOLLOW_13); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalTaskDSL.g:775:5: ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:776:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:776:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:777:7: lv_right_6_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_right_6_0=ruleExpressionLevel3();

            	    state._fsp--;


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
            	    break;
            	case 3 :
            	    // InternalTaskDSL.g:796:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:796:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:797:5: () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:797:5: ()
            	    // InternalTaskDSL.g:798:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,27,FOLLOW_13); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1());
            	    				
            	    // InternalTaskDSL.g:808:5: ( (lv_right_9_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:809:6: (lv_right_9_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:809:6: (lv_right_9_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:810:7: lv_right_9_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_right_9_0=ruleExpressionLevel3();

            	    state._fsp--;


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
            	    break;
            	case 4 :
            	    // InternalTaskDSL.g:829:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:829:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:830:5: () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:830:5: ()
            	    // InternalTaskDSL.g:831:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,28,FOLLOW_13); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1());
            	    				
            	    // InternalTaskDSL.g:841:5: ( (lv_right_12_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:842:6: (lv_right_12_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:842:6: (lv_right_12_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:843:7: lv_right_12_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_right_12_0=ruleExpressionLevel3();

            	    state._fsp--;


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
            	    break;
            	case 5 :
            	    // InternalTaskDSL.g:862:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalTaskDSL.g:862:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) )
            	    // InternalTaskDSL.g:863:5: () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalTaskDSL.g:863:5: ()
            	    // InternalTaskDSL.g:864:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_14=(Token)match(input,29,FOLLOW_13); 

            	    					newLeafNode(otherlv_14, grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1());
            	    				
            	    // InternalTaskDSL.g:874:5: ( (lv_right_15_0= ruleExpressionLevel3 ) )
            	    // InternalTaskDSL.g:875:6: (lv_right_15_0= ruleExpressionLevel3 )
            	    {
            	    // InternalTaskDSL.g:875:6: (lv_right_15_0= ruleExpressionLevel3 )
            	    // InternalTaskDSL.g:876:7: lv_right_15_0= ruleExpressionLevel3
            	    {

            	    							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_right_15_0=ruleExpressionLevel3();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalTaskDSL.g:899:1: entryRuleExpressionLevel3 returns [EObject current=null] : iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF ;
    public final EObject entryRuleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel3 = null;


        try {
            // InternalTaskDSL.g:899:57: (iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF )
            // InternalTaskDSL.g:900:2: iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel3=ruleExpressionLevel3();

            state._fsp--;

             current =iv_ruleExpressionLevel3; 
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
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalTaskDSL.g:906:1: ruleExpressionLevel3 returns [EObject current=null] : (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? ) ;
    public final EObject ruleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExpressionLevel4_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:912:2: ( (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? ) )
            // InternalTaskDSL.g:913:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? )
            {
            // InternalTaskDSL.g:913:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? )
            // InternalTaskDSL.g:914:3: this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )?
            {

            			newCompositeNode(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_ExpressionLevel4_0=ruleExpressionLevel4();

            state._fsp--;


            			current = this_ExpressionLevel4_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTaskDSL.g:922:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDSL.g:923:4: () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) )
                    {
                    // InternalTaskDSL.g:923:4: ()
                    // InternalTaskDSL.g:924:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1());
                    			
                    // InternalTaskDSL.g:934:4: ( (lv_right_3_0= ruleExpressionLevel3 ) )
                    // InternalTaskDSL.g:935:5: (lv_right_3_0= ruleExpressionLevel3 )
                    {
                    // InternalTaskDSL.g:935:5: (lv_right_3_0= ruleExpressionLevel3 )
                    // InternalTaskDSL.g:936:6: lv_right_3_0= ruleExpressionLevel3
                    {

                    						newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpressionLevel3();

                    state._fsp--;


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
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalTaskDSL.g:958:1: entryRuleExpressionLevel4 returns [EObject current=null] : iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF ;
    public final EObject entryRuleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel4 = null;


        try {
            // InternalTaskDSL.g:958:57: (iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF )
            // InternalTaskDSL.g:959:2: iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel4=ruleExpressionLevel4();

            state._fsp--;

             current =iv_ruleExpressionLevel4; 
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
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalTaskDSL.g:965:1: ruleExpressionLevel4 returns [EObject current=null] : (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 ) ;
    public final EObject ruleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionMinus_0 = null;

        EObject this_ExpressionPlus_1 = null;

        EObject this_ExpressionLevel5_2 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:971:2: ( (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:972:2: (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:972:2: (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
            case 31:
            case 36:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTaskDSL.g:973:3: this_ExpressionMinus_0= ruleExpressionMinus
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionMinus_0=ruleExpressionMinus();

                    state._fsp--;


                    			current = this_ExpressionMinus_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:982:3: this_ExpressionPlus_1= ruleExpressionPlus
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionPlus_1=ruleExpressionPlus();

                    state._fsp--;


                    			current = this_ExpressionPlus_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:991:3: this_ExpressionLevel5_2= ruleExpressionLevel5
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionLevel5_2=ruleExpressionLevel5();

                    state._fsp--;


                    			current = this_ExpressionLevel5_2;
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
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalTaskDSL.g:1003:1: entryRuleExpressionMinus returns [EObject current=null] : iv_ruleExpressionMinus= ruleExpressionMinus EOF ;
    public final EObject entryRuleExpressionMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMinus = null;


        try {
            // InternalTaskDSL.g:1003:56: (iv_ruleExpressionMinus= ruleExpressionMinus EOF )
            // InternalTaskDSL.g:1004:2: iv_ruleExpressionMinus= ruleExpressionMinus EOF
            {
             newCompositeNode(grammarAccess.getExpressionMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionMinus=ruleExpressionMinus();

            state._fsp--;

             current =iv_ruleExpressionMinus; 
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
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalTaskDSL.g:1010:1: ruleExpressionMinus returns [EObject current=null] : (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) ;
    public final EObject ruleExpressionMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1016:2: ( (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) )
            // InternalTaskDSL.g:1017:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            {
            // InternalTaskDSL.g:1017:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            // InternalTaskDSL.g:1018:3: otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0());
            		
            // InternalTaskDSL.g:1022:3: ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:1023:4: (lv_sub_1_0= ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:1023:4: (lv_sub_1_0= ruleExpressionLevel5 )
            // InternalTaskDSL.g:1024:5: lv_sub_1_0= ruleExpressionLevel5
            {

            					newCompositeNode(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel5();

            state._fsp--;


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
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalTaskDSL.g:1045:1: entryRuleExpressionPlus returns [EObject current=null] : iv_ruleExpressionPlus= ruleExpressionPlus EOF ;
    public final EObject entryRuleExpressionPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPlus = null;


        try {
            // InternalTaskDSL.g:1045:55: (iv_ruleExpressionPlus= ruleExpressionPlus EOF )
            // InternalTaskDSL.g:1046:2: iv_ruleExpressionPlus= ruleExpressionPlus EOF
            {
             newCompositeNode(grammarAccess.getExpressionPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionPlus=ruleExpressionPlus();

            state._fsp--;

             current =iv_ruleExpressionPlus; 
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
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalTaskDSL.g:1052:1: ruleExpressionPlus returns [EObject current=null] : (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) ;
    public final EObject ruleExpressionPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1058:2: ( (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) )
            // InternalTaskDSL.g:1059:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            {
            // InternalTaskDSL.g:1059:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            // InternalTaskDSL.g:1060:3: otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0());
            		
            // InternalTaskDSL.g:1064:3: ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:1065:4: (lv_sub_1_0= ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:1065:4: (lv_sub_1_0= ruleExpressionLevel5 )
            // InternalTaskDSL.g:1066:5: lv_sub_1_0= ruleExpressionLevel5
            {

            					newCompositeNode(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel5();

            state._fsp--;


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
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalTaskDSL.g:1087:1: entryRuleExpressionLevel5 returns [EObject current=null] : iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF ;
    public final EObject entryRuleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel5 = null;


        try {
            // InternalTaskDSL.g:1087:57: (iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF )
            // InternalTaskDSL.g:1088:2: iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF
            {
             newCompositeNode(grammarAccess.getExpressionLevel5Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel5=ruleExpressionLevel5();

            state._fsp--;

             current =iv_ruleExpressionLevel5; 
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
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalTaskDSL.g:1094:1: ruleExpressionLevel5 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance ) ;
    public final EObject ruleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBracket_0 = null;

        EObject this_ExpressionConstantInt_1 = null;

        EObject this_ExpressionBalance_2 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1100:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance ) )
            // InternalTaskDSL.g:1101:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance )
            {
            // InternalTaskDSL.g:1101:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt | this_ExpressionBalance_2= ruleExpressionBalance )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTaskDSL.g:1102:3: this_ExpressionBracket_0= ruleExpressionBracket
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionBracket_0=ruleExpressionBracket();

                    state._fsp--;


                    			current = this_ExpressionBracket_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1111:3: this_ExpressionConstantInt_1= ruleExpressionConstantInt
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantInt_1=ruleExpressionConstantInt();

                    state._fsp--;


                    			current = this_ExpressionConstantInt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1120:3: this_ExpressionBalance_2= ruleExpressionBalance
                    {

                    			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpressionBalance_2=ruleExpressionBalance();

                    state._fsp--;


                    			current = this_ExpressionBalance_2;
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
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalTaskDSL.g:1132:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalTaskDSL.g:1132:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalTaskDSL.g:1133:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
            {
             newCompositeNode(grammarAccess.getExpressionBracketRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBracket=ruleExpressionBracket();

            state._fsp--;

             current =iv_ruleExpressionBracket; 
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
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalTaskDSL.g:1139:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1145:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' ) )
            // InternalTaskDSL.g:1146:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' )
            {
            // InternalTaskDSL.g:1146:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' )
            // InternalTaskDSL.g:1147:3: otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
            		
            // InternalTaskDSL.g:1151:3: ( (lv_sub_1_0= ruleIntExpression ) )
            // InternalTaskDSL.g:1152:4: (lv_sub_1_0= ruleIntExpression )
            {
            // InternalTaskDSL.g:1152:4: (lv_sub_1_0= ruleIntExpression )
            // InternalTaskDSL.g:1153:5: lv_sub_1_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_sub_1_0=ruleIntExpression();

            state._fsp--;


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

            otherlv_2=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalTaskDSL.g:1178:1: entryRuleExpressionConstantInt returns [EObject current=null] : iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF ;
    public final EObject entryRuleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantInt = null;


        try {
            // InternalTaskDSL.g:1178:62: (iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF )
            // InternalTaskDSL.g:1179:2: iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF
            {
             newCompositeNode(grammarAccess.getExpressionConstantIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantInt=ruleExpressionConstantInt();

            state._fsp--;

             current =iv_ruleExpressionConstantInt; 
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
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalTaskDSL.g:1185:1: ruleExpressionConstantInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1191:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalTaskDSL.g:1192:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalTaskDSL.g:1192:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalTaskDSL.g:1193:3: (lv_value_0_0= RULE_INT )
            {
            // InternalTaskDSL.g:1193:3: (lv_value_0_0= RULE_INT )
            // InternalTaskDSL.g:1194:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0());
            			

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
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleExpressionBalance"
    // InternalTaskDSL.g:1213:1: entryRuleExpressionBalance returns [EObject current=null] : iv_ruleExpressionBalance= ruleExpressionBalance EOF ;
    public final EObject entryRuleExpressionBalance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBalance = null;


        try {
            // InternalTaskDSL.g:1213:58: (iv_ruleExpressionBalance= ruleExpressionBalance EOF )
            // InternalTaskDSL.g:1214:2: iv_ruleExpressionBalance= ruleExpressionBalance EOF
            {
             newCompositeNode(grammarAccess.getExpressionBalanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBalance=ruleExpressionBalance();

            state._fsp--;

             current =iv_ruleExpressionBalance; 
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
    // $ANTLR end "entryRuleExpressionBalance"


    // $ANTLR start "ruleExpressionBalance"
    // InternalTaskDSL.g:1220:1: ruleExpressionBalance returns [EObject current=null] : ( (lv_value_0_0= ruleBalance ) ) ;
    public final EObject ruleExpressionBalance() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:1226:2: ( ( (lv_value_0_0= ruleBalance ) ) )
            // InternalTaskDSL.g:1227:2: ( (lv_value_0_0= ruleBalance ) )
            {
            // InternalTaskDSL.g:1227:2: ( (lv_value_0_0= ruleBalance ) )
            // InternalTaskDSL.g:1228:3: (lv_value_0_0= ruleBalance )
            {
            // InternalTaskDSL.g:1228:3: (lv_value_0_0= ruleBalance )
            // InternalTaskDSL.g:1229:4: lv_value_0_0= ruleBalance
            {

            				newCompositeNode(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBalance();

            state._fsp--;


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
    // $ANTLR end "ruleExpressionBalance"


    // $ANTLR start "ruleTimeUnit"
    // InternalTaskDSL.g:1249:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1255:2: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) ) )
            // InternalTaskDSL.g:1256:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) )
            {
            // InternalTaskDSL.g:1256:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            case 35:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTaskDSL.g:1257:3: (enumLiteral_0= 'min' )
                    {
                    // InternalTaskDSL.g:1257:3: (enumLiteral_0= 'min' )
                    // InternalTaskDSL.g:1258:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1265:3: (enumLiteral_1= 'hour' )
                    {
                    // InternalTaskDSL.g:1265:3: (enumLiteral_1= 'hour' )
                    // InternalTaskDSL.g:1266:4: enumLiteral_1= 'hour'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1273:3: (enumLiteral_2= 'day' )
                    {
                    // InternalTaskDSL.g:1273:3: (enumLiteral_2= 'day' )
                    // InternalTaskDSL.g:1274:4: enumLiteral_2= 'day'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1281:3: (enumLiteral_3= 'week' )
                    {
                    // InternalTaskDSL.g:1281:3: (enumLiteral_3= 'week' )
                    // InternalTaskDSL.g:1282:4: enumLiteral_3= 'week'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleBalance"
    // InternalTaskDSL.g:1292:1: ruleBalance returns [Enumerator current=null] : (enumLiteral_0= 'balance' ) ;
    public final Enumerator ruleBalance() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:1298:2: ( (enumLiteral_0= 'balance' ) )
            // InternalTaskDSL.g:1299:2: (enumLiteral_0= 'balance' )
            {
            // InternalTaskDSL.g:1299:2: (enumLiteral_0= 'balance' )
            // InternalTaskDSL.g:1300:3: enumLiteral_0= 'balance'
            {
            enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

            			current = grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleBalance"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000E10000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001081800020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});

}