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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'balance'", "'min'", "'hour'", "'day'", "'week'", "'Planning'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'duration:'", "'Lunch'", "'Meeting'", "'Report'", "'Pay'", "'euro'", "'+'", "'-'", "'*'", "'/'", "'max'", "'mod'", "'^'", "'('", "')'", "'anonymous'"
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


    // $ANTLR start "entryRuleIntExpression"
    // InternalTaskDSL.g:278:1: entryRuleIntExpression : ruleIntExpression EOF ;
    public final void entryRuleIntExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:279:1: ( ruleIntExpression EOF )
            // InternalTaskDSL.g:280:1: ruleIntExpression EOF
            {
             before(grammarAccess.getIntExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntExpression();

            state._fsp--;

             after(grammarAccess.getIntExpressionRule()); 
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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalTaskDSL.g:287:1: ruleIntExpression : ( ruleExpressionLevel1 ) ;
    public final void ruleIntExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:291:2: ( ( ruleExpressionLevel1 ) )
            // InternalTaskDSL.g:292:2: ( ruleExpressionLevel1 )
            {
            // InternalTaskDSL.g:292:2: ( ruleExpressionLevel1 )
            // InternalTaskDSL.g:293:3: ruleExpressionLevel1
            {
             before(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel1();

            state._fsp--;

             after(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 

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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalTaskDSL.g:303:1: entryRuleExpressionLevel1 : ruleExpressionLevel1 EOF ;
    public final void entryRuleExpressionLevel1() throws RecognitionException {
        try {
            // InternalTaskDSL.g:304:1: ( ruleExpressionLevel1 EOF )
            // InternalTaskDSL.g:305:1: ruleExpressionLevel1 EOF
            {
             before(grammarAccess.getExpressionLevel1Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel1();

            state._fsp--;

             after(grammarAccess.getExpressionLevel1Rule()); 
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
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalTaskDSL.g:312:1: ruleExpressionLevel1 : ( ( rule__ExpressionLevel1__Group__0 ) ) ;
    public final void ruleExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:316:2: ( ( ( rule__ExpressionLevel1__Group__0 ) ) )
            // InternalTaskDSL.g:317:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            {
            // InternalTaskDSL.g:317:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            // InternalTaskDSL.g:318:3: ( rule__ExpressionLevel1__Group__0 )
            {
             before(grammarAccess.getExpressionLevel1Access().getGroup()); 
            // InternalTaskDSL.g:319:3: ( rule__ExpressionLevel1__Group__0 )
            // InternalTaskDSL.g:319:4: rule__ExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel1Access().getGroup()); 

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
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalTaskDSL.g:328:1: entryRuleExpressionLevel2 : ruleExpressionLevel2 EOF ;
    public final void entryRuleExpressionLevel2() throws RecognitionException {
        try {
            // InternalTaskDSL.g:329:1: ( ruleExpressionLevel2 EOF )
            // InternalTaskDSL.g:330:1: ruleExpressionLevel2 EOF
            {
             before(grammarAccess.getExpressionLevel2Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel2();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Rule()); 
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
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalTaskDSL.g:337:1: ruleExpressionLevel2 : ( ( rule__ExpressionLevel2__Group__0 ) ) ;
    public final void ruleExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:341:2: ( ( ( rule__ExpressionLevel2__Group__0 ) ) )
            // InternalTaskDSL.g:342:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            {
            // InternalTaskDSL.g:342:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            // InternalTaskDSL.g:343:3: ( rule__ExpressionLevel2__Group__0 )
            {
             before(grammarAccess.getExpressionLevel2Access().getGroup()); 
            // InternalTaskDSL.g:344:3: ( rule__ExpressionLevel2__Group__0 )
            // InternalTaskDSL.g:344:4: rule__ExpressionLevel2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel2Access().getGroup()); 

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
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalTaskDSL.g:353:1: entryRuleExpressionLevel3 : ruleExpressionLevel3 EOF ;
    public final void entryRuleExpressionLevel3() throws RecognitionException {
        try {
            // InternalTaskDSL.g:354:1: ( ruleExpressionLevel3 EOF )
            // InternalTaskDSL.g:355:1: ruleExpressionLevel3 EOF
            {
             before(grammarAccess.getExpressionLevel3Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel3Rule()); 
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
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalTaskDSL.g:362:1: ruleExpressionLevel3 : ( ( rule__ExpressionLevel3__Group__0 ) ) ;
    public final void ruleExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:366:2: ( ( ( rule__ExpressionLevel3__Group__0 ) ) )
            // InternalTaskDSL.g:367:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            {
            // InternalTaskDSL.g:367:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            // InternalTaskDSL.g:368:3: ( rule__ExpressionLevel3__Group__0 )
            {
             before(grammarAccess.getExpressionLevel3Access().getGroup()); 
            // InternalTaskDSL.g:369:3: ( rule__ExpressionLevel3__Group__0 )
            // InternalTaskDSL.g:369:4: rule__ExpressionLevel3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel3Access().getGroup()); 

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
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalTaskDSL.g:378:1: entryRuleExpressionLevel4 : ruleExpressionLevel4 EOF ;
    public final void entryRuleExpressionLevel4() throws RecognitionException {
        try {
            // InternalTaskDSL.g:379:1: ( ruleExpressionLevel4 EOF )
            // InternalTaskDSL.g:380:1: ruleExpressionLevel4 EOF
            {
             before(grammarAccess.getExpressionLevel4Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel4();

            state._fsp--;

             after(grammarAccess.getExpressionLevel4Rule()); 
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
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalTaskDSL.g:387:1: ruleExpressionLevel4 : ( ( rule__ExpressionLevel4__Alternatives ) ) ;
    public final void ruleExpressionLevel4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:391:2: ( ( ( rule__ExpressionLevel4__Alternatives ) ) )
            // InternalTaskDSL.g:392:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            {
            // InternalTaskDSL.g:392:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            // InternalTaskDSL.g:393:3: ( rule__ExpressionLevel4__Alternatives )
            {
             before(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
            // InternalTaskDSL.g:394:3: ( rule__ExpressionLevel4__Alternatives )
            // InternalTaskDSL.g:394:4: rule__ExpressionLevel4__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel4Access().getAlternatives()); 

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
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalTaskDSL.g:403:1: entryRuleExpressionMinus : ruleExpressionMinus EOF ;
    public final void entryRuleExpressionMinus() throws RecognitionException {
        try {
            // InternalTaskDSL.g:404:1: ( ruleExpressionMinus EOF )
            // InternalTaskDSL.g:405:1: ruleExpressionMinus EOF
            {
             before(grammarAccess.getExpressionMinusRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionMinus();

            state._fsp--;

             after(grammarAccess.getExpressionMinusRule()); 
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
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalTaskDSL.g:412:1: ruleExpressionMinus : ( ( rule__ExpressionMinus__Group__0 ) ) ;
    public final void ruleExpressionMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:416:2: ( ( ( rule__ExpressionMinus__Group__0 ) ) )
            // InternalTaskDSL.g:417:2: ( ( rule__ExpressionMinus__Group__0 ) )
            {
            // InternalTaskDSL.g:417:2: ( ( rule__ExpressionMinus__Group__0 ) )
            // InternalTaskDSL.g:418:3: ( rule__ExpressionMinus__Group__0 )
            {
             before(grammarAccess.getExpressionMinusAccess().getGroup()); 
            // InternalTaskDSL.g:419:3: ( rule__ExpressionMinus__Group__0 )
            // InternalTaskDSL.g:419:4: rule__ExpressionMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionMinusAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalTaskDSL.g:428:1: entryRuleExpressionPlus : ruleExpressionPlus EOF ;
    public final void entryRuleExpressionPlus() throws RecognitionException {
        try {
            // InternalTaskDSL.g:429:1: ( ruleExpressionPlus EOF )
            // InternalTaskDSL.g:430:1: ruleExpressionPlus EOF
            {
             before(grammarAccess.getExpressionPlusRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionPlus();

            state._fsp--;

             after(grammarAccess.getExpressionPlusRule()); 
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
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalTaskDSL.g:437:1: ruleExpressionPlus : ( ( rule__ExpressionPlus__Group__0 ) ) ;
    public final void ruleExpressionPlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:441:2: ( ( ( rule__ExpressionPlus__Group__0 ) ) )
            // InternalTaskDSL.g:442:2: ( ( rule__ExpressionPlus__Group__0 ) )
            {
            // InternalTaskDSL.g:442:2: ( ( rule__ExpressionPlus__Group__0 ) )
            // InternalTaskDSL.g:443:3: ( rule__ExpressionPlus__Group__0 )
            {
             before(grammarAccess.getExpressionPlusAccess().getGroup()); 
            // InternalTaskDSL.g:444:3: ( rule__ExpressionPlus__Group__0 )
            // InternalTaskDSL.g:444:4: rule__ExpressionPlus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionPlusAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalTaskDSL.g:453:1: entryRuleExpressionLevel5 : ruleExpressionLevel5 EOF ;
    public final void entryRuleExpressionLevel5() throws RecognitionException {
        try {
            // InternalTaskDSL.g:454:1: ( ruleExpressionLevel5 EOF )
            // InternalTaskDSL.g:455:1: ruleExpressionLevel5 EOF
            {
             before(grammarAccess.getExpressionLevel5Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionLevel5();

            state._fsp--;

             after(grammarAccess.getExpressionLevel5Rule()); 
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
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalTaskDSL.g:462:1: ruleExpressionLevel5 : ( ( rule__ExpressionLevel5__Alternatives ) ) ;
    public final void ruleExpressionLevel5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:466:2: ( ( ( rule__ExpressionLevel5__Alternatives ) ) )
            // InternalTaskDSL.g:467:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            {
            // InternalTaskDSL.g:467:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            // InternalTaskDSL.g:468:3: ( rule__ExpressionLevel5__Alternatives )
            {
             before(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
            // InternalTaskDSL.g:469:3: ( rule__ExpressionLevel5__Alternatives )
            // InternalTaskDSL.g:469:4: rule__ExpressionLevel5__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel5Access().getAlternatives()); 

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
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalTaskDSL.g:478:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalTaskDSL.g:479:1: ( ruleExpressionBracket EOF )
            // InternalTaskDSL.g:480:1: ruleExpressionBracket EOF
            {
             before(grammarAccess.getExpressionBracketRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionBracket();

            state._fsp--;

             after(grammarAccess.getExpressionBracketRule()); 
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
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalTaskDSL.g:487:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:491:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalTaskDSL.g:492:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalTaskDSL.g:492:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalTaskDSL.g:493:3: ( rule__ExpressionBracket__Group__0 )
            {
             before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            // InternalTaskDSL.g:494:3: ( rule__ExpressionBracket__Group__0 )
            // InternalTaskDSL.g:494:4: rule__ExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBracketAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalTaskDSL.g:503:1: entryRuleExpressionConstantInt : ruleExpressionConstantInt EOF ;
    public final void entryRuleExpressionConstantInt() throws RecognitionException {
        try {
            // InternalTaskDSL.g:504:1: ( ruleExpressionConstantInt EOF )
            // InternalTaskDSL.g:505:1: ruleExpressionConstantInt EOF
            {
             before(grammarAccess.getExpressionConstantIntRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionConstantInt();

            state._fsp--;

             after(grammarAccess.getExpressionConstantIntRule()); 
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
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalTaskDSL.g:512:1: ruleExpressionConstantInt : ( ( rule__ExpressionConstantInt__ValueAssignment ) ) ;
    public final void ruleExpressionConstantInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:516:2: ( ( ( rule__ExpressionConstantInt__ValueAssignment ) ) )
            // InternalTaskDSL.g:517:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            {
            // InternalTaskDSL.g:517:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            // InternalTaskDSL.g:518:3: ( rule__ExpressionConstantInt__ValueAssignment )
            {
             before(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
            // InternalTaskDSL.g:519:3: ( rule__ExpressionConstantInt__ValueAssignment )
            // InternalTaskDSL.g:519:4: rule__ExpressionConstantInt__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionConstantInt__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleExpressionBalance"
    // InternalTaskDSL.g:528:1: entryRuleExpressionBalance : ruleExpressionBalance EOF ;
    public final void entryRuleExpressionBalance() throws RecognitionException {
        try {
            // InternalTaskDSL.g:529:1: ( ruleExpressionBalance EOF )
            // InternalTaskDSL.g:530:1: ruleExpressionBalance EOF
            {
             before(grammarAccess.getExpressionBalanceRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressionBalance();

            state._fsp--;

             after(grammarAccess.getExpressionBalanceRule()); 
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
    // $ANTLR end "entryRuleExpressionBalance"


    // $ANTLR start "ruleExpressionBalance"
    // InternalTaskDSL.g:537:1: ruleExpressionBalance : ( ( rule__ExpressionBalance__ValueAssignment ) ) ;
    public final void ruleExpressionBalance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:541:2: ( ( ( rule__ExpressionBalance__ValueAssignment ) ) )
            // InternalTaskDSL.g:542:2: ( ( rule__ExpressionBalance__ValueAssignment ) )
            {
            // InternalTaskDSL.g:542:2: ( ( rule__ExpressionBalance__ValueAssignment ) )
            // InternalTaskDSL.g:543:3: ( rule__ExpressionBalance__ValueAssignment )
            {
             before(grammarAccess.getExpressionBalanceAccess().getValueAssignment()); 
            // InternalTaskDSL.g:544:3: ( rule__ExpressionBalance__ValueAssignment )
            // InternalTaskDSL.g:544:4: rule__ExpressionBalance__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBalance__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBalanceAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleExpressionBalance"


    // $ANTLR start "ruleTimeUnit"
    // InternalTaskDSL.g:553:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:557:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalTaskDSL.g:558:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalTaskDSL.g:558:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalTaskDSL.g:559:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalTaskDSL.g:560:3: ( rule__TimeUnit__Alternatives )
            // InternalTaskDSL.g:560:4: rule__TimeUnit__Alternatives
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


    // $ANTLR start "ruleBalance"
    // InternalTaskDSL.g:569:1: ruleBalance : ( ( 'balance' ) ) ;
    public final void ruleBalance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:573:1: ( ( ( 'balance' ) ) )
            // InternalTaskDSL.g:574:2: ( ( 'balance' ) )
            {
            // InternalTaskDSL.g:574:2: ( ( 'balance' ) )
            // InternalTaskDSL.g:575:3: ( 'balance' )
            {
             before(grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration()); 
            // InternalTaskDSL.g:576:3: ( 'balance' )
            // InternalTaskDSL.g:576:4: 'balance'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleBalance"


    // $ANTLR start "rule__Planning__Alternatives_3"
    // InternalTaskDSL.g:584:1: rule__Planning__Alternatives_3 : ( ( ( rule__Planning__PersonsAssignment_3_0 ) ) | ( ( rule__Planning__TasksAssignment_3_1 ) ) );
    public final void rule__Planning__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:588:1: ( ( ( rule__Planning__PersonsAssignment_3_0 ) ) | ( ( rule__Planning__TasksAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:589:2: ( ( rule__Planning__PersonsAssignment_3_0 ) )
                    {
                    // InternalTaskDSL.g:589:2: ( ( rule__Planning__PersonsAssignment_3_0 ) )
                    // InternalTaskDSL.g:590:3: ( rule__Planning__PersonsAssignment_3_0 )
                    {
                     before(grammarAccess.getPlanningAccess().getPersonsAssignment_3_0()); 
                    // InternalTaskDSL.g:591:3: ( rule__Planning__PersonsAssignment_3_0 )
                    // InternalTaskDSL.g:591:4: rule__Planning__PersonsAssignment_3_0
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
                    // InternalTaskDSL.g:595:2: ( ( rule__Planning__TasksAssignment_3_1 ) )
                    {
                    // InternalTaskDSL.g:595:2: ( ( rule__Planning__TasksAssignment_3_1 ) )
                    // InternalTaskDSL.g:596:3: ( rule__Planning__TasksAssignment_3_1 )
                    {
                     before(grammarAccess.getPlanningAccess().getTasksAssignment_3_1()); 
                    // InternalTaskDSL.g:597:3: ( rule__Planning__TasksAssignment_3_1 )
                    // InternalTaskDSL.g:597:4: rule__Planning__TasksAssignment_3_1
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
    // InternalTaskDSL.g:605:1: rule__Action__Alternatives : ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:609:1: ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
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
                    // InternalTaskDSL.g:610:2: ( ruleLunchAction )
                    {
                    // InternalTaskDSL.g:610:2: ( ruleLunchAction )
                    // InternalTaskDSL.g:611:3: ruleLunchAction
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
                    // InternalTaskDSL.g:616:2: ( ruleMeetingAction )
                    {
                    // InternalTaskDSL.g:616:2: ( ruleMeetingAction )
                    // InternalTaskDSL.g:617:3: ruleMeetingAction
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
                    // InternalTaskDSL.g:622:2: ( rulePaperAction )
                    {
                    // InternalTaskDSL.g:622:2: ( rulePaperAction )
                    // InternalTaskDSL.g:623:3: rulePaperAction
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
                    // InternalTaskDSL.g:628:2: ( rulePaymentAction )
                    {
                    // InternalTaskDSL.g:628:2: ( rulePaymentAction )
                    // InternalTaskDSL.g:629:3: rulePaymentAction
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


    // $ANTLR start "rule__ExpressionLevel1__Alternatives_1"
    // InternalTaskDSL.g:638:1: rule__ExpressionLevel1__Alternatives_1 : ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) );
    public final void rule__ExpressionLevel1__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:642:1: ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaskDSL.g:643:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    {
                    // InternalTaskDSL.g:643:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    // InternalTaskDSL.g:644:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    // InternalTaskDSL.g:645:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    // InternalTaskDSL.g:645:4: rule__ExpressionLevel1__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:649:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    {
                    // InternalTaskDSL.g:649:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    // InternalTaskDSL.g:650:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
                    // InternalTaskDSL.g:651:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    // InternalTaskDSL.g:651:4: rule__ExpressionLevel1__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 

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
    // $ANTLR end "rule__ExpressionLevel1__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel2__Alternatives_1"
    // InternalTaskDSL.g:659:1: rule__ExpressionLevel2__Alternatives_1 : ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) );
    public final void rule__ExpressionLevel2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:663:1: ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 12:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:664:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    {
                    // InternalTaskDSL.g:664:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    // InternalTaskDSL.g:665:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    // InternalTaskDSL.g:666:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    // InternalTaskDSL.g:666:4: rule__ExpressionLevel2__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:670:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    {
                    // InternalTaskDSL.g:670:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    // InternalTaskDSL.g:671:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    // InternalTaskDSL.g:672:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    // InternalTaskDSL.g:672:4: rule__ExpressionLevel2__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:676:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    {
                    // InternalTaskDSL.g:676:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    // InternalTaskDSL.g:677:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    // InternalTaskDSL.g:678:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    // InternalTaskDSL.g:678:4: rule__ExpressionLevel2__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:682:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    {
                    // InternalTaskDSL.g:682:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    // InternalTaskDSL.g:683:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    {
                     before(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    // InternalTaskDSL.g:684:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    // InternalTaskDSL.g:684:4: rule__ExpressionLevel2__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDSL.g:688:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    {
                    // InternalTaskDSL.g:688:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    // InternalTaskDSL.g:689:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    {
                     before(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
                    // InternalTaskDSL.g:690:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    // InternalTaskDSL.g:690:4: rule__ExpressionLevel2__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel4__Alternatives"
    // InternalTaskDSL.g:698:1: rule__ExpressionLevel4__Alternatives : ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) );
    public final void rule__ExpressionLevel4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:702:1: ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
            case 11:
            case 34:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTaskDSL.g:703:2: ( ruleExpressionMinus )
                    {
                    // InternalTaskDSL.g:703:2: ( ruleExpressionMinus )
                    // InternalTaskDSL.g:704:3: ruleExpressionMinus
                    {
                     before(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionMinus();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:709:2: ( ruleExpressionPlus )
                    {
                    // InternalTaskDSL.g:709:2: ( ruleExpressionPlus )
                    // InternalTaskDSL.g:710:3: ruleExpressionPlus
                    {
                     before(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionPlus();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:715:2: ( ruleExpressionLevel5 )
                    {
                    // InternalTaskDSL.g:715:2: ( ruleExpressionLevel5 )
                    // InternalTaskDSL.g:716:3: ruleExpressionLevel5
                    {
                     before(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionLevel5();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 

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
    // $ANTLR end "rule__ExpressionLevel4__Alternatives"


    // $ANTLR start "rule__ExpressionLevel5__Alternatives"
    // InternalTaskDSL.g:725:1: rule__ExpressionLevel5__Alternatives : ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) | ( ruleExpressionBalance ) );
    public final void rule__ExpressionLevel5__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:729:1: ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) | ( ruleExpressionBalance ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case 11:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTaskDSL.g:730:2: ( ruleExpressionBracket )
                    {
                    // InternalTaskDSL.g:730:2: ( ruleExpressionBracket )
                    // InternalTaskDSL.g:731:3: ruleExpressionBracket
                    {
                     before(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionBracket();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:736:2: ( ruleExpressionConstantInt )
                    {
                    // InternalTaskDSL.g:736:2: ( ruleExpressionConstantInt )
                    // InternalTaskDSL.g:737:3: ruleExpressionConstantInt
                    {
                     before(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionConstantInt();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:742:2: ( ruleExpressionBalance )
                    {
                    // InternalTaskDSL.g:742:2: ( ruleExpressionBalance )
                    // InternalTaskDSL.g:743:3: ruleExpressionBalance
                    {
                     before(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpressionBalance();

                    state._fsp--;

                     after(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2()); 

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
    // $ANTLR end "rule__ExpressionLevel5__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalTaskDSL.g:752:1: rule__TimeUnit__Alternatives : ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:756:1: ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTaskDSL.g:757:2: ( ( 'min' ) )
                    {
                    // InternalTaskDSL.g:757:2: ( ( 'min' ) )
                    // InternalTaskDSL.g:758:3: ( 'min' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 
                    // InternalTaskDSL.g:759:3: ( 'min' )
                    // InternalTaskDSL.g:759:4: 'min'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:763:2: ( ( 'hour' ) )
                    {
                    // InternalTaskDSL.g:763:2: ( ( 'hour' ) )
                    // InternalTaskDSL.g:764:3: ( 'hour' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 
                    // InternalTaskDSL.g:765:3: ( 'hour' )
                    // InternalTaskDSL.g:765:4: 'hour'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:769:2: ( ( 'day' ) )
                    {
                    // InternalTaskDSL.g:769:2: ( ( 'day' ) )
                    // InternalTaskDSL.g:770:3: ( 'day' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 
                    // InternalTaskDSL.g:771:3: ( 'day' )
                    // InternalTaskDSL.g:771:4: 'day'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:775:2: ( ( 'week' ) )
                    {
                    // InternalTaskDSL.g:775:2: ( ( 'week' ) )
                    // InternalTaskDSL.g:776:3: ( 'week' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 
                    // InternalTaskDSL.g:777:3: ( 'week' )
                    // InternalTaskDSL.g:777:4: 'week'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalTaskDSL.g:785:1: rule__Planning__Group__0 : rule__Planning__Group__0__Impl rule__Planning__Group__1 ;
    public final void rule__Planning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:789:1: ( rule__Planning__Group__0__Impl rule__Planning__Group__1 )
            // InternalTaskDSL.g:790:2: rule__Planning__Group__0__Impl rule__Planning__Group__1
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
    // InternalTaskDSL.g:797:1: rule__Planning__Group__0__Impl : ( 'Planning' ) ;
    public final void rule__Planning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:801:1: ( ( 'Planning' ) )
            // InternalTaskDSL.g:802:1: ( 'Planning' )
            {
            // InternalTaskDSL.g:802:1: ( 'Planning' )
            // InternalTaskDSL.g:803:2: 'Planning'
            {
             before(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTaskDSL.g:812:1: rule__Planning__Group__1 : rule__Planning__Group__1__Impl rule__Planning__Group__2 ;
    public final void rule__Planning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:816:1: ( rule__Planning__Group__1__Impl rule__Planning__Group__2 )
            // InternalTaskDSL.g:817:2: rule__Planning__Group__1__Impl rule__Planning__Group__2
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
    // InternalTaskDSL.g:824:1: rule__Planning__Group__1__Impl : ( ( rule__Planning__NameAssignment_1 ) ) ;
    public final void rule__Planning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:828:1: ( ( ( rule__Planning__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:829:1: ( ( rule__Planning__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:829:1: ( ( rule__Planning__NameAssignment_1 ) )
            // InternalTaskDSL.g:830:2: ( rule__Planning__NameAssignment_1 )
            {
             before(grammarAccess.getPlanningAccess().getNameAssignment_1()); 
            // InternalTaskDSL.g:831:2: ( rule__Planning__NameAssignment_1 )
            // InternalTaskDSL.g:831:3: rule__Planning__NameAssignment_1
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
    // InternalTaskDSL.g:839:1: rule__Planning__Group__2 : rule__Planning__Group__2__Impl rule__Planning__Group__3 ;
    public final void rule__Planning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:843:1: ( rule__Planning__Group__2__Impl rule__Planning__Group__3 )
            // InternalTaskDSL.g:844:2: rule__Planning__Group__2__Impl rule__Planning__Group__3
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
    // InternalTaskDSL.g:851:1: rule__Planning__Group__2__Impl : ( ( rule__Planning__AnonymousAssignment_2 )? ) ;
    public final void rule__Planning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:855:1: ( ( ( rule__Planning__AnonymousAssignment_2 )? ) )
            // InternalTaskDSL.g:856:1: ( ( rule__Planning__AnonymousAssignment_2 )? )
            {
            // InternalTaskDSL.g:856:1: ( ( rule__Planning__AnonymousAssignment_2 )? )
            // InternalTaskDSL.g:857:2: ( rule__Planning__AnonymousAssignment_2 )?
            {
             before(grammarAccess.getPlanningAccess().getAnonymousAssignment_2()); 
            // InternalTaskDSL.g:858:2: ( rule__Planning__AnonymousAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDSL.g:858:3: rule__Planning__AnonymousAssignment_2
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
    // InternalTaskDSL.g:866:1: rule__Planning__Group__3 : rule__Planning__Group__3__Impl ;
    public final void rule__Planning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:870:1: ( rule__Planning__Group__3__Impl )
            // InternalTaskDSL.g:871:2: rule__Planning__Group__3__Impl
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
    // InternalTaskDSL.g:877:1: rule__Planning__Group__3__Impl : ( ( rule__Planning__Alternatives_3 )* ) ;
    public final void rule__Planning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:881:1: ( ( ( rule__Planning__Alternatives_3 )* ) )
            // InternalTaskDSL.g:882:1: ( ( rule__Planning__Alternatives_3 )* )
            {
            // InternalTaskDSL.g:882:1: ( ( rule__Planning__Alternatives_3 )* )
            // InternalTaskDSL.g:883:2: ( rule__Planning__Alternatives_3 )*
            {
             before(grammarAccess.getPlanningAccess().getAlternatives_3()); 
            // InternalTaskDSL.g:884:2: ( rule__Planning__Alternatives_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=17 && LA9_0<=18)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTaskDSL.g:884:3: rule__Planning__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Planning__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalTaskDSL.g:893:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:897:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalTaskDSL.g:898:2: rule__Person__Group__0__Impl rule__Person__Group__1
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
    // InternalTaskDSL.g:905:1: rule__Person__Group__0__Impl : ( 'Person:' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:909:1: ( ( 'Person:' ) )
            // InternalTaskDSL.g:910:1: ( 'Person:' )
            {
            // InternalTaskDSL.g:910:1: ( 'Person:' )
            // InternalTaskDSL.g:911:2: 'Person:'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTaskDSL.g:920:1: rule__Person__Group__1 : rule__Person__Group__1__Impl ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:924:1: ( rule__Person__Group__1__Impl )
            // InternalTaskDSL.g:925:2: rule__Person__Group__1__Impl
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
    // InternalTaskDSL.g:931:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:935:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:936:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:936:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalTaskDSL.g:937:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalTaskDSL.g:938:2: ( rule__Person__NameAssignment_1 )
            // InternalTaskDSL.g:938:3: rule__Person__NameAssignment_1
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
    // InternalTaskDSL.g:947:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:951:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalTaskDSL.g:952:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalTaskDSL.g:959:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:963:1: ( ( 'Task:' ) )
            // InternalTaskDSL.g:964:1: ( 'Task:' )
            {
            // InternalTaskDSL.g:964:1: ( 'Task:' )
            // InternalTaskDSL.g:965:2: 'Task:'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalTaskDSL.g:974:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:978:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalTaskDSL.g:979:2: rule__Task__Group__1__Impl rule__Task__Group__2
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
    // InternalTaskDSL.g:986:1: rule__Task__Group__1__Impl : ( ( rule__Task__ActionAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:990:1: ( ( ( rule__Task__ActionAssignment_1 ) ) )
            // InternalTaskDSL.g:991:1: ( ( rule__Task__ActionAssignment_1 ) )
            {
            // InternalTaskDSL.g:991:1: ( ( rule__Task__ActionAssignment_1 ) )
            // InternalTaskDSL.g:992:2: ( rule__Task__ActionAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getActionAssignment_1()); 
            // InternalTaskDSL.g:993:2: ( rule__Task__ActionAssignment_1 )
            // InternalTaskDSL.g:993:3: rule__Task__ActionAssignment_1
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
    // InternalTaskDSL.g:1001:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1005:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalTaskDSL.g:1006:2: rule__Task__Group__2__Impl rule__Task__Group__3
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
    // InternalTaskDSL.g:1013:1: rule__Task__Group__2__Impl : ( 'persons:' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1017:1: ( ( 'persons:' ) )
            // InternalTaskDSL.g:1018:1: ( 'persons:' )
            {
            // InternalTaskDSL.g:1018:1: ( 'persons:' )
            // InternalTaskDSL.g:1019:2: 'persons:'
            {
             before(grammarAccess.getTaskAccess().getPersonsKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalTaskDSL.g:1028:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1032:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalTaskDSL.g:1033:2: rule__Task__Group__3__Impl rule__Task__Group__4
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
    // InternalTaskDSL.g:1040:1: rule__Task__Group__3__Impl : ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1044:1: ( ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) ) )
            // InternalTaskDSL.g:1045:1: ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) )
            {
            // InternalTaskDSL.g:1045:1: ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) )
            // InternalTaskDSL.g:1046:2: ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* )
            {
            // InternalTaskDSL.g:1046:2: ( ( rule__Task__PersonsAssignment_3 ) )
            // InternalTaskDSL.g:1047:3: ( rule__Task__PersonsAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            // InternalTaskDSL.g:1048:3: ( rule__Task__PersonsAssignment_3 )
            // InternalTaskDSL.g:1048:4: rule__Task__PersonsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Task__PersonsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 

            }

            // InternalTaskDSL.g:1051:2: ( ( rule__Task__PersonsAssignment_3 )* )
            // InternalTaskDSL.g:1052:3: ( rule__Task__PersonsAssignment_3 )*
            {
             before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            // InternalTaskDSL.g:1053:3: ( rule__Task__PersonsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTaskDSL.g:1053:4: rule__Task__PersonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Task__PersonsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalTaskDSL.g:1062:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1066:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalTaskDSL.g:1067:2: rule__Task__Group__4__Impl rule__Task__Group__5
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
    // InternalTaskDSL.g:1074:1: rule__Task__Group__4__Impl : ( 'priority:' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1078:1: ( ( 'priority:' ) )
            // InternalTaskDSL.g:1079:1: ( 'priority:' )
            {
            // InternalTaskDSL.g:1079:1: ( 'priority:' )
            // InternalTaskDSL.g:1080:2: 'priority:'
            {
             before(grammarAccess.getTaskAccess().getPriorityKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalTaskDSL.g:1089:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1093:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalTaskDSL.g:1094:2: rule__Task__Group__5__Impl rule__Task__Group__6
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
    // InternalTaskDSL.g:1101:1: rule__Task__Group__5__Impl : ( ( rule__Task__PrioAssignment_5 ) ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1105:1: ( ( ( rule__Task__PrioAssignment_5 ) ) )
            // InternalTaskDSL.g:1106:1: ( ( rule__Task__PrioAssignment_5 ) )
            {
            // InternalTaskDSL.g:1106:1: ( ( rule__Task__PrioAssignment_5 ) )
            // InternalTaskDSL.g:1107:2: ( rule__Task__PrioAssignment_5 )
            {
             before(grammarAccess.getTaskAccess().getPrioAssignment_5()); 
            // InternalTaskDSL.g:1108:2: ( rule__Task__PrioAssignment_5 )
            // InternalTaskDSL.g:1108:3: rule__Task__PrioAssignment_5
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
    // InternalTaskDSL.g:1116:1: rule__Task__Group__6 : rule__Task__Group__6__Impl ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1120:1: ( rule__Task__Group__6__Impl )
            // InternalTaskDSL.g:1121:2: rule__Task__Group__6__Impl
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
    // InternalTaskDSL.g:1127:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1131:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // InternalTaskDSL.g:1132:1: ( ( rule__Task__Group_6__0 )? )
            {
            // InternalTaskDSL.g:1132:1: ( ( rule__Task__Group_6__0 )? )
            // InternalTaskDSL.g:1133:2: ( rule__Task__Group_6__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalTaskDSL.g:1134:2: ( rule__Task__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTaskDSL.g:1134:3: rule__Task__Group_6__0
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
    // InternalTaskDSL.g:1143:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1147:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalTaskDSL.g:1148:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
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
    // InternalTaskDSL.g:1155:1: rule__Task__Group_6__0__Impl : ( 'duration:' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1159:1: ( ( 'duration:' ) )
            // InternalTaskDSL.g:1160:1: ( 'duration:' )
            {
            // InternalTaskDSL.g:1160:1: ( 'duration:' )
            // InternalTaskDSL.g:1161:2: 'duration:'
            {
             before(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTaskDSL.g:1170:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1174:1: ( rule__Task__Group_6__1__Impl )
            // InternalTaskDSL.g:1175:2: rule__Task__Group_6__1__Impl
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
    // InternalTaskDSL.g:1181:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__DurationAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1185:1: ( ( ( rule__Task__DurationAssignment_6_1 ) ) )
            // InternalTaskDSL.g:1186:1: ( ( rule__Task__DurationAssignment_6_1 ) )
            {
            // InternalTaskDSL.g:1186:1: ( ( rule__Task__DurationAssignment_6_1 ) )
            // InternalTaskDSL.g:1187:2: ( rule__Task__DurationAssignment_6_1 )
            {
             before(grammarAccess.getTaskAccess().getDurationAssignment_6_1()); 
            // InternalTaskDSL.g:1188:2: ( rule__Task__DurationAssignment_6_1 )
            // InternalTaskDSL.g:1188:3: rule__Task__DurationAssignment_6_1
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
    // InternalTaskDSL.g:1197:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1201:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalTaskDSL.g:1202:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
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
    // InternalTaskDSL.g:1209:1: rule__Duration__Group__0__Impl : ( ( rule__Duration__DlAssignment_0 ) ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1213:1: ( ( ( rule__Duration__DlAssignment_0 ) ) )
            // InternalTaskDSL.g:1214:1: ( ( rule__Duration__DlAssignment_0 ) )
            {
            // InternalTaskDSL.g:1214:1: ( ( rule__Duration__DlAssignment_0 ) )
            // InternalTaskDSL.g:1215:2: ( rule__Duration__DlAssignment_0 )
            {
             before(grammarAccess.getDurationAccess().getDlAssignment_0()); 
            // InternalTaskDSL.g:1216:2: ( rule__Duration__DlAssignment_0 )
            // InternalTaskDSL.g:1216:3: rule__Duration__DlAssignment_0
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
    // InternalTaskDSL.g:1224:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1228:1: ( rule__Duration__Group__1__Impl )
            // InternalTaskDSL.g:1229:2: rule__Duration__Group__1__Impl
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
    // InternalTaskDSL.g:1235:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__UnitAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1239:1: ( ( ( rule__Duration__UnitAssignment_1 ) ) )
            // InternalTaskDSL.g:1240:1: ( ( rule__Duration__UnitAssignment_1 ) )
            {
            // InternalTaskDSL.g:1240:1: ( ( rule__Duration__UnitAssignment_1 ) )
            // InternalTaskDSL.g:1241:2: ( rule__Duration__UnitAssignment_1 )
            {
             before(grammarAccess.getDurationAccess().getUnitAssignment_1()); 
            // InternalTaskDSL.g:1242:2: ( rule__Duration__UnitAssignment_1 )
            // InternalTaskDSL.g:1242:3: rule__Duration__UnitAssignment_1
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
    // InternalTaskDSL.g:1251:1: rule__LunchAction__Group__0 : rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 ;
    public final void rule__LunchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1255:1: ( rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 )
            // InternalTaskDSL.g:1256:2: rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1
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
    // InternalTaskDSL.g:1263:1: rule__LunchAction__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__LunchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1267:1: ( ( 'Lunch' ) )
            // InternalTaskDSL.g:1268:1: ( 'Lunch' )
            {
            // InternalTaskDSL.g:1268:1: ( 'Lunch' )
            // InternalTaskDSL.g:1269:2: 'Lunch'
            {
             before(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTaskDSL.g:1278:1: rule__LunchAction__Group__1 : rule__LunchAction__Group__1__Impl ;
    public final void rule__LunchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1282:1: ( rule__LunchAction__Group__1__Impl )
            // InternalTaskDSL.g:1283:2: rule__LunchAction__Group__1__Impl
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
    // InternalTaskDSL.g:1289:1: rule__LunchAction__Group__1__Impl : ( ( rule__LunchAction__LocationAssignment_1 ) ) ;
    public final void rule__LunchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1293:1: ( ( ( rule__LunchAction__LocationAssignment_1 ) ) )
            // InternalTaskDSL.g:1294:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            {
            // InternalTaskDSL.g:1294:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            // InternalTaskDSL.g:1295:2: ( rule__LunchAction__LocationAssignment_1 )
            {
             before(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 
            // InternalTaskDSL.g:1296:2: ( rule__LunchAction__LocationAssignment_1 )
            // InternalTaskDSL.g:1296:3: rule__LunchAction__LocationAssignment_1
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
    // InternalTaskDSL.g:1305:1: rule__MeetingAction__Group__0 : rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 ;
    public final void rule__MeetingAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1309:1: ( rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 )
            // InternalTaskDSL.g:1310:2: rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1
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
    // InternalTaskDSL.g:1317:1: rule__MeetingAction__Group__0__Impl : ( 'Meeting' ) ;
    public final void rule__MeetingAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1321:1: ( ( 'Meeting' ) )
            // InternalTaskDSL.g:1322:1: ( 'Meeting' )
            {
            // InternalTaskDSL.g:1322:1: ( 'Meeting' )
            // InternalTaskDSL.g:1323:2: 'Meeting'
            {
             before(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalTaskDSL.g:1332:1: rule__MeetingAction__Group__1 : rule__MeetingAction__Group__1__Impl ;
    public final void rule__MeetingAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1336:1: ( rule__MeetingAction__Group__1__Impl )
            // InternalTaskDSL.g:1337:2: rule__MeetingAction__Group__1__Impl
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
    // InternalTaskDSL.g:1343:1: rule__MeetingAction__Group__1__Impl : ( ( rule__MeetingAction__TopicAssignment_1 ) ) ;
    public final void rule__MeetingAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1347:1: ( ( ( rule__MeetingAction__TopicAssignment_1 ) ) )
            // InternalTaskDSL.g:1348:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            {
            // InternalTaskDSL.g:1348:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            // InternalTaskDSL.g:1349:2: ( rule__MeetingAction__TopicAssignment_1 )
            {
             before(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 
            // InternalTaskDSL.g:1350:2: ( rule__MeetingAction__TopicAssignment_1 )
            // InternalTaskDSL.g:1350:3: rule__MeetingAction__TopicAssignment_1
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
    // InternalTaskDSL.g:1359:1: rule__PaperAction__Group__0 : rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 ;
    public final void rule__PaperAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1363:1: ( rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 )
            // InternalTaskDSL.g:1364:2: rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1
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
    // InternalTaskDSL.g:1371:1: rule__PaperAction__Group__0__Impl : ( 'Report' ) ;
    public final void rule__PaperAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1375:1: ( ( 'Report' ) )
            // InternalTaskDSL.g:1376:1: ( 'Report' )
            {
            // InternalTaskDSL.g:1376:1: ( 'Report' )
            // InternalTaskDSL.g:1377:2: 'Report'
            {
             before(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTaskDSL.g:1386:1: rule__PaperAction__Group__1 : rule__PaperAction__Group__1__Impl ;
    public final void rule__PaperAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1390:1: ( rule__PaperAction__Group__1__Impl )
            // InternalTaskDSL.g:1391:2: rule__PaperAction__Group__1__Impl
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
    // InternalTaskDSL.g:1397:1: rule__PaperAction__Group__1__Impl : ( ( rule__PaperAction__ReportAssignment_1 ) ) ;
    public final void rule__PaperAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1401:1: ( ( ( rule__PaperAction__ReportAssignment_1 ) ) )
            // InternalTaskDSL.g:1402:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            {
            // InternalTaskDSL.g:1402:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            // InternalTaskDSL.g:1403:2: ( rule__PaperAction__ReportAssignment_1 )
            {
             before(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 
            // InternalTaskDSL.g:1404:2: ( rule__PaperAction__ReportAssignment_1 )
            // InternalTaskDSL.g:1404:3: rule__PaperAction__ReportAssignment_1
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
    // InternalTaskDSL.g:1413:1: rule__PaymentAction__Group__0 : rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 ;
    public final void rule__PaymentAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1417:1: ( rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 )
            // InternalTaskDSL.g:1418:2: rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalTaskDSL.g:1425:1: rule__PaymentAction__Group__0__Impl : ( 'Pay' ) ;
    public final void rule__PaymentAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1429:1: ( ( 'Pay' ) )
            // InternalTaskDSL.g:1430:1: ( 'Pay' )
            {
            // InternalTaskDSL.g:1430:1: ( 'Pay' )
            // InternalTaskDSL.g:1431:2: 'Pay'
            {
             before(grammarAccess.getPaymentActionAccess().getPayKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTaskDSL.g:1440:1: rule__PaymentAction__Group__1 : rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 ;
    public final void rule__PaymentAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1444:1: ( rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 )
            // InternalTaskDSL.g:1445:2: rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTaskDSL.g:1452:1: rule__PaymentAction__Group__1__Impl : ( ( rule__PaymentAction__AmountAssignment_1 ) ) ;
    public final void rule__PaymentAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1456:1: ( ( ( rule__PaymentAction__AmountAssignment_1 ) ) )
            // InternalTaskDSL.g:1457:1: ( ( rule__PaymentAction__AmountAssignment_1 ) )
            {
            // InternalTaskDSL.g:1457:1: ( ( rule__PaymentAction__AmountAssignment_1 ) )
            // InternalTaskDSL.g:1458:2: ( rule__PaymentAction__AmountAssignment_1 )
            {
             before(grammarAccess.getPaymentActionAccess().getAmountAssignment_1()); 
            // InternalTaskDSL.g:1459:2: ( rule__PaymentAction__AmountAssignment_1 )
            // InternalTaskDSL.g:1459:3: rule__PaymentAction__AmountAssignment_1
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
    // InternalTaskDSL.g:1467:1: rule__PaymentAction__Group__2 : rule__PaymentAction__Group__2__Impl ;
    public final void rule__PaymentAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1471:1: ( rule__PaymentAction__Group__2__Impl )
            // InternalTaskDSL.g:1472:2: rule__PaymentAction__Group__2__Impl
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
    // InternalTaskDSL.g:1478:1: rule__PaymentAction__Group__2__Impl : ( 'euro' ) ;
    public final void rule__PaymentAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1482:1: ( ( 'euro' ) )
            // InternalTaskDSL.g:1483:1: ( 'euro' )
            {
            // InternalTaskDSL.g:1483:1: ( 'euro' )
            // InternalTaskDSL.g:1484:2: 'euro'
            {
             before(grammarAccess.getPaymentActionAccess().getEuroKeyword_2()); 
            match(input,26,FOLLOW_2); 
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


    // $ANTLR start "rule__ExpressionLevel1__Group__0"
    // InternalTaskDSL.g:1494:1: rule__ExpressionLevel1__Group__0 : rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 ;
    public final void rule__ExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1498:1: ( rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 )
            // InternalTaskDSL.g:1499:2: rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionLevel1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1();

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
    // $ANTLR end "rule__ExpressionLevel1__Group__0"


    // $ANTLR start "rule__ExpressionLevel1__Group__0__Impl"
    // InternalTaskDSL.g:1506:1: rule__ExpressionLevel1__Group__0__Impl : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1510:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:1511:1: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:1511:1: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:1512:2: ruleExpressionLevel2
            {
             before(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;

             after(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 

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
    // $ANTLR end "rule__ExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__1"
    // InternalTaskDSL.g:1521:1: rule__ExpressionLevel1__Group__1 : rule__ExpressionLevel1__Group__1__Impl ;
    public final void rule__ExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1525:1: ( rule__ExpressionLevel1__Group__1__Impl )
            // InternalTaskDSL.g:1526:2: rule__ExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionLevel1__Group__1"


    // $ANTLR start "rule__ExpressionLevel1__Group__1__Impl"
    // InternalTaskDSL.g:1532:1: rule__ExpressionLevel1__Group__1__Impl : ( ( rule__ExpressionLevel1__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1536:1: ( ( ( rule__ExpressionLevel1__Alternatives_1 )* ) )
            // InternalTaskDSL.g:1537:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            {
            // InternalTaskDSL.g:1537:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            // InternalTaskDSL.g:1538:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            {
             before(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
            // InternalTaskDSL.g:1539:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTaskDSL.g:1539:3: rule__ExpressionLevel1__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ExpressionLevel1__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 

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
    // $ANTLR end "rule__ExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0"
    // InternalTaskDSL.g:1548:1: rule__ExpressionLevel1__Group_1_0__0 : rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 ;
    public final void rule__ExpressionLevel1__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1552:1: ( rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 )
            // InternalTaskDSL.g:1553:2: rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel1__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__1();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0__Impl"
    // InternalTaskDSL.g:1560:1: rule__ExpressionLevel1__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1564:1: ( ( () ) )
            // InternalTaskDSL.g:1565:1: ( () )
            {
            // InternalTaskDSL.g:1565:1: ( () )
            // InternalTaskDSL.g:1566:2: ()
            {
             before(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            // InternalTaskDSL.g:1567:2: ()
            // InternalTaskDSL.g:1567:3: 
            {
            }

             after(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1"
    // InternalTaskDSL.g:1575:1: rule__ExpressionLevel1__Group_1_0__1 : rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 ;
    public final void rule__ExpressionLevel1__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1579:1: ( rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 )
            // InternalTaskDSL.g:1580:2: rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel1__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1__Impl"
    // InternalTaskDSL.g:1587:1: rule__ExpressionLevel1__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__ExpressionLevel1__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1591:1: ( ( '+' ) )
            // InternalTaskDSL.g:1592:1: ( '+' )
            {
            // InternalTaskDSL.g:1592:1: ( '+' )
            // InternalTaskDSL.g:1593:2: '+'
            {
             before(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2"
    // InternalTaskDSL.g:1602:1: rule__ExpressionLevel1__Group_1_0__2 : rule__ExpressionLevel1__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1606:1: ( rule__ExpressionLevel1__Group_1_0__2__Impl )
            // InternalTaskDSL.g:1607:2: rule__ExpressionLevel1__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2__Impl"
    // InternalTaskDSL.g:1613:1: rule__ExpressionLevel1__Group_1_0__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1617:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) )
            // InternalTaskDSL.g:1618:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            {
            // InternalTaskDSL.g:1618:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            // InternalTaskDSL.g:1619:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
            // InternalTaskDSL.g:1620:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            // InternalTaskDSL.g:1620:3: rule__ExpressionLevel1__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0"
    // InternalTaskDSL.g:1629:1: rule__ExpressionLevel1__Group_1_1__0 : rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 ;
    public final void rule__ExpressionLevel1__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1633:1: ( rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 )
            // InternalTaskDSL.g:1634:2: rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ExpressionLevel1__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__1();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0__Impl"
    // InternalTaskDSL.g:1641:1: rule__ExpressionLevel1__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1645:1: ( ( () ) )
            // InternalTaskDSL.g:1646:1: ( () )
            {
            // InternalTaskDSL.g:1646:1: ( () )
            // InternalTaskDSL.g:1647:2: ()
            {
             before(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            // InternalTaskDSL.g:1648:2: ()
            // InternalTaskDSL.g:1648:3: 
            {
            }

             after(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1"
    // InternalTaskDSL.g:1656:1: rule__ExpressionLevel1__Group_1_1__1 : rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 ;
    public final void rule__ExpressionLevel1__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1660:1: ( rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 )
            // InternalTaskDSL.g:1661:2: rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel1__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1__Impl"
    // InternalTaskDSL.g:1668:1: rule__ExpressionLevel1__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__ExpressionLevel1__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1672:1: ( ( '-' ) )
            // InternalTaskDSL.g:1673:1: ( '-' )
            {
            // InternalTaskDSL.g:1673:1: ( '-' )
            // InternalTaskDSL.g:1674:2: '-'
            {
             before(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2"
    // InternalTaskDSL.g:1683:1: rule__ExpressionLevel1__Group_1_1__2 : rule__ExpressionLevel1__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1687:1: ( rule__ExpressionLevel1__Group_1_1__2__Impl )
            // InternalTaskDSL.g:1688:2: rule__ExpressionLevel1__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2__Impl"
    // InternalTaskDSL.g:1694:1: rule__ExpressionLevel1__Group_1_1__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1698:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) )
            // InternalTaskDSL.g:1699:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            {
            // InternalTaskDSL.g:1699:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            // InternalTaskDSL.g:1700:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
            // InternalTaskDSL.g:1701:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            // InternalTaskDSL.g:1701:3: rule__ExpressionLevel1__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__0"
    // InternalTaskDSL.g:1710:1: rule__ExpressionLevel2__Group__0 : rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 ;
    public final void rule__ExpressionLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1714:1: ( rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 )
            // InternalTaskDSL.g:1715:2: rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ExpressionLevel2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group__0"


    // $ANTLR start "rule__ExpressionLevel2__Group__0__Impl"
    // InternalTaskDSL.g:1722:1: rule__ExpressionLevel2__Group__0__Impl : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1726:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:1727:1: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:1727:1: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:1728:2: ruleExpressionLevel3
            {
             before(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__1"
    // InternalTaskDSL.g:1737:1: rule__ExpressionLevel2__Group__1 : rule__ExpressionLevel2__Group__1__Impl ;
    public final void rule__ExpressionLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1741:1: ( rule__ExpressionLevel2__Group__1__Impl )
            // InternalTaskDSL.g:1742:2: rule__ExpressionLevel2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group__1"


    // $ANTLR start "rule__ExpressionLevel2__Group__1__Impl"
    // InternalTaskDSL.g:1748:1: rule__ExpressionLevel2__Group__1__Impl : ( ( rule__ExpressionLevel2__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1752:1: ( ( ( rule__ExpressionLevel2__Alternatives_1 )* ) )
            // InternalTaskDSL.g:1753:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            {
            // InternalTaskDSL.g:1753:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            // InternalTaskDSL.g:1754:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            {
             before(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
            // InternalTaskDSL.g:1755:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12||(LA13_0>=29 && LA13_0<=32)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTaskDSL.g:1755:3: rule__ExpressionLevel2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ExpressionLevel2__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0"
    // InternalTaskDSL.g:1764:1: rule__ExpressionLevel2__Group_1_0__0 : rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 ;
    public final void rule__ExpressionLevel2__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1768:1: ( rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 )
            // InternalTaskDSL.g:1769:2: rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
            rule__ExpressionLevel2__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0__Impl"
    // InternalTaskDSL.g:1776:1: rule__ExpressionLevel2__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1780:1: ( ( () ) )
            // InternalTaskDSL.g:1781:1: ( () )
            {
            // InternalTaskDSL.g:1781:1: ( () )
            // InternalTaskDSL.g:1782:2: ()
            {
             before(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            // InternalTaskDSL.g:1783:2: ()
            // InternalTaskDSL.g:1783:3: 
            {
            }

             after(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1"
    // InternalTaskDSL.g:1791:1: rule__ExpressionLevel2__Group_1_0__1 : rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 ;
    public final void rule__ExpressionLevel2__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1795:1: ( rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 )
            // InternalTaskDSL.g:1796:2: rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel2__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1__Impl"
    // InternalTaskDSL.g:1803:1: rule__ExpressionLevel2__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__ExpressionLevel2__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1807:1: ( ( '*' ) )
            // InternalTaskDSL.g:1808:1: ( '*' )
            {
            // InternalTaskDSL.g:1808:1: ( '*' )
            // InternalTaskDSL.g:1809:2: '*'
            {
             before(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2"
    // InternalTaskDSL.g:1818:1: rule__ExpressionLevel2__Group_1_0__2 : rule__ExpressionLevel2__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1822:1: ( rule__ExpressionLevel2__Group_1_0__2__Impl )
            // InternalTaskDSL.g:1823:2: rule__ExpressionLevel2__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2__Impl"
    // InternalTaskDSL.g:1829:1: rule__ExpressionLevel2__Group_1_0__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1833:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) )
            // InternalTaskDSL.g:1834:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            {
            // InternalTaskDSL.g:1834:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            // InternalTaskDSL.g:1835:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
            // InternalTaskDSL.g:1836:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            // InternalTaskDSL.g:1836:3: rule__ExpressionLevel2__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0"
    // InternalTaskDSL.g:1845:1: rule__ExpressionLevel2__Group_1_1__0 : rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 ;
    public final void rule__ExpressionLevel2__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1849:1: ( rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 )
            // InternalTaskDSL.g:1850:2: rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__ExpressionLevel2__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0__Impl"
    // InternalTaskDSL.g:1857:1: rule__ExpressionLevel2__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1861:1: ( ( () ) )
            // InternalTaskDSL.g:1862:1: ( () )
            {
            // InternalTaskDSL.g:1862:1: ( () )
            // InternalTaskDSL.g:1863:2: ()
            {
             before(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            // InternalTaskDSL.g:1864:2: ()
            // InternalTaskDSL.g:1864:3: 
            {
            }

             after(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1"
    // InternalTaskDSL.g:1872:1: rule__ExpressionLevel2__Group_1_1__1 : rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 ;
    public final void rule__ExpressionLevel2__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1876:1: ( rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 )
            // InternalTaskDSL.g:1877:2: rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel2__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1__Impl"
    // InternalTaskDSL.g:1884:1: rule__ExpressionLevel2__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__ExpressionLevel2__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1888:1: ( ( '/' ) )
            // InternalTaskDSL.g:1889:1: ( '/' )
            {
            // InternalTaskDSL.g:1889:1: ( '/' )
            // InternalTaskDSL.g:1890:2: '/'
            {
             before(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2"
    // InternalTaskDSL.g:1899:1: rule__ExpressionLevel2__Group_1_1__2 : rule__ExpressionLevel2__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1903:1: ( rule__ExpressionLevel2__Group_1_1__2__Impl )
            // InternalTaskDSL.g:1904:2: rule__ExpressionLevel2__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2__Impl"
    // InternalTaskDSL.g:1910:1: rule__ExpressionLevel2__Group_1_1__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1914:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) )
            // InternalTaskDSL.g:1915:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            {
            // InternalTaskDSL.g:1915:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            // InternalTaskDSL.g:1916:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
            // InternalTaskDSL.g:1917:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            // InternalTaskDSL.g:1917:3: rule__ExpressionLevel2__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0"
    // InternalTaskDSL.g:1926:1: rule__ExpressionLevel2__Group_1_2__0 : rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 ;
    public final void rule__ExpressionLevel2__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1930:1: ( rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 )
            // InternalTaskDSL.g:1931:2: rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1
            {
            pushFollow(FOLLOW_23);
            rule__ExpressionLevel2__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0__Impl"
    // InternalTaskDSL.g:1938:1: rule__ExpressionLevel2__Group_1_2__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1942:1: ( ( () ) )
            // InternalTaskDSL.g:1943:1: ( () )
            {
            // InternalTaskDSL.g:1943:1: ( () )
            // InternalTaskDSL.g:1944:2: ()
            {
             before(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            // InternalTaskDSL.g:1945:2: ()
            // InternalTaskDSL.g:1945:3: 
            {
            }

             after(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__1"
    // InternalTaskDSL.g:1953:1: rule__ExpressionLevel2__Group_1_2__1 : rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 ;
    public final void rule__ExpressionLevel2__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1957:1: ( rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 )
            // InternalTaskDSL.g:1958:2: rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel2__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__1__Impl"
    // InternalTaskDSL.g:1965:1: rule__ExpressionLevel2__Group_1_2__1__Impl : ( 'max' ) ;
    public final void rule__ExpressionLevel2__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1969:1: ( ( 'max' ) )
            // InternalTaskDSL.g:1970:1: ( 'max' )
            {
            // InternalTaskDSL.g:1970:1: ( 'max' )
            // InternalTaskDSL.g:1971:2: 'max'
            {
             before(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2"
    // InternalTaskDSL.g:1980:1: rule__ExpressionLevel2__Group_1_2__2 : rule__ExpressionLevel2__Group_1_2__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1984:1: ( rule__ExpressionLevel2__Group_1_2__2__Impl )
            // InternalTaskDSL.g:1985:2: rule__ExpressionLevel2__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2__Impl"
    // InternalTaskDSL.g:1991:1: rule__ExpressionLevel2__Group_1_2__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1995:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) )
            // InternalTaskDSL.g:1996:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            {
            // InternalTaskDSL.g:1996:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            // InternalTaskDSL.g:1997:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
            // InternalTaskDSL.g:1998:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            // InternalTaskDSL.g:1998:3: rule__ExpressionLevel2__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0"
    // InternalTaskDSL.g:2007:1: rule__ExpressionLevel2__Group_1_3__0 : rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 ;
    public final void rule__ExpressionLevel2__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2011:1: ( rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 )
            // InternalTaskDSL.g:2012:2: rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionLevel2__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0__Impl"
    // InternalTaskDSL.g:2019:1: rule__ExpressionLevel2__Group_1_3__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2023:1: ( ( () ) )
            // InternalTaskDSL.g:2024:1: ( () )
            {
            // InternalTaskDSL.g:2024:1: ( () )
            // InternalTaskDSL.g:2025:2: ()
            {
             before(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            // InternalTaskDSL.g:2026:2: ()
            // InternalTaskDSL.g:2026:3: 
            {
            }

             after(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__1"
    // InternalTaskDSL.g:2034:1: rule__ExpressionLevel2__Group_1_3__1 : rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 ;
    public final void rule__ExpressionLevel2__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2038:1: ( rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 )
            // InternalTaskDSL.g:2039:2: rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel2__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__1__Impl"
    // InternalTaskDSL.g:2046:1: rule__ExpressionLevel2__Group_1_3__1__Impl : ( 'min' ) ;
    public final void rule__ExpressionLevel2__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2050:1: ( ( 'min' ) )
            // InternalTaskDSL.g:2051:1: ( 'min' )
            {
            // InternalTaskDSL.g:2051:1: ( 'min' )
            // InternalTaskDSL.g:2052:2: 'min'
            {
             before(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2"
    // InternalTaskDSL.g:2061:1: rule__ExpressionLevel2__Group_1_3__2 : rule__ExpressionLevel2__Group_1_3__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2065:1: ( rule__ExpressionLevel2__Group_1_3__2__Impl )
            // InternalTaskDSL.g:2066:2: rule__ExpressionLevel2__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2__Impl"
    // InternalTaskDSL.g:2072:1: rule__ExpressionLevel2__Group_1_3__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2076:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) )
            // InternalTaskDSL.g:2077:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            {
            // InternalTaskDSL.g:2077:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            // InternalTaskDSL.g:2078:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
            // InternalTaskDSL.g:2079:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            // InternalTaskDSL.g:2079:3: rule__ExpressionLevel2__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0"
    // InternalTaskDSL.g:2088:1: rule__ExpressionLevel2__Group_1_4__0 : rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 ;
    public final void rule__ExpressionLevel2__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2092:1: ( rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 )
            // InternalTaskDSL.g:2093:2: rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1
            {
            pushFollow(FOLLOW_19);
            rule__ExpressionLevel2__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0__Impl"
    // InternalTaskDSL.g:2100:1: rule__ExpressionLevel2__Group_1_4__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2104:1: ( ( () ) )
            // InternalTaskDSL.g:2105:1: ( () )
            {
            // InternalTaskDSL.g:2105:1: ( () )
            // InternalTaskDSL.g:2106:2: ()
            {
             before(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            // InternalTaskDSL.g:2107:2: ()
            // InternalTaskDSL.g:2107:3: 
            {
            }

             after(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__1"
    // InternalTaskDSL.g:2115:1: rule__ExpressionLevel2__Group_1_4__1 : rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 ;
    public final void rule__ExpressionLevel2__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2119:1: ( rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 )
            // InternalTaskDSL.g:2120:2: rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel2__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__1__Impl"
    // InternalTaskDSL.g:2127:1: rule__ExpressionLevel2__Group_1_4__1__Impl : ( 'mod' ) ;
    public final void rule__ExpressionLevel2__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2131:1: ( ( 'mod' ) )
            // InternalTaskDSL.g:2132:1: ( 'mod' )
            {
            // InternalTaskDSL.g:2132:1: ( 'mod' )
            // InternalTaskDSL.g:2133:2: 'mod'
            {
             before(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2"
    // InternalTaskDSL.g:2142:1: rule__ExpressionLevel2__Group_1_4__2 : rule__ExpressionLevel2__Group_1_4__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2146:1: ( rule__ExpressionLevel2__Group_1_4__2__Impl )
            // InternalTaskDSL.g:2147:2: rule__ExpressionLevel2__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2__Impl"
    // InternalTaskDSL.g:2153:1: rule__ExpressionLevel2__Group_1_4__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2157:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) )
            // InternalTaskDSL.g:2158:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            {
            // InternalTaskDSL.g:2158:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            // InternalTaskDSL.g:2159:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            {
             before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
            // InternalTaskDSL.g:2160:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            // InternalTaskDSL.g:2160:3: rule__ExpressionLevel2__RightAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__0"
    // InternalTaskDSL.g:2169:1: rule__ExpressionLevel3__Group__0 : rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 ;
    public final void rule__ExpressionLevel3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2173:1: ( rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 )
            // InternalTaskDSL.g:2174:2: rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ExpressionLevel3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1();

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
    // $ANTLR end "rule__ExpressionLevel3__Group__0"


    // $ANTLR start "rule__ExpressionLevel3__Group__0__Impl"
    // InternalTaskDSL.g:2181:1: rule__ExpressionLevel3__Group__0__Impl : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2185:1: ( ( ruleExpressionLevel4 ) )
            // InternalTaskDSL.g:2186:1: ( ruleExpressionLevel4 )
            {
            // InternalTaskDSL.g:2186:1: ( ruleExpressionLevel4 )
            // InternalTaskDSL.g:2187:2: ruleExpressionLevel4
            {
             before(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;

             after(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 

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
    // $ANTLR end "rule__ExpressionLevel3__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__1"
    // InternalTaskDSL.g:2196:1: rule__ExpressionLevel3__Group__1 : rule__ExpressionLevel3__Group__1__Impl ;
    public final void rule__ExpressionLevel3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2200:1: ( rule__ExpressionLevel3__Group__1__Impl )
            // InternalTaskDSL.g:2201:2: rule__ExpressionLevel3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionLevel3__Group__1"


    // $ANTLR start "rule__ExpressionLevel3__Group__1__Impl"
    // InternalTaskDSL.g:2207:1: rule__ExpressionLevel3__Group__1__Impl : ( ( rule__ExpressionLevel3__Group_1__0 )? ) ;
    public final void rule__ExpressionLevel3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2211:1: ( ( ( rule__ExpressionLevel3__Group_1__0 )? ) )
            // InternalTaskDSL.g:2212:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            {
            // InternalTaskDSL.g:2212:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            // InternalTaskDSL.g:2213:2: ( rule__ExpressionLevel3__Group_1__0 )?
            {
             before(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
            // InternalTaskDSL.g:2214:2: ( rule__ExpressionLevel3__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTaskDSL.g:2214:3: rule__ExpressionLevel3__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel3__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionLevel3Access().getGroup_1()); 

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
    // $ANTLR end "rule__ExpressionLevel3__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0"
    // InternalTaskDSL.g:2223:1: rule__ExpressionLevel3__Group_1__0 : rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 ;
    public final void rule__ExpressionLevel3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2227:1: ( rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 )
            // InternalTaskDSL.g:2228:2: rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ExpressionLevel3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__1();

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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__0"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0__Impl"
    // InternalTaskDSL.g:2235:1: rule__ExpressionLevel3__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2239:1: ( ( () ) )
            // InternalTaskDSL.g:2240:1: ( () )
            {
            // InternalTaskDSL.g:2240:1: ( () )
            // InternalTaskDSL.g:2241:2: ()
            {
             before(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            // InternalTaskDSL.g:2242:2: ()
            // InternalTaskDSL.g:2242:3: 
            {
            }

             after(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__1"
    // InternalTaskDSL.g:2250:1: rule__ExpressionLevel3__Group_1__1 : rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 ;
    public final void rule__ExpressionLevel3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2254:1: ( rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 )
            // InternalTaskDSL.g:2255:2: rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionLevel3__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2();

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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__1__Impl"
    // InternalTaskDSL.g:2262:1: rule__ExpressionLevel3__Group_1__1__Impl : ( '^' ) ;
    public final void rule__ExpressionLevel3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2266:1: ( ( '^' ) )
            // InternalTaskDSL.g:2267:1: ( '^' )
            {
            // InternalTaskDSL.g:2267:1: ( '^' )
            // InternalTaskDSL.g:2268:2: '^'
            {
             before(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 

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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2"
    // InternalTaskDSL.g:2277:1: rule__ExpressionLevel3__Group_1__2 : rule__ExpressionLevel3__Group_1__2__Impl ;
    public final void rule__ExpressionLevel3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2281:1: ( rule__ExpressionLevel3__Group_1__2__Impl )
            // InternalTaskDSL.g:2282:2: rule__ExpressionLevel3__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2__Impl"
    // InternalTaskDSL.g:2288:1: rule__ExpressionLevel3__Group_1__2__Impl : ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionLevel3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2292:1: ( ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) )
            // InternalTaskDSL.g:2293:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            {
            // InternalTaskDSL.g:2293:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            // InternalTaskDSL.g:2294:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
            // InternalTaskDSL.g:2295:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            // InternalTaskDSL.g:2295:3: rule__ExpressionLevel3__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__0"
    // InternalTaskDSL.g:2304:1: rule__ExpressionMinus__Group__0 : rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 ;
    public final void rule__ExpressionMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2308:1: ( rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 )
            // InternalTaskDSL.g:2309:2: rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1();

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
    // $ANTLR end "rule__ExpressionMinus__Group__0"


    // $ANTLR start "rule__ExpressionMinus__Group__0__Impl"
    // InternalTaskDSL.g:2316:1: rule__ExpressionMinus__Group__0__Impl : ( '-' ) ;
    public final void rule__ExpressionMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2320:1: ( ( '-' ) )
            // InternalTaskDSL.g:2321:1: ( '-' )
            {
            // InternalTaskDSL.g:2321:1: ( '-' )
            // InternalTaskDSL.g:2322:2: '-'
            {
             before(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__ExpressionMinus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__1"
    // InternalTaskDSL.g:2331:1: rule__ExpressionMinus__Group__1 : rule__ExpressionMinus__Group__1__Impl ;
    public final void rule__ExpressionMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2335:1: ( rule__ExpressionMinus__Group__1__Impl )
            // InternalTaskDSL.g:2336:2: rule__ExpressionMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionMinus__Group__1"


    // $ANTLR start "rule__ExpressionMinus__Group__1__Impl"
    // InternalTaskDSL.g:2342:1: rule__ExpressionMinus__Group__1__Impl : ( ( rule__ExpressionMinus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2346:1: ( ( ( rule__ExpressionMinus__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:2347:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:2347:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            // InternalTaskDSL.g:2348:2: ( rule__ExpressionMinus__SubAssignment_1 )
            {
             before(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
            // InternalTaskDSL.g:2349:2: ( rule__ExpressionMinus__SubAssignment_1 )
            // InternalTaskDSL.g:2349:3: rule__ExpressionMinus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__SubAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 

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
    // $ANTLR end "rule__ExpressionMinus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__0"
    // InternalTaskDSL.g:2358:1: rule__ExpressionPlus__Group__0 : rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 ;
    public final void rule__ExpressionPlus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2362:1: ( rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 )
            // InternalTaskDSL.g:2363:2: rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionPlus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1();

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
    // $ANTLR end "rule__ExpressionPlus__Group__0"


    // $ANTLR start "rule__ExpressionPlus__Group__0__Impl"
    // InternalTaskDSL.g:2370:1: rule__ExpressionPlus__Group__0__Impl : ( '+' ) ;
    public final void rule__ExpressionPlus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2374:1: ( ( '+' ) )
            // InternalTaskDSL.g:2375:1: ( '+' )
            {
            // InternalTaskDSL.g:2375:1: ( '+' )
            // InternalTaskDSL.g:2376:2: '+'
            {
             before(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 

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
    // $ANTLR end "rule__ExpressionPlus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__1"
    // InternalTaskDSL.g:2385:1: rule__ExpressionPlus__Group__1 : rule__ExpressionPlus__Group__1__Impl ;
    public final void rule__ExpressionPlus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2389:1: ( rule__ExpressionPlus__Group__1__Impl )
            // InternalTaskDSL.g:2390:2: rule__ExpressionPlus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionPlus__Group__1"


    // $ANTLR start "rule__ExpressionPlus__Group__1__Impl"
    // InternalTaskDSL.g:2396:1: rule__ExpressionPlus__Group__1__Impl : ( ( rule__ExpressionPlus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionPlus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2400:1: ( ( ( rule__ExpressionPlus__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:2401:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:2401:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            // InternalTaskDSL.g:2402:2: ( rule__ExpressionPlus__SubAssignment_1 )
            {
             before(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
            // InternalTaskDSL.g:2403:2: ( rule__ExpressionPlus__SubAssignment_1 )
            // InternalTaskDSL.g:2403:3: rule__ExpressionPlus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__SubAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 

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
    // $ANTLR end "rule__ExpressionPlus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__0"
    // InternalTaskDSL.g:2412:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2416:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalTaskDSL.g:2417:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ExpressionBracket__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__1();

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
    // $ANTLR end "rule__ExpressionBracket__Group__0"


    // $ANTLR start "rule__ExpressionBracket__Group__0__Impl"
    // InternalTaskDSL.g:2424:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2428:1: ( ( '(' ) )
            // InternalTaskDSL.g:2429:1: ( '(' )
            {
            // InternalTaskDSL.g:2429:1: ( '(' )
            // InternalTaskDSL.g:2430:2: '('
            {
             before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__ExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__1"
    // InternalTaskDSL.g:2439:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2443:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalTaskDSL.g:2444:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ExpressionBracket__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2();

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
    // $ANTLR end "rule__ExpressionBracket__Group__1"


    // $ANTLR start "rule__ExpressionBracket__Group__1__Impl"
    // InternalTaskDSL.g:2451:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2455:1: ( ( ( rule__ExpressionBracket__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:2456:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:2456:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            // InternalTaskDSL.g:2457:2: ( rule__ExpressionBracket__SubAssignment_1 )
            {
             before(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
            // InternalTaskDSL.g:2458:2: ( rule__ExpressionBracket__SubAssignment_1 )
            // InternalTaskDSL.g:2458:3: rule__ExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__SubAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 

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
    // $ANTLR end "rule__ExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__2"
    // InternalTaskDSL.g:2466:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2470:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalTaskDSL.g:2471:2: rule__ExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2__Impl();

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
    // $ANTLR end "rule__ExpressionBracket__Group__2"


    // $ANTLR start "rule__ExpressionBracket__Group__2__Impl"
    // InternalTaskDSL.g:2477:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2481:1: ( ( ')' ) )
            // InternalTaskDSL.g:2482:1: ( ')' )
            {
            // InternalTaskDSL.g:2482:1: ( ')' )
            // InternalTaskDSL.g:2483:2: ')'
            {
             before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__Planning__NameAssignment_1"
    // InternalTaskDSL.g:2493:1: rule__Planning__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Planning__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2497:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:2498:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:2498:2: ( RULE_ID )
            // InternalTaskDSL.g:2499:3: RULE_ID
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
    // InternalTaskDSL.g:2508:1: rule__Planning__AnonymousAssignment_2 : ( ( 'anonymous' ) ) ;
    public final void rule__Planning__AnonymousAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2512:1: ( ( ( 'anonymous' ) ) )
            // InternalTaskDSL.g:2513:2: ( ( 'anonymous' ) )
            {
            // InternalTaskDSL.g:2513:2: ( ( 'anonymous' ) )
            // InternalTaskDSL.g:2514:3: ( 'anonymous' )
            {
             before(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            // InternalTaskDSL.g:2515:3: ( 'anonymous' )
            // InternalTaskDSL.g:2516:4: 'anonymous'
            {
             before(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTaskDSL.g:2527:1: rule__Planning__PersonsAssignment_3_0 : ( rulePerson ) ;
    public final void rule__Planning__PersonsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2531:1: ( ( rulePerson ) )
            // InternalTaskDSL.g:2532:2: ( rulePerson )
            {
            // InternalTaskDSL.g:2532:2: ( rulePerson )
            // InternalTaskDSL.g:2533:3: rulePerson
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
    // InternalTaskDSL.g:2542:1: rule__Planning__TasksAssignment_3_1 : ( ruleTask ) ;
    public final void rule__Planning__TasksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2546:1: ( ( ruleTask ) )
            // InternalTaskDSL.g:2547:2: ( ruleTask )
            {
            // InternalTaskDSL.g:2547:2: ( ruleTask )
            // InternalTaskDSL.g:2548:3: ruleTask
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
    // InternalTaskDSL.g:2557:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2561:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:2562:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:2562:2: ( RULE_ID )
            // InternalTaskDSL.g:2563:3: RULE_ID
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
    // InternalTaskDSL.g:2572:1: rule__Task__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__Task__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2576:1: ( ( ruleAction ) )
            // InternalTaskDSL.g:2577:2: ( ruleAction )
            {
            // InternalTaskDSL.g:2577:2: ( ruleAction )
            // InternalTaskDSL.g:2578:3: ruleAction
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
    // InternalTaskDSL.g:2587:1: rule__Task__PersonsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Task__PersonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2591:1: ( ( ( RULE_ID ) ) )
            // InternalTaskDSL.g:2592:2: ( ( RULE_ID ) )
            {
            // InternalTaskDSL.g:2592:2: ( ( RULE_ID ) )
            // InternalTaskDSL.g:2593:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); 
            // InternalTaskDSL.g:2594:3: ( RULE_ID )
            // InternalTaskDSL.g:2595:4: RULE_ID
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
    // InternalTaskDSL.g:2606:1: rule__Task__PrioAssignment_5 : ( RULE_INT ) ;
    public final void rule__Task__PrioAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2610:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:2611:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:2611:2: ( RULE_INT )
            // InternalTaskDSL.g:2612:3: RULE_INT
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
    // InternalTaskDSL.g:2621:1: rule__Task__DurationAssignment_6_1 : ( ruleDuration ) ;
    public final void rule__Task__DurationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2625:1: ( ( ruleDuration ) )
            // InternalTaskDSL.g:2626:2: ( ruleDuration )
            {
            // InternalTaskDSL.g:2626:2: ( ruleDuration )
            // InternalTaskDSL.g:2627:3: ruleDuration
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
    // InternalTaskDSL.g:2636:1: rule__Duration__DlAssignment_0 : ( RULE_INT ) ;
    public final void rule__Duration__DlAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2640:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:2641:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:2641:2: ( RULE_INT )
            // InternalTaskDSL.g:2642:3: RULE_INT
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
    // InternalTaskDSL.g:2651:1: rule__Duration__UnitAssignment_1 : ( ruleTimeUnit ) ;
    public final void rule__Duration__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2655:1: ( ( ruleTimeUnit ) )
            // InternalTaskDSL.g:2656:2: ( ruleTimeUnit )
            {
            // InternalTaskDSL.g:2656:2: ( ruleTimeUnit )
            // InternalTaskDSL.g:2657:3: ruleTimeUnit
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
    // InternalTaskDSL.g:2666:1: rule__LunchAction__LocationAssignment_1 : ( RULE_ID ) ;
    public final void rule__LunchAction__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2670:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:2671:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:2671:2: ( RULE_ID )
            // InternalTaskDSL.g:2672:3: RULE_ID
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
    // InternalTaskDSL.g:2681:1: rule__MeetingAction__TopicAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MeetingAction__TopicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2685:1: ( ( RULE_STRING ) )
            // InternalTaskDSL.g:2686:2: ( RULE_STRING )
            {
            // InternalTaskDSL.g:2686:2: ( RULE_STRING )
            // InternalTaskDSL.g:2687:3: RULE_STRING
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
    // InternalTaskDSL.g:2696:1: rule__PaperAction__ReportAssignment_1 : ( RULE_ID ) ;
    public final void rule__PaperAction__ReportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2700:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:2701:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:2701:2: ( RULE_ID )
            // InternalTaskDSL.g:2702:3: RULE_ID
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
    // InternalTaskDSL.g:2711:1: rule__PaymentAction__AmountAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__PaymentAction__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2715:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:2716:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:2716:2: ( ruleIntExpression )
            // InternalTaskDSL.g:2717:3: ruleIntExpression
            {
             before(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;

             after(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_0_2"
    // InternalTaskDSL.g:2726:1: rule__ExpressionLevel1__RightAssignment_1_0_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2730:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:2731:2: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:2731:2: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:2732:3: ruleExpressionLevel2
            {
             before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;

             after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_1_2"
    // InternalTaskDSL.g:2741:1: rule__ExpressionLevel1__RightAssignment_1_1_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2745:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:2746:2: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:2746:2: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:2747:3: ruleExpressionLevel2
            {
             before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;

             after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_0_2"
    // InternalTaskDSL.g:2756:1: rule__ExpressionLevel2__RightAssignment_1_0_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2760:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:2761:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:2761:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:2762:3: ruleExpressionLevel3
            {
             before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_1_2"
    // InternalTaskDSL.g:2771:1: rule__ExpressionLevel2__RightAssignment_1_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2775:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:2776:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:2776:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:2777:3: ruleExpressionLevel3
            {
             before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_2_2"
    // InternalTaskDSL.g:2786:1: rule__ExpressionLevel2__RightAssignment_1_2_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2790:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:2791:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:2791:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:2792:3: ruleExpressionLevel3
            {
             before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_2_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_3_2"
    // InternalTaskDSL.g:2801:1: rule__ExpressionLevel2__RightAssignment_1_3_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2805:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:2806:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:2806:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:2807:3: ruleExpressionLevel3
            {
             before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 

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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_3_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_4_2"
    // InternalTaskDSL.g:2816:1: rule__ExpressionLevel2__RightAssignment_1_4_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2820:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:2821:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:2821:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:2822:3: ruleExpressionLevel3
            {
             before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 

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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_4_2"


    // $ANTLR start "rule__ExpressionLevel3__RightAssignment_1_2"
    // InternalTaskDSL.g:2831:1: rule__ExpressionLevel3__RightAssignment_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel3__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2835:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:2836:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:2836:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:2837:3: ruleExpressionLevel3
            {
             before(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;

             after(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ExpressionLevel3__RightAssignment_1_2"


    // $ANTLR start "rule__ExpressionMinus__SubAssignment_1"
    // InternalTaskDSL.g:2846:1: rule__ExpressionMinus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionMinus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2850:1: ( ( ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:2851:2: ( ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:2851:2: ( ruleExpressionLevel5 )
            // InternalTaskDSL.g:2852:3: ruleExpressionLevel5
            {
             before(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;

             after(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExpressionMinus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionPlus__SubAssignment_1"
    // InternalTaskDSL.g:2861:1: rule__ExpressionPlus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionPlus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2865:1: ( ( ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:2866:2: ( ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:2866:2: ( ruleExpressionLevel5 )
            // InternalTaskDSL.g:2867:3: ruleExpressionLevel5
            {
             before(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;

             after(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExpressionPlus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionBracket__SubAssignment_1"
    // InternalTaskDSL.g:2876:1: rule__ExpressionBracket__SubAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2880:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:2881:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:2881:2: ( ruleIntExpression )
            // InternalTaskDSL.g:2882:3: ruleIntExpression
            {
             before(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;

             after(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__ExpressionConstantInt__ValueAssignment"
    // InternalTaskDSL.g:2891:1: rule__ExpressionConstantInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ExpressionConstantInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2895:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:2896:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:2896:2: ( RULE_INT )
            // InternalTaskDSL.g:2897:3: RULE_INT
            {
             before(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ExpressionConstantInt__ValueAssignment"


    // $ANTLR start "rule__ExpressionBalance__ValueAssignment"
    // InternalTaskDSL.g:2906:1: rule__ExpressionBalance__ValueAssignment : ( ruleBalance ) ;
    public final void rule__ExpressionBalance__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2910:1: ( ( ruleBalance ) )
            // InternalTaskDSL.g:2911:2: ( ruleBalance )
            {
            // InternalTaskDSL.g:2911:2: ( ruleBalance )
            // InternalTaskDSL.g:2912:3: ruleBalance
            {
             before(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBalance();

            state._fsp--;

             after(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0()); 

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
    // $ANTLR end "rule__ExpressionBalance__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000060000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000418000820L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001E0001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001E0001002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});

}