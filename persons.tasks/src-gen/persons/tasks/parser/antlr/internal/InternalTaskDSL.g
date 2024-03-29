/*
 * generated by Xtext 2.32.0
 */
grammar InternalTaskDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package persons.tasks.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePlanning
entryRulePlanning returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlanningRule()); }
	iv_rulePlanning=rulePlanning
	{ $current=$iv_rulePlanning.current; }
	EOF;

// Rule Planning
rulePlanning returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Planning'
		{
			newLeafNode(otherlv_0, grammarAccess.getPlanningAccess().getPlanningKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPlanningRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_2_0_0());
					}
					lv_persons_2_0=rulePerson
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlanningRule());
						}
						add(
							$current,
							"persons",
							lv_persons_2_0,
							"persons.tasks.TaskDSL.Person");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_2_1_0());
					}
					lv_tasks_3_0=ruleTask
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlanningRule());
						}
						add(
							$current,
							"tasks",
							lv_tasks_3_0,
							"persons.tasks.TaskDSL.Task");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePerson
entryRulePerson returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPersonRule()); }
	iv_rulePerson=rulePerson
	{ $current=$iv_rulePerson.current; }
	EOF;

// Rule Person
rulePerson returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Person:'
		{
			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPersonRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	iv_ruleTask=ruleTask
	{ $current=$iv_ruleTask.current; }
	EOF;

// Rule Task
ruleTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Task:'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0());
				}
				lv_action_1_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					set(
						$current,
						"action",
						lv_action_1_0,
						"persons.tasks.TaskDSL.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='persons:'
		{
			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getPersonsKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0());
				}
			)
		)+
		otherlv_4='priority:'
		{
			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getPriorityKeyword_4());
		}
		(
			(
				lv_prio_5_0=RULE_INT
				{
					newLeafNode(lv_prio_5_0, grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
					setWithLastConsumed(
						$current,
						"prio",
						lv_prio_5_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			otherlv_6='duration:'
			{
				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getDurationKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_6_1_0());
					}
					lv_duration_7_0=ruleDuration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTaskRule());
						}
						set(
							$current,
							"duration",
							lv_duration_7_0,
							"persons.tasks.TaskDSL.Duration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleDuration
entryRuleDuration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDurationRule()); }
	iv_ruleDuration=ruleDuration
	{ $current=$iv_ruleDuration.current; }
	EOF;

// Rule Duration
ruleDuration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_dl_0_0=RULE_INT
				{
					newLeafNode(lv_dl_0_0, grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDurationRule());
					}
					setWithLastConsumed(
						$current,
						"dl",
						lv_dl_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0());
				}
				lv_unit_1_0=ruleTimeUnit
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDurationRule());
					}
					set(
						$current,
						"unit",
						lv_unit_1_0,
						"persons.tasks.TaskDSL.TimeUnit");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0());
		}
		this_LunchAction_0=ruleLunchAction
		{
			$current = $this_LunchAction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1());
		}
		this_MeetingAction_1=ruleMeetingAction
		{
			$current = $this_MeetingAction_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2());
		}
		this_PaperAction_2=rulePaperAction
		{
			$current = $this_PaperAction_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3());
		}
		this_PaymentAction_3=rulePaymentAction
		{
			$current = $this_PaymentAction_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLunchAction
entryRuleLunchAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLunchActionRule()); }
	iv_ruleLunchAction=ruleLunchAction
	{ $current=$iv_ruleLunchAction.current; }
	EOF;

// Rule LunchAction
ruleLunchAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Lunch'
		{
			newLeafNode(otherlv_0, grammarAccess.getLunchActionAccess().getLunchKeyword_0());
		}
		(
			(
				lv_location_1_0=RULE_ID
				{
					newLeafNode(lv_location_1_0, grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLunchActionRule());
					}
					setWithLastConsumed(
						$current,
						"location",
						lv_location_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleMeetingAction
entryRuleMeetingAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMeetingActionRule()); }
	iv_ruleMeetingAction=ruleMeetingAction
	{ $current=$iv_ruleMeetingAction.current; }
	EOF;

// Rule MeetingAction
ruleMeetingAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Meeting'
		{
			newLeafNode(otherlv_0, grammarAccess.getMeetingActionAccess().getMeetingKeyword_0());
		}
		(
			(
				lv_topic_1_0=RULE_STRING
				{
					newLeafNode(lv_topic_1_0, grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMeetingActionRule());
					}
					setWithLastConsumed(
						$current,
						"topic",
						lv_topic_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRulePaperAction
entryRulePaperAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPaperActionRule()); }
	iv_rulePaperAction=rulePaperAction
	{ $current=$iv_rulePaperAction.current; }
	EOF;

// Rule PaperAction
rulePaperAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Report'
		{
			newLeafNode(otherlv_0, grammarAccess.getPaperActionAccess().getReportKeyword_0());
		}
		(
			(
				lv_report_1_0=RULE_ID
				{
					newLeafNode(lv_report_1_0, grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPaperActionRule());
					}
					setWithLastConsumed(
						$current,
						"report",
						lv_report_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRulePaymentAction
entryRulePaymentAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPaymentActionRule()); }
	iv_rulePaymentAction=rulePaymentAction
	{ $current=$iv_rulePaymentAction.current; }
	EOF;

// Rule PaymentAction
rulePaymentAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Pay'
		{
			newLeafNode(otherlv_0, grammarAccess.getPaymentActionAccess().getPayKeyword_0());
		}
		(
			(
				lv_amount_1_0=RULE_INT
				{
					newLeafNode(lv_amount_1_0, grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPaymentActionRule());
					}
					setWithLastConsumed(
						$current,
						"amount",
						lv_amount_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2='euro'
		{
			newLeafNode(otherlv_2, grammarAccess.getPaymentActionAccess().getEuroKeyword_2());
		}
	)
;

// Rule TimeUnit
ruleTimeUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='min'
			{
				$current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='hour'
			{
				$current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='day'
			{
				$current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='week'
			{
				$current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
