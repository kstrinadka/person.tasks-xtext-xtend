package persons.tasks.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import persons.tasks.services.TaskDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'min'", "'hour'", "'day'", "'week'", "'Planning'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'duration:'", "'Lunch'", "'Meeting'", "'Report'", "'Pay'", "'euro'", "'anonymous'"
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
    public static final int T__26=26;
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

    	public void setGrammarAccess(TaskDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePlanning"
    // InternalTaskDSL.g:53:1: entryRulePlanning : rulePlanning EOF ;
    public final void entryRulePlanning() throws RecognitionException {
        try {
            // InternalTaskDSL.g:54:1: ( rulePlanning EOF )
            // InternalTaskDSL.g:55:1: rulePlanning EOF
            {
             before(grammarAccess.getPlanningRule()); 
            pushFollow(FOLLOW_1);
            rulePlanning();

            state._fsp--;

             after(grammarAccess.getPlanningRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlanning"


    // $ANTLR start "rulePlanning"
    // InternalTaskDSL.g:62:1: rulePlanning : ( ( rule__Planning__Group__0 ) ) ;
    public final void rulePlanning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:66:2: ( ( ( rule__Planning__Group__0 ) ) )
            // InternalTaskDSL.g:67:2: ( ( rule__Planning__Group__0 ) )
            {
            // InternalTaskDSL.g:67:2: ( ( rule__Planning__Group__0 ) )
            // InternalTaskDSL.g:68:3: ( rule__Planning__Group__0 )
            {
             before(grammarAccess.getPlanningAccess().getGroup()); 
            // InternalTaskDSL.g:69:3: ( rule__Planning__Group__0 )
            // InternalTaskDSL.g:69:4: rule__Planning__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Planning__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlanningAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRulePerson"
    // InternalTaskDSL.g:78:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalTaskDSL.g:79:1: ( rulePerson EOF )
            // InternalTaskDSL.g:80:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalTaskDSL.g:87:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:91:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalTaskDSL.g:92:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalTaskDSL.g:92:2: ( ( rule__Person__Group__0 ) )
            // InternalTaskDSL.g:93:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalTaskDSL.g:94:3: ( rule__Person__Group__0 )
            // InternalTaskDSL.g:94:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:103:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalTaskDSL.g:104:1: ( ruleTask EOF )
            // InternalTaskDSL.g:105:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalTaskDSL.g:112:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:116:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalTaskDSL.g:117:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalTaskDSL.g:117:2: ( ( rule__Task__Group__0 ) )
            // InternalTaskDSL.g:118:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalTaskDSL.g:119:3: ( rule__Task__Group__0 )
            // InternalTaskDSL.g:119:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleDuration"
    // InternalTaskDSL.g:128:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalTaskDSL.g:129:1: ( ruleDuration EOF )
            // InternalTaskDSL.g:130:1: ruleDuration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalTaskDSL.g:137:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:141:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalTaskDSL.g:142:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalTaskDSL.g:142:2: ( ( rule__Duration__Group__0 ) )
            // InternalTaskDSL.g:143:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalTaskDSL.g:144:3: ( rule__Duration__Group__0 )
            // InternalTaskDSL.g:144:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:153:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:154:1: ( ruleAction EOF )
            // InternalTaskDSL.g:155:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalTaskDSL.g:162:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:166:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalTaskDSL.g:167:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalTaskDSL.g:167:2: ( ( rule__Action__Alternatives ) )
            // InternalTaskDSL.g:168:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalTaskDSL.g:169:3: ( rule__Action__Alternatives )
            // InternalTaskDSL.g:169:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleLunchAction"
    // InternalTaskDSL.g:178:1: entryRuleLunchAction : ruleLunchAction EOF ;
    public final void entryRuleLunchAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:179:1: ( ruleLunchAction EOF )
            // InternalTaskDSL.g:180:1: ruleLunchAction EOF
            {
             before(grammarAccess.getLunchActionRule()); 
            pushFollow(FOLLOW_1);
            ruleLunchAction();

            state._fsp--;

             after(grammarAccess.getLunchActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLunchAction"


    // $ANTLR start "ruleLunchAction"
    // InternalTaskDSL.g:187:1: ruleLunchAction : ( ( rule__LunchAction__Group__0 ) ) ;
    public final void ruleLunchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:191:2: ( ( ( rule__LunchAction__Group__0 ) ) )
            // InternalTaskDSL.g:192:2: ( ( rule__LunchAction__Group__0 ) )
            {
            // InternalTaskDSL.g:192:2: ( ( rule__LunchAction__Group__0 ) )
            // InternalTaskDSL.g:193:3: ( rule__LunchAction__Group__0 )
            {
             before(grammarAccess.getLunchActionAccess().getGroup()); 
            // InternalTaskDSL.g:194:3: ( rule__LunchAction__Group__0 )
            // InternalTaskDSL.g:194:4: rule__LunchAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLunchActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLunchAction"


    // $ANTLR start "entryRuleMeetingAction"
    // InternalTaskDSL.g:203:1: entryRuleMeetingAction : ruleMeetingAction EOF ;
    public final void entryRuleMeetingAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:204:1: ( ruleMeetingAction EOF )
            // InternalTaskDSL.g:205:1: ruleMeetingAction EOF
            {
             before(grammarAccess.getMeetingActionRule()); 
            pushFollow(FOLLOW_1);
            ruleMeetingAction();

            state._fsp--;

             after(grammarAccess.getMeetingActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeetingAction"


    // $ANTLR start "ruleMeetingAction"
    // InternalTaskDSL.g:212:1: ruleMeetingAction : ( ( rule__MeetingAction__Group__0 ) ) ;
    public final void ruleMeetingAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:216:2: ( ( ( rule__MeetingAction__Group__0 ) ) )
            // InternalTaskDSL.g:217:2: ( ( rule__MeetingAction__Group__0 ) )
            {
            // InternalTaskDSL.g:217:2: ( ( rule__MeetingAction__Group__0 ) )
            // InternalTaskDSL.g:218:3: ( rule__MeetingAction__Group__0 )
            {
             before(grammarAccess.getMeetingActionAccess().getGroup()); 
            // InternalTaskDSL.g:219:3: ( rule__MeetingAction__Group__0 )
            // InternalTaskDSL.g:219:4: rule__MeetingAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeetingActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeetingAction"


    // $ANTLR start "entryRulePaperAction"
    // InternalTaskDSL.g:228:1: entryRulePaperAction : rulePaperAction EOF ;
    public final void entryRulePaperAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:229:1: ( rulePaperAction EOF )
            // InternalTaskDSL.g:230:1: rulePaperAction EOF
            {
             before(grammarAccess.getPaperActionRule()); 
            pushFollow(FOLLOW_1);
            rulePaperAction();

            state._fsp--;

             after(grammarAccess.getPaperActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaperAction"


    // $ANTLR start "rulePaperAction"
    // InternalTaskDSL.g:237:1: rulePaperAction : ( ( rule__PaperAction__Group__0 ) ) ;
    public final void rulePaperAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:241:2: ( ( ( rule__PaperAction__Group__0 ) ) )
            // InternalTaskDSL.g:242:2: ( ( rule__PaperAction__Group__0 ) )
            {
            // InternalTaskDSL.g:242:2: ( ( rule__PaperAction__Group__0 ) )
            // InternalTaskDSL.g:243:3: ( rule__PaperAction__Group__0 )
            {
             before(grammarAccess.getPaperActionAccess().getGroup()); 
            // InternalTaskDSL.g:244:3: ( rule__PaperAction__Group__0 )
            // InternalTaskDSL.g:244:4: rule__PaperAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaperActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaperAction"


    // $ANTLR start "entryRulePaymentAction"
    // InternalTaskDSL.g:253:1: entryRulePaymentAction : rulePaymentAction EOF ;
    public final void entryRulePaymentAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:254:1: ( rulePaymentAction EOF )
            // InternalTaskDSL.g:255:1: rulePaymentAction EOF
            {
             before(grammarAccess.getPaymentActionRule()); 
            pushFollow(FOLLOW_1);
            rulePaymentAction();

            state._fsp--;

             after(grammarAccess.getPaymentActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaymentAction"


    // $ANTLR start "rulePaymentAction"
    // InternalTaskDSL.g:262:1: rulePaymentAction : ( ( rule__PaymentAction__Group__0 ) ) ;
    public final void rulePaymentAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:266:2: ( ( ( rule__PaymentAction__Group__0 ) ) )
            // InternalTaskDSL.g:267:2: ( ( rule__PaymentAction__Group__0 ) )
            {
            // InternalTaskDSL.g:267:2: ( ( rule__PaymentAction__Group__0 ) )
            // InternalTaskDSL.g:268:3: ( rule__PaymentAction__Group__0 )
            {
             before(grammarAccess.getPaymentActionAccess().getGroup()); 
            // InternalTaskDSL.g:269:3: ( rule__PaymentAction__Group__0 )
            // InternalTaskDSL.g:269:4: rule__PaymentAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaymentActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaymentAction"


    // $ANTLR start "ruleTimeUnit"
    // InternalTaskDSL.g:278:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:282:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalTaskDSL.g:283:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalTaskDSL.g:283:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalTaskDSL.g:284:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalTaskDSL.g:285:3: ( rule__TimeUnit__Alternatives )
            // InternalTaskDSL.g:285:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "rule__Planning__Alternatives_3"
    // InternalTaskDSL.g:293:1: rule__Planning__Alternatives_3 : ( ( ( rule__Planning__PersonsAssignment_3_0 ) ) | ( ( rule__Planning__TasksAssignment_3_1 ) ) );
    public final void rule__Planning__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:297:1: ( ( ( rule__Planning__PersonsAssignment_3_0 ) ) | ( ( rule__Planning__TasksAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:298:2: ( ( rule__Planning__PersonsAssignment_3_0 ) )
                    {
                    // InternalTaskDSL.g:298:2: ( ( rule__Planning__PersonsAssignment_3_0 ) )
                    // InternalTaskDSL.g:299:3: ( rule__Planning__PersonsAssignment_3_0 )
                    {
                     before(grammarAccess.getPlanningAccess().getPersonsAssignment_3_0()); 
                    // InternalTaskDSL.g:300:3: ( rule__Planning__PersonsAssignment_3_0 )
                    // InternalTaskDSL.g:300:4: rule__Planning__PersonsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__PersonsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlanningAccess().getPersonsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:304:2: ( ( rule__Planning__TasksAssignment_3_1 ) )
                    {
                    // InternalTaskDSL.g:304:2: ( ( rule__Planning__TasksAssignment_3_1 ) )
                    // InternalTaskDSL.g:305:3: ( rule__Planning__TasksAssignment_3_1 )
                    {
                     before(grammarAccess.getPlanningAccess().getTasksAssignment_3_1()); 
                    // InternalTaskDSL.g:306:3: ( rule__Planning__TasksAssignment_3_1 )
                    // InternalTaskDSL.g:306:4: rule__Planning__TasksAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__TasksAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlanningAccess().getTasksAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Alternatives_3"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalTaskDSL.g:314:1: rule__Action__Alternatives : ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:318:1: ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTaskDSL.g:319:2: ( ruleLunchAction )
                    {
                    // InternalTaskDSL.g:319:2: ( ruleLunchAction )
                    // InternalTaskDSL.g:320:3: ruleLunchAction
                    {
                     before(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLunchAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:325:2: ( ruleMeetingAction )
                    {
                    // InternalTaskDSL.g:325:2: ( ruleMeetingAction )
                    // InternalTaskDSL.g:326:3: ruleMeetingAction
                    {
                     before(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMeetingAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:331:2: ( rulePaperAction )
                    {
                    // InternalTaskDSL.g:331:2: ( rulePaperAction )
                    // InternalTaskDSL.g:332:3: rulePaperAction
                    {
                     before(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePaperAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:337:2: ( rulePaymentAction )
                    {
                    // InternalTaskDSL.g:337:2: ( rulePaymentAction )
                    // InternalTaskDSL.g:338:3: rulePaymentAction
                    {
                     before(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePaymentAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalTaskDSL.g:347:1: rule__TimeUnit__Alternatives : ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:351:1: ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTaskDSL.g:352:2: ( ( 'min' ) )
                    {
                    // InternalTaskDSL.g:352:2: ( ( 'min' ) )
                    // InternalTaskDSL.g:353:3: ( 'min' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 
                    // InternalTaskDSL.g:354:3: ( 'min' )
                    // InternalTaskDSL.g:354:4: 'min'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:358:2: ( ( 'hour' ) )
                    {
                    // InternalTaskDSL.g:358:2: ( ( 'hour' ) )
                    // InternalTaskDSL.g:359:3: ( 'hour' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 
                    // InternalTaskDSL.g:360:3: ( 'hour' )
                    // InternalTaskDSL.g:360:4: 'hour'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:364:2: ( ( 'day' ) )
                    {
                    // InternalTaskDSL.g:364:2: ( ( 'day' ) )
                    // InternalTaskDSL.g:365:3: ( 'day' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 
                    // InternalTaskDSL.g:366:3: ( 'day' )
                    // InternalTaskDSL.g:366:4: 'day'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:370:2: ( ( 'week' ) )
                    {
                    // InternalTaskDSL.g:370:2: ( ( 'week' ) )
                    // InternalTaskDSL.g:371:3: ( 'week' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 
                    // InternalTaskDSL.g:372:3: ( 'week' )
                    // InternalTaskDSL.g:372:4: 'week'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__Planning__Group__0"
    // InternalTaskDSL.g:380:1: rule__Planning__Group__0 : rule__Planning__Group__0__Impl rule__Planning__Group__1 ;
    public final void rule__Planning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:384:1: ( rule__Planning__Group__0__Impl rule__Planning__Group__1 )
            // InternalTaskDSL.g:385:2: rule__Planning__Group__0__Impl rule__Planning__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Planning__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Planning__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__0"


    // $ANTLR start "rule__Planning__Group__0__Impl"
    // InternalTaskDSL.g:392:1: rule__Planning__Group__0__Impl : ( 'Planning' ) ;
    public final void rule__Planning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:396:1: ( ( 'Planning' ) )
            // InternalTaskDSL.g:397:1: ( 'Planning' )
            {
            // InternalTaskDSL.g:397:1: ( 'Planning' )
            // InternalTaskDSL.g:398:2: 'Planning'
            {
             before(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__0__Impl"


    // $ANTLR start "rule__Planning__Group__1"
    // InternalTaskDSL.g:407:1: rule__Planning__Group__1 : rule__Planning__Group__1__Impl rule__Planning__Group__2 ;
    public final void rule__Planning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:411:1: ( rule__Planning__Group__1__Impl rule__Planning__Group__2 )
            // InternalTaskDSL.g:412:2: rule__Planning__Group__1__Impl rule__Planning__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Planning__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__1"


    // $ANTLR start "rule__Planning__Group__1__Impl"
    // InternalTaskDSL.g:419:1: rule__Planning__Group__1__Impl : ( ( rule__Planning__NameAssignment_1 ) ) ;
    public final void rule__Planning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:423:1: ( ( ( rule__Planning__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:424:1: ( ( rule__Planning__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:424:1: ( ( rule__Planning__NameAssignment_1 ) )
            // InternalTaskDSL.g:425:2: ( rule__Planning__NameAssignment_1 )
            {
             before(grammarAccess.getPlanningAccess().getNameAssignment_1()); 
            // InternalTaskDSL.g:426:2: ( rule__Planning__NameAssignment_1 )
            // InternalTaskDSL.g:426:3: rule__Planning__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Planning__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanningAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__1__Impl"


    // $ANTLR start "rule__Planning__Group__2"
    // InternalTaskDSL.g:434:1: rule__Planning__Group__2 : rule__Planning__Group__2__Impl rule__Planning__Group__3 ;
    public final void rule__Planning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:438:1: ( rule__Planning__Group__2__Impl rule__Planning__Group__3 )
            // InternalTaskDSL.g:439:2: rule__Planning__Group__2__Impl rule__Planning__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Planning__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__2"


    // $ANTLR start "rule__Planning__Group__2__Impl"
    // InternalTaskDSL.g:446:1: rule__Planning__Group__2__Impl : ( ( rule__Planning__AnonymousAssignment_2 )? ) ;
    public final void rule__Planning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:450:1: ( ( ( rule__Planning__AnonymousAssignment_2 )? ) )
            // InternalTaskDSL.g:451:1: ( ( rule__Planning__AnonymousAssignment_2 )? )
            {
            // InternalTaskDSL.g:451:1: ( ( rule__Planning__AnonymousAssignment_2 )? )
            // InternalTaskDSL.g:452:2: ( rule__Planning__AnonymousAssignment_2 )?
            {
             before(grammarAccess.getPlanningAccess().getAnonymousAssignment_2()); 
            // InternalTaskDSL.g:453:2: ( rule__Planning__AnonymousAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:453:3: rule__Planning__AnonymousAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__AnonymousAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlanningAccess().getAnonymousAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__2__Impl"


    // $ANTLR start "rule__Planning__Group__3"
    // InternalTaskDSL.g:461:1: rule__Planning__Group__3 : rule__Planning__Group__3__Impl ;
    public final void rule__Planning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:465:1: ( rule__Planning__Group__3__Impl )
            // InternalTaskDSL.g:466:2: rule__Planning__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Planning__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__3"


    // $ANTLR start "rule__Planning__Group__3__Impl"
    // InternalTaskDSL.g:472:1: rule__Planning__Group__3__Impl : ( ( rule__Planning__Alternatives_3 )* ) ;
    public final void rule__Planning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:476:1: ( ( ( rule__Planning__Alternatives_3 )* ) )
            // InternalTaskDSL.g:477:1: ( ( rule__Planning__Alternatives_3 )* )
            {
            // InternalTaskDSL.g:477:1: ( ( rule__Planning__Alternatives_3 )* )
            // InternalTaskDSL.g:478:2: ( rule__Planning__Alternatives_3 )*
            {
             before(grammarAccess.getPlanningAccess().getAlternatives_3()); 
            // InternalTaskDSL.g:479:2: ( rule__Planning__Alternatives_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTaskDSL.g:479:3: rule__Planning__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Planning__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPlanningAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalTaskDSL.g:488:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:492:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalTaskDSL.g:493:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalTaskDSL.g:500:1: rule__Person__Group__0__Impl : ( 'Person:' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:504:1: ( ( 'Person:' ) )
            // InternalTaskDSL.g:505:1: ( 'Person:' )
            {
            // InternalTaskDSL.g:505:1: ( 'Person:' )
            // InternalTaskDSL.g:506:2: 'Person:'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalTaskDSL.g:515:1: rule__Person__Group__1 : rule__Person__Group__1__Impl ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:519:1: ( rule__Person__Group__1__Impl )
            // InternalTaskDSL.g:520:2: rule__Person__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalTaskDSL.g:526:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:530:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:531:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:531:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalTaskDSL.g:532:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalTaskDSL.g:533:2: ( rule__Person__NameAssignment_1 )
            // InternalTaskDSL.g:533:3: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalTaskDSL.g:542:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:546:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalTaskDSL.g:547:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalTaskDSL.g:554:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:558:1: ( ( 'Task:' ) )
            // InternalTaskDSL.g:559:1: ( 'Task:' )
            {
            // InternalTaskDSL.g:559:1: ( 'Task:' )
            // InternalTaskDSL.g:560:2: 'Task:'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalTaskDSL.g:569:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:573:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalTaskDSL.g:574:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalTaskDSL.g:581:1: rule__Task__Group__1__Impl : ( ( rule__Task__ActionAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:585:1: ( ( ( rule__Task__ActionAssignment_1 ) ) )
            // InternalTaskDSL.g:586:1: ( ( rule__Task__ActionAssignment_1 ) )
            {
            // InternalTaskDSL.g:586:1: ( ( rule__Task__ActionAssignment_1 ) )
            // InternalTaskDSL.g:587:2: ( rule__Task__ActionAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getActionAssignment_1()); 
            // InternalTaskDSL.g:588:2: ( rule__Task__ActionAssignment_1 )
            // InternalTaskDSL.g:588:3: rule__Task__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalTaskDSL.g:596:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:600:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalTaskDSL.g:601:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalTaskDSL.g:608:1: rule__Task__Group__2__Impl : ( 'persons:' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:612:1: ( ( 'persons:' ) )
            // InternalTaskDSL.g:613:1: ( 'persons:' )
            {
            // InternalTaskDSL.g:613:1: ( 'persons:' )
            // InternalTaskDSL.g:614:2: 'persons:'
            {
             before(grammarAccess.getTaskAccess().getPersonsKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPersonsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalTaskDSL.g:623:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:627:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalTaskDSL.g:628:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalTaskDSL.g:635:1: rule__Task__Group__3__Impl : ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:639:1: ( ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) ) )
            // InternalTaskDSL.g:640:1: ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) )
            {
            // InternalTaskDSL.g:640:1: ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) )
            // InternalTaskDSL.g:641:2: ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* )
            {
            // InternalTaskDSL.g:641:2: ( ( rule__Task__PersonsAssignment_3 ) )
            // InternalTaskDSL.g:642:3: ( rule__Task__PersonsAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            // InternalTaskDSL.g:643:3: ( rule__Task__PersonsAssignment_3 )
            // InternalTaskDSL.g:643:4: rule__Task__PersonsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Task__PersonsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 

            }

            // InternalTaskDSL.g:646:2: ( ( rule__Task__PersonsAssignment_3 )* )
            // InternalTaskDSL.g:647:3: ( rule__Task__PersonsAssignment_3 )*
            {
             before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            // InternalTaskDSL.g:648:3: ( rule__Task__PersonsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTaskDSL.g:648:4: rule__Task__PersonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Task__PersonsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalTaskDSL.g:657:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:661:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalTaskDSL.g:662:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalTaskDSL.g:669:1: rule__Task__Group__4__Impl : ( 'priority:' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:673:1: ( ( 'priority:' ) )
            // InternalTaskDSL.g:674:1: ( 'priority:' )
            {
            // InternalTaskDSL.g:674:1: ( 'priority:' )
            // InternalTaskDSL.g:675:2: 'priority:'
            {
             before(grammarAccess.getTaskAccess().getPriorityKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPriorityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalTaskDSL.g:684:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:688:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalTaskDSL.g:689:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalTaskDSL.g:696:1: rule__Task__Group__5__Impl : ( ( rule__Task__PrioAssignment_5 ) ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:700:1: ( ( ( rule__Task__PrioAssignment_5 ) ) )
            // InternalTaskDSL.g:701:1: ( ( rule__Task__PrioAssignment_5 ) )
            {
            // InternalTaskDSL.g:701:1: ( ( rule__Task__PrioAssignment_5 ) )
            // InternalTaskDSL.g:702:2: ( rule__Task__PrioAssignment_5 )
            {
             before(grammarAccess.getTaskAccess().getPrioAssignment_5()); 
            // InternalTaskDSL.g:703:2: ( rule__Task__PrioAssignment_5 )
            // InternalTaskDSL.g:703:3: rule__Task__PrioAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Task__PrioAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPrioAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalTaskDSL.g:711:1: rule__Task__Group__6 : rule__Task__Group__6__Impl ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:715:1: ( rule__Task__Group__6__Impl )
            // InternalTaskDSL.g:716:2: rule__Task__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalTaskDSL.g:722:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:726:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // InternalTaskDSL.g:727:1: ( ( rule__Task__Group_6__0 )? )
            {
            // InternalTaskDSL.g:727:1: ( ( rule__Task__Group_6__0 )? )
            // InternalTaskDSL.g:728:2: ( rule__Task__Group_6__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalTaskDSL.g:729:2: ( rule__Task__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTaskDSL.g:729:3: rule__Task__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalTaskDSL.g:738:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:742:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalTaskDSL.g:743:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0"


    // $ANTLR start "rule__Task__Group_6__0__Impl"
    // InternalTaskDSL.g:750:1: rule__Task__Group_6__0__Impl : ( 'duration:' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:754:1: ( ( 'duration:' ) )
            // InternalTaskDSL.g:755:1: ( 'duration:' )
            {
            // InternalTaskDSL.g:755:1: ( 'duration:' )
            // InternalTaskDSL.g:756:2: 'duration:'
            {
             before(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0__Impl"


    // $ANTLR start "rule__Task__Group_6__1"
    // InternalTaskDSL.g:765:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:769:1: ( rule__Task__Group_6__1__Impl )
            // InternalTaskDSL.g:770:2: rule__Task__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1"


    // $ANTLR start "rule__Task__Group_6__1__Impl"
    // InternalTaskDSL.g:776:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__DurationAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:780:1: ( ( ( rule__Task__DurationAssignment_6_1 ) ) )
            // InternalTaskDSL.g:781:1: ( ( rule__Task__DurationAssignment_6_1 ) )
            {
            // InternalTaskDSL.g:781:1: ( ( rule__Task__DurationAssignment_6_1 ) )
            // InternalTaskDSL.g:782:2: ( rule__Task__DurationAssignment_6_1 )
            {
             before(grammarAccess.getTaskAccess().getDurationAssignment_6_1()); 
            // InternalTaskDSL.g:783:2: ( rule__Task__DurationAssignment_6_1 )
            // InternalTaskDSL.g:783:3: rule__Task__DurationAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__DurationAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDurationAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalTaskDSL.g:792:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:796:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalTaskDSL.g:797:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Duration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalTaskDSL.g:804:1: rule__Duration__Group__0__Impl : ( ( rule__Duration__DlAssignment_0 ) ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:808:1: ( ( ( rule__Duration__DlAssignment_0 ) ) )
            // InternalTaskDSL.g:809:1: ( ( rule__Duration__DlAssignment_0 ) )
            {
            // InternalTaskDSL.g:809:1: ( ( rule__Duration__DlAssignment_0 ) )
            // InternalTaskDSL.g:810:2: ( rule__Duration__DlAssignment_0 )
            {
             before(grammarAccess.getDurationAccess().getDlAssignment_0()); 
            // InternalTaskDSL.g:811:2: ( rule__Duration__DlAssignment_0 )
            // InternalTaskDSL.g:811:3: rule__Duration__DlAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__DlAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getDlAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalTaskDSL.g:819:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:823:1: ( rule__Duration__Group__1__Impl )
            // InternalTaskDSL.g:824:2: rule__Duration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalTaskDSL.g:830:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__UnitAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:834:1: ( ( ( rule__Duration__UnitAssignment_1 ) ) )
            // InternalTaskDSL.g:835:1: ( ( rule__Duration__UnitAssignment_1 ) )
            {
            // InternalTaskDSL.g:835:1: ( ( rule__Duration__UnitAssignment_1 ) )
            // InternalTaskDSL.g:836:2: ( rule__Duration__UnitAssignment_1 )
            {
             before(grammarAccess.getDurationAccess().getUnitAssignment_1()); 
            // InternalTaskDSL.g:837:2: ( rule__Duration__UnitAssignment_1 )
            // InternalTaskDSL.g:837:3: rule__Duration__UnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__UnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__LunchAction__Group__0"
    // InternalTaskDSL.g:846:1: rule__LunchAction__Group__0 : rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 ;
    public final void rule__LunchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:850:1: ( rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 )
            // InternalTaskDSL.g:851:2: rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LunchAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__0"


    // $ANTLR start "rule__LunchAction__Group__0__Impl"
    // InternalTaskDSL.g:858:1: rule__LunchAction__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__LunchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:862:1: ( ( 'Lunch' ) )
            // InternalTaskDSL.g:863:1: ( 'Lunch' )
            {
            // InternalTaskDSL.g:863:1: ( 'Lunch' )
            // InternalTaskDSL.g:864:2: 'Lunch'
            {
             before(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__0__Impl"


    // $ANTLR start "rule__LunchAction__Group__1"
    // InternalTaskDSL.g:873:1: rule__LunchAction__Group__1 : rule__LunchAction__Group__1__Impl ;
    public final void rule__LunchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:877:1: ( rule__LunchAction__Group__1__Impl )
            // InternalTaskDSL.g:878:2: rule__LunchAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__1"


    // $ANTLR start "rule__LunchAction__Group__1__Impl"
    // InternalTaskDSL.g:884:1: rule__LunchAction__Group__1__Impl : ( ( rule__LunchAction__LocationAssignment_1 ) ) ;
    public final void rule__LunchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:888:1: ( ( ( rule__LunchAction__LocationAssignment_1 ) ) )
            // InternalTaskDSL.g:889:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            {
            // InternalTaskDSL.g:889:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            // InternalTaskDSL.g:890:2: ( rule__LunchAction__LocationAssignment_1 )
            {
             before(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 
            // InternalTaskDSL.g:891:2: ( rule__LunchAction__LocationAssignment_1 )
            // InternalTaskDSL.g:891:3: rule__LunchAction__LocationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__LocationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__1__Impl"


    // $ANTLR start "rule__MeetingAction__Group__0"
    // InternalTaskDSL.g:900:1: rule__MeetingAction__Group__0 : rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 ;
    public final void rule__MeetingAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:904:1: ( rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 )
            // InternalTaskDSL.g:905:2: rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MeetingAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__0"


    // $ANTLR start "rule__MeetingAction__Group__0__Impl"
    // InternalTaskDSL.g:912:1: rule__MeetingAction__Group__0__Impl : ( 'Meeting' ) ;
    public final void rule__MeetingAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:916:1: ( ( 'Meeting' ) )
            // InternalTaskDSL.g:917:1: ( 'Meeting' )
            {
            // InternalTaskDSL.g:917:1: ( 'Meeting' )
            // InternalTaskDSL.g:918:2: 'Meeting'
            {
             before(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__0__Impl"


    // $ANTLR start "rule__MeetingAction__Group__1"
    // InternalTaskDSL.g:927:1: rule__MeetingAction__Group__1 : rule__MeetingAction__Group__1__Impl ;
    public final void rule__MeetingAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:931:1: ( rule__MeetingAction__Group__1__Impl )
            // InternalTaskDSL.g:932:2: rule__MeetingAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__1"


    // $ANTLR start "rule__MeetingAction__Group__1__Impl"
    // InternalTaskDSL.g:938:1: rule__MeetingAction__Group__1__Impl : ( ( rule__MeetingAction__TopicAssignment_1 ) ) ;
    public final void rule__MeetingAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:942:1: ( ( ( rule__MeetingAction__TopicAssignment_1 ) ) )
            // InternalTaskDSL.g:943:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            {
            // InternalTaskDSL.g:943:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            // InternalTaskDSL.g:944:2: ( rule__MeetingAction__TopicAssignment_1 )
            {
             before(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 
            // InternalTaskDSL.g:945:2: ( rule__MeetingAction__TopicAssignment_1 )
            // InternalTaskDSL.g:945:3: rule__MeetingAction__TopicAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__TopicAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__1__Impl"


    // $ANTLR start "rule__PaperAction__Group__0"
    // InternalTaskDSL.g:954:1: rule__PaperAction__Group__0 : rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 ;
    public final void rule__PaperAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:958:1: ( rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 )
            // InternalTaskDSL.g:959:2: rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PaperAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__0"


    // $ANTLR start "rule__PaperAction__Group__0__Impl"
    // InternalTaskDSL.g:966:1: rule__PaperAction__Group__0__Impl : ( 'Report' ) ;
    public final void rule__PaperAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:970:1: ( ( 'Report' ) )
            // InternalTaskDSL.g:971:1: ( 'Report' )
            {
            // InternalTaskDSL.g:971:1: ( 'Report' )
            // InternalTaskDSL.g:972:2: 'Report'
            {
             before(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__0__Impl"


    // $ANTLR start "rule__PaperAction__Group__1"
    // InternalTaskDSL.g:981:1: rule__PaperAction__Group__1 : rule__PaperAction__Group__1__Impl ;
    public final void rule__PaperAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:985:1: ( rule__PaperAction__Group__1__Impl )
            // InternalTaskDSL.g:986:2: rule__PaperAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__1"


    // $ANTLR start "rule__PaperAction__Group__1__Impl"
    // InternalTaskDSL.g:992:1: rule__PaperAction__Group__1__Impl : ( ( rule__PaperAction__ReportAssignment_1 ) ) ;
    public final void rule__PaperAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:996:1: ( ( ( rule__PaperAction__ReportAssignment_1 ) ) )
            // InternalTaskDSL.g:997:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            {
            // InternalTaskDSL.g:997:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            // InternalTaskDSL.g:998:2: ( rule__PaperAction__ReportAssignment_1 )
            {
             before(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 
            // InternalTaskDSL.g:999:2: ( rule__PaperAction__ReportAssignment_1 )
            // InternalTaskDSL.g:999:3: rule__PaperAction__ReportAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__ReportAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__0"
    // InternalTaskDSL.g:1008:1: rule__PaymentAction__Group__0 : rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 ;
    public final void rule__PaymentAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1012:1: ( rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 )
            // InternalTaskDSL.g:1013:2: rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PaymentAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__0"


    // $ANTLR start "rule__PaymentAction__Group__0__Impl"
    // InternalTaskDSL.g:1020:1: rule__PaymentAction__Group__0__Impl : ( 'Pay' ) ;
    public final void rule__PaymentAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1024:1: ( ( 'Pay' ) )
            // InternalTaskDSL.g:1025:1: ( 'Pay' )
            {
            // InternalTaskDSL.g:1025:1: ( 'Pay' )
            // InternalTaskDSL.g:1026:2: 'Pay'
            {
             before(grammarAccess.getPaymentActionAccess().getPayKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPaymentActionAccess().getPayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__0__Impl"


    // $ANTLR start "rule__PaymentAction__Group__1"
    // InternalTaskDSL.g:1035:1: rule__PaymentAction__Group__1 : rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 ;
    public final void rule__PaymentAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1039:1: ( rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 )
            // InternalTaskDSL.g:1040:2: rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PaymentAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__1"


    // $ANTLR start "rule__PaymentAction__Group__1__Impl"
    // InternalTaskDSL.g:1047:1: rule__PaymentAction__Group__1__Impl : ( ( rule__PaymentAction__AmountAssignment_1 ) ) ;
    public final void rule__PaymentAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1051:1: ( ( ( rule__PaymentAction__AmountAssignment_1 ) ) )
            // InternalTaskDSL.g:1052:1: ( ( rule__PaymentAction__AmountAssignment_1 ) )
            {
            // InternalTaskDSL.g:1052:1: ( ( rule__PaymentAction__AmountAssignment_1 ) )
            // InternalTaskDSL.g:1053:2: ( rule__PaymentAction__AmountAssignment_1 )
            {
             before(grammarAccess.getPaymentActionAccess().getAmountAssignment_1()); 
            // InternalTaskDSL.g:1054:2: ( rule__PaymentAction__AmountAssignment_1 )
            // InternalTaskDSL.g:1054:3: rule__PaymentAction__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaymentActionAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__2"
    // InternalTaskDSL.g:1062:1: rule__PaymentAction__Group__2 : rule__PaymentAction__Group__2__Impl ;
    public final void rule__PaymentAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1066:1: ( rule__PaymentAction__Group__2__Impl )
            // InternalTaskDSL.g:1067:2: rule__PaymentAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__2"


    // $ANTLR start "rule__PaymentAction__Group__2__Impl"
    // InternalTaskDSL.g:1073:1: rule__PaymentAction__Group__2__Impl : ( 'euro' ) ;
    public final void rule__PaymentAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1077:1: ( ( 'euro' ) )
            // InternalTaskDSL.g:1078:1: ( 'euro' )
            {
            // InternalTaskDSL.g:1078:1: ( 'euro' )
            // InternalTaskDSL.g:1079:2: 'euro'
            {
             before(grammarAccess.getPaymentActionAccess().getEuroKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPaymentActionAccess().getEuroKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__2__Impl"


    // $ANTLR start "rule__Planning__NameAssignment_1"
    // InternalTaskDSL.g:1089:1: rule__Planning__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Planning__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1093:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:1094:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:1094:2: ( RULE_ID )
            // InternalTaskDSL.g:1095:3: RULE_ID
            {
             before(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__NameAssignment_1"


    // $ANTLR start "rule__Planning__AnonymousAssignment_2"
    // InternalTaskDSL.g:1104:1: rule__Planning__AnonymousAssignment_2 : ( ( 'anonymous' ) ) ;
    public final void rule__Planning__AnonymousAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1108:1: ( ( ( 'anonymous' ) ) )
            // InternalTaskDSL.g:1109:2: ( ( 'anonymous' ) )
            {
            // InternalTaskDSL.g:1109:2: ( ( 'anonymous' ) )
            // InternalTaskDSL.g:1110:3: ( 'anonymous' )
            {
             before(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            // InternalTaskDSL.g:1111:3: ( 'anonymous' )
            // InternalTaskDSL.g:1112:4: 'anonymous'
            {
             before(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 

            }

             after(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__AnonymousAssignment_2"


    // $ANTLR start "rule__Planning__PersonsAssignment_3_0"
    // InternalTaskDSL.g:1123:1: rule__Planning__PersonsAssignment_3_0 : ( rulePerson ) ;
    public final void rule__Planning__PersonsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1127:1: ( ( rulePerson ) )
            // InternalTaskDSL.g:1128:2: ( rulePerson )
            {
            // InternalTaskDSL.g:1128:2: ( rulePerson )
            // InternalTaskDSL.g:1129:3: rulePerson
            {
             before(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__PersonsAssignment_3_0"


    // $ANTLR start "rule__Planning__TasksAssignment_3_1"
    // InternalTaskDSL.g:1138:1: rule__Planning__TasksAssignment_3_1 : ( ruleTask ) ;
    public final void rule__Planning__TasksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1142:1: ( ( ruleTask ) )
            // InternalTaskDSL.g:1143:2: ( ruleTask )
            {
            // InternalTaskDSL.g:1143:2: ( ruleTask )
            // InternalTaskDSL.g:1144:3: ruleTask
            {
             before(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__TasksAssignment_3_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalTaskDSL.g:1153:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1157:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:1158:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:1158:2: ( RULE_ID )
            // InternalTaskDSL.g:1159:3: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Task__ActionAssignment_1"
    // InternalTaskDSL.g:1168:1: rule__Task__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__Task__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1172:1: ( ( ruleAction ) )
            // InternalTaskDSL.g:1173:2: ( ruleAction )
            {
            // InternalTaskDSL.g:1173:2: ( ruleAction )
            // InternalTaskDSL.g:1174:3: ruleAction
            {
             before(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ActionAssignment_1"


    // $ANTLR start "rule__Task__PersonsAssignment_3"
    // InternalTaskDSL.g:1183:1: rule__Task__PersonsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Task__PersonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1187:1: ( ( ( RULE_ID ) ) )
            // InternalTaskDSL.g:1188:2: ( ( RULE_ID ) )
            {
            // InternalTaskDSL.g:1188:2: ( ( RULE_ID ) )
            // InternalTaskDSL.g:1189:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); 
            // InternalTaskDSL.g:1190:3: ( RULE_ID )
            // InternalTaskDSL.g:1191:4: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PersonsAssignment_3"


    // $ANTLR start "rule__Task__PrioAssignment_5"
    // InternalTaskDSL.g:1202:1: rule__Task__PrioAssignment_5 : ( RULE_INT ) ;
    public final void rule__Task__PrioAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1206:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:1207:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:1207:2: ( RULE_INT )
            // InternalTaskDSL.g:1208:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PrioAssignment_5"


    // $ANTLR start "rule__Task__DurationAssignment_6_1"
    // InternalTaskDSL.g:1217:1: rule__Task__DurationAssignment_6_1 : ( ruleDuration ) ;
    public final void rule__Task__DurationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1221:1: ( ( ruleDuration ) )
            // InternalTaskDSL.g:1222:2: ( ruleDuration )
            {
            // InternalTaskDSL.g:1222:2: ( ruleDuration )
            // InternalTaskDSL.g:1223:3: ruleDuration
            {
             before(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DurationAssignment_6_1"


    // $ANTLR start "rule__Duration__DlAssignment_0"
    // InternalTaskDSL.g:1232:1: rule__Duration__DlAssignment_0 : ( RULE_INT ) ;
    public final void rule__Duration__DlAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1236:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:1237:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:1237:2: ( RULE_INT )
            // InternalTaskDSL.g:1238:3: RULE_INT
            {
             before(grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__DlAssignment_0"


    // $ANTLR start "rule__Duration__UnitAssignment_1"
    // InternalTaskDSL.g:1247:1: rule__Duration__UnitAssignment_1 : ( ruleTimeUnit ) ;
    public final void rule__Duration__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1251:1: ( ( ruleTimeUnit ) )
            // InternalTaskDSL.g:1252:2: ( ruleTimeUnit )
            {
            // InternalTaskDSL.g:1252:2: ( ruleTimeUnit )
            // InternalTaskDSL.g:1253:3: ruleTimeUnit
            {
             before(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__UnitAssignment_1"


    // $ANTLR start "rule__LunchAction__LocationAssignment_1"
    // InternalTaskDSL.g:1262:1: rule__LunchAction__LocationAssignment_1 : ( RULE_ID ) ;
    public final void rule__LunchAction__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1266:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:1267:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:1267:2: ( RULE_ID )
            // InternalTaskDSL.g:1268:3: RULE_ID
            {
             before(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__LocationAssignment_1"


    // $ANTLR start "rule__MeetingAction__TopicAssignment_1"
    // InternalTaskDSL.g:1277:1: rule__MeetingAction__TopicAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MeetingAction__TopicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1281:1: ( ( RULE_STRING ) )
            // InternalTaskDSL.g:1282:2: ( RULE_STRING )
            {
            // InternalTaskDSL.g:1282:2: ( RULE_STRING )
            // InternalTaskDSL.g:1283:3: RULE_STRING
            {
             before(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__TopicAssignment_1"


    // $ANTLR start "rule__PaperAction__ReportAssignment_1"
    // InternalTaskDSL.g:1292:1: rule__PaperAction__ReportAssignment_1 : ( RULE_ID ) ;
    public final void rule__PaperAction__ReportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1296:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:1297:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:1297:2: ( RULE_ID )
            // InternalTaskDSL.g:1298:3: RULE_ID
            {
             before(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__ReportAssignment_1"


    // $ANTLR start "rule__PaymentAction__AmountAssignment_1"
    // InternalTaskDSL.g:1307:1: rule__PaymentAction__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__PaymentAction__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1311:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:1312:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:1312:2: ( RULE_INT )
            // InternalTaskDSL.g:1313:3: RULE_INT
            {
             before(grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__AmountAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004030000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});

}