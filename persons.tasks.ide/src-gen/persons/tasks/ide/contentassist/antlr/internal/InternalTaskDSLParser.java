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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTaskDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'balance'", "'*'", "'min'", "'hour'", "'day'", "'week'", "'AND'", "'OR'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'Planning'", "'INT'", "'Array:'", "':='", "'['", "']'", "','", "'ARRAY'", "'..'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'duration:'", "'Lunch'", "'Meeting'", "'Report'", "'Pay'", "'euro'", "'If'", "'+'", "'-'", "'/'", "'max'", "'mod'", "'^'", "'('", "')'", "'NOT'", "'anonymous'"
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
    // InternalTaskDSL.g:54:1: entryRulePlanning : rulePlanning EOF ;
    public final void entryRulePlanning() throws RecognitionException {
        try {
            // InternalTaskDSL.g:55:1: ( rulePlanning EOF )
            // InternalTaskDSL.g:56:1: rulePlanning EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlanning();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:63:1: rulePlanning : ( ( rule__Planning__Group__0 ) ) ;
    public final void rulePlanning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:67:2: ( ( ( rule__Planning__Group__0 ) ) )
            // InternalTaskDSL.g:68:2: ( ( rule__Planning__Group__0 ) )
            {
            // InternalTaskDSL.g:68:2: ( ( rule__Planning__Group__0 ) )
            // InternalTaskDSL.g:69:3: ( rule__Planning__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getGroup()); 
            }
            // InternalTaskDSL.g:70:3: ( rule__Planning__Group__0 )
            // InternalTaskDSL.g:70:4: rule__Planning__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Planning__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getGroup()); 
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
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRuleMyInteger"
    // InternalTaskDSL.g:79:1: entryRuleMyInteger : ruleMyInteger EOF ;
    public final void entryRuleMyInteger() throws RecognitionException {
        try {
            // InternalTaskDSL.g:80:1: ( ruleMyInteger EOF )
            // InternalTaskDSL.g:81:1: ruleMyInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMyInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyIntegerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMyInteger"


    // $ANTLR start "ruleMyInteger"
    // InternalTaskDSL.g:88:1: ruleMyInteger : ( ( rule__MyInteger__Group__0 ) ) ;
    public final void ruleMyInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:92:2: ( ( ( rule__MyInteger__Group__0 ) ) )
            // InternalTaskDSL.g:93:2: ( ( rule__MyInteger__Group__0 ) )
            {
            // InternalTaskDSL.g:93:2: ( ( rule__MyInteger__Group__0 ) )
            // InternalTaskDSL.g:94:3: ( rule__MyInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyIntegerAccess().getGroup()); 
            }
            // InternalTaskDSL.g:95:3: ( rule__MyInteger__Group__0 )
            // InternalTaskDSL.g:95:4: rule__MyInteger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyInteger__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyIntegerAccess().getGroup()); 
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
    // $ANTLR end "ruleMyInteger"


    // $ANTLR start "entryRuleMyArray"
    // InternalTaskDSL.g:104:1: entryRuleMyArray : ruleMyArray EOF ;
    public final void entryRuleMyArray() throws RecognitionException {
        try {
            // InternalTaskDSL.g:105:1: ( ruleMyArray EOF )
            // InternalTaskDSL.g:106:1: ruleMyArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMyArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMyArray"


    // $ANTLR start "ruleMyArray"
    // InternalTaskDSL.g:113:1: ruleMyArray : ( ( rule__MyArray__Group__0 ) ) ;
    public final void ruleMyArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:117:2: ( ( ( rule__MyArray__Group__0 ) ) )
            // InternalTaskDSL.g:118:2: ( ( rule__MyArray__Group__0 ) )
            {
            // InternalTaskDSL.g:118:2: ( ( rule__MyArray__Group__0 ) )
            // InternalTaskDSL.g:119:3: ( rule__MyArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getGroup()); 
            }
            // InternalTaskDSL.g:120:3: ( rule__MyArray__Group__0 )
            // InternalTaskDSL.g:120:4: rule__MyArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MyArray__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getGroup()); 
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
    // $ANTLR end "ruleMyArray"


    // $ANTLR start "entryRuleArraySpecificationInit"
    // InternalTaskDSL.g:129:1: entryRuleArraySpecificationInit : ruleArraySpecificationInit EOF ;
    public final void entryRuleArraySpecificationInit() throws RecognitionException {
        try {
            // InternalTaskDSL.g:130:1: ( ruleArraySpecificationInit EOF )
            // InternalTaskDSL.g:131:1: ruleArraySpecificationInit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArraySpecificationInit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArraySpecificationInit"


    // $ANTLR start "ruleArraySpecificationInit"
    // InternalTaskDSL.g:138:1: ruleArraySpecificationInit : ( ( rule__ArraySpecificationInit__Group__0 ) ) ;
    public final void ruleArraySpecificationInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:142:2: ( ( ( rule__ArraySpecificationInit__Group__0 ) ) )
            // InternalTaskDSL.g:143:2: ( ( rule__ArraySpecificationInit__Group__0 ) )
            {
            // InternalTaskDSL.g:143:2: ( ( rule__ArraySpecificationInit__Group__0 ) )
            // InternalTaskDSL.g:144:3: ( rule__ArraySpecificationInit__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitAccess().getGroup()); 
            }
            // InternalTaskDSL.g:145:3: ( rule__ArraySpecificationInit__Group__0 )
            // InternalTaskDSL.g:145:4: rule__ArraySpecificationInit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecificationInit__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitAccess().getGroup()); 
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
    // $ANTLR end "ruleArraySpecificationInit"


    // $ANTLR start "entryRuleArraySpecification"
    // InternalTaskDSL.g:154:1: entryRuleArraySpecification : ruleArraySpecification EOF ;
    public final void entryRuleArraySpecification() throws RecognitionException {
        try {
            // InternalTaskDSL.g:155:1: ( ruleArraySpecification EOF )
            // InternalTaskDSL.g:156:1: ruleArraySpecification EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArraySpecification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArraySpecification"


    // $ANTLR start "ruleArraySpecification"
    // InternalTaskDSL.g:163:1: ruleArraySpecification : ( ( rule__ArraySpecification__Group__0 ) ) ;
    public final void ruleArraySpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:167:2: ( ( ( rule__ArraySpecification__Group__0 ) ) )
            // InternalTaskDSL.g:168:2: ( ( rule__ArraySpecification__Group__0 ) )
            {
            // InternalTaskDSL.g:168:2: ( ( rule__ArraySpecification__Group__0 ) )
            // InternalTaskDSL.g:169:3: ( rule__ArraySpecification__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationAccess().getGroup()); 
            }
            // InternalTaskDSL.g:170:3: ( rule__ArraySpecification__Group__0 )
            // InternalTaskDSL.g:170:4: rule__ArraySpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecification__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationAccess().getGroup()); 
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
    // $ANTLR end "ruleArraySpecification"


    // $ANTLR start "entryRuleArrayInterval"
    // InternalTaskDSL.g:179:1: entryRuleArrayInterval : ruleArrayInterval EOF ;
    public final void entryRuleArrayInterval() throws RecognitionException {
        try {
            // InternalTaskDSL.g:180:1: ( ruleArrayInterval EOF )
            // InternalTaskDSL.g:181:1: ruleArrayInterval EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayIntervalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayInterval();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayIntervalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArrayInterval"


    // $ANTLR start "ruleArrayInterval"
    // InternalTaskDSL.g:188:1: ruleArrayInterval : ( ( rule__ArrayInterval__Group__0 ) ) ;
    public final void ruleArrayInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:192:2: ( ( ( rule__ArrayInterval__Group__0 ) ) )
            // InternalTaskDSL.g:193:2: ( ( rule__ArrayInterval__Group__0 ) )
            {
            // InternalTaskDSL.g:193:2: ( ( rule__ArrayInterval__Group__0 ) )
            // InternalTaskDSL.g:194:3: ( rule__ArrayInterval__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayIntervalAccess().getGroup()); 
            }
            // InternalTaskDSL.g:195:3: ( rule__ArrayInterval__Group__0 )
            // InternalTaskDSL.g:195:4: rule__ArrayInterval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayInterval__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayIntervalAccess().getGroup()); 
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
    // $ANTLR end "ruleArrayInterval"


    // $ANTLR start "entryRuleArrayInitialization"
    // InternalTaskDSL.g:204:1: entryRuleArrayInitialization : ruleArrayInitialization EOF ;
    public final void entryRuleArrayInitialization() throws RecognitionException {
        try {
            // InternalTaskDSL.g:205:1: ( ruleArrayInitialization EOF )
            // InternalTaskDSL.g:206:1: ruleArrayInitialization EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayInitializationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayInitialization();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayInitializationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArrayInitialization"


    // $ANTLR start "ruleArrayInitialization"
    // InternalTaskDSL.g:213:1: ruleArrayInitialization : ( ( rule__ArrayInitialization__Group__0 ) ) ;
    public final void ruleArrayInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:217:2: ( ( ( rule__ArrayInitialization__Group__0 ) ) )
            // InternalTaskDSL.g:218:2: ( ( rule__ArrayInitialization__Group__0 ) )
            {
            // InternalTaskDSL.g:218:2: ( ( rule__ArrayInitialization__Group__0 ) )
            // InternalTaskDSL.g:219:3: ( rule__ArrayInitialization__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayInitializationAccess().getGroup()); 
            }
            // InternalTaskDSL.g:220:3: ( rule__ArrayInitialization__Group__0 )
            // InternalTaskDSL.g:220:4: rule__ArrayInitialization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayInitialization__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayInitializationAccess().getGroup()); 
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
    // $ANTLR end "ruleArrayInitialization"


    // $ANTLR start "entryRulePerson"
    // InternalTaskDSL.g:229:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalTaskDSL.g:230:1: ( rulePerson EOF )
            // InternalTaskDSL.g:231:1: rulePerson EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:238:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:242:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalTaskDSL.g:243:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalTaskDSL.g:243:2: ( ( rule__Person__Group__0 ) )
            // InternalTaskDSL.g:244:3: ( rule__Person__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getGroup()); 
            }
            // InternalTaskDSL.g:245:3: ( rule__Person__Group__0 )
            // InternalTaskDSL.g:245:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getGroup()); 
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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTask"
    // InternalTaskDSL.g:254:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalTaskDSL.g:255:1: ( ruleTask EOF )
            // InternalTaskDSL.g:256:1: ruleTask EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:263:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:267:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalTaskDSL.g:268:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalTaskDSL.g:268:2: ( ( rule__Task__Group__0 ) )
            // InternalTaskDSL.g:269:3: ( rule__Task__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getGroup()); 
            }
            // InternalTaskDSL.g:270:3: ( rule__Task__Group__0 )
            // InternalTaskDSL.g:270:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getGroup()); 
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleDuration"
    // InternalTaskDSL.g:279:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalTaskDSL.g:280:1: ( ruleDuration EOF )
            // InternalTaskDSL.g:281:1: ruleDuration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDuration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:288:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:292:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalTaskDSL.g:293:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalTaskDSL.g:293:2: ( ( rule__Duration__Group__0 ) )
            // InternalTaskDSL.g:294:3: ( rule__Duration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getGroup()); 
            }
            // InternalTaskDSL.g:295:3: ( rule__Duration__Group__0 )
            // InternalTaskDSL.g:295:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getGroup()); 
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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleAction"
    // InternalTaskDSL.g:304:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:305:1: ( ruleAction EOF )
            // InternalTaskDSL.g:306:1: ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:313:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:317:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalTaskDSL.g:318:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalTaskDSL.g:318:2: ( ( rule__Action__Alternatives ) )
            // InternalTaskDSL.g:319:3: ( rule__Action__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:320:3: ( rule__Action__Alternatives )
            // InternalTaskDSL.g:320:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleLunchAction"
    // InternalTaskDSL.g:329:1: entryRuleLunchAction : ruleLunchAction EOF ;
    public final void entryRuleLunchAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:330:1: ( ruleLunchAction EOF )
            // InternalTaskDSL.g:331:1: ruleLunchAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLunchAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:338:1: ruleLunchAction : ( ( rule__LunchAction__Group__0 ) ) ;
    public final void ruleLunchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:342:2: ( ( ( rule__LunchAction__Group__0 ) ) )
            // InternalTaskDSL.g:343:2: ( ( rule__LunchAction__Group__0 ) )
            {
            // InternalTaskDSL.g:343:2: ( ( rule__LunchAction__Group__0 ) )
            // InternalTaskDSL.g:344:3: ( rule__LunchAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:345:3: ( rule__LunchAction__Group__0 )
            // InternalTaskDSL.g:345:4: rule__LunchAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getGroup()); 
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
    // $ANTLR end "ruleLunchAction"


    // $ANTLR start "entryRuleMeetingAction"
    // InternalTaskDSL.g:354:1: entryRuleMeetingAction : ruleMeetingAction EOF ;
    public final void entryRuleMeetingAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:355:1: ( ruleMeetingAction EOF )
            // InternalTaskDSL.g:356:1: ruleMeetingAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMeetingAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:363:1: ruleMeetingAction : ( ( rule__MeetingAction__Group__0 ) ) ;
    public final void ruleMeetingAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:367:2: ( ( ( rule__MeetingAction__Group__0 ) ) )
            // InternalTaskDSL.g:368:2: ( ( rule__MeetingAction__Group__0 ) )
            {
            // InternalTaskDSL.g:368:2: ( ( rule__MeetingAction__Group__0 ) )
            // InternalTaskDSL.g:369:3: ( rule__MeetingAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:370:3: ( rule__MeetingAction__Group__0 )
            // InternalTaskDSL.g:370:4: rule__MeetingAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getGroup()); 
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
    // $ANTLR end "ruleMeetingAction"


    // $ANTLR start "entryRulePaperAction"
    // InternalTaskDSL.g:379:1: entryRulePaperAction : rulePaperAction EOF ;
    public final void entryRulePaperAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:380:1: ( rulePaperAction EOF )
            // InternalTaskDSL.g:381:1: rulePaperAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePaperAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:388:1: rulePaperAction : ( ( rule__PaperAction__Group__0 ) ) ;
    public final void rulePaperAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:392:2: ( ( ( rule__PaperAction__Group__0 ) ) )
            // InternalTaskDSL.g:393:2: ( ( rule__PaperAction__Group__0 ) )
            {
            // InternalTaskDSL.g:393:2: ( ( rule__PaperAction__Group__0 ) )
            // InternalTaskDSL.g:394:3: ( rule__PaperAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:395:3: ( rule__PaperAction__Group__0 )
            // InternalTaskDSL.g:395:4: rule__PaperAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getGroup()); 
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
    // $ANTLR end "rulePaperAction"


    // $ANTLR start "entryRulePaymentAction"
    // InternalTaskDSL.g:404:1: entryRulePaymentAction : rulePaymentAction EOF ;
    public final void entryRulePaymentAction() throws RecognitionException {
        try {
            // InternalTaskDSL.g:405:1: ( rulePaymentAction EOF )
            // InternalTaskDSL.g:406:1: rulePaymentAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePaymentAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:413:1: rulePaymentAction : ( ( rule__PaymentAction__Group__0 ) ) ;
    public final void rulePaymentAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:417:2: ( ( ( rule__PaymentAction__Group__0 ) ) )
            // InternalTaskDSL.g:418:2: ( ( rule__PaymentAction__Group__0 ) )
            {
            // InternalTaskDSL.g:418:2: ( ( rule__PaymentAction__Group__0 ) )
            // InternalTaskDSL.g:419:3: ( rule__PaymentAction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:420:3: ( rule__PaymentAction__Group__0 )
            // InternalTaskDSL.g:420:4: rule__PaymentAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getGroup()); 
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
    // $ANTLR end "rulePaymentAction"


    // $ANTLR start "entryRuleIntExpression"
    // InternalTaskDSL.g:429:1: entryRuleIntExpression : ruleIntExpression EOF ;
    public final void entryRuleIntExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:430:1: ( ruleIntExpression EOF )
            // InternalTaskDSL.g:431:1: ruleIntExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:438:1: ruleIntExpression : ( ruleExpressionLevel1 ) ;
    public final void ruleIntExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:442:2: ( ( ruleExpressionLevel1 ) )
            // InternalTaskDSL.g:443:2: ( ruleExpressionLevel1 )
            {
            // InternalTaskDSL.g:443:2: ( ruleExpressionLevel1 )
            // InternalTaskDSL.g:444:3: ruleExpressionLevel1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalTaskDSL.g:454:1: entryRuleExpressionLevel1 : ruleExpressionLevel1 EOF ;
    public final void entryRuleExpressionLevel1() throws RecognitionException {
        try {
            // InternalTaskDSL.g:455:1: ( ruleExpressionLevel1 EOF )
            // InternalTaskDSL.g:456:1: ruleExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:463:1: ruleExpressionLevel1 : ( ( rule__ExpressionLevel1__Group__0 ) ) ;
    public final void ruleExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:467:2: ( ( ( rule__ExpressionLevel1__Group__0 ) ) )
            // InternalTaskDSL.g:468:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            {
            // InternalTaskDSL.g:468:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            // InternalTaskDSL.g:469:3: ( rule__ExpressionLevel1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getGroup()); 
            }
            // InternalTaskDSL.g:470:3: ( rule__ExpressionLevel1__Group__0 )
            // InternalTaskDSL.g:470:4: rule__ExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getGroup()); 
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
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalTaskDSL.g:479:1: entryRuleExpressionLevel2 : ruleExpressionLevel2 EOF ;
    public final void entryRuleExpressionLevel2() throws RecognitionException {
        try {
            // InternalTaskDSL.g:480:1: ( ruleExpressionLevel2 EOF )
            // InternalTaskDSL.g:481:1: ruleExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:488:1: ruleExpressionLevel2 : ( ( rule__ExpressionLevel2__Group__0 ) ) ;
    public final void ruleExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:492:2: ( ( ( rule__ExpressionLevel2__Group__0 ) ) )
            // InternalTaskDSL.g:493:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            {
            // InternalTaskDSL.g:493:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            // InternalTaskDSL.g:494:3: ( rule__ExpressionLevel2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getGroup()); 
            }
            // InternalTaskDSL.g:495:3: ( rule__ExpressionLevel2__Group__0 )
            // InternalTaskDSL.g:495:4: rule__ExpressionLevel2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getGroup()); 
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
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalTaskDSL.g:504:1: entryRuleExpressionLevel3 : ruleExpressionLevel3 EOF ;
    public final void entryRuleExpressionLevel3() throws RecognitionException {
        try {
            // InternalTaskDSL.g:505:1: ( ruleExpressionLevel3 EOF )
            // InternalTaskDSL.g:506:1: ruleExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:513:1: ruleExpressionLevel3 : ( ( rule__ExpressionLevel3__Group__0 ) ) ;
    public final void ruleExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:517:2: ( ( ( rule__ExpressionLevel3__Group__0 ) ) )
            // InternalTaskDSL.g:518:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            {
            // InternalTaskDSL.g:518:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            // InternalTaskDSL.g:519:3: ( rule__ExpressionLevel3__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getGroup()); 
            }
            // InternalTaskDSL.g:520:3: ( rule__ExpressionLevel3__Group__0 )
            // InternalTaskDSL.g:520:4: rule__ExpressionLevel3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getGroup()); 
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
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalTaskDSL.g:529:1: entryRuleExpressionLevel4 : ruleExpressionLevel4 EOF ;
    public final void entryRuleExpressionLevel4() throws RecognitionException {
        try {
            // InternalTaskDSL.g:530:1: ( ruleExpressionLevel4 EOF )
            // InternalTaskDSL.g:531:1: ruleExpressionLevel4 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel4Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel4Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:538:1: ruleExpressionLevel4 : ( ( rule__ExpressionLevel4__Alternatives ) ) ;
    public final void ruleExpressionLevel4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:542:2: ( ( ( rule__ExpressionLevel4__Alternatives ) ) )
            // InternalTaskDSL.g:543:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            {
            // InternalTaskDSL.g:543:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            // InternalTaskDSL.g:544:3: ( rule__ExpressionLevel4__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:545:3: ( rule__ExpressionLevel4__Alternatives )
            // InternalTaskDSL.g:545:4: rule__ExpressionLevel4__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
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
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalTaskDSL.g:554:1: entryRuleExpressionMinus : ruleExpressionMinus EOF ;
    public final void entryRuleExpressionMinus() throws RecognitionException {
        try {
            // InternalTaskDSL.g:555:1: ( ruleExpressionMinus EOF )
            // InternalTaskDSL.g:556:1: ruleExpressionMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:563:1: ruleExpressionMinus : ( ( rule__ExpressionMinus__Group__0 ) ) ;
    public final void ruleExpressionMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:567:2: ( ( ( rule__ExpressionMinus__Group__0 ) ) )
            // InternalTaskDSL.g:568:2: ( ( rule__ExpressionMinus__Group__0 ) )
            {
            // InternalTaskDSL.g:568:2: ( ( rule__ExpressionMinus__Group__0 ) )
            // InternalTaskDSL.g:569:3: ( rule__ExpressionMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getGroup()); 
            }
            // InternalTaskDSL.g:570:3: ( rule__ExpressionMinus__Group__0 )
            // InternalTaskDSL.g:570:4: rule__ExpressionMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getGroup()); 
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
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalTaskDSL.g:579:1: entryRuleExpressionPlus : ruleExpressionPlus EOF ;
    public final void entryRuleExpressionPlus() throws RecognitionException {
        try {
            // InternalTaskDSL.g:580:1: ( ruleExpressionPlus EOF )
            // InternalTaskDSL.g:581:1: ruleExpressionPlus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionPlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:588:1: ruleExpressionPlus : ( ( rule__ExpressionPlus__Group__0 ) ) ;
    public final void ruleExpressionPlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:592:2: ( ( ( rule__ExpressionPlus__Group__0 ) ) )
            // InternalTaskDSL.g:593:2: ( ( rule__ExpressionPlus__Group__0 ) )
            {
            // InternalTaskDSL.g:593:2: ( ( rule__ExpressionPlus__Group__0 ) )
            // InternalTaskDSL.g:594:3: ( rule__ExpressionPlus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getGroup()); 
            }
            // InternalTaskDSL.g:595:3: ( rule__ExpressionPlus__Group__0 )
            // InternalTaskDSL.g:595:4: rule__ExpressionPlus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getGroup()); 
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
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalTaskDSL.g:604:1: entryRuleExpressionLevel5 : ruleExpressionLevel5 EOF ;
    public final void entryRuleExpressionLevel5() throws RecognitionException {
        try {
            // InternalTaskDSL.g:605:1: ( ruleExpressionLevel5 EOF )
            // InternalTaskDSL.g:606:1: ruleExpressionLevel5 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:613:1: ruleExpressionLevel5 : ( ( rule__ExpressionLevel5__Alternatives ) ) ;
    public final void ruleExpressionLevel5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:617:2: ( ( ( rule__ExpressionLevel5__Alternatives ) ) )
            // InternalTaskDSL.g:618:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            {
            // InternalTaskDSL.g:618:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            // InternalTaskDSL.g:619:3: ( rule__ExpressionLevel5__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:620:3: ( rule__ExpressionLevel5__Alternatives )
            // InternalTaskDSL.g:620:4: rule__ExpressionLevel5__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
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
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalTaskDSL.g:629:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalTaskDSL.g:630:1: ( ruleExpressionBracket EOF )
            // InternalTaskDSL.g:631:1: ruleExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:638:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:642:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalTaskDSL.g:643:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalTaskDSL.g:643:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalTaskDSL.g:644:3: ( rule__ExpressionBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            }
            // InternalTaskDSL.g:645:3: ( rule__ExpressionBracket__Group__0 )
            // InternalTaskDSL.g:645:4: rule__ExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getGroup()); 
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
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalTaskDSL.g:654:1: entryRuleExpressionConstantInt : ruleExpressionConstantInt EOF ;
    public final void entryRuleExpressionConstantInt() throws RecognitionException {
        try {
            // InternalTaskDSL.g:655:1: ( ruleExpressionConstantInt EOF )
            // InternalTaskDSL.g:656:1: ruleExpressionConstantInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:663:1: ruleExpressionConstantInt : ( ( rule__ExpressionConstantInt__ValueAssignment ) ) ;
    public final void ruleExpressionConstantInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:667:2: ( ( ( rule__ExpressionConstantInt__ValueAssignment ) ) )
            // InternalTaskDSL.g:668:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            {
            // InternalTaskDSL.g:668:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            // InternalTaskDSL.g:669:3: ( rule__ExpressionConstantInt__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
            }
            // InternalTaskDSL.g:670:3: ( rule__ExpressionConstantInt__ValueAssignment )
            // InternalTaskDSL.g:670:4: rule__ExpressionConstantInt__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionConstantInt__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleExpressionBalance"
    // InternalTaskDSL.g:679:1: entryRuleExpressionBalance : ruleExpressionBalance EOF ;
    public final void entryRuleExpressionBalance() throws RecognitionException {
        try {
            // InternalTaskDSL.g:680:1: ( ruleExpressionBalance EOF )
            // InternalTaskDSL.g:681:1: ruleExpressionBalance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBalanceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionBalance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBalanceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalTaskDSL.g:688:1: ruleExpressionBalance : ( ( rule__ExpressionBalance__ValueAssignment ) ) ;
    public final void ruleExpressionBalance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:692:2: ( ( ( rule__ExpressionBalance__ValueAssignment ) ) )
            // InternalTaskDSL.g:693:2: ( ( rule__ExpressionBalance__ValueAssignment ) )
            {
            // InternalTaskDSL.g:693:2: ( ( rule__ExpressionBalance__ValueAssignment ) )
            // InternalTaskDSL.g:694:3: ( rule__ExpressionBalance__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBalanceAccess().getValueAssignment()); 
            }
            // InternalTaskDSL.g:695:3: ( rule__ExpressionBalance__ValueAssignment )
            // InternalTaskDSL.g:695:4: rule__ExpressionBalance__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBalance__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBalanceAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleExpressionBalance"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalTaskDSL.g:704:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:705:1: ( ruleBooleanExpression EOF )
            // InternalTaskDSL.g:706:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalTaskDSL.g:713:1: ruleBooleanExpression : ( ruleBooleanExpressionLevel1 ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:717:2: ( ( ruleBooleanExpressionLevel1 ) )
            // InternalTaskDSL.g:718:2: ( ruleBooleanExpressionLevel1 )
            {
            // InternalTaskDSL.g:718:2: ( ruleBooleanExpressionLevel1 )
            // InternalTaskDSL.g:719:3: ruleBooleanExpressionLevel1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall()); 
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel1"
    // InternalTaskDSL.g:729:1: entryRuleBooleanExpressionLevel1 : ruleBooleanExpressionLevel1 EOF ;
    public final void entryRuleBooleanExpressionLevel1() throws RecognitionException {
        try {
            // InternalTaskDSL.g:730:1: ( ruleBooleanExpressionLevel1 EOF )
            // InternalTaskDSL.g:731:1: ruleBooleanExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel1"


    // $ANTLR start "ruleBooleanExpressionLevel1"
    // InternalTaskDSL.g:738:1: ruleBooleanExpressionLevel1 : ( ( rule__BooleanExpressionLevel1__Group__0 ) ) ;
    public final void ruleBooleanExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:742:2: ( ( ( rule__BooleanExpressionLevel1__Group__0 ) ) )
            // InternalTaskDSL.g:743:2: ( ( rule__BooleanExpressionLevel1__Group__0 ) )
            {
            // InternalTaskDSL.g:743:2: ( ( rule__BooleanExpressionLevel1__Group__0 ) )
            // InternalTaskDSL.g:744:3: ( rule__BooleanExpressionLevel1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getGroup()); 
            }
            // InternalTaskDSL.g:745:3: ( rule__BooleanExpressionLevel1__Group__0 )
            // InternalTaskDSL.g:745:4: rule__BooleanExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getGroup()); 
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
    // $ANTLR end "ruleBooleanExpressionLevel1"


    // $ANTLR start "entryRuleBooleanExpressionLevel2"
    // InternalTaskDSL.g:754:1: entryRuleBooleanExpressionLevel2 : ruleBooleanExpressionLevel2 EOF ;
    public final void entryRuleBooleanExpressionLevel2() throws RecognitionException {
        try {
            // InternalTaskDSL.g:755:1: ( ruleBooleanExpressionLevel2 EOF )
            // InternalTaskDSL.g:756:1: ruleBooleanExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel2"


    // $ANTLR start "ruleBooleanExpressionLevel2"
    // InternalTaskDSL.g:763:1: ruleBooleanExpressionLevel2 : ( ( rule__BooleanExpressionLevel2__Alternatives ) ) ;
    public final void ruleBooleanExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:767:2: ( ( ( rule__BooleanExpressionLevel2__Alternatives ) ) )
            // InternalTaskDSL.g:768:2: ( ( rule__BooleanExpressionLevel2__Alternatives ) )
            {
            // InternalTaskDSL.g:768:2: ( ( rule__BooleanExpressionLevel2__Alternatives ) )
            // InternalTaskDSL.g:769:3: ( rule__BooleanExpressionLevel2__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:770:3: ( rule__BooleanExpressionLevel2__Alternatives )
            // InternalTaskDSL.g:770:4: rule__BooleanExpressionLevel2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel2__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives()); 
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
    // $ANTLR end "ruleBooleanExpressionLevel2"


    // $ANTLR start "entryRuleNotExpression"
    // InternalTaskDSL.g:779:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:780:1: ( ruleNotExpression EOF )
            // InternalTaskDSL.g:781:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalTaskDSL.g:788:1: ruleNotExpression : ( ( rule__NotExpression__Group__0 ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:792:2: ( ( ( rule__NotExpression__Group__0 ) ) )
            // InternalTaskDSL.g:793:2: ( ( rule__NotExpression__Group__0 ) )
            {
            // InternalTaskDSL.g:793:2: ( ( rule__NotExpression__Group__0 ) )
            // InternalTaskDSL.g:794:3: ( rule__NotExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:795:3: ( rule__NotExpression__Group__0 )
            // InternalTaskDSL.g:795:4: rule__NotExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel3"
    // InternalTaskDSL.g:804:1: entryRuleBooleanExpressionLevel3 : ruleBooleanExpressionLevel3 EOF ;
    public final void entryRuleBooleanExpressionLevel3() throws RecognitionException {
        try {
            // InternalTaskDSL.g:805:1: ( ruleBooleanExpressionLevel3 EOF )
            // InternalTaskDSL.g:806:1: ruleBooleanExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionLevel3"


    // $ANTLR start "ruleBooleanExpressionLevel3"
    // InternalTaskDSL.g:813:1: ruleBooleanExpressionLevel3 : ( ( rule__BooleanExpressionLevel3__Alternatives ) ) ;
    public final void ruleBooleanExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:817:2: ( ( ( rule__BooleanExpressionLevel3__Alternatives ) ) )
            // InternalTaskDSL.g:818:2: ( ( rule__BooleanExpressionLevel3__Alternatives ) )
            {
            // InternalTaskDSL.g:818:2: ( ( rule__BooleanExpressionLevel3__Alternatives ) )
            // InternalTaskDSL.g:819:3: ( rule__BooleanExpressionLevel3__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives()); 
            }
            // InternalTaskDSL.g:820:3: ( rule__BooleanExpressionLevel3__Alternatives )
            // InternalTaskDSL.g:820:4: rule__BooleanExpressionLevel3__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel3__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives()); 
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
    // $ANTLR end "ruleBooleanExpressionLevel3"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalTaskDSL.g:829:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalTaskDSL.g:830:1: ( ruleComparisonExpression EOF )
            // InternalTaskDSL.g:831:1: ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalTaskDSL.g:838:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:842:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalTaskDSL.g:843:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalTaskDSL.g:843:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalTaskDSL.g:844:3: ( rule__ComparisonExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            }
            // InternalTaskDSL.g:845:3: ( rule__ComparisonExpression__Group__0 )
            // InternalTaskDSL.g:845:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBooleanExpressionBracket"
    // InternalTaskDSL.g:854:1: entryRuleBooleanExpressionBracket : ruleBooleanExpressionBracket EOF ;
    public final void entryRuleBooleanExpressionBracket() throws RecognitionException {
        try {
            // InternalTaskDSL.g:855:1: ( ruleBooleanExpressionBracket EOF )
            // InternalTaskDSL.g:856:1: ruleBooleanExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionBracket"


    // $ANTLR start "ruleBooleanExpressionBracket"
    // InternalTaskDSL.g:863:1: ruleBooleanExpressionBracket : ( ( rule__BooleanExpressionBracket__Group__0 ) ) ;
    public final void ruleBooleanExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:867:2: ( ( ( rule__BooleanExpressionBracket__Group__0 ) ) )
            // InternalTaskDSL.g:868:2: ( ( rule__BooleanExpressionBracket__Group__0 ) )
            {
            // InternalTaskDSL.g:868:2: ( ( rule__BooleanExpressionBracket__Group__0 ) )
            // InternalTaskDSL.g:869:3: ( rule__BooleanExpressionBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getGroup()); 
            }
            // InternalTaskDSL.g:870:3: ( rule__BooleanExpressionBracket__Group__0 )
            // InternalTaskDSL.g:870:4: rule__BooleanExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getGroup()); 
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
    // $ANTLR end "ruleBooleanExpressionBracket"


    // $ANTLR start "entryRuleBooleanExpressionConstant"
    // InternalTaskDSL.g:879:1: entryRuleBooleanExpressionConstant : ruleBooleanExpressionConstant EOF ;
    public final void entryRuleBooleanExpressionConstant() throws RecognitionException {
        try {
            // InternalTaskDSL.g:880:1: ( ruleBooleanExpressionConstant EOF )
            // InternalTaskDSL.g:881:1: ruleBooleanExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanExpressionConstant"


    // $ANTLR start "ruleBooleanExpressionConstant"
    // InternalTaskDSL.g:888:1: ruleBooleanExpressionConstant : ( ( rule__BooleanExpressionConstant__ValueAssignment ) ) ;
    public final void ruleBooleanExpressionConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:892:2: ( ( ( rule__BooleanExpressionConstant__ValueAssignment ) ) )
            // InternalTaskDSL.g:893:2: ( ( rule__BooleanExpressionConstant__ValueAssignment ) )
            {
            // InternalTaskDSL.g:893:2: ( ( rule__BooleanExpressionConstant__ValueAssignment ) )
            // InternalTaskDSL.g:894:3: ( rule__BooleanExpressionConstant__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment()); 
            }
            // InternalTaskDSL.g:895:3: ( rule__BooleanExpressionConstant__ValueAssignment )
            // InternalTaskDSL.g:895:4: rule__BooleanExpressionConstant__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionConstant__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleBooleanExpressionConstant"


    // $ANTLR start "ruleTimeUnit"
    // InternalTaskDSL.g:904:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:908:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalTaskDSL.g:909:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalTaskDSL.g:909:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalTaskDSL.g:910:3: ( rule__TimeUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:911:3: ( rule__TimeUnit__Alternatives )
            // InternalTaskDSL.g:911:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeUnitAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "ruleBalance"
    // InternalTaskDSL.g:920:1: ruleBalance : ( ( 'balance' ) ) ;
    public final void ruleBalance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:924:1: ( ( ( 'balance' ) ) )
            // InternalTaskDSL.g:925:2: ( ( 'balance' ) )
            {
            // InternalTaskDSL.g:925:2: ( ( 'balance' ) )
            // InternalTaskDSL.g:926:3: ( 'balance' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration()); 
            }
            // InternalTaskDSL.g:927:3: ( 'balance' )
            // InternalTaskDSL.g:927:4: 'balance'
            {
            match(input,12,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBalanceAccess().getBALANCEEnumLiteralDeclaration()); 
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
    // $ANTLR end "ruleBalance"


    // $ANTLR start "ruleBinaryBooleanOperator"
    // InternalTaskDSL.g:936:1: ruleBinaryBooleanOperator : ( ( rule__BinaryBooleanOperator__Alternatives ) ) ;
    public final void ruleBinaryBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:940:1: ( ( ( rule__BinaryBooleanOperator__Alternatives ) ) )
            // InternalTaskDSL.g:941:2: ( ( rule__BinaryBooleanOperator__Alternatives ) )
            {
            // InternalTaskDSL.g:941:2: ( ( rule__BinaryBooleanOperator__Alternatives ) )
            // InternalTaskDSL.g:942:3: ( rule__BinaryBooleanOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:943:3: ( rule__BinaryBooleanOperator__Alternatives )
            // InternalTaskDSL.g:943:4: rule__BinaryBooleanOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBooleanOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBinaryBooleanOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalTaskDSL.g:952:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:956:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalTaskDSL.g:957:2: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalTaskDSL.g:957:2: ( ( rule__CompareOperator__Alternatives ) )
            // InternalTaskDSL.g:958:3: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalTaskDSL.g:959:3: ( rule__CompareOperator__Alternatives )
            // InternalTaskDSL.g:959:4: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rule__Planning__Alternatives_3"
    // InternalTaskDSL.g:967:1: rule__Planning__Alternatives_3 : ( ( ( rule__Planning__PersonsAssignment_3_0 ) ) | ( ( rule__Planning__TasksAssignment_3_1 ) ) | ( ( rule__Planning__ArraysAssignment_3_2 ) ) );
    public final void rule__Planning__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:971:1: ( ( ( rule__Planning__PersonsAssignment_3_0 ) ) | ( ( rule__Planning__TasksAssignment_3_1 ) ) | ( ( rule__Planning__ArraysAssignment_3_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTaskDSL.g:972:2: ( ( rule__Planning__PersonsAssignment_3_0 ) )
                    {
                    // InternalTaskDSL.g:972:2: ( ( rule__Planning__PersonsAssignment_3_0 ) )
                    // InternalTaskDSL.g:973:3: ( rule__Planning__PersonsAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlanningAccess().getPersonsAssignment_3_0()); 
                    }
                    // InternalTaskDSL.g:974:3: ( rule__Planning__PersonsAssignment_3_0 )
                    // InternalTaskDSL.g:974:4: rule__Planning__PersonsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__PersonsAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlanningAccess().getPersonsAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:978:2: ( ( rule__Planning__TasksAssignment_3_1 ) )
                    {
                    // InternalTaskDSL.g:978:2: ( ( rule__Planning__TasksAssignment_3_1 ) )
                    // InternalTaskDSL.g:979:3: ( rule__Planning__TasksAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlanningAccess().getTasksAssignment_3_1()); 
                    }
                    // InternalTaskDSL.g:980:3: ( rule__Planning__TasksAssignment_3_1 )
                    // InternalTaskDSL.g:980:4: rule__Planning__TasksAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__TasksAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlanningAccess().getTasksAssignment_3_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:984:2: ( ( rule__Planning__ArraysAssignment_3_2 ) )
                    {
                    // InternalTaskDSL.g:984:2: ( ( rule__Planning__ArraysAssignment_3_2 ) )
                    // InternalTaskDSL.g:985:3: ( rule__Planning__ArraysAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlanningAccess().getArraysAssignment_3_2()); 
                    }
                    // InternalTaskDSL.g:986:3: ( rule__Planning__ArraysAssignment_3_2 )
                    // InternalTaskDSL.g:986:4: rule__Planning__ArraysAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__ArraysAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlanningAccess().getArraysAssignment_3_2()); 
                    }

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


    // $ANTLR start "rule__ArraySpecification__Alternatives_1"
    // InternalTaskDSL.g:994:1: rule__ArraySpecification__Alternatives_1 : ( ( ( rule__ArraySpecification__IntervalAssignment_1_0 ) ) | ( '*' ) );
    public final void rule__ArraySpecification__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:998:1: ( ( ( rule__ArraySpecification__IntervalAssignment_1_0 ) ) | ( '*' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||LA2_0==12||(LA2_0>=46 && LA2_0<=47)||LA2_0==52) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTaskDSL.g:999:2: ( ( rule__ArraySpecification__IntervalAssignment_1_0 ) )
                    {
                    // InternalTaskDSL.g:999:2: ( ( rule__ArraySpecification__IntervalAssignment_1_0 ) )
                    // InternalTaskDSL.g:1000:3: ( rule__ArraySpecification__IntervalAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArraySpecificationAccess().getIntervalAssignment_1_0()); 
                    }
                    // InternalTaskDSL.g:1001:3: ( rule__ArraySpecification__IntervalAssignment_1_0 )
                    // InternalTaskDSL.g:1001:4: rule__ArraySpecification__IntervalAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArraySpecification__IntervalAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArraySpecificationAccess().getIntervalAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1005:2: ( '*' )
                    {
                    // InternalTaskDSL.g:1005:2: ( '*' )
                    // InternalTaskDSL.g:1006:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArraySpecificationAccess().getAsteriskKeyword_1_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArraySpecificationAccess().getAsteriskKeyword_1_1()); 
                    }

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
    // $ANTLR end "rule__ArraySpecification__Alternatives_1"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalTaskDSL.g:1015:1: rule__Action__Alternatives : ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1019:1: ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt3=1;
                }
                break;
            case 41:
                {
                alt3=2;
                }
                break;
            case 42:
                {
                alt3=3;
                }
                break;
            case 43:
            case 45:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTaskDSL.g:1020:2: ( ruleLunchAction )
                    {
                    // InternalTaskDSL.g:1020:2: ( ruleLunchAction )
                    // InternalTaskDSL.g:1021:3: ruleLunchAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLunchAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1026:2: ( ruleMeetingAction )
                    {
                    // InternalTaskDSL.g:1026:2: ( ruleMeetingAction )
                    // InternalTaskDSL.g:1027:3: ruleMeetingAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMeetingAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1032:2: ( rulePaperAction )
                    {
                    // InternalTaskDSL.g:1032:2: ( rulePaperAction )
                    // InternalTaskDSL.g:1033:3: rulePaperAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePaperAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1038:2: ( rulePaymentAction )
                    {
                    // InternalTaskDSL.g:1038:2: ( rulePaymentAction )
                    // InternalTaskDSL.g:1039:3: rulePaymentAction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePaymentAction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 
                    }

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
    // InternalTaskDSL.g:1048:1: rule__ExpressionLevel1__Alternatives_1 : ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) );
    public final void rule__ExpressionLevel1__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1052:1: ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==46) ) {
                alt4=1;
            }
            else if ( (LA4_0==47) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTaskDSL.g:1053:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    {
                    // InternalTaskDSL.g:1053:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    // InternalTaskDSL.g:1054:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    }
                    // InternalTaskDSL.g:1055:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    // InternalTaskDSL.g:1055:4: rule__ExpressionLevel1__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1059:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    {
                    // InternalTaskDSL.g:1059:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    // InternalTaskDSL.g:1060:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
                    }
                    // InternalTaskDSL.g:1061:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    // InternalTaskDSL.g:1061:4: rule__ExpressionLevel1__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
                    }

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
    // InternalTaskDSL.g:1069:1: rule__ExpressionLevel2__Alternatives_1 : ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) );
    public final void rule__ExpressionLevel2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1073:1: ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 48:
                {
                alt5=2;
                }
                break;
            case 49:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 50:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTaskDSL.g:1074:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    {
                    // InternalTaskDSL.g:1074:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    // InternalTaskDSL.g:1075:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    }
                    // InternalTaskDSL.g:1076:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    // InternalTaskDSL.g:1076:4: rule__ExpressionLevel2__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1080:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    {
                    // InternalTaskDSL.g:1080:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    // InternalTaskDSL.g:1081:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    }
                    // InternalTaskDSL.g:1082:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    // InternalTaskDSL.g:1082:4: rule__ExpressionLevel2__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1086:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    {
                    // InternalTaskDSL.g:1086:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    // InternalTaskDSL.g:1087:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    }
                    // InternalTaskDSL.g:1088:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    // InternalTaskDSL.g:1088:4: rule__ExpressionLevel2__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1092:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    {
                    // InternalTaskDSL.g:1092:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    // InternalTaskDSL.g:1093:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    }
                    // InternalTaskDSL.g:1094:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    // InternalTaskDSL.g:1094:4: rule__ExpressionLevel2__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDSL.g:1098:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    {
                    // InternalTaskDSL.g:1098:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    // InternalTaskDSL.g:1099:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
                    }
                    // InternalTaskDSL.g:1100:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    // InternalTaskDSL.g:1100:4: rule__ExpressionLevel2__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
                    }

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
    // InternalTaskDSL.g:1108:1: rule__ExpressionLevel4__Alternatives : ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) );
    public final void rule__ExpressionLevel4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1112:1: ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt6=1;
                }
                break;
            case 46:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
            case 12:
            case 52:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTaskDSL.g:1113:2: ( ruleExpressionMinus )
                    {
                    // InternalTaskDSL.g:1113:2: ( ruleExpressionMinus )
                    // InternalTaskDSL.g:1114:3: ruleExpressionMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionMinus();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1119:2: ( ruleExpressionPlus )
                    {
                    // InternalTaskDSL.g:1119:2: ( ruleExpressionPlus )
                    // InternalTaskDSL.g:1120:3: ruleExpressionPlus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionPlus();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1125:2: ( ruleExpressionLevel5 )
                    {
                    // InternalTaskDSL.g:1125:2: ( ruleExpressionLevel5 )
                    // InternalTaskDSL.g:1126:3: ruleExpressionLevel5
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionLevel5();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
                    }

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
    // InternalTaskDSL.g:1135:1: rule__ExpressionLevel5__Alternatives : ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) | ( ruleExpressionBalance ) );
    public final void rule__ExpressionLevel5__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1139:1: ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) | ( ruleExpressionBalance ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case 12:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTaskDSL.g:1140:2: ( ruleExpressionBracket )
                    {
                    // InternalTaskDSL.g:1140:2: ( ruleExpressionBracket )
                    // InternalTaskDSL.g:1141:3: ruleExpressionBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1146:2: ( ruleExpressionConstantInt )
                    {
                    // InternalTaskDSL.g:1146:2: ( ruleExpressionConstantInt )
                    // InternalTaskDSL.g:1147:3: ruleExpressionConstantInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionConstantInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1152:2: ( ruleExpressionBalance )
                    {
                    // InternalTaskDSL.g:1152:2: ( ruleExpressionBalance )
                    // InternalTaskDSL.g:1153:3: ruleExpressionBalance
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionBalance();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionBalanceParserRuleCall_2()); 
                    }

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


    // $ANTLR start "rule__BooleanExpressionLevel2__Alternatives"
    // InternalTaskDSL.g:1162:1: rule__BooleanExpressionLevel2__Alternatives : ( ( ruleNotExpression ) | ( ruleBooleanExpressionLevel3 ) );
    public final void rule__BooleanExpressionLevel2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1166:1: ( ( ruleNotExpression ) | ( ruleBooleanExpressionLevel3 ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==54) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT||LA8_0==RULE_BOOL_LITERAL||LA8_0==12||(LA8_0>=46 && LA8_0<=47)||LA8_0==52) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDSL.g:1167:2: ( ruleNotExpression )
                    {
                    // InternalTaskDSL.g:1167:2: ( ruleNotExpression )
                    // InternalTaskDSL.g:1168:3: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1173:2: ( ruleBooleanExpressionLevel3 )
                    {
                    // InternalTaskDSL.g:1173:2: ( ruleBooleanExpressionLevel3 )
                    // InternalTaskDSL.g:1174:3: ruleBooleanExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__BooleanExpressionLevel2__Alternatives"


    // $ANTLR start "rule__BooleanExpressionLevel3__Alternatives"
    // InternalTaskDSL.g:1183:1: rule__BooleanExpressionLevel3__Alternatives : ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) );
    public final void rule__BooleanExpressionLevel3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1187:1: ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 12:
            case 46:
            case 47:
                {
                alt9=1;
                }
                break;
            case 52:
                {
                int LA9_3 = input.LA(2);

                if ( (synpred17_InternalTaskDSL()) ) {
                    alt9=1;
                }
                else if ( (synpred18_InternalTaskDSL()) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTaskDSL.g:1188:2: ( ( ruleComparisonExpression ) )
                    {
                    // InternalTaskDSL.g:1188:2: ( ( ruleComparisonExpression ) )
                    // InternalTaskDSL.g:1189:3: ( ruleComparisonExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
                    }
                    // InternalTaskDSL.g:1190:3: ( ruleComparisonExpression )
                    // InternalTaskDSL.g:1190:4: ruleComparisonExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1194:2: ( ruleBooleanExpressionBracket )
                    {
                    // InternalTaskDSL.g:1194:2: ( ruleBooleanExpressionBracket )
                    // InternalTaskDSL.g:1195:3: ruleBooleanExpressionBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1200:2: ( ruleBooleanExpressionConstant )
                    {
                    // InternalTaskDSL.g:1200:2: ( ruleBooleanExpressionConstant )
                    // InternalTaskDSL.g:1201:3: ruleBooleanExpressionConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__BooleanExpressionLevel3__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalTaskDSL.g:1210:1: rule__TimeUnit__Alternatives : ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1214:1: ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 16:
                {
                alt10=3;
                }
                break;
            case 17:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTaskDSL.g:1215:2: ( ( 'min' ) )
                    {
                    // InternalTaskDSL.g:1215:2: ( ( 'min' ) )
                    // InternalTaskDSL.g:1216:3: ( 'min' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 
                    }
                    // InternalTaskDSL.g:1217:3: ( 'min' )
                    // InternalTaskDSL.g:1217:4: 'min'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1221:2: ( ( 'hour' ) )
                    {
                    // InternalTaskDSL.g:1221:2: ( ( 'hour' ) )
                    // InternalTaskDSL.g:1222:3: ( 'hour' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 
                    }
                    // InternalTaskDSL.g:1223:3: ( 'hour' )
                    // InternalTaskDSL.g:1223:4: 'hour'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1227:2: ( ( 'day' ) )
                    {
                    // InternalTaskDSL.g:1227:2: ( ( 'day' ) )
                    // InternalTaskDSL.g:1228:3: ( 'day' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 
                    }
                    // InternalTaskDSL.g:1229:3: ( 'day' )
                    // InternalTaskDSL.g:1229:4: 'day'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1233:2: ( ( 'week' ) )
                    {
                    // InternalTaskDSL.g:1233:2: ( ( 'week' ) )
                    // InternalTaskDSL.g:1234:3: ( 'week' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 
                    }
                    // InternalTaskDSL.g:1235:3: ( 'week' )
                    // InternalTaskDSL.g:1235:4: 'week'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 
                    }

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


    // $ANTLR start "rule__BinaryBooleanOperator__Alternatives"
    // InternalTaskDSL.g:1243:1: rule__BinaryBooleanOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryBooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1247:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTaskDSL.g:1248:2: ( ( 'AND' ) )
                    {
                    // InternalTaskDSL.g:1248:2: ( ( 'AND' ) )
                    // InternalTaskDSL.g:1249:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalTaskDSL.g:1250:3: ( 'AND' )
                    // InternalTaskDSL.g:1250:4: 'AND'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1254:2: ( ( 'OR' ) )
                    {
                    // InternalTaskDSL.g:1254:2: ( ( 'OR' ) )
                    // InternalTaskDSL.g:1255:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalTaskDSL.g:1256:3: ( 'OR' )
                    // InternalTaskDSL.g:1256:4: 'OR'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__BinaryBooleanOperator__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalTaskDSL.g:1264:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1268:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 21:
                {
                alt12=2;
                }
                break;
            case 22:
                {
                alt12=3;
                }
                break;
            case 23:
                {
                alt12=4;
                }
                break;
            case 24:
                {
                alt12=5;
                }
                break;
            case 25:
                {
                alt12=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTaskDSL.g:1269:2: ( ( '==' ) )
                    {
                    // InternalTaskDSL.g:1269:2: ( ( '==' ) )
                    // InternalTaskDSL.g:1270:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalTaskDSL.g:1271:3: ( '==' )
                    // InternalTaskDSL.g:1271:4: '=='
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDSL.g:1275:2: ( ( '!=' ) )
                    {
                    // InternalTaskDSL.g:1275:2: ( ( '!=' ) )
                    // InternalTaskDSL.g:1276:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    }
                    // InternalTaskDSL.g:1277:3: ( '!=' )
                    // InternalTaskDSL.g:1277:4: '!='
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDSL.g:1281:2: ( ( '>=' ) )
                    {
                    // InternalTaskDSL.g:1281:2: ( ( '>=' ) )
                    // InternalTaskDSL.g:1282:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalTaskDSL.g:1283:3: ( '>=' )
                    // InternalTaskDSL.g:1283:4: '>='
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDSL.g:1287:2: ( ( '>' ) )
                    {
                    // InternalTaskDSL.g:1287:2: ( ( '>' ) )
                    // InternalTaskDSL.g:1288:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    }
                    // InternalTaskDSL.g:1289:3: ( '>' )
                    // InternalTaskDSL.g:1289:4: '>'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDSL.g:1293:2: ( ( '<=' ) )
                    {
                    // InternalTaskDSL.g:1293:2: ( ( '<=' ) )
                    // InternalTaskDSL.g:1294:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalTaskDSL.g:1295:3: ( '<=' )
                    // InternalTaskDSL.g:1295:4: '<='
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTaskDSL.g:1299:2: ( ( '<' ) )
                    {
                    // InternalTaskDSL.g:1299:2: ( ( '<' ) )
                    // InternalTaskDSL.g:1300:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    }
                    // InternalTaskDSL.g:1301:3: ( '<' )
                    // InternalTaskDSL.g:1301:4: '<'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    }

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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__Planning__Group__0"
    // InternalTaskDSL.g:1309:1: rule__Planning__Group__0 : rule__Planning__Group__0__Impl rule__Planning__Group__1 ;
    public final void rule__Planning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1313:1: ( rule__Planning__Group__0__Impl rule__Planning__Group__1 )
            // InternalTaskDSL.g:1314:2: rule__Planning__Group__0__Impl rule__Planning__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Planning__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:1321:1: rule__Planning__Group__0__Impl : ( 'Planning' ) ;
    public final void rule__Planning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1325:1: ( ( 'Planning' ) )
            // InternalTaskDSL.g:1326:1: ( 'Planning' )
            {
            // InternalTaskDSL.g:1326:1: ( 'Planning' )
            // InternalTaskDSL.g:1327:2: 'Planning'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 
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
    // $ANTLR end "rule__Planning__Group__0__Impl"


    // $ANTLR start "rule__Planning__Group__1"
    // InternalTaskDSL.g:1336:1: rule__Planning__Group__1 : rule__Planning__Group__1__Impl rule__Planning__Group__2 ;
    public final void rule__Planning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1340:1: ( rule__Planning__Group__1__Impl rule__Planning__Group__2 )
            // InternalTaskDSL.g:1341:2: rule__Planning__Group__1__Impl rule__Planning__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:1348:1: rule__Planning__Group__1__Impl : ( ( rule__Planning__NameAssignment_1 ) ) ;
    public final void rule__Planning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1352:1: ( ( ( rule__Planning__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:1353:1: ( ( rule__Planning__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:1353:1: ( ( rule__Planning__NameAssignment_1 ) )
            // InternalTaskDSL.g:1354:2: ( rule__Planning__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getNameAssignment_1()); 
            }
            // InternalTaskDSL.g:1355:2: ( rule__Planning__NameAssignment_1 )
            // InternalTaskDSL.g:1355:3: rule__Planning__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Planning__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Planning__Group__1__Impl"


    // $ANTLR start "rule__Planning__Group__2"
    // InternalTaskDSL.g:1363:1: rule__Planning__Group__2 : rule__Planning__Group__2__Impl rule__Planning__Group__3 ;
    public final void rule__Planning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1367:1: ( rule__Planning__Group__2__Impl rule__Planning__Group__3 )
            // InternalTaskDSL.g:1368:2: rule__Planning__Group__2__Impl rule__Planning__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:1375:1: rule__Planning__Group__2__Impl : ( ( rule__Planning__AnonymousAssignment_2 )? ) ;
    public final void rule__Planning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1379:1: ( ( ( rule__Planning__AnonymousAssignment_2 )? ) )
            // InternalTaskDSL.g:1380:1: ( ( rule__Planning__AnonymousAssignment_2 )? )
            {
            // InternalTaskDSL.g:1380:1: ( ( rule__Planning__AnonymousAssignment_2 )? )
            // InternalTaskDSL.g:1381:2: ( rule__Planning__AnonymousAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAnonymousAssignment_2()); 
            }
            // InternalTaskDSL.g:1382:2: ( rule__Planning__AnonymousAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==55) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTaskDSL.g:1382:3: rule__Planning__AnonymousAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__AnonymousAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAnonymousAssignment_2()); 
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
    // $ANTLR end "rule__Planning__Group__2__Impl"


    // $ANTLR start "rule__Planning__Group__3"
    // InternalTaskDSL.g:1390:1: rule__Planning__Group__3 : rule__Planning__Group__3__Impl rule__Planning__Group__4 ;
    public final void rule__Planning__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1394:1: ( rule__Planning__Group__3__Impl rule__Planning__Group__4 )
            // InternalTaskDSL.g:1395:2: rule__Planning__Group__3__Impl rule__Planning__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:1402:1: rule__Planning__Group__3__Impl : ( ( rule__Planning__Alternatives_3 )* ) ;
    public final void rule__Planning__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1406:1: ( ( ( rule__Planning__Alternatives_3 )* ) )
            // InternalTaskDSL.g:1407:1: ( ( rule__Planning__Alternatives_3 )* )
            {
            // InternalTaskDSL.g:1407:1: ( ( rule__Planning__Alternatives_3 )* )
            // InternalTaskDSL.g:1408:2: ( rule__Planning__Alternatives_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAlternatives_3()); 
            }
            // InternalTaskDSL.g:1409:2: ( rule__Planning__Alternatives_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33||(LA14_0>=35 && LA14_0<=36)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTaskDSL.g:1409:3: rule__Planning__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Planning__Alternatives_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__Planning__Group__3__Impl"


    // $ANTLR start "rule__Planning__Group__4"
    // InternalTaskDSL.g:1417:1: rule__Planning__Group__4 : rule__Planning__Group__4__Impl rule__Planning__Group__5 ;
    public final void rule__Planning__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1421:1: ( rule__Planning__Group__4__Impl rule__Planning__Group__5 )
            // InternalTaskDSL.g:1422:2: rule__Planning__Group__4__Impl rule__Planning__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Planning__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Planning__Group__4"


    // $ANTLR start "rule__Planning__Group__4__Impl"
    // InternalTaskDSL.g:1429:1: rule__Planning__Group__4__Impl : ( ( rule__Planning__MyintegersAssignment_4 )* ) ;
    public final void rule__Planning__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1433:1: ( ( ( rule__Planning__MyintegersAssignment_4 )* ) )
            // InternalTaskDSL.g:1434:1: ( ( rule__Planning__MyintegersAssignment_4 )* )
            {
            // InternalTaskDSL.g:1434:1: ( ( rule__Planning__MyintegersAssignment_4 )* )
            // InternalTaskDSL.g:1435:2: ( rule__Planning__MyintegersAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getMyintegersAssignment_4()); 
            }
            // InternalTaskDSL.g:1436:2: ( rule__Planning__MyintegersAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTaskDSL.g:1436:3: rule__Planning__MyintegersAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Planning__MyintegersAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getMyintegersAssignment_4()); 
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
    // $ANTLR end "rule__Planning__Group__4__Impl"


    // $ANTLR start "rule__Planning__Group__5"
    // InternalTaskDSL.g:1444:1: rule__Planning__Group__5 : rule__Planning__Group__5__Impl ;
    public final void rule__Planning__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1448:1: ( rule__Planning__Group__5__Impl )
            // InternalTaskDSL.g:1449:2: rule__Planning__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Planning__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Planning__Group__5"


    // $ANTLR start "rule__Planning__Group__5__Impl"
    // InternalTaskDSL.g:1455:1: rule__Planning__Group__5__Impl : ( ( rule__Planning__MyarraysAssignment_5 )* ) ;
    public final void rule__Planning__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1459:1: ( ( ( rule__Planning__MyarraysAssignment_5 )* ) )
            // InternalTaskDSL.g:1460:1: ( ( rule__Planning__MyarraysAssignment_5 )* )
            {
            // InternalTaskDSL.g:1460:1: ( ( rule__Planning__MyarraysAssignment_5 )* )
            // InternalTaskDSL.g:1461:2: ( rule__Planning__MyarraysAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getMyarraysAssignment_5()); 
            }
            // InternalTaskDSL.g:1462:2: ( rule__Planning__MyarraysAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTaskDSL.g:1462:3: rule__Planning__MyarraysAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Planning__MyarraysAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getMyarraysAssignment_5()); 
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
    // $ANTLR end "rule__Planning__Group__5__Impl"


    // $ANTLR start "rule__MyInteger__Group__0"
    // InternalTaskDSL.g:1471:1: rule__MyInteger__Group__0 : rule__MyInteger__Group__0__Impl rule__MyInteger__Group__1 ;
    public final void rule__MyInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1475:1: ( rule__MyInteger__Group__0__Impl rule__MyInteger__Group__1 )
            // InternalTaskDSL.g:1476:2: rule__MyInteger__Group__0__Impl rule__MyInteger__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MyInteger__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MyInteger__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyInteger__Group__0"


    // $ANTLR start "rule__MyInteger__Group__0__Impl"
    // InternalTaskDSL.g:1483:1: rule__MyInteger__Group__0__Impl : ( 'INT' ) ;
    public final void rule__MyInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1487:1: ( ( 'INT' ) )
            // InternalTaskDSL.g:1488:1: ( 'INT' )
            {
            // InternalTaskDSL.g:1488:1: ( 'INT' )
            // InternalTaskDSL.g:1489:2: 'INT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyIntegerAccess().getINTKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyIntegerAccess().getINTKeyword_0()); 
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
    // $ANTLR end "rule__MyInteger__Group__0__Impl"


    // $ANTLR start "rule__MyInteger__Group__1"
    // InternalTaskDSL.g:1498:1: rule__MyInteger__Group__1 : rule__MyInteger__Group__1__Impl rule__MyInteger__Group__2 ;
    public final void rule__MyInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1502:1: ( rule__MyInteger__Group__1__Impl rule__MyInteger__Group__2 )
            // InternalTaskDSL.g:1503:2: rule__MyInteger__Group__1__Impl rule__MyInteger__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MyInteger__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MyInteger__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyInteger__Group__1"


    // $ANTLR start "rule__MyInteger__Group__1__Impl"
    // InternalTaskDSL.g:1510:1: rule__MyInteger__Group__1__Impl : ( ( rule__MyInteger__NameAssignment_1 ) ) ;
    public final void rule__MyInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1514:1: ( ( ( rule__MyInteger__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:1515:1: ( ( rule__MyInteger__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:1515:1: ( ( rule__MyInteger__NameAssignment_1 ) )
            // InternalTaskDSL.g:1516:2: ( rule__MyInteger__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyIntegerAccess().getNameAssignment_1()); 
            }
            // InternalTaskDSL.g:1517:2: ( rule__MyInteger__NameAssignment_1 )
            // InternalTaskDSL.g:1517:3: rule__MyInteger__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MyInteger__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyIntegerAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__MyInteger__Group__1__Impl"


    // $ANTLR start "rule__MyInteger__Group__2"
    // InternalTaskDSL.g:1525:1: rule__MyInteger__Group__2 : rule__MyInteger__Group__2__Impl ;
    public final void rule__MyInteger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1529:1: ( rule__MyInteger__Group__2__Impl )
            // InternalTaskDSL.g:1530:2: rule__MyInteger__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyInteger__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyInteger__Group__2"


    // $ANTLR start "rule__MyInteger__Group__2__Impl"
    // InternalTaskDSL.g:1536:1: rule__MyInteger__Group__2__Impl : ( ( rule__MyInteger__NumberAssignment_2 ) ) ;
    public final void rule__MyInteger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1540:1: ( ( ( rule__MyInteger__NumberAssignment_2 ) ) )
            // InternalTaskDSL.g:1541:1: ( ( rule__MyInteger__NumberAssignment_2 ) )
            {
            // InternalTaskDSL.g:1541:1: ( ( rule__MyInteger__NumberAssignment_2 ) )
            // InternalTaskDSL.g:1542:2: ( rule__MyInteger__NumberAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyIntegerAccess().getNumberAssignment_2()); 
            }
            // InternalTaskDSL.g:1543:2: ( rule__MyInteger__NumberAssignment_2 )
            // InternalTaskDSL.g:1543:3: rule__MyInteger__NumberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MyInteger__NumberAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyIntegerAccess().getNumberAssignment_2()); 
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
    // $ANTLR end "rule__MyInteger__Group__2__Impl"


    // $ANTLR start "rule__MyArray__Group__0"
    // InternalTaskDSL.g:1552:1: rule__MyArray__Group__0 : rule__MyArray__Group__0__Impl rule__MyArray__Group__1 ;
    public final void rule__MyArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1556:1: ( rule__MyArray__Group__0__Impl rule__MyArray__Group__1 )
            // InternalTaskDSL.g:1557:2: rule__MyArray__Group__0__Impl rule__MyArray__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MyArray__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MyArray__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyArray__Group__0"


    // $ANTLR start "rule__MyArray__Group__0__Impl"
    // InternalTaskDSL.g:1564:1: rule__MyArray__Group__0__Impl : ( 'Array:' ) ;
    public final void rule__MyArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1568:1: ( ( 'Array:' ) )
            // InternalTaskDSL.g:1569:1: ( 'Array:' )
            {
            // InternalTaskDSL.g:1569:1: ( 'Array:' )
            // InternalTaskDSL.g:1570:2: 'Array:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getArrayKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getArrayKeyword_0()); 
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
    // $ANTLR end "rule__MyArray__Group__0__Impl"


    // $ANTLR start "rule__MyArray__Group__1"
    // InternalTaskDSL.g:1579:1: rule__MyArray__Group__1 : rule__MyArray__Group__1__Impl rule__MyArray__Group__2 ;
    public final void rule__MyArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1583:1: ( rule__MyArray__Group__1__Impl rule__MyArray__Group__2 )
            // InternalTaskDSL.g:1584:2: rule__MyArray__Group__1__Impl rule__MyArray__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MyArray__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MyArray__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyArray__Group__1"


    // $ANTLR start "rule__MyArray__Group__1__Impl"
    // InternalTaskDSL.g:1591:1: rule__MyArray__Group__1__Impl : ( ( rule__MyArray__NameAssignment_1 ) ) ;
    public final void rule__MyArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1595:1: ( ( ( rule__MyArray__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:1596:1: ( ( rule__MyArray__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:1596:1: ( ( rule__MyArray__NameAssignment_1 ) )
            // InternalTaskDSL.g:1597:2: ( rule__MyArray__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getNameAssignment_1()); 
            }
            // InternalTaskDSL.g:1598:2: ( rule__MyArray__NameAssignment_1 )
            // InternalTaskDSL.g:1598:3: rule__MyArray__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MyArray__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__MyArray__Group__1__Impl"


    // $ANTLR start "rule__MyArray__Group__2"
    // InternalTaskDSL.g:1606:1: rule__MyArray__Group__2 : rule__MyArray__Group__2__Impl rule__MyArray__Group__3 ;
    public final void rule__MyArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1610:1: ( rule__MyArray__Group__2__Impl rule__MyArray__Group__3 )
            // InternalTaskDSL.g:1611:2: rule__MyArray__Group__2__Impl rule__MyArray__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MyArray__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MyArray__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyArray__Group__2"


    // $ANTLR start "rule__MyArray__Group__2__Impl"
    // InternalTaskDSL.g:1618:1: rule__MyArray__Group__2__Impl : ( ':=' ) ;
    public final void rule__MyArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1622:1: ( ( ':=' ) )
            // InternalTaskDSL.g:1623:1: ( ':=' )
            {
            // InternalTaskDSL.g:1623:1: ( ':=' )
            // InternalTaskDSL.g:1624:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getColonEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__MyArray__Group__2__Impl"


    // $ANTLR start "rule__MyArray__Group__3"
    // InternalTaskDSL.g:1633:1: rule__MyArray__Group__3 : rule__MyArray__Group__3__Impl rule__MyArray__Group__4 ;
    public final void rule__MyArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1637:1: ( rule__MyArray__Group__3__Impl rule__MyArray__Group__4 )
            // InternalTaskDSL.g:1638:2: rule__MyArray__Group__3__Impl rule__MyArray__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__MyArray__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MyArray__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyArray__Group__3"


    // $ANTLR start "rule__MyArray__Group__3__Impl"
    // InternalTaskDSL.g:1645:1: rule__MyArray__Group__3__Impl : ( '[' ) ;
    public final void rule__MyArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1649:1: ( ( '[' ) )
            // InternalTaskDSL.g:1650:1: ( '[' )
            {
            // InternalTaskDSL.g:1650:1: ( '[' )
            // InternalTaskDSL.g:1651:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getLeftSquareBracketKeyword_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getLeftSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__MyArray__Group__3__Impl"


    // $ANTLR start "rule__MyArray__Group__4"
    // InternalTaskDSL.g:1660:1: rule__MyArray__Group__4 : rule__MyArray__Group__4__Impl rule__MyArray__Group__5 ;
    public final void rule__MyArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1664:1: ( rule__MyArray__Group__4__Impl rule__MyArray__Group__5 )
            // InternalTaskDSL.g:1665:2: rule__MyArray__Group__4__Impl rule__MyArray__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__MyArray__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MyArray__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyArray__Group__4"


    // $ANTLR start "rule__MyArray__Group__4__Impl"
    // InternalTaskDSL.g:1672:1: rule__MyArray__Group__4__Impl : ( ( rule__MyArray__Group_4__0 )? ) ;
    public final void rule__MyArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1676:1: ( ( ( rule__MyArray__Group_4__0 )? ) )
            // InternalTaskDSL.g:1677:1: ( ( rule__MyArray__Group_4__0 )? )
            {
            // InternalTaskDSL.g:1677:1: ( ( rule__MyArray__Group_4__0 )? )
            // InternalTaskDSL.g:1678:2: ( rule__MyArray__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getGroup_4()); 
            }
            // InternalTaskDSL.g:1679:2: ( rule__MyArray__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTaskDSL.g:1679:3: rule__MyArray__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MyArray__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getGroup_4()); 
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
    // $ANTLR end "rule__MyArray__Group__4__Impl"


    // $ANTLR start "rule__MyArray__Group__5"
    // InternalTaskDSL.g:1687:1: rule__MyArray__Group__5 : rule__MyArray__Group__5__Impl ;
    public final void rule__MyArray__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1691:1: ( rule__MyArray__Group__5__Impl )
            // InternalTaskDSL.g:1692:2: rule__MyArray__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyArray__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyArray__Group__5"


    // $ANTLR start "rule__MyArray__Group__5__Impl"
    // InternalTaskDSL.g:1698:1: rule__MyArray__Group__5__Impl : ( ']' ) ;
    public final void rule__MyArray__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1702:1: ( ( ']' ) )
            // InternalTaskDSL.g:1703:1: ( ']' )
            {
            // InternalTaskDSL.g:1703:1: ( ']' )
            // InternalTaskDSL.g:1704:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getRightSquareBracketKeyword_5()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getRightSquareBracketKeyword_5()); 
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
    // $ANTLR end "rule__MyArray__Group__5__Impl"


    // $ANTLR start "rule__MyArray__Group_4__0"
    // InternalTaskDSL.g:1714:1: rule__MyArray__Group_4__0 : rule__MyArray__Group_4__0__Impl rule__MyArray__Group_4__1 ;
    public final void rule__MyArray__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1718:1: ( rule__MyArray__Group_4__0__Impl rule__MyArray__Group_4__1 )
            // InternalTaskDSL.g:1719:2: rule__MyArray__Group_4__0__Impl rule__MyArray__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__MyArray__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MyArray__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyArray__Group_4__0"


    // $ANTLR start "rule__MyArray__Group_4__0__Impl"
    // InternalTaskDSL.g:1726:1: rule__MyArray__Group_4__0__Impl : ( ( rule__MyArray__ElementsAssignment_4_0 ) ) ;
    public final void rule__MyArray__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1730:1: ( ( ( rule__MyArray__ElementsAssignment_4_0 ) ) )
            // InternalTaskDSL.g:1731:1: ( ( rule__MyArray__ElementsAssignment_4_0 ) )
            {
            // InternalTaskDSL.g:1731:1: ( ( rule__MyArray__ElementsAssignment_4_0 ) )
            // InternalTaskDSL.g:1732:2: ( rule__MyArray__ElementsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getElementsAssignment_4_0()); 
            }
            // InternalTaskDSL.g:1733:2: ( rule__MyArray__ElementsAssignment_4_0 )
            // InternalTaskDSL.g:1733:3: rule__MyArray__ElementsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__MyArray__ElementsAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getElementsAssignment_4_0()); 
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
    // $ANTLR end "rule__MyArray__Group_4__0__Impl"


    // $ANTLR start "rule__MyArray__Group_4__1"
    // InternalTaskDSL.g:1741:1: rule__MyArray__Group_4__1 : rule__MyArray__Group_4__1__Impl ;
    public final void rule__MyArray__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1745:1: ( rule__MyArray__Group_4__1__Impl )
            // InternalTaskDSL.g:1746:2: rule__MyArray__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyArray__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyArray__Group_4__1"


    // $ANTLR start "rule__MyArray__Group_4__1__Impl"
    // InternalTaskDSL.g:1752:1: rule__MyArray__Group_4__1__Impl : ( ( rule__MyArray__Group_4_1__0 )* ) ;
    public final void rule__MyArray__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1756:1: ( ( ( rule__MyArray__Group_4_1__0 )* ) )
            // InternalTaskDSL.g:1757:1: ( ( rule__MyArray__Group_4_1__0 )* )
            {
            // InternalTaskDSL.g:1757:1: ( ( rule__MyArray__Group_4_1__0 )* )
            // InternalTaskDSL.g:1758:2: ( rule__MyArray__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getGroup_4_1()); 
            }
            // InternalTaskDSL.g:1759:2: ( rule__MyArray__Group_4_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTaskDSL.g:1759:3: rule__MyArray__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MyArray__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__MyArray__Group_4__1__Impl"


    // $ANTLR start "rule__MyArray__Group_4_1__0"
    // InternalTaskDSL.g:1768:1: rule__MyArray__Group_4_1__0 : rule__MyArray__Group_4_1__0__Impl rule__MyArray__Group_4_1__1 ;
    public final void rule__MyArray__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1772:1: ( rule__MyArray__Group_4_1__0__Impl rule__MyArray__Group_4_1__1 )
            // InternalTaskDSL.g:1773:2: rule__MyArray__Group_4_1__0__Impl rule__MyArray__Group_4_1__1
            {
            pushFollow(FOLLOW_14);
            rule__MyArray__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MyArray__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyArray__Group_4_1__0"


    // $ANTLR start "rule__MyArray__Group_4_1__0__Impl"
    // InternalTaskDSL.g:1780:1: rule__MyArray__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MyArray__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1784:1: ( ( ',' ) )
            // InternalTaskDSL.g:1785:1: ( ',' )
            {
            // InternalTaskDSL.g:1785:1: ( ',' )
            // InternalTaskDSL.g:1786:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getCommaKeyword_4_1_0()); 
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
    // $ANTLR end "rule__MyArray__Group_4_1__0__Impl"


    // $ANTLR start "rule__MyArray__Group_4_1__1"
    // InternalTaskDSL.g:1795:1: rule__MyArray__Group_4_1__1 : rule__MyArray__Group_4_1__1__Impl ;
    public final void rule__MyArray__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1799:1: ( rule__MyArray__Group_4_1__1__Impl )
            // InternalTaskDSL.g:1800:2: rule__MyArray__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MyArray__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MyArray__Group_4_1__1"


    // $ANTLR start "rule__MyArray__Group_4_1__1__Impl"
    // InternalTaskDSL.g:1806:1: rule__MyArray__Group_4_1__1__Impl : ( ( rule__MyArray__ElementsAssignment_4_1_1 ) ) ;
    public final void rule__MyArray__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1810:1: ( ( ( rule__MyArray__ElementsAssignment_4_1_1 ) ) )
            // InternalTaskDSL.g:1811:1: ( ( rule__MyArray__ElementsAssignment_4_1_1 ) )
            {
            // InternalTaskDSL.g:1811:1: ( ( rule__MyArray__ElementsAssignment_4_1_1 ) )
            // InternalTaskDSL.g:1812:2: ( rule__MyArray__ElementsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getElementsAssignment_4_1_1()); 
            }
            // InternalTaskDSL.g:1813:2: ( rule__MyArray__ElementsAssignment_4_1_1 )
            // InternalTaskDSL.g:1813:3: rule__MyArray__ElementsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MyArray__ElementsAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getElementsAssignment_4_1_1()); 
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
    // $ANTLR end "rule__MyArray__Group_4_1__1__Impl"


    // $ANTLR start "rule__ArraySpecificationInit__Group__0"
    // InternalTaskDSL.g:1822:1: rule__ArraySpecificationInit__Group__0 : rule__ArraySpecificationInit__Group__0__Impl rule__ArraySpecificationInit__Group__1 ;
    public final void rule__ArraySpecificationInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1826:1: ( rule__ArraySpecificationInit__Group__0__Impl rule__ArraySpecificationInit__Group__1 )
            // InternalTaskDSL.g:1827:2: rule__ArraySpecificationInit__Group__0__Impl rule__ArraySpecificationInit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ArraySpecificationInit__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArraySpecificationInit__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArraySpecificationInit__Group__0"


    // $ANTLR start "rule__ArraySpecificationInit__Group__0__Impl"
    // InternalTaskDSL.g:1834:1: rule__ArraySpecificationInit__Group__0__Impl : ( 'ARRAY' ) ;
    public final void rule__ArraySpecificationInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1838:1: ( ( 'ARRAY' ) )
            // InternalTaskDSL.g:1839:1: ( 'ARRAY' )
            {
            // InternalTaskDSL.g:1839:1: ( 'ARRAY' )
            // InternalTaskDSL.g:1840:2: 'ARRAY'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitAccess().getARRAYKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitAccess().getARRAYKeyword_0()); 
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
    // $ANTLR end "rule__ArraySpecificationInit__Group__0__Impl"


    // $ANTLR start "rule__ArraySpecificationInit__Group__1"
    // InternalTaskDSL.g:1849:1: rule__ArraySpecificationInit__Group__1 : rule__ArraySpecificationInit__Group__1__Impl rule__ArraySpecificationInit__Group__2 ;
    public final void rule__ArraySpecificationInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1853:1: ( rule__ArraySpecificationInit__Group__1__Impl rule__ArraySpecificationInit__Group__2 )
            // InternalTaskDSL.g:1854:2: rule__ArraySpecificationInit__Group__1__Impl rule__ArraySpecificationInit__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ArraySpecificationInit__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArraySpecificationInit__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArraySpecificationInit__Group__1"


    // $ANTLR start "rule__ArraySpecificationInit__Group__1__Impl"
    // InternalTaskDSL.g:1861:1: rule__ArraySpecificationInit__Group__1__Impl : ( ( rule__ArraySpecificationInit__NameAssignment_1 ) ) ;
    public final void rule__ArraySpecificationInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1865:1: ( ( ( rule__ArraySpecificationInit__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:1866:1: ( ( rule__ArraySpecificationInit__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:1866:1: ( ( rule__ArraySpecificationInit__NameAssignment_1 ) )
            // InternalTaskDSL.g:1867:2: ( rule__ArraySpecificationInit__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitAccess().getNameAssignment_1()); 
            }
            // InternalTaskDSL.g:1868:2: ( rule__ArraySpecificationInit__NameAssignment_1 )
            // InternalTaskDSL.g:1868:3: rule__ArraySpecificationInit__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecificationInit__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ArraySpecificationInit__Group__1__Impl"


    // $ANTLR start "rule__ArraySpecificationInit__Group__2"
    // InternalTaskDSL.g:1876:1: rule__ArraySpecificationInit__Group__2 : rule__ArraySpecificationInit__Group__2__Impl rule__ArraySpecificationInit__Group__3 ;
    public final void rule__ArraySpecificationInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1880:1: ( rule__ArraySpecificationInit__Group__2__Impl rule__ArraySpecificationInit__Group__3 )
            // InternalTaskDSL.g:1881:2: rule__ArraySpecificationInit__Group__2__Impl rule__ArraySpecificationInit__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ArraySpecificationInit__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArraySpecificationInit__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArraySpecificationInit__Group__2"


    // $ANTLR start "rule__ArraySpecificationInit__Group__2__Impl"
    // InternalTaskDSL.g:1888:1: rule__ArraySpecificationInit__Group__2__Impl : ( ( rule__ArraySpecificationInit__InitAssignment_2 ) ) ;
    public final void rule__ArraySpecificationInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1892:1: ( ( ( rule__ArraySpecificationInit__InitAssignment_2 ) ) )
            // InternalTaskDSL.g:1893:1: ( ( rule__ArraySpecificationInit__InitAssignment_2 ) )
            {
            // InternalTaskDSL.g:1893:1: ( ( rule__ArraySpecificationInit__InitAssignment_2 ) )
            // InternalTaskDSL.g:1894:2: ( rule__ArraySpecificationInit__InitAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitAccess().getInitAssignment_2()); 
            }
            // InternalTaskDSL.g:1895:2: ( rule__ArraySpecificationInit__InitAssignment_2 )
            // InternalTaskDSL.g:1895:3: rule__ArraySpecificationInit__InitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecificationInit__InitAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitAccess().getInitAssignment_2()); 
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
    // $ANTLR end "rule__ArraySpecificationInit__Group__2__Impl"


    // $ANTLR start "rule__ArraySpecificationInit__Group__3"
    // InternalTaskDSL.g:1903:1: rule__ArraySpecificationInit__Group__3 : rule__ArraySpecificationInit__Group__3__Impl ;
    public final void rule__ArraySpecificationInit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1907:1: ( rule__ArraySpecificationInit__Group__3__Impl )
            // InternalTaskDSL.g:1908:2: rule__ArraySpecificationInit__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecificationInit__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArraySpecificationInit__Group__3"


    // $ANTLR start "rule__ArraySpecificationInit__Group__3__Impl"
    // InternalTaskDSL.g:1914:1: rule__ArraySpecificationInit__Group__3__Impl : ( ( rule__ArraySpecificationInit__Group_3__0 )? ) ;
    public final void rule__ArraySpecificationInit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1918:1: ( ( ( rule__ArraySpecificationInit__Group_3__0 )? ) )
            // InternalTaskDSL.g:1919:1: ( ( rule__ArraySpecificationInit__Group_3__0 )? )
            {
            // InternalTaskDSL.g:1919:1: ( ( rule__ArraySpecificationInit__Group_3__0 )? )
            // InternalTaskDSL.g:1920:2: ( rule__ArraySpecificationInit__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitAccess().getGroup_3()); 
            }
            // InternalTaskDSL.g:1921:2: ( rule__ArraySpecificationInit__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTaskDSL.g:1921:3: rule__ArraySpecificationInit__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArraySpecificationInit__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitAccess().getGroup_3()); 
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
    // $ANTLR end "rule__ArraySpecificationInit__Group__3__Impl"


    // $ANTLR start "rule__ArraySpecificationInit__Group_3__0"
    // InternalTaskDSL.g:1930:1: rule__ArraySpecificationInit__Group_3__0 : rule__ArraySpecificationInit__Group_3__0__Impl rule__ArraySpecificationInit__Group_3__1 ;
    public final void rule__ArraySpecificationInit__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1934:1: ( rule__ArraySpecificationInit__Group_3__0__Impl rule__ArraySpecificationInit__Group_3__1 )
            // InternalTaskDSL.g:1935:2: rule__ArraySpecificationInit__Group_3__0__Impl rule__ArraySpecificationInit__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ArraySpecificationInit__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArraySpecificationInit__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArraySpecificationInit__Group_3__0"


    // $ANTLR start "rule__ArraySpecificationInit__Group_3__0__Impl"
    // InternalTaskDSL.g:1942:1: rule__ArraySpecificationInit__Group_3__0__Impl : ( ':=' ) ;
    public final void rule__ArraySpecificationInit__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1946:1: ( ( ':=' ) )
            // InternalTaskDSL.g:1947:1: ( ':=' )
            {
            // InternalTaskDSL.g:1947:1: ( ':=' )
            // InternalTaskDSL.g:1948:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitAccess().getColonEqualsSignKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitAccess().getColonEqualsSignKeyword_3_0()); 
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
    // $ANTLR end "rule__ArraySpecificationInit__Group_3__0__Impl"


    // $ANTLR start "rule__ArraySpecificationInit__Group_3__1"
    // InternalTaskDSL.g:1957:1: rule__ArraySpecificationInit__Group_3__1 : rule__ArraySpecificationInit__Group_3__1__Impl ;
    public final void rule__ArraySpecificationInit__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1961:1: ( rule__ArraySpecificationInit__Group_3__1__Impl )
            // InternalTaskDSL.g:1962:2: rule__ArraySpecificationInit__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecificationInit__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArraySpecificationInit__Group_3__1"


    // $ANTLR start "rule__ArraySpecificationInit__Group_3__1__Impl"
    // InternalTaskDSL.g:1968:1: rule__ArraySpecificationInit__Group_3__1__Impl : ( ( rule__ArraySpecificationInit__ValuesAssignment_3_1 ) ) ;
    public final void rule__ArraySpecificationInit__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1972:1: ( ( ( rule__ArraySpecificationInit__ValuesAssignment_3_1 ) ) )
            // InternalTaskDSL.g:1973:1: ( ( rule__ArraySpecificationInit__ValuesAssignment_3_1 ) )
            {
            // InternalTaskDSL.g:1973:1: ( ( rule__ArraySpecificationInit__ValuesAssignment_3_1 ) )
            // InternalTaskDSL.g:1974:2: ( rule__ArraySpecificationInit__ValuesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitAccess().getValuesAssignment_3_1()); 
            }
            // InternalTaskDSL.g:1975:2: ( rule__ArraySpecificationInit__ValuesAssignment_3_1 )
            // InternalTaskDSL.g:1975:3: rule__ArraySpecificationInit__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecificationInit__ValuesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitAccess().getValuesAssignment_3_1()); 
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
    // $ANTLR end "rule__ArraySpecificationInit__Group_3__1__Impl"


    // $ANTLR start "rule__ArraySpecification__Group__0"
    // InternalTaskDSL.g:1984:1: rule__ArraySpecification__Group__0 : rule__ArraySpecification__Group__0__Impl rule__ArraySpecification__Group__1 ;
    public final void rule__ArraySpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:1988:1: ( rule__ArraySpecification__Group__0__Impl rule__ArraySpecification__Group__1 )
            // InternalTaskDSL.g:1989:2: rule__ArraySpecification__Group__0__Impl rule__ArraySpecification__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ArraySpecification__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArraySpecification__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArraySpecification__Group__0"


    // $ANTLR start "rule__ArraySpecification__Group__0__Impl"
    // InternalTaskDSL.g:1996:1: rule__ArraySpecification__Group__0__Impl : ( '[' ) ;
    public final void rule__ArraySpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2000:1: ( ( '[' ) )
            // InternalTaskDSL.g:2001:1: ( '[' )
            {
            // InternalTaskDSL.g:2001:1: ( '[' )
            // InternalTaskDSL.g:2002:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__ArraySpecification__Group__0__Impl"


    // $ANTLR start "rule__ArraySpecification__Group__1"
    // InternalTaskDSL.g:2011:1: rule__ArraySpecification__Group__1 : rule__ArraySpecification__Group__1__Impl rule__ArraySpecification__Group__2 ;
    public final void rule__ArraySpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2015:1: ( rule__ArraySpecification__Group__1__Impl rule__ArraySpecification__Group__2 )
            // InternalTaskDSL.g:2016:2: rule__ArraySpecification__Group__1__Impl rule__ArraySpecification__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ArraySpecification__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArraySpecification__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArraySpecification__Group__1"


    // $ANTLR start "rule__ArraySpecification__Group__1__Impl"
    // InternalTaskDSL.g:2023:1: rule__ArraySpecification__Group__1__Impl : ( ( rule__ArraySpecification__Alternatives_1 ) ) ;
    public final void rule__ArraySpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2027:1: ( ( ( rule__ArraySpecification__Alternatives_1 ) ) )
            // InternalTaskDSL.g:2028:1: ( ( rule__ArraySpecification__Alternatives_1 ) )
            {
            // InternalTaskDSL.g:2028:1: ( ( rule__ArraySpecification__Alternatives_1 ) )
            // InternalTaskDSL.g:2029:2: ( rule__ArraySpecification__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationAccess().getAlternatives_1()); 
            }
            // InternalTaskDSL.g:2030:2: ( rule__ArraySpecification__Alternatives_1 )
            // InternalTaskDSL.g:2030:3: rule__ArraySpecification__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecification__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__ArraySpecification__Group__1__Impl"


    // $ANTLR start "rule__ArraySpecification__Group__2"
    // InternalTaskDSL.g:2038:1: rule__ArraySpecification__Group__2 : rule__ArraySpecification__Group__2__Impl ;
    public final void rule__ArraySpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2042:1: ( rule__ArraySpecification__Group__2__Impl )
            // InternalTaskDSL.g:2043:2: rule__ArraySpecification__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecification__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArraySpecification__Group__2"


    // $ANTLR start "rule__ArraySpecification__Group__2__Impl"
    // InternalTaskDSL.g:2049:1: rule__ArraySpecification__Group__2__Impl : ( ']' ) ;
    public final void rule__ArraySpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2053:1: ( ( ']' ) )
            // InternalTaskDSL.g:2054:1: ( ']' )
            {
            // InternalTaskDSL.g:2054:1: ( ']' )
            // InternalTaskDSL.g:2055:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_2()); 
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
    // $ANTLR end "rule__ArraySpecification__Group__2__Impl"


    // $ANTLR start "rule__ArrayInterval__Group__0"
    // InternalTaskDSL.g:2065:1: rule__ArrayInterval__Group__0 : rule__ArrayInterval__Group__0__Impl rule__ArrayInterval__Group__1 ;
    public final void rule__ArrayInterval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2069:1: ( rule__ArrayInterval__Group__0__Impl rule__ArrayInterval__Group__1 )
            // InternalTaskDSL.g:2070:2: rule__ArrayInterval__Group__0__Impl rule__ArrayInterval__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ArrayInterval__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayInterval__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayInterval__Group__0"


    // $ANTLR start "rule__ArrayInterval__Group__0__Impl"
    // InternalTaskDSL.g:2077:1: rule__ArrayInterval__Group__0__Impl : ( ( rule__ArrayInterval__StartAssignment_0 ) ) ;
    public final void rule__ArrayInterval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2081:1: ( ( ( rule__ArrayInterval__StartAssignment_0 ) ) )
            // InternalTaskDSL.g:2082:1: ( ( rule__ArrayInterval__StartAssignment_0 ) )
            {
            // InternalTaskDSL.g:2082:1: ( ( rule__ArrayInterval__StartAssignment_0 ) )
            // InternalTaskDSL.g:2083:2: ( rule__ArrayInterval__StartAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayIntervalAccess().getStartAssignment_0()); 
            }
            // InternalTaskDSL.g:2084:2: ( rule__ArrayInterval__StartAssignment_0 )
            // InternalTaskDSL.g:2084:3: rule__ArrayInterval__StartAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayInterval__StartAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayIntervalAccess().getStartAssignment_0()); 
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
    // $ANTLR end "rule__ArrayInterval__Group__0__Impl"


    // $ANTLR start "rule__ArrayInterval__Group__1"
    // InternalTaskDSL.g:2092:1: rule__ArrayInterval__Group__1 : rule__ArrayInterval__Group__1__Impl rule__ArrayInterval__Group__2 ;
    public final void rule__ArrayInterval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2096:1: ( rule__ArrayInterval__Group__1__Impl rule__ArrayInterval__Group__2 )
            // InternalTaskDSL.g:2097:2: rule__ArrayInterval__Group__1__Impl rule__ArrayInterval__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ArrayInterval__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayInterval__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayInterval__Group__1"


    // $ANTLR start "rule__ArrayInterval__Group__1__Impl"
    // InternalTaskDSL.g:2104:1: rule__ArrayInterval__Group__1__Impl : ( '..' ) ;
    public final void rule__ArrayInterval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2108:1: ( ( '..' ) )
            // InternalTaskDSL.g:2109:1: ( '..' )
            {
            // InternalTaskDSL.g:2109:1: ( '..' )
            // InternalTaskDSL.g:2110:2: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayIntervalAccess().getFullStopFullStopKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayIntervalAccess().getFullStopFullStopKeyword_1()); 
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
    // $ANTLR end "rule__ArrayInterval__Group__1__Impl"


    // $ANTLR start "rule__ArrayInterval__Group__2"
    // InternalTaskDSL.g:2119:1: rule__ArrayInterval__Group__2 : rule__ArrayInterval__Group__2__Impl ;
    public final void rule__ArrayInterval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2123:1: ( rule__ArrayInterval__Group__2__Impl )
            // InternalTaskDSL.g:2124:2: rule__ArrayInterval__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayInterval__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayInterval__Group__2"


    // $ANTLR start "rule__ArrayInterval__Group__2__Impl"
    // InternalTaskDSL.g:2130:1: rule__ArrayInterval__Group__2__Impl : ( ( rule__ArrayInterval__EndAssignment_2 ) ) ;
    public final void rule__ArrayInterval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2134:1: ( ( ( rule__ArrayInterval__EndAssignment_2 ) ) )
            // InternalTaskDSL.g:2135:1: ( ( rule__ArrayInterval__EndAssignment_2 ) )
            {
            // InternalTaskDSL.g:2135:1: ( ( rule__ArrayInterval__EndAssignment_2 ) )
            // InternalTaskDSL.g:2136:2: ( rule__ArrayInterval__EndAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayIntervalAccess().getEndAssignment_2()); 
            }
            // InternalTaskDSL.g:2137:2: ( rule__ArrayInterval__EndAssignment_2 )
            // InternalTaskDSL.g:2137:3: rule__ArrayInterval__EndAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ArrayInterval__EndAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayIntervalAccess().getEndAssignment_2()); 
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
    // $ANTLR end "rule__ArrayInterval__Group__2__Impl"


    // $ANTLR start "rule__ArrayInitialization__Group__0"
    // InternalTaskDSL.g:2146:1: rule__ArrayInitialization__Group__0 : rule__ArrayInitialization__Group__0__Impl rule__ArrayInitialization__Group__1 ;
    public final void rule__ArrayInitialization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2150:1: ( rule__ArrayInitialization__Group__0__Impl rule__ArrayInitialization__Group__1 )
            // InternalTaskDSL.g:2151:2: rule__ArrayInitialization__Group__0__Impl rule__ArrayInitialization__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ArrayInitialization__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayInitialization__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayInitialization__Group__0"


    // $ANTLR start "rule__ArrayInitialization__Group__0__Impl"
    // InternalTaskDSL.g:2158:1: rule__ArrayInitialization__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayInitialization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2162:1: ( ( '[' ) )
            // InternalTaskDSL.g:2163:1: ( '[' )
            {
            // InternalTaskDSL.g:2163:1: ( '[' )
            // InternalTaskDSL.g:2164:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayInitializationAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayInitializationAccess().getLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__ArrayInitialization__Group__0__Impl"


    // $ANTLR start "rule__ArrayInitialization__Group__1"
    // InternalTaskDSL.g:2173:1: rule__ArrayInitialization__Group__1 : rule__ArrayInitialization__Group__1__Impl rule__ArrayInitialization__Group__2 ;
    public final void rule__ArrayInitialization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2177:1: ( rule__ArrayInitialization__Group__1__Impl rule__ArrayInitialization__Group__2 )
            // InternalTaskDSL.g:2178:2: rule__ArrayInitialization__Group__1__Impl rule__ArrayInitialization__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ArrayInitialization__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayInitialization__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayInitialization__Group__1"


    // $ANTLR start "rule__ArrayInitialization__Group__1__Impl"
    // InternalTaskDSL.g:2185:1: rule__ArrayInitialization__Group__1__Impl : ( ( rule__ArrayInitialization__ElementsAssignment_1 ) ) ;
    public final void rule__ArrayInitialization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2189:1: ( ( ( rule__ArrayInitialization__ElementsAssignment_1 ) ) )
            // InternalTaskDSL.g:2190:1: ( ( rule__ArrayInitialization__ElementsAssignment_1 ) )
            {
            // InternalTaskDSL.g:2190:1: ( ( rule__ArrayInitialization__ElementsAssignment_1 ) )
            // InternalTaskDSL.g:2191:2: ( rule__ArrayInitialization__ElementsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayInitializationAccess().getElementsAssignment_1()); 
            }
            // InternalTaskDSL.g:2192:2: ( rule__ArrayInitialization__ElementsAssignment_1 )
            // InternalTaskDSL.g:2192:3: rule__ArrayInitialization__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayInitialization__ElementsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayInitializationAccess().getElementsAssignment_1()); 
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
    // $ANTLR end "rule__ArrayInitialization__Group__1__Impl"


    // $ANTLR start "rule__ArrayInitialization__Group__2"
    // InternalTaskDSL.g:2200:1: rule__ArrayInitialization__Group__2 : rule__ArrayInitialization__Group__2__Impl rule__ArrayInitialization__Group__3 ;
    public final void rule__ArrayInitialization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2204:1: ( rule__ArrayInitialization__Group__2__Impl rule__ArrayInitialization__Group__3 )
            // InternalTaskDSL.g:2205:2: rule__ArrayInitialization__Group__2__Impl rule__ArrayInitialization__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ArrayInitialization__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayInitialization__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayInitialization__Group__2"


    // $ANTLR start "rule__ArrayInitialization__Group__2__Impl"
    // InternalTaskDSL.g:2212:1: rule__ArrayInitialization__Group__2__Impl : ( ( rule__ArrayInitialization__Group_2__0 )* ) ;
    public final void rule__ArrayInitialization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2216:1: ( ( ( rule__ArrayInitialization__Group_2__0 )* ) )
            // InternalTaskDSL.g:2217:1: ( ( rule__ArrayInitialization__Group_2__0 )* )
            {
            // InternalTaskDSL.g:2217:1: ( ( rule__ArrayInitialization__Group_2__0 )* )
            // InternalTaskDSL.g:2218:2: ( rule__ArrayInitialization__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayInitializationAccess().getGroup_2()); 
            }
            // InternalTaskDSL.g:2219:2: ( rule__ArrayInitialization__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTaskDSL.g:2219:3: rule__ArrayInitialization__Group_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ArrayInitialization__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayInitializationAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ArrayInitialization__Group__2__Impl"


    // $ANTLR start "rule__ArrayInitialization__Group__3"
    // InternalTaskDSL.g:2227:1: rule__ArrayInitialization__Group__3 : rule__ArrayInitialization__Group__3__Impl ;
    public final void rule__ArrayInitialization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2231:1: ( rule__ArrayInitialization__Group__3__Impl )
            // InternalTaskDSL.g:2232:2: rule__ArrayInitialization__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayInitialization__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayInitialization__Group__3"


    // $ANTLR start "rule__ArrayInitialization__Group__3__Impl"
    // InternalTaskDSL.g:2238:1: rule__ArrayInitialization__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayInitialization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2242:1: ( ( ']' ) )
            // InternalTaskDSL.g:2243:1: ( ']' )
            {
            // InternalTaskDSL.g:2243:1: ( ']' )
            // InternalTaskDSL.g:2244:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayInitializationAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayInitializationAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__ArrayInitialization__Group__3__Impl"


    // $ANTLR start "rule__ArrayInitialization__Group_2__0"
    // InternalTaskDSL.g:2254:1: rule__ArrayInitialization__Group_2__0 : rule__ArrayInitialization__Group_2__0__Impl rule__ArrayInitialization__Group_2__1 ;
    public final void rule__ArrayInitialization__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2258:1: ( rule__ArrayInitialization__Group_2__0__Impl rule__ArrayInitialization__Group_2__1 )
            // InternalTaskDSL.g:2259:2: rule__ArrayInitialization__Group_2__0__Impl rule__ArrayInitialization__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__ArrayInitialization__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayInitialization__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayInitialization__Group_2__0"


    // $ANTLR start "rule__ArrayInitialization__Group_2__0__Impl"
    // InternalTaskDSL.g:2266:1: rule__ArrayInitialization__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayInitialization__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2270:1: ( ( ',' ) )
            // InternalTaskDSL.g:2271:1: ( ',' )
            {
            // InternalTaskDSL.g:2271:1: ( ',' )
            // InternalTaskDSL.g:2272:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayInitializationAccess().getCommaKeyword_2_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayInitializationAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__ArrayInitialization__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayInitialization__Group_2__1"
    // InternalTaskDSL.g:2281:1: rule__ArrayInitialization__Group_2__1 : rule__ArrayInitialization__Group_2__1__Impl ;
    public final void rule__ArrayInitialization__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2285:1: ( rule__ArrayInitialization__Group_2__1__Impl )
            // InternalTaskDSL.g:2286:2: rule__ArrayInitialization__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayInitialization__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ArrayInitialization__Group_2__1"


    // $ANTLR start "rule__ArrayInitialization__Group_2__1__Impl"
    // InternalTaskDSL.g:2292:1: rule__ArrayInitialization__Group_2__1__Impl : ( ( rule__ArrayInitialization__ElementsAssignment_2_1 ) ) ;
    public final void rule__ArrayInitialization__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2296:1: ( ( ( rule__ArrayInitialization__ElementsAssignment_2_1 ) ) )
            // InternalTaskDSL.g:2297:1: ( ( rule__ArrayInitialization__ElementsAssignment_2_1 ) )
            {
            // InternalTaskDSL.g:2297:1: ( ( rule__ArrayInitialization__ElementsAssignment_2_1 ) )
            // InternalTaskDSL.g:2298:2: ( rule__ArrayInitialization__ElementsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayInitializationAccess().getElementsAssignment_2_1()); 
            }
            // InternalTaskDSL.g:2299:2: ( rule__ArrayInitialization__ElementsAssignment_2_1 )
            // InternalTaskDSL.g:2299:3: rule__ArrayInitialization__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayInitialization__ElementsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayInitializationAccess().getElementsAssignment_2_1()); 
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
    // $ANTLR end "rule__ArrayInitialization__Group_2__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalTaskDSL.g:2308:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2312:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalTaskDSL.g:2313:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Person__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2320:1: rule__Person__Group__0__Impl : ( 'Person:' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2324:1: ( ( 'Person:' ) )
            // InternalTaskDSL.g:2325:1: ( 'Person:' )
            {
            // InternalTaskDSL.g:2325:1: ( 'Person:' )
            // InternalTaskDSL.g:2326:2: 'Person:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
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
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalTaskDSL.g:2335:1: rule__Person__Group__1 : rule__Person__Group__1__Impl ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2339:1: ( rule__Person__Group__1__Impl )
            // InternalTaskDSL.g:2340:2: rule__Person__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2346:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2350:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalTaskDSL.g:2351:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalTaskDSL.g:2351:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalTaskDSL.g:2352:2: ( rule__Person__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            }
            // InternalTaskDSL.g:2353:2: ( rule__Person__NameAssignment_1 )
            // InternalTaskDSL.g:2353:3: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalTaskDSL.g:2362:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2366:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalTaskDSL.g:2367:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Task__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2374:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2378:1: ( ( 'Task:' ) )
            // InternalTaskDSL.g:2379:1: ( 'Task:' )
            {
            // InternalTaskDSL.g:2379:1: ( 'Task:' )
            // InternalTaskDSL.g:2380:2: 'Task:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
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
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalTaskDSL.g:2389:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2393:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalTaskDSL.g:2394:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Task__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2401:1: rule__Task__Group__1__Impl : ( ( rule__Task__ActionAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2405:1: ( ( ( rule__Task__ActionAssignment_1 ) ) )
            // InternalTaskDSL.g:2406:1: ( ( rule__Task__ActionAssignment_1 ) )
            {
            // InternalTaskDSL.g:2406:1: ( ( rule__Task__ActionAssignment_1 ) )
            // InternalTaskDSL.g:2407:2: ( rule__Task__ActionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getActionAssignment_1()); 
            }
            // InternalTaskDSL.g:2408:2: ( rule__Task__ActionAssignment_1 )
            // InternalTaskDSL.g:2408:3: rule__Task__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__ActionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getActionAssignment_1()); 
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
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalTaskDSL.g:2416:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2420:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalTaskDSL.g:2421:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2428:1: rule__Task__Group__2__Impl : ( 'persons:' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2432:1: ( ( 'persons:' ) )
            // InternalTaskDSL.g:2433:1: ( 'persons:' )
            {
            // InternalTaskDSL.g:2433:1: ( 'persons:' )
            // InternalTaskDSL.g:2434:2: 'persons:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsKeyword_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsKeyword_2()); 
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
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalTaskDSL.g:2443:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2447:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalTaskDSL.g:2448:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Task__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2455:1: rule__Task__Group__3__Impl : ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2459:1: ( ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) ) )
            // InternalTaskDSL.g:2460:1: ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) )
            {
            // InternalTaskDSL.g:2460:1: ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) )
            // InternalTaskDSL.g:2461:2: ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* )
            {
            // InternalTaskDSL.g:2461:2: ( ( rule__Task__PersonsAssignment_3 ) )
            // InternalTaskDSL.g:2462:3: ( rule__Task__PersonsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            }
            // InternalTaskDSL.g:2463:3: ( rule__Task__PersonsAssignment_3 )
            // InternalTaskDSL.g:2463:4: rule__Task__PersonsAssignment_3
            {
            pushFollow(FOLLOW_22);
            rule__Task__PersonsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            }

            }

            // InternalTaskDSL.g:2466:2: ( ( rule__Task__PersonsAssignment_3 )* )
            // InternalTaskDSL.g:2467:3: ( rule__Task__PersonsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            }
            // InternalTaskDSL.g:2468:3: ( rule__Task__PersonsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTaskDSL.g:2468:4: rule__Task__PersonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Task__PersonsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            }

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
    // InternalTaskDSL.g:2477:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2481:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalTaskDSL.g:2482:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Task__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2489:1: rule__Task__Group__4__Impl : ( 'priority:' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2493:1: ( ( 'priority:' ) )
            // InternalTaskDSL.g:2494:1: ( 'priority:' )
            {
            // InternalTaskDSL.g:2494:1: ( 'priority:' )
            // InternalTaskDSL.g:2495:2: 'priority:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPriorityKeyword_4()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPriorityKeyword_4()); 
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
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalTaskDSL.g:2504:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2508:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalTaskDSL.g:2509:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Task__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2516:1: rule__Task__Group__5__Impl : ( ( rule__Task__PrioAssignment_5 ) ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2520:1: ( ( ( rule__Task__PrioAssignment_5 ) ) )
            // InternalTaskDSL.g:2521:1: ( ( rule__Task__PrioAssignment_5 ) )
            {
            // InternalTaskDSL.g:2521:1: ( ( rule__Task__PrioAssignment_5 ) )
            // InternalTaskDSL.g:2522:2: ( rule__Task__PrioAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPrioAssignment_5()); 
            }
            // InternalTaskDSL.g:2523:2: ( rule__Task__PrioAssignment_5 )
            // InternalTaskDSL.g:2523:3: rule__Task__PrioAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Task__PrioAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPrioAssignment_5()); 
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
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalTaskDSL.g:2531:1: rule__Task__Group__6 : rule__Task__Group__6__Impl ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2535:1: ( rule__Task__Group__6__Impl )
            // InternalTaskDSL.g:2536:2: rule__Task__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2542:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2546:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // InternalTaskDSL.g:2547:1: ( ( rule__Task__Group_6__0 )? )
            {
            // InternalTaskDSL.g:2547:1: ( ( rule__Task__Group_6__0 )? )
            // InternalTaskDSL.g:2548:2: ( rule__Task__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getGroup_6()); 
            }
            // InternalTaskDSL.g:2549:2: ( rule__Task__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTaskDSL.g:2549:3: rule__Task__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getGroup_6()); 
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
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalTaskDSL.g:2558:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2562:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalTaskDSL.g:2563:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_14);
            rule__Task__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2570:1: rule__Task__Group_6__0__Impl : ( 'duration:' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2574:1: ( ( 'duration:' ) )
            // InternalTaskDSL.g:2575:1: ( 'duration:' )
            {
            // InternalTaskDSL.g:2575:1: ( 'duration:' )
            // InternalTaskDSL.g:2576:2: 'duration:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); 
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
    // $ANTLR end "rule__Task__Group_6__0__Impl"


    // $ANTLR start "rule__Task__Group_6__1"
    // InternalTaskDSL.g:2585:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2589:1: ( rule__Task__Group_6__1__Impl )
            // InternalTaskDSL.g:2590:2: rule__Task__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2596:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__DurationAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2600:1: ( ( ( rule__Task__DurationAssignment_6_1 ) ) )
            // InternalTaskDSL.g:2601:1: ( ( rule__Task__DurationAssignment_6_1 ) )
            {
            // InternalTaskDSL.g:2601:1: ( ( rule__Task__DurationAssignment_6_1 ) )
            // InternalTaskDSL.g:2602:2: ( rule__Task__DurationAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getDurationAssignment_6_1()); 
            }
            // InternalTaskDSL.g:2603:2: ( rule__Task__DurationAssignment_6_1 )
            // InternalTaskDSL.g:2603:3: rule__Task__DurationAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__DurationAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getDurationAssignment_6_1()); 
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
    // $ANTLR end "rule__Task__Group_6__1__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalTaskDSL.g:2612:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2616:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalTaskDSL.g:2617:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Duration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2624:1: rule__Duration__Group__0__Impl : ( ( rule__Duration__DlAssignment_0 ) ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2628:1: ( ( ( rule__Duration__DlAssignment_0 ) ) )
            // InternalTaskDSL.g:2629:1: ( ( rule__Duration__DlAssignment_0 ) )
            {
            // InternalTaskDSL.g:2629:1: ( ( rule__Duration__DlAssignment_0 ) )
            // InternalTaskDSL.g:2630:2: ( rule__Duration__DlAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getDlAssignment_0()); 
            }
            // InternalTaskDSL.g:2631:2: ( rule__Duration__DlAssignment_0 )
            // InternalTaskDSL.g:2631:3: rule__Duration__DlAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__DlAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getDlAssignment_0()); 
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
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalTaskDSL.g:2639:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2643:1: ( rule__Duration__Group__1__Impl )
            // InternalTaskDSL.g:2644:2: rule__Duration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2650:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__UnitAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2654:1: ( ( ( rule__Duration__UnitAssignment_1 ) ) )
            // InternalTaskDSL.g:2655:1: ( ( rule__Duration__UnitAssignment_1 ) )
            {
            // InternalTaskDSL.g:2655:1: ( ( rule__Duration__UnitAssignment_1 ) )
            // InternalTaskDSL.g:2656:2: ( rule__Duration__UnitAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getUnitAssignment_1()); 
            }
            // InternalTaskDSL.g:2657:2: ( rule__Duration__UnitAssignment_1 )
            // InternalTaskDSL.g:2657:3: rule__Duration__UnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__UnitAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getUnitAssignment_1()); 
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
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__LunchAction__Group__0"
    // InternalTaskDSL.g:2666:1: rule__LunchAction__Group__0 : rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 ;
    public final void rule__LunchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2670:1: ( rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 )
            // InternalTaskDSL.g:2671:2: rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LunchAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2678:1: rule__LunchAction__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__LunchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2682:1: ( ( 'Lunch' ) )
            // InternalTaskDSL.g:2683:1: ( 'Lunch' )
            {
            // InternalTaskDSL.g:2683:1: ( 'Lunch' )
            // InternalTaskDSL.g:2684:2: 'Lunch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 
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
    // $ANTLR end "rule__LunchAction__Group__0__Impl"


    // $ANTLR start "rule__LunchAction__Group__1"
    // InternalTaskDSL.g:2693:1: rule__LunchAction__Group__1 : rule__LunchAction__Group__1__Impl ;
    public final void rule__LunchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2697:1: ( rule__LunchAction__Group__1__Impl )
            // InternalTaskDSL.g:2698:2: rule__LunchAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2704:1: rule__LunchAction__Group__1__Impl : ( ( rule__LunchAction__LocationAssignment_1 ) ) ;
    public final void rule__LunchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2708:1: ( ( ( rule__LunchAction__LocationAssignment_1 ) ) )
            // InternalTaskDSL.g:2709:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            {
            // InternalTaskDSL.g:2709:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            // InternalTaskDSL.g:2710:2: ( rule__LunchAction__LocationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 
            }
            // InternalTaskDSL.g:2711:2: ( rule__LunchAction__LocationAssignment_1 )
            // InternalTaskDSL.g:2711:3: rule__LunchAction__LocationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__LocationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 
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
    // $ANTLR end "rule__LunchAction__Group__1__Impl"


    // $ANTLR start "rule__MeetingAction__Group__0"
    // InternalTaskDSL.g:2720:1: rule__MeetingAction__Group__0 : rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 ;
    public final void rule__MeetingAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2724:1: ( rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 )
            // InternalTaskDSL.g:2725:2: rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MeetingAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2732:1: rule__MeetingAction__Group__0__Impl : ( 'Meeting' ) ;
    public final void rule__MeetingAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2736:1: ( ( 'Meeting' ) )
            // InternalTaskDSL.g:2737:1: ( 'Meeting' )
            {
            // InternalTaskDSL.g:2737:1: ( 'Meeting' )
            // InternalTaskDSL.g:2738:2: 'Meeting'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 
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
    // $ANTLR end "rule__MeetingAction__Group__0__Impl"


    // $ANTLR start "rule__MeetingAction__Group__1"
    // InternalTaskDSL.g:2747:1: rule__MeetingAction__Group__1 : rule__MeetingAction__Group__1__Impl ;
    public final void rule__MeetingAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2751:1: ( rule__MeetingAction__Group__1__Impl )
            // InternalTaskDSL.g:2752:2: rule__MeetingAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2758:1: rule__MeetingAction__Group__1__Impl : ( ( rule__MeetingAction__TopicAssignment_1 ) ) ;
    public final void rule__MeetingAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2762:1: ( ( ( rule__MeetingAction__TopicAssignment_1 ) ) )
            // InternalTaskDSL.g:2763:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            {
            // InternalTaskDSL.g:2763:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            // InternalTaskDSL.g:2764:2: ( rule__MeetingAction__TopicAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 
            }
            // InternalTaskDSL.g:2765:2: ( rule__MeetingAction__TopicAssignment_1 )
            // InternalTaskDSL.g:2765:3: rule__MeetingAction__TopicAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__TopicAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 
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
    // $ANTLR end "rule__MeetingAction__Group__1__Impl"


    // $ANTLR start "rule__PaperAction__Group__0"
    // InternalTaskDSL.g:2774:1: rule__PaperAction__Group__0 : rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 ;
    public final void rule__PaperAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2778:1: ( rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 )
            // InternalTaskDSL.g:2779:2: rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PaperAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2786:1: rule__PaperAction__Group__0__Impl : ( 'Report' ) ;
    public final void rule__PaperAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2790:1: ( ( 'Report' ) )
            // InternalTaskDSL.g:2791:1: ( 'Report' )
            {
            // InternalTaskDSL.g:2791:1: ( 'Report' )
            // InternalTaskDSL.g:2792:2: 'Report'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 
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
    // $ANTLR end "rule__PaperAction__Group__0__Impl"


    // $ANTLR start "rule__PaperAction__Group__1"
    // InternalTaskDSL.g:2801:1: rule__PaperAction__Group__1 : rule__PaperAction__Group__1__Impl ;
    public final void rule__PaperAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2805:1: ( rule__PaperAction__Group__1__Impl )
            // InternalTaskDSL.g:2806:2: rule__PaperAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2812:1: rule__PaperAction__Group__1__Impl : ( ( rule__PaperAction__ReportAssignment_1 ) ) ;
    public final void rule__PaperAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2816:1: ( ( ( rule__PaperAction__ReportAssignment_1 ) ) )
            // InternalTaskDSL.g:2817:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            {
            // InternalTaskDSL.g:2817:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            // InternalTaskDSL.g:2818:2: ( rule__PaperAction__ReportAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 
            }
            // InternalTaskDSL.g:2819:2: ( rule__PaperAction__ReportAssignment_1 )
            // InternalTaskDSL.g:2819:3: rule__PaperAction__ReportAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__ReportAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 
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
    // $ANTLR end "rule__PaperAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__0"
    // InternalTaskDSL.g:2828:1: rule__PaymentAction__Group__0 : rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 ;
    public final void rule__PaymentAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2832:1: ( rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 )
            // InternalTaskDSL.g:2833:2: rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__PaymentAction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2840:1: rule__PaymentAction__Group__0__Impl : ( ( rule__PaymentAction__Group_0__0 )? ) ;
    public final void rule__PaymentAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2844:1: ( ( ( rule__PaymentAction__Group_0__0 )? ) )
            // InternalTaskDSL.g:2845:1: ( ( rule__PaymentAction__Group_0__0 )? )
            {
            // InternalTaskDSL.g:2845:1: ( ( rule__PaymentAction__Group_0__0 )? )
            // InternalTaskDSL.g:2846:2: ( rule__PaymentAction__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getGroup_0()); 
            }
            // InternalTaskDSL.g:2847:2: ( rule__PaymentAction__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTaskDSL.g:2847:3: rule__PaymentAction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PaymentAction__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getGroup_0()); 
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
    // $ANTLR end "rule__PaymentAction__Group__0__Impl"


    // $ANTLR start "rule__PaymentAction__Group__1"
    // InternalTaskDSL.g:2855:1: rule__PaymentAction__Group__1 : rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 ;
    public final void rule__PaymentAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2859:1: ( rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 )
            // InternalTaskDSL.g:2860:2: rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PaymentAction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2867:1: rule__PaymentAction__Group__1__Impl : ( 'Pay' ) ;
    public final void rule__PaymentAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2871:1: ( ( 'Pay' ) )
            // InternalTaskDSL.g:2872:1: ( 'Pay' )
            {
            // InternalTaskDSL.g:2872:1: ( 'Pay' )
            // InternalTaskDSL.g:2873:2: 'Pay'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getPayKeyword_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getPayKeyword_1()); 
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
    // $ANTLR end "rule__PaymentAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__2"
    // InternalTaskDSL.g:2882:1: rule__PaymentAction__Group__2 : rule__PaymentAction__Group__2__Impl rule__PaymentAction__Group__3 ;
    public final void rule__PaymentAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2886:1: ( rule__PaymentAction__Group__2__Impl rule__PaymentAction__Group__3 )
            // InternalTaskDSL.g:2887:2: rule__PaymentAction__Group__2__Impl rule__PaymentAction__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__PaymentAction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:2894:1: rule__PaymentAction__Group__2__Impl : ( ( rule__PaymentAction__AmountAssignment_2 ) ) ;
    public final void rule__PaymentAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2898:1: ( ( ( rule__PaymentAction__AmountAssignment_2 ) ) )
            // InternalTaskDSL.g:2899:1: ( ( rule__PaymentAction__AmountAssignment_2 ) )
            {
            // InternalTaskDSL.g:2899:1: ( ( rule__PaymentAction__AmountAssignment_2 ) )
            // InternalTaskDSL.g:2900:2: ( rule__PaymentAction__AmountAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getAmountAssignment_2()); 
            }
            // InternalTaskDSL.g:2901:2: ( rule__PaymentAction__AmountAssignment_2 )
            // InternalTaskDSL.g:2901:3: rule__PaymentAction__AmountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__AmountAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getAmountAssignment_2()); 
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
    // $ANTLR end "rule__PaymentAction__Group__2__Impl"


    // $ANTLR start "rule__PaymentAction__Group__3"
    // InternalTaskDSL.g:2909:1: rule__PaymentAction__Group__3 : rule__PaymentAction__Group__3__Impl ;
    public final void rule__PaymentAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2913:1: ( rule__PaymentAction__Group__3__Impl )
            // InternalTaskDSL.g:2914:2: rule__PaymentAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PaymentAction__Group__3"


    // $ANTLR start "rule__PaymentAction__Group__3__Impl"
    // InternalTaskDSL.g:2920:1: rule__PaymentAction__Group__3__Impl : ( 'euro' ) ;
    public final void rule__PaymentAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2924:1: ( ( 'euro' ) )
            // InternalTaskDSL.g:2925:1: ( 'euro' )
            {
            // InternalTaskDSL.g:2925:1: ( 'euro' )
            // InternalTaskDSL.g:2926:2: 'euro'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getEuroKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getEuroKeyword_3()); 
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
    // $ANTLR end "rule__PaymentAction__Group__3__Impl"


    // $ANTLR start "rule__PaymentAction__Group_0__0"
    // InternalTaskDSL.g:2936:1: rule__PaymentAction__Group_0__0 : rule__PaymentAction__Group_0__0__Impl rule__PaymentAction__Group_0__1 ;
    public final void rule__PaymentAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2940:1: ( rule__PaymentAction__Group_0__0__Impl rule__PaymentAction__Group_0__1 )
            // InternalTaskDSL.g:2941:2: rule__PaymentAction__Group_0__0__Impl rule__PaymentAction__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__PaymentAction__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PaymentAction__Group_0__0"


    // $ANTLR start "rule__PaymentAction__Group_0__0__Impl"
    // InternalTaskDSL.g:2948:1: rule__PaymentAction__Group_0__0__Impl : ( 'If' ) ;
    public final void rule__PaymentAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2952:1: ( ( 'If' ) )
            // InternalTaskDSL.g:2953:1: ( 'If' )
            {
            // InternalTaskDSL.g:2953:1: ( 'If' )
            // InternalTaskDSL.g:2954:2: 'If'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getIfKeyword_0_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getIfKeyword_0_0()); 
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
    // $ANTLR end "rule__PaymentAction__Group_0__0__Impl"


    // $ANTLR start "rule__PaymentAction__Group_0__1"
    // InternalTaskDSL.g:2963:1: rule__PaymentAction__Group_0__1 : rule__PaymentAction__Group_0__1__Impl ;
    public final void rule__PaymentAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2967:1: ( rule__PaymentAction__Group_0__1__Impl )
            // InternalTaskDSL.g:2968:2: rule__PaymentAction__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PaymentAction__Group_0__1"


    // $ANTLR start "rule__PaymentAction__Group_0__1__Impl"
    // InternalTaskDSL.g:2974:1: rule__PaymentAction__Group_0__1__Impl : ( ( rule__PaymentAction__ConditionAssignment_0_1 ) ) ;
    public final void rule__PaymentAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2978:1: ( ( ( rule__PaymentAction__ConditionAssignment_0_1 ) ) )
            // InternalTaskDSL.g:2979:1: ( ( rule__PaymentAction__ConditionAssignment_0_1 ) )
            {
            // InternalTaskDSL.g:2979:1: ( ( rule__PaymentAction__ConditionAssignment_0_1 ) )
            // InternalTaskDSL.g:2980:2: ( rule__PaymentAction__ConditionAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getConditionAssignment_0_1()); 
            }
            // InternalTaskDSL.g:2981:2: ( rule__PaymentAction__ConditionAssignment_0_1 )
            // InternalTaskDSL.g:2981:3: rule__PaymentAction__ConditionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__ConditionAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getConditionAssignment_0_1()); 
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
    // $ANTLR end "rule__PaymentAction__Group_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__0"
    // InternalTaskDSL.g:2990:1: rule__ExpressionLevel1__Group__0 : rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 ;
    public final void rule__ExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:2994:1: ( rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 )
            // InternalTaskDSL.g:2995:2: rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionLevel1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3002:1: rule__ExpressionLevel1__Group__0__Impl : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3006:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:3007:1: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:3007:1: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:3008:2: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__1"
    // InternalTaskDSL.g:3017:1: rule__ExpressionLevel1__Group__1 : rule__ExpressionLevel1__Group__1__Impl ;
    public final void rule__ExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3021:1: ( rule__ExpressionLevel1__Group__1__Impl )
            // InternalTaskDSL.g:3022:2: rule__ExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3028:1: rule__ExpressionLevel1__Group__1__Impl : ( ( rule__ExpressionLevel1__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3032:1: ( ( ( rule__ExpressionLevel1__Alternatives_1 )* ) )
            // InternalTaskDSL.g:3033:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            {
            // InternalTaskDSL.g:3033:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            // InternalTaskDSL.g:3034:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
            }
            // InternalTaskDSL.g:3035:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=46 && LA24_0<=47)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTaskDSL.g:3035:3: rule__ExpressionLevel1__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ExpressionLevel1__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0"
    // InternalTaskDSL.g:3044:1: rule__ExpressionLevel1__Group_1_0__0 : rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 ;
    public final void rule__ExpressionLevel1__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3048:1: ( rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 )
            // InternalTaskDSL.g:3049:2: rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
            rule__ExpressionLevel1__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3056:1: rule__ExpressionLevel1__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3060:1: ( ( () ) )
            // InternalTaskDSL.g:3061:1: ( () )
            {
            // InternalTaskDSL.g:3061:1: ( () )
            // InternalTaskDSL.g:3062:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            }
            // InternalTaskDSL.g:3063:2: ()
            // InternalTaskDSL.g:3063:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            }

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
    // InternalTaskDSL.g:3071:1: rule__ExpressionLevel1__Group_1_0__1 : rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 ;
    public final void rule__ExpressionLevel1__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3075:1: ( rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 )
            // InternalTaskDSL.g:3076:2: rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionLevel1__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3083:1: rule__ExpressionLevel1__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__ExpressionLevel1__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3087:1: ( ( '+' ) )
            // InternalTaskDSL.g:3088:1: ( '+' )
            {
            // InternalTaskDSL.g:3088:1: ( '+' )
            // InternalTaskDSL.g:3089:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2"
    // InternalTaskDSL.g:3098:1: rule__ExpressionLevel1__Group_1_0__2 : rule__ExpressionLevel1__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3102:1: ( rule__ExpressionLevel1__Group_1_0__2__Impl )
            // InternalTaskDSL.g:3103:2: rule__ExpressionLevel1__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3109:1: rule__ExpressionLevel1__Group_1_0__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3113:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) )
            // InternalTaskDSL.g:3114:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            {
            // InternalTaskDSL.g:3114:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            // InternalTaskDSL.g:3115:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
            }
            // InternalTaskDSL.g:3116:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            // InternalTaskDSL.g:3116:3: rule__ExpressionLevel1__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0"
    // InternalTaskDSL.g:3125:1: rule__ExpressionLevel1__Group_1_1__0 : rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 ;
    public final void rule__ExpressionLevel1__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3129:1: ( rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 )
            // InternalTaskDSL.g:3130:2: rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1
            {
            pushFollow(FOLLOW_28);
            rule__ExpressionLevel1__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3137:1: rule__ExpressionLevel1__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3141:1: ( ( () ) )
            // InternalTaskDSL.g:3142:1: ( () )
            {
            // InternalTaskDSL.g:3142:1: ( () )
            // InternalTaskDSL.g:3143:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            }
            // InternalTaskDSL.g:3144:2: ()
            // InternalTaskDSL.g:3144:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            }

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
    // InternalTaskDSL.g:3152:1: rule__ExpressionLevel1__Group_1_1__1 : rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 ;
    public final void rule__ExpressionLevel1__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3156:1: ( rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 )
            // InternalTaskDSL.g:3157:2: rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionLevel1__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3164:1: rule__ExpressionLevel1__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__ExpressionLevel1__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3168:1: ( ( '-' ) )
            // InternalTaskDSL.g:3169:1: ( '-' )
            {
            // InternalTaskDSL.g:3169:1: ( '-' )
            // InternalTaskDSL.g:3170:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2"
    // InternalTaskDSL.g:3179:1: rule__ExpressionLevel1__Group_1_1__2 : rule__ExpressionLevel1__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3183:1: ( rule__ExpressionLevel1__Group_1_1__2__Impl )
            // InternalTaskDSL.g:3184:2: rule__ExpressionLevel1__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3190:1: rule__ExpressionLevel1__Group_1_1__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3194:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) )
            // InternalTaskDSL.g:3195:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            {
            // InternalTaskDSL.g:3195:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            // InternalTaskDSL.g:3196:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
            }
            // InternalTaskDSL.g:3197:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            // InternalTaskDSL.g:3197:3: rule__ExpressionLevel1__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__0"
    // InternalTaskDSL.g:3206:1: rule__ExpressionLevel2__Group__0 : rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 ;
    public final void rule__ExpressionLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3210:1: ( rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 )
            // InternalTaskDSL.g:3211:2: rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ExpressionLevel2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3218:1: rule__ExpressionLevel2__Group__0__Impl : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3222:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:3223:1: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:3223:1: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:3224:2: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__1"
    // InternalTaskDSL.g:3233:1: rule__ExpressionLevel2__Group__1 : rule__ExpressionLevel2__Group__1__Impl ;
    public final void rule__ExpressionLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3237:1: ( rule__ExpressionLevel2__Group__1__Impl )
            // InternalTaskDSL.g:3238:2: rule__ExpressionLevel2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3244:1: rule__ExpressionLevel2__Group__1__Impl : ( ( rule__ExpressionLevel2__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3248:1: ( ( ( rule__ExpressionLevel2__Alternatives_1 )* ) )
            // InternalTaskDSL.g:3249:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            {
            // InternalTaskDSL.g:3249:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            // InternalTaskDSL.g:3250:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
            }
            // InternalTaskDSL.g:3251:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=13 && LA25_0<=14)||(LA25_0>=48 && LA25_0<=50)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTaskDSL.g:3251:3: rule__ExpressionLevel2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ExpressionLevel2__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0"
    // InternalTaskDSL.g:3260:1: rule__ExpressionLevel2__Group_1_0__0 : rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 ;
    public final void rule__ExpressionLevel2__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3264:1: ( rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 )
            // InternalTaskDSL.g:3265:2: rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1
            {
            pushFollow(FOLLOW_33);
            rule__ExpressionLevel2__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3272:1: rule__ExpressionLevel2__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3276:1: ( ( () ) )
            // InternalTaskDSL.g:3277:1: ( () )
            {
            // InternalTaskDSL.g:3277:1: ( () )
            // InternalTaskDSL.g:3278:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            }
            // InternalTaskDSL.g:3279:2: ()
            // InternalTaskDSL.g:3279:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            }

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
    // InternalTaskDSL.g:3287:1: rule__ExpressionLevel2__Group_1_0__1 : rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 ;
    public final void rule__ExpressionLevel2__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3291:1: ( rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 )
            // InternalTaskDSL.g:3292:2: rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionLevel2__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3299:1: rule__ExpressionLevel2__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__ExpressionLevel2__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3303:1: ( ( '*' ) )
            // InternalTaskDSL.g:3304:1: ( '*' )
            {
            // InternalTaskDSL.g:3304:1: ( '*' )
            // InternalTaskDSL.g:3305:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2"
    // InternalTaskDSL.g:3314:1: rule__ExpressionLevel2__Group_1_0__2 : rule__ExpressionLevel2__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3318:1: ( rule__ExpressionLevel2__Group_1_0__2__Impl )
            // InternalTaskDSL.g:3319:2: rule__ExpressionLevel2__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3325:1: rule__ExpressionLevel2__Group_1_0__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3329:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) )
            // InternalTaskDSL.g:3330:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            {
            // InternalTaskDSL.g:3330:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            // InternalTaskDSL.g:3331:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
            }
            // InternalTaskDSL.g:3332:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            // InternalTaskDSL.g:3332:3: rule__ExpressionLevel2__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0"
    // InternalTaskDSL.g:3341:1: rule__ExpressionLevel2__Group_1_1__0 : rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 ;
    public final void rule__ExpressionLevel2__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3345:1: ( rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 )
            // InternalTaskDSL.g:3346:2: rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__ExpressionLevel2__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3353:1: rule__ExpressionLevel2__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3357:1: ( ( () ) )
            // InternalTaskDSL.g:3358:1: ( () )
            {
            // InternalTaskDSL.g:3358:1: ( () )
            // InternalTaskDSL.g:3359:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            }
            // InternalTaskDSL.g:3360:2: ()
            // InternalTaskDSL.g:3360:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            }

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
    // InternalTaskDSL.g:3368:1: rule__ExpressionLevel2__Group_1_1__1 : rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 ;
    public final void rule__ExpressionLevel2__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3372:1: ( rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 )
            // InternalTaskDSL.g:3373:2: rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionLevel2__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3380:1: rule__ExpressionLevel2__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__ExpressionLevel2__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3384:1: ( ( '/' ) )
            // InternalTaskDSL.g:3385:1: ( '/' )
            {
            // InternalTaskDSL.g:3385:1: ( '/' )
            // InternalTaskDSL.g:3386:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2"
    // InternalTaskDSL.g:3395:1: rule__ExpressionLevel2__Group_1_1__2 : rule__ExpressionLevel2__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3399:1: ( rule__ExpressionLevel2__Group_1_1__2__Impl )
            // InternalTaskDSL.g:3400:2: rule__ExpressionLevel2__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3406:1: rule__ExpressionLevel2__Group_1_1__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3410:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) )
            // InternalTaskDSL.g:3411:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            {
            // InternalTaskDSL.g:3411:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            // InternalTaskDSL.g:3412:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
            }
            // InternalTaskDSL.g:3413:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            // InternalTaskDSL.g:3413:3: rule__ExpressionLevel2__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0"
    // InternalTaskDSL.g:3422:1: rule__ExpressionLevel2__Group_1_2__0 : rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 ;
    public final void rule__ExpressionLevel2__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3426:1: ( rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 )
            // InternalTaskDSL.g:3427:2: rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1
            {
            pushFollow(FOLLOW_35);
            rule__ExpressionLevel2__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3434:1: rule__ExpressionLevel2__Group_1_2__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3438:1: ( ( () ) )
            // InternalTaskDSL.g:3439:1: ( () )
            {
            // InternalTaskDSL.g:3439:1: ( () )
            // InternalTaskDSL.g:3440:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            }
            // InternalTaskDSL.g:3441:2: ()
            // InternalTaskDSL.g:3441:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            }

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
    // InternalTaskDSL.g:3449:1: rule__ExpressionLevel2__Group_1_2__1 : rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 ;
    public final void rule__ExpressionLevel2__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3453:1: ( rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 )
            // InternalTaskDSL.g:3454:2: rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionLevel2__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3461:1: rule__ExpressionLevel2__Group_1_2__1__Impl : ( 'max' ) ;
    public final void rule__ExpressionLevel2__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3465:1: ( ( 'max' ) )
            // InternalTaskDSL.g:3466:1: ( 'max' )
            {
            // InternalTaskDSL.g:3466:1: ( 'max' )
            // InternalTaskDSL.g:3467:2: 'max'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2"
    // InternalTaskDSL.g:3476:1: rule__ExpressionLevel2__Group_1_2__2 : rule__ExpressionLevel2__Group_1_2__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3480:1: ( rule__ExpressionLevel2__Group_1_2__2__Impl )
            // InternalTaskDSL.g:3481:2: rule__ExpressionLevel2__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3487:1: rule__ExpressionLevel2__Group_1_2__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3491:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) )
            // InternalTaskDSL.g:3492:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            {
            // InternalTaskDSL.g:3492:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            // InternalTaskDSL.g:3493:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
            }
            // InternalTaskDSL.g:3494:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            // InternalTaskDSL.g:3494:3: rule__ExpressionLevel2__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0"
    // InternalTaskDSL.g:3503:1: rule__ExpressionLevel2__Group_1_3__0 : rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 ;
    public final void rule__ExpressionLevel2__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3507:1: ( rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 )
            // InternalTaskDSL.g:3508:2: rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1
            {
            pushFollow(FOLLOW_36);
            rule__ExpressionLevel2__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3515:1: rule__ExpressionLevel2__Group_1_3__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3519:1: ( ( () ) )
            // InternalTaskDSL.g:3520:1: ( () )
            {
            // InternalTaskDSL.g:3520:1: ( () )
            // InternalTaskDSL.g:3521:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            }
            // InternalTaskDSL.g:3522:2: ()
            // InternalTaskDSL.g:3522:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            }

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
    // InternalTaskDSL.g:3530:1: rule__ExpressionLevel2__Group_1_3__1 : rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 ;
    public final void rule__ExpressionLevel2__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3534:1: ( rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 )
            // InternalTaskDSL.g:3535:2: rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionLevel2__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3542:1: rule__ExpressionLevel2__Group_1_3__1__Impl : ( 'min' ) ;
    public final void rule__ExpressionLevel2__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3546:1: ( ( 'min' ) )
            // InternalTaskDSL.g:3547:1: ( 'min' )
            {
            // InternalTaskDSL.g:3547:1: ( 'min' )
            // InternalTaskDSL.g:3548:2: 'min'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2"
    // InternalTaskDSL.g:3557:1: rule__ExpressionLevel2__Group_1_3__2 : rule__ExpressionLevel2__Group_1_3__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3561:1: ( rule__ExpressionLevel2__Group_1_3__2__Impl )
            // InternalTaskDSL.g:3562:2: rule__ExpressionLevel2__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3568:1: rule__ExpressionLevel2__Group_1_3__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3572:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) )
            // InternalTaskDSL.g:3573:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            {
            // InternalTaskDSL.g:3573:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            // InternalTaskDSL.g:3574:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
            }
            // InternalTaskDSL.g:3575:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            // InternalTaskDSL.g:3575:3: rule__ExpressionLevel2__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0"
    // InternalTaskDSL.g:3584:1: rule__ExpressionLevel2__Group_1_4__0 : rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 ;
    public final void rule__ExpressionLevel2__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3588:1: ( rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 )
            // InternalTaskDSL.g:3589:2: rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1
            {
            pushFollow(FOLLOW_31);
            rule__ExpressionLevel2__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3596:1: rule__ExpressionLevel2__Group_1_4__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3600:1: ( ( () ) )
            // InternalTaskDSL.g:3601:1: ( () )
            {
            // InternalTaskDSL.g:3601:1: ( () )
            // InternalTaskDSL.g:3602:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            }
            // InternalTaskDSL.g:3603:2: ()
            // InternalTaskDSL.g:3603:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            }

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
    // InternalTaskDSL.g:3611:1: rule__ExpressionLevel2__Group_1_4__1 : rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 ;
    public final void rule__ExpressionLevel2__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3615:1: ( rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 )
            // InternalTaskDSL.g:3616:2: rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionLevel2__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3623:1: rule__ExpressionLevel2__Group_1_4__1__Impl : ( 'mod' ) ;
    public final void rule__ExpressionLevel2__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3627:1: ( ( 'mod' ) )
            // InternalTaskDSL.g:3628:1: ( 'mod' )
            {
            // InternalTaskDSL.g:3628:1: ( 'mod' )
            // InternalTaskDSL.g:3629:2: 'mod'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2"
    // InternalTaskDSL.g:3638:1: rule__ExpressionLevel2__Group_1_4__2 : rule__ExpressionLevel2__Group_1_4__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3642:1: ( rule__ExpressionLevel2__Group_1_4__2__Impl )
            // InternalTaskDSL.g:3643:2: rule__ExpressionLevel2__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3649:1: rule__ExpressionLevel2__Group_1_4__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3653:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) )
            // InternalTaskDSL.g:3654:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            {
            // InternalTaskDSL.g:3654:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            // InternalTaskDSL.g:3655:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
            }
            // InternalTaskDSL.g:3656:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            // InternalTaskDSL.g:3656:3: rule__ExpressionLevel2__RightAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__0"
    // InternalTaskDSL.g:3665:1: rule__ExpressionLevel3__Group__0 : rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 ;
    public final void rule__ExpressionLevel3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3669:1: ( rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 )
            // InternalTaskDSL.g:3670:2: rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ExpressionLevel3__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3677:1: rule__ExpressionLevel3__Group__0__Impl : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3681:1: ( ( ruleExpressionLevel4 ) )
            // InternalTaskDSL.g:3682:1: ( ruleExpressionLevel4 )
            {
            // InternalTaskDSL.g:3682:1: ( ruleExpressionLevel4 )
            // InternalTaskDSL.g:3683:2: ruleExpressionLevel4
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__1"
    // InternalTaskDSL.g:3692:1: rule__ExpressionLevel3__Group__1 : rule__ExpressionLevel3__Group__1__Impl ;
    public final void rule__ExpressionLevel3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3696:1: ( rule__ExpressionLevel3__Group__1__Impl )
            // InternalTaskDSL.g:3697:2: rule__ExpressionLevel3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3703:1: rule__ExpressionLevel3__Group__1__Impl : ( ( rule__ExpressionLevel3__Group_1__0 )? ) ;
    public final void rule__ExpressionLevel3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3707:1: ( ( ( rule__ExpressionLevel3__Group_1__0 )? ) )
            // InternalTaskDSL.g:3708:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            {
            // InternalTaskDSL.g:3708:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            // InternalTaskDSL.g:3709:2: ( rule__ExpressionLevel3__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
            }
            // InternalTaskDSL.g:3710:2: ( rule__ExpressionLevel3__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTaskDSL.g:3710:3: rule__ExpressionLevel3__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel3__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0"
    // InternalTaskDSL.g:3719:1: rule__ExpressionLevel3__Group_1__0 : rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 ;
    public final void rule__ExpressionLevel3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3723:1: ( rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 )
            // InternalTaskDSL.g:3724:2: rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1
            {
            pushFollow(FOLLOW_37);
            rule__ExpressionLevel3__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3731:1: rule__ExpressionLevel3__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3735:1: ( ( () ) )
            // InternalTaskDSL.g:3736:1: ( () )
            {
            // InternalTaskDSL.g:3736:1: ( () )
            // InternalTaskDSL.g:3737:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            }
            // InternalTaskDSL.g:3738:2: ()
            // InternalTaskDSL.g:3738:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            }

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
    // InternalTaskDSL.g:3746:1: rule__ExpressionLevel3__Group_1__1 : rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 ;
    public final void rule__ExpressionLevel3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3750:1: ( rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 )
            // InternalTaskDSL.g:3751:2: rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionLevel3__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3758:1: rule__ExpressionLevel3__Group_1__1__Impl : ( '^' ) ;
    public final void rule__ExpressionLevel3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3762:1: ( ( '^' ) )
            // InternalTaskDSL.g:3763:1: ( '^' )
            {
            // InternalTaskDSL.g:3763:1: ( '^' )
            // InternalTaskDSL.g:3764:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2"
    // InternalTaskDSL.g:3773:1: rule__ExpressionLevel3__Group_1__2 : rule__ExpressionLevel3__Group_1__2__Impl ;
    public final void rule__ExpressionLevel3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3777:1: ( rule__ExpressionLevel3__Group_1__2__Impl )
            // InternalTaskDSL.g:3778:2: rule__ExpressionLevel3__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3784:1: rule__ExpressionLevel3__Group_1__2__Impl : ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionLevel3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3788:1: ( ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) )
            // InternalTaskDSL.g:3789:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            {
            // InternalTaskDSL.g:3789:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            // InternalTaskDSL.g:3790:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
            }
            // InternalTaskDSL.g:3791:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            // InternalTaskDSL.g:3791:3: rule__ExpressionLevel3__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__0"
    // InternalTaskDSL.g:3800:1: rule__ExpressionMinus__Group__0 : rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 ;
    public final void rule__ExpressionMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3804:1: ( rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 )
            // InternalTaskDSL.g:3805:2: rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3812:1: rule__ExpressionMinus__Group__0__Impl : ( '-' ) ;
    public final void rule__ExpressionMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3816:1: ( ( '-' ) )
            // InternalTaskDSL.g:3817:1: ( '-' )
            {
            // InternalTaskDSL.g:3817:1: ( '-' )
            // InternalTaskDSL.g:3818:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__ExpressionMinus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__1"
    // InternalTaskDSL.g:3827:1: rule__ExpressionMinus__Group__1 : rule__ExpressionMinus__Group__1__Impl ;
    public final void rule__ExpressionMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3831:1: ( rule__ExpressionMinus__Group__1__Impl )
            // InternalTaskDSL.g:3832:2: rule__ExpressionMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3838:1: rule__ExpressionMinus__Group__1__Impl : ( ( rule__ExpressionMinus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3842:1: ( ( ( rule__ExpressionMinus__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3843:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3843:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            // InternalTaskDSL.g:3844:2: ( rule__ExpressionMinus__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3845:2: ( rule__ExpressionMinus__SubAssignment_1 )
            // InternalTaskDSL.g:3845:3: rule__ExpressionMinus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__ExpressionMinus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__0"
    // InternalTaskDSL.g:3854:1: rule__ExpressionPlus__Group__0 : rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 ;
    public final void rule__ExpressionPlus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3858:1: ( rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 )
            // InternalTaskDSL.g:3859:2: rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionPlus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3866:1: rule__ExpressionPlus__Group__0__Impl : ( '+' ) ;
    public final void rule__ExpressionPlus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3870:1: ( ( '+' ) )
            // InternalTaskDSL.g:3871:1: ( '+' )
            {
            // InternalTaskDSL.g:3871:1: ( '+' )
            // InternalTaskDSL.g:3872:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
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
    // $ANTLR end "rule__ExpressionPlus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__1"
    // InternalTaskDSL.g:3881:1: rule__ExpressionPlus__Group__1 : rule__ExpressionPlus__Group__1__Impl ;
    public final void rule__ExpressionPlus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3885:1: ( rule__ExpressionPlus__Group__1__Impl )
            // InternalTaskDSL.g:3886:2: rule__ExpressionPlus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3892:1: rule__ExpressionPlus__Group__1__Impl : ( ( rule__ExpressionPlus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionPlus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3896:1: ( ( ( rule__ExpressionPlus__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3897:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3897:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            // InternalTaskDSL.g:3898:2: ( rule__ExpressionPlus__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3899:2: ( rule__ExpressionPlus__SubAssignment_1 )
            // InternalTaskDSL.g:3899:3: rule__ExpressionPlus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__ExpressionPlus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__0"
    // InternalTaskDSL.g:3908:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3912:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalTaskDSL.g:3913:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpressionBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3920:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3924:1: ( ( '(' ) )
            // InternalTaskDSL.g:3925:1: ( '(' )
            {
            // InternalTaskDSL.g:3925:1: ( '(' )
            // InternalTaskDSL.g:3926:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__ExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__1"
    // InternalTaskDSL.g:3935:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3939:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalTaskDSL.g:3940:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__ExpressionBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3947:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3951:1: ( ( ( rule__ExpressionBracket__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:3952:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:3952:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            // InternalTaskDSL.g:3953:2: ( rule__ExpressionBracket__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:3954:2: ( rule__ExpressionBracket__SubAssignment_1 )
            // InternalTaskDSL.g:3954:3: rule__ExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__ExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__2"
    // InternalTaskDSL.g:3962:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3966:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalTaskDSL.g:3967:2: rule__ExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalTaskDSL.g:3973:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3977:1: ( ( ')' ) )
            // InternalTaskDSL.g:3978:1: ( ')' )
            {
            // InternalTaskDSL.g:3978:1: ( ')' )
            // InternalTaskDSL.g:3979:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__0"
    // InternalTaskDSL.g:3989:1: rule__BooleanExpressionLevel1__Group__0 : rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1 ;
    public final void rule__BooleanExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:3993:1: ( rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1 )
            // InternalTaskDSL.g:3994:2: rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__BooleanExpressionLevel1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__0"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__0__Impl"
    // InternalTaskDSL.g:4001:1: rule__BooleanExpressionLevel1__Group__0__Impl : ( ruleBooleanExpressionLevel2 ) ;
    public final void rule__BooleanExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4005:1: ( ( ruleBooleanExpressionLevel2 ) )
            // InternalTaskDSL.g:4006:1: ( ruleBooleanExpressionLevel2 )
            {
            // InternalTaskDSL.g:4006:1: ( ruleBooleanExpressionLevel2 )
            // InternalTaskDSL.g:4007:2: ruleBooleanExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__1"
    // InternalTaskDSL.g:4016:1: rule__BooleanExpressionLevel1__Group__1 : rule__BooleanExpressionLevel1__Group__1__Impl ;
    public final void rule__BooleanExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4020:1: ( rule__BooleanExpressionLevel1__Group__1__Impl )
            // InternalTaskDSL.g:4021:2: rule__BooleanExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__1"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__1__Impl"
    // InternalTaskDSL.g:4027:1: rule__BooleanExpressionLevel1__Group__1__Impl : ( ( rule__BooleanExpressionLevel1__Group_1__0 )* ) ;
    public final void rule__BooleanExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4031:1: ( ( ( rule__BooleanExpressionLevel1__Group_1__0 )* ) )
            // InternalTaskDSL.g:4032:1: ( ( rule__BooleanExpressionLevel1__Group_1__0 )* )
            {
            // InternalTaskDSL.g:4032:1: ( ( rule__BooleanExpressionLevel1__Group_1__0 )* )
            // InternalTaskDSL.g:4033:2: ( rule__BooleanExpressionLevel1__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1()); 
            }
            // InternalTaskDSL.g:4034:2: ( rule__BooleanExpressionLevel1__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=18 && LA27_0<=19)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTaskDSL.g:4034:3: rule__BooleanExpressionLevel1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__BooleanExpressionLevel1__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__0"
    // InternalTaskDSL.g:4043:1: rule__BooleanExpressionLevel1__Group_1__0 : rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1 ;
    public final void rule__BooleanExpressionLevel1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4047:1: ( rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1 )
            // InternalTaskDSL.g:4048:2: rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__BooleanExpressionLevel1__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__0"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__0__Impl"
    // InternalTaskDSL.g:4055:1: rule__BooleanExpressionLevel1__Group_1__0__Impl : ( () ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4059:1: ( ( () ) )
            // InternalTaskDSL.g:4060:1: ( () )
            {
            // InternalTaskDSL.g:4060:1: ( () )
            // InternalTaskDSL.g:4061:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0()); 
            }
            // InternalTaskDSL.g:4062:2: ()
            // InternalTaskDSL.g:4062:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__1"
    // InternalTaskDSL.g:4070:1: rule__BooleanExpressionLevel1__Group_1__1 : rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2 ;
    public final void rule__BooleanExpressionLevel1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4074:1: ( rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2 )
            // InternalTaskDSL.g:4075:2: rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__BooleanExpressionLevel1__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__1"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__1__Impl"
    // InternalTaskDSL.g:4082:1: rule__BooleanExpressionLevel1__Group_1__1__Impl : ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4086:1: ( ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) ) )
            // InternalTaskDSL.g:4087:1: ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) )
            {
            // InternalTaskDSL.g:4087:1: ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) )
            // InternalTaskDSL.g:4088:2: ( rule__BooleanExpressionLevel1__BopAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1()); 
            }
            // InternalTaskDSL.g:4089:2: ( rule__BooleanExpressionLevel1__BopAssignment_1_1 )
            // InternalTaskDSL.g:4089:3: rule__BooleanExpressionLevel1__BopAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__BopAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__2"
    // InternalTaskDSL.g:4097:1: rule__BooleanExpressionLevel1__Group_1__2 : rule__BooleanExpressionLevel1__Group_1__2__Impl ;
    public final void rule__BooleanExpressionLevel1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4101:1: ( rule__BooleanExpressionLevel1__Group_1__2__Impl )
            // InternalTaskDSL.g:4102:2: rule__BooleanExpressionLevel1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__2"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__2__Impl"
    // InternalTaskDSL.g:4108:1: rule__BooleanExpressionLevel1__Group_1__2__Impl : ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4112:1: ( ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) ) )
            // InternalTaskDSL.g:4113:1: ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) )
            {
            // InternalTaskDSL.g:4113:1: ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) )
            // InternalTaskDSL.g:4114:2: ( rule__BooleanExpressionLevel1__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2()); 
            }
            // InternalTaskDSL.g:4115:2: ( rule__BooleanExpressionLevel1__RightAssignment_1_2 )
            // InternalTaskDSL.g:4115:3: rule__BooleanExpressionLevel1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group__0"
    // InternalTaskDSL.g:4124:1: rule__NotExpression__Group__0 : rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 ;
    public final void rule__NotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4128:1: ( rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 )
            // InternalTaskDSL.g:4129:2: rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__NotExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NotExpression__Group__0"


    // $ANTLR start "rule__NotExpression__Group__0__Impl"
    // InternalTaskDSL.g:4136:1: rule__NotExpression__Group__0__Impl : ( 'NOT' ) ;
    public final void rule__NotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4140:1: ( ( 'NOT' ) )
            // InternalTaskDSL.g:4141:1: ( 'NOT' )
            {
            // InternalTaskDSL.g:4141:1: ( 'NOT' )
            // InternalTaskDSL.g:4142:2: 'NOT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
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
    // $ANTLR end "rule__NotExpression__Group__0__Impl"


    // $ANTLR start "rule__NotExpression__Group__1"
    // InternalTaskDSL.g:4151:1: rule__NotExpression__Group__1 : rule__NotExpression__Group__1__Impl ;
    public final void rule__NotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4155:1: ( rule__NotExpression__Group__1__Impl )
            // InternalTaskDSL.g:4156:2: rule__NotExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NotExpression__Group__1"


    // $ANTLR start "rule__NotExpression__Group__1__Impl"
    // InternalTaskDSL.g:4162:1: rule__NotExpression__Group__1__Impl : ( ( rule__NotExpression__SubAssignment_1 ) ) ;
    public final void rule__NotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4166:1: ( ( ( rule__NotExpression__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:4167:1: ( ( rule__NotExpression__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:4167:1: ( ( rule__NotExpression__SubAssignment_1 ) )
            // InternalTaskDSL.g:4168:2: ( rule__NotExpression__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:4169:2: ( rule__NotExpression__SubAssignment_1 )
            // InternalTaskDSL.g:4169:3: rule__NotExpression__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__NotExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalTaskDSL.g:4178:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4182:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalTaskDSL.g:4183:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalTaskDSL.g:4190:1: rule__ComparisonExpression__Group__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4194:1: ( ( () ) )
            // InternalTaskDSL.g:4195:1: ( () )
            {
            // InternalTaskDSL.g:4195:1: ( () )
            // InternalTaskDSL.g:4196:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0()); 
            }
            // InternalTaskDSL.g:4197:2: ()
            // InternalTaskDSL.g:4197:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalTaskDSL.g:4205:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2 ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4209:1: ( rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2 )
            // InternalTaskDSL.g:4210:2: rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalTaskDSL.g:4217:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__LeftAssignment_1 ) ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4221:1: ( ( ( rule__ComparisonExpression__LeftAssignment_1 ) ) )
            // InternalTaskDSL.g:4222:1: ( ( rule__ComparisonExpression__LeftAssignment_1 ) )
            {
            // InternalTaskDSL.g:4222:1: ( ( rule__ComparisonExpression__LeftAssignment_1 ) )
            // InternalTaskDSL.g:4223:2: ( rule__ComparisonExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalTaskDSL.g:4224:2: ( rule__ComparisonExpression__LeftAssignment_1 )
            // InternalTaskDSL.g:4224:3: rule__ComparisonExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__2"
    // InternalTaskDSL.g:4232:1: rule__ComparisonExpression__Group__2 : rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3 ;
    public final void rule__ComparisonExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4236:1: ( rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3 )
            // InternalTaskDSL.g:4237:2: rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ComparisonExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComparisonExpression__Group__2"


    // $ANTLR start "rule__ComparisonExpression__Group__2__Impl"
    // InternalTaskDSL.g:4244:1: rule__ComparisonExpression__Group__2__Impl : ( ( rule__ComparisonExpression__OpAssignment_2 ) ) ;
    public final void rule__ComparisonExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4248:1: ( ( ( rule__ComparisonExpression__OpAssignment_2 ) ) )
            // InternalTaskDSL.g:4249:1: ( ( rule__ComparisonExpression__OpAssignment_2 ) )
            {
            // InternalTaskDSL.g:4249:1: ( ( rule__ComparisonExpression__OpAssignment_2 ) )
            // InternalTaskDSL.g:4250:2: ( rule__ComparisonExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2()); 
            }
            // InternalTaskDSL.g:4251:2: ( rule__ComparisonExpression__OpAssignment_2 )
            // InternalTaskDSL.g:4251:3: rule__ComparisonExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2()); 
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
    // $ANTLR end "rule__ComparisonExpression__Group__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__3"
    // InternalTaskDSL.g:4259:1: rule__ComparisonExpression__Group__3 : rule__ComparisonExpression__Group__3__Impl ;
    public final void rule__ComparisonExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4263:1: ( rule__ComparisonExpression__Group__3__Impl )
            // InternalTaskDSL.g:4264:2: rule__ComparisonExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ComparisonExpression__Group__3"


    // $ANTLR start "rule__ComparisonExpression__Group__3__Impl"
    // InternalTaskDSL.g:4270:1: rule__ComparisonExpression__Group__3__Impl : ( ( rule__ComparisonExpression__RightAssignment_3 ) ) ;
    public final void rule__ComparisonExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4274:1: ( ( ( rule__ComparisonExpression__RightAssignment_3 ) ) )
            // InternalTaskDSL.g:4275:1: ( ( rule__ComparisonExpression__RightAssignment_3 ) )
            {
            // InternalTaskDSL.g:4275:1: ( ( rule__ComparisonExpression__RightAssignment_3 ) )
            // InternalTaskDSL.g:4276:2: ( rule__ComparisonExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3()); 
            }
            // InternalTaskDSL.g:4277:2: ( rule__ComparisonExpression__RightAssignment_3 )
            // InternalTaskDSL.g:4277:3: rule__ComparisonExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__ComparisonExpression__Group__3__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__0"
    // InternalTaskDSL.g:4286:1: rule__BooleanExpressionBracket__Group__0 : rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1 ;
    public final void rule__BooleanExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4290:1: ( rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1 )
            // InternalTaskDSL.g:4291:2: rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__BooleanExpressionBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__0"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__0__Impl"
    // InternalTaskDSL.g:4298:1: rule__BooleanExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__BooleanExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4302:1: ( ( '(' ) )
            // InternalTaskDSL.g:4303:1: ( '(' )
            {
            // InternalTaskDSL.g:4303:1: ( '(' )
            // InternalTaskDSL.g:4304:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__1"
    // InternalTaskDSL.g:4313:1: rule__BooleanExpressionBracket__Group__1 : rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2 ;
    public final void rule__BooleanExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4317:1: ( rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2 )
            // InternalTaskDSL.g:4318:2: rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__BooleanExpressionBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__1"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__1__Impl"
    // InternalTaskDSL.g:4325:1: rule__BooleanExpressionBracket__Group__1__Impl : ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__BooleanExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4329:1: ( ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) ) )
            // InternalTaskDSL.g:4330:1: ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) )
            {
            // InternalTaskDSL.g:4330:1: ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) )
            // InternalTaskDSL.g:4331:2: ( rule__BooleanExpressionBracket__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1()); 
            }
            // InternalTaskDSL.g:4332:2: ( rule__BooleanExpressionBracket__SubAssignment_1 )
            // InternalTaskDSL.g:4332:3: rule__BooleanExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__2"
    // InternalTaskDSL.g:4340:1: rule__BooleanExpressionBracket__Group__2 : rule__BooleanExpressionBracket__Group__2__Impl ;
    public final void rule__BooleanExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4344:1: ( rule__BooleanExpressionBracket__Group__2__Impl )
            // InternalTaskDSL.g:4345:2: rule__BooleanExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__2"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__2__Impl"
    // InternalTaskDSL.g:4351:1: rule__BooleanExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__BooleanExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4355:1: ( ( ')' ) )
            // InternalTaskDSL.g:4356:1: ( ')' )
            {
            // InternalTaskDSL.g:4356:1: ( ')' )
            // InternalTaskDSL.g:4357:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__Planning__NameAssignment_1"
    // InternalTaskDSL.g:4367:1: rule__Planning__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Planning__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4371:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:4372:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:4372:2: ( RULE_ID )
            // InternalTaskDSL.g:4373:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Planning__NameAssignment_1"


    // $ANTLR start "rule__Planning__AnonymousAssignment_2"
    // InternalTaskDSL.g:4382:1: rule__Planning__AnonymousAssignment_2 : ( ( 'anonymous' ) ) ;
    public final void rule__Planning__AnonymousAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4386:1: ( ( ( 'anonymous' ) ) )
            // InternalTaskDSL.g:4387:2: ( ( 'anonymous' ) )
            {
            // InternalTaskDSL.g:4387:2: ( ( 'anonymous' ) )
            // InternalTaskDSL.g:4388:3: ( 'anonymous' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }
            // InternalTaskDSL.g:4389:3: ( 'anonymous' )
            // InternalTaskDSL.g:4390:4: 'anonymous'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getAnonymousAnonymousKeyword_2_0()); 
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
    // $ANTLR end "rule__Planning__AnonymousAssignment_2"


    // $ANTLR start "rule__Planning__PersonsAssignment_3_0"
    // InternalTaskDSL.g:4401:1: rule__Planning__PersonsAssignment_3_0 : ( rulePerson ) ;
    public final void rule__Planning__PersonsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4405:1: ( ( rulePerson ) )
            // InternalTaskDSL.g:4406:2: ( rulePerson )
            {
            // InternalTaskDSL.g:4406:2: ( rulePerson )
            // InternalTaskDSL.g:4407:3: rulePerson
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__Planning__PersonsAssignment_3_0"


    // $ANTLR start "rule__Planning__TasksAssignment_3_1"
    // InternalTaskDSL.g:4416:1: rule__Planning__TasksAssignment_3_1 : ( ruleTask ) ;
    public final void rule__Planning__TasksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4420:1: ( ( ruleTask ) )
            // InternalTaskDSL.g:4421:2: ( ruleTask )
            {
            // InternalTaskDSL.g:4421:2: ( ruleTask )
            // InternalTaskDSL.g:4422:3: ruleTask
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__Planning__TasksAssignment_3_1"


    // $ANTLR start "rule__Planning__ArraysAssignment_3_2"
    // InternalTaskDSL.g:4431:1: rule__Planning__ArraysAssignment_3_2 : ( ruleArraySpecificationInit ) ;
    public final void rule__Planning__ArraysAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4435:1: ( ( ruleArraySpecificationInit ) )
            // InternalTaskDSL.g:4436:2: ( ruleArraySpecificationInit )
            {
            // InternalTaskDSL.g:4436:2: ( ruleArraySpecificationInit )
            // InternalTaskDSL.g:4437:3: ruleArraySpecificationInit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getArraysArraySpecificationInitParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArraySpecificationInit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getArraysArraySpecificationInitParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__Planning__ArraysAssignment_3_2"


    // $ANTLR start "rule__Planning__MyintegersAssignment_4"
    // InternalTaskDSL.g:4446:1: rule__Planning__MyintegersAssignment_4 : ( ruleMyInteger ) ;
    public final void rule__Planning__MyintegersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4450:1: ( ( ruleMyInteger ) )
            // InternalTaskDSL.g:4451:2: ( ruleMyInteger )
            {
            // InternalTaskDSL.g:4451:2: ( ruleMyInteger )
            // InternalTaskDSL.g:4452:3: ruleMyInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getMyintegersMyIntegerParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMyInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getMyintegersMyIntegerParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Planning__MyintegersAssignment_4"


    // $ANTLR start "rule__Planning__MyarraysAssignment_5"
    // InternalTaskDSL.g:4461:1: rule__Planning__MyarraysAssignment_5 : ( ruleMyArray ) ;
    public final void rule__Planning__MyarraysAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4465:1: ( ( ruleMyArray ) )
            // InternalTaskDSL.g:4466:2: ( ruleMyArray )
            {
            // InternalTaskDSL.g:4466:2: ( ruleMyArray )
            // InternalTaskDSL.g:4467:3: ruleMyArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlanningAccess().getMyarraysMyArrayParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMyArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlanningAccess().getMyarraysMyArrayParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Planning__MyarraysAssignment_5"


    // $ANTLR start "rule__MyInteger__NameAssignment_1"
    // InternalTaskDSL.g:4476:1: rule__MyInteger__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MyInteger__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4480:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:4481:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:4481:2: ( RULE_ID )
            // InternalTaskDSL.g:4482:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyIntegerAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyIntegerAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__MyInteger__NameAssignment_1"


    // $ANTLR start "rule__MyInteger__NumberAssignment_2"
    // InternalTaskDSL.g:4491:1: rule__MyInteger__NumberAssignment_2 : ( ruleIntExpression ) ;
    public final void rule__MyInteger__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4495:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:4496:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:4496:2: ( ruleIntExpression )
            // InternalTaskDSL.g:4497:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyIntegerAccess().getNumberIntExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyIntegerAccess().getNumberIntExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__MyInteger__NumberAssignment_2"


    // $ANTLR start "rule__MyArray__NameAssignment_1"
    // InternalTaskDSL.g:4506:1: rule__MyArray__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MyArray__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4510:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:4511:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:4511:2: ( RULE_ID )
            // InternalTaskDSL.g:4512:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__MyArray__NameAssignment_1"


    // $ANTLR start "rule__MyArray__ElementsAssignment_4_0"
    // InternalTaskDSL.g:4521:1: rule__MyArray__ElementsAssignment_4_0 : ( ruleExpressionConstantInt ) ;
    public final void rule__MyArray__ElementsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4525:1: ( ( ruleExpressionConstantInt ) )
            // InternalTaskDSL.g:4526:2: ( ruleExpressionConstantInt )
            {
            // InternalTaskDSL.g:4526:2: ( ruleExpressionConstantInt )
            // InternalTaskDSL.g:4527:3: ruleExpressionConstantInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getElementsExpressionConstantIntParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getElementsExpressionConstantIntParserRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__MyArray__ElementsAssignment_4_0"


    // $ANTLR start "rule__MyArray__ElementsAssignment_4_1_1"
    // InternalTaskDSL.g:4536:1: rule__MyArray__ElementsAssignment_4_1_1 : ( ruleExpressionConstantInt ) ;
    public final void rule__MyArray__ElementsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4540:1: ( ( ruleExpressionConstantInt ) )
            // InternalTaskDSL.g:4541:2: ( ruleExpressionConstantInt )
            {
            // InternalTaskDSL.g:4541:2: ( ruleExpressionConstantInt )
            // InternalTaskDSL.g:4542:3: ruleExpressionConstantInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMyArrayAccess().getElementsExpressionConstantIntParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMyArrayAccess().getElementsExpressionConstantIntParserRuleCall_4_1_1_0()); 
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
    // $ANTLR end "rule__MyArray__ElementsAssignment_4_1_1"


    // $ANTLR start "rule__ArraySpecificationInit__NameAssignment_1"
    // InternalTaskDSL.g:4551:1: rule__ArraySpecificationInit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArraySpecificationInit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4555:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:4556:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:4556:2: ( RULE_ID )
            // InternalTaskDSL.g:4557:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ArraySpecificationInit__NameAssignment_1"


    // $ANTLR start "rule__ArraySpecificationInit__InitAssignment_2"
    // InternalTaskDSL.g:4566:1: rule__ArraySpecificationInit__InitAssignment_2 : ( ruleArraySpecification ) ;
    public final void rule__ArraySpecificationInit__InitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4570:1: ( ( ruleArraySpecification ) )
            // InternalTaskDSL.g:4571:2: ( ruleArraySpecification )
            {
            // InternalTaskDSL.g:4571:2: ( ruleArraySpecification )
            // InternalTaskDSL.g:4572:3: ruleArraySpecification
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitAccess().getInitArraySpecificationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArraySpecification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitAccess().getInitArraySpecificationParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ArraySpecificationInit__InitAssignment_2"


    // $ANTLR start "rule__ArraySpecificationInit__ValuesAssignment_3_1"
    // InternalTaskDSL.g:4581:1: rule__ArraySpecificationInit__ValuesAssignment_3_1 : ( ruleArrayInitialization ) ;
    public final void rule__ArraySpecificationInit__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4585:1: ( ( ruleArrayInitialization ) )
            // InternalTaskDSL.g:4586:2: ( ruleArrayInitialization )
            {
            // InternalTaskDSL.g:4586:2: ( ruleArrayInitialization )
            // InternalTaskDSL.g:4587:3: ruleArrayInitialization
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationInitAccess().getValuesArrayInitializationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayInitialization();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationInitAccess().getValuesArrayInitializationParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__ArraySpecificationInit__ValuesAssignment_3_1"


    // $ANTLR start "rule__ArraySpecification__IntervalAssignment_1_0"
    // InternalTaskDSL.g:4596:1: rule__ArraySpecification__IntervalAssignment_1_0 : ( ruleArrayInterval ) ;
    public final void rule__ArraySpecification__IntervalAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4600:1: ( ( ruleArrayInterval ) )
            // InternalTaskDSL.g:4601:2: ( ruleArrayInterval )
            {
            // InternalTaskDSL.g:4601:2: ( ruleArrayInterval )
            // InternalTaskDSL.g:4602:3: ruleArrayInterval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySpecificationAccess().getIntervalArrayIntervalParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayInterval();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySpecificationAccess().getIntervalArrayIntervalParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__ArraySpecification__IntervalAssignment_1_0"


    // $ANTLR start "rule__ArrayInterval__StartAssignment_0"
    // InternalTaskDSL.g:4611:1: rule__ArrayInterval__StartAssignment_0 : ( ruleIntExpression ) ;
    public final void rule__ArrayInterval__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4615:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:4616:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:4616:2: ( ruleIntExpression )
            // InternalTaskDSL.g:4617:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayIntervalAccess().getStartIntExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayIntervalAccess().getStartIntExpressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__ArrayInterval__StartAssignment_0"


    // $ANTLR start "rule__ArrayInterval__EndAssignment_2"
    // InternalTaskDSL.g:4626:1: rule__ArrayInterval__EndAssignment_2 : ( ruleIntExpression ) ;
    public final void rule__ArrayInterval__EndAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4630:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:4631:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:4631:2: ( ruleIntExpression )
            // InternalTaskDSL.g:4632:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayIntervalAccess().getEndIntExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayIntervalAccess().getEndIntExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ArrayInterval__EndAssignment_2"


    // $ANTLR start "rule__ArrayInitialization__ElementsAssignment_1"
    // InternalTaskDSL.g:4641:1: rule__ArrayInitialization__ElementsAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ArrayInitialization__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4645:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:4646:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:4646:2: ( ruleIntExpression )
            // InternalTaskDSL.g:4647:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayInitializationAccess().getElementsIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayInitializationAccess().getElementsIntExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ArrayInitialization__ElementsAssignment_1"


    // $ANTLR start "rule__ArrayInitialization__ElementsAssignment_2_1"
    // InternalTaskDSL.g:4656:1: rule__ArrayInitialization__ElementsAssignment_2_1 : ( ruleIntExpression ) ;
    public final void rule__ArrayInitialization__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4660:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:4661:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:4661:2: ( ruleIntExpression )
            // InternalTaskDSL.g:4662:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayInitializationAccess().getElementsIntExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayInitializationAccess().getElementsIntExpressionParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__ArrayInitialization__ElementsAssignment_2_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalTaskDSL.g:4671:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4675:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:4676:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:4676:2: ( RULE_ID )
            // InternalTaskDSL.g:4677:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Task__ActionAssignment_1"
    // InternalTaskDSL.g:4686:1: rule__Task__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__Task__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4690:1: ( ( ruleAction ) )
            // InternalTaskDSL.g:4691:2: ( ruleAction )
            {
            // InternalTaskDSL.g:4691:2: ( ruleAction )
            // InternalTaskDSL.g:4692:3: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Task__ActionAssignment_1"


    // $ANTLR start "rule__Task__PersonsAssignment_3"
    // InternalTaskDSL.g:4701:1: rule__Task__PersonsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Task__PersonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4705:1: ( ( ( RULE_ID ) ) )
            // InternalTaskDSL.g:4706:2: ( ( RULE_ID ) )
            {
            // InternalTaskDSL.g:4706:2: ( ( RULE_ID ) )
            // InternalTaskDSL.g:4707:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); 
            }
            // InternalTaskDSL.g:4708:3: ( RULE_ID )
            // InternalTaskDSL.g:4709:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); 
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
    // $ANTLR end "rule__Task__PersonsAssignment_3"


    // $ANTLR start "rule__Task__PrioAssignment_5"
    // InternalTaskDSL.g:4720:1: rule__Task__PrioAssignment_5 : ( RULE_INT ) ;
    public final void rule__Task__PrioAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4724:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:4725:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:4725:2: ( RULE_INT )
            // InternalTaskDSL.g:4726:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0()); 
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
    // $ANTLR end "rule__Task__PrioAssignment_5"


    // $ANTLR start "rule__Task__DurationAssignment_6_1"
    // InternalTaskDSL.g:4735:1: rule__Task__DurationAssignment_6_1 : ( ruleDuration ) ;
    public final void rule__Task__DurationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4739:1: ( ( ruleDuration ) )
            // InternalTaskDSL.g:4740:2: ( ruleDuration )
            {
            // InternalTaskDSL.g:4740:2: ( ruleDuration )
            // InternalTaskDSL.g:4741:3: ruleDuration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTaskAccess().getDurationDurationParserRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__Task__DurationAssignment_6_1"


    // $ANTLR start "rule__Duration__DlAssignment_0"
    // InternalTaskDSL.g:4750:1: rule__Duration__DlAssignment_0 : ( RULE_INT ) ;
    public final void rule__Duration__DlAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4754:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:4755:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:4755:2: ( RULE_INT )
            // InternalTaskDSL.g:4756:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getDlINTTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Duration__DlAssignment_0"


    // $ANTLR start "rule__Duration__UnitAssignment_1"
    // InternalTaskDSL.g:4765:1: rule__Duration__UnitAssignment_1 : ( ruleTimeUnit ) ;
    public final void rule__Duration__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4769:1: ( ( ruleTimeUnit ) )
            // InternalTaskDSL.g:4770:2: ( ruleTimeUnit )
            {
            // InternalTaskDSL.g:4770:2: ( ruleTimeUnit )
            // InternalTaskDSL.g:4771:3: ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__Duration__UnitAssignment_1"


    // $ANTLR start "rule__LunchAction__LocationAssignment_1"
    // InternalTaskDSL.g:4780:1: rule__LunchAction__LocationAssignment_1 : ( RULE_ID ) ;
    public final void rule__LunchAction__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4784:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:4785:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:4785:2: ( RULE_ID )
            // InternalTaskDSL.g:4786:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__LunchAction__LocationAssignment_1"


    // $ANTLR start "rule__MeetingAction__TopicAssignment_1"
    // InternalTaskDSL.g:4795:1: rule__MeetingAction__TopicAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MeetingAction__TopicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4799:1: ( ( RULE_STRING ) )
            // InternalTaskDSL.g:4800:2: ( RULE_STRING )
            {
            // InternalTaskDSL.g:4800:2: ( RULE_STRING )
            // InternalTaskDSL.g:4801:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__MeetingAction__TopicAssignment_1"


    // $ANTLR start "rule__PaperAction__ReportAssignment_1"
    // InternalTaskDSL.g:4810:1: rule__PaperAction__ReportAssignment_1 : ( RULE_ID ) ;
    public final void rule__PaperAction__ReportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4814:1: ( ( RULE_ID ) )
            // InternalTaskDSL.g:4815:2: ( RULE_ID )
            {
            // InternalTaskDSL.g:4815:2: ( RULE_ID )
            // InternalTaskDSL.g:4816:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__PaperAction__ReportAssignment_1"


    // $ANTLR start "rule__PaymentAction__ConditionAssignment_0_1"
    // InternalTaskDSL.g:4825:1: rule__PaymentAction__ConditionAssignment_0_1 : ( ruleBooleanExpression ) ;
    public final void rule__PaymentAction__ConditionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4829:1: ( ( ruleBooleanExpression ) )
            // InternalTaskDSL.g:4830:2: ( ruleBooleanExpression )
            {
            // InternalTaskDSL.g:4830:2: ( ruleBooleanExpression )
            // InternalTaskDSL.g:4831:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getConditionBooleanExpressionParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getConditionBooleanExpressionParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__PaymentAction__ConditionAssignment_0_1"


    // $ANTLR start "rule__PaymentAction__AmountAssignment_2"
    // InternalTaskDSL.g:4840:1: rule__PaymentAction__AmountAssignment_2 : ( ruleIntExpression ) ;
    public final void rule__PaymentAction__AmountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4844:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:4845:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:4845:2: ( ruleIntExpression )
            // InternalTaskDSL.g:4846:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPaymentActionAccess().getAmountIntExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__PaymentAction__AmountAssignment_2"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_0_2"
    // InternalTaskDSL.g:4855:1: rule__ExpressionLevel1__RightAssignment_1_0_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4859:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:4860:2: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:4860:2: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:4861:3: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_1_2"
    // InternalTaskDSL.g:4870:1: rule__ExpressionLevel1__RightAssignment_1_1_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4874:1: ( ( ruleExpressionLevel2 ) )
            // InternalTaskDSL.g:4875:2: ( ruleExpressionLevel2 )
            {
            // InternalTaskDSL.g:4875:2: ( ruleExpressionLevel2 )
            // InternalTaskDSL.g:4876:3: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_0_2"
    // InternalTaskDSL.g:4885:1: rule__ExpressionLevel2__RightAssignment_1_0_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4889:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:4890:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:4890:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:4891:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_1_2"
    // InternalTaskDSL.g:4900:1: rule__ExpressionLevel2__RightAssignment_1_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4904:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:4905:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:4905:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:4906:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_2_2"
    // InternalTaskDSL.g:4915:1: rule__ExpressionLevel2__RightAssignment_1_2_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4919:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:4920:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:4920:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:4921:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_2_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_3_2"
    // InternalTaskDSL.g:4930:1: rule__ExpressionLevel2__RightAssignment_1_3_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4934:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:4935:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:4935:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:4936:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_3_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_4_2"
    // InternalTaskDSL.g:4945:1: rule__ExpressionLevel2__RightAssignment_1_4_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4949:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:4950:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:4950:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:4951:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_4_2"


    // $ANTLR start "rule__ExpressionLevel3__RightAssignment_1_2"
    // InternalTaskDSL.g:4960:1: rule__ExpressionLevel3__RightAssignment_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel3__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4964:1: ( ( ruleExpressionLevel3 ) )
            // InternalTaskDSL.g:4965:2: ( ruleExpressionLevel3 )
            {
            // InternalTaskDSL.g:4965:2: ( ruleExpressionLevel3 )
            // InternalTaskDSL.g:4966:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel3__RightAssignment_1_2"


    // $ANTLR start "rule__ExpressionMinus__SubAssignment_1"
    // InternalTaskDSL.g:4975:1: rule__ExpressionMinus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionMinus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4979:1: ( ( ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:4980:2: ( ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:4980:2: ( ruleExpressionLevel5 )
            // InternalTaskDSL.g:4981:3: ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExpressionMinus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionPlus__SubAssignment_1"
    // InternalTaskDSL.g:4990:1: rule__ExpressionPlus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionPlus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:4994:1: ( ( ruleExpressionLevel5 ) )
            // InternalTaskDSL.g:4995:2: ( ruleExpressionLevel5 )
            {
            // InternalTaskDSL.g:4995:2: ( ruleExpressionLevel5 )
            // InternalTaskDSL.g:4996:3: ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExpressionPlus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionBracket__SubAssignment_1"
    // InternalTaskDSL.g:5005:1: rule__ExpressionBracket__SubAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5009:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:5010:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:5010:2: ( ruleIntExpression )
            // InternalTaskDSL.g:5011:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__ExpressionConstantInt__ValueAssignment"
    // InternalTaskDSL.g:5020:1: rule__ExpressionConstantInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ExpressionConstantInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5024:1: ( ( RULE_INT ) )
            // InternalTaskDSL.g:5025:2: ( RULE_INT )
            {
            // InternalTaskDSL.g:5025:2: ( RULE_INT )
            // InternalTaskDSL.g:5026:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionConstantInt__ValueAssignment"


    // $ANTLR start "rule__ExpressionBalance__ValueAssignment"
    // InternalTaskDSL.g:5035:1: rule__ExpressionBalance__ValueAssignment : ( ruleBalance ) ;
    public final void rule__ExpressionBalance__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5039:1: ( ( ruleBalance ) )
            // InternalTaskDSL.g:5040:2: ( ruleBalance )
            {
            // InternalTaskDSL.g:5040:2: ( ruleBalance )
            // InternalTaskDSL.g:5041:3: ruleBalance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBalance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBalanceAccess().getValueBalanceEnumRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionBalance__ValueAssignment"


    // $ANTLR start "rule__BooleanExpressionLevel1__BopAssignment_1_1"
    // InternalTaskDSL.g:5050:1: rule__BooleanExpressionLevel1__BopAssignment_1_1 : ( ruleBinaryBooleanOperator ) ;
    public final void rule__BooleanExpressionLevel1__BopAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5054:1: ( ( ruleBinaryBooleanOperator ) )
            // InternalTaskDSL.g:5055:2: ( ruleBinaryBooleanOperator )
            {
            // InternalTaskDSL.g:5055:2: ( ruleBinaryBooleanOperator )
            // InternalTaskDSL.g:5056:3: ruleBinaryBooleanOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryBooleanOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__BopAssignment_1_1"


    // $ANTLR start "rule__BooleanExpressionLevel1__RightAssignment_1_2"
    // InternalTaskDSL.g:5065:1: rule__BooleanExpressionLevel1__RightAssignment_1_2 : ( ruleBooleanExpressionLevel2 ) ;
    public final void rule__BooleanExpressionLevel1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5069:1: ( ( ruleBooleanExpressionLevel2 ) )
            // InternalTaskDSL.g:5070:2: ( ruleBooleanExpressionLevel2 )
            {
            // InternalTaskDSL.g:5070:2: ( ruleBooleanExpressionLevel2 )
            // InternalTaskDSL.g:5071:3: ruleBooleanExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__RightAssignment_1_2"


    // $ANTLR start "rule__NotExpression__SubAssignment_1"
    // InternalTaskDSL.g:5080:1: rule__NotExpression__SubAssignment_1 : ( ruleBooleanExpressionLevel3 ) ;
    public final void rule__NotExpression__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5084:1: ( ( ruleBooleanExpressionLevel3 ) )
            // InternalTaskDSL.g:5085:2: ( ruleBooleanExpressionLevel3 )
            {
            // InternalTaskDSL.g:5085:2: ( ruleBooleanExpressionLevel3 )
            // InternalTaskDSL.g:5086:3: ruleBooleanExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__NotExpression__SubAssignment_1"


    // $ANTLR start "rule__ComparisonExpression__LeftAssignment_1"
    // InternalTaskDSL.g:5095:1: rule__ComparisonExpression__LeftAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ComparisonExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5099:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:5100:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:5100:2: ( ruleIntExpression )
            // InternalTaskDSL.g:5101:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ComparisonExpression__LeftAssignment_1"


    // $ANTLR start "rule__ComparisonExpression__OpAssignment_2"
    // InternalTaskDSL.g:5110:1: rule__ComparisonExpression__OpAssignment_2 : ( ruleCompareOperator ) ;
    public final void rule__ComparisonExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5114:1: ( ( ruleCompareOperator ) )
            // InternalTaskDSL.g:5115:2: ( ruleCompareOperator )
            {
            // InternalTaskDSL.g:5115:2: ( ruleCompareOperator )
            // InternalTaskDSL.g:5116:3: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
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
    // $ANTLR end "rule__ComparisonExpression__OpAssignment_2"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_3"
    // InternalTaskDSL.g:5125:1: rule__ComparisonExpression__RightAssignment_3 : ( ruleIntExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5129:1: ( ( ruleIntExpression ) )
            // InternalTaskDSL.g:5130:2: ( ruleIntExpression )
            {
            // InternalTaskDSL.g:5130:2: ( ruleIntExpression )
            // InternalTaskDSL.g:5131:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_3"


    // $ANTLR start "rule__BooleanExpressionBracket__SubAssignment_1"
    // InternalTaskDSL.g:5140:1: rule__BooleanExpressionBracket__SubAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__BooleanExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5144:1: ( ( ruleBooleanExpression ) )
            // InternalTaskDSL.g:5145:2: ( ruleBooleanExpression )
            {
            // InternalTaskDSL.g:5145:2: ( ruleBooleanExpression )
            // InternalTaskDSL.g:5146:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__BooleanExpressionConstant__ValueAssignment"
    // InternalTaskDSL.g:5155:1: rule__BooleanExpressionConstant__ValueAssignment : ( RULE_BOOL_LITERAL ) ;
    public final void rule__BooleanExpressionConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDSL.g:5159:1: ( ( RULE_BOOL_LITERAL ) )
            // InternalTaskDSL.g:5160:2: ( RULE_BOOL_LITERAL )
            {
            // InternalTaskDSL.g:5160:2: ( RULE_BOOL_LITERAL )
            // InternalTaskDSL.g:5161:3: RULE_BOOL_LITERAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOL_LITERAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanExpressionConstant__ValueAssignment"

    // $ANTLR start synpred17_InternalTaskDSL
    public final void synpred17_InternalTaskDSL_fragment() throws RecognitionException {   
        // InternalTaskDSL.g:1188:2: ( ( ( ruleComparisonExpression ) ) )
        // InternalTaskDSL.g:1188:2: ( ( ruleComparisonExpression ) )
        {
        // InternalTaskDSL.g:1188:2: ( ( ruleComparisonExpression ) )
        // InternalTaskDSL.g:1189:3: ( ruleComparisonExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
        }
        // InternalTaskDSL.g:1190:3: ( ruleComparisonExpression )
        // InternalTaskDSL.g:1190:4: ruleComparisonExpression
        {
        pushFollow(FOLLOW_2);
        ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalTaskDSL

    // $ANTLR start synpred18_InternalTaskDSL
    public final void synpred18_InternalTaskDSL_fragment() throws RecognitionException {   
        // InternalTaskDSL.g:1194:2: ( ( ruleBooleanExpressionBracket ) )
        // InternalTaskDSL.g:1194:2: ( ruleBooleanExpressionBracket )
        {
        // InternalTaskDSL.g:1194:2: ( ruleBooleanExpressionBracket )
        // InternalTaskDSL.g:1195:3: ruleBooleanExpressionBracket
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleBooleanExpressionBracket();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalTaskDSL

    // Delegated rules

    public final boolean synpred18_InternalTaskDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalTaskDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalTaskDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalTaskDSL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0080001A18000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001A00000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0010C00000001020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0010C00000003020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00002F0000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0050C000000010A0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0007000000006000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0007000000006002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000003F00000L});

}