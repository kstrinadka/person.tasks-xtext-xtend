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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Planning'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'duration:'", "'Lunch'", "'Meeting'", "'Report'", "'Pay'", "'euro'", "'min'", "'hour'", "'day'", "'week'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
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
    // InternalTaskDSL.g:72:1: rulePlanning returns [EObject current=null] : (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )* ) ;
    public final EObject rulePlanning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_persons_2_0 = null;

        EObject lv_tasks_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:78:2: ( (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )* ) )
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )* )
            {
            // InternalTaskDSL.g:79:2: (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )* )
            // InternalTaskDSL.g:80:3: otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )*
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

            // InternalTaskDSL.g:102:3: ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }
                else if ( (LA1_0==13) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTaskDSL.g:103:4: ( (lv_persons_2_0= rulePerson ) )
            	    {
            	    // InternalTaskDSL.g:103:4: ( (lv_persons_2_0= rulePerson ) )
            	    // InternalTaskDSL.g:104:5: (lv_persons_2_0= rulePerson )
            	    {
            	    // InternalTaskDSL.g:104:5: (lv_persons_2_0= rulePerson )
            	    // InternalTaskDSL.g:105:6: lv_persons_2_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_persons_2_0=rulePerson();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlanningRule());
            	    						}
            	    						add(
            	    							current,
            	    							"persons",
            	    							lv_persons_2_0,
            	    							"persons.tasks.TaskDSL.Person");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTaskDSL.g:123:4: ( (lv_tasks_3_0= ruleTask ) )
            	    {
            	    // InternalTaskDSL.g:123:4: ( (lv_tasks_3_0= ruleTask ) )
            	    // InternalTaskDSL.g:124:5: (lv_tasks_3_0= ruleTask )
            	    {
            	    // InternalTaskDSL.g:124:5: (lv_tasks_3_0= ruleTask )
            	    // InternalTaskDSL.g:125:6: lv_tasks_3_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_tasks_3_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlanningRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_3_0,
            	    							"persons.tasks.TaskDSL.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRulePerson"
    // InternalTaskDSL.g:147:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalTaskDSL.g:147:47: (iv_rulePerson= rulePerson EOF )
            // InternalTaskDSL.g:148:2: iv_rulePerson= rulePerson EOF
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
    // InternalTaskDSL.g:154:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:160:2: ( (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:161:2: (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:161:2: (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:162:3: otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalTaskDSL.g:166:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDSL.g:167:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:167:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDSL.g:168:5: lv_name_1_0= RULE_ID
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
    // InternalTaskDSL.g:188:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalTaskDSL.g:188:45: (iv_ruleTask= ruleTask EOF )
            // InternalTaskDSL.g:189:2: iv_ruleTask= ruleTask EOF
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
    // InternalTaskDSL.g:195:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? ) ;
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
            // InternalTaskDSL.g:201:2: ( (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? ) )
            // InternalTaskDSL.g:202:2: (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? )
            {
            // InternalTaskDSL.g:202:2: (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )? )
            // InternalTaskDSL.g:203:3: otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalTaskDSL.g:207:3: ( (lv_action_1_0= ruleAction ) )
            // InternalTaskDSL.g:208:4: (lv_action_1_0= ruleAction )
            {
            // InternalTaskDSL.g:208:4: (lv_action_1_0= ruleAction )
            // InternalTaskDSL.g:209:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getPersonsKeyword_2());
            		
            // InternalTaskDSL.g:230:3: ( (otherlv_3= RULE_ID ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTaskDSL.g:231:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalTaskDSL.g:231:4: (otherlv_3= RULE_ID )
            	    // InternalTaskDSL.g:232:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTaskRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    					newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getPriorityKeyword_4());
            		
            // InternalTaskDSL.g:247:3: ( (lv_prio_5_0= RULE_INT ) )
            // InternalTaskDSL.g:248:4: (lv_prio_5_0= RULE_INT )
            {
            // InternalTaskDSL.g:248:4: (lv_prio_5_0= RULE_INT )
            // InternalTaskDSL.g:249:5: lv_prio_5_0= RULE_INT
            {
            lv_prio_5_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            // InternalTaskDSL.g:265:3: (otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaskDSL.g:266:4: otherlv_6= 'duration:' ( (lv_duration_7_0= ruleDuration ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getDurationKeyword_6_0());
                    			
                    // InternalTaskDSL.g:270:4: ( (lv_duration_7_0= ruleDuration ) )
                    // InternalTaskDSL.g:271:5: (lv_duration_7_0= ruleDuration )
                    {
                    // InternalTaskDSL.g:271:5: (lv_duration_7_0= ruleDuration )
                    // InternalTaskDSL.g:272:6: lv_duration_7_0= ruleDuration
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
    // InternalTaskDSL.g:294:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // InternalTaskDSL.g:294:49: (iv_ruleDuration= ruleDuration EOF )
            // InternalTaskDSL.g:295:2: iv_ruleDuration= ruleDuration EOF
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
    // InternalTaskDSL.g:301:1: ruleDuration returns [EObject current=null] : ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token lv_dl_0_0=null;
        Enumerator lv_unit_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:307:2: ( ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) )
            // InternalTaskDSL.g:308:2: ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            {
            // InternalTaskDSL.g:308:2: ( ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            // InternalTaskDSL.g:309:3: ( (lv_dl_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) )
            {
            // InternalTaskDSL.g:309:3: ( (lv_dl_0_0= RULE_INT ) )
            // InternalTaskDSL.g:310:4: (lv_dl_0_0= RULE_INT )
            {
            // InternalTaskDSL.g:310:4: (lv_dl_0_0= RULE_INT )
            // InternalTaskDSL.g:311:5: lv_dl_0_0= RULE_INT
            {
            lv_dl_0_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            // InternalTaskDSL.g:327:3: ( (lv_unit_1_0= ruleTimeUnit ) )
            // InternalTaskDSL.g:328:4: (lv_unit_1_0= ruleTimeUnit )
            {
            // InternalTaskDSL.g:328:4: (lv_unit_1_0= ruleTimeUnit )
            // InternalTaskDSL.g:329:5: lv_unit_1_0= ruleTimeUnit
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
    // InternalTaskDSL.g:350:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalTaskDSL.g:350:47: (iv_ruleAction= ruleAction EOF )
            // InternalTaskDSL.g:351:2: iv_ruleAction= ruleAction EOF
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
    // InternalTaskDSL.g:357:1: ruleAction returns [EObject current=null] : (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_LunchAction_0 = null;

        EObject this_MeetingAction_1 = null;

        EObject this_PaperAction_2 = null;

        EObject this_PaymentAction_3 = null;



        	enterRule();

        try {
            // InternalTaskDSL.g:363:2: ( (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction ) )
            // InternalTaskDSL.g:364:2: (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction )
            {
            // InternalTaskDSL.g:364:2: (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:365:3: this_LunchAction_0= ruleLunchAction
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
                    // InternalTaskDSL.g:374:3: this_MeetingAction_1= ruleMeetingAction
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
                    // InternalTaskDSL.g:383:3: this_PaperAction_2= rulePaperAction
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
                    // InternalTaskDSL.g:392:3: this_PaymentAction_3= rulePaymentAction
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
    // InternalTaskDSL.g:404:1: entryRuleLunchAction returns [EObject current=null] : iv_ruleLunchAction= ruleLunchAction EOF ;
    public final EObject entryRuleLunchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunchAction = null;


        try {
            // InternalTaskDSL.g:404:52: (iv_ruleLunchAction= ruleLunchAction EOF )
            // InternalTaskDSL.g:405:2: iv_ruleLunchAction= ruleLunchAction EOF
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
    // InternalTaskDSL.g:411:1: ruleLunchAction returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLunchAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:417:2: ( (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:418:2: (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:418:2: (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:419:3: otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchActionAccess().getLunchKeyword_0());
            		
            // InternalTaskDSL.g:423:3: ( (lv_location_1_0= RULE_ID ) )
            // InternalTaskDSL.g:424:4: (lv_location_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:424:4: (lv_location_1_0= RULE_ID )
            // InternalTaskDSL.g:425:5: lv_location_1_0= RULE_ID
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
    // InternalTaskDSL.g:445:1: entryRuleMeetingAction returns [EObject current=null] : iv_ruleMeetingAction= ruleMeetingAction EOF ;
    public final EObject entryRuleMeetingAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingAction = null;


        try {
            // InternalTaskDSL.g:445:54: (iv_ruleMeetingAction= ruleMeetingAction EOF )
            // InternalTaskDSL.g:446:2: iv_ruleMeetingAction= ruleMeetingAction EOF
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
    // InternalTaskDSL.g:452:1: ruleMeetingAction returns [EObject current=null] : (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMeetingAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_topic_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:458:2: ( (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) ) )
            // InternalTaskDSL.g:459:2: (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) )
            {
            // InternalTaskDSL.g:459:2: (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) )
            // InternalTaskDSL.g:460:3: otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMeetingActionAccess().getMeetingKeyword_0());
            		
            // InternalTaskDSL.g:464:3: ( (lv_topic_1_0= RULE_STRING ) )
            // InternalTaskDSL.g:465:4: (lv_topic_1_0= RULE_STRING )
            {
            // InternalTaskDSL.g:465:4: (lv_topic_1_0= RULE_STRING )
            // InternalTaskDSL.g:466:5: lv_topic_1_0= RULE_STRING
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
    // InternalTaskDSL.g:486:1: entryRulePaperAction returns [EObject current=null] : iv_rulePaperAction= rulePaperAction EOF ;
    public final EObject entryRulePaperAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaperAction = null;


        try {
            // InternalTaskDSL.g:486:52: (iv_rulePaperAction= rulePaperAction EOF )
            // InternalTaskDSL.g:487:2: iv_rulePaperAction= rulePaperAction EOF
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
    // InternalTaskDSL.g:493:1: rulePaperAction returns [EObject current=null] : (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) ) ;
    public final EObject rulePaperAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_report_1_0=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:499:2: ( (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) ) )
            // InternalTaskDSL.g:500:2: (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) )
            {
            // InternalTaskDSL.g:500:2: (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) )
            // InternalTaskDSL.g:501:3: otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPaperActionAccess().getReportKeyword_0());
            		
            // InternalTaskDSL.g:505:3: ( (lv_report_1_0= RULE_ID ) )
            // InternalTaskDSL.g:506:4: (lv_report_1_0= RULE_ID )
            {
            // InternalTaskDSL.g:506:4: (lv_report_1_0= RULE_ID )
            // InternalTaskDSL.g:507:5: lv_report_1_0= RULE_ID
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
    // InternalTaskDSL.g:527:1: entryRulePaymentAction returns [EObject current=null] : iv_rulePaymentAction= rulePaymentAction EOF ;
    public final EObject entryRulePaymentAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaymentAction = null;


        try {
            // InternalTaskDSL.g:527:54: (iv_rulePaymentAction= rulePaymentAction EOF )
            // InternalTaskDSL.g:528:2: iv_rulePaymentAction= rulePaymentAction EOF
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
    // InternalTaskDSL.g:534:1: rulePaymentAction returns [EObject current=null] : (otherlv_0= 'Pay' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'euro' ) ;
    public final EObject rulePaymentAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:540:2: ( (otherlv_0= 'Pay' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'euro' ) )
            // InternalTaskDSL.g:541:2: (otherlv_0= 'Pay' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'euro' )
            {
            // InternalTaskDSL.g:541:2: (otherlv_0= 'Pay' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'euro' )
            // InternalTaskDSL.g:542:3: otherlv_0= 'Pay' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'euro'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPaymentActionAccess().getPayKeyword_0());
            		
            // InternalTaskDSL.g:546:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalTaskDSL.g:547:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalTaskDSL.g:547:4: (lv_amount_1_0= RULE_INT )
            // InternalTaskDSL.g:548:5: lv_amount_1_0= RULE_INT
            {
            lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_amount_1_0, grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaymentActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "ruleTimeUnit"
    // InternalTaskDSL.g:572:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTaskDSL.g:578:2: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) ) )
            // InternalTaskDSL.g:579:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) )
            {
            // InternalTaskDSL.g:579:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
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
                    // InternalTaskDSL.g:580:3: (enumLiteral_0= 'min' )
                    {
                    // InternalTaskDSL.g:580:3: (enumLiteral_0= 'min' )
                    // InternalTaskDSL.g:581:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:588:3: (enumLiteral_1= 'hour' )
                    {
                    // InternalTaskDSL.g:588:3: (enumLiteral_1= 'hour' )
                    // InternalTaskDSL.g:589:4: enumLiteral_1= 'hour'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:596:3: (enumLiteral_2= 'day' )
                    {
                    // InternalTaskDSL.g:596:3: (enumLiteral_2= 'day' )
                    // InternalTaskDSL.g:597:4: enumLiteral_2= 'day'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:604:3: (enumLiteral_3= 'week' )
                    {
                    // InternalTaskDSL.g:604:3: (enumLiteral_3= 'week' )
                    // InternalTaskDSL.g:605:4: enumLiteral_3= 'week'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});

}