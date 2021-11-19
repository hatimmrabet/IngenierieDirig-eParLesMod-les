package fil.xtext.ide.contentassist.antlr.internal;

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
import fil.xtext.services.LangFilGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLangFilParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Faculte'", "'{'", "'}'", "'niveaux'", "','", "'intervenants'", "'Niveau'", "'pseudo'", "'responsables'", "'('", "')'", "'formations'", "'presentation'", "'ues'", "'Intervenant'", "'prenom'", "'Formation'", "'s1'", "'s2'", "'enseignants'", "'documents'", "'Presentation'", "'contenue'", "'UE'", "'S1'", "'uesoptionnelles'", "'uesobligatoires'", "'S2'", "'Video'", "'description'", "'lien'", "'duree'", "'Fichier'", "'auteur'", "'Audio'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLangFilParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLangFilParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLangFilParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLangFil.g"; }


    	private LangFilGrammarAccess grammarAccess;

    	public void setGrammarAccess(LangFilGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleFaculte"
    // InternalLangFil.g:53:1: entryRuleFaculte : ruleFaculte EOF ;
    public final void entryRuleFaculte() throws RecognitionException {
        try {
            // InternalLangFil.g:54:1: ( ruleFaculte EOF )
            // InternalLangFil.g:55:1: ruleFaculte EOF
            {
             before(grammarAccess.getFaculteRule()); 
            pushFollow(FOLLOW_1);
            ruleFaculte();

            state._fsp--;

             after(grammarAccess.getFaculteRule()); 
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
    // $ANTLR end "entryRuleFaculte"


    // $ANTLR start "ruleFaculte"
    // InternalLangFil.g:62:1: ruleFaculte : ( ( rule__Faculte__Group__0 ) ) ;
    public final void ruleFaculte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:66:2: ( ( ( rule__Faculte__Group__0 ) ) )
            // InternalLangFil.g:67:2: ( ( rule__Faculte__Group__0 ) )
            {
            // InternalLangFil.g:67:2: ( ( rule__Faculte__Group__0 ) )
            // InternalLangFil.g:68:3: ( rule__Faculte__Group__0 )
            {
             before(grammarAccess.getFaculteAccess().getGroup()); 
            // InternalLangFil.g:69:3: ( rule__Faculte__Group__0 )
            // InternalLangFil.g:69:4: rule__Faculte__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFaculteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFaculte"


    // $ANTLR start "entryRuleDocument"
    // InternalLangFil.g:78:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalLangFil.g:79:1: ( ruleDocument EOF )
            // InternalLangFil.g:80:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalLangFil.g:87:1: ruleDocument : ( ( rule__Document__Alternatives ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:91:2: ( ( ( rule__Document__Alternatives ) ) )
            // InternalLangFil.g:92:2: ( ( rule__Document__Alternatives ) )
            {
            // InternalLangFil.g:92:2: ( ( rule__Document__Alternatives ) )
            // InternalLangFil.g:93:3: ( rule__Document__Alternatives )
            {
             before(grammarAccess.getDocumentAccess().getAlternatives()); 
            // InternalLangFil.g:94:3: ( rule__Document__Alternatives )
            // InternalLangFil.g:94:4: rule__Document__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Document__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleEString"
    // InternalLangFil.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalLangFil.g:104:1: ( ruleEString EOF )
            // InternalLangFil.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalLangFil.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalLangFil.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalLangFil.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalLangFil.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalLangFil.g:119:3: ( rule__EString__Alternatives )
            // InternalLangFil.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleNiveau"
    // InternalLangFil.g:128:1: entryRuleNiveau : ruleNiveau EOF ;
    public final void entryRuleNiveau() throws RecognitionException {
        try {
            // InternalLangFil.g:129:1: ( ruleNiveau EOF )
            // InternalLangFil.g:130:1: ruleNiveau EOF
            {
             before(grammarAccess.getNiveauRule()); 
            pushFollow(FOLLOW_1);
            ruleNiveau();

            state._fsp--;

             after(grammarAccess.getNiveauRule()); 
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
    // $ANTLR end "entryRuleNiveau"


    // $ANTLR start "ruleNiveau"
    // InternalLangFil.g:137:1: ruleNiveau : ( ( rule__Niveau__Group__0 ) ) ;
    public final void ruleNiveau() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:141:2: ( ( ( rule__Niveau__Group__0 ) ) )
            // InternalLangFil.g:142:2: ( ( rule__Niveau__Group__0 ) )
            {
            // InternalLangFil.g:142:2: ( ( rule__Niveau__Group__0 ) )
            // InternalLangFil.g:143:3: ( rule__Niveau__Group__0 )
            {
             before(grammarAccess.getNiveauAccess().getGroup()); 
            // InternalLangFil.g:144:3: ( rule__Niveau__Group__0 )
            // InternalLangFil.g:144:4: rule__Niveau__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNiveau"


    // $ANTLR start "entryRuleIntervenant"
    // InternalLangFil.g:153:1: entryRuleIntervenant : ruleIntervenant EOF ;
    public final void entryRuleIntervenant() throws RecognitionException {
        try {
            // InternalLangFil.g:154:1: ( ruleIntervenant EOF )
            // InternalLangFil.g:155:1: ruleIntervenant EOF
            {
             before(grammarAccess.getIntervenantRule()); 
            pushFollow(FOLLOW_1);
            ruleIntervenant();

            state._fsp--;

             after(grammarAccess.getIntervenantRule()); 
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
    // $ANTLR end "entryRuleIntervenant"


    // $ANTLR start "ruleIntervenant"
    // InternalLangFil.g:162:1: ruleIntervenant : ( ( rule__Intervenant__Group__0 ) ) ;
    public final void ruleIntervenant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:166:2: ( ( ( rule__Intervenant__Group__0 ) ) )
            // InternalLangFil.g:167:2: ( ( rule__Intervenant__Group__0 ) )
            {
            // InternalLangFil.g:167:2: ( ( rule__Intervenant__Group__0 ) )
            // InternalLangFil.g:168:3: ( rule__Intervenant__Group__0 )
            {
             before(grammarAccess.getIntervenantAccess().getGroup()); 
            // InternalLangFil.g:169:3: ( rule__Intervenant__Group__0 )
            // InternalLangFil.g:169:4: rule__Intervenant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Intervenant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntervenantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntervenant"


    // $ANTLR start "entryRuleFormation"
    // InternalLangFil.g:178:1: entryRuleFormation : ruleFormation EOF ;
    public final void entryRuleFormation() throws RecognitionException {
        try {
            // InternalLangFil.g:179:1: ( ruleFormation EOF )
            // InternalLangFil.g:180:1: ruleFormation EOF
            {
             before(grammarAccess.getFormationRule()); 
            pushFollow(FOLLOW_1);
            ruleFormation();

            state._fsp--;

             after(grammarAccess.getFormationRule()); 
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
    // $ANTLR end "entryRuleFormation"


    // $ANTLR start "ruleFormation"
    // InternalLangFil.g:187:1: ruleFormation : ( ( rule__Formation__Group__0 ) ) ;
    public final void ruleFormation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:191:2: ( ( ( rule__Formation__Group__0 ) ) )
            // InternalLangFil.g:192:2: ( ( rule__Formation__Group__0 ) )
            {
            // InternalLangFil.g:192:2: ( ( rule__Formation__Group__0 ) )
            // InternalLangFil.g:193:3: ( rule__Formation__Group__0 )
            {
             before(grammarAccess.getFormationAccess().getGroup()); 
            // InternalLangFil.g:194:3: ( rule__Formation__Group__0 )
            // InternalLangFil.g:194:4: rule__Formation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormation"


    // $ANTLR start "entryRulePresentation"
    // InternalLangFil.g:203:1: entryRulePresentation : rulePresentation EOF ;
    public final void entryRulePresentation() throws RecognitionException {
        try {
            // InternalLangFil.g:204:1: ( rulePresentation EOF )
            // InternalLangFil.g:205:1: rulePresentation EOF
            {
             before(grammarAccess.getPresentationRule()); 
            pushFollow(FOLLOW_1);
            rulePresentation();

            state._fsp--;

             after(grammarAccess.getPresentationRule()); 
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
    // $ANTLR end "entryRulePresentation"


    // $ANTLR start "rulePresentation"
    // InternalLangFil.g:212:1: rulePresentation : ( ( rule__Presentation__Group__0 ) ) ;
    public final void rulePresentation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:216:2: ( ( ( rule__Presentation__Group__0 ) ) )
            // InternalLangFil.g:217:2: ( ( rule__Presentation__Group__0 ) )
            {
            // InternalLangFil.g:217:2: ( ( rule__Presentation__Group__0 ) )
            // InternalLangFil.g:218:3: ( rule__Presentation__Group__0 )
            {
             before(grammarAccess.getPresentationAccess().getGroup()); 
            // InternalLangFil.g:219:3: ( rule__Presentation__Group__0 )
            // InternalLangFil.g:219:4: rule__Presentation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePresentation"


    // $ANTLR start "entryRuleUE"
    // InternalLangFil.g:228:1: entryRuleUE : ruleUE EOF ;
    public final void entryRuleUE() throws RecognitionException {
        try {
            // InternalLangFil.g:229:1: ( ruleUE EOF )
            // InternalLangFil.g:230:1: ruleUE EOF
            {
             before(grammarAccess.getUERule()); 
            pushFollow(FOLLOW_1);
            ruleUE();

            state._fsp--;

             after(grammarAccess.getUERule()); 
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
    // $ANTLR end "entryRuleUE"


    // $ANTLR start "ruleUE"
    // InternalLangFil.g:237:1: ruleUE : ( ( rule__UE__Group__0 ) ) ;
    public final void ruleUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:241:2: ( ( ( rule__UE__Group__0 ) ) )
            // InternalLangFil.g:242:2: ( ( rule__UE__Group__0 ) )
            {
            // InternalLangFil.g:242:2: ( ( rule__UE__Group__0 ) )
            // InternalLangFil.g:243:3: ( rule__UE__Group__0 )
            {
             before(grammarAccess.getUEAccess().getGroup()); 
            // InternalLangFil.g:244:3: ( rule__UE__Group__0 )
            // InternalLangFil.g:244:4: rule__UE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUE"


    // $ANTLR start "entryRuleS1"
    // InternalLangFil.g:253:1: entryRuleS1 : ruleS1 EOF ;
    public final void entryRuleS1() throws RecognitionException {
        try {
            // InternalLangFil.g:254:1: ( ruleS1 EOF )
            // InternalLangFil.g:255:1: ruleS1 EOF
            {
             before(grammarAccess.getS1Rule()); 
            pushFollow(FOLLOW_1);
            ruleS1();

            state._fsp--;

             after(grammarAccess.getS1Rule()); 
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
    // $ANTLR end "entryRuleS1"


    // $ANTLR start "ruleS1"
    // InternalLangFil.g:262:1: ruleS1 : ( ( rule__S1__Group__0 ) ) ;
    public final void ruleS1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:266:2: ( ( ( rule__S1__Group__0 ) ) )
            // InternalLangFil.g:267:2: ( ( rule__S1__Group__0 ) )
            {
            // InternalLangFil.g:267:2: ( ( rule__S1__Group__0 ) )
            // InternalLangFil.g:268:3: ( rule__S1__Group__0 )
            {
             before(grammarAccess.getS1Access().getGroup()); 
            // InternalLangFil.g:269:3: ( rule__S1__Group__0 )
            // InternalLangFil.g:269:4: rule__S1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__S1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getS1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleS1"


    // $ANTLR start "entryRuleS2"
    // InternalLangFil.g:278:1: entryRuleS2 : ruleS2 EOF ;
    public final void entryRuleS2() throws RecognitionException {
        try {
            // InternalLangFil.g:279:1: ( ruleS2 EOF )
            // InternalLangFil.g:280:1: ruleS2 EOF
            {
             before(grammarAccess.getS2Rule()); 
            pushFollow(FOLLOW_1);
            ruleS2();

            state._fsp--;

             after(grammarAccess.getS2Rule()); 
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
    // $ANTLR end "entryRuleS2"


    // $ANTLR start "ruleS2"
    // InternalLangFil.g:287:1: ruleS2 : ( ( rule__S2__Group__0 ) ) ;
    public final void ruleS2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:291:2: ( ( ( rule__S2__Group__0 ) ) )
            // InternalLangFil.g:292:2: ( ( rule__S2__Group__0 ) )
            {
            // InternalLangFil.g:292:2: ( ( rule__S2__Group__0 ) )
            // InternalLangFil.g:293:3: ( rule__S2__Group__0 )
            {
             before(grammarAccess.getS2Access().getGroup()); 
            // InternalLangFil.g:294:3: ( rule__S2__Group__0 )
            // InternalLangFil.g:294:4: rule__S2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__S2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getS2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleS2"


    // $ANTLR start "entryRuleVideo"
    // InternalLangFil.g:303:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalLangFil.g:304:1: ( ruleVideo EOF )
            // InternalLangFil.g:305:1: ruleVideo EOF
            {
             before(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getVideoRule()); 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalLangFil.g:312:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:316:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalLangFil.g:317:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalLangFil.g:317:2: ( ( rule__Video__Group__0 ) )
            // InternalLangFil.g:318:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalLangFil.g:319:3: ( rule__Video__Group__0 )
            // InternalLangFil.g:319:4: rule__Video__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleFichier"
    // InternalLangFil.g:328:1: entryRuleFichier : ruleFichier EOF ;
    public final void entryRuleFichier() throws RecognitionException {
        try {
            // InternalLangFil.g:329:1: ( ruleFichier EOF )
            // InternalLangFil.g:330:1: ruleFichier EOF
            {
             before(grammarAccess.getFichierRule()); 
            pushFollow(FOLLOW_1);
            ruleFichier();

            state._fsp--;

             after(grammarAccess.getFichierRule()); 
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
    // $ANTLR end "entryRuleFichier"


    // $ANTLR start "ruleFichier"
    // InternalLangFil.g:337:1: ruleFichier : ( ( rule__Fichier__Group__0 ) ) ;
    public final void ruleFichier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:341:2: ( ( ( rule__Fichier__Group__0 ) ) )
            // InternalLangFil.g:342:2: ( ( rule__Fichier__Group__0 ) )
            {
            // InternalLangFil.g:342:2: ( ( rule__Fichier__Group__0 ) )
            // InternalLangFil.g:343:3: ( rule__Fichier__Group__0 )
            {
             before(grammarAccess.getFichierAccess().getGroup()); 
            // InternalLangFil.g:344:3: ( rule__Fichier__Group__0 )
            // InternalLangFil.g:344:4: rule__Fichier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFichierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFichier"


    // $ANTLR start "entryRuleAudio"
    // InternalLangFil.g:353:1: entryRuleAudio : ruleAudio EOF ;
    public final void entryRuleAudio() throws RecognitionException {
        try {
            // InternalLangFil.g:354:1: ( ruleAudio EOF )
            // InternalLangFil.g:355:1: ruleAudio EOF
            {
             before(grammarAccess.getAudioRule()); 
            pushFollow(FOLLOW_1);
            ruleAudio();

            state._fsp--;

             after(grammarAccess.getAudioRule()); 
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
    // $ANTLR end "entryRuleAudio"


    // $ANTLR start "ruleAudio"
    // InternalLangFil.g:362:1: ruleAudio : ( ( rule__Audio__Group__0 ) ) ;
    public final void ruleAudio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:366:2: ( ( ( rule__Audio__Group__0 ) ) )
            // InternalLangFil.g:367:2: ( ( rule__Audio__Group__0 ) )
            {
            // InternalLangFil.g:367:2: ( ( rule__Audio__Group__0 ) )
            // InternalLangFil.g:368:3: ( rule__Audio__Group__0 )
            {
             before(grammarAccess.getAudioAccess().getGroup()); 
            // InternalLangFil.g:369:3: ( rule__Audio__Group__0 )
            // InternalLangFil.g:369:4: rule__Audio__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAudio"


    // $ANTLR start "rule__Document__Alternatives"
    // InternalLangFil.g:377:1: rule__Document__Alternatives : ( ( ruleVideo ) | ( ruleFichier ) | ( ruleAudio ) );
    public final void rule__Document__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:381:1: ( ( ruleVideo ) | ( ruleFichier ) | ( ruleAudio ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt1=1;
                }
                break;
            case 43:
                {
                alt1=2;
                }
                break;
            case 45:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLangFil.g:382:2: ( ruleVideo )
                    {
                    // InternalLangFil.g:382:2: ( ruleVideo )
                    // InternalLangFil.g:383:3: ruleVideo
                    {
                     before(grammarAccess.getDocumentAccess().getVideoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVideo();

                    state._fsp--;

                     after(grammarAccess.getDocumentAccess().getVideoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLangFil.g:388:2: ( ruleFichier )
                    {
                    // InternalLangFil.g:388:2: ( ruleFichier )
                    // InternalLangFil.g:389:3: ruleFichier
                    {
                     before(grammarAccess.getDocumentAccess().getFichierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFichier();

                    state._fsp--;

                     after(grammarAccess.getDocumentAccess().getFichierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLangFil.g:394:2: ( ruleAudio )
                    {
                    // InternalLangFil.g:394:2: ( ruleAudio )
                    // InternalLangFil.g:395:3: ruleAudio
                    {
                     before(grammarAccess.getDocumentAccess().getAudioParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAudio();

                    state._fsp--;

                     after(grammarAccess.getDocumentAccess().getAudioParserRuleCall_2()); 

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
    // $ANTLR end "rule__Document__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalLangFil.g:404:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:408:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLangFil.g:409:2: ( RULE_STRING )
                    {
                    // InternalLangFil.g:409:2: ( RULE_STRING )
                    // InternalLangFil.g:410:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLangFil.g:415:2: ( RULE_ID )
                    {
                    // InternalLangFil.g:415:2: ( RULE_ID )
                    // InternalLangFil.g:416:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Faculte__Group__0"
    // InternalLangFil.g:425:1: rule__Faculte__Group__0 : rule__Faculte__Group__0__Impl rule__Faculte__Group__1 ;
    public final void rule__Faculte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:429:1: ( rule__Faculte__Group__0__Impl rule__Faculte__Group__1 )
            // InternalLangFil.g:430:2: rule__Faculte__Group__0__Impl rule__Faculte__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Faculte__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group__1();

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
    // $ANTLR end "rule__Faculte__Group__0"


    // $ANTLR start "rule__Faculte__Group__0__Impl"
    // InternalLangFil.g:437:1: rule__Faculte__Group__0__Impl : ( () ) ;
    public final void rule__Faculte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:441:1: ( ( () ) )
            // InternalLangFil.g:442:1: ( () )
            {
            // InternalLangFil.g:442:1: ( () )
            // InternalLangFil.g:443:2: ()
            {
             before(grammarAccess.getFaculteAccess().getFaculteAction_0()); 
            // InternalLangFil.g:444:2: ()
            // InternalLangFil.g:444:3: 
            {
            }

             after(grammarAccess.getFaculteAccess().getFaculteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group__0__Impl"


    // $ANTLR start "rule__Faculte__Group__1"
    // InternalLangFil.g:452:1: rule__Faculte__Group__1 : rule__Faculte__Group__1__Impl rule__Faculte__Group__2 ;
    public final void rule__Faculte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:456:1: ( rule__Faculte__Group__1__Impl rule__Faculte__Group__2 )
            // InternalLangFil.g:457:2: rule__Faculte__Group__1__Impl rule__Faculte__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Faculte__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group__2();

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
    // $ANTLR end "rule__Faculte__Group__1"


    // $ANTLR start "rule__Faculte__Group__1__Impl"
    // InternalLangFil.g:464:1: rule__Faculte__Group__1__Impl : ( 'Faculte' ) ;
    public final void rule__Faculte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:468:1: ( ( 'Faculte' ) )
            // InternalLangFil.g:469:1: ( 'Faculte' )
            {
            // InternalLangFil.g:469:1: ( 'Faculte' )
            // InternalLangFil.g:470:2: 'Faculte'
            {
             before(grammarAccess.getFaculteAccess().getFaculteKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getFaculteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group__1__Impl"


    // $ANTLR start "rule__Faculte__Group__2"
    // InternalLangFil.g:479:1: rule__Faculte__Group__2 : rule__Faculte__Group__2__Impl rule__Faculte__Group__3 ;
    public final void rule__Faculte__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:483:1: ( rule__Faculte__Group__2__Impl rule__Faculte__Group__3 )
            // InternalLangFil.g:484:2: rule__Faculte__Group__2__Impl rule__Faculte__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Faculte__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group__3();

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
    // $ANTLR end "rule__Faculte__Group__2"


    // $ANTLR start "rule__Faculte__Group__2__Impl"
    // InternalLangFil.g:491:1: rule__Faculte__Group__2__Impl : ( ( rule__Faculte__NameAssignment_2 ) ) ;
    public final void rule__Faculte__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:495:1: ( ( ( rule__Faculte__NameAssignment_2 ) ) )
            // InternalLangFil.g:496:1: ( ( rule__Faculte__NameAssignment_2 ) )
            {
            // InternalLangFil.g:496:1: ( ( rule__Faculte__NameAssignment_2 ) )
            // InternalLangFil.g:497:2: ( rule__Faculte__NameAssignment_2 )
            {
             before(grammarAccess.getFaculteAccess().getNameAssignment_2()); 
            // InternalLangFil.g:498:2: ( rule__Faculte__NameAssignment_2 )
            // InternalLangFil.g:498:3: rule__Faculte__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFaculteAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group__2__Impl"


    // $ANTLR start "rule__Faculte__Group__3"
    // InternalLangFil.g:506:1: rule__Faculte__Group__3 : rule__Faculte__Group__3__Impl rule__Faculte__Group__4 ;
    public final void rule__Faculte__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:510:1: ( rule__Faculte__Group__3__Impl rule__Faculte__Group__4 )
            // InternalLangFil.g:511:2: rule__Faculte__Group__3__Impl rule__Faculte__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Faculte__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group__4();

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
    // $ANTLR end "rule__Faculte__Group__3"


    // $ANTLR start "rule__Faculte__Group__3__Impl"
    // InternalLangFil.g:518:1: rule__Faculte__Group__3__Impl : ( '{' ) ;
    public final void rule__Faculte__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:522:1: ( ( '{' ) )
            // InternalLangFil.g:523:1: ( '{' )
            {
            // InternalLangFil.g:523:1: ( '{' )
            // InternalLangFil.g:524:2: '{'
            {
             before(grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group__3__Impl"


    // $ANTLR start "rule__Faculte__Group__4"
    // InternalLangFil.g:533:1: rule__Faculte__Group__4 : rule__Faculte__Group__4__Impl rule__Faculte__Group__5 ;
    public final void rule__Faculte__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:537:1: ( rule__Faculte__Group__4__Impl rule__Faculte__Group__5 )
            // InternalLangFil.g:538:2: rule__Faculte__Group__4__Impl rule__Faculte__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Faculte__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group__5();

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
    // $ANTLR end "rule__Faculte__Group__4"


    // $ANTLR start "rule__Faculte__Group__4__Impl"
    // InternalLangFil.g:545:1: rule__Faculte__Group__4__Impl : ( ( rule__Faculte__Group_4__0 )? ) ;
    public final void rule__Faculte__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:549:1: ( ( ( rule__Faculte__Group_4__0 )? ) )
            // InternalLangFil.g:550:1: ( ( rule__Faculte__Group_4__0 )? )
            {
            // InternalLangFil.g:550:1: ( ( rule__Faculte__Group_4__0 )? )
            // InternalLangFil.g:551:2: ( rule__Faculte__Group_4__0 )?
            {
             before(grammarAccess.getFaculteAccess().getGroup_4()); 
            // InternalLangFil.g:552:2: ( rule__Faculte__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLangFil.g:552:3: rule__Faculte__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Faculte__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFaculteAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group__4__Impl"


    // $ANTLR start "rule__Faculte__Group__5"
    // InternalLangFil.g:560:1: rule__Faculte__Group__5 : rule__Faculte__Group__5__Impl rule__Faculte__Group__6 ;
    public final void rule__Faculte__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:564:1: ( rule__Faculte__Group__5__Impl rule__Faculte__Group__6 )
            // InternalLangFil.g:565:2: rule__Faculte__Group__5__Impl rule__Faculte__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Faculte__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group__6();

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
    // $ANTLR end "rule__Faculte__Group__5"


    // $ANTLR start "rule__Faculte__Group__5__Impl"
    // InternalLangFil.g:572:1: rule__Faculte__Group__5__Impl : ( ( rule__Faculte__Group_5__0 )? ) ;
    public final void rule__Faculte__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:576:1: ( ( ( rule__Faculte__Group_5__0 )? ) )
            // InternalLangFil.g:577:1: ( ( rule__Faculte__Group_5__0 )? )
            {
            // InternalLangFil.g:577:1: ( ( rule__Faculte__Group_5__0 )? )
            // InternalLangFil.g:578:2: ( rule__Faculte__Group_5__0 )?
            {
             before(grammarAccess.getFaculteAccess().getGroup_5()); 
            // InternalLangFil.g:579:2: ( rule__Faculte__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLangFil.g:579:3: rule__Faculte__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Faculte__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFaculteAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group__5__Impl"


    // $ANTLR start "rule__Faculte__Group__6"
    // InternalLangFil.g:587:1: rule__Faculte__Group__6 : rule__Faculte__Group__6__Impl ;
    public final void rule__Faculte__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:591:1: ( rule__Faculte__Group__6__Impl )
            // InternalLangFil.g:592:2: rule__Faculte__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__Group__6__Impl();

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
    // $ANTLR end "rule__Faculte__Group__6"


    // $ANTLR start "rule__Faculte__Group__6__Impl"
    // InternalLangFil.g:598:1: rule__Faculte__Group__6__Impl : ( '}' ) ;
    public final void rule__Faculte__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:602:1: ( ( '}' ) )
            // InternalLangFil.g:603:1: ( '}' )
            {
            // InternalLangFil.g:603:1: ( '}' )
            // InternalLangFil.g:604:2: '}'
            {
             before(grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group__6__Impl"


    // $ANTLR start "rule__Faculte__Group_4__0"
    // InternalLangFil.g:614:1: rule__Faculte__Group_4__0 : rule__Faculte__Group_4__0__Impl rule__Faculte__Group_4__1 ;
    public final void rule__Faculte__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:618:1: ( rule__Faculte__Group_4__0__Impl rule__Faculte__Group_4__1 )
            // InternalLangFil.g:619:2: rule__Faculte__Group_4__0__Impl rule__Faculte__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Faculte__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group_4__1();

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
    // $ANTLR end "rule__Faculte__Group_4__0"


    // $ANTLR start "rule__Faculte__Group_4__0__Impl"
    // InternalLangFil.g:626:1: rule__Faculte__Group_4__0__Impl : ( 'niveaux' ) ;
    public final void rule__Faculte__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:630:1: ( ( 'niveaux' ) )
            // InternalLangFil.g:631:1: ( 'niveaux' )
            {
            // InternalLangFil.g:631:1: ( 'niveaux' )
            // InternalLangFil.g:632:2: 'niveaux'
            {
             before(grammarAccess.getFaculteAccess().getNiveauxKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getNiveauxKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_4__0__Impl"


    // $ANTLR start "rule__Faculte__Group_4__1"
    // InternalLangFil.g:641:1: rule__Faculte__Group_4__1 : rule__Faculte__Group_4__1__Impl rule__Faculte__Group_4__2 ;
    public final void rule__Faculte__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:645:1: ( rule__Faculte__Group_4__1__Impl rule__Faculte__Group_4__2 )
            // InternalLangFil.g:646:2: rule__Faculte__Group_4__1__Impl rule__Faculte__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Faculte__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group_4__2();

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
    // $ANTLR end "rule__Faculte__Group_4__1"


    // $ANTLR start "rule__Faculte__Group_4__1__Impl"
    // InternalLangFil.g:653:1: rule__Faculte__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Faculte__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:657:1: ( ( '{' ) )
            // InternalLangFil.g:658:1: ( '{' )
            {
            // InternalLangFil.g:658:1: ( '{' )
            // InternalLangFil.g:659:2: '{'
            {
             before(grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_4__1__Impl"


    // $ANTLR start "rule__Faculte__Group_4__2"
    // InternalLangFil.g:668:1: rule__Faculte__Group_4__2 : rule__Faculte__Group_4__2__Impl rule__Faculte__Group_4__3 ;
    public final void rule__Faculte__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:672:1: ( rule__Faculte__Group_4__2__Impl rule__Faculte__Group_4__3 )
            // InternalLangFil.g:673:2: rule__Faculte__Group_4__2__Impl rule__Faculte__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Faculte__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group_4__3();

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
    // $ANTLR end "rule__Faculte__Group_4__2"


    // $ANTLR start "rule__Faculte__Group_4__2__Impl"
    // InternalLangFil.g:680:1: rule__Faculte__Group_4__2__Impl : ( ( rule__Faculte__NiveauxAssignment_4_2 ) ) ;
    public final void rule__Faculte__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:684:1: ( ( ( rule__Faculte__NiveauxAssignment_4_2 ) ) )
            // InternalLangFil.g:685:1: ( ( rule__Faculte__NiveauxAssignment_4_2 ) )
            {
            // InternalLangFil.g:685:1: ( ( rule__Faculte__NiveauxAssignment_4_2 ) )
            // InternalLangFil.g:686:2: ( rule__Faculte__NiveauxAssignment_4_2 )
            {
             before(grammarAccess.getFaculteAccess().getNiveauxAssignment_4_2()); 
            // InternalLangFil.g:687:2: ( rule__Faculte__NiveauxAssignment_4_2 )
            // InternalLangFil.g:687:3: rule__Faculte__NiveauxAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__NiveauxAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getFaculteAccess().getNiveauxAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_4__2__Impl"


    // $ANTLR start "rule__Faculte__Group_4__3"
    // InternalLangFil.g:695:1: rule__Faculte__Group_4__3 : rule__Faculte__Group_4__3__Impl rule__Faculte__Group_4__4 ;
    public final void rule__Faculte__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:699:1: ( rule__Faculte__Group_4__3__Impl rule__Faculte__Group_4__4 )
            // InternalLangFil.g:700:2: rule__Faculte__Group_4__3__Impl rule__Faculte__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Faculte__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group_4__4();

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
    // $ANTLR end "rule__Faculte__Group_4__3"


    // $ANTLR start "rule__Faculte__Group_4__3__Impl"
    // InternalLangFil.g:707:1: rule__Faculte__Group_4__3__Impl : ( ( rule__Faculte__Group_4_3__0 )* ) ;
    public final void rule__Faculte__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:711:1: ( ( ( rule__Faculte__Group_4_3__0 )* ) )
            // InternalLangFil.g:712:1: ( ( rule__Faculte__Group_4_3__0 )* )
            {
            // InternalLangFil.g:712:1: ( ( rule__Faculte__Group_4_3__0 )* )
            // InternalLangFil.g:713:2: ( rule__Faculte__Group_4_3__0 )*
            {
             before(grammarAccess.getFaculteAccess().getGroup_4_3()); 
            // InternalLangFil.g:714:2: ( rule__Faculte__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLangFil.g:714:3: rule__Faculte__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Faculte__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFaculteAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_4__3__Impl"


    // $ANTLR start "rule__Faculte__Group_4__4"
    // InternalLangFil.g:722:1: rule__Faculte__Group_4__4 : rule__Faculte__Group_4__4__Impl ;
    public final void rule__Faculte__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:726:1: ( rule__Faculte__Group_4__4__Impl )
            // InternalLangFil.g:727:2: rule__Faculte__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__Group_4__4__Impl();

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
    // $ANTLR end "rule__Faculte__Group_4__4"


    // $ANTLR start "rule__Faculte__Group_4__4__Impl"
    // InternalLangFil.g:733:1: rule__Faculte__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Faculte__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:737:1: ( ( '}' ) )
            // InternalLangFil.g:738:1: ( '}' )
            {
            // InternalLangFil.g:738:1: ( '}' )
            // InternalLangFil.g:739:2: '}'
            {
             before(grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_4__4__Impl"


    // $ANTLR start "rule__Faculte__Group_4_3__0"
    // InternalLangFil.g:749:1: rule__Faculte__Group_4_3__0 : rule__Faculte__Group_4_3__0__Impl rule__Faculte__Group_4_3__1 ;
    public final void rule__Faculte__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:753:1: ( rule__Faculte__Group_4_3__0__Impl rule__Faculte__Group_4_3__1 )
            // InternalLangFil.g:754:2: rule__Faculte__Group_4_3__0__Impl rule__Faculte__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Faculte__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group_4_3__1();

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
    // $ANTLR end "rule__Faculte__Group_4_3__0"


    // $ANTLR start "rule__Faculte__Group_4_3__0__Impl"
    // InternalLangFil.g:761:1: rule__Faculte__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Faculte__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:765:1: ( ( ',' ) )
            // InternalLangFil.g:766:1: ( ',' )
            {
            // InternalLangFil.g:766:1: ( ',' )
            // InternalLangFil.g:767:2: ','
            {
             before(grammarAccess.getFaculteAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_4_3__0__Impl"


    // $ANTLR start "rule__Faculte__Group_4_3__1"
    // InternalLangFil.g:776:1: rule__Faculte__Group_4_3__1 : rule__Faculte__Group_4_3__1__Impl ;
    public final void rule__Faculte__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:780:1: ( rule__Faculte__Group_4_3__1__Impl )
            // InternalLangFil.g:781:2: rule__Faculte__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Faculte__Group_4_3__1"


    // $ANTLR start "rule__Faculte__Group_4_3__1__Impl"
    // InternalLangFil.g:787:1: rule__Faculte__Group_4_3__1__Impl : ( ( rule__Faculte__NiveauxAssignment_4_3_1 ) ) ;
    public final void rule__Faculte__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:791:1: ( ( ( rule__Faculte__NiveauxAssignment_4_3_1 ) ) )
            // InternalLangFil.g:792:1: ( ( rule__Faculte__NiveauxAssignment_4_3_1 ) )
            {
            // InternalLangFil.g:792:1: ( ( rule__Faculte__NiveauxAssignment_4_3_1 ) )
            // InternalLangFil.g:793:2: ( rule__Faculte__NiveauxAssignment_4_3_1 )
            {
             before(grammarAccess.getFaculteAccess().getNiveauxAssignment_4_3_1()); 
            // InternalLangFil.g:794:2: ( rule__Faculte__NiveauxAssignment_4_3_1 )
            // InternalLangFil.g:794:3: rule__Faculte__NiveauxAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__NiveauxAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFaculteAccess().getNiveauxAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_4_3__1__Impl"


    // $ANTLR start "rule__Faculte__Group_5__0"
    // InternalLangFil.g:803:1: rule__Faculte__Group_5__0 : rule__Faculte__Group_5__0__Impl rule__Faculte__Group_5__1 ;
    public final void rule__Faculte__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:807:1: ( rule__Faculte__Group_5__0__Impl rule__Faculte__Group_5__1 )
            // InternalLangFil.g:808:2: rule__Faculte__Group_5__0__Impl rule__Faculte__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Faculte__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group_5__1();

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
    // $ANTLR end "rule__Faculte__Group_5__0"


    // $ANTLR start "rule__Faculte__Group_5__0__Impl"
    // InternalLangFil.g:815:1: rule__Faculte__Group_5__0__Impl : ( 'intervenants' ) ;
    public final void rule__Faculte__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:819:1: ( ( 'intervenants' ) )
            // InternalLangFil.g:820:1: ( 'intervenants' )
            {
            // InternalLangFil.g:820:1: ( 'intervenants' )
            // InternalLangFil.g:821:2: 'intervenants'
            {
             before(grammarAccess.getFaculteAccess().getIntervenantsKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getIntervenantsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_5__0__Impl"


    // $ANTLR start "rule__Faculte__Group_5__1"
    // InternalLangFil.g:830:1: rule__Faculte__Group_5__1 : rule__Faculte__Group_5__1__Impl rule__Faculte__Group_5__2 ;
    public final void rule__Faculte__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:834:1: ( rule__Faculte__Group_5__1__Impl rule__Faculte__Group_5__2 )
            // InternalLangFil.g:835:2: rule__Faculte__Group_5__1__Impl rule__Faculte__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Faculte__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group_5__2();

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
    // $ANTLR end "rule__Faculte__Group_5__1"


    // $ANTLR start "rule__Faculte__Group_5__1__Impl"
    // InternalLangFil.g:842:1: rule__Faculte__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Faculte__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:846:1: ( ( '{' ) )
            // InternalLangFil.g:847:1: ( '{' )
            {
            // InternalLangFil.g:847:1: ( '{' )
            // InternalLangFil.g:848:2: '{'
            {
             before(grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_5__1__Impl"


    // $ANTLR start "rule__Faculte__Group_5__2"
    // InternalLangFil.g:857:1: rule__Faculte__Group_5__2 : rule__Faculte__Group_5__2__Impl rule__Faculte__Group_5__3 ;
    public final void rule__Faculte__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:861:1: ( rule__Faculte__Group_5__2__Impl rule__Faculte__Group_5__3 )
            // InternalLangFil.g:862:2: rule__Faculte__Group_5__2__Impl rule__Faculte__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Faculte__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group_5__3();

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
    // $ANTLR end "rule__Faculte__Group_5__2"


    // $ANTLR start "rule__Faculte__Group_5__2__Impl"
    // InternalLangFil.g:869:1: rule__Faculte__Group_5__2__Impl : ( ( rule__Faculte__IntervenantsAssignment_5_2 ) ) ;
    public final void rule__Faculte__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:873:1: ( ( ( rule__Faculte__IntervenantsAssignment_5_2 ) ) )
            // InternalLangFil.g:874:1: ( ( rule__Faculte__IntervenantsAssignment_5_2 ) )
            {
            // InternalLangFil.g:874:1: ( ( rule__Faculte__IntervenantsAssignment_5_2 ) )
            // InternalLangFil.g:875:2: ( rule__Faculte__IntervenantsAssignment_5_2 )
            {
             before(grammarAccess.getFaculteAccess().getIntervenantsAssignment_5_2()); 
            // InternalLangFil.g:876:2: ( rule__Faculte__IntervenantsAssignment_5_2 )
            // InternalLangFil.g:876:3: rule__Faculte__IntervenantsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__IntervenantsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFaculteAccess().getIntervenantsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_5__2__Impl"


    // $ANTLR start "rule__Faculte__Group_5__3"
    // InternalLangFil.g:884:1: rule__Faculte__Group_5__3 : rule__Faculte__Group_5__3__Impl rule__Faculte__Group_5__4 ;
    public final void rule__Faculte__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:888:1: ( rule__Faculte__Group_5__3__Impl rule__Faculte__Group_5__4 )
            // InternalLangFil.g:889:2: rule__Faculte__Group_5__3__Impl rule__Faculte__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Faculte__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group_5__4();

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
    // $ANTLR end "rule__Faculte__Group_5__3"


    // $ANTLR start "rule__Faculte__Group_5__3__Impl"
    // InternalLangFil.g:896:1: rule__Faculte__Group_5__3__Impl : ( ( rule__Faculte__Group_5_3__0 )* ) ;
    public final void rule__Faculte__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:900:1: ( ( ( rule__Faculte__Group_5_3__0 )* ) )
            // InternalLangFil.g:901:1: ( ( rule__Faculte__Group_5_3__0 )* )
            {
            // InternalLangFil.g:901:1: ( ( rule__Faculte__Group_5_3__0 )* )
            // InternalLangFil.g:902:2: ( rule__Faculte__Group_5_3__0 )*
            {
             before(grammarAccess.getFaculteAccess().getGroup_5_3()); 
            // InternalLangFil.g:903:2: ( rule__Faculte__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLangFil.g:903:3: rule__Faculte__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Faculte__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFaculteAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_5__3__Impl"


    // $ANTLR start "rule__Faculte__Group_5__4"
    // InternalLangFil.g:911:1: rule__Faculte__Group_5__4 : rule__Faculte__Group_5__4__Impl ;
    public final void rule__Faculte__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:915:1: ( rule__Faculte__Group_5__4__Impl )
            // InternalLangFil.g:916:2: rule__Faculte__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__Group_5__4__Impl();

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
    // $ANTLR end "rule__Faculte__Group_5__4"


    // $ANTLR start "rule__Faculte__Group_5__4__Impl"
    // InternalLangFil.g:922:1: rule__Faculte__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Faculte__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:926:1: ( ( '}' ) )
            // InternalLangFil.g:927:1: ( '}' )
            {
            // InternalLangFil.g:927:1: ( '}' )
            // InternalLangFil.g:928:2: '}'
            {
             before(grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_5__4__Impl"


    // $ANTLR start "rule__Faculte__Group_5_3__0"
    // InternalLangFil.g:938:1: rule__Faculte__Group_5_3__0 : rule__Faculte__Group_5_3__0__Impl rule__Faculte__Group_5_3__1 ;
    public final void rule__Faculte__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:942:1: ( rule__Faculte__Group_5_3__0__Impl rule__Faculte__Group_5_3__1 )
            // InternalLangFil.g:943:2: rule__Faculte__Group_5_3__0__Impl rule__Faculte__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Faculte__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Faculte__Group_5_3__1();

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
    // $ANTLR end "rule__Faculte__Group_5_3__0"


    // $ANTLR start "rule__Faculte__Group_5_3__0__Impl"
    // InternalLangFil.g:950:1: rule__Faculte__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Faculte__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:954:1: ( ( ',' ) )
            // InternalLangFil.g:955:1: ( ',' )
            {
            // InternalLangFil.g:955:1: ( ',' )
            // InternalLangFil.g:956:2: ','
            {
             before(grammarAccess.getFaculteAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFaculteAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_5_3__0__Impl"


    // $ANTLR start "rule__Faculte__Group_5_3__1"
    // InternalLangFil.g:965:1: rule__Faculte__Group_5_3__1 : rule__Faculte__Group_5_3__1__Impl ;
    public final void rule__Faculte__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:969:1: ( rule__Faculte__Group_5_3__1__Impl )
            // InternalLangFil.g:970:2: rule__Faculte__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Faculte__Group_5_3__1"


    // $ANTLR start "rule__Faculte__Group_5_3__1__Impl"
    // InternalLangFil.g:976:1: rule__Faculte__Group_5_3__1__Impl : ( ( rule__Faculte__IntervenantsAssignment_5_3_1 ) ) ;
    public final void rule__Faculte__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:980:1: ( ( ( rule__Faculte__IntervenantsAssignment_5_3_1 ) ) )
            // InternalLangFil.g:981:1: ( ( rule__Faculte__IntervenantsAssignment_5_3_1 ) )
            {
            // InternalLangFil.g:981:1: ( ( rule__Faculte__IntervenantsAssignment_5_3_1 ) )
            // InternalLangFil.g:982:2: ( rule__Faculte__IntervenantsAssignment_5_3_1 )
            {
             before(grammarAccess.getFaculteAccess().getIntervenantsAssignment_5_3_1()); 
            // InternalLangFil.g:983:2: ( rule__Faculte__IntervenantsAssignment_5_3_1 )
            // InternalLangFil.g:983:3: rule__Faculte__IntervenantsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Faculte__IntervenantsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFaculteAccess().getIntervenantsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__Group_5_3__1__Impl"


    // $ANTLR start "rule__Niveau__Group__0"
    // InternalLangFil.g:992:1: rule__Niveau__Group__0 : rule__Niveau__Group__0__Impl rule__Niveau__Group__1 ;
    public final void rule__Niveau__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:996:1: ( rule__Niveau__Group__0__Impl rule__Niveau__Group__1 )
            // InternalLangFil.g:997:2: rule__Niveau__Group__0__Impl rule__Niveau__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Niveau__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__1();

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
    // $ANTLR end "rule__Niveau__Group__0"


    // $ANTLR start "rule__Niveau__Group__0__Impl"
    // InternalLangFil.g:1004:1: rule__Niveau__Group__0__Impl : ( () ) ;
    public final void rule__Niveau__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1008:1: ( ( () ) )
            // InternalLangFil.g:1009:1: ( () )
            {
            // InternalLangFil.g:1009:1: ( () )
            // InternalLangFil.g:1010:2: ()
            {
             before(grammarAccess.getNiveauAccess().getNiveauAction_0()); 
            // InternalLangFil.g:1011:2: ()
            // InternalLangFil.g:1011:3: 
            {
            }

             after(grammarAccess.getNiveauAccess().getNiveauAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__0__Impl"


    // $ANTLR start "rule__Niveau__Group__1"
    // InternalLangFil.g:1019:1: rule__Niveau__Group__1 : rule__Niveau__Group__1__Impl rule__Niveau__Group__2 ;
    public final void rule__Niveau__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1023:1: ( rule__Niveau__Group__1__Impl rule__Niveau__Group__2 )
            // InternalLangFil.g:1024:2: rule__Niveau__Group__1__Impl rule__Niveau__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Niveau__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__2();

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
    // $ANTLR end "rule__Niveau__Group__1"


    // $ANTLR start "rule__Niveau__Group__1__Impl"
    // InternalLangFil.g:1031:1: rule__Niveau__Group__1__Impl : ( 'Niveau' ) ;
    public final void rule__Niveau__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1035:1: ( ( 'Niveau' ) )
            // InternalLangFil.g:1036:1: ( 'Niveau' )
            {
            // InternalLangFil.g:1036:1: ( 'Niveau' )
            // InternalLangFil.g:1037:2: 'Niveau'
            {
             before(grammarAccess.getNiveauAccess().getNiveauKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getNiveauKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__1__Impl"


    // $ANTLR start "rule__Niveau__Group__2"
    // InternalLangFil.g:1046:1: rule__Niveau__Group__2 : rule__Niveau__Group__2__Impl rule__Niveau__Group__3 ;
    public final void rule__Niveau__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1050:1: ( rule__Niveau__Group__2__Impl rule__Niveau__Group__3 )
            // InternalLangFil.g:1051:2: rule__Niveau__Group__2__Impl rule__Niveau__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Niveau__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__3();

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
    // $ANTLR end "rule__Niveau__Group__2"


    // $ANTLR start "rule__Niveau__Group__2__Impl"
    // InternalLangFil.g:1058:1: rule__Niveau__Group__2__Impl : ( ( rule__Niveau__NameAssignment_2 ) ) ;
    public final void rule__Niveau__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1062:1: ( ( ( rule__Niveau__NameAssignment_2 ) ) )
            // InternalLangFil.g:1063:1: ( ( rule__Niveau__NameAssignment_2 ) )
            {
            // InternalLangFil.g:1063:1: ( ( rule__Niveau__NameAssignment_2 ) )
            // InternalLangFil.g:1064:2: ( rule__Niveau__NameAssignment_2 )
            {
             before(grammarAccess.getNiveauAccess().getNameAssignment_2()); 
            // InternalLangFil.g:1065:2: ( rule__Niveau__NameAssignment_2 )
            // InternalLangFil.g:1065:3: rule__Niveau__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__2__Impl"


    // $ANTLR start "rule__Niveau__Group__3"
    // InternalLangFil.g:1073:1: rule__Niveau__Group__3 : rule__Niveau__Group__3__Impl rule__Niveau__Group__4 ;
    public final void rule__Niveau__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1077:1: ( rule__Niveau__Group__3__Impl rule__Niveau__Group__4 )
            // InternalLangFil.g:1078:2: rule__Niveau__Group__3__Impl rule__Niveau__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Niveau__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__4();

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
    // $ANTLR end "rule__Niveau__Group__3"


    // $ANTLR start "rule__Niveau__Group__3__Impl"
    // InternalLangFil.g:1085:1: rule__Niveau__Group__3__Impl : ( '{' ) ;
    public final void rule__Niveau__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1089:1: ( ( '{' ) )
            // InternalLangFil.g:1090:1: ( '{' )
            {
            // InternalLangFil.g:1090:1: ( '{' )
            // InternalLangFil.g:1091:2: '{'
            {
             before(grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__3__Impl"


    // $ANTLR start "rule__Niveau__Group__4"
    // InternalLangFil.g:1100:1: rule__Niveau__Group__4 : rule__Niveau__Group__4__Impl rule__Niveau__Group__5 ;
    public final void rule__Niveau__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1104:1: ( rule__Niveau__Group__4__Impl rule__Niveau__Group__5 )
            // InternalLangFil.g:1105:2: rule__Niveau__Group__4__Impl rule__Niveau__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Niveau__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__5();

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
    // $ANTLR end "rule__Niveau__Group__4"


    // $ANTLR start "rule__Niveau__Group__4__Impl"
    // InternalLangFil.g:1112:1: rule__Niveau__Group__4__Impl : ( ( rule__Niveau__Group_4__0 )? ) ;
    public final void rule__Niveau__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1116:1: ( ( ( rule__Niveau__Group_4__0 )? ) )
            // InternalLangFil.g:1117:1: ( ( rule__Niveau__Group_4__0 )? )
            {
            // InternalLangFil.g:1117:1: ( ( rule__Niveau__Group_4__0 )? )
            // InternalLangFil.g:1118:2: ( rule__Niveau__Group_4__0 )?
            {
             before(grammarAccess.getNiveauAccess().getGroup_4()); 
            // InternalLangFil.g:1119:2: ( rule__Niveau__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLangFil.g:1119:3: rule__Niveau__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Niveau__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNiveauAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__4__Impl"


    // $ANTLR start "rule__Niveau__Group__5"
    // InternalLangFil.g:1127:1: rule__Niveau__Group__5 : rule__Niveau__Group__5__Impl rule__Niveau__Group__6 ;
    public final void rule__Niveau__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1131:1: ( rule__Niveau__Group__5__Impl rule__Niveau__Group__6 )
            // InternalLangFil.g:1132:2: rule__Niveau__Group__5__Impl rule__Niveau__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Niveau__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__6();

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
    // $ANTLR end "rule__Niveau__Group__5"


    // $ANTLR start "rule__Niveau__Group__5__Impl"
    // InternalLangFil.g:1139:1: rule__Niveau__Group__5__Impl : ( ( rule__Niveau__Group_5__0 )? ) ;
    public final void rule__Niveau__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1143:1: ( ( ( rule__Niveau__Group_5__0 )? ) )
            // InternalLangFil.g:1144:1: ( ( rule__Niveau__Group_5__0 )? )
            {
            // InternalLangFil.g:1144:1: ( ( rule__Niveau__Group_5__0 )? )
            // InternalLangFil.g:1145:2: ( rule__Niveau__Group_5__0 )?
            {
             before(grammarAccess.getNiveauAccess().getGroup_5()); 
            // InternalLangFil.g:1146:2: ( rule__Niveau__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLangFil.g:1146:3: rule__Niveau__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Niveau__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNiveauAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__5__Impl"


    // $ANTLR start "rule__Niveau__Group__6"
    // InternalLangFil.g:1154:1: rule__Niveau__Group__6 : rule__Niveau__Group__6__Impl rule__Niveau__Group__7 ;
    public final void rule__Niveau__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1158:1: ( rule__Niveau__Group__6__Impl rule__Niveau__Group__7 )
            // InternalLangFil.g:1159:2: rule__Niveau__Group__6__Impl rule__Niveau__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Niveau__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__7();

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
    // $ANTLR end "rule__Niveau__Group__6"


    // $ANTLR start "rule__Niveau__Group__6__Impl"
    // InternalLangFil.g:1166:1: rule__Niveau__Group__6__Impl : ( ( rule__Niveau__Group_6__0 )? ) ;
    public final void rule__Niveau__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1170:1: ( ( ( rule__Niveau__Group_6__0 )? ) )
            // InternalLangFil.g:1171:1: ( ( rule__Niveau__Group_6__0 )? )
            {
            // InternalLangFil.g:1171:1: ( ( rule__Niveau__Group_6__0 )? )
            // InternalLangFil.g:1172:2: ( rule__Niveau__Group_6__0 )?
            {
             before(grammarAccess.getNiveauAccess().getGroup_6()); 
            // InternalLangFil.g:1173:2: ( rule__Niveau__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLangFil.g:1173:3: rule__Niveau__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Niveau__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNiveauAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__6__Impl"


    // $ANTLR start "rule__Niveau__Group__7"
    // InternalLangFil.g:1181:1: rule__Niveau__Group__7 : rule__Niveau__Group__7__Impl rule__Niveau__Group__8 ;
    public final void rule__Niveau__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1185:1: ( rule__Niveau__Group__7__Impl rule__Niveau__Group__8 )
            // InternalLangFil.g:1186:2: rule__Niveau__Group__7__Impl rule__Niveau__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Niveau__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__8();

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
    // $ANTLR end "rule__Niveau__Group__7"


    // $ANTLR start "rule__Niveau__Group__7__Impl"
    // InternalLangFil.g:1193:1: rule__Niveau__Group__7__Impl : ( ( rule__Niveau__Group_7__0 )? ) ;
    public final void rule__Niveau__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1197:1: ( ( ( rule__Niveau__Group_7__0 )? ) )
            // InternalLangFil.g:1198:1: ( ( rule__Niveau__Group_7__0 )? )
            {
            // InternalLangFil.g:1198:1: ( ( rule__Niveau__Group_7__0 )? )
            // InternalLangFil.g:1199:2: ( rule__Niveau__Group_7__0 )?
            {
             before(grammarAccess.getNiveauAccess().getGroup_7()); 
            // InternalLangFil.g:1200:2: ( rule__Niveau__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLangFil.g:1200:3: rule__Niveau__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Niveau__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNiveauAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__7__Impl"


    // $ANTLR start "rule__Niveau__Group__8"
    // InternalLangFil.g:1208:1: rule__Niveau__Group__8 : rule__Niveau__Group__8__Impl rule__Niveau__Group__9 ;
    public final void rule__Niveau__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1212:1: ( rule__Niveau__Group__8__Impl rule__Niveau__Group__9 )
            // InternalLangFil.g:1213:2: rule__Niveau__Group__8__Impl rule__Niveau__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Niveau__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group__9();

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
    // $ANTLR end "rule__Niveau__Group__8"


    // $ANTLR start "rule__Niveau__Group__8__Impl"
    // InternalLangFil.g:1220:1: rule__Niveau__Group__8__Impl : ( ( rule__Niveau__Group_8__0 )? ) ;
    public final void rule__Niveau__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1224:1: ( ( ( rule__Niveau__Group_8__0 )? ) )
            // InternalLangFil.g:1225:1: ( ( rule__Niveau__Group_8__0 )? )
            {
            // InternalLangFil.g:1225:1: ( ( rule__Niveau__Group_8__0 )? )
            // InternalLangFil.g:1226:2: ( rule__Niveau__Group_8__0 )?
            {
             before(grammarAccess.getNiveauAccess().getGroup_8()); 
            // InternalLangFil.g:1227:2: ( rule__Niveau__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLangFil.g:1227:3: rule__Niveau__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Niveau__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNiveauAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__8__Impl"


    // $ANTLR start "rule__Niveau__Group__9"
    // InternalLangFil.g:1235:1: rule__Niveau__Group__9 : rule__Niveau__Group__9__Impl ;
    public final void rule__Niveau__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1239:1: ( rule__Niveau__Group__9__Impl )
            // InternalLangFil.g:1240:2: rule__Niveau__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group__9__Impl();

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
    // $ANTLR end "rule__Niveau__Group__9"


    // $ANTLR start "rule__Niveau__Group__9__Impl"
    // InternalLangFil.g:1246:1: rule__Niveau__Group__9__Impl : ( '}' ) ;
    public final void rule__Niveau__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1250:1: ( ( '}' ) )
            // InternalLangFil.g:1251:1: ( '}' )
            {
            // InternalLangFil.g:1251:1: ( '}' )
            // InternalLangFil.g:1252:2: '}'
            {
             before(grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group__9__Impl"


    // $ANTLR start "rule__Niveau__Group_4__0"
    // InternalLangFil.g:1262:1: rule__Niveau__Group_4__0 : rule__Niveau__Group_4__0__Impl rule__Niveau__Group_4__1 ;
    public final void rule__Niveau__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1266:1: ( rule__Niveau__Group_4__0__Impl rule__Niveau__Group_4__1 )
            // InternalLangFil.g:1267:2: rule__Niveau__Group_4__0__Impl rule__Niveau__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Niveau__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_4__1();

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
    // $ANTLR end "rule__Niveau__Group_4__0"


    // $ANTLR start "rule__Niveau__Group_4__0__Impl"
    // InternalLangFil.g:1274:1: rule__Niveau__Group_4__0__Impl : ( 'pseudo' ) ;
    public final void rule__Niveau__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1278:1: ( ( 'pseudo' ) )
            // InternalLangFil.g:1279:1: ( 'pseudo' )
            {
            // InternalLangFil.g:1279:1: ( 'pseudo' )
            // InternalLangFil.g:1280:2: 'pseudo'
            {
             before(grammarAccess.getNiveauAccess().getPseudoKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getPseudoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_4__0__Impl"


    // $ANTLR start "rule__Niveau__Group_4__1"
    // InternalLangFil.g:1289:1: rule__Niveau__Group_4__1 : rule__Niveau__Group_4__1__Impl ;
    public final void rule__Niveau__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1293:1: ( rule__Niveau__Group_4__1__Impl )
            // InternalLangFil.g:1294:2: rule__Niveau__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group_4__1__Impl();

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
    // $ANTLR end "rule__Niveau__Group_4__1"


    // $ANTLR start "rule__Niveau__Group_4__1__Impl"
    // InternalLangFil.g:1300:1: rule__Niveau__Group_4__1__Impl : ( ( rule__Niveau__PseudoAssignment_4_1 ) ) ;
    public final void rule__Niveau__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1304:1: ( ( ( rule__Niveau__PseudoAssignment_4_1 ) ) )
            // InternalLangFil.g:1305:1: ( ( rule__Niveau__PseudoAssignment_4_1 ) )
            {
            // InternalLangFil.g:1305:1: ( ( rule__Niveau__PseudoAssignment_4_1 ) )
            // InternalLangFil.g:1306:2: ( rule__Niveau__PseudoAssignment_4_1 )
            {
             before(grammarAccess.getNiveauAccess().getPseudoAssignment_4_1()); 
            // InternalLangFil.g:1307:2: ( rule__Niveau__PseudoAssignment_4_1 )
            // InternalLangFil.g:1307:3: rule__Niveau__PseudoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__PseudoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getPseudoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_4__1__Impl"


    // $ANTLR start "rule__Niveau__Group_5__0"
    // InternalLangFil.g:1316:1: rule__Niveau__Group_5__0 : rule__Niveau__Group_5__0__Impl rule__Niveau__Group_5__1 ;
    public final void rule__Niveau__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1320:1: ( rule__Niveau__Group_5__0__Impl rule__Niveau__Group_5__1 )
            // InternalLangFil.g:1321:2: rule__Niveau__Group_5__0__Impl rule__Niveau__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Niveau__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_5__1();

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
    // $ANTLR end "rule__Niveau__Group_5__0"


    // $ANTLR start "rule__Niveau__Group_5__0__Impl"
    // InternalLangFil.g:1328:1: rule__Niveau__Group_5__0__Impl : ( 'responsables' ) ;
    public final void rule__Niveau__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1332:1: ( ( 'responsables' ) )
            // InternalLangFil.g:1333:1: ( 'responsables' )
            {
            // InternalLangFil.g:1333:1: ( 'responsables' )
            // InternalLangFil.g:1334:2: 'responsables'
            {
             before(grammarAccess.getNiveauAccess().getResponsablesKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getResponsablesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_5__0__Impl"


    // $ANTLR start "rule__Niveau__Group_5__1"
    // InternalLangFil.g:1343:1: rule__Niveau__Group_5__1 : rule__Niveau__Group_5__1__Impl rule__Niveau__Group_5__2 ;
    public final void rule__Niveau__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1347:1: ( rule__Niveau__Group_5__1__Impl rule__Niveau__Group_5__2 )
            // InternalLangFil.g:1348:2: rule__Niveau__Group_5__1__Impl rule__Niveau__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Niveau__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_5__2();

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
    // $ANTLR end "rule__Niveau__Group_5__1"


    // $ANTLR start "rule__Niveau__Group_5__1__Impl"
    // InternalLangFil.g:1355:1: rule__Niveau__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Niveau__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1359:1: ( ( '(' ) )
            // InternalLangFil.g:1360:1: ( '(' )
            {
            // InternalLangFil.g:1360:1: ( '(' )
            // InternalLangFil.g:1361:2: '('
            {
             before(grammarAccess.getNiveauAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_5__1__Impl"


    // $ANTLR start "rule__Niveau__Group_5__2"
    // InternalLangFil.g:1370:1: rule__Niveau__Group_5__2 : rule__Niveau__Group_5__2__Impl rule__Niveau__Group_5__3 ;
    public final void rule__Niveau__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1374:1: ( rule__Niveau__Group_5__2__Impl rule__Niveau__Group_5__3 )
            // InternalLangFil.g:1375:2: rule__Niveau__Group_5__2__Impl rule__Niveau__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__Niveau__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_5__3();

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
    // $ANTLR end "rule__Niveau__Group_5__2"


    // $ANTLR start "rule__Niveau__Group_5__2__Impl"
    // InternalLangFil.g:1382:1: rule__Niveau__Group_5__2__Impl : ( ( rule__Niveau__ResponsablesAssignment_5_2 ) ) ;
    public final void rule__Niveau__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1386:1: ( ( ( rule__Niveau__ResponsablesAssignment_5_2 ) ) )
            // InternalLangFil.g:1387:1: ( ( rule__Niveau__ResponsablesAssignment_5_2 ) )
            {
            // InternalLangFil.g:1387:1: ( ( rule__Niveau__ResponsablesAssignment_5_2 ) )
            // InternalLangFil.g:1388:2: ( rule__Niveau__ResponsablesAssignment_5_2 )
            {
             before(grammarAccess.getNiveauAccess().getResponsablesAssignment_5_2()); 
            // InternalLangFil.g:1389:2: ( rule__Niveau__ResponsablesAssignment_5_2 )
            // InternalLangFil.g:1389:3: rule__Niveau__ResponsablesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__ResponsablesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getResponsablesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_5__2__Impl"


    // $ANTLR start "rule__Niveau__Group_5__3"
    // InternalLangFil.g:1397:1: rule__Niveau__Group_5__3 : rule__Niveau__Group_5__3__Impl rule__Niveau__Group_5__4 ;
    public final void rule__Niveau__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1401:1: ( rule__Niveau__Group_5__3__Impl rule__Niveau__Group_5__4 )
            // InternalLangFil.g:1402:2: rule__Niveau__Group_5__3__Impl rule__Niveau__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__Niveau__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_5__4();

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
    // $ANTLR end "rule__Niveau__Group_5__3"


    // $ANTLR start "rule__Niveau__Group_5__3__Impl"
    // InternalLangFil.g:1409:1: rule__Niveau__Group_5__3__Impl : ( ( rule__Niveau__Group_5_3__0 )* ) ;
    public final void rule__Niveau__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1413:1: ( ( ( rule__Niveau__Group_5_3__0 )* ) )
            // InternalLangFil.g:1414:1: ( ( rule__Niveau__Group_5_3__0 )* )
            {
            // InternalLangFil.g:1414:1: ( ( rule__Niveau__Group_5_3__0 )* )
            // InternalLangFil.g:1415:2: ( rule__Niveau__Group_5_3__0 )*
            {
             before(grammarAccess.getNiveauAccess().getGroup_5_3()); 
            // InternalLangFil.g:1416:2: ( rule__Niveau__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLangFil.g:1416:3: rule__Niveau__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Niveau__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNiveauAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_5__3__Impl"


    // $ANTLR start "rule__Niveau__Group_5__4"
    // InternalLangFil.g:1424:1: rule__Niveau__Group_5__4 : rule__Niveau__Group_5__4__Impl ;
    public final void rule__Niveau__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1428:1: ( rule__Niveau__Group_5__4__Impl )
            // InternalLangFil.g:1429:2: rule__Niveau__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group_5__4__Impl();

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
    // $ANTLR end "rule__Niveau__Group_5__4"


    // $ANTLR start "rule__Niveau__Group_5__4__Impl"
    // InternalLangFil.g:1435:1: rule__Niveau__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Niveau__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1439:1: ( ( ')' ) )
            // InternalLangFil.g:1440:1: ( ')' )
            {
            // InternalLangFil.g:1440:1: ( ')' )
            // InternalLangFil.g:1441:2: ')'
            {
             before(grammarAccess.getNiveauAccess().getRightParenthesisKeyword_5_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_5__4__Impl"


    // $ANTLR start "rule__Niveau__Group_5_3__0"
    // InternalLangFil.g:1451:1: rule__Niveau__Group_5_3__0 : rule__Niveau__Group_5_3__0__Impl rule__Niveau__Group_5_3__1 ;
    public final void rule__Niveau__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1455:1: ( rule__Niveau__Group_5_3__0__Impl rule__Niveau__Group_5_3__1 )
            // InternalLangFil.g:1456:2: rule__Niveau__Group_5_3__0__Impl rule__Niveau__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Niveau__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_5_3__1();

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
    // $ANTLR end "rule__Niveau__Group_5_3__0"


    // $ANTLR start "rule__Niveau__Group_5_3__0__Impl"
    // InternalLangFil.g:1463:1: rule__Niveau__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Niveau__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1467:1: ( ( ',' ) )
            // InternalLangFil.g:1468:1: ( ',' )
            {
            // InternalLangFil.g:1468:1: ( ',' )
            // InternalLangFil.g:1469:2: ','
            {
             before(grammarAccess.getNiveauAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_5_3__0__Impl"


    // $ANTLR start "rule__Niveau__Group_5_3__1"
    // InternalLangFil.g:1478:1: rule__Niveau__Group_5_3__1 : rule__Niveau__Group_5_3__1__Impl ;
    public final void rule__Niveau__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1482:1: ( rule__Niveau__Group_5_3__1__Impl )
            // InternalLangFil.g:1483:2: rule__Niveau__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Niveau__Group_5_3__1"


    // $ANTLR start "rule__Niveau__Group_5_3__1__Impl"
    // InternalLangFil.g:1489:1: rule__Niveau__Group_5_3__1__Impl : ( ( rule__Niveau__ResponsablesAssignment_5_3_1 ) ) ;
    public final void rule__Niveau__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1493:1: ( ( ( rule__Niveau__ResponsablesAssignment_5_3_1 ) ) )
            // InternalLangFil.g:1494:1: ( ( rule__Niveau__ResponsablesAssignment_5_3_1 ) )
            {
            // InternalLangFil.g:1494:1: ( ( rule__Niveau__ResponsablesAssignment_5_3_1 ) )
            // InternalLangFil.g:1495:2: ( rule__Niveau__ResponsablesAssignment_5_3_1 )
            {
             before(grammarAccess.getNiveauAccess().getResponsablesAssignment_5_3_1()); 
            // InternalLangFil.g:1496:2: ( rule__Niveau__ResponsablesAssignment_5_3_1 )
            // InternalLangFil.g:1496:3: rule__Niveau__ResponsablesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__ResponsablesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getResponsablesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_5_3__1__Impl"


    // $ANTLR start "rule__Niveau__Group_6__0"
    // InternalLangFil.g:1505:1: rule__Niveau__Group_6__0 : rule__Niveau__Group_6__0__Impl rule__Niveau__Group_6__1 ;
    public final void rule__Niveau__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1509:1: ( rule__Niveau__Group_6__0__Impl rule__Niveau__Group_6__1 )
            // InternalLangFil.g:1510:2: rule__Niveau__Group_6__0__Impl rule__Niveau__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Niveau__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_6__1();

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
    // $ANTLR end "rule__Niveau__Group_6__0"


    // $ANTLR start "rule__Niveau__Group_6__0__Impl"
    // InternalLangFil.g:1517:1: rule__Niveau__Group_6__0__Impl : ( 'formations' ) ;
    public final void rule__Niveau__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1521:1: ( ( 'formations' ) )
            // InternalLangFil.g:1522:1: ( 'formations' )
            {
            // InternalLangFil.g:1522:1: ( 'formations' )
            // InternalLangFil.g:1523:2: 'formations'
            {
             before(grammarAccess.getNiveauAccess().getFormationsKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getFormationsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_6__0__Impl"


    // $ANTLR start "rule__Niveau__Group_6__1"
    // InternalLangFil.g:1532:1: rule__Niveau__Group_6__1 : rule__Niveau__Group_6__1__Impl rule__Niveau__Group_6__2 ;
    public final void rule__Niveau__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1536:1: ( rule__Niveau__Group_6__1__Impl rule__Niveau__Group_6__2 )
            // InternalLangFil.g:1537:2: rule__Niveau__Group_6__1__Impl rule__Niveau__Group_6__2
            {
            pushFollow(FOLLOW_14);
            rule__Niveau__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_6__2();

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
    // $ANTLR end "rule__Niveau__Group_6__1"


    // $ANTLR start "rule__Niveau__Group_6__1__Impl"
    // InternalLangFil.g:1544:1: rule__Niveau__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Niveau__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1548:1: ( ( '{' ) )
            // InternalLangFil.g:1549:1: ( '{' )
            {
            // InternalLangFil.g:1549:1: ( '{' )
            // InternalLangFil.g:1550:2: '{'
            {
             before(grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_6__1__Impl"


    // $ANTLR start "rule__Niveau__Group_6__2"
    // InternalLangFil.g:1559:1: rule__Niveau__Group_6__2 : rule__Niveau__Group_6__2__Impl rule__Niveau__Group_6__3 ;
    public final void rule__Niveau__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1563:1: ( rule__Niveau__Group_6__2__Impl rule__Niveau__Group_6__3 )
            // InternalLangFil.g:1564:2: rule__Niveau__Group_6__2__Impl rule__Niveau__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Niveau__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_6__3();

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
    // $ANTLR end "rule__Niveau__Group_6__2"


    // $ANTLR start "rule__Niveau__Group_6__2__Impl"
    // InternalLangFil.g:1571:1: rule__Niveau__Group_6__2__Impl : ( ( rule__Niveau__FormationsAssignment_6_2 ) ) ;
    public final void rule__Niveau__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1575:1: ( ( ( rule__Niveau__FormationsAssignment_6_2 ) ) )
            // InternalLangFil.g:1576:1: ( ( rule__Niveau__FormationsAssignment_6_2 ) )
            {
            // InternalLangFil.g:1576:1: ( ( rule__Niveau__FormationsAssignment_6_2 ) )
            // InternalLangFil.g:1577:2: ( rule__Niveau__FormationsAssignment_6_2 )
            {
             before(grammarAccess.getNiveauAccess().getFormationsAssignment_6_2()); 
            // InternalLangFil.g:1578:2: ( rule__Niveau__FormationsAssignment_6_2 )
            // InternalLangFil.g:1578:3: rule__Niveau__FormationsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__FormationsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getFormationsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_6__2__Impl"


    // $ANTLR start "rule__Niveau__Group_6__3"
    // InternalLangFil.g:1586:1: rule__Niveau__Group_6__3 : rule__Niveau__Group_6__3__Impl rule__Niveau__Group_6__4 ;
    public final void rule__Niveau__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1590:1: ( rule__Niveau__Group_6__3__Impl rule__Niveau__Group_6__4 )
            // InternalLangFil.g:1591:2: rule__Niveau__Group_6__3__Impl rule__Niveau__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Niveau__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_6__4();

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
    // $ANTLR end "rule__Niveau__Group_6__3"


    // $ANTLR start "rule__Niveau__Group_6__3__Impl"
    // InternalLangFil.g:1598:1: rule__Niveau__Group_6__3__Impl : ( ( rule__Niveau__Group_6_3__0 )* ) ;
    public final void rule__Niveau__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1602:1: ( ( ( rule__Niveau__Group_6_3__0 )* ) )
            // InternalLangFil.g:1603:1: ( ( rule__Niveau__Group_6_3__0 )* )
            {
            // InternalLangFil.g:1603:1: ( ( rule__Niveau__Group_6_3__0 )* )
            // InternalLangFil.g:1604:2: ( rule__Niveau__Group_6_3__0 )*
            {
             before(grammarAccess.getNiveauAccess().getGroup_6_3()); 
            // InternalLangFil.g:1605:2: ( rule__Niveau__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLangFil.g:1605:3: rule__Niveau__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Niveau__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getNiveauAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_6__3__Impl"


    // $ANTLR start "rule__Niveau__Group_6__4"
    // InternalLangFil.g:1613:1: rule__Niveau__Group_6__4 : rule__Niveau__Group_6__4__Impl ;
    public final void rule__Niveau__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1617:1: ( rule__Niveau__Group_6__4__Impl )
            // InternalLangFil.g:1618:2: rule__Niveau__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group_6__4__Impl();

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
    // $ANTLR end "rule__Niveau__Group_6__4"


    // $ANTLR start "rule__Niveau__Group_6__4__Impl"
    // InternalLangFil.g:1624:1: rule__Niveau__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Niveau__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1628:1: ( ( '}' ) )
            // InternalLangFil.g:1629:1: ( '}' )
            {
            // InternalLangFil.g:1629:1: ( '}' )
            // InternalLangFil.g:1630:2: '}'
            {
             before(grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_6__4__Impl"


    // $ANTLR start "rule__Niveau__Group_6_3__0"
    // InternalLangFil.g:1640:1: rule__Niveau__Group_6_3__0 : rule__Niveau__Group_6_3__0__Impl rule__Niveau__Group_6_3__1 ;
    public final void rule__Niveau__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1644:1: ( rule__Niveau__Group_6_3__0__Impl rule__Niveau__Group_6_3__1 )
            // InternalLangFil.g:1645:2: rule__Niveau__Group_6_3__0__Impl rule__Niveau__Group_6_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Niveau__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_6_3__1();

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
    // $ANTLR end "rule__Niveau__Group_6_3__0"


    // $ANTLR start "rule__Niveau__Group_6_3__0__Impl"
    // InternalLangFil.g:1652:1: rule__Niveau__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Niveau__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1656:1: ( ( ',' ) )
            // InternalLangFil.g:1657:1: ( ',' )
            {
            // InternalLangFil.g:1657:1: ( ',' )
            // InternalLangFil.g:1658:2: ','
            {
             before(grammarAccess.getNiveauAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_6_3__0__Impl"


    // $ANTLR start "rule__Niveau__Group_6_3__1"
    // InternalLangFil.g:1667:1: rule__Niveau__Group_6_3__1 : rule__Niveau__Group_6_3__1__Impl ;
    public final void rule__Niveau__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1671:1: ( rule__Niveau__Group_6_3__1__Impl )
            // InternalLangFil.g:1672:2: rule__Niveau__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Niveau__Group_6_3__1"


    // $ANTLR start "rule__Niveau__Group_6_3__1__Impl"
    // InternalLangFil.g:1678:1: rule__Niveau__Group_6_3__1__Impl : ( ( rule__Niveau__FormationsAssignment_6_3_1 ) ) ;
    public final void rule__Niveau__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1682:1: ( ( ( rule__Niveau__FormationsAssignment_6_3_1 ) ) )
            // InternalLangFil.g:1683:1: ( ( rule__Niveau__FormationsAssignment_6_3_1 ) )
            {
            // InternalLangFil.g:1683:1: ( ( rule__Niveau__FormationsAssignment_6_3_1 ) )
            // InternalLangFil.g:1684:2: ( rule__Niveau__FormationsAssignment_6_3_1 )
            {
             before(grammarAccess.getNiveauAccess().getFormationsAssignment_6_3_1()); 
            // InternalLangFil.g:1685:2: ( rule__Niveau__FormationsAssignment_6_3_1 )
            // InternalLangFil.g:1685:3: rule__Niveau__FormationsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__FormationsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getFormationsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_6_3__1__Impl"


    // $ANTLR start "rule__Niveau__Group_7__0"
    // InternalLangFil.g:1694:1: rule__Niveau__Group_7__0 : rule__Niveau__Group_7__0__Impl rule__Niveau__Group_7__1 ;
    public final void rule__Niveau__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1698:1: ( rule__Niveau__Group_7__0__Impl rule__Niveau__Group_7__1 )
            // InternalLangFil.g:1699:2: rule__Niveau__Group_7__0__Impl rule__Niveau__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Niveau__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_7__1();

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
    // $ANTLR end "rule__Niveau__Group_7__0"


    // $ANTLR start "rule__Niveau__Group_7__0__Impl"
    // InternalLangFil.g:1706:1: rule__Niveau__Group_7__0__Impl : ( 'presentation' ) ;
    public final void rule__Niveau__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1710:1: ( ( 'presentation' ) )
            // InternalLangFil.g:1711:1: ( 'presentation' )
            {
            // InternalLangFil.g:1711:1: ( 'presentation' )
            // InternalLangFil.g:1712:2: 'presentation'
            {
             before(grammarAccess.getNiveauAccess().getPresentationKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getPresentationKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_7__0__Impl"


    // $ANTLR start "rule__Niveau__Group_7__1"
    // InternalLangFil.g:1721:1: rule__Niveau__Group_7__1 : rule__Niveau__Group_7__1__Impl ;
    public final void rule__Niveau__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1725:1: ( rule__Niveau__Group_7__1__Impl )
            // InternalLangFil.g:1726:2: rule__Niveau__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group_7__1__Impl();

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
    // $ANTLR end "rule__Niveau__Group_7__1"


    // $ANTLR start "rule__Niveau__Group_7__1__Impl"
    // InternalLangFil.g:1732:1: rule__Niveau__Group_7__1__Impl : ( ( rule__Niveau__PresentationAssignment_7_1 ) ) ;
    public final void rule__Niveau__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1736:1: ( ( ( rule__Niveau__PresentationAssignment_7_1 ) ) )
            // InternalLangFil.g:1737:1: ( ( rule__Niveau__PresentationAssignment_7_1 ) )
            {
            // InternalLangFil.g:1737:1: ( ( rule__Niveau__PresentationAssignment_7_1 ) )
            // InternalLangFil.g:1738:2: ( rule__Niveau__PresentationAssignment_7_1 )
            {
             before(grammarAccess.getNiveauAccess().getPresentationAssignment_7_1()); 
            // InternalLangFil.g:1739:2: ( rule__Niveau__PresentationAssignment_7_1 )
            // InternalLangFil.g:1739:3: rule__Niveau__PresentationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__PresentationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getPresentationAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_7__1__Impl"


    // $ANTLR start "rule__Niveau__Group_8__0"
    // InternalLangFil.g:1748:1: rule__Niveau__Group_8__0 : rule__Niveau__Group_8__0__Impl rule__Niveau__Group_8__1 ;
    public final void rule__Niveau__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1752:1: ( rule__Niveau__Group_8__0__Impl rule__Niveau__Group_8__1 )
            // InternalLangFil.g:1753:2: rule__Niveau__Group_8__0__Impl rule__Niveau__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Niveau__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_8__1();

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
    // $ANTLR end "rule__Niveau__Group_8__0"


    // $ANTLR start "rule__Niveau__Group_8__0__Impl"
    // InternalLangFil.g:1760:1: rule__Niveau__Group_8__0__Impl : ( 'ues' ) ;
    public final void rule__Niveau__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1764:1: ( ( 'ues' ) )
            // InternalLangFil.g:1765:1: ( 'ues' )
            {
            // InternalLangFil.g:1765:1: ( 'ues' )
            // InternalLangFil.g:1766:2: 'ues'
            {
             before(grammarAccess.getNiveauAccess().getUesKeyword_8_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getUesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_8__0__Impl"


    // $ANTLR start "rule__Niveau__Group_8__1"
    // InternalLangFil.g:1775:1: rule__Niveau__Group_8__1 : rule__Niveau__Group_8__1__Impl rule__Niveau__Group_8__2 ;
    public final void rule__Niveau__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1779:1: ( rule__Niveau__Group_8__1__Impl rule__Niveau__Group_8__2 )
            // InternalLangFil.g:1780:2: rule__Niveau__Group_8__1__Impl rule__Niveau__Group_8__2
            {
            pushFollow(FOLLOW_16);
            rule__Niveau__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_8__2();

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
    // $ANTLR end "rule__Niveau__Group_8__1"


    // $ANTLR start "rule__Niveau__Group_8__1__Impl"
    // InternalLangFil.g:1787:1: rule__Niveau__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Niveau__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1791:1: ( ( '{' ) )
            // InternalLangFil.g:1792:1: ( '{' )
            {
            // InternalLangFil.g:1792:1: ( '{' )
            // InternalLangFil.g:1793:2: '{'
            {
             before(grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_8__1__Impl"


    // $ANTLR start "rule__Niveau__Group_8__2"
    // InternalLangFil.g:1802:1: rule__Niveau__Group_8__2 : rule__Niveau__Group_8__2__Impl rule__Niveau__Group_8__3 ;
    public final void rule__Niveau__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1806:1: ( rule__Niveau__Group_8__2__Impl rule__Niveau__Group_8__3 )
            // InternalLangFil.g:1807:2: rule__Niveau__Group_8__2__Impl rule__Niveau__Group_8__3
            {
            pushFollow(FOLLOW_8);
            rule__Niveau__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_8__3();

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
    // $ANTLR end "rule__Niveau__Group_8__2"


    // $ANTLR start "rule__Niveau__Group_8__2__Impl"
    // InternalLangFil.g:1814:1: rule__Niveau__Group_8__2__Impl : ( ( rule__Niveau__UesAssignment_8_2 ) ) ;
    public final void rule__Niveau__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1818:1: ( ( ( rule__Niveau__UesAssignment_8_2 ) ) )
            // InternalLangFil.g:1819:1: ( ( rule__Niveau__UesAssignment_8_2 ) )
            {
            // InternalLangFil.g:1819:1: ( ( rule__Niveau__UesAssignment_8_2 ) )
            // InternalLangFil.g:1820:2: ( rule__Niveau__UesAssignment_8_2 )
            {
             before(grammarAccess.getNiveauAccess().getUesAssignment_8_2()); 
            // InternalLangFil.g:1821:2: ( rule__Niveau__UesAssignment_8_2 )
            // InternalLangFil.g:1821:3: rule__Niveau__UesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__UesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getUesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_8__2__Impl"


    // $ANTLR start "rule__Niveau__Group_8__3"
    // InternalLangFil.g:1829:1: rule__Niveau__Group_8__3 : rule__Niveau__Group_8__3__Impl rule__Niveau__Group_8__4 ;
    public final void rule__Niveau__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1833:1: ( rule__Niveau__Group_8__3__Impl rule__Niveau__Group_8__4 )
            // InternalLangFil.g:1834:2: rule__Niveau__Group_8__3__Impl rule__Niveau__Group_8__4
            {
            pushFollow(FOLLOW_8);
            rule__Niveau__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_8__4();

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
    // $ANTLR end "rule__Niveau__Group_8__3"


    // $ANTLR start "rule__Niveau__Group_8__3__Impl"
    // InternalLangFil.g:1841:1: rule__Niveau__Group_8__3__Impl : ( ( rule__Niveau__Group_8_3__0 )* ) ;
    public final void rule__Niveau__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1845:1: ( ( ( rule__Niveau__Group_8_3__0 )* ) )
            // InternalLangFil.g:1846:1: ( ( rule__Niveau__Group_8_3__0 )* )
            {
            // InternalLangFil.g:1846:1: ( ( rule__Niveau__Group_8_3__0 )* )
            // InternalLangFil.g:1847:2: ( rule__Niveau__Group_8_3__0 )*
            {
             before(grammarAccess.getNiveauAccess().getGroup_8_3()); 
            // InternalLangFil.g:1848:2: ( rule__Niveau__Group_8_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLangFil.g:1848:3: rule__Niveau__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Niveau__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getNiveauAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_8__3__Impl"


    // $ANTLR start "rule__Niveau__Group_8__4"
    // InternalLangFil.g:1856:1: rule__Niveau__Group_8__4 : rule__Niveau__Group_8__4__Impl ;
    public final void rule__Niveau__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1860:1: ( rule__Niveau__Group_8__4__Impl )
            // InternalLangFil.g:1861:2: rule__Niveau__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group_8__4__Impl();

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
    // $ANTLR end "rule__Niveau__Group_8__4"


    // $ANTLR start "rule__Niveau__Group_8__4__Impl"
    // InternalLangFil.g:1867:1: rule__Niveau__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Niveau__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1871:1: ( ( '}' ) )
            // InternalLangFil.g:1872:1: ( '}' )
            {
            // InternalLangFil.g:1872:1: ( '}' )
            // InternalLangFil.g:1873:2: '}'
            {
             before(grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_8__4__Impl"


    // $ANTLR start "rule__Niveau__Group_8_3__0"
    // InternalLangFil.g:1883:1: rule__Niveau__Group_8_3__0 : rule__Niveau__Group_8_3__0__Impl rule__Niveau__Group_8_3__1 ;
    public final void rule__Niveau__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1887:1: ( rule__Niveau__Group_8_3__0__Impl rule__Niveau__Group_8_3__1 )
            // InternalLangFil.g:1888:2: rule__Niveau__Group_8_3__0__Impl rule__Niveau__Group_8_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Niveau__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Niveau__Group_8_3__1();

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
    // $ANTLR end "rule__Niveau__Group_8_3__0"


    // $ANTLR start "rule__Niveau__Group_8_3__0__Impl"
    // InternalLangFil.g:1895:1: rule__Niveau__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Niveau__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1899:1: ( ( ',' ) )
            // InternalLangFil.g:1900:1: ( ',' )
            {
            // InternalLangFil.g:1900:1: ( ',' )
            // InternalLangFil.g:1901:2: ','
            {
             before(grammarAccess.getNiveauAccess().getCommaKeyword_8_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNiveauAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_8_3__0__Impl"


    // $ANTLR start "rule__Niveau__Group_8_3__1"
    // InternalLangFil.g:1910:1: rule__Niveau__Group_8_3__1 : rule__Niveau__Group_8_3__1__Impl ;
    public final void rule__Niveau__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1914:1: ( rule__Niveau__Group_8_3__1__Impl )
            // InternalLangFil.g:1915:2: rule__Niveau__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__Niveau__Group_8_3__1"


    // $ANTLR start "rule__Niveau__Group_8_3__1__Impl"
    // InternalLangFil.g:1921:1: rule__Niveau__Group_8_3__1__Impl : ( ( rule__Niveau__UesAssignment_8_3_1 ) ) ;
    public final void rule__Niveau__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1925:1: ( ( ( rule__Niveau__UesAssignment_8_3_1 ) ) )
            // InternalLangFil.g:1926:1: ( ( rule__Niveau__UesAssignment_8_3_1 ) )
            {
            // InternalLangFil.g:1926:1: ( ( rule__Niveau__UesAssignment_8_3_1 ) )
            // InternalLangFil.g:1927:2: ( rule__Niveau__UesAssignment_8_3_1 )
            {
             before(grammarAccess.getNiveauAccess().getUesAssignment_8_3_1()); 
            // InternalLangFil.g:1928:2: ( rule__Niveau__UesAssignment_8_3_1 )
            // InternalLangFil.g:1928:3: rule__Niveau__UesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Niveau__UesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNiveauAccess().getUesAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__Group_8_3__1__Impl"


    // $ANTLR start "rule__Intervenant__Group__0"
    // InternalLangFil.g:1937:1: rule__Intervenant__Group__0 : rule__Intervenant__Group__0__Impl rule__Intervenant__Group__1 ;
    public final void rule__Intervenant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1941:1: ( rule__Intervenant__Group__0__Impl rule__Intervenant__Group__1 )
            // InternalLangFil.g:1942:2: rule__Intervenant__Group__0__Impl rule__Intervenant__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Intervenant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intervenant__Group__1();

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
    // $ANTLR end "rule__Intervenant__Group__0"


    // $ANTLR start "rule__Intervenant__Group__0__Impl"
    // InternalLangFil.g:1949:1: rule__Intervenant__Group__0__Impl : ( () ) ;
    public final void rule__Intervenant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1953:1: ( ( () ) )
            // InternalLangFil.g:1954:1: ( () )
            {
            // InternalLangFil.g:1954:1: ( () )
            // InternalLangFil.g:1955:2: ()
            {
             before(grammarAccess.getIntervenantAccess().getIntervenantAction_0()); 
            // InternalLangFil.g:1956:2: ()
            // InternalLangFil.g:1956:3: 
            {
            }

             after(grammarAccess.getIntervenantAccess().getIntervenantAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intervenant__Group__0__Impl"


    // $ANTLR start "rule__Intervenant__Group__1"
    // InternalLangFil.g:1964:1: rule__Intervenant__Group__1 : rule__Intervenant__Group__1__Impl rule__Intervenant__Group__2 ;
    public final void rule__Intervenant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1968:1: ( rule__Intervenant__Group__1__Impl rule__Intervenant__Group__2 )
            // InternalLangFil.g:1969:2: rule__Intervenant__Group__1__Impl rule__Intervenant__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Intervenant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intervenant__Group__2();

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
    // $ANTLR end "rule__Intervenant__Group__1"


    // $ANTLR start "rule__Intervenant__Group__1__Impl"
    // InternalLangFil.g:1976:1: rule__Intervenant__Group__1__Impl : ( 'Intervenant' ) ;
    public final void rule__Intervenant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1980:1: ( ( 'Intervenant' ) )
            // InternalLangFil.g:1981:1: ( 'Intervenant' )
            {
            // InternalLangFil.g:1981:1: ( 'Intervenant' )
            // InternalLangFil.g:1982:2: 'Intervenant'
            {
             before(grammarAccess.getIntervenantAccess().getIntervenantKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIntervenantAccess().getIntervenantKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intervenant__Group__1__Impl"


    // $ANTLR start "rule__Intervenant__Group__2"
    // InternalLangFil.g:1991:1: rule__Intervenant__Group__2 : rule__Intervenant__Group__2__Impl rule__Intervenant__Group__3 ;
    public final void rule__Intervenant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:1995:1: ( rule__Intervenant__Group__2__Impl rule__Intervenant__Group__3 )
            // InternalLangFil.g:1996:2: rule__Intervenant__Group__2__Impl rule__Intervenant__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Intervenant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intervenant__Group__3();

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
    // $ANTLR end "rule__Intervenant__Group__2"


    // $ANTLR start "rule__Intervenant__Group__2__Impl"
    // InternalLangFil.g:2003:1: rule__Intervenant__Group__2__Impl : ( ( rule__Intervenant__NameAssignment_2 ) ) ;
    public final void rule__Intervenant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2007:1: ( ( ( rule__Intervenant__NameAssignment_2 ) ) )
            // InternalLangFil.g:2008:1: ( ( rule__Intervenant__NameAssignment_2 ) )
            {
            // InternalLangFil.g:2008:1: ( ( rule__Intervenant__NameAssignment_2 ) )
            // InternalLangFil.g:2009:2: ( rule__Intervenant__NameAssignment_2 )
            {
             before(grammarAccess.getIntervenantAccess().getNameAssignment_2()); 
            // InternalLangFil.g:2010:2: ( rule__Intervenant__NameAssignment_2 )
            // InternalLangFil.g:2010:3: rule__Intervenant__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Intervenant__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntervenantAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intervenant__Group__2__Impl"


    // $ANTLR start "rule__Intervenant__Group__3"
    // InternalLangFil.g:2018:1: rule__Intervenant__Group__3 : rule__Intervenant__Group__3__Impl rule__Intervenant__Group__4 ;
    public final void rule__Intervenant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2022:1: ( rule__Intervenant__Group__3__Impl rule__Intervenant__Group__4 )
            // InternalLangFil.g:2023:2: rule__Intervenant__Group__3__Impl rule__Intervenant__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Intervenant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intervenant__Group__4();

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
    // $ANTLR end "rule__Intervenant__Group__3"


    // $ANTLR start "rule__Intervenant__Group__3__Impl"
    // InternalLangFil.g:2030:1: rule__Intervenant__Group__3__Impl : ( '{' ) ;
    public final void rule__Intervenant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2034:1: ( ( '{' ) )
            // InternalLangFil.g:2035:1: ( '{' )
            {
            // InternalLangFil.g:2035:1: ( '{' )
            // InternalLangFil.g:2036:2: '{'
            {
             before(grammarAccess.getIntervenantAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIntervenantAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intervenant__Group__3__Impl"


    // $ANTLR start "rule__Intervenant__Group__4"
    // InternalLangFil.g:2045:1: rule__Intervenant__Group__4 : rule__Intervenant__Group__4__Impl rule__Intervenant__Group__5 ;
    public final void rule__Intervenant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2049:1: ( rule__Intervenant__Group__4__Impl rule__Intervenant__Group__5 )
            // InternalLangFil.g:2050:2: rule__Intervenant__Group__4__Impl rule__Intervenant__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Intervenant__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intervenant__Group__5();

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
    // $ANTLR end "rule__Intervenant__Group__4"


    // $ANTLR start "rule__Intervenant__Group__4__Impl"
    // InternalLangFil.g:2057:1: rule__Intervenant__Group__4__Impl : ( ( rule__Intervenant__Group_4__0 )? ) ;
    public final void rule__Intervenant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2061:1: ( ( ( rule__Intervenant__Group_4__0 )? ) )
            // InternalLangFil.g:2062:1: ( ( rule__Intervenant__Group_4__0 )? )
            {
            // InternalLangFil.g:2062:1: ( ( rule__Intervenant__Group_4__0 )? )
            // InternalLangFil.g:2063:2: ( rule__Intervenant__Group_4__0 )?
            {
             before(grammarAccess.getIntervenantAccess().getGroup_4()); 
            // InternalLangFil.g:2064:2: ( rule__Intervenant__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLangFil.g:2064:3: rule__Intervenant__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Intervenant__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntervenantAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intervenant__Group__4__Impl"


    // $ANTLR start "rule__Intervenant__Group__5"
    // InternalLangFil.g:2072:1: rule__Intervenant__Group__5 : rule__Intervenant__Group__5__Impl ;
    public final void rule__Intervenant__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2076:1: ( rule__Intervenant__Group__5__Impl )
            // InternalLangFil.g:2077:2: rule__Intervenant__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intervenant__Group__5__Impl();

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
    // $ANTLR end "rule__Intervenant__Group__5"


    // $ANTLR start "rule__Intervenant__Group__5__Impl"
    // InternalLangFil.g:2083:1: rule__Intervenant__Group__5__Impl : ( '}' ) ;
    public final void rule__Intervenant__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2087:1: ( ( '}' ) )
            // InternalLangFil.g:2088:1: ( '}' )
            {
            // InternalLangFil.g:2088:1: ( '}' )
            // InternalLangFil.g:2089:2: '}'
            {
             before(grammarAccess.getIntervenantAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getIntervenantAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intervenant__Group__5__Impl"


    // $ANTLR start "rule__Intervenant__Group_4__0"
    // InternalLangFil.g:2099:1: rule__Intervenant__Group_4__0 : rule__Intervenant__Group_4__0__Impl rule__Intervenant__Group_4__1 ;
    public final void rule__Intervenant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2103:1: ( rule__Intervenant__Group_4__0__Impl rule__Intervenant__Group_4__1 )
            // InternalLangFil.g:2104:2: rule__Intervenant__Group_4__0__Impl rule__Intervenant__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Intervenant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intervenant__Group_4__1();

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
    // $ANTLR end "rule__Intervenant__Group_4__0"


    // $ANTLR start "rule__Intervenant__Group_4__0__Impl"
    // InternalLangFil.g:2111:1: rule__Intervenant__Group_4__0__Impl : ( 'prenom' ) ;
    public final void rule__Intervenant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2115:1: ( ( 'prenom' ) )
            // InternalLangFil.g:2116:1: ( 'prenom' )
            {
            // InternalLangFil.g:2116:1: ( 'prenom' )
            // InternalLangFil.g:2117:2: 'prenom'
            {
             before(grammarAccess.getIntervenantAccess().getPrenomKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIntervenantAccess().getPrenomKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intervenant__Group_4__0__Impl"


    // $ANTLR start "rule__Intervenant__Group_4__1"
    // InternalLangFil.g:2126:1: rule__Intervenant__Group_4__1 : rule__Intervenant__Group_4__1__Impl ;
    public final void rule__Intervenant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2130:1: ( rule__Intervenant__Group_4__1__Impl )
            // InternalLangFil.g:2131:2: rule__Intervenant__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intervenant__Group_4__1__Impl();

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
    // $ANTLR end "rule__Intervenant__Group_4__1"


    // $ANTLR start "rule__Intervenant__Group_4__1__Impl"
    // InternalLangFil.g:2137:1: rule__Intervenant__Group_4__1__Impl : ( ( rule__Intervenant__PrenomAssignment_4_1 ) ) ;
    public final void rule__Intervenant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2141:1: ( ( ( rule__Intervenant__PrenomAssignment_4_1 ) ) )
            // InternalLangFil.g:2142:1: ( ( rule__Intervenant__PrenomAssignment_4_1 ) )
            {
            // InternalLangFil.g:2142:1: ( ( rule__Intervenant__PrenomAssignment_4_1 ) )
            // InternalLangFil.g:2143:2: ( rule__Intervenant__PrenomAssignment_4_1 )
            {
             before(grammarAccess.getIntervenantAccess().getPrenomAssignment_4_1()); 
            // InternalLangFil.g:2144:2: ( rule__Intervenant__PrenomAssignment_4_1 )
            // InternalLangFil.g:2144:3: rule__Intervenant__PrenomAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Intervenant__PrenomAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntervenantAccess().getPrenomAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intervenant__Group_4__1__Impl"


    // $ANTLR start "rule__Formation__Group__0"
    // InternalLangFil.g:2153:1: rule__Formation__Group__0 : rule__Formation__Group__0__Impl rule__Formation__Group__1 ;
    public final void rule__Formation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2157:1: ( rule__Formation__Group__0__Impl rule__Formation__Group__1 )
            // InternalLangFil.g:2158:2: rule__Formation__Group__0__Impl rule__Formation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Formation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__1();

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
    // $ANTLR end "rule__Formation__Group__0"


    // $ANTLR start "rule__Formation__Group__0__Impl"
    // InternalLangFil.g:2165:1: rule__Formation__Group__0__Impl : ( 'Formation' ) ;
    public final void rule__Formation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2169:1: ( ( 'Formation' ) )
            // InternalLangFil.g:2170:1: ( 'Formation' )
            {
            // InternalLangFil.g:2170:1: ( 'Formation' )
            // InternalLangFil.g:2171:2: 'Formation'
            {
             before(grammarAccess.getFormationAccess().getFormationKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getFormationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__0__Impl"


    // $ANTLR start "rule__Formation__Group__1"
    // InternalLangFil.g:2180:1: rule__Formation__Group__1 : rule__Formation__Group__1__Impl rule__Formation__Group__2 ;
    public final void rule__Formation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2184:1: ( rule__Formation__Group__1__Impl rule__Formation__Group__2 )
            // InternalLangFil.g:2185:2: rule__Formation__Group__1__Impl rule__Formation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Formation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__2();

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
    // $ANTLR end "rule__Formation__Group__1"


    // $ANTLR start "rule__Formation__Group__1__Impl"
    // InternalLangFil.g:2192:1: rule__Formation__Group__1__Impl : ( ( rule__Formation__NameAssignment_1 ) ) ;
    public final void rule__Formation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2196:1: ( ( ( rule__Formation__NameAssignment_1 ) ) )
            // InternalLangFil.g:2197:1: ( ( rule__Formation__NameAssignment_1 ) )
            {
            // InternalLangFil.g:2197:1: ( ( rule__Formation__NameAssignment_1 ) )
            // InternalLangFil.g:2198:2: ( rule__Formation__NameAssignment_1 )
            {
             before(grammarAccess.getFormationAccess().getNameAssignment_1()); 
            // InternalLangFil.g:2199:2: ( rule__Formation__NameAssignment_1 )
            // InternalLangFil.g:2199:3: rule__Formation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Formation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__1__Impl"


    // $ANTLR start "rule__Formation__Group__2"
    // InternalLangFil.g:2207:1: rule__Formation__Group__2 : rule__Formation__Group__2__Impl rule__Formation__Group__3 ;
    public final void rule__Formation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2211:1: ( rule__Formation__Group__2__Impl rule__Formation__Group__3 )
            // InternalLangFil.g:2212:2: rule__Formation__Group__2__Impl rule__Formation__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Formation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__3();

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
    // $ANTLR end "rule__Formation__Group__2"


    // $ANTLR start "rule__Formation__Group__2__Impl"
    // InternalLangFil.g:2219:1: rule__Formation__Group__2__Impl : ( '{' ) ;
    public final void rule__Formation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2223:1: ( ( '{' ) )
            // InternalLangFil.g:2224:1: ( '{' )
            {
            // InternalLangFil.g:2224:1: ( '{' )
            // InternalLangFil.g:2225:2: '{'
            {
             before(grammarAccess.getFormationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__2__Impl"


    // $ANTLR start "rule__Formation__Group__3"
    // InternalLangFil.g:2234:1: rule__Formation__Group__3 : rule__Formation__Group__3__Impl rule__Formation__Group__4 ;
    public final void rule__Formation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2238:1: ( rule__Formation__Group__3__Impl rule__Formation__Group__4 )
            // InternalLangFil.g:2239:2: rule__Formation__Group__3__Impl rule__Formation__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Formation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__4();

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
    // $ANTLR end "rule__Formation__Group__3"


    // $ANTLR start "rule__Formation__Group__3__Impl"
    // InternalLangFil.g:2246:1: rule__Formation__Group__3__Impl : ( ( rule__Formation__Group_3__0 )? ) ;
    public final void rule__Formation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2250:1: ( ( ( rule__Formation__Group_3__0 )? ) )
            // InternalLangFil.g:2251:1: ( ( rule__Formation__Group_3__0 )? )
            {
            // InternalLangFil.g:2251:1: ( ( rule__Formation__Group_3__0 )? )
            // InternalLangFil.g:2252:2: ( rule__Formation__Group_3__0 )?
            {
             before(grammarAccess.getFormationAccess().getGroup_3()); 
            // InternalLangFil.g:2253:2: ( rule__Formation__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLangFil.g:2253:3: rule__Formation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__3__Impl"


    // $ANTLR start "rule__Formation__Group__4"
    // InternalLangFil.g:2261:1: rule__Formation__Group__4 : rule__Formation__Group__4__Impl rule__Formation__Group__5 ;
    public final void rule__Formation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2265:1: ( rule__Formation__Group__4__Impl rule__Formation__Group__5 )
            // InternalLangFil.g:2266:2: rule__Formation__Group__4__Impl rule__Formation__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Formation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__5();

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
    // $ANTLR end "rule__Formation__Group__4"


    // $ANTLR start "rule__Formation__Group__4__Impl"
    // InternalLangFil.g:2273:1: rule__Formation__Group__4__Impl : ( ( rule__Formation__Group_4__0 )? ) ;
    public final void rule__Formation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2277:1: ( ( ( rule__Formation__Group_4__0 )? ) )
            // InternalLangFil.g:2278:1: ( ( rule__Formation__Group_4__0 )? )
            {
            // InternalLangFil.g:2278:1: ( ( rule__Formation__Group_4__0 )? )
            // InternalLangFil.g:2279:2: ( rule__Formation__Group_4__0 )?
            {
             before(grammarAccess.getFormationAccess().getGroup_4()); 
            // InternalLangFil.g:2280:2: ( rule__Formation__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLangFil.g:2280:3: rule__Formation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__4__Impl"


    // $ANTLR start "rule__Formation__Group__5"
    // InternalLangFil.g:2288:1: rule__Formation__Group__5 : rule__Formation__Group__5__Impl rule__Formation__Group__6 ;
    public final void rule__Formation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2292:1: ( rule__Formation__Group__5__Impl rule__Formation__Group__6 )
            // InternalLangFil.g:2293:2: rule__Formation__Group__5__Impl rule__Formation__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Formation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__6();

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
    // $ANTLR end "rule__Formation__Group__5"


    // $ANTLR start "rule__Formation__Group__5__Impl"
    // InternalLangFil.g:2300:1: rule__Formation__Group__5__Impl : ( ( rule__Formation__Group_5__0 )? ) ;
    public final void rule__Formation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2304:1: ( ( ( rule__Formation__Group_5__0 )? ) )
            // InternalLangFil.g:2305:1: ( ( rule__Formation__Group_5__0 )? )
            {
            // InternalLangFil.g:2305:1: ( ( rule__Formation__Group_5__0 )? )
            // InternalLangFil.g:2306:2: ( rule__Formation__Group_5__0 )?
            {
             before(grammarAccess.getFormationAccess().getGroup_5()); 
            // InternalLangFil.g:2307:2: ( rule__Formation__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLangFil.g:2307:3: rule__Formation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__5__Impl"


    // $ANTLR start "rule__Formation__Group__6"
    // InternalLangFil.g:2315:1: rule__Formation__Group__6 : rule__Formation__Group__6__Impl rule__Formation__Group__7 ;
    public final void rule__Formation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2319:1: ( rule__Formation__Group__6__Impl rule__Formation__Group__7 )
            // InternalLangFil.g:2320:2: rule__Formation__Group__6__Impl rule__Formation__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Formation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__7();

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
    // $ANTLR end "rule__Formation__Group__6"


    // $ANTLR start "rule__Formation__Group__6__Impl"
    // InternalLangFil.g:2327:1: rule__Formation__Group__6__Impl : ( ( rule__Formation__Group_6__0 )? ) ;
    public final void rule__Formation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2331:1: ( ( ( rule__Formation__Group_6__0 )? ) )
            // InternalLangFil.g:2332:1: ( ( rule__Formation__Group_6__0 )? )
            {
            // InternalLangFil.g:2332:1: ( ( rule__Formation__Group_6__0 )? )
            // InternalLangFil.g:2333:2: ( rule__Formation__Group_6__0 )?
            {
             before(grammarAccess.getFormationAccess().getGroup_6()); 
            // InternalLangFil.g:2334:2: ( rule__Formation__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLangFil.g:2334:3: rule__Formation__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formation__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__6__Impl"


    // $ANTLR start "rule__Formation__Group__7"
    // InternalLangFil.g:2342:1: rule__Formation__Group__7 : rule__Formation__Group__7__Impl rule__Formation__Group__8 ;
    public final void rule__Formation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2346:1: ( rule__Formation__Group__7__Impl rule__Formation__Group__8 )
            // InternalLangFil.g:2347:2: rule__Formation__Group__7__Impl rule__Formation__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Formation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__8();

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
    // $ANTLR end "rule__Formation__Group__7"


    // $ANTLR start "rule__Formation__Group__7__Impl"
    // InternalLangFil.g:2354:1: rule__Formation__Group__7__Impl : ( 's1' ) ;
    public final void rule__Formation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2358:1: ( ( 's1' ) )
            // InternalLangFil.g:2359:1: ( 's1' )
            {
            // InternalLangFil.g:2359:1: ( 's1' )
            // InternalLangFil.g:2360:2: 's1'
            {
             before(grammarAccess.getFormationAccess().getS1Keyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getS1Keyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__7__Impl"


    // $ANTLR start "rule__Formation__Group__8"
    // InternalLangFil.g:2369:1: rule__Formation__Group__8 : rule__Formation__Group__8__Impl rule__Formation__Group__9 ;
    public final void rule__Formation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2373:1: ( rule__Formation__Group__8__Impl rule__Formation__Group__9 )
            // InternalLangFil.g:2374:2: rule__Formation__Group__8__Impl rule__Formation__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Formation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__9();

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
    // $ANTLR end "rule__Formation__Group__8"


    // $ANTLR start "rule__Formation__Group__8__Impl"
    // InternalLangFil.g:2381:1: rule__Formation__Group__8__Impl : ( ( rule__Formation__S1Assignment_8 ) ) ;
    public final void rule__Formation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2385:1: ( ( ( rule__Formation__S1Assignment_8 ) ) )
            // InternalLangFil.g:2386:1: ( ( rule__Formation__S1Assignment_8 ) )
            {
            // InternalLangFil.g:2386:1: ( ( rule__Formation__S1Assignment_8 ) )
            // InternalLangFil.g:2387:2: ( rule__Formation__S1Assignment_8 )
            {
             before(grammarAccess.getFormationAccess().getS1Assignment_8()); 
            // InternalLangFil.g:2388:2: ( rule__Formation__S1Assignment_8 )
            // InternalLangFil.g:2388:3: rule__Formation__S1Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Formation__S1Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getS1Assignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__8__Impl"


    // $ANTLR start "rule__Formation__Group__9"
    // InternalLangFil.g:2396:1: rule__Formation__Group__9 : rule__Formation__Group__9__Impl rule__Formation__Group__10 ;
    public final void rule__Formation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2400:1: ( rule__Formation__Group__9__Impl rule__Formation__Group__10 )
            // InternalLangFil.g:2401:2: rule__Formation__Group__9__Impl rule__Formation__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Formation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__10();

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
    // $ANTLR end "rule__Formation__Group__9"


    // $ANTLR start "rule__Formation__Group__9__Impl"
    // InternalLangFil.g:2408:1: rule__Formation__Group__9__Impl : ( 's2' ) ;
    public final void rule__Formation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2412:1: ( ( 's2' ) )
            // InternalLangFil.g:2413:1: ( 's2' )
            {
            // InternalLangFil.g:2413:1: ( 's2' )
            // InternalLangFil.g:2414:2: 's2'
            {
             before(grammarAccess.getFormationAccess().getS2Keyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getS2Keyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__9__Impl"


    // $ANTLR start "rule__Formation__Group__10"
    // InternalLangFil.g:2423:1: rule__Formation__Group__10 : rule__Formation__Group__10__Impl rule__Formation__Group__11 ;
    public final void rule__Formation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2427:1: ( rule__Formation__Group__10__Impl rule__Formation__Group__11 )
            // InternalLangFil.g:2428:2: rule__Formation__Group__10__Impl rule__Formation__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__Formation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__11();

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
    // $ANTLR end "rule__Formation__Group__10"


    // $ANTLR start "rule__Formation__Group__10__Impl"
    // InternalLangFil.g:2435:1: rule__Formation__Group__10__Impl : ( ( rule__Formation__S2Assignment_10 ) ) ;
    public final void rule__Formation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2439:1: ( ( ( rule__Formation__S2Assignment_10 ) ) )
            // InternalLangFil.g:2440:1: ( ( rule__Formation__S2Assignment_10 ) )
            {
            // InternalLangFil.g:2440:1: ( ( rule__Formation__S2Assignment_10 ) )
            // InternalLangFil.g:2441:2: ( rule__Formation__S2Assignment_10 )
            {
             before(grammarAccess.getFormationAccess().getS2Assignment_10()); 
            // InternalLangFil.g:2442:2: ( rule__Formation__S2Assignment_10 )
            // InternalLangFil.g:2442:3: rule__Formation__S2Assignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Formation__S2Assignment_10();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getS2Assignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__10__Impl"


    // $ANTLR start "rule__Formation__Group__11"
    // InternalLangFil.g:2450:1: rule__Formation__Group__11 : rule__Formation__Group__11__Impl rule__Formation__Group__12 ;
    public final void rule__Formation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2454:1: ( rule__Formation__Group__11__Impl rule__Formation__Group__12 )
            // InternalLangFil.g:2455:2: rule__Formation__Group__11__Impl rule__Formation__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__Formation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group__12();

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
    // $ANTLR end "rule__Formation__Group__11"


    // $ANTLR start "rule__Formation__Group__11__Impl"
    // InternalLangFil.g:2462:1: rule__Formation__Group__11__Impl : ( ( rule__Formation__Group_11__0 )? ) ;
    public final void rule__Formation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2466:1: ( ( ( rule__Formation__Group_11__0 )? ) )
            // InternalLangFil.g:2467:1: ( ( rule__Formation__Group_11__0 )? )
            {
            // InternalLangFil.g:2467:1: ( ( rule__Formation__Group_11__0 )? )
            // InternalLangFil.g:2468:2: ( rule__Formation__Group_11__0 )?
            {
             before(grammarAccess.getFormationAccess().getGroup_11()); 
            // InternalLangFil.g:2469:2: ( rule__Formation__Group_11__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLangFil.g:2469:3: rule__Formation__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formation__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormationAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__11__Impl"


    // $ANTLR start "rule__Formation__Group__12"
    // InternalLangFil.g:2477:1: rule__Formation__Group__12 : rule__Formation__Group__12__Impl ;
    public final void rule__Formation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2481:1: ( rule__Formation__Group__12__Impl )
            // InternalLangFil.g:2482:2: rule__Formation__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formation__Group__12__Impl();

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
    // $ANTLR end "rule__Formation__Group__12"


    // $ANTLR start "rule__Formation__Group__12__Impl"
    // InternalLangFil.g:2488:1: rule__Formation__Group__12__Impl : ( '}' ) ;
    public final void rule__Formation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2492:1: ( ( '}' ) )
            // InternalLangFil.g:2493:1: ( '}' )
            {
            // InternalLangFil.g:2493:1: ( '}' )
            // InternalLangFil.g:2494:2: '}'
            {
             before(grammarAccess.getFormationAccess().getRightCurlyBracketKeyword_12()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group__12__Impl"


    // $ANTLR start "rule__Formation__Group_3__0"
    // InternalLangFil.g:2504:1: rule__Formation__Group_3__0 : rule__Formation__Group_3__0__Impl rule__Formation__Group_3__1 ;
    public final void rule__Formation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2508:1: ( rule__Formation__Group_3__0__Impl rule__Formation__Group_3__1 )
            // InternalLangFil.g:2509:2: rule__Formation__Group_3__0__Impl rule__Formation__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Formation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_3__1();

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
    // $ANTLR end "rule__Formation__Group_3__0"


    // $ANTLR start "rule__Formation__Group_3__0__Impl"
    // InternalLangFil.g:2516:1: rule__Formation__Group_3__0__Impl : ( 'pseudo' ) ;
    public final void rule__Formation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2520:1: ( ( 'pseudo' ) )
            // InternalLangFil.g:2521:1: ( 'pseudo' )
            {
            // InternalLangFil.g:2521:1: ( 'pseudo' )
            // InternalLangFil.g:2522:2: 'pseudo'
            {
             before(grammarAccess.getFormationAccess().getPseudoKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getPseudoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_3__0__Impl"


    // $ANTLR start "rule__Formation__Group_3__1"
    // InternalLangFil.g:2531:1: rule__Formation__Group_3__1 : rule__Formation__Group_3__1__Impl ;
    public final void rule__Formation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2535:1: ( rule__Formation__Group_3__1__Impl )
            // InternalLangFil.g:2536:2: rule__Formation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formation__Group_3__1__Impl();

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
    // $ANTLR end "rule__Formation__Group_3__1"


    // $ANTLR start "rule__Formation__Group_3__1__Impl"
    // InternalLangFil.g:2542:1: rule__Formation__Group_3__1__Impl : ( ( rule__Formation__PseudoAssignment_3_1 ) ) ;
    public final void rule__Formation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2546:1: ( ( ( rule__Formation__PseudoAssignment_3_1 ) ) )
            // InternalLangFil.g:2547:1: ( ( rule__Formation__PseudoAssignment_3_1 ) )
            {
            // InternalLangFil.g:2547:1: ( ( rule__Formation__PseudoAssignment_3_1 ) )
            // InternalLangFil.g:2548:2: ( rule__Formation__PseudoAssignment_3_1 )
            {
             before(grammarAccess.getFormationAccess().getPseudoAssignment_3_1()); 
            // InternalLangFil.g:2549:2: ( rule__Formation__PseudoAssignment_3_1 )
            // InternalLangFil.g:2549:3: rule__Formation__PseudoAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Formation__PseudoAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getPseudoAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_3__1__Impl"


    // $ANTLR start "rule__Formation__Group_4__0"
    // InternalLangFil.g:2558:1: rule__Formation__Group_4__0 : rule__Formation__Group_4__0__Impl rule__Formation__Group_4__1 ;
    public final void rule__Formation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2562:1: ( rule__Formation__Group_4__0__Impl rule__Formation__Group_4__1 )
            // InternalLangFil.g:2563:2: rule__Formation__Group_4__0__Impl rule__Formation__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Formation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_4__1();

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
    // $ANTLR end "rule__Formation__Group_4__0"


    // $ANTLR start "rule__Formation__Group_4__0__Impl"
    // InternalLangFil.g:2570:1: rule__Formation__Group_4__0__Impl : ( 'responsables' ) ;
    public final void rule__Formation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2574:1: ( ( 'responsables' ) )
            // InternalLangFil.g:2575:1: ( 'responsables' )
            {
            // InternalLangFil.g:2575:1: ( 'responsables' )
            // InternalLangFil.g:2576:2: 'responsables'
            {
             before(grammarAccess.getFormationAccess().getResponsablesKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getResponsablesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_4__0__Impl"


    // $ANTLR start "rule__Formation__Group_4__1"
    // InternalLangFil.g:2585:1: rule__Formation__Group_4__1 : rule__Formation__Group_4__1__Impl rule__Formation__Group_4__2 ;
    public final void rule__Formation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2589:1: ( rule__Formation__Group_4__1__Impl rule__Formation__Group_4__2 )
            // InternalLangFil.g:2590:2: rule__Formation__Group_4__1__Impl rule__Formation__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Formation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_4__2();

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
    // $ANTLR end "rule__Formation__Group_4__1"


    // $ANTLR start "rule__Formation__Group_4__1__Impl"
    // InternalLangFil.g:2597:1: rule__Formation__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Formation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2601:1: ( ( '(' ) )
            // InternalLangFil.g:2602:1: ( '(' )
            {
            // InternalLangFil.g:2602:1: ( '(' )
            // InternalLangFil.g:2603:2: '('
            {
             before(grammarAccess.getFormationAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_4__1__Impl"


    // $ANTLR start "rule__Formation__Group_4__2"
    // InternalLangFil.g:2612:1: rule__Formation__Group_4__2 : rule__Formation__Group_4__2__Impl rule__Formation__Group_4__3 ;
    public final void rule__Formation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2616:1: ( rule__Formation__Group_4__2__Impl rule__Formation__Group_4__3 )
            // InternalLangFil.g:2617:2: rule__Formation__Group_4__2__Impl rule__Formation__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__Formation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_4__3();

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
    // $ANTLR end "rule__Formation__Group_4__2"


    // $ANTLR start "rule__Formation__Group_4__2__Impl"
    // InternalLangFil.g:2624:1: rule__Formation__Group_4__2__Impl : ( ( rule__Formation__ResponsablesAssignment_4_2 ) ) ;
    public final void rule__Formation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2628:1: ( ( ( rule__Formation__ResponsablesAssignment_4_2 ) ) )
            // InternalLangFil.g:2629:1: ( ( rule__Formation__ResponsablesAssignment_4_2 ) )
            {
            // InternalLangFil.g:2629:1: ( ( rule__Formation__ResponsablesAssignment_4_2 ) )
            // InternalLangFil.g:2630:2: ( rule__Formation__ResponsablesAssignment_4_2 )
            {
             before(grammarAccess.getFormationAccess().getResponsablesAssignment_4_2()); 
            // InternalLangFil.g:2631:2: ( rule__Formation__ResponsablesAssignment_4_2 )
            // InternalLangFil.g:2631:3: rule__Formation__ResponsablesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Formation__ResponsablesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getResponsablesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_4__2__Impl"


    // $ANTLR start "rule__Formation__Group_4__3"
    // InternalLangFil.g:2639:1: rule__Formation__Group_4__3 : rule__Formation__Group_4__3__Impl rule__Formation__Group_4__4 ;
    public final void rule__Formation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2643:1: ( rule__Formation__Group_4__3__Impl rule__Formation__Group_4__4 )
            // InternalLangFil.g:2644:2: rule__Formation__Group_4__3__Impl rule__Formation__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__Formation__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_4__4();

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
    // $ANTLR end "rule__Formation__Group_4__3"


    // $ANTLR start "rule__Formation__Group_4__3__Impl"
    // InternalLangFil.g:2651:1: rule__Formation__Group_4__3__Impl : ( ( rule__Formation__Group_4_3__0 )* ) ;
    public final void rule__Formation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2655:1: ( ( ( rule__Formation__Group_4_3__0 )* ) )
            // InternalLangFil.g:2656:1: ( ( rule__Formation__Group_4_3__0 )* )
            {
            // InternalLangFil.g:2656:1: ( ( rule__Formation__Group_4_3__0 )* )
            // InternalLangFil.g:2657:2: ( rule__Formation__Group_4_3__0 )*
            {
             before(grammarAccess.getFormationAccess().getGroup_4_3()); 
            // InternalLangFil.g:2658:2: ( rule__Formation__Group_4_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLangFil.g:2658:3: rule__Formation__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Formation__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFormationAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_4__3__Impl"


    // $ANTLR start "rule__Formation__Group_4__4"
    // InternalLangFil.g:2666:1: rule__Formation__Group_4__4 : rule__Formation__Group_4__4__Impl ;
    public final void rule__Formation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2670:1: ( rule__Formation__Group_4__4__Impl )
            // InternalLangFil.g:2671:2: rule__Formation__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formation__Group_4__4__Impl();

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
    // $ANTLR end "rule__Formation__Group_4__4"


    // $ANTLR start "rule__Formation__Group_4__4__Impl"
    // InternalLangFil.g:2677:1: rule__Formation__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Formation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2681:1: ( ( ')' ) )
            // InternalLangFil.g:2682:1: ( ')' )
            {
            // InternalLangFil.g:2682:1: ( ')' )
            // InternalLangFil.g:2683:2: ')'
            {
             before(grammarAccess.getFormationAccess().getRightParenthesisKeyword_4_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_4__4__Impl"


    // $ANTLR start "rule__Formation__Group_4_3__0"
    // InternalLangFil.g:2693:1: rule__Formation__Group_4_3__0 : rule__Formation__Group_4_3__0__Impl rule__Formation__Group_4_3__1 ;
    public final void rule__Formation__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2697:1: ( rule__Formation__Group_4_3__0__Impl rule__Formation__Group_4_3__1 )
            // InternalLangFil.g:2698:2: rule__Formation__Group_4_3__0__Impl rule__Formation__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Formation__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_4_3__1();

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
    // $ANTLR end "rule__Formation__Group_4_3__0"


    // $ANTLR start "rule__Formation__Group_4_3__0__Impl"
    // InternalLangFil.g:2705:1: rule__Formation__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Formation__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2709:1: ( ( ',' ) )
            // InternalLangFil.g:2710:1: ( ',' )
            {
            // InternalLangFil.g:2710:1: ( ',' )
            // InternalLangFil.g:2711:2: ','
            {
             before(grammarAccess.getFormationAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_4_3__0__Impl"


    // $ANTLR start "rule__Formation__Group_4_3__1"
    // InternalLangFil.g:2720:1: rule__Formation__Group_4_3__1 : rule__Formation__Group_4_3__1__Impl ;
    public final void rule__Formation__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2724:1: ( rule__Formation__Group_4_3__1__Impl )
            // InternalLangFil.g:2725:2: rule__Formation__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formation__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Formation__Group_4_3__1"


    // $ANTLR start "rule__Formation__Group_4_3__1__Impl"
    // InternalLangFil.g:2731:1: rule__Formation__Group_4_3__1__Impl : ( ( rule__Formation__ResponsablesAssignment_4_3_1 ) ) ;
    public final void rule__Formation__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2735:1: ( ( ( rule__Formation__ResponsablesAssignment_4_3_1 ) ) )
            // InternalLangFil.g:2736:1: ( ( rule__Formation__ResponsablesAssignment_4_3_1 ) )
            {
            // InternalLangFil.g:2736:1: ( ( rule__Formation__ResponsablesAssignment_4_3_1 ) )
            // InternalLangFil.g:2737:2: ( rule__Formation__ResponsablesAssignment_4_3_1 )
            {
             before(grammarAccess.getFormationAccess().getResponsablesAssignment_4_3_1()); 
            // InternalLangFil.g:2738:2: ( rule__Formation__ResponsablesAssignment_4_3_1 )
            // InternalLangFil.g:2738:3: rule__Formation__ResponsablesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Formation__ResponsablesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getResponsablesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_4_3__1__Impl"


    // $ANTLR start "rule__Formation__Group_5__0"
    // InternalLangFil.g:2747:1: rule__Formation__Group_5__0 : rule__Formation__Group_5__0__Impl rule__Formation__Group_5__1 ;
    public final void rule__Formation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2751:1: ( rule__Formation__Group_5__0__Impl rule__Formation__Group_5__1 )
            // InternalLangFil.g:2752:2: rule__Formation__Group_5__0__Impl rule__Formation__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Formation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_5__1();

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
    // $ANTLR end "rule__Formation__Group_5__0"


    // $ANTLR start "rule__Formation__Group_5__0__Impl"
    // InternalLangFil.g:2759:1: rule__Formation__Group_5__0__Impl : ( 'enseignants' ) ;
    public final void rule__Formation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2763:1: ( ( 'enseignants' ) )
            // InternalLangFil.g:2764:1: ( 'enseignants' )
            {
            // InternalLangFil.g:2764:1: ( 'enseignants' )
            // InternalLangFil.g:2765:2: 'enseignants'
            {
             before(grammarAccess.getFormationAccess().getEnseignantsKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getEnseignantsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_5__0__Impl"


    // $ANTLR start "rule__Formation__Group_5__1"
    // InternalLangFil.g:2774:1: rule__Formation__Group_5__1 : rule__Formation__Group_5__1__Impl rule__Formation__Group_5__2 ;
    public final void rule__Formation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2778:1: ( rule__Formation__Group_5__1__Impl rule__Formation__Group_5__2 )
            // InternalLangFil.g:2779:2: rule__Formation__Group_5__1__Impl rule__Formation__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Formation__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_5__2();

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
    // $ANTLR end "rule__Formation__Group_5__1"


    // $ANTLR start "rule__Formation__Group_5__1__Impl"
    // InternalLangFil.g:2786:1: rule__Formation__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Formation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2790:1: ( ( '(' ) )
            // InternalLangFil.g:2791:1: ( '(' )
            {
            // InternalLangFil.g:2791:1: ( '(' )
            // InternalLangFil.g:2792:2: '('
            {
             before(grammarAccess.getFormationAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_5__1__Impl"


    // $ANTLR start "rule__Formation__Group_5__2"
    // InternalLangFil.g:2801:1: rule__Formation__Group_5__2 : rule__Formation__Group_5__2__Impl rule__Formation__Group_5__3 ;
    public final void rule__Formation__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2805:1: ( rule__Formation__Group_5__2__Impl rule__Formation__Group_5__3 )
            // InternalLangFil.g:2806:2: rule__Formation__Group_5__2__Impl rule__Formation__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__Formation__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_5__3();

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
    // $ANTLR end "rule__Formation__Group_5__2"


    // $ANTLR start "rule__Formation__Group_5__2__Impl"
    // InternalLangFil.g:2813:1: rule__Formation__Group_5__2__Impl : ( ( rule__Formation__EnseignantsAssignment_5_2 ) ) ;
    public final void rule__Formation__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2817:1: ( ( ( rule__Formation__EnseignantsAssignment_5_2 ) ) )
            // InternalLangFil.g:2818:1: ( ( rule__Formation__EnseignantsAssignment_5_2 ) )
            {
            // InternalLangFil.g:2818:1: ( ( rule__Formation__EnseignantsAssignment_5_2 ) )
            // InternalLangFil.g:2819:2: ( rule__Formation__EnseignantsAssignment_5_2 )
            {
             before(grammarAccess.getFormationAccess().getEnseignantsAssignment_5_2()); 
            // InternalLangFil.g:2820:2: ( rule__Formation__EnseignantsAssignment_5_2 )
            // InternalLangFil.g:2820:3: rule__Formation__EnseignantsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Formation__EnseignantsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getEnseignantsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_5__2__Impl"


    // $ANTLR start "rule__Formation__Group_5__3"
    // InternalLangFil.g:2828:1: rule__Formation__Group_5__3 : rule__Formation__Group_5__3__Impl rule__Formation__Group_5__4 ;
    public final void rule__Formation__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2832:1: ( rule__Formation__Group_5__3__Impl rule__Formation__Group_5__4 )
            // InternalLangFil.g:2833:2: rule__Formation__Group_5__3__Impl rule__Formation__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__Formation__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_5__4();

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
    // $ANTLR end "rule__Formation__Group_5__3"


    // $ANTLR start "rule__Formation__Group_5__3__Impl"
    // InternalLangFil.g:2840:1: rule__Formation__Group_5__3__Impl : ( ( rule__Formation__Group_5_3__0 )* ) ;
    public final void rule__Formation__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2844:1: ( ( ( rule__Formation__Group_5_3__0 )* ) )
            // InternalLangFil.g:2845:1: ( ( rule__Formation__Group_5_3__0 )* )
            {
            // InternalLangFil.g:2845:1: ( ( rule__Formation__Group_5_3__0 )* )
            // InternalLangFil.g:2846:2: ( rule__Formation__Group_5_3__0 )*
            {
             before(grammarAccess.getFormationAccess().getGroup_5_3()); 
            // InternalLangFil.g:2847:2: ( rule__Formation__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLangFil.g:2847:3: rule__Formation__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Formation__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getFormationAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_5__3__Impl"


    // $ANTLR start "rule__Formation__Group_5__4"
    // InternalLangFil.g:2855:1: rule__Formation__Group_5__4 : rule__Formation__Group_5__4__Impl ;
    public final void rule__Formation__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2859:1: ( rule__Formation__Group_5__4__Impl )
            // InternalLangFil.g:2860:2: rule__Formation__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formation__Group_5__4__Impl();

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
    // $ANTLR end "rule__Formation__Group_5__4"


    // $ANTLR start "rule__Formation__Group_5__4__Impl"
    // InternalLangFil.g:2866:1: rule__Formation__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Formation__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2870:1: ( ( ')' ) )
            // InternalLangFil.g:2871:1: ( ')' )
            {
            // InternalLangFil.g:2871:1: ( ')' )
            // InternalLangFil.g:2872:2: ')'
            {
             before(grammarAccess.getFormationAccess().getRightParenthesisKeyword_5_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_5__4__Impl"


    // $ANTLR start "rule__Formation__Group_5_3__0"
    // InternalLangFil.g:2882:1: rule__Formation__Group_5_3__0 : rule__Formation__Group_5_3__0__Impl rule__Formation__Group_5_3__1 ;
    public final void rule__Formation__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2886:1: ( rule__Formation__Group_5_3__0__Impl rule__Formation__Group_5_3__1 )
            // InternalLangFil.g:2887:2: rule__Formation__Group_5_3__0__Impl rule__Formation__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Formation__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_5_3__1();

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
    // $ANTLR end "rule__Formation__Group_5_3__0"


    // $ANTLR start "rule__Formation__Group_5_3__0__Impl"
    // InternalLangFil.g:2894:1: rule__Formation__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Formation__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2898:1: ( ( ',' ) )
            // InternalLangFil.g:2899:1: ( ',' )
            {
            // InternalLangFil.g:2899:1: ( ',' )
            // InternalLangFil.g:2900:2: ','
            {
             before(grammarAccess.getFormationAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_5_3__0__Impl"


    // $ANTLR start "rule__Formation__Group_5_3__1"
    // InternalLangFil.g:2909:1: rule__Formation__Group_5_3__1 : rule__Formation__Group_5_3__1__Impl ;
    public final void rule__Formation__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2913:1: ( rule__Formation__Group_5_3__1__Impl )
            // InternalLangFil.g:2914:2: rule__Formation__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formation__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Formation__Group_5_3__1"


    // $ANTLR start "rule__Formation__Group_5_3__1__Impl"
    // InternalLangFil.g:2920:1: rule__Formation__Group_5_3__1__Impl : ( ( rule__Formation__EnseignantsAssignment_5_3_1 ) ) ;
    public final void rule__Formation__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2924:1: ( ( ( rule__Formation__EnseignantsAssignment_5_3_1 ) ) )
            // InternalLangFil.g:2925:1: ( ( rule__Formation__EnseignantsAssignment_5_3_1 ) )
            {
            // InternalLangFil.g:2925:1: ( ( rule__Formation__EnseignantsAssignment_5_3_1 ) )
            // InternalLangFil.g:2926:2: ( rule__Formation__EnseignantsAssignment_5_3_1 )
            {
             before(grammarAccess.getFormationAccess().getEnseignantsAssignment_5_3_1()); 
            // InternalLangFil.g:2927:2: ( rule__Formation__EnseignantsAssignment_5_3_1 )
            // InternalLangFil.g:2927:3: rule__Formation__EnseignantsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Formation__EnseignantsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getEnseignantsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_5_3__1__Impl"


    // $ANTLR start "rule__Formation__Group_6__0"
    // InternalLangFil.g:2936:1: rule__Formation__Group_6__0 : rule__Formation__Group_6__0__Impl rule__Formation__Group_6__1 ;
    public final void rule__Formation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2940:1: ( rule__Formation__Group_6__0__Impl rule__Formation__Group_6__1 )
            // InternalLangFil.g:2941:2: rule__Formation__Group_6__0__Impl rule__Formation__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Formation__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_6__1();

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
    // $ANTLR end "rule__Formation__Group_6__0"


    // $ANTLR start "rule__Formation__Group_6__0__Impl"
    // InternalLangFil.g:2948:1: rule__Formation__Group_6__0__Impl : ( 'presentation' ) ;
    public final void rule__Formation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2952:1: ( ( 'presentation' ) )
            // InternalLangFil.g:2953:1: ( 'presentation' )
            {
            // InternalLangFil.g:2953:1: ( 'presentation' )
            // InternalLangFil.g:2954:2: 'presentation'
            {
             before(grammarAccess.getFormationAccess().getPresentationKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getPresentationKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_6__0__Impl"


    // $ANTLR start "rule__Formation__Group_6__1"
    // InternalLangFil.g:2963:1: rule__Formation__Group_6__1 : rule__Formation__Group_6__1__Impl ;
    public final void rule__Formation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2967:1: ( rule__Formation__Group_6__1__Impl )
            // InternalLangFil.g:2968:2: rule__Formation__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formation__Group_6__1__Impl();

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
    // $ANTLR end "rule__Formation__Group_6__1"


    // $ANTLR start "rule__Formation__Group_6__1__Impl"
    // InternalLangFil.g:2974:1: rule__Formation__Group_6__1__Impl : ( ( rule__Formation__PresentationAssignment_6_1 ) ) ;
    public final void rule__Formation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2978:1: ( ( ( rule__Formation__PresentationAssignment_6_1 ) ) )
            // InternalLangFil.g:2979:1: ( ( rule__Formation__PresentationAssignment_6_1 ) )
            {
            // InternalLangFil.g:2979:1: ( ( rule__Formation__PresentationAssignment_6_1 ) )
            // InternalLangFil.g:2980:2: ( rule__Formation__PresentationAssignment_6_1 )
            {
             before(grammarAccess.getFormationAccess().getPresentationAssignment_6_1()); 
            // InternalLangFil.g:2981:2: ( rule__Formation__PresentationAssignment_6_1 )
            // InternalLangFil.g:2981:3: rule__Formation__PresentationAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Formation__PresentationAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getPresentationAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_6__1__Impl"


    // $ANTLR start "rule__Formation__Group_11__0"
    // InternalLangFil.g:2990:1: rule__Formation__Group_11__0 : rule__Formation__Group_11__0__Impl rule__Formation__Group_11__1 ;
    public final void rule__Formation__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:2994:1: ( rule__Formation__Group_11__0__Impl rule__Formation__Group_11__1 )
            // InternalLangFil.g:2995:2: rule__Formation__Group_11__0__Impl rule__Formation__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__Formation__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_11__1();

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
    // $ANTLR end "rule__Formation__Group_11__0"


    // $ANTLR start "rule__Formation__Group_11__0__Impl"
    // InternalLangFil.g:3002:1: rule__Formation__Group_11__0__Impl : ( 'documents' ) ;
    public final void rule__Formation__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3006:1: ( ( 'documents' ) )
            // InternalLangFil.g:3007:1: ( 'documents' )
            {
            // InternalLangFil.g:3007:1: ( 'documents' )
            // InternalLangFil.g:3008:2: 'documents'
            {
             before(grammarAccess.getFormationAccess().getDocumentsKeyword_11_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getDocumentsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_11__0__Impl"


    // $ANTLR start "rule__Formation__Group_11__1"
    // InternalLangFil.g:3017:1: rule__Formation__Group_11__1 : rule__Formation__Group_11__1__Impl rule__Formation__Group_11__2 ;
    public final void rule__Formation__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3021:1: ( rule__Formation__Group_11__1__Impl rule__Formation__Group_11__2 )
            // InternalLangFil.g:3022:2: rule__Formation__Group_11__1__Impl rule__Formation__Group_11__2
            {
            pushFollow(FOLLOW_23);
            rule__Formation__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_11__2();

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
    // $ANTLR end "rule__Formation__Group_11__1"


    // $ANTLR start "rule__Formation__Group_11__1__Impl"
    // InternalLangFil.g:3029:1: rule__Formation__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Formation__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3033:1: ( ( '{' ) )
            // InternalLangFil.g:3034:1: ( '{' )
            {
            // InternalLangFil.g:3034:1: ( '{' )
            // InternalLangFil.g:3035:2: '{'
            {
             before(grammarAccess.getFormationAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_11__1__Impl"


    // $ANTLR start "rule__Formation__Group_11__2"
    // InternalLangFil.g:3044:1: rule__Formation__Group_11__2 : rule__Formation__Group_11__2__Impl rule__Formation__Group_11__3 ;
    public final void rule__Formation__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3048:1: ( rule__Formation__Group_11__2__Impl rule__Formation__Group_11__3 )
            // InternalLangFil.g:3049:2: rule__Formation__Group_11__2__Impl rule__Formation__Group_11__3
            {
            pushFollow(FOLLOW_8);
            rule__Formation__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_11__3();

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
    // $ANTLR end "rule__Formation__Group_11__2"


    // $ANTLR start "rule__Formation__Group_11__2__Impl"
    // InternalLangFil.g:3056:1: rule__Formation__Group_11__2__Impl : ( ( rule__Formation__DocumentsAssignment_11_2 ) ) ;
    public final void rule__Formation__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3060:1: ( ( ( rule__Formation__DocumentsAssignment_11_2 ) ) )
            // InternalLangFil.g:3061:1: ( ( rule__Formation__DocumentsAssignment_11_2 ) )
            {
            // InternalLangFil.g:3061:1: ( ( rule__Formation__DocumentsAssignment_11_2 ) )
            // InternalLangFil.g:3062:2: ( rule__Formation__DocumentsAssignment_11_2 )
            {
             before(grammarAccess.getFormationAccess().getDocumentsAssignment_11_2()); 
            // InternalLangFil.g:3063:2: ( rule__Formation__DocumentsAssignment_11_2 )
            // InternalLangFil.g:3063:3: rule__Formation__DocumentsAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Formation__DocumentsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getDocumentsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_11__2__Impl"


    // $ANTLR start "rule__Formation__Group_11__3"
    // InternalLangFil.g:3071:1: rule__Formation__Group_11__3 : rule__Formation__Group_11__3__Impl rule__Formation__Group_11__4 ;
    public final void rule__Formation__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3075:1: ( rule__Formation__Group_11__3__Impl rule__Formation__Group_11__4 )
            // InternalLangFil.g:3076:2: rule__Formation__Group_11__3__Impl rule__Formation__Group_11__4
            {
            pushFollow(FOLLOW_8);
            rule__Formation__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_11__4();

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
    // $ANTLR end "rule__Formation__Group_11__3"


    // $ANTLR start "rule__Formation__Group_11__3__Impl"
    // InternalLangFil.g:3083:1: rule__Formation__Group_11__3__Impl : ( ( rule__Formation__Group_11_3__0 )* ) ;
    public final void rule__Formation__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3087:1: ( ( ( rule__Formation__Group_11_3__0 )* ) )
            // InternalLangFil.g:3088:1: ( ( rule__Formation__Group_11_3__0 )* )
            {
            // InternalLangFil.g:3088:1: ( ( rule__Formation__Group_11_3__0 )* )
            // InternalLangFil.g:3089:2: ( rule__Formation__Group_11_3__0 )*
            {
             before(grammarAccess.getFormationAccess().getGroup_11_3()); 
            // InternalLangFil.g:3090:2: ( rule__Formation__Group_11_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLangFil.g:3090:3: rule__Formation__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Formation__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFormationAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_11__3__Impl"


    // $ANTLR start "rule__Formation__Group_11__4"
    // InternalLangFil.g:3098:1: rule__Formation__Group_11__4 : rule__Formation__Group_11__4__Impl ;
    public final void rule__Formation__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3102:1: ( rule__Formation__Group_11__4__Impl )
            // InternalLangFil.g:3103:2: rule__Formation__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formation__Group_11__4__Impl();

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
    // $ANTLR end "rule__Formation__Group_11__4"


    // $ANTLR start "rule__Formation__Group_11__4__Impl"
    // InternalLangFil.g:3109:1: rule__Formation__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Formation__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3113:1: ( ( '}' ) )
            // InternalLangFil.g:3114:1: ( '}' )
            {
            // InternalLangFil.g:3114:1: ( '}' )
            // InternalLangFil.g:3115:2: '}'
            {
             before(grammarAccess.getFormationAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_11__4__Impl"


    // $ANTLR start "rule__Formation__Group_11_3__0"
    // InternalLangFil.g:3125:1: rule__Formation__Group_11_3__0 : rule__Formation__Group_11_3__0__Impl rule__Formation__Group_11_3__1 ;
    public final void rule__Formation__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3129:1: ( rule__Formation__Group_11_3__0__Impl rule__Formation__Group_11_3__1 )
            // InternalLangFil.g:3130:2: rule__Formation__Group_11_3__0__Impl rule__Formation__Group_11_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Formation__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formation__Group_11_3__1();

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
    // $ANTLR end "rule__Formation__Group_11_3__0"


    // $ANTLR start "rule__Formation__Group_11_3__0__Impl"
    // InternalLangFil.g:3137:1: rule__Formation__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Formation__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3141:1: ( ( ',' ) )
            // InternalLangFil.g:3142:1: ( ',' )
            {
            // InternalLangFil.g:3142:1: ( ',' )
            // InternalLangFil.g:3143:2: ','
            {
             before(grammarAccess.getFormationAccess().getCommaKeyword_11_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFormationAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_11_3__0__Impl"


    // $ANTLR start "rule__Formation__Group_11_3__1"
    // InternalLangFil.g:3152:1: rule__Formation__Group_11_3__1 : rule__Formation__Group_11_3__1__Impl ;
    public final void rule__Formation__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3156:1: ( rule__Formation__Group_11_3__1__Impl )
            // InternalLangFil.g:3157:2: rule__Formation__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formation__Group_11_3__1__Impl();

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
    // $ANTLR end "rule__Formation__Group_11_3__1"


    // $ANTLR start "rule__Formation__Group_11_3__1__Impl"
    // InternalLangFil.g:3163:1: rule__Formation__Group_11_3__1__Impl : ( ( rule__Formation__DocumentsAssignment_11_3_1 ) ) ;
    public final void rule__Formation__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3167:1: ( ( ( rule__Formation__DocumentsAssignment_11_3_1 ) ) )
            // InternalLangFil.g:3168:1: ( ( rule__Formation__DocumentsAssignment_11_3_1 ) )
            {
            // InternalLangFil.g:3168:1: ( ( rule__Formation__DocumentsAssignment_11_3_1 ) )
            // InternalLangFil.g:3169:2: ( rule__Formation__DocumentsAssignment_11_3_1 )
            {
             before(grammarAccess.getFormationAccess().getDocumentsAssignment_11_3_1()); 
            // InternalLangFil.g:3170:2: ( rule__Formation__DocumentsAssignment_11_3_1 )
            // InternalLangFil.g:3170:3: rule__Formation__DocumentsAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Formation__DocumentsAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFormationAccess().getDocumentsAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__Group_11_3__1__Impl"


    // $ANTLR start "rule__Presentation__Group__0"
    // InternalLangFil.g:3179:1: rule__Presentation__Group__0 : rule__Presentation__Group__0__Impl rule__Presentation__Group__1 ;
    public final void rule__Presentation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3183:1: ( rule__Presentation__Group__0__Impl rule__Presentation__Group__1 )
            // InternalLangFil.g:3184:2: rule__Presentation__Group__0__Impl rule__Presentation__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Presentation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__1();

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
    // $ANTLR end "rule__Presentation__Group__0"


    // $ANTLR start "rule__Presentation__Group__0__Impl"
    // InternalLangFil.g:3191:1: rule__Presentation__Group__0__Impl : ( () ) ;
    public final void rule__Presentation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3195:1: ( ( () ) )
            // InternalLangFil.g:3196:1: ( () )
            {
            // InternalLangFil.g:3196:1: ( () )
            // InternalLangFil.g:3197:2: ()
            {
             before(grammarAccess.getPresentationAccess().getPresentationAction_0()); 
            // InternalLangFil.g:3198:2: ()
            // InternalLangFil.g:3198:3: 
            {
            }

             after(grammarAccess.getPresentationAccess().getPresentationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__0__Impl"


    // $ANTLR start "rule__Presentation__Group__1"
    // InternalLangFil.g:3206:1: rule__Presentation__Group__1 : rule__Presentation__Group__1__Impl rule__Presentation__Group__2 ;
    public final void rule__Presentation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3210:1: ( rule__Presentation__Group__1__Impl rule__Presentation__Group__2 )
            // InternalLangFil.g:3211:2: rule__Presentation__Group__1__Impl rule__Presentation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Presentation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__2();

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
    // $ANTLR end "rule__Presentation__Group__1"


    // $ANTLR start "rule__Presentation__Group__1__Impl"
    // InternalLangFil.g:3218:1: rule__Presentation__Group__1__Impl : ( 'Presentation' ) ;
    public final void rule__Presentation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3222:1: ( ( 'Presentation' ) )
            // InternalLangFil.g:3223:1: ( 'Presentation' )
            {
            // InternalLangFil.g:3223:1: ( 'Presentation' )
            // InternalLangFil.g:3224:2: 'Presentation'
            {
             before(grammarAccess.getPresentationAccess().getPresentationKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getPresentationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__1__Impl"


    // $ANTLR start "rule__Presentation__Group__2"
    // InternalLangFil.g:3233:1: rule__Presentation__Group__2 : rule__Presentation__Group__2__Impl rule__Presentation__Group__3 ;
    public final void rule__Presentation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3237:1: ( rule__Presentation__Group__2__Impl rule__Presentation__Group__3 )
            // InternalLangFil.g:3238:2: rule__Presentation__Group__2__Impl rule__Presentation__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Presentation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__3();

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
    // $ANTLR end "rule__Presentation__Group__2"


    // $ANTLR start "rule__Presentation__Group__2__Impl"
    // InternalLangFil.g:3245:1: rule__Presentation__Group__2__Impl : ( '{' ) ;
    public final void rule__Presentation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3249:1: ( ( '{' ) )
            // InternalLangFil.g:3250:1: ( '{' )
            {
            // InternalLangFil.g:3250:1: ( '{' )
            // InternalLangFil.g:3251:2: '{'
            {
             before(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__2__Impl"


    // $ANTLR start "rule__Presentation__Group__3"
    // InternalLangFil.g:3260:1: rule__Presentation__Group__3 : rule__Presentation__Group__3__Impl rule__Presentation__Group__4 ;
    public final void rule__Presentation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3264:1: ( rule__Presentation__Group__3__Impl rule__Presentation__Group__4 )
            // InternalLangFil.g:3265:2: rule__Presentation__Group__3__Impl rule__Presentation__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Presentation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group__4();

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
    // $ANTLR end "rule__Presentation__Group__3"


    // $ANTLR start "rule__Presentation__Group__3__Impl"
    // InternalLangFil.g:3272:1: rule__Presentation__Group__3__Impl : ( ( rule__Presentation__Group_3__0 )? ) ;
    public final void rule__Presentation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3276:1: ( ( ( rule__Presentation__Group_3__0 )? ) )
            // InternalLangFil.g:3277:1: ( ( rule__Presentation__Group_3__0 )? )
            {
            // InternalLangFil.g:3277:1: ( ( rule__Presentation__Group_3__0 )? )
            // InternalLangFil.g:3278:2: ( rule__Presentation__Group_3__0 )?
            {
             before(grammarAccess.getPresentationAccess().getGroup_3()); 
            // InternalLangFil.g:3279:2: ( rule__Presentation__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLangFil.g:3279:3: rule__Presentation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Presentation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPresentationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__3__Impl"


    // $ANTLR start "rule__Presentation__Group__4"
    // InternalLangFil.g:3287:1: rule__Presentation__Group__4 : rule__Presentation__Group__4__Impl ;
    public final void rule__Presentation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3291:1: ( rule__Presentation__Group__4__Impl )
            // InternalLangFil.g:3292:2: rule__Presentation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group__4__Impl();

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
    // $ANTLR end "rule__Presentation__Group__4"


    // $ANTLR start "rule__Presentation__Group__4__Impl"
    // InternalLangFil.g:3298:1: rule__Presentation__Group__4__Impl : ( '}' ) ;
    public final void rule__Presentation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3302:1: ( ( '}' ) )
            // InternalLangFil.g:3303:1: ( '}' )
            {
            // InternalLangFil.g:3303:1: ( '}' )
            // InternalLangFil.g:3304:2: '}'
            {
             before(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group__4__Impl"


    // $ANTLR start "rule__Presentation__Group_3__0"
    // InternalLangFil.g:3314:1: rule__Presentation__Group_3__0 : rule__Presentation__Group_3__0__Impl rule__Presentation__Group_3__1 ;
    public final void rule__Presentation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3318:1: ( rule__Presentation__Group_3__0__Impl rule__Presentation__Group_3__1 )
            // InternalLangFil.g:3319:2: rule__Presentation__Group_3__0__Impl rule__Presentation__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Presentation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Presentation__Group_3__1();

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
    // $ANTLR end "rule__Presentation__Group_3__0"


    // $ANTLR start "rule__Presentation__Group_3__0__Impl"
    // InternalLangFil.g:3326:1: rule__Presentation__Group_3__0__Impl : ( 'contenue' ) ;
    public final void rule__Presentation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3330:1: ( ( 'contenue' ) )
            // InternalLangFil.g:3331:1: ( 'contenue' )
            {
            // InternalLangFil.g:3331:1: ( 'contenue' )
            // InternalLangFil.g:3332:2: 'contenue'
            {
             before(grammarAccess.getPresentationAccess().getContenueKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPresentationAccess().getContenueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__0__Impl"


    // $ANTLR start "rule__Presentation__Group_3__1"
    // InternalLangFil.g:3341:1: rule__Presentation__Group_3__1 : rule__Presentation__Group_3__1__Impl ;
    public final void rule__Presentation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3345:1: ( rule__Presentation__Group_3__1__Impl )
            // InternalLangFil.g:3346:2: rule__Presentation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__Group_3__1__Impl();

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
    // $ANTLR end "rule__Presentation__Group_3__1"


    // $ANTLR start "rule__Presentation__Group_3__1__Impl"
    // InternalLangFil.g:3352:1: rule__Presentation__Group_3__1__Impl : ( ( rule__Presentation__ContenueAssignment_3_1 ) ) ;
    public final void rule__Presentation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3356:1: ( ( ( rule__Presentation__ContenueAssignment_3_1 ) ) )
            // InternalLangFil.g:3357:1: ( ( rule__Presentation__ContenueAssignment_3_1 ) )
            {
            // InternalLangFil.g:3357:1: ( ( rule__Presentation__ContenueAssignment_3_1 ) )
            // InternalLangFil.g:3358:2: ( rule__Presentation__ContenueAssignment_3_1 )
            {
             before(grammarAccess.getPresentationAccess().getContenueAssignment_3_1()); 
            // InternalLangFil.g:3359:2: ( rule__Presentation__ContenueAssignment_3_1 )
            // InternalLangFil.g:3359:3: rule__Presentation__ContenueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Presentation__ContenueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPresentationAccess().getContenueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__Group_3__1__Impl"


    // $ANTLR start "rule__UE__Group__0"
    // InternalLangFil.g:3368:1: rule__UE__Group__0 : rule__UE__Group__0__Impl rule__UE__Group__1 ;
    public final void rule__UE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3372:1: ( rule__UE__Group__0__Impl rule__UE__Group__1 )
            // InternalLangFil.g:3373:2: rule__UE__Group__0__Impl rule__UE__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__UE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group__1();

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
    // $ANTLR end "rule__UE__Group__0"


    // $ANTLR start "rule__UE__Group__0__Impl"
    // InternalLangFil.g:3380:1: rule__UE__Group__0__Impl : ( () ) ;
    public final void rule__UE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3384:1: ( ( () ) )
            // InternalLangFil.g:3385:1: ( () )
            {
            // InternalLangFil.g:3385:1: ( () )
            // InternalLangFil.g:3386:2: ()
            {
             before(grammarAccess.getUEAccess().getUEAction_0()); 
            // InternalLangFil.g:3387:2: ()
            // InternalLangFil.g:3387:3: 
            {
            }

             after(grammarAccess.getUEAccess().getUEAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group__0__Impl"


    // $ANTLR start "rule__UE__Group__1"
    // InternalLangFil.g:3395:1: rule__UE__Group__1 : rule__UE__Group__1__Impl rule__UE__Group__2 ;
    public final void rule__UE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3399:1: ( rule__UE__Group__1__Impl rule__UE__Group__2 )
            // InternalLangFil.g:3400:2: rule__UE__Group__1__Impl rule__UE__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group__2();

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
    // $ANTLR end "rule__UE__Group__1"


    // $ANTLR start "rule__UE__Group__1__Impl"
    // InternalLangFil.g:3407:1: rule__UE__Group__1__Impl : ( 'UE' ) ;
    public final void rule__UE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3411:1: ( ( 'UE' ) )
            // InternalLangFil.g:3412:1: ( 'UE' )
            {
            // InternalLangFil.g:3412:1: ( 'UE' )
            // InternalLangFil.g:3413:2: 'UE'
            {
             before(grammarAccess.getUEAccess().getUEKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getUEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group__1__Impl"


    // $ANTLR start "rule__UE__Group__2"
    // InternalLangFil.g:3422:1: rule__UE__Group__2 : rule__UE__Group__2__Impl rule__UE__Group__3 ;
    public final void rule__UE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3426:1: ( rule__UE__Group__2__Impl rule__UE__Group__3 )
            // InternalLangFil.g:3427:2: rule__UE__Group__2__Impl rule__UE__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__UE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group__3();

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
    // $ANTLR end "rule__UE__Group__2"


    // $ANTLR start "rule__UE__Group__2__Impl"
    // InternalLangFil.g:3434:1: rule__UE__Group__2__Impl : ( ( rule__UE__NameAssignment_2 ) ) ;
    public final void rule__UE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3438:1: ( ( ( rule__UE__NameAssignment_2 ) ) )
            // InternalLangFil.g:3439:1: ( ( rule__UE__NameAssignment_2 ) )
            {
            // InternalLangFil.g:3439:1: ( ( rule__UE__NameAssignment_2 ) )
            // InternalLangFil.g:3440:2: ( rule__UE__NameAssignment_2 )
            {
             before(grammarAccess.getUEAccess().getNameAssignment_2()); 
            // InternalLangFil.g:3441:2: ( rule__UE__NameAssignment_2 )
            // InternalLangFil.g:3441:3: rule__UE__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UE__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUEAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group__2__Impl"


    // $ANTLR start "rule__UE__Group__3"
    // InternalLangFil.g:3449:1: rule__UE__Group__3 : rule__UE__Group__3__Impl rule__UE__Group__4 ;
    public final void rule__UE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3453:1: ( rule__UE__Group__3__Impl rule__UE__Group__4 )
            // InternalLangFil.g:3454:2: rule__UE__Group__3__Impl rule__UE__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__UE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group__4();

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
    // $ANTLR end "rule__UE__Group__3"


    // $ANTLR start "rule__UE__Group__3__Impl"
    // InternalLangFil.g:3461:1: rule__UE__Group__3__Impl : ( '{' ) ;
    public final void rule__UE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3465:1: ( ( '{' ) )
            // InternalLangFil.g:3466:1: ( '{' )
            {
            // InternalLangFil.g:3466:1: ( '{' )
            // InternalLangFil.g:3467:2: '{'
            {
             before(grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group__3__Impl"


    // $ANTLR start "rule__UE__Group__4"
    // InternalLangFil.g:3476:1: rule__UE__Group__4 : rule__UE__Group__4__Impl rule__UE__Group__5 ;
    public final void rule__UE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3480:1: ( rule__UE__Group__4__Impl rule__UE__Group__5 )
            // InternalLangFil.g:3481:2: rule__UE__Group__4__Impl rule__UE__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__UE__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group__5();

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
    // $ANTLR end "rule__UE__Group__4"


    // $ANTLR start "rule__UE__Group__4__Impl"
    // InternalLangFil.g:3488:1: rule__UE__Group__4__Impl : ( ( rule__UE__Group_4__0 )? ) ;
    public final void rule__UE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3492:1: ( ( ( rule__UE__Group_4__0 )? ) )
            // InternalLangFil.g:3493:1: ( ( rule__UE__Group_4__0 )? )
            {
            // InternalLangFil.g:3493:1: ( ( rule__UE__Group_4__0 )? )
            // InternalLangFil.g:3494:2: ( rule__UE__Group_4__0 )?
            {
             before(grammarAccess.getUEAccess().getGroup_4()); 
            // InternalLangFil.g:3495:2: ( rule__UE__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLangFil.g:3495:3: rule__UE__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UE__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUEAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group__4__Impl"


    // $ANTLR start "rule__UE__Group__5"
    // InternalLangFil.g:3503:1: rule__UE__Group__5 : rule__UE__Group__5__Impl rule__UE__Group__6 ;
    public final void rule__UE__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3507:1: ( rule__UE__Group__5__Impl rule__UE__Group__6 )
            // InternalLangFil.g:3508:2: rule__UE__Group__5__Impl rule__UE__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__UE__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group__6();

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
    // $ANTLR end "rule__UE__Group__5"


    // $ANTLR start "rule__UE__Group__5__Impl"
    // InternalLangFil.g:3515:1: rule__UE__Group__5__Impl : ( ( rule__UE__Group_5__0 )? ) ;
    public final void rule__UE__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3519:1: ( ( ( rule__UE__Group_5__0 )? ) )
            // InternalLangFil.g:3520:1: ( ( rule__UE__Group_5__0 )? )
            {
            // InternalLangFil.g:3520:1: ( ( rule__UE__Group_5__0 )? )
            // InternalLangFil.g:3521:2: ( rule__UE__Group_5__0 )?
            {
             before(grammarAccess.getUEAccess().getGroup_5()); 
            // InternalLangFil.g:3522:2: ( rule__UE__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLangFil.g:3522:3: rule__UE__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UE__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUEAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group__5__Impl"


    // $ANTLR start "rule__UE__Group__6"
    // InternalLangFil.g:3530:1: rule__UE__Group__6 : rule__UE__Group__6__Impl rule__UE__Group__7 ;
    public final void rule__UE__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3534:1: ( rule__UE__Group__6__Impl rule__UE__Group__7 )
            // InternalLangFil.g:3535:2: rule__UE__Group__6__Impl rule__UE__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__UE__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group__7();

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
    // $ANTLR end "rule__UE__Group__6"


    // $ANTLR start "rule__UE__Group__6__Impl"
    // InternalLangFil.g:3542:1: rule__UE__Group__6__Impl : ( ( rule__UE__Group_6__0 )? ) ;
    public final void rule__UE__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3546:1: ( ( ( rule__UE__Group_6__0 )? ) )
            // InternalLangFil.g:3547:1: ( ( rule__UE__Group_6__0 )? )
            {
            // InternalLangFil.g:3547:1: ( ( rule__UE__Group_6__0 )? )
            // InternalLangFil.g:3548:2: ( rule__UE__Group_6__0 )?
            {
             before(grammarAccess.getUEAccess().getGroup_6()); 
            // InternalLangFil.g:3549:2: ( rule__UE__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLangFil.g:3549:3: rule__UE__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UE__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUEAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group__6__Impl"


    // $ANTLR start "rule__UE__Group__7"
    // InternalLangFil.g:3557:1: rule__UE__Group__7 : rule__UE__Group__7__Impl rule__UE__Group__8 ;
    public final void rule__UE__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3561:1: ( rule__UE__Group__7__Impl rule__UE__Group__8 )
            // InternalLangFil.g:3562:2: rule__UE__Group__7__Impl rule__UE__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__UE__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group__8();

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
    // $ANTLR end "rule__UE__Group__7"


    // $ANTLR start "rule__UE__Group__7__Impl"
    // InternalLangFil.g:3569:1: rule__UE__Group__7__Impl : ( ( rule__UE__Group_7__0 )? ) ;
    public final void rule__UE__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3573:1: ( ( ( rule__UE__Group_7__0 )? ) )
            // InternalLangFil.g:3574:1: ( ( rule__UE__Group_7__0 )? )
            {
            // InternalLangFil.g:3574:1: ( ( rule__UE__Group_7__0 )? )
            // InternalLangFil.g:3575:2: ( rule__UE__Group_7__0 )?
            {
             before(grammarAccess.getUEAccess().getGroup_7()); 
            // InternalLangFil.g:3576:2: ( rule__UE__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLangFil.g:3576:3: rule__UE__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UE__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUEAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group__7__Impl"


    // $ANTLR start "rule__UE__Group__8"
    // InternalLangFil.g:3584:1: rule__UE__Group__8 : rule__UE__Group__8__Impl rule__UE__Group__9 ;
    public final void rule__UE__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3588:1: ( rule__UE__Group__8__Impl rule__UE__Group__9 )
            // InternalLangFil.g:3589:2: rule__UE__Group__8__Impl rule__UE__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__UE__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group__9();

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
    // $ANTLR end "rule__UE__Group__8"


    // $ANTLR start "rule__UE__Group__8__Impl"
    // InternalLangFil.g:3596:1: rule__UE__Group__8__Impl : ( ( rule__UE__Group_8__0 )? ) ;
    public final void rule__UE__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3600:1: ( ( ( rule__UE__Group_8__0 )? ) )
            // InternalLangFil.g:3601:1: ( ( rule__UE__Group_8__0 )? )
            {
            // InternalLangFil.g:3601:1: ( ( rule__UE__Group_8__0 )? )
            // InternalLangFil.g:3602:2: ( rule__UE__Group_8__0 )?
            {
             before(grammarAccess.getUEAccess().getGroup_8()); 
            // InternalLangFil.g:3603:2: ( rule__UE__Group_8__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLangFil.g:3603:3: rule__UE__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UE__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUEAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group__8__Impl"


    // $ANTLR start "rule__UE__Group__9"
    // InternalLangFil.g:3611:1: rule__UE__Group__9 : rule__UE__Group__9__Impl ;
    public final void rule__UE__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3615:1: ( rule__UE__Group__9__Impl )
            // InternalLangFil.g:3616:2: rule__UE__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UE__Group__9__Impl();

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
    // $ANTLR end "rule__UE__Group__9"


    // $ANTLR start "rule__UE__Group__9__Impl"
    // InternalLangFil.g:3622:1: rule__UE__Group__9__Impl : ( '}' ) ;
    public final void rule__UE__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3626:1: ( ( '}' ) )
            // InternalLangFil.g:3627:1: ( '}' )
            {
            // InternalLangFil.g:3627:1: ( '}' )
            // InternalLangFil.g:3628:2: '}'
            {
             before(grammarAccess.getUEAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group__9__Impl"


    // $ANTLR start "rule__UE__Group_4__0"
    // InternalLangFil.g:3638:1: rule__UE__Group_4__0 : rule__UE__Group_4__0__Impl rule__UE__Group_4__1 ;
    public final void rule__UE__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3642:1: ( rule__UE__Group_4__0__Impl rule__UE__Group_4__1 )
            // InternalLangFil.g:3643:2: rule__UE__Group_4__0__Impl rule__UE__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__UE__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_4__1();

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
    // $ANTLR end "rule__UE__Group_4__0"


    // $ANTLR start "rule__UE__Group_4__0__Impl"
    // InternalLangFil.g:3650:1: rule__UE__Group_4__0__Impl : ( 'pseudo' ) ;
    public final void rule__UE__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3654:1: ( ( 'pseudo' ) )
            // InternalLangFil.g:3655:1: ( 'pseudo' )
            {
            // InternalLangFil.g:3655:1: ( 'pseudo' )
            // InternalLangFil.g:3656:2: 'pseudo'
            {
             before(grammarAccess.getUEAccess().getPseudoKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getPseudoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_4__0__Impl"


    // $ANTLR start "rule__UE__Group_4__1"
    // InternalLangFil.g:3665:1: rule__UE__Group_4__1 : rule__UE__Group_4__1__Impl ;
    public final void rule__UE__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3669:1: ( rule__UE__Group_4__1__Impl )
            // InternalLangFil.g:3670:2: rule__UE__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UE__Group_4__1__Impl();

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
    // $ANTLR end "rule__UE__Group_4__1"


    // $ANTLR start "rule__UE__Group_4__1__Impl"
    // InternalLangFil.g:3676:1: rule__UE__Group_4__1__Impl : ( ( rule__UE__PseudoAssignment_4_1 ) ) ;
    public final void rule__UE__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3680:1: ( ( ( rule__UE__PseudoAssignment_4_1 ) ) )
            // InternalLangFil.g:3681:1: ( ( rule__UE__PseudoAssignment_4_1 ) )
            {
            // InternalLangFil.g:3681:1: ( ( rule__UE__PseudoAssignment_4_1 ) )
            // InternalLangFil.g:3682:2: ( rule__UE__PseudoAssignment_4_1 )
            {
             before(grammarAccess.getUEAccess().getPseudoAssignment_4_1()); 
            // InternalLangFil.g:3683:2: ( rule__UE__PseudoAssignment_4_1 )
            // InternalLangFil.g:3683:3: rule__UE__PseudoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__UE__PseudoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getUEAccess().getPseudoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_4__1__Impl"


    // $ANTLR start "rule__UE__Group_5__0"
    // InternalLangFil.g:3692:1: rule__UE__Group_5__0 : rule__UE__Group_5__0__Impl rule__UE__Group_5__1 ;
    public final void rule__UE__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3696:1: ( rule__UE__Group_5__0__Impl rule__UE__Group_5__1 )
            // InternalLangFil.g:3697:2: rule__UE__Group_5__0__Impl rule__UE__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__UE__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_5__1();

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
    // $ANTLR end "rule__UE__Group_5__0"


    // $ANTLR start "rule__UE__Group_5__0__Impl"
    // InternalLangFil.g:3704:1: rule__UE__Group_5__0__Impl : ( 'responsables' ) ;
    public final void rule__UE__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3708:1: ( ( 'responsables' ) )
            // InternalLangFil.g:3709:1: ( 'responsables' )
            {
            // InternalLangFil.g:3709:1: ( 'responsables' )
            // InternalLangFil.g:3710:2: 'responsables'
            {
             before(grammarAccess.getUEAccess().getResponsablesKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getResponsablesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_5__0__Impl"


    // $ANTLR start "rule__UE__Group_5__1"
    // InternalLangFil.g:3719:1: rule__UE__Group_5__1 : rule__UE__Group_5__1__Impl rule__UE__Group_5__2 ;
    public final void rule__UE__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3723:1: ( rule__UE__Group_5__1__Impl rule__UE__Group_5__2 )
            // InternalLangFil.g:3724:2: rule__UE__Group_5__1__Impl rule__UE__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__UE__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_5__2();

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
    // $ANTLR end "rule__UE__Group_5__1"


    // $ANTLR start "rule__UE__Group_5__1__Impl"
    // InternalLangFil.g:3731:1: rule__UE__Group_5__1__Impl : ( '(' ) ;
    public final void rule__UE__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3735:1: ( ( '(' ) )
            // InternalLangFil.g:3736:1: ( '(' )
            {
            // InternalLangFil.g:3736:1: ( '(' )
            // InternalLangFil.g:3737:2: '('
            {
             before(grammarAccess.getUEAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_5__1__Impl"


    // $ANTLR start "rule__UE__Group_5__2"
    // InternalLangFil.g:3746:1: rule__UE__Group_5__2 : rule__UE__Group_5__2__Impl rule__UE__Group_5__3 ;
    public final void rule__UE__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3750:1: ( rule__UE__Group_5__2__Impl rule__UE__Group_5__3 )
            // InternalLangFil.g:3751:2: rule__UE__Group_5__2__Impl rule__UE__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__UE__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_5__3();

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
    // $ANTLR end "rule__UE__Group_5__2"


    // $ANTLR start "rule__UE__Group_5__2__Impl"
    // InternalLangFil.g:3758:1: rule__UE__Group_5__2__Impl : ( ( rule__UE__ResponsablesAssignment_5_2 ) ) ;
    public final void rule__UE__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3762:1: ( ( ( rule__UE__ResponsablesAssignment_5_2 ) ) )
            // InternalLangFil.g:3763:1: ( ( rule__UE__ResponsablesAssignment_5_2 ) )
            {
            // InternalLangFil.g:3763:1: ( ( rule__UE__ResponsablesAssignment_5_2 ) )
            // InternalLangFil.g:3764:2: ( rule__UE__ResponsablesAssignment_5_2 )
            {
             before(grammarAccess.getUEAccess().getResponsablesAssignment_5_2()); 
            // InternalLangFil.g:3765:2: ( rule__UE__ResponsablesAssignment_5_2 )
            // InternalLangFil.g:3765:3: rule__UE__ResponsablesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__UE__ResponsablesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getUEAccess().getResponsablesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_5__2__Impl"


    // $ANTLR start "rule__UE__Group_5__3"
    // InternalLangFil.g:3773:1: rule__UE__Group_5__3 : rule__UE__Group_5__3__Impl rule__UE__Group_5__4 ;
    public final void rule__UE__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3777:1: ( rule__UE__Group_5__3__Impl rule__UE__Group_5__4 )
            // InternalLangFil.g:3778:2: rule__UE__Group_5__3__Impl rule__UE__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__UE__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_5__4();

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
    // $ANTLR end "rule__UE__Group_5__3"


    // $ANTLR start "rule__UE__Group_5__3__Impl"
    // InternalLangFil.g:3785:1: rule__UE__Group_5__3__Impl : ( ( rule__UE__Group_5_3__0 )* ) ;
    public final void rule__UE__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3789:1: ( ( ( rule__UE__Group_5_3__0 )* ) )
            // InternalLangFil.g:3790:1: ( ( rule__UE__Group_5_3__0 )* )
            {
            // InternalLangFil.g:3790:1: ( ( rule__UE__Group_5_3__0 )* )
            // InternalLangFil.g:3791:2: ( rule__UE__Group_5_3__0 )*
            {
             before(grammarAccess.getUEAccess().getGroup_5_3()); 
            // InternalLangFil.g:3792:2: ( rule__UE__Group_5_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalLangFil.g:3792:3: rule__UE__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__UE__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getUEAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_5__3__Impl"


    // $ANTLR start "rule__UE__Group_5__4"
    // InternalLangFil.g:3800:1: rule__UE__Group_5__4 : rule__UE__Group_5__4__Impl ;
    public final void rule__UE__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3804:1: ( rule__UE__Group_5__4__Impl )
            // InternalLangFil.g:3805:2: rule__UE__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UE__Group_5__4__Impl();

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
    // $ANTLR end "rule__UE__Group_5__4"


    // $ANTLR start "rule__UE__Group_5__4__Impl"
    // InternalLangFil.g:3811:1: rule__UE__Group_5__4__Impl : ( ')' ) ;
    public final void rule__UE__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3815:1: ( ( ')' ) )
            // InternalLangFil.g:3816:1: ( ')' )
            {
            // InternalLangFil.g:3816:1: ( ')' )
            // InternalLangFil.g:3817:2: ')'
            {
             before(grammarAccess.getUEAccess().getRightParenthesisKeyword_5_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_5__4__Impl"


    // $ANTLR start "rule__UE__Group_5_3__0"
    // InternalLangFil.g:3827:1: rule__UE__Group_5_3__0 : rule__UE__Group_5_3__0__Impl rule__UE__Group_5_3__1 ;
    public final void rule__UE__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3831:1: ( rule__UE__Group_5_3__0__Impl rule__UE__Group_5_3__1 )
            // InternalLangFil.g:3832:2: rule__UE__Group_5_3__0__Impl rule__UE__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__UE__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_5_3__1();

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
    // $ANTLR end "rule__UE__Group_5_3__0"


    // $ANTLR start "rule__UE__Group_5_3__0__Impl"
    // InternalLangFil.g:3839:1: rule__UE__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__UE__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3843:1: ( ( ',' ) )
            // InternalLangFil.g:3844:1: ( ',' )
            {
            // InternalLangFil.g:3844:1: ( ',' )
            // InternalLangFil.g:3845:2: ','
            {
             before(grammarAccess.getUEAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_5_3__0__Impl"


    // $ANTLR start "rule__UE__Group_5_3__1"
    // InternalLangFil.g:3854:1: rule__UE__Group_5_3__1 : rule__UE__Group_5_3__1__Impl ;
    public final void rule__UE__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3858:1: ( rule__UE__Group_5_3__1__Impl )
            // InternalLangFil.g:3859:2: rule__UE__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UE__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__UE__Group_5_3__1"


    // $ANTLR start "rule__UE__Group_5_3__1__Impl"
    // InternalLangFil.g:3865:1: rule__UE__Group_5_3__1__Impl : ( ( rule__UE__ResponsablesAssignment_5_3_1 ) ) ;
    public final void rule__UE__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3869:1: ( ( ( rule__UE__ResponsablesAssignment_5_3_1 ) ) )
            // InternalLangFil.g:3870:1: ( ( rule__UE__ResponsablesAssignment_5_3_1 ) )
            {
            // InternalLangFil.g:3870:1: ( ( rule__UE__ResponsablesAssignment_5_3_1 ) )
            // InternalLangFil.g:3871:2: ( rule__UE__ResponsablesAssignment_5_3_1 )
            {
             before(grammarAccess.getUEAccess().getResponsablesAssignment_5_3_1()); 
            // InternalLangFil.g:3872:2: ( rule__UE__ResponsablesAssignment_5_3_1 )
            // InternalLangFil.g:3872:3: rule__UE__ResponsablesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UE__ResponsablesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUEAccess().getResponsablesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_5_3__1__Impl"


    // $ANTLR start "rule__UE__Group_6__0"
    // InternalLangFil.g:3881:1: rule__UE__Group_6__0 : rule__UE__Group_6__0__Impl rule__UE__Group_6__1 ;
    public final void rule__UE__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3885:1: ( rule__UE__Group_6__0__Impl rule__UE__Group_6__1 )
            // InternalLangFil.g:3886:2: rule__UE__Group_6__0__Impl rule__UE__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__UE__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_6__1();

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
    // $ANTLR end "rule__UE__Group_6__0"


    // $ANTLR start "rule__UE__Group_6__0__Impl"
    // InternalLangFil.g:3893:1: rule__UE__Group_6__0__Impl : ( 'enseignants' ) ;
    public final void rule__UE__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3897:1: ( ( 'enseignants' ) )
            // InternalLangFil.g:3898:1: ( 'enseignants' )
            {
            // InternalLangFil.g:3898:1: ( 'enseignants' )
            // InternalLangFil.g:3899:2: 'enseignants'
            {
             before(grammarAccess.getUEAccess().getEnseignantsKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getEnseignantsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_6__0__Impl"


    // $ANTLR start "rule__UE__Group_6__1"
    // InternalLangFil.g:3908:1: rule__UE__Group_6__1 : rule__UE__Group_6__1__Impl rule__UE__Group_6__2 ;
    public final void rule__UE__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3912:1: ( rule__UE__Group_6__1__Impl rule__UE__Group_6__2 )
            // InternalLangFil.g:3913:2: rule__UE__Group_6__1__Impl rule__UE__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__UE__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_6__2();

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
    // $ANTLR end "rule__UE__Group_6__1"


    // $ANTLR start "rule__UE__Group_6__1__Impl"
    // InternalLangFil.g:3920:1: rule__UE__Group_6__1__Impl : ( '(' ) ;
    public final void rule__UE__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3924:1: ( ( '(' ) )
            // InternalLangFil.g:3925:1: ( '(' )
            {
            // InternalLangFil.g:3925:1: ( '(' )
            // InternalLangFil.g:3926:2: '('
            {
             before(grammarAccess.getUEAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_6__1__Impl"


    // $ANTLR start "rule__UE__Group_6__2"
    // InternalLangFil.g:3935:1: rule__UE__Group_6__2 : rule__UE__Group_6__2__Impl rule__UE__Group_6__3 ;
    public final void rule__UE__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3939:1: ( rule__UE__Group_6__2__Impl rule__UE__Group_6__3 )
            // InternalLangFil.g:3940:2: rule__UE__Group_6__2__Impl rule__UE__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__UE__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_6__3();

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
    // $ANTLR end "rule__UE__Group_6__2"


    // $ANTLR start "rule__UE__Group_6__2__Impl"
    // InternalLangFil.g:3947:1: rule__UE__Group_6__2__Impl : ( ( rule__UE__EnseignantsAssignment_6_2 ) ) ;
    public final void rule__UE__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3951:1: ( ( ( rule__UE__EnseignantsAssignment_6_2 ) ) )
            // InternalLangFil.g:3952:1: ( ( rule__UE__EnseignantsAssignment_6_2 ) )
            {
            // InternalLangFil.g:3952:1: ( ( rule__UE__EnseignantsAssignment_6_2 ) )
            // InternalLangFil.g:3953:2: ( rule__UE__EnseignantsAssignment_6_2 )
            {
             before(grammarAccess.getUEAccess().getEnseignantsAssignment_6_2()); 
            // InternalLangFil.g:3954:2: ( rule__UE__EnseignantsAssignment_6_2 )
            // InternalLangFil.g:3954:3: rule__UE__EnseignantsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__UE__EnseignantsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getUEAccess().getEnseignantsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_6__2__Impl"


    // $ANTLR start "rule__UE__Group_6__3"
    // InternalLangFil.g:3962:1: rule__UE__Group_6__3 : rule__UE__Group_6__3__Impl rule__UE__Group_6__4 ;
    public final void rule__UE__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3966:1: ( rule__UE__Group_6__3__Impl rule__UE__Group_6__4 )
            // InternalLangFil.g:3967:2: rule__UE__Group_6__3__Impl rule__UE__Group_6__4
            {
            pushFollow(FOLLOW_13);
            rule__UE__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_6__4();

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
    // $ANTLR end "rule__UE__Group_6__3"


    // $ANTLR start "rule__UE__Group_6__3__Impl"
    // InternalLangFil.g:3974:1: rule__UE__Group_6__3__Impl : ( ( rule__UE__Group_6_3__0 )* ) ;
    public final void rule__UE__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3978:1: ( ( ( rule__UE__Group_6_3__0 )* ) )
            // InternalLangFil.g:3979:1: ( ( rule__UE__Group_6_3__0 )* )
            {
            // InternalLangFil.g:3979:1: ( ( rule__UE__Group_6_3__0 )* )
            // InternalLangFil.g:3980:2: ( rule__UE__Group_6_3__0 )*
            {
             before(grammarAccess.getUEAccess().getGroup_6_3()); 
            // InternalLangFil.g:3981:2: ( rule__UE__Group_6_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalLangFil.g:3981:3: rule__UE__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__UE__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getUEAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_6__3__Impl"


    // $ANTLR start "rule__UE__Group_6__4"
    // InternalLangFil.g:3989:1: rule__UE__Group_6__4 : rule__UE__Group_6__4__Impl ;
    public final void rule__UE__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:3993:1: ( rule__UE__Group_6__4__Impl )
            // InternalLangFil.g:3994:2: rule__UE__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UE__Group_6__4__Impl();

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
    // $ANTLR end "rule__UE__Group_6__4"


    // $ANTLR start "rule__UE__Group_6__4__Impl"
    // InternalLangFil.g:4000:1: rule__UE__Group_6__4__Impl : ( ')' ) ;
    public final void rule__UE__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4004:1: ( ( ')' ) )
            // InternalLangFil.g:4005:1: ( ')' )
            {
            // InternalLangFil.g:4005:1: ( ')' )
            // InternalLangFil.g:4006:2: ')'
            {
             before(grammarAccess.getUEAccess().getRightParenthesisKeyword_6_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_6__4__Impl"


    // $ANTLR start "rule__UE__Group_6_3__0"
    // InternalLangFil.g:4016:1: rule__UE__Group_6_3__0 : rule__UE__Group_6_3__0__Impl rule__UE__Group_6_3__1 ;
    public final void rule__UE__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4020:1: ( rule__UE__Group_6_3__0__Impl rule__UE__Group_6_3__1 )
            // InternalLangFil.g:4021:2: rule__UE__Group_6_3__0__Impl rule__UE__Group_6_3__1
            {
            pushFollow(FOLLOW_4);
            rule__UE__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_6_3__1();

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
    // $ANTLR end "rule__UE__Group_6_3__0"


    // $ANTLR start "rule__UE__Group_6_3__0__Impl"
    // InternalLangFil.g:4028:1: rule__UE__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__UE__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4032:1: ( ( ',' ) )
            // InternalLangFil.g:4033:1: ( ',' )
            {
            // InternalLangFil.g:4033:1: ( ',' )
            // InternalLangFil.g:4034:2: ','
            {
             before(grammarAccess.getUEAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_6_3__0__Impl"


    // $ANTLR start "rule__UE__Group_6_3__1"
    // InternalLangFil.g:4043:1: rule__UE__Group_6_3__1 : rule__UE__Group_6_3__1__Impl ;
    public final void rule__UE__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4047:1: ( rule__UE__Group_6_3__1__Impl )
            // InternalLangFil.g:4048:2: rule__UE__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UE__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__UE__Group_6_3__1"


    // $ANTLR start "rule__UE__Group_6_3__1__Impl"
    // InternalLangFil.g:4054:1: rule__UE__Group_6_3__1__Impl : ( ( rule__UE__EnseignantsAssignment_6_3_1 ) ) ;
    public final void rule__UE__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4058:1: ( ( ( rule__UE__EnseignantsAssignment_6_3_1 ) ) )
            // InternalLangFil.g:4059:1: ( ( rule__UE__EnseignantsAssignment_6_3_1 ) )
            {
            // InternalLangFil.g:4059:1: ( ( rule__UE__EnseignantsAssignment_6_3_1 ) )
            // InternalLangFil.g:4060:2: ( rule__UE__EnseignantsAssignment_6_3_1 )
            {
             before(grammarAccess.getUEAccess().getEnseignantsAssignment_6_3_1()); 
            // InternalLangFil.g:4061:2: ( rule__UE__EnseignantsAssignment_6_3_1 )
            // InternalLangFil.g:4061:3: rule__UE__EnseignantsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UE__EnseignantsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUEAccess().getEnseignantsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_6_3__1__Impl"


    // $ANTLR start "rule__UE__Group_7__0"
    // InternalLangFil.g:4070:1: rule__UE__Group_7__0 : rule__UE__Group_7__0__Impl rule__UE__Group_7__1 ;
    public final void rule__UE__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4074:1: ( rule__UE__Group_7__0__Impl rule__UE__Group_7__1 )
            // InternalLangFil.g:4075:2: rule__UE__Group_7__0__Impl rule__UE__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__UE__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_7__1();

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
    // $ANTLR end "rule__UE__Group_7__0"


    // $ANTLR start "rule__UE__Group_7__0__Impl"
    // InternalLangFil.g:4082:1: rule__UE__Group_7__0__Impl : ( 'documents' ) ;
    public final void rule__UE__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4086:1: ( ( 'documents' ) )
            // InternalLangFil.g:4087:1: ( 'documents' )
            {
            // InternalLangFil.g:4087:1: ( 'documents' )
            // InternalLangFil.g:4088:2: 'documents'
            {
             before(grammarAccess.getUEAccess().getDocumentsKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getDocumentsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_7__0__Impl"


    // $ANTLR start "rule__UE__Group_7__1"
    // InternalLangFil.g:4097:1: rule__UE__Group_7__1 : rule__UE__Group_7__1__Impl rule__UE__Group_7__2 ;
    public final void rule__UE__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4101:1: ( rule__UE__Group_7__1__Impl rule__UE__Group_7__2 )
            // InternalLangFil.g:4102:2: rule__UE__Group_7__1__Impl rule__UE__Group_7__2
            {
            pushFollow(FOLLOW_23);
            rule__UE__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_7__2();

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
    // $ANTLR end "rule__UE__Group_7__1"


    // $ANTLR start "rule__UE__Group_7__1__Impl"
    // InternalLangFil.g:4109:1: rule__UE__Group_7__1__Impl : ( '{' ) ;
    public final void rule__UE__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4113:1: ( ( '{' ) )
            // InternalLangFil.g:4114:1: ( '{' )
            {
            // InternalLangFil.g:4114:1: ( '{' )
            // InternalLangFil.g:4115:2: '{'
            {
             before(grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_7__1__Impl"


    // $ANTLR start "rule__UE__Group_7__2"
    // InternalLangFil.g:4124:1: rule__UE__Group_7__2 : rule__UE__Group_7__2__Impl rule__UE__Group_7__3 ;
    public final void rule__UE__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4128:1: ( rule__UE__Group_7__2__Impl rule__UE__Group_7__3 )
            // InternalLangFil.g:4129:2: rule__UE__Group_7__2__Impl rule__UE__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__UE__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_7__3();

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
    // $ANTLR end "rule__UE__Group_7__2"


    // $ANTLR start "rule__UE__Group_7__2__Impl"
    // InternalLangFil.g:4136:1: rule__UE__Group_7__2__Impl : ( ( rule__UE__DocumentsAssignment_7_2 ) ) ;
    public final void rule__UE__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4140:1: ( ( ( rule__UE__DocumentsAssignment_7_2 ) ) )
            // InternalLangFil.g:4141:1: ( ( rule__UE__DocumentsAssignment_7_2 ) )
            {
            // InternalLangFil.g:4141:1: ( ( rule__UE__DocumentsAssignment_7_2 ) )
            // InternalLangFil.g:4142:2: ( rule__UE__DocumentsAssignment_7_2 )
            {
             before(grammarAccess.getUEAccess().getDocumentsAssignment_7_2()); 
            // InternalLangFil.g:4143:2: ( rule__UE__DocumentsAssignment_7_2 )
            // InternalLangFil.g:4143:3: rule__UE__DocumentsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__UE__DocumentsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getUEAccess().getDocumentsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_7__2__Impl"


    // $ANTLR start "rule__UE__Group_7__3"
    // InternalLangFil.g:4151:1: rule__UE__Group_7__3 : rule__UE__Group_7__3__Impl rule__UE__Group_7__4 ;
    public final void rule__UE__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4155:1: ( rule__UE__Group_7__3__Impl rule__UE__Group_7__4 )
            // InternalLangFil.g:4156:2: rule__UE__Group_7__3__Impl rule__UE__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__UE__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_7__4();

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
    // $ANTLR end "rule__UE__Group_7__3"


    // $ANTLR start "rule__UE__Group_7__3__Impl"
    // InternalLangFil.g:4163:1: rule__UE__Group_7__3__Impl : ( ( rule__UE__Group_7_3__0 )* ) ;
    public final void rule__UE__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4167:1: ( ( ( rule__UE__Group_7_3__0 )* ) )
            // InternalLangFil.g:4168:1: ( ( rule__UE__Group_7_3__0 )* )
            {
            // InternalLangFil.g:4168:1: ( ( rule__UE__Group_7_3__0 )* )
            // InternalLangFil.g:4169:2: ( rule__UE__Group_7_3__0 )*
            {
             before(grammarAccess.getUEAccess().getGroup_7_3()); 
            // InternalLangFil.g:4170:2: ( rule__UE__Group_7_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==15) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalLangFil.g:4170:3: rule__UE__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__UE__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getUEAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_7__3__Impl"


    // $ANTLR start "rule__UE__Group_7__4"
    // InternalLangFil.g:4178:1: rule__UE__Group_7__4 : rule__UE__Group_7__4__Impl ;
    public final void rule__UE__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4182:1: ( rule__UE__Group_7__4__Impl )
            // InternalLangFil.g:4183:2: rule__UE__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UE__Group_7__4__Impl();

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
    // $ANTLR end "rule__UE__Group_7__4"


    // $ANTLR start "rule__UE__Group_7__4__Impl"
    // InternalLangFil.g:4189:1: rule__UE__Group_7__4__Impl : ( '}' ) ;
    public final void rule__UE__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4193:1: ( ( '}' ) )
            // InternalLangFil.g:4194:1: ( '}' )
            {
            // InternalLangFil.g:4194:1: ( '}' )
            // InternalLangFil.g:4195:2: '}'
            {
             before(grammarAccess.getUEAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_7__4__Impl"


    // $ANTLR start "rule__UE__Group_7_3__0"
    // InternalLangFil.g:4205:1: rule__UE__Group_7_3__0 : rule__UE__Group_7_3__0__Impl rule__UE__Group_7_3__1 ;
    public final void rule__UE__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4209:1: ( rule__UE__Group_7_3__0__Impl rule__UE__Group_7_3__1 )
            // InternalLangFil.g:4210:2: rule__UE__Group_7_3__0__Impl rule__UE__Group_7_3__1
            {
            pushFollow(FOLLOW_23);
            rule__UE__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_7_3__1();

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
    // $ANTLR end "rule__UE__Group_7_3__0"


    // $ANTLR start "rule__UE__Group_7_3__0__Impl"
    // InternalLangFil.g:4217:1: rule__UE__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__UE__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4221:1: ( ( ',' ) )
            // InternalLangFil.g:4222:1: ( ',' )
            {
            // InternalLangFil.g:4222:1: ( ',' )
            // InternalLangFil.g:4223:2: ','
            {
             before(grammarAccess.getUEAccess().getCommaKeyword_7_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_7_3__0__Impl"


    // $ANTLR start "rule__UE__Group_7_3__1"
    // InternalLangFil.g:4232:1: rule__UE__Group_7_3__1 : rule__UE__Group_7_3__1__Impl ;
    public final void rule__UE__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4236:1: ( rule__UE__Group_7_3__1__Impl )
            // InternalLangFil.g:4237:2: rule__UE__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UE__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__UE__Group_7_3__1"


    // $ANTLR start "rule__UE__Group_7_3__1__Impl"
    // InternalLangFil.g:4243:1: rule__UE__Group_7_3__1__Impl : ( ( rule__UE__DocumentsAssignment_7_3_1 ) ) ;
    public final void rule__UE__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4247:1: ( ( ( rule__UE__DocumentsAssignment_7_3_1 ) ) )
            // InternalLangFil.g:4248:1: ( ( rule__UE__DocumentsAssignment_7_3_1 ) )
            {
            // InternalLangFil.g:4248:1: ( ( rule__UE__DocumentsAssignment_7_3_1 ) )
            // InternalLangFil.g:4249:2: ( rule__UE__DocumentsAssignment_7_3_1 )
            {
             before(grammarAccess.getUEAccess().getDocumentsAssignment_7_3_1()); 
            // InternalLangFil.g:4250:2: ( rule__UE__DocumentsAssignment_7_3_1 )
            // InternalLangFil.g:4250:3: rule__UE__DocumentsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UE__DocumentsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUEAccess().getDocumentsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_7_3__1__Impl"


    // $ANTLR start "rule__UE__Group_8__0"
    // InternalLangFil.g:4259:1: rule__UE__Group_8__0 : rule__UE__Group_8__0__Impl rule__UE__Group_8__1 ;
    public final void rule__UE__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4263:1: ( rule__UE__Group_8__0__Impl rule__UE__Group_8__1 )
            // InternalLangFil.g:4264:2: rule__UE__Group_8__0__Impl rule__UE__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__UE__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UE__Group_8__1();

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
    // $ANTLR end "rule__UE__Group_8__0"


    // $ANTLR start "rule__UE__Group_8__0__Impl"
    // InternalLangFil.g:4271:1: rule__UE__Group_8__0__Impl : ( 'presentation' ) ;
    public final void rule__UE__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4275:1: ( ( 'presentation' ) )
            // InternalLangFil.g:4276:1: ( 'presentation' )
            {
            // InternalLangFil.g:4276:1: ( 'presentation' )
            // InternalLangFil.g:4277:2: 'presentation'
            {
             before(grammarAccess.getUEAccess().getPresentationKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUEAccess().getPresentationKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_8__0__Impl"


    // $ANTLR start "rule__UE__Group_8__1"
    // InternalLangFil.g:4286:1: rule__UE__Group_8__1 : rule__UE__Group_8__1__Impl ;
    public final void rule__UE__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4290:1: ( rule__UE__Group_8__1__Impl )
            // InternalLangFil.g:4291:2: rule__UE__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UE__Group_8__1__Impl();

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
    // $ANTLR end "rule__UE__Group_8__1"


    // $ANTLR start "rule__UE__Group_8__1__Impl"
    // InternalLangFil.g:4297:1: rule__UE__Group_8__1__Impl : ( ( rule__UE__PresentationAssignment_8_1 ) ) ;
    public final void rule__UE__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4301:1: ( ( ( rule__UE__PresentationAssignment_8_1 ) ) )
            // InternalLangFil.g:4302:1: ( ( rule__UE__PresentationAssignment_8_1 ) )
            {
            // InternalLangFil.g:4302:1: ( ( rule__UE__PresentationAssignment_8_1 ) )
            // InternalLangFil.g:4303:2: ( rule__UE__PresentationAssignment_8_1 )
            {
             before(grammarAccess.getUEAccess().getPresentationAssignment_8_1()); 
            // InternalLangFil.g:4304:2: ( rule__UE__PresentationAssignment_8_1 )
            // InternalLangFil.g:4304:3: rule__UE__PresentationAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__UE__PresentationAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getUEAccess().getPresentationAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__Group_8__1__Impl"


    // $ANTLR start "rule__S1__Group__0"
    // InternalLangFil.g:4313:1: rule__S1__Group__0 : rule__S1__Group__0__Impl rule__S1__Group__1 ;
    public final void rule__S1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4317:1: ( rule__S1__Group__0__Impl rule__S1__Group__1 )
            // InternalLangFil.g:4318:2: rule__S1__Group__0__Impl rule__S1__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__S1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group__1();

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
    // $ANTLR end "rule__S1__Group__0"


    // $ANTLR start "rule__S1__Group__0__Impl"
    // InternalLangFil.g:4325:1: rule__S1__Group__0__Impl : ( () ) ;
    public final void rule__S1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4329:1: ( ( () ) )
            // InternalLangFil.g:4330:1: ( () )
            {
            // InternalLangFil.g:4330:1: ( () )
            // InternalLangFil.g:4331:2: ()
            {
             before(grammarAccess.getS1Access().getS1Action_0()); 
            // InternalLangFil.g:4332:2: ()
            // InternalLangFil.g:4332:3: 
            {
            }

             after(grammarAccess.getS1Access().getS1Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group__0__Impl"


    // $ANTLR start "rule__S1__Group__1"
    // InternalLangFil.g:4340:1: rule__S1__Group__1 : rule__S1__Group__1__Impl rule__S1__Group__2 ;
    public final void rule__S1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4344:1: ( rule__S1__Group__1__Impl rule__S1__Group__2 )
            // InternalLangFil.g:4345:2: rule__S1__Group__1__Impl rule__S1__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__S1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group__2();

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
    // $ANTLR end "rule__S1__Group__1"


    // $ANTLR start "rule__S1__Group__1__Impl"
    // InternalLangFil.g:4352:1: rule__S1__Group__1__Impl : ( 'S1' ) ;
    public final void rule__S1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4356:1: ( ( 'S1' ) )
            // InternalLangFil.g:4357:1: ( 'S1' )
            {
            // InternalLangFil.g:4357:1: ( 'S1' )
            // InternalLangFil.g:4358:2: 'S1'
            {
             before(grammarAccess.getS1Access().getS1Keyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getS1Access().getS1Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group__1__Impl"


    // $ANTLR start "rule__S1__Group__2"
    // InternalLangFil.g:4367:1: rule__S1__Group__2 : rule__S1__Group__2__Impl rule__S1__Group__3 ;
    public final void rule__S1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4371:1: ( rule__S1__Group__2__Impl rule__S1__Group__3 )
            // InternalLangFil.g:4372:2: rule__S1__Group__2__Impl rule__S1__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__S1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group__3();

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
    // $ANTLR end "rule__S1__Group__2"


    // $ANTLR start "rule__S1__Group__2__Impl"
    // InternalLangFil.g:4379:1: rule__S1__Group__2__Impl : ( '{' ) ;
    public final void rule__S1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4383:1: ( ( '{' ) )
            // InternalLangFil.g:4384:1: ( '{' )
            {
            // InternalLangFil.g:4384:1: ( '{' )
            // InternalLangFil.g:4385:2: '{'
            {
             before(grammarAccess.getS1Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getS1Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group__2__Impl"


    // $ANTLR start "rule__S1__Group__3"
    // InternalLangFil.g:4394:1: rule__S1__Group__3 : rule__S1__Group__3__Impl rule__S1__Group__4 ;
    public final void rule__S1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4398:1: ( rule__S1__Group__3__Impl rule__S1__Group__4 )
            // InternalLangFil.g:4399:2: rule__S1__Group__3__Impl rule__S1__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__S1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group__4();

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
    // $ANTLR end "rule__S1__Group__3"


    // $ANTLR start "rule__S1__Group__3__Impl"
    // InternalLangFil.g:4406:1: rule__S1__Group__3__Impl : ( ( rule__S1__Group_3__0 )? ) ;
    public final void rule__S1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4410:1: ( ( ( rule__S1__Group_3__0 )? ) )
            // InternalLangFil.g:4411:1: ( ( rule__S1__Group_3__0 )? )
            {
            // InternalLangFil.g:4411:1: ( ( rule__S1__Group_3__0 )? )
            // InternalLangFil.g:4412:2: ( rule__S1__Group_3__0 )?
            {
             before(grammarAccess.getS1Access().getGroup_3()); 
            // InternalLangFil.g:4413:2: ( rule__S1__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalLangFil.g:4413:3: rule__S1__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__S1__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getS1Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group__3__Impl"


    // $ANTLR start "rule__S1__Group__4"
    // InternalLangFil.g:4421:1: rule__S1__Group__4 : rule__S1__Group__4__Impl rule__S1__Group__5 ;
    public final void rule__S1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4425:1: ( rule__S1__Group__4__Impl rule__S1__Group__5 )
            // InternalLangFil.g:4426:2: rule__S1__Group__4__Impl rule__S1__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__S1__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group__5();

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
    // $ANTLR end "rule__S1__Group__4"


    // $ANTLR start "rule__S1__Group__4__Impl"
    // InternalLangFil.g:4433:1: rule__S1__Group__4__Impl : ( ( rule__S1__Group_4__0 )? ) ;
    public final void rule__S1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4437:1: ( ( ( rule__S1__Group_4__0 )? ) )
            // InternalLangFil.g:4438:1: ( ( rule__S1__Group_4__0 )? )
            {
            // InternalLangFil.g:4438:1: ( ( rule__S1__Group_4__0 )? )
            // InternalLangFil.g:4439:2: ( rule__S1__Group_4__0 )?
            {
             before(grammarAccess.getS1Access().getGroup_4()); 
            // InternalLangFil.g:4440:2: ( rule__S1__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLangFil.g:4440:3: rule__S1__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__S1__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getS1Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group__4__Impl"


    // $ANTLR start "rule__S1__Group__5"
    // InternalLangFil.g:4448:1: rule__S1__Group__5 : rule__S1__Group__5__Impl ;
    public final void rule__S1__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4452:1: ( rule__S1__Group__5__Impl )
            // InternalLangFil.g:4453:2: rule__S1__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S1__Group__5__Impl();

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
    // $ANTLR end "rule__S1__Group__5"


    // $ANTLR start "rule__S1__Group__5__Impl"
    // InternalLangFil.g:4459:1: rule__S1__Group__5__Impl : ( '}' ) ;
    public final void rule__S1__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4463:1: ( ( '}' ) )
            // InternalLangFil.g:4464:1: ( '}' )
            {
            // InternalLangFil.g:4464:1: ( '}' )
            // InternalLangFil.g:4465:2: '}'
            {
             before(grammarAccess.getS1Access().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getS1Access().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group__5__Impl"


    // $ANTLR start "rule__S1__Group_3__0"
    // InternalLangFil.g:4475:1: rule__S1__Group_3__0 : rule__S1__Group_3__0__Impl rule__S1__Group_3__1 ;
    public final void rule__S1__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4479:1: ( rule__S1__Group_3__0__Impl rule__S1__Group_3__1 )
            // InternalLangFil.g:4480:2: rule__S1__Group_3__0__Impl rule__S1__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__S1__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group_3__1();

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
    // $ANTLR end "rule__S1__Group_3__0"


    // $ANTLR start "rule__S1__Group_3__0__Impl"
    // InternalLangFil.g:4487:1: rule__S1__Group_3__0__Impl : ( 'uesoptionnelles' ) ;
    public final void rule__S1__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4491:1: ( ( 'uesoptionnelles' ) )
            // InternalLangFil.g:4492:1: ( 'uesoptionnelles' )
            {
            // InternalLangFil.g:4492:1: ( 'uesoptionnelles' )
            // InternalLangFil.g:4493:2: 'uesoptionnelles'
            {
             before(grammarAccess.getS1Access().getUesoptionnellesKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getS1Access().getUesoptionnellesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_3__0__Impl"


    // $ANTLR start "rule__S1__Group_3__1"
    // InternalLangFil.g:4502:1: rule__S1__Group_3__1 : rule__S1__Group_3__1__Impl rule__S1__Group_3__2 ;
    public final void rule__S1__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4506:1: ( rule__S1__Group_3__1__Impl rule__S1__Group_3__2 )
            // InternalLangFil.g:4507:2: rule__S1__Group_3__1__Impl rule__S1__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__S1__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group_3__2();

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
    // $ANTLR end "rule__S1__Group_3__1"


    // $ANTLR start "rule__S1__Group_3__1__Impl"
    // InternalLangFil.g:4514:1: rule__S1__Group_3__1__Impl : ( '(' ) ;
    public final void rule__S1__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4518:1: ( ( '(' ) )
            // InternalLangFil.g:4519:1: ( '(' )
            {
            // InternalLangFil.g:4519:1: ( '(' )
            // InternalLangFil.g:4520:2: '('
            {
             before(grammarAccess.getS1Access().getLeftParenthesisKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getS1Access().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_3__1__Impl"


    // $ANTLR start "rule__S1__Group_3__2"
    // InternalLangFil.g:4529:1: rule__S1__Group_3__2 : rule__S1__Group_3__2__Impl rule__S1__Group_3__3 ;
    public final void rule__S1__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4533:1: ( rule__S1__Group_3__2__Impl rule__S1__Group_3__3 )
            // InternalLangFil.g:4534:2: rule__S1__Group_3__2__Impl rule__S1__Group_3__3
            {
            pushFollow(FOLLOW_13);
            rule__S1__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group_3__3();

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
    // $ANTLR end "rule__S1__Group_3__2"


    // $ANTLR start "rule__S1__Group_3__2__Impl"
    // InternalLangFil.g:4541:1: rule__S1__Group_3__2__Impl : ( ( rule__S1__UesoptionnellesAssignment_3_2 ) ) ;
    public final void rule__S1__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4545:1: ( ( ( rule__S1__UesoptionnellesAssignment_3_2 ) ) )
            // InternalLangFil.g:4546:1: ( ( rule__S1__UesoptionnellesAssignment_3_2 ) )
            {
            // InternalLangFil.g:4546:1: ( ( rule__S1__UesoptionnellesAssignment_3_2 ) )
            // InternalLangFil.g:4547:2: ( rule__S1__UesoptionnellesAssignment_3_2 )
            {
             before(grammarAccess.getS1Access().getUesoptionnellesAssignment_3_2()); 
            // InternalLangFil.g:4548:2: ( rule__S1__UesoptionnellesAssignment_3_2 )
            // InternalLangFil.g:4548:3: rule__S1__UesoptionnellesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__S1__UesoptionnellesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getS1Access().getUesoptionnellesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_3__2__Impl"


    // $ANTLR start "rule__S1__Group_3__3"
    // InternalLangFil.g:4556:1: rule__S1__Group_3__3 : rule__S1__Group_3__3__Impl rule__S1__Group_3__4 ;
    public final void rule__S1__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4560:1: ( rule__S1__Group_3__3__Impl rule__S1__Group_3__4 )
            // InternalLangFil.g:4561:2: rule__S1__Group_3__3__Impl rule__S1__Group_3__4
            {
            pushFollow(FOLLOW_13);
            rule__S1__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group_3__4();

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
    // $ANTLR end "rule__S1__Group_3__3"


    // $ANTLR start "rule__S1__Group_3__3__Impl"
    // InternalLangFil.g:4568:1: rule__S1__Group_3__3__Impl : ( ( rule__S1__Group_3_3__0 )* ) ;
    public final void rule__S1__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4572:1: ( ( ( rule__S1__Group_3_3__0 )* ) )
            // InternalLangFil.g:4573:1: ( ( rule__S1__Group_3_3__0 )* )
            {
            // InternalLangFil.g:4573:1: ( ( rule__S1__Group_3_3__0 )* )
            // InternalLangFil.g:4574:2: ( rule__S1__Group_3_3__0 )*
            {
             before(grammarAccess.getS1Access().getGroup_3_3()); 
            // InternalLangFil.g:4575:2: ( rule__S1__Group_3_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==15) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalLangFil.g:4575:3: rule__S1__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__S1__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getS1Access().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_3__3__Impl"


    // $ANTLR start "rule__S1__Group_3__4"
    // InternalLangFil.g:4583:1: rule__S1__Group_3__4 : rule__S1__Group_3__4__Impl ;
    public final void rule__S1__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4587:1: ( rule__S1__Group_3__4__Impl )
            // InternalLangFil.g:4588:2: rule__S1__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S1__Group_3__4__Impl();

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
    // $ANTLR end "rule__S1__Group_3__4"


    // $ANTLR start "rule__S1__Group_3__4__Impl"
    // InternalLangFil.g:4594:1: rule__S1__Group_3__4__Impl : ( ')' ) ;
    public final void rule__S1__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4598:1: ( ( ')' ) )
            // InternalLangFil.g:4599:1: ( ')' )
            {
            // InternalLangFil.g:4599:1: ( ')' )
            // InternalLangFil.g:4600:2: ')'
            {
             before(grammarAccess.getS1Access().getRightParenthesisKeyword_3_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getS1Access().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_3__4__Impl"


    // $ANTLR start "rule__S1__Group_3_3__0"
    // InternalLangFil.g:4610:1: rule__S1__Group_3_3__0 : rule__S1__Group_3_3__0__Impl rule__S1__Group_3_3__1 ;
    public final void rule__S1__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4614:1: ( rule__S1__Group_3_3__0__Impl rule__S1__Group_3_3__1 )
            // InternalLangFil.g:4615:2: rule__S1__Group_3_3__0__Impl rule__S1__Group_3_3__1
            {
            pushFollow(FOLLOW_4);
            rule__S1__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group_3_3__1();

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
    // $ANTLR end "rule__S1__Group_3_3__0"


    // $ANTLR start "rule__S1__Group_3_3__0__Impl"
    // InternalLangFil.g:4622:1: rule__S1__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__S1__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4626:1: ( ( ',' ) )
            // InternalLangFil.g:4627:1: ( ',' )
            {
            // InternalLangFil.g:4627:1: ( ',' )
            // InternalLangFil.g:4628:2: ','
            {
             before(grammarAccess.getS1Access().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getS1Access().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_3_3__0__Impl"


    // $ANTLR start "rule__S1__Group_3_3__1"
    // InternalLangFil.g:4637:1: rule__S1__Group_3_3__1 : rule__S1__Group_3_3__1__Impl ;
    public final void rule__S1__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4641:1: ( rule__S1__Group_3_3__1__Impl )
            // InternalLangFil.g:4642:2: rule__S1__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S1__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__S1__Group_3_3__1"


    // $ANTLR start "rule__S1__Group_3_3__1__Impl"
    // InternalLangFil.g:4648:1: rule__S1__Group_3_3__1__Impl : ( ( rule__S1__UesoptionnellesAssignment_3_3_1 ) ) ;
    public final void rule__S1__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4652:1: ( ( ( rule__S1__UesoptionnellesAssignment_3_3_1 ) ) )
            // InternalLangFil.g:4653:1: ( ( rule__S1__UesoptionnellesAssignment_3_3_1 ) )
            {
            // InternalLangFil.g:4653:1: ( ( rule__S1__UesoptionnellesAssignment_3_3_1 ) )
            // InternalLangFil.g:4654:2: ( rule__S1__UesoptionnellesAssignment_3_3_1 )
            {
             before(grammarAccess.getS1Access().getUesoptionnellesAssignment_3_3_1()); 
            // InternalLangFil.g:4655:2: ( rule__S1__UesoptionnellesAssignment_3_3_1 )
            // InternalLangFil.g:4655:3: rule__S1__UesoptionnellesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__S1__UesoptionnellesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getS1Access().getUesoptionnellesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_3_3__1__Impl"


    // $ANTLR start "rule__S1__Group_4__0"
    // InternalLangFil.g:4664:1: rule__S1__Group_4__0 : rule__S1__Group_4__0__Impl rule__S1__Group_4__1 ;
    public final void rule__S1__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4668:1: ( rule__S1__Group_4__0__Impl rule__S1__Group_4__1 )
            // InternalLangFil.g:4669:2: rule__S1__Group_4__0__Impl rule__S1__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__S1__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group_4__1();

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
    // $ANTLR end "rule__S1__Group_4__0"


    // $ANTLR start "rule__S1__Group_4__0__Impl"
    // InternalLangFil.g:4676:1: rule__S1__Group_4__0__Impl : ( 'uesobligatoires' ) ;
    public final void rule__S1__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4680:1: ( ( 'uesobligatoires' ) )
            // InternalLangFil.g:4681:1: ( 'uesobligatoires' )
            {
            // InternalLangFil.g:4681:1: ( 'uesobligatoires' )
            // InternalLangFil.g:4682:2: 'uesobligatoires'
            {
             before(grammarAccess.getS1Access().getUesobligatoiresKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getS1Access().getUesobligatoiresKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_4__0__Impl"


    // $ANTLR start "rule__S1__Group_4__1"
    // InternalLangFil.g:4691:1: rule__S1__Group_4__1 : rule__S1__Group_4__1__Impl rule__S1__Group_4__2 ;
    public final void rule__S1__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4695:1: ( rule__S1__Group_4__1__Impl rule__S1__Group_4__2 )
            // InternalLangFil.g:4696:2: rule__S1__Group_4__1__Impl rule__S1__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__S1__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group_4__2();

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
    // $ANTLR end "rule__S1__Group_4__1"


    // $ANTLR start "rule__S1__Group_4__1__Impl"
    // InternalLangFil.g:4703:1: rule__S1__Group_4__1__Impl : ( '(' ) ;
    public final void rule__S1__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4707:1: ( ( '(' ) )
            // InternalLangFil.g:4708:1: ( '(' )
            {
            // InternalLangFil.g:4708:1: ( '(' )
            // InternalLangFil.g:4709:2: '('
            {
             before(grammarAccess.getS1Access().getLeftParenthesisKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getS1Access().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_4__1__Impl"


    // $ANTLR start "rule__S1__Group_4__2"
    // InternalLangFil.g:4718:1: rule__S1__Group_4__2 : rule__S1__Group_4__2__Impl rule__S1__Group_4__3 ;
    public final void rule__S1__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4722:1: ( rule__S1__Group_4__2__Impl rule__S1__Group_4__3 )
            // InternalLangFil.g:4723:2: rule__S1__Group_4__2__Impl rule__S1__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__S1__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group_4__3();

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
    // $ANTLR end "rule__S1__Group_4__2"


    // $ANTLR start "rule__S1__Group_4__2__Impl"
    // InternalLangFil.g:4730:1: rule__S1__Group_4__2__Impl : ( ( rule__S1__UesobligatoiresAssignment_4_2 ) ) ;
    public final void rule__S1__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4734:1: ( ( ( rule__S1__UesobligatoiresAssignment_4_2 ) ) )
            // InternalLangFil.g:4735:1: ( ( rule__S1__UesobligatoiresAssignment_4_2 ) )
            {
            // InternalLangFil.g:4735:1: ( ( rule__S1__UesobligatoiresAssignment_4_2 ) )
            // InternalLangFil.g:4736:2: ( rule__S1__UesobligatoiresAssignment_4_2 )
            {
             before(grammarAccess.getS1Access().getUesobligatoiresAssignment_4_2()); 
            // InternalLangFil.g:4737:2: ( rule__S1__UesobligatoiresAssignment_4_2 )
            // InternalLangFil.g:4737:3: rule__S1__UesobligatoiresAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__S1__UesobligatoiresAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getS1Access().getUesobligatoiresAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_4__2__Impl"


    // $ANTLR start "rule__S1__Group_4__3"
    // InternalLangFil.g:4745:1: rule__S1__Group_4__3 : rule__S1__Group_4__3__Impl rule__S1__Group_4__4 ;
    public final void rule__S1__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4749:1: ( rule__S1__Group_4__3__Impl rule__S1__Group_4__4 )
            // InternalLangFil.g:4750:2: rule__S1__Group_4__3__Impl rule__S1__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__S1__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group_4__4();

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
    // $ANTLR end "rule__S1__Group_4__3"


    // $ANTLR start "rule__S1__Group_4__3__Impl"
    // InternalLangFil.g:4757:1: rule__S1__Group_4__3__Impl : ( ( rule__S1__Group_4_3__0 )* ) ;
    public final void rule__S1__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4761:1: ( ( ( rule__S1__Group_4_3__0 )* ) )
            // InternalLangFil.g:4762:1: ( ( rule__S1__Group_4_3__0 )* )
            {
            // InternalLangFil.g:4762:1: ( ( rule__S1__Group_4_3__0 )* )
            // InternalLangFil.g:4763:2: ( rule__S1__Group_4_3__0 )*
            {
             before(grammarAccess.getS1Access().getGroup_4_3()); 
            // InternalLangFil.g:4764:2: ( rule__S1__Group_4_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalLangFil.g:4764:3: rule__S1__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__S1__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getS1Access().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_4__3__Impl"


    // $ANTLR start "rule__S1__Group_4__4"
    // InternalLangFil.g:4772:1: rule__S1__Group_4__4 : rule__S1__Group_4__4__Impl ;
    public final void rule__S1__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4776:1: ( rule__S1__Group_4__4__Impl )
            // InternalLangFil.g:4777:2: rule__S1__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S1__Group_4__4__Impl();

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
    // $ANTLR end "rule__S1__Group_4__4"


    // $ANTLR start "rule__S1__Group_4__4__Impl"
    // InternalLangFil.g:4783:1: rule__S1__Group_4__4__Impl : ( ')' ) ;
    public final void rule__S1__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4787:1: ( ( ')' ) )
            // InternalLangFil.g:4788:1: ( ')' )
            {
            // InternalLangFil.g:4788:1: ( ')' )
            // InternalLangFil.g:4789:2: ')'
            {
             before(grammarAccess.getS1Access().getRightParenthesisKeyword_4_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getS1Access().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_4__4__Impl"


    // $ANTLR start "rule__S1__Group_4_3__0"
    // InternalLangFil.g:4799:1: rule__S1__Group_4_3__0 : rule__S1__Group_4_3__0__Impl rule__S1__Group_4_3__1 ;
    public final void rule__S1__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4803:1: ( rule__S1__Group_4_3__0__Impl rule__S1__Group_4_3__1 )
            // InternalLangFil.g:4804:2: rule__S1__Group_4_3__0__Impl rule__S1__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__S1__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S1__Group_4_3__1();

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
    // $ANTLR end "rule__S1__Group_4_3__0"


    // $ANTLR start "rule__S1__Group_4_3__0__Impl"
    // InternalLangFil.g:4811:1: rule__S1__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__S1__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4815:1: ( ( ',' ) )
            // InternalLangFil.g:4816:1: ( ',' )
            {
            // InternalLangFil.g:4816:1: ( ',' )
            // InternalLangFil.g:4817:2: ','
            {
             before(grammarAccess.getS1Access().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getS1Access().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_4_3__0__Impl"


    // $ANTLR start "rule__S1__Group_4_3__1"
    // InternalLangFil.g:4826:1: rule__S1__Group_4_3__1 : rule__S1__Group_4_3__1__Impl ;
    public final void rule__S1__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4830:1: ( rule__S1__Group_4_3__1__Impl )
            // InternalLangFil.g:4831:2: rule__S1__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S1__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__S1__Group_4_3__1"


    // $ANTLR start "rule__S1__Group_4_3__1__Impl"
    // InternalLangFil.g:4837:1: rule__S1__Group_4_3__1__Impl : ( ( rule__S1__UesobligatoiresAssignment_4_3_1 ) ) ;
    public final void rule__S1__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4841:1: ( ( ( rule__S1__UesobligatoiresAssignment_4_3_1 ) ) )
            // InternalLangFil.g:4842:1: ( ( rule__S1__UesobligatoiresAssignment_4_3_1 ) )
            {
            // InternalLangFil.g:4842:1: ( ( rule__S1__UesobligatoiresAssignment_4_3_1 ) )
            // InternalLangFil.g:4843:2: ( rule__S1__UesobligatoiresAssignment_4_3_1 )
            {
             before(grammarAccess.getS1Access().getUesobligatoiresAssignment_4_3_1()); 
            // InternalLangFil.g:4844:2: ( rule__S1__UesobligatoiresAssignment_4_3_1 )
            // InternalLangFil.g:4844:3: rule__S1__UesobligatoiresAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__S1__UesobligatoiresAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getS1Access().getUesobligatoiresAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__Group_4_3__1__Impl"


    // $ANTLR start "rule__S2__Group__0"
    // InternalLangFil.g:4853:1: rule__S2__Group__0 : rule__S2__Group__0__Impl rule__S2__Group__1 ;
    public final void rule__S2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4857:1: ( rule__S2__Group__0__Impl rule__S2__Group__1 )
            // InternalLangFil.g:4858:2: rule__S2__Group__0__Impl rule__S2__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__S2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group__1();

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
    // $ANTLR end "rule__S2__Group__0"


    // $ANTLR start "rule__S2__Group__0__Impl"
    // InternalLangFil.g:4865:1: rule__S2__Group__0__Impl : ( () ) ;
    public final void rule__S2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4869:1: ( ( () ) )
            // InternalLangFil.g:4870:1: ( () )
            {
            // InternalLangFil.g:4870:1: ( () )
            // InternalLangFil.g:4871:2: ()
            {
             before(grammarAccess.getS2Access().getS2Action_0()); 
            // InternalLangFil.g:4872:2: ()
            // InternalLangFil.g:4872:3: 
            {
            }

             after(grammarAccess.getS2Access().getS2Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group__0__Impl"


    // $ANTLR start "rule__S2__Group__1"
    // InternalLangFil.g:4880:1: rule__S2__Group__1 : rule__S2__Group__1__Impl rule__S2__Group__2 ;
    public final void rule__S2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4884:1: ( rule__S2__Group__1__Impl rule__S2__Group__2 )
            // InternalLangFil.g:4885:2: rule__S2__Group__1__Impl rule__S2__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__S2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group__2();

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
    // $ANTLR end "rule__S2__Group__1"


    // $ANTLR start "rule__S2__Group__1__Impl"
    // InternalLangFil.g:4892:1: rule__S2__Group__1__Impl : ( 'S2' ) ;
    public final void rule__S2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4896:1: ( ( 'S2' ) )
            // InternalLangFil.g:4897:1: ( 'S2' )
            {
            // InternalLangFil.g:4897:1: ( 'S2' )
            // InternalLangFil.g:4898:2: 'S2'
            {
             before(grammarAccess.getS2Access().getS2Keyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getS2Access().getS2Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group__1__Impl"


    // $ANTLR start "rule__S2__Group__2"
    // InternalLangFil.g:4907:1: rule__S2__Group__2 : rule__S2__Group__2__Impl rule__S2__Group__3 ;
    public final void rule__S2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4911:1: ( rule__S2__Group__2__Impl rule__S2__Group__3 )
            // InternalLangFil.g:4912:2: rule__S2__Group__2__Impl rule__S2__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__S2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group__3();

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
    // $ANTLR end "rule__S2__Group__2"


    // $ANTLR start "rule__S2__Group__2__Impl"
    // InternalLangFil.g:4919:1: rule__S2__Group__2__Impl : ( '{' ) ;
    public final void rule__S2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4923:1: ( ( '{' ) )
            // InternalLangFil.g:4924:1: ( '{' )
            {
            // InternalLangFil.g:4924:1: ( '{' )
            // InternalLangFil.g:4925:2: '{'
            {
             before(grammarAccess.getS2Access().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getS2Access().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group__2__Impl"


    // $ANTLR start "rule__S2__Group__3"
    // InternalLangFil.g:4934:1: rule__S2__Group__3 : rule__S2__Group__3__Impl rule__S2__Group__4 ;
    public final void rule__S2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4938:1: ( rule__S2__Group__3__Impl rule__S2__Group__4 )
            // InternalLangFil.g:4939:2: rule__S2__Group__3__Impl rule__S2__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__S2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group__4();

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
    // $ANTLR end "rule__S2__Group__3"


    // $ANTLR start "rule__S2__Group__3__Impl"
    // InternalLangFil.g:4946:1: rule__S2__Group__3__Impl : ( ( rule__S2__Group_3__0 )? ) ;
    public final void rule__S2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4950:1: ( ( ( rule__S2__Group_3__0 )? ) )
            // InternalLangFil.g:4951:1: ( ( rule__S2__Group_3__0 )? )
            {
            // InternalLangFil.g:4951:1: ( ( rule__S2__Group_3__0 )? )
            // InternalLangFil.g:4952:2: ( rule__S2__Group_3__0 )?
            {
             before(grammarAccess.getS2Access().getGroup_3()); 
            // InternalLangFil.g:4953:2: ( rule__S2__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalLangFil.g:4953:3: rule__S2__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__S2__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getS2Access().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group__3__Impl"


    // $ANTLR start "rule__S2__Group__4"
    // InternalLangFil.g:4961:1: rule__S2__Group__4 : rule__S2__Group__4__Impl rule__S2__Group__5 ;
    public final void rule__S2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4965:1: ( rule__S2__Group__4__Impl rule__S2__Group__5 )
            // InternalLangFil.g:4966:2: rule__S2__Group__4__Impl rule__S2__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__S2__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group__5();

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
    // $ANTLR end "rule__S2__Group__4"


    // $ANTLR start "rule__S2__Group__4__Impl"
    // InternalLangFil.g:4973:1: rule__S2__Group__4__Impl : ( ( rule__S2__Group_4__0 )? ) ;
    public final void rule__S2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4977:1: ( ( ( rule__S2__Group_4__0 )? ) )
            // InternalLangFil.g:4978:1: ( ( rule__S2__Group_4__0 )? )
            {
            // InternalLangFil.g:4978:1: ( ( rule__S2__Group_4__0 )? )
            // InternalLangFil.g:4979:2: ( rule__S2__Group_4__0 )?
            {
             before(grammarAccess.getS2Access().getGroup_4()); 
            // InternalLangFil.g:4980:2: ( rule__S2__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalLangFil.g:4980:3: rule__S2__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__S2__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getS2Access().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group__4__Impl"


    // $ANTLR start "rule__S2__Group__5"
    // InternalLangFil.g:4988:1: rule__S2__Group__5 : rule__S2__Group__5__Impl ;
    public final void rule__S2__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:4992:1: ( rule__S2__Group__5__Impl )
            // InternalLangFil.g:4993:2: rule__S2__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S2__Group__5__Impl();

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
    // $ANTLR end "rule__S2__Group__5"


    // $ANTLR start "rule__S2__Group__5__Impl"
    // InternalLangFil.g:4999:1: rule__S2__Group__5__Impl : ( '}' ) ;
    public final void rule__S2__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5003:1: ( ( '}' ) )
            // InternalLangFil.g:5004:1: ( '}' )
            {
            // InternalLangFil.g:5004:1: ( '}' )
            // InternalLangFil.g:5005:2: '}'
            {
             before(grammarAccess.getS2Access().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getS2Access().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group__5__Impl"


    // $ANTLR start "rule__S2__Group_3__0"
    // InternalLangFil.g:5015:1: rule__S2__Group_3__0 : rule__S2__Group_3__0__Impl rule__S2__Group_3__1 ;
    public final void rule__S2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5019:1: ( rule__S2__Group_3__0__Impl rule__S2__Group_3__1 )
            // InternalLangFil.g:5020:2: rule__S2__Group_3__0__Impl rule__S2__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__S2__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group_3__1();

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
    // $ANTLR end "rule__S2__Group_3__0"


    // $ANTLR start "rule__S2__Group_3__0__Impl"
    // InternalLangFil.g:5027:1: rule__S2__Group_3__0__Impl : ( 'uesoptionnelles' ) ;
    public final void rule__S2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5031:1: ( ( 'uesoptionnelles' ) )
            // InternalLangFil.g:5032:1: ( 'uesoptionnelles' )
            {
            // InternalLangFil.g:5032:1: ( 'uesoptionnelles' )
            // InternalLangFil.g:5033:2: 'uesoptionnelles'
            {
             before(grammarAccess.getS2Access().getUesoptionnellesKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getS2Access().getUesoptionnellesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_3__0__Impl"


    // $ANTLR start "rule__S2__Group_3__1"
    // InternalLangFil.g:5042:1: rule__S2__Group_3__1 : rule__S2__Group_3__1__Impl rule__S2__Group_3__2 ;
    public final void rule__S2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5046:1: ( rule__S2__Group_3__1__Impl rule__S2__Group_3__2 )
            // InternalLangFil.g:5047:2: rule__S2__Group_3__1__Impl rule__S2__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__S2__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group_3__2();

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
    // $ANTLR end "rule__S2__Group_3__1"


    // $ANTLR start "rule__S2__Group_3__1__Impl"
    // InternalLangFil.g:5054:1: rule__S2__Group_3__1__Impl : ( '(' ) ;
    public final void rule__S2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5058:1: ( ( '(' ) )
            // InternalLangFil.g:5059:1: ( '(' )
            {
            // InternalLangFil.g:5059:1: ( '(' )
            // InternalLangFil.g:5060:2: '('
            {
             before(grammarAccess.getS2Access().getLeftParenthesisKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getS2Access().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_3__1__Impl"


    // $ANTLR start "rule__S2__Group_3__2"
    // InternalLangFil.g:5069:1: rule__S2__Group_3__2 : rule__S2__Group_3__2__Impl rule__S2__Group_3__3 ;
    public final void rule__S2__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5073:1: ( rule__S2__Group_3__2__Impl rule__S2__Group_3__3 )
            // InternalLangFil.g:5074:2: rule__S2__Group_3__2__Impl rule__S2__Group_3__3
            {
            pushFollow(FOLLOW_13);
            rule__S2__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group_3__3();

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
    // $ANTLR end "rule__S2__Group_3__2"


    // $ANTLR start "rule__S2__Group_3__2__Impl"
    // InternalLangFil.g:5081:1: rule__S2__Group_3__2__Impl : ( ( rule__S2__UesoptionnellesAssignment_3_2 ) ) ;
    public final void rule__S2__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5085:1: ( ( ( rule__S2__UesoptionnellesAssignment_3_2 ) ) )
            // InternalLangFil.g:5086:1: ( ( rule__S2__UesoptionnellesAssignment_3_2 ) )
            {
            // InternalLangFil.g:5086:1: ( ( rule__S2__UesoptionnellesAssignment_3_2 ) )
            // InternalLangFil.g:5087:2: ( rule__S2__UesoptionnellesAssignment_3_2 )
            {
             before(grammarAccess.getS2Access().getUesoptionnellesAssignment_3_2()); 
            // InternalLangFil.g:5088:2: ( rule__S2__UesoptionnellesAssignment_3_2 )
            // InternalLangFil.g:5088:3: rule__S2__UesoptionnellesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__S2__UesoptionnellesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getS2Access().getUesoptionnellesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_3__2__Impl"


    // $ANTLR start "rule__S2__Group_3__3"
    // InternalLangFil.g:5096:1: rule__S2__Group_3__3 : rule__S2__Group_3__3__Impl rule__S2__Group_3__4 ;
    public final void rule__S2__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5100:1: ( rule__S2__Group_3__3__Impl rule__S2__Group_3__4 )
            // InternalLangFil.g:5101:2: rule__S2__Group_3__3__Impl rule__S2__Group_3__4
            {
            pushFollow(FOLLOW_13);
            rule__S2__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group_3__4();

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
    // $ANTLR end "rule__S2__Group_3__3"


    // $ANTLR start "rule__S2__Group_3__3__Impl"
    // InternalLangFil.g:5108:1: rule__S2__Group_3__3__Impl : ( ( rule__S2__Group_3_3__0 )* ) ;
    public final void rule__S2__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5112:1: ( ( ( rule__S2__Group_3_3__0 )* ) )
            // InternalLangFil.g:5113:1: ( ( rule__S2__Group_3_3__0 )* )
            {
            // InternalLangFil.g:5113:1: ( ( rule__S2__Group_3_3__0 )* )
            // InternalLangFil.g:5114:2: ( rule__S2__Group_3_3__0 )*
            {
             before(grammarAccess.getS2Access().getGroup_3_3()); 
            // InternalLangFil.g:5115:2: ( rule__S2__Group_3_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==15) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalLangFil.g:5115:3: rule__S2__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__S2__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getS2Access().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_3__3__Impl"


    // $ANTLR start "rule__S2__Group_3__4"
    // InternalLangFil.g:5123:1: rule__S2__Group_3__4 : rule__S2__Group_3__4__Impl ;
    public final void rule__S2__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5127:1: ( rule__S2__Group_3__4__Impl )
            // InternalLangFil.g:5128:2: rule__S2__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S2__Group_3__4__Impl();

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
    // $ANTLR end "rule__S2__Group_3__4"


    // $ANTLR start "rule__S2__Group_3__4__Impl"
    // InternalLangFil.g:5134:1: rule__S2__Group_3__4__Impl : ( ')' ) ;
    public final void rule__S2__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5138:1: ( ( ')' ) )
            // InternalLangFil.g:5139:1: ( ')' )
            {
            // InternalLangFil.g:5139:1: ( ')' )
            // InternalLangFil.g:5140:2: ')'
            {
             before(grammarAccess.getS2Access().getRightParenthesisKeyword_3_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getS2Access().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_3__4__Impl"


    // $ANTLR start "rule__S2__Group_3_3__0"
    // InternalLangFil.g:5150:1: rule__S2__Group_3_3__0 : rule__S2__Group_3_3__0__Impl rule__S2__Group_3_3__1 ;
    public final void rule__S2__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5154:1: ( rule__S2__Group_3_3__0__Impl rule__S2__Group_3_3__1 )
            // InternalLangFil.g:5155:2: rule__S2__Group_3_3__0__Impl rule__S2__Group_3_3__1
            {
            pushFollow(FOLLOW_4);
            rule__S2__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group_3_3__1();

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
    // $ANTLR end "rule__S2__Group_3_3__0"


    // $ANTLR start "rule__S2__Group_3_3__0__Impl"
    // InternalLangFil.g:5162:1: rule__S2__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__S2__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5166:1: ( ( ',' ) )
            // InternalLangFil.g:5167:1: ( ',' )
            {
            // InternalLangFil.g:5167:1: ( ',' )
            // InternalLangFil.g:5168:2: ','
            {
             before(grammarAccess.getS2Access().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getS2Access().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_3_3__0__Impl"


    // $ANTLR start "rule__S2__Group_3_3__1"
    // InternalLangFil.g:5177:1: rule__S2__Group_3_3__1 : rule__S2__Group_3_3__1__Impl ;
    public final void rule__S2__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5181:1: ( rule__S2__Group_3_3__1__Impl )
            // InternalLangFil.g:5182:2: rule__S2__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S2__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__S2__Group_3_3__1"


    // $ANTLR start "rule__S2__Group_3_3__1__Impl"
    // InternalLangFil.g:5188:1: rule__S2__Group_3_3__1__Impl : ( ( rule__S2__UesoptionnellesAssignment_3_3_1 ) ) ;
    public final void rule__S2__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5192:1: ( ( ( rule__S2__UesoptionnellesAssignment_3_3_1 ) ) )
            // InternalLangFil.g:5193:1: ( ( rule__S2__UesoptionnellesAssignment_3_3_1 ) )
            {
            // InternalLangFil.g:5193:1: ( ( rule__S2__UesoptionnellesAssignment_3_3_1 ) )
            // InternalLangFil.g:5194:2: ( rule__S2__UesoptionnellesAssignment_3_3_1 )
            {
             before(grammarAccess.getS2Access().getUesoptionnellesAssignment_3_3_1()); 
            // InternalLangFil.g:5195:2: ( rule__S2__UesoptionnellesAssignment_3_3_1 )
            // InternalLangFil.g:5195:3: rule__S2__UesoptionnellesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__S2__UesoptionnellesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getS2Access().getUesoptionnellesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_3_3__1__Impl"


    // $ANTLR start "rule__S2__Group_4__0"
    // InternalLangFil.g:5204:1: rule__S2__Group_4__0 : rule__S2__Group_4__0__Impl rule__S2__Group_4__1 ;
    public final void rule__S2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5208:1: ( rule__S2__Group_4__0__Impl rule__S2__Group_4__1 )
            // InternalLangFil.g:5209:2: rule__S2__Group_4__0__Impl rule__S2__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__S2__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group_4__1();

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
    // $ANTLR end "rule__S2__Group_4__0"


    // $ANTLR start "rule__S2__Group_4__0__Impl"
    // InternalLangFil.g:5216:1: rule__S2__Group_4__0__Impl : ( 'uesobligatoires' ) ;
    public final void rule__S2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5220:1: ( ( 'uesobligatoires' ) )
            // InternalLangFil.g:5221:1: ( 'uesobligatoires' )
            {
            // InternalLangFil.g:5221:1: ( 'uesobligatoires' )
            // InternalLangFil.g:5222:2: 'uesobligatoires'
            {
             before(grammarAccess.getS2Access().getUesobligatoiresKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getS2Access().getUesobligatoiresKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_4__0__Impl"


    // $ANTLR start "rule__S2__Group_4__1"
    // InternalLangFil.g:5231:1: rule__S2__Group_4__1 : rule__S2__Group_4__1__Impl rule__S2__Group_4__2 ;
    public final void rule__S2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5235:1: ( rule__S2__Group_4__1__Impl rule__S2__Group_4__2 )
            // InternalLangFil.g:5236:2: rule__S2__Group_4__1__Impl rule__S2__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__S2__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group_4__2();

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
    // $ANTLR end "rule__S2__Group_4__1"


    // $ANTLR start "rule__S2__Group_4__1__Impl"
    // InternalLangFil.g:5243:1: rule__S2__Group_4__1__Impl : ( '(' ) ;
    public final void rule__S2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5247:1: ( ( '(' ) )
            // InternalLangFil.g:5248:1: ( '(' )
            {
            // InternalLangFil.g:5248:1: ( '(' )
            // InternalLangFil.g:5249:2: '('
            {
             before(grammarAccess.getS2Access().getLeftParenthesisKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getS2Access().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_4__1__Impl"


    // $ANTLR start "rule__S2__Group_4__2"
    // InternalLangFil.g:5258:1: rule__S2__Group_4__2 : rule__S2__Group_4__2__Impl rule__S2__Group_4__3 ;
    public final void rule__S2__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5262:1: ( rule__S2__Group_4__2__Impl rule__S2__Group_4__3 )
            // InternalLangFil.g:5263:2: rule__S2__Group_4__2__Impl rule__S2__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__S2__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group_4__3();

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
    // $ANTLR end "rule__S2__Group_4__2"


    // $ANTLR start "rule__S2__Group_4__2__Impl"
    // InternalLangFil.g:5270:1: rule__S2__Group_4__2__Impl : ( ( rule__S2__UesobligatoiresAssignment_4_2 ) ) ;
    public final void rule__S2__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5274:1: ( ( ( rule__S2__UesobligatoiresAssignment_4_2 ) ) )
            // InternalLangFil.g:5275:1: ( ( rule__S2__UesobligatoiresAssignment_4_2 ) )
            {
            // InternalLangFil.g:5275:1: ( ( rule__S2__UesobligatoiresAssignment_4_2 ) )
            // InternalLangFil.g:5276:2: ( rule__S2__UesobligatoiresAssignment_4_2 )
            {
             before(grammarAccess.getS2Access().getUesobligatoiresAssignment_4_2()); 
            // InternalLangFil.g:5277:2: ( rule__S2__UesobligatoiresAssignment_4_2 )
            // InternalLangFil.g:5277:3: rule__S2__UesobligatoiresAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__S2__UesobligatoiresAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getS2Access().getUesobligatoiresAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_4__2__Impl"


    // $ANTLR start "rule__S2__Group_4__3"
    // InternalLangFil.g:5285:1: rule__S2__Group_4__3 : rule__S2__Group_4__3__Impl rule__S2__Group_4__4 ;
    public final void rule__S2__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5289:1: ( rule__S2__Group_4__3__Impl rule__S2__Group_4__4 )
            // InternalLangFil.g:5290:2: rule__S2__Group_4__3__Impl rule__S2__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__S2__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group_4__4();

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
    // $ANTLR end "rule__S2__Group_4__3"


    // $ANTLR start "rule__S2__Group_4__3__Impl"
    // InternalLangFil.g:5297:1: rule__S2__Group_4__3__Impl : ( ( rule__S2__Group_4_3__0 )* ) ;
    public final void rule__S2__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5301:1: ( ( ( rule__S2__Group_4_3__0 )* ) )
            // InternalLangFil.g:5302:1: ( ( rule__S2__Group_4_3__0 )* )
            {
            // InternalLangFil.g:5302:1: ( ( rule__S2__Group_4_3__0 )* )
            // InternalLangFil.g:5303:2: ( rule__S2__Group_4_3__0 )*
            {
             before(grammarAccess.getS2Access().getGroup_4_3()); 
            // InternalLangFil.g:5304:2: ( rule__S2__Group_4_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==15) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalLangFil.g:5304:3: rule__S2__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__S2__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getS2Access().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_4__3__Impl"


    // $ANTLR start "rule__S2__Group_4__4"
    // InternalLangFil.g:5312:1: rule__S2__Group_4__4 : rule__S2__Group_4__4__Impl ;
    public final void rule__S2__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5316:1: ( rule__S2__Group_4__4__Impl )
            // InternalLangFil.g:5317:2: rule__S2__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S2__Group_4__4__Impl();

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
    // $ANTLR end "rule__S2__Group_4__4"


    // $ANTLR start "rule__S2__Group_4__4__Impl"
    // InternalLangFil.g:5323:1: rule__S2__Group_4__4__Impl : ( ')' ) ;
    public final void rule__S2__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5327:1: ( ( ')' ) )
            // InternalLangFil.g:5328:1: ( ')' )
            {
            // InternalLangFil.g:5328:1: ( ')' )
            // InternalLangFil.g:5329:2: ')'
            {
             before(grammarAccess.getS2Access().getRightParenthesisKeyword_4_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getS2Access().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_4__4__Impl"


    // $ANTLR start "rule__S2__Group_4_3__0"
    // InternalLangFil.g:5339:1: rule__S2__Group_4_3__0 : rule__S2__Group_4_3__0__Impl rule__S2__Group_4_3__1 ;
    public final void rule__S2__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5343:1: ( rule__S2__Group_4_3__0__Impl rule__S2__Group_4_3__1 )
            // InternalLangFil.g:5344:2: rule__S2__Group_4_3__0__Impl rule__S2__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__S2__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__S2__Group_4_3__1();

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
    // $ANTLR end "rule__S2__Group_4_3__0"


    // $ANTLR start "rule__S2__Group_4_3__0__Impl"
    // InternalLangFil.g:5351:1: rule__S2__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__S2__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5355:1: ( ( ',' ) )
            // InternalLangFil.g:5356:1: ( ',' )
            {
            // InternalLangFil.g:5356:1: ( ',' )
            // InternalLangFil.g:5357:2: ','
            {
             before(grammarAccess.getS2Access().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getS2Access().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_4_3__0__Impl"


    // $ANTLR start "rule__S2__Group_4_3__1"
    // InternalLangFil.g:5366:1: rule__S2__Group_4_3__1 : rule__S2__Group_4_3__1__Impl ;
    public final void rule__S2__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5370:1: ( rule__S2__Group_4_3__1__Impl )
            // InternalLangFil.g:5371:2: rule__S2__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__S2__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__S2__Group_4_3__1"


    // $ANTLR start "rule__S2__Group_4_3__1__Impl"
    // InternalLangFil.g:5377:1: rule__S2__Group_4_3__1__Impl : ( ( rule__S2__UesobligatoiresAssignment_4_3_1 ) ) ;
    public final void rule__S2__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5381:1: ( ( ( rule__S2__UesobligatoiresAssignment_4_3_1 ) ) )
            // InternalLangFil.g:5382:1: ( ( rule__S2__UesobligatoiresAssignment_4_3_1 ) )
            {
            // InternalLangFil.g:5382:1: ( ( rule__S2__UesobligatoiresAssignment_4_3_1 ) )
            // InternalLangFil.g:5383:2: ( rule__S2__UesobligatoiresAssignment_4_3_1 )
            {
             before(grammarAccess.getS2Access().getUesobligatoiresAssignment_4_3_1()); 
            // InternalLangFil.g:5384:2: ( rule__S2__UesobligatoiresAssignment_4_3_1 )
            // InternalLangFil.g:5384:3: rule__S2__UesobligatoiresAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__S2__UesobligatoiresAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getS2Access().getUesobligatoiresAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__Group_4_3__1__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // InternalLangFil.g:5393:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5397:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalLangFil.g:5398:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Video__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__1();

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
    // $ANTLR end "rule__Video__Group__0"


    // $ANTLR start "rule__Video__Group__0__Impl"
    // InternalLangFil.g:5405:1: rule__Video__Group__0__Impl : ( () ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5409:1: ( ( () ) )
            // InternalLangFil.g:5410:1: ( () )
            {
            // InternalLangFil.g:5410:1: ( () )
            // InternalLangFil.g:5411:2: ()
            {
             before(grammarAccess.getVideoAccess().getVideoAction_0()); 
            // InternalLangFil.g:5412:2: ()
            // InternalLangFil.g:5412:3: 
            {
            }

             after(grammarAccess.getVideoAccess().getVideoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__0__Impl"


    // $ANTLR start "rule__Video__Group__1"
    // InternalLangFil.g:5420:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5424:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalLangFil.g:5425:2: rule__Video__Group__1__Impl rule__Video__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Video__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__2();

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
    // $ANTLR end "rule__Video__Group__1"


    // $ANTLR start "rule__Video__Group__1__Impl"
    // InternalLangFil.g:5432:1: rule__Video__Group__1__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5436:1: ( ( 'Video' ) )
            // InternalLangFil.g:5437:1: ( 'Video' )
            {
            // InternalLangFil.g:5437:1: ( 'Video' )
            // InternalLangFil.g:5438:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getVideoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__1__Impl"


    // $ANTLR start "rule__Video__Group__2"
    // InternalLangFil.g:5447:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5451:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalLangFil.g:5452:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Video__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__3();

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
    // $ANTLR end "rule__Video__Group__2"


    // $ANTLR start "rule__Video__Group__2__Impl"
    // InternalLangFil.g:5459:1: rule__Video__Group__2__Impl : ( ( rule__Video__NameAssignment_2 ) ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5463:1: ( ( ( rule__Video__NameAssignment_2 ) ) )
            // InternalLangFil.g:5464:1: ( ( rule__Video__NameAssignment_2 ) )
            {
            // InternalLangFil.g:5464:1: ( ( rule__Video__NameAssignment_2 ) )
            // InternalLangFil.g:5465:2: ( rule__Video__NameAssignment_2 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_2()); 
            // InternalLangFil.g:5466:2: ( rule__Video__NameAssignment_2 )
            // InternalLangFil.g:5466:3: rule__Video__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Video__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__2__Impl"


    // $ANTLR start "rule__Video__Group__3"
    // InternalLangFil.g:5474:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5478:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalLangFil.g:5479:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Video__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__4();

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
    // $ANTLR end "rule__Video__Group__3"


    // $ANTLR start "rule__Video__Group__3__Impl"
    // InternalLangFil.g:5486:1: rule__Video__Group__3__Impl : ( '{' ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5490:1: ( ( '{' ) )
            // InternalLangFil.g:5491:1: ( '{' )
            {
            // InternalLangFil.g:5491:1: ( '{' )
            // InternalLangFil.g:5492:2: '{'
            {
             before(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__3__Impl"


    // $ANTLR start "rule__Video__Group__4"
    // InternalLangFil.g:5501:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5505:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // InternalLangFil.g:5506:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Video__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__5();

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
    // $ANTLR end "rule__Video__Group__4"


    // $ANTLR start "rule__Video__Group__4__Impl"
    // InternalLangFil.g:5513:1: rule__Video__Group__4__Impl : ( ( rule__Video__Group_4__0 )? ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5517:1: ( ( ( rule__Video__Group_4__0 )? ) )
            // InternalLangFil.g:5518:1: ( ( rule__Video__Group_4__0 )? )
            {
            // InternalLangFil.g:5518:1: ( ( rule__Video__Group_4__0 )? )
            // InternalLangFil.g:5519:2: ( rule__Video__Group_4__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_4()); 
            // InternalLangFil.g:5520:2: ( rule__Video__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalLangFil.g:5520:3: rule__Video__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__4__Impl"


    // $ANTLR start "rule__Video__Group__5"
    // InternalLangFil.g:5528:1: rule__Video__Group__5 : rule__Video__Group__5__Impl rule__Video__Group__6 ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5532:1: ( rule__Video__Group__5__Impl rule__Video__Group__6 )
            // InternalLangFil.g:5533:2: rule__Video__Group__5__Impl rule__Video__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Video__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__6();

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
    // $ANTLR end "rule__Video__Group__5"


    // $ANTLR start "rule__Video__Group__5__Impl"
    // InternalLangFil.g:5540:1: rule__Video__Group__5__Impl : ( ( rule__Video__Group_5__0 )? ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5544:1: ( ( ( rule__Video__Group_5__0 )? ) )
            // InternalLangFil.g:5545:1: ( ( rule__Video__Group_5__0 )? )
            {
            // InternalLangFil.g:5545:1: ( ( rule__Video__Group_5__0 )? )
            // InternalLangFil.g:5546:2: ( rule__Video__Group_5__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_5()); 
            // InternalLangFil.g:5547:2: ( rule__Video__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalLangFil.g:5547:3: rule__Video__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__5__Impl"


    // $ANTLR start "rule__Video__Group__6"
    // InternalLangFil.g:5555:1: rule__Video__Group__6 : rule__Video__Group__6__Impl rule__Video__Group__7 ;
    public final void rule__Video__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5559:1: ( rule__Video__Group__6__Impl rule__Video__Group__7 )
            // InternalLangFil.g:5560:2: rule__Video__Group__6__Impl rule__Video__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Video__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__7();

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
    // $ANTLR end "rule__Video__Group__6"


    // $ANTLR start "rule__Video__Group__6__Impl"
    // InternalLangFil.g:5567:1: rule__Video__Group__6__Impl : ( ( rule__Video__Group_6__0 )? ) ;
    public final void rule__Video__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5571:1: ( ( ( rule__Video__Group_6__0 )? ) )
            // InternalLangFil.g:5572:1: ( ( rule__Video__Group_6__0 )? )
            {
            // InternalLangFil.g:5572:1: ( ( rule__Video__Group_6__0 )? )
            // InternalLangFil.g:5573:2: ( rule__Video__Group_6__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_6()); 
            // InternalLangFil.g:5574:2: ( rule__Video__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalLangFil.g:5574:3: rule__Video__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__6__Impl"


    // $ANTLR start "rule__Video__Group__7"
    // InternalLangFil.g:5582:1: rule__Video__Group__7 : rule__Video__Group__7__Impl ;
    public final void rule__Video__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5586:1: ( rule__Video__Group__7__Impl )
            // InternalLangFil.g:5587:2: rule__Video__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__7__Impl();

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
    // $ANTLR end "rule__Video__Group__7"


    // $ANTLR start "rule__Video__Group__7__Impl"
    // InternalLangFil.g:5593:1: rule__Video__Group__7__Impl : ( '}' ) ;
    public final void rule__Video__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5597:1: ( ( '}' ) )
            // InternalLangFil.g:5598:1: ( '}' )
            {
            // InternalLangFil.g:5598:1: ( '}' )
            // InternalLangFil.g:5599:2: '}'
            {
             before(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__7__Impl"


    // $ANTLR start "rule__Video__Group_4__0"
    // InternalLangFil.g:5609:1: rule__Video__Group_4__0 : rule__Video__Group_4__0__Impl rule__Video__Group_4__1 ;
    public final void rule__Video__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5613:1: ( rule__Video__Group_4__0__Impl rule__Video__Group_4__1 )
            // InternalLangFil.g:5614:2: rule__Video__Group_4__0__Impl rule__Video__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Video__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_4__1();

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
    // $ANTLR end "rule__Video__Group_4__0"


    // $ANTLR start "rule__Video__Group_4__0__Impl"
    // InternalLangFil.g:5621:1: rule__Video__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Video__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5625:1: ( ( 'description' ) )
            // InternalLangFil.g:5626:1: ( 'description' )
            {
            // InternalLangFil.g:5626:1: ( 'description' )
            // InternalLangFil.g:5627:2: 'description'
            {
             before(grammarAccess.getVideoAccess().getDescriptionKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_4__0__Impl"


    // $ANTLR start "rule__Video__Group_4__1"
    // InternalLangFil.g:5636:1: rule__Video__Group_4__1 : rule__Video__Group_4__1__Impl ;
    public final void rule__Video__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5640:1: ( rule__Video__Group_4__1__Impl )
            // InternalLangFil.g:5641:2: rule__Video__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_4__1__Impl();

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
    // $ANTLR end "rule__Video__Group_4__1"


    // $ANTLR start "rule__Video__Group_4__1__Impl"
    // InternalLangFil.g:5647:1: rule__Video__Group_4__1__Impl : ( ( rule__Video__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Video__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5651:1: ( ( ( rule__Video__DescriptionAssignment_4_1 ) ) )
            // InternalLangFil.g:5652:1: ( ( rule__Video__DescriptionAssignment_4_1 ) )
            {
            // InternalLangFil.g:5652:1: ( ( rule__Video__DescriptionAssignment_4_1 ) )
            // InternalLangFil.g:5653:2: ( rule__Video__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getVideoAccess().getDescriptionAssignment_4_1()); 
            // InternalLangFil.g:5654:2: ( rule__Video__DescriptionAssignment_4_1 )
            // InternalLangFil.g:5654:3: rule__Video__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_4__1__Impl"


    // $ANTLR start "rule__Video__Group_5__0"
    // InternalLangFil.g:5663:1: rule__Video__Group_5__0 : rule__Video__Group_5__0__Impl rule__Video__Group_5__1 ;
    public final void rule__Video__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5667:1: ( rule__Video__Group_5__0__Impl rule__Video__Group_5__1 )
            // InternalLangFil.g:5668:2: rule__Video__Group_5__0__Impl rule__Video__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Video__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_5__1();

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
    // $ANTLR end "rule__Video__Group_5__0"


    // $ANTLR start "rule__Video__Group_5__0__Impl"
    // InternalLangFil.g:5675:1: rule__Video__Group_5__0__Impl : ( 'lien' ) ;
    public final void rule__Video__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5679:1: ( ( 'lien' ) )
            // InternalLangFil.g:5680:1: ( 'lien' )
            {
            // InternalLangFil.g:5680:1: ( 'lien' )
            // InternalLangFil.g:5681:2: 'lien'
            {
             before(grammarAccess.getVideoAccess().getLienKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getLienKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_5__0__Impl"


    // $ANTLR start "rule__Video__Group_5__1"
    // InternalLangFil.g:5690:1: rule__Video__Group_5__1 : rule__Video__Group_5__1__Impl ;
    public final void rule__Video__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5694:1: ( rule__Video__Group_5__1__Impl )
            // InternalLangFil.g:5695:2: rule__Video__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_5__1__Impl();

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
    // $ANTLR end "rule__Video__Group_5__1"


    // $ANTLR start "rule__Video__Group_5__1__Impl"
    // InternalLangFil.g:5701:1: rule__Video__Group_5__1__Impl : ( ( rule__Video__LienAssignment_5_1 ) ) ;
    public final void rule__Video__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5705:1: ( ( ( rule__Video__LienAssignment_5_1 ) ) )
            // InternalLangFil.g:5706:1: ( ( rule__Video__LienAssignment_5_1 ) )
            {
            // InternalLangFil.g:5706:1: ( ( rule__Video__LienAssignment_5_1 ) )
            // InternalLangFil.g:5707:2: ( rule__Video__LienAssignment_5_1 )
            {
             before(grammarAccess.getVideoAccess().getLienAssignment_5_1()); 
            // InternalLangFil.g:5708:2: ( rule__Video__LienAssignment_5_1 )
            // InternalLangFil.g:5708:3: rule__Video__LienAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__LienAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getLienAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_5__1__Impl"


    // $ANTLR start "rule__Video__Group_6__0"
    // InternalLangFil.g:5717:1: rule__Video__Group_6__0 : rule__Video__Group_6__0__Impl rule__Video__Group_6__1 ;
    public final void rule__Video__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5721:1: ( rule__Video__Group_6__0__Impl rule__Video__Group_6__1 )
            // InternalLangFil.g:5722:2: rule__Video__Group_6__0__Impl rule__Video__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Video__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_6__1();

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
    // $ANTLR end "rule__Video__Group_6__0"


    // $ANTLR start "rule__Video__Group_6__0__Impl"
    // InternalLangFil.g:5729:1: rule__Video__Group_6__0__Impl : ( 'duree' ) ;
    public final void rule__Video__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5733:1: ( ( 'duree' ) )
            // InternalLangFil.g:5734:1: ( 'duree' )
            {
            // InternalLangFil.g:5734:1: ( 'duree' )
            // InternalLangFil.g:5735:2: 'duree'
            {
             before(grammarAccess.getVideoAccess().getDureeKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getDureeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_6__0__Impl"


    // $ANTLR start "rule__Video__Group_6__1"
    // InternalLangFil.g:5744:1: rule__Video__Group_6__1 : rule__Video__Group_6__1__Impl ;
    public final void rule__Video__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5748:1: ( rule__Video__Group_6__1__Impl )
            // InternalLangFil.g:5749:2: rule__Video__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_6__1__Impl();

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
    // $ANTLR end "rule__Video__Group_6__1"


    // $ANTLR start "rule__Video__Group_6__1__Impl"
    // InternalLangFil.g:5755:1: rule__Video__Group_6__1__Impl : ( ( rule__Video__DureeAssignment_6_1 ) ) ;
    public final void rule__Video__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5759:1: ( ( ( rule__Video__DureeAssignment_6_1 ) ) )
            // InternalLangFil.g:5760:1: ( ( rule__Video__DureeAssignment_6_1 ) )
            {
            // InternalLangFil.g:5760:1: ( ( rule__Video__DureeAssignment_6_1 ) )
            // InternalLangFil.g:5761:2: ( rule__Video__DureeAssignment_6_1 )
            {
             before(grammarAccess.getVideoAccess().getDureeAssignment_6_1()); 
            // InternalLangFil.g:5762:2: ( rule__Video__DureeAssignment_6_1 )
            // InternalLangFil.g:5762:3: rule__Video__DureeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__DureeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getDureeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_6__1__Impl"


    // $ANTLR start "rule__Fichier__Group__0"
    // InternalLangFil.g:5771:1: rule__Fichier__Group__0 : rule__Fichier__Group__0__Impl rule__Fichier__Group__1 ;
    public final void rule__Fichier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5775:1: ( rule__Fichier__Group__0__Impl rule__Fichier__Group__1 )
            // InternalLangFil.g:5776:2: rule__Fichier__Group__0__Impl rule__Fichier__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Fichier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__1();

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
    // $ANTLR end "rule__Fichier__Group__0"


    // $ANTLR start "rule__Fichier__Group__0__Impl"
    // InternalLangFil.g:5783:1: rule__Fichier__Group__0__Impl : ( () ) ;
    public final void rule__Fichier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5787:1: ( ( () ) )
            // InternalLangFil.g:5788:1: ( () )
            {
            // InternalLangFil.g:5788:1: ( () )
            // InternalLangFil.g:5789:2: ()
            {
             before(grammarAccess.getFichierAccess().getFichierAction_0()); 
            // InternalLangFil.g:5790:2: ()
            // InternalLangFil.g:5790:3: 
            {
            }

             after(grammarAccess.getFichierAccess().getFichierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__0__Impl"


    // $ANTLR start "rule__Fichier__Group__1"
    // InternalLangFil.g:5798:1: rule__Fichier__Group__1 : rule__Fichier__Group__1__Impl rule__Fichier__Group__2 ;
    public final void rule__Fichier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5802:1: ( rule__Fichier__Group__1__Impl rule__Fichier__Group__2 )
            // InternalLangFil.g:5803:2: rule__Fichier__Group__1__Impl rule__Fichier__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Fichier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__2();

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
    // $ANTLR end "rule__Fichier__Group__1"


    // $ANTLR start "rule__Fichier__Group__1__Impl"
    // InternalLangFil.g:5810:1: rule__Fichier__Group__1__Impl : ( 'Fichier' ) ;
    public final void rule__Fichier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5814:1: ( ( 'Fichier' ) )
            // InternalLangFil.g:5815:1: ( 'Fichier' )
            {
            // InternalLangFil.g:5815:1: ( 'Fichier' )
            // InternalLangFil.g:5816:2: 'Fichier'
            {
             before(grammarAccess.getFichierAccess().getFichierKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getFichierKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__1__Impl"


    // $ANTLR start "rule__Fichier__Group__2"
    // InternalLangFil.g:5825:1: rule__Fichier__Group__2 : rule__Fichier__Group__2__Impl rule__Fichier__Group__3 ;
    public final void rule__Fichier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5829:1: ( rule__Fichier__Group__2__Impl rule__Fichier__Group__3 )
            // InternalLangFil.g:5830:2: rule__Fichier__Group__2__Impl rule__Fichier__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Fichier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__3();

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
    // $ANTLR end "rule__Fichier__Group__2"


    // $ANTLR start "rule__Fichier__Group__2__Impl"
    // InternalLangFil.g:5837:1: rule__Fichier__Group__2__Impl : ( ( rule__Fichier__NameAssignment_2 ) ) ;
    public final void rule__Fichier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5841:1: ( ( ( rule__Fichier__NameAssignment_2 ) ) )
            // InternalLangFil.g:5842:1: ( ( rule__Fichier__NameAssignment_2 ) )
            {
            // InternalLangFil.g:5842:1: ( ( rule__Fichier__NameAssignment_2 ) )
            // InternalLangFil.g:5843:2: ( rule__Fichier__NameAssignment_2 )
            {
             before(grammarAccess.getFichierAccess().getNameAssignment_2()); 
            // InternalLangFil.g:5844:2: ( rule__Fichier__NameAssignment_2 )
            // InternalLangFil.g:5844:3: rule__Fichier__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFichierAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__2__Impl"


    // $ANTLR start "rule__Fichier__Group__3"
    // InternalLangFil.g:5852:1: rule__Fichier__Group__3 : rule__Fichier__Group__3__Impl rule__Fichier__Group__4 ;
    public final void rule__Fichier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5856:1: ( rule__Fichier__Group__3__Impl rule__Fichier__Group__4 )
            // InternalLangFil.g:5857:2: rule__Fichier__Group__3__Impl rule__Fichier__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Fichier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__4();

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
    // $ANTLR end "rule__Fichier__Group__3"


    // $ANTLR start "rule__Fichier__Group__3__Impl"
    // InternalLangFil.g:5864:1: rule__Fichier__Group__3__Impl : ( '{' ) ;
    public final void rule__Fichier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5868:1: ( ( '{' ) )
            // InternalLangFil.g:5869:1: ( '{' )
            {
            // InternalLangFil.g:5869:1: ( '{' )
            // InternalLangFil.g:5870:2: '{'
            {
             before(grammarAccess.getFichierAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__3__Impl"


    // $ANTLR start "rule__Fichier__Group__4"
    // InternalLangFil.g:5879:1: rule__Fichier__Group__4 : rule__Fichier__Group__4__Impl rule__Fichier__Group__5 ;
    public final void rule__Fichier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5883:1: ( rule__Fichier__Group__4__Impl rule__Fichier__Group__5 )
            // InternalLangFil.g:5884:2: rule__Fichier__Group__4__Impl rule__Fichier__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Fichier__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__5();

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
    // $ANTLR end "rule__Fichier__Group__4"


    // $ANTLR start "rule__Fichier__Group__4__Impl"
    // InternalLangFil.g:5891:1: rule__Fichier__Group__4__Impl : ( ( rule__Fichier__Group_4__0 )? ) ;
    public final void rule__Fichier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5895:1: ( ( ( rule__Fichier__Group_4__0 )? ) )
            // InternalLangFil.g:5896:1: ( ( rule__Fichier__Group_4__0 )? )
            {
            // InternalLangFil.g:5896:1: ( ( rule__Fichier__Group_4__0 )? )
            // InternalLangFil.g:5897:2: ( rule__Fichier__Group_4__0 )?
            {
             before(grammarAccess.getFichierAccess().getGroup_4()); 
            // InternalLangFil.g:5898:2: ( rule__Fichier__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalLangFil.g:5898:3: rule__Fichier__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fichier__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFichierAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__4__Impl"


    // $ANTLR start "rule__Fichier__Group__5"
    // InternalLangFil.g:5906:1: rule__Fichier__Group__5 : rule__Fichier__Group__5__Impl rule__Fichier__Group__6 ;
    public final void rule__Fichier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5910:1: ( rule__Fichier__Group__5__Impl rule__Fichier__Group__6 )
            // InternalLangFil.g:5911:2: rule__Fichier__Group__5__Impl rule__Fichier__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Fichier__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__6();

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
    // $ANTLR end "rule__Fichier__Group__5"


    // $ANTLR start "rule__Fichier__Group__5__Impl"
    // InternalLangFil.g:5918:1: rule__Fichier__Group__5__Impl : ( ( rule__Fichier__Group_5__0 )? ) ;
    public final void rule__Fichier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5922:1: ( ( ( rule__Fichier__Group_5__0 )? ) )
            // InternalLangFil.g:5923:1: ( ( rule__Fichier__Group_5__0 )? )
            {
            // InternalLangFil.g:5923:1: ( ( rule__Fichier__Group_5__0 )? )
            // InternalLangFil.g:5924:2: ( rule__Fichier__Group_5__0 )?
            {
             before(grammarAccess.getFichierAccess().getGroup_5()); 
            // InternalLangFil.g:5925:2: ( rule__Fichier__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalLangFil.g:5925:3: rule__Fichier__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fichier__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFichierAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__5__Impl"


    // $ANTLR start "rule__Fichier__Group__6"
    // InternalLangFil.g:5933:1: rule__Fichier__Group__6 : rule__Fichier__Group__6__Impl rule__Fichier__Group__7 ;
    public final void rule__Fichier__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5937:1: ( rule__Fichier__Group__6__Impl rule__Fichier__Group__7 )
            // InternalLangFil.g:5938:2: rule__Fichier__Group__6__Impl rule__Fichier__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Fichier__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group__7();

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
    // $ANTLR end "rule__Fichier__Group__6"


    // $ANTLR start "rule__Fichier__Group__6__Impl"
    // InternalLangFil.g:5945:1: rule__Fichier__Group__6__Impl : ( ( rule__Fichier__Group_6__0 )? ) ;
    public final void rule__Fichier__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5949:1: ( ( ( rule__Fichier__Group_6__0 )? ) )
            // InternalLangFil.g:5950:1: ( ( rule__Fichier__Group_6__0 )? )
            {
            // InternalLangFil.g:5950:1: ( ( rule__Fichier__Group_6__0 )? )
            // InternalLangFil.g:5951:2: ( rule__Fichier__Group_6__0 )?
            {
             before(grammarAccess.getFichierAccess().getGroup_6()); 
            // InternalLangFil.g:5952:2: ( rule__Fichier__Group_6__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalLangFil.g:5952:3: rule__Fichier__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fichier__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFichierAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__6__Impl"


    // $ANTLR start "rule__Fichier__Group__7"
    // InternalLangFil.g:5960:1: rule__Fichier__Group__7 : rule__Fichier__Group__7__Impl ;
    public final void rule__Fichier__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5964:1: ( rule__Fichier__Group__7__Impl )
            // InternalLangFil.g:5965:2: rule__Fichier__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__Group__7__Impl();

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
    // $ANTLR end "rule__Fichier__Group__7"


    // $ANTLR start "rule__Fichier__Group__7__Impl"
    // InternalLangFil.g:5971:1: rule__Fichier__Group__7__Impl : ( '}' ) ;
    public final void rule__Fichier__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5975:1: ( ( '}' ) )
            // InternalLangFil.g:5976:1: ( '}' )
            {
            // InternalLangFil.g:5976:1: ( '}' )
            // InternalLangFil.g:5977:2: '}'
            {
             before(grammarAccess.getFichierAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group__7__Impl"


    // $ANTLR start "rule__Fichier__Group_4__0"
    // InternalLangFil.g:5987:1: rule__Fichier__Group_4__0 : rule__Fichier__Group_4__0__Impl rule__Fichier__Group_4__1 ;
    public final void rule__Fichier__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:5991:1: ( rule__Fichier__Group_4__0__Impl rule__Fichier__Group_4__1 )
            // InternalLangFil.g:5992:2: rule__Fichier__Group_4__0__Impl rule__Fichier__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Fichier__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group_4__1();

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
    // $ANTLR end "rule__Fichier__Group_4__0"


    // $ANTLR start "rule__Fichier__Group_4__0__Impl"
    // InternalLangFil.g:5999:1: rule__Fichier__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Fichier__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6003:1: ( ( 'description' ) )
            // InternalLangFil.g:6004:1: ( 'description' )
            {
            // InternalLangFil.g:6004:1: ( 'description' )
            // InternalLangFil.g:6005:2: 'description'
            {
             before(grammarAccess.getFichierAccess().getDescriptionKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group_4__0__Impl"


    // $ANTLR start "rule__Fichier__Group_4__1"
    // InternalLangFil.g:6014:1: rule__Fichier__Group_4__1 : rule__Fichier__Group_4__1__Impl ;
    public final void rule__Fichier__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6018:1: ( rule__Fichier__Group_4__1__Impl )
            // InternalLangFil.g:6019:2: rule__Fichier__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__Group_4__1__Impl();

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
    // $ANTLR end "rule__Fichier__Group_4__1"


    // $ANTLR start "rule__Fichier__Group_4__1__Impl"
    // InternalLangFil.g:6025:1: rule__Fichier__Group_4__1__Impl : ( ( rule__Fichier__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Fichier__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6029:1: ( ( ( rule__Fichier__DescriptionAssignment_4_1 ) ) )
            // InternalLangFil.g:6030:1: ( ( rule__Fichier__DescriptionAssignment_4_1 ) )
            {
            // InternalLangFil.g:6030:1: ( ( rule__Fichier__DescriptionAssignment_4_1 ) )
            // InternalLangFil.g:6031:2: ( rule__Fichier__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getFichierAccess().getDescriptionAssignment_4_1()); 
            // InternalLangFil.g:6032:2: ( rule__Fichier__DescriptionAssignment_4_1 )
            // InternalLangFil.g:6032:3: rule__Fichier__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFichierAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group_4__1__Impl"


    // $ANTLR start "rule__Fichier__Group_5__0"
    // InternalLangFil.g:6041:1: rule__Fichier__Group_5__0 : rule__Fichier__Group_5__0__Impl rule__Fichier__Group_5__1 ;
    public final void rule__Fichier__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6045:1: ( rule__Fichier__Group_5__0__Impl rule__Fichier__Group_5__1 )
            // InternalLangFil.g:6046:2: rule__Fichier__Group_5__0__Impl rule__Fichier__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Fichier__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group_5__1();

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
    // $ANTLR end "rule__Fichier__Group_5__0"


    // $ANTLR start "rule__Fichier__Group_5__0__Impl"
    // InternalLangFil.g:6053:1: rule__Fichier__Group_5__0__Impl : ( 'lien' ) ;
    public final void rule__Fichier__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6057:1: ( ( 'lien' ) )
            // InternalLangFil.g:6058:1: ( 'lien' )
            {
            // InternalLangFil.g:6058:1: ( 'lien' )
            // InternalLangFil.g:6059:2: 'lien'
            {
             before(grammarAccess.getFichierAccess().getLienKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getLienKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group_5__0__Impl"


    // $ANTLR start "rule__Fichier__Group_5__1"
    // InternalLangFil.g:6068:1: rule__Fichier__Group_5__1 : rule__Fichier__Group_5__1__Impl ;
    public final void rule__Fichier__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6072:1: ( rule__Fichier__Group_5__1__Impl )
            // InternalLangFil.g:6073:2: rule__Fichier__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__Group_5__1__Impl();

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
    // $ANTLR end "rule__Fichier__Group_5__1"


    // $ANTLR start "rule__Fichier__Group_5__1__Impl"
    // InternalLangFil.g:6079:1: rule__Fichier__Group_5__1__Impl : ( ( rule__Fichier__LienAssignment_5_1 ) ) ;
    public final void rule__Fichier__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6083:1: ( ( ( rule__Fichier__LienAssignment_5_1 ) ) )
            // InternalLangFil.g:6084:1: ( ( rule__Fichier__LienAssignment_5_1 ) )
            {
            // InternalLangFil.g:6084:1: ( ( rule__Fichier__LienAssignment_5_1 ) )
            // InternalLangFil.g:6085:2: ( rule__Fichier__LienAssignment_5_1 )
            {
             before(grammarAccess.getFichierAccess().getLienAssignment_5_1()); 
            // InternalLangFil.g:6086:2: ( rule__Fichier__LienAssignment_5_1 )
            // InternalLangFil.g:6086:3: rule__Fichier__LienAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__LienAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFichierAccess().getLienAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group_5__1__Impl"


    // $ANTLR start "rule__Fichier__Group_6__0"
    // InternalLangFil.g:6095:1: rule__Fichier__Group_6__0 : rule__Fichier__Group_6__0__Impl rule__Fichier__Group_6__1 ;
    public final void rule__Fichier__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6099:1: ( rule__Fichier__Group_6__0__Impl rule__Fichier__Group_6__1 )
            // InternalLangFil.g:6100:2: rule__Fichier__Group_6__0__Impl rule__Fichier__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Fichier__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fichier__Group_6__1();

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
    // $ANTLR end "rule__Fichier__Group_6__0"


    // $ANTLR start "rule__Fichier__Group_6__0__Impl"
    // InternalLangFil.g:6107:1: rule__Fichier__Group_6__0__Impl : ( 'auteur' ) ;
    public final void rule__Fichier__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6111:1: ( ( 'auteur' ) )
            // InternalLangFil.g:6112:1: ( 'auteur' )
            {
            // InternalLangFil.g:6112:1: ( 'auteur' )
            // InternalLangFil.g:6113:2: 'auteur'
            {
             before(grammarAccess.getFichierAccess().getAuteurKeyword_6_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFichierAccess().getAuteurKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group_6__0__Impl"


    // $ANTLR start "rule__Fichier__Group_6__1"
    // InternalLangFil.g:6122:1: rule__Fichier__Group_6__1 : rule__Fichier__Group_6__1__Impl ;
    public final void rule__Fichier__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6126:1: ( rule__Fichier__Group_6__1__Impl )
            // InternalLangFil.g:6127:2: rule__Fichier__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__Group_6__1__Impl();

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
    // $ANTLR end "rule__Fichier__Group_6__1"


    // $ANTLR start "rule__Fichier__Group_6__1__Impl"
    // InternalLangFil.g:6133:1: rule__Fichier__Group_6__1__Impl : ( ( rule__Fichier__AuteurAssignment_6_1 ) ) ;
    public final void rule__Fichier__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6137:1: ( ( ( rule__Fichier__AuteurAssignment_6_1 ) ) )
            // InternalLangFil.g:6138:1: ( ( rule__Fichier__AuteurAssignment_6_1 ) )
            {
            // InternalLangFil.g:6138:1: ( ( rule__Fichier__AuteurAssignment_6_1 ) )
            // InternalLangFil.g:6139:2: ( rule__Fichier__AuteurAssignment_6_1 )
            {
             before(grammarAccess.getFichierAccess().getAuteurAssignment_6_1()); 
            // InternalLangFil.g:6140:2: ( rule__Fichier__AuteurAssignment_6_1 )
            // InternalLangFil.g:6140:3: rule__Fichier__AuteurAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Fichier__AuteurAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFichierAccess().getAuteurAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__Group_6__1__Impl"


    // $ANTLR start "rule__Audio__Group__0"
    // InternalLangFil.g:6149:1: rule__Audio__Group__0 : rule__Audio__Group__0__Impl rule__Audio__Group__1 ;
    public final void rule__Audio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6153:1: ( rule__Audio__Group__0__Impl rule__Audio__Group__1 )
            // InternalLangFil.g:6154:2: rule__Audio__Group__0__Impl rule__Audio__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Audio__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__1();

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
    // $ANTLR end "rule__Audio__Group__0"


    // $ANTLR start "rule__Audio__Group__0__Impl"
    // InternalLangFil.g:6161:1: rule__Audio__Group__0__Impl : ( () ) ;
    public final void rule__Audio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6165:1: ( ( () ) )
            // InternalLangFil.g:6166:1: ( () )
            {
            // InternalLangFil.g:6166:1: ( () )
            // InternalLangFil.g:6167:2: ()
            {
             before(grammarAccess.getAudioAccess().getAudioAction_0()); 
            // InternalLangFil.g:6168:2: ()
            // InternalLangFil.g:6168:3: 
            {
            }

             after(grammarAccess.getAudioAccess().getAudioAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__0__Impl"


    // $ANTLR start "rule__Audio__Group__1"
    // InternalLangFil.g:6176:1: rule__Audio__Group__1 : rule__Audio__Group__1__Impl rule__Audio__Group__2 ;
    public final void rule__Audio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6180:1: ( rule__Audio__Group__1__Impl rule__Audio__Group__2 )
            // InternalLangFil.g:6181:2: rule__Audio__Group__1__Impl rule__Audio__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Audio__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__2();

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
    // $ANTLR end "rule__Audio__Group__1"


    // $ANTLR start "rule__Audio__Group__1__Impl"
    // InternalLangFil.g:6188:1: rule__Audio__Group__1__Impl : ( 'Audio' ) ;
    public final void rule__Audio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6192:1: ( ( 'Audio' ) )
            // InternalLangFil.g:6193:1: ( 'Audio' )
            {
            // InternalLangFil.g:6193:1: ( 'Audio' )
            // InternalLangFil.g:6194:2: 'Audio'
            {
             before(grammarAccess.getAudioAccess().getAudioKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getAudioKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__1__Impl"


    // $ANTLR start "rule__Audio__Group__2"
    // InternalLangFil.g:6203:1: rule__Audio__Group__2 : rule__Audio__Group__2__Impl rule__Audio__Group__3 ;
    public final void rule__Audio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6207:1: ( rule__Audio__Group__2__Impl rule__Audio__Group__3 )
            // InternalLangFil.g:6208:2: rule__Audio__Group__2__Impl rule__Audio__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Audio__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__3();

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
    // $ANTLR end "rule__Audio__Group__2"


    // $ANTLR start "rule__Audio__Group__2__Impl"
    // InternalLangFil.g:6215:1: rule__Audio__Group__2__Impl : ( ( rule__Audio__NameAssignment_2 ) ) ;
    public final void rule__Audio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6219:1: ( ( ( rule__Audio__NameAssignment_2 ) ) )
            // InternalLangFil.g:6220:1: ( ( rule__Audio__NameAssignment_2 ) )
            {
            // InternalLangFil.g:6220:1: ( ( rule__Audio__NameAssignment_2 ) )
            // InternalLangFil.g:6221:2: ( rule__Audio__NameAssignment_2 )
            {
             before(grammarAccess.getAudioAccess().getNameAssignment_2()); 
            // InternalLangFil.g:6222:2: ( rule__Audio__NameAssignment_2 )
            // InternalLangFil.g:6222:3: rule__Audio__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Audio__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__2__Impl"


    // $ANTLR start "rule__Audio__Group__3"
    // InternalLangFil.g:6230:1: rule__Audio__Group__3 : rule__Audio__Group__3__Impl rule__Audio__Group__4 ;
    public final void rule__Audio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6234:1: ( rule__Audio__Group__3__Impl rule__Audio__Group__4 )
            // InternalLangFil.g:6235:2: rule__Audio__Group__3__Impl rule__Audio__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Audio__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__4();

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
    // $ANTLR end "rule__Audio__Group__3"


    // $ANTLR start "rule__Audio__Group__3__Impl"
    // InternalLangFil.g:6242:1: rule__Audio__Group__3__Impl : ( '{' ) ;
    public final void rule__Audio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6246:1: ( ( '{' ) )
            // InternalLangFil.g:6247:1: ( '{' )
            {
            // InternalLangFil.g:6247:1: ( '{' )
            // InternalLangFil.g:6248:2: '{'
            {
             before(grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__3__Impl"


    // $ANTLR start "rule__Audio__Group__4"
    // InternalLangFil.g:6257:1: rule__Audio__Group__4 : rule__Audio__Group__4__Impl rule__Audio__Group__5 ;
    public final void rule__Audio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6261:1: ( rule__Audio__Group__4__Impl rule__Audio__Group__5 )
            // InternalLangFil.g:6262:2: rule__Audio__Group__4__Impl rule__Audio__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Audio__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__5();

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
    // $ANTLR end "rule__Audio__Group__4"


    // $ANTLR start "rule__Audio__Group__4__Impl"
    // InternalLangFil.g:6269:1: rule__Audio__Group__4__Impl : ( ( rule__Audio__Group_4__0 )? ) ;
    public final void rule__Audio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6273:1: ( ( ( rule__Audio__Group_4__0 )? ) )
            // InternalLangFil.g:6274:1: ( ( rule__Audio__Group_4__0 )? )
            {
            // InternalLangFil.g:6274:1: ( ( rule__Audio__Group_4__0 )? )
            // InternalLangFil.g:6275:2: ( rule__Audio__Group_4__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_4()); 
            // InternalLangFil.g:6276:2: ( rule__Audio__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==40) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalLangFil.g:6276:3: rule__Audio__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Audio__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__4__Impl"


    // $ANTLR start "rule__Audio__Group__5"
    // InternalLangFil.g:6284:1: rule__Audio__Group__5 : rule__Audio__Group__5__Impl rule__Audio__Group__6 ;
    public final void rule__Audio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6288:1: ( rule__Audio__Group__5__Impl rule__Audio__Group__6 )
            // InternalLangFil.g:6289:2: rule__Audio__Group__5__Impl rule__Audio__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Audio__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__6();

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
    // $ANTLR end "rule__Audio__Group__5"


    // $ANTLR start "rule__Audio__Group__5__Impl"
    // InternalLangFil.g:6296:1: rule__Audio__Group__5__Impl : ( ( rule__Audio__Group_5__0 )? ) ;
    public final void rule__Audio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6300:1: ( ( ( rule__Audio__Group_5__0 )? ) )
            // InternalLangFil.g:6301:1: ( ( rule__Audio__Group_5__0 )? )
            {
            // InternalLangFil.g:6301:1: ( ( rule__Audio__Group_5__0 )? )
            // InternalLangFil.g:6302:2: ( rule__Audio__Group_5__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_5()); 
            // InternalLangFil.g:6303:2: ( rule__Audio__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalLangFil.g:6303:3: rule__Audio__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Audio__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__5__Impl"


    // $ANTLR start "rule__Audio__Group__6"
    // InternalLangFil.g:6311:1: rule__Audio__Group__6 : rule__Audio__Group__6__Impl rule__Audio__Group__7 ;
    public final void rule__Audio__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6315:1: ( rule__Audio__Group__6__Impl rule__Audio__Group__7 )
            // InternalLangFil.g:6316:2: rule__Audio__Group__6__Impl rule__Audio__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Audio__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__7();

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
    // $ANTLR end "rule__Audio__Group__6"


    // $ANTLR start "rule__Audio__Group__6__Impl"
    // InternalLangFil.g:6323:1: rule__Audio__Group__6__Impl : ( ( rule__Audio__Group_6__0 )? ) ;
    public final void rule__Audio__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6327:1: ( ( ( rule__Audio__Group_6__0 )? ) )
            // InternalLangFil.g:6328:1: ( ( rule__Audio__Group_6__0 )? )
            {
            // InternalLangFil.g:6328:1: ( ( rule__Audio__Group_6__0 )? )
            // InternalLangFil.g:6329:2: ( rule__Audio__Group_6__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_6()); 
            // InternalLangFil.g:6330:2: ( rule__Audio__Group_6__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalLangFil.g:6330:3: rule__Audio__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Audio__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__6__Impl"


    // $ANTLR start "rule__Audio__Group__7"
    // InternalLangFil.g:6338:1: rule__Audio__Group__7 : rule__Audio__Group__7__Impl ;
    public final void rule__Audio__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6342:1: ( rule__Audio__Group__7__Impl )
            // InternalLangFil.g:6343:2: rule__Audio__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group__7__Impl();

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
    // $ANTLR end "rule__Audio__Group__7"


    // $ANTLR start "rule__Audio__Group__7__Impl"
    // InternalLangFil.g:6349:1: rule__Audio__Group__7__Impl : ( '}' ) ;
    public final void rule__Audio__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6353:1: ( ( '}' ) )
            // InternalLangFil.g:6354:1: ( '}' )
            {
            // InternalLangFil.g:6354:1: ( '}' )
            // InternalLangFil.g:6355:2: '}'
            {
             before(grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__7__Impl"


    // $ANTLR start "rule__Audio__Group_4__0"
    // InternalLangFil.g:6365:1: rule__Audio__Group_4__0 : rule__Audio__Group_4__0__Impl rule__Audio__Group_4__1 ;
    public final void rule__Audio__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6369:1: ( rule__Audio__Group_4__0__Impl rule__Audio__Group_4__1 )
            // InternalLangFil.g:6370:2: rule__Audio__Group_4__0__Impl rule__Audio__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Audio__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group_4__1();

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
    // $ANTLR end "rule__Audio__Group_4__0"


    // $ANTLR start "rule__Audio__Group_4__0__Impl"
    // InternalLangFil.g:6377:1: rule__Audio__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Audio__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6381:1: ( ( 'description' ) )
            // InternalLangFil.g:6382:1: ( 'description' )
            {
            // InternalLangFil.g:6382:1: ( 'description' )
            // InternalLangFil.g:6383:2: 'description'
            {
             before(grammarAccess.getAudioAccess().getDescriptionKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_4__0__Impl"


    // $ANTLR start "rule__Audio__Group_4__1"
    // InternalLangFil.g:6392:1: rule__Audio__Group_4__1 : rule__Audio__Group_4__1__Impl ;
    public final void rule__Audio__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6396:1: ( rule__Audio__Group_4__1__Impl )
            // InternalLangFil.g:6397:2: rule__Audio__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group_4__1__Impl();

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
    // $ANTLR end "rule__Audio__Group_4__1"


    // $ANTLR start "rule__Audio__Group_4__1__Impl"
    // InternalLangFil.g:6403:1: rule__Audio__Group_4__1__Impl : ( ( rule__Audio__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Audio__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6407:1: ( ( ( rule__Audio__DescriptionAssignment_4_1 ) ) )
            // InternalLangFil.g:6408:1: ( ( rule__Audio__DescriptionAssignment_4_1 ) )
            {
            // InternalLangFil.g:6408:1: ( ( rule__Audio__DescriptionAssignment_4_1 ) )
            // InternalLangFil.g:6409:2: ( rule__Audio__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getAudioAccess().getDescriptionAssignment_4_1()); 
            // InternalLangFil.g:6410:2: ( rule__Audio__DescriptionAssignment_4_1 )
            // InternalLangFil.g:6410:3: rule__Audio__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_4__1__Impl"


    // $ANTLR start "rule__Audio__Group_5__0"
    // InternalLangFil.g:6419:1: rule__Audio__Group_5__0 : rule__Audio__Group_5__0__Impl rule__Audio__Group_5__1 ;
    public final void rule__Audio__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6423:1: ( rule__Audio__Group_5__0__Impl rule__Audio__Group_5__1 )
            // InternalLangFil.g:6424:2: rule__Audio__Group_5__0__Impl rule__Audio__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Audio__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group_5__1();

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
    // $ANTLR end "rule__Audio__Group_5__0"


    // $ANTLR start "rule__Audio__Group_5__0__Impl"
    // InternalLangFil.g:6431:1: rule__Audio__Group_5__0__Impl : ( 'lien' ) ;
    public final void rule__Audio__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6435:1: ( ( 'lien' ) )
            // InternalLangFil.g:6436:1: ( 'lien' )
            {
            // InternalLangFil.g:6436:1: ( 'lien' )
            // InternalLangFil.g:6437:2: 'lien'
            {
             before(grammarAccess.getAudioAccess().getLienKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getLienKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_5__0__Impl"


    // $ANTLR start "rule__Audio__Group_5__1"
    // InternalLangFil.g:6446:1: rule__Audio__Group_5__1 : rule__Audio__Group_5__1__Impl ;
    public final void rule__Audio__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6450:1: ( rule__Audio__Group_5__1__Impl )
            // InternalLangFil.g:6451:2: rule__Audio__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group_5__1__Impl();

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
    // $ANTLR end "rule__Audio__Group_5__1"


    // $ANTLR start "rule__Audio__Group_5__1__Impl"
    // InternalLangFil.g:6457:1: rule__Audio__Group_5__1__Impl : ( ( rule__Audio__LienAssignment_5_1 ) ) ;
    public final void rule__Audio__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6461:1: ( ( ( rule__Audio__LienAssignment_5_1 ) ) )
            // InternalLangFil.g:6462:1: ( ( rule__Audio__LienAssignment_5_1 ) )
            {
            // InternalLangFil.g:6462:1: ( ( rule__Audio__LienAssignment_5_1 ) )
            // InternalLangFil.g:6463:2: ( rule__Audio__LienAssignment_5_1 )
            {
             before(grammarAccess.getAudioAccess().getLienAssignment_5_1()); 
            // InternalLangFil.g:6464:2: ( rule__Audio__LienAssignment_5_1 )
            // InternalLangFil.g:6464:3: rule__Audio__LienAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__LienAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getLienAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_5__1__Impl"


    // $ANTLR start "rule__Audio__Group_6__0"
    // InternalLangFil.g:6473:1: rule__Audio__Group_6__0 : rule__Audio__Group_6__0__Impl rule__Audio__Group_6__1 ;
    public final void rule__Audio__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6477:1: ( rule__Audio__Group_6__0__Impl rule__Audio__Group_6__1 )
            // InternalLangFil.g:6478:2: rule__Audio__Group_6__0__Impl rule__Audio__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Audio__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group_6__1();

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
    // $ANTLR end "rule__Audio__Group_6__0"


    // $ANTLR start "rule__Audio__Group_6__0__Impl"
    // InternalLangFil.g:6485:1: rule__Audio__Group_6__0__Impl : ( 'duree' ) ;
    public final void rule__Audio__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6489:1: ( ( 'duree' ) )
            // InternalLangFil.g:6490:1: ( 'duree' )
            {
            // InternalLangFil.g:6490:1: ( 'duree' )
            // InternalLangFil.g:6491:2: 'duree'
            {
             before(grammarAccess.getAudioAccess().getDureeKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getDureeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_6__0__Impl"


    // $ANTLR start "rule__Audio__Group_6__1"
    // InternalLangFil.g:6500:1: rule__Audio__Group_6__1 : rule__Audio__Group_6__1__Impl ;
    public final void rule__Audio__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6504:1: ( rule__Audio__Group_6__1__Impl )
            // InternalLangFil.g:6505:2: rule__Audio__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group_6__1__Impl();

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
    // $ANTLR end "rule__Audio__Group_6__1"


    // $ANTLR start "rule__Audio__Group_6__1__Impl"
    // InternalLangFil.g:6511:1: rule__Audio__Group_6__1__Impl : ( ( rule__Audio__DureeAssignment_6_1 ) ) ;
    public final void rule__Audio__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6515:1: ( ( ( rule__Audio__DureeAssignment_6_1 ) ) )
            // InternalLangFil.g:6516:1: ( ( rule__Audio__DureeAssignment_6_1 ) )
            {
            // InternalLangFil.g:6516:1: ( ( rule__Audio__DureeAssignment_6_1 ) )
            // InternalLangFil.g:6517:2: ( rule__Audio__DureeAssignment_6_1 )
            {
             before(grammarAccess.getAudioAccess().getDureeAssignment_6_1()); 
            // InternalLangFil.g:6518:2: ( rule__Audio__DureeAssignment_6_1 )
            // InternalLangFil.g:6518:3: rule__Audio__DureeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__DureeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getDureeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_6__1__Impl"


    // $ANTLR start "rule__Faculte__NameAssignment_2"
    // InternalLangFil.g:6527:1: rule__Faculte__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Faculte__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6531:1: ( ( ruleEString ) )
            // InternalLangFil.g:6532:2: ( ruleEString )
            {
            // InternalLangFil.g:6532:2: ( ruleEString )
            // InternalLangFil.g:6533:3: ruleEString
            {
             before(grammarAccess.getFaculteAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFaculteAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__NameAssignment_2"


    // $ANTLR start "rule__Faculte__NiveauxAssignment_4_2"
    // InternalLangFil.g:6542:1: rule__Faculte__NiveauxAssignment_4_2 : ( ruleNiveau ) ;
    public final void rule__Faculte__NiveauxAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6546:1: ( ( ruleNiveau ) )
            // InternalLangFil.g:6547:2: ( ruleNiveau )
            {
            // InternalLangFil.g:6547:2: ( ruleNiveau )
            // InternalLangFil.g:6548:3: ruleNiveau
            {
             before(grammarAccess.getFaculteAccess().getNiveauxNiveauParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNiveau();

            state._fsp--;

             after(grammarAccess.getFaculteAccess().getNiveauxNiveauParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__NiveauxAssignment_4_2"


    // $ANTLR start "rule__Faculte__NiveauxAssignment_4_3_1"
    // InternalLangFil.g:6557:1: rule__Faculte__NiveauxAssignment_4_3_1 : ( ruleNiveau ) ;
    public final void rule__Faculte__NiveauxAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6561:1: ( ( ruleNiveau ) )
            // InternalLangFil.g:6562:2: ( ruleNiveau )
            {
            // InternalLangFil.g:6562:2: ( ruleNiveau )
            // InternalLangFil.g:6563:3: ruleNiveau
            {
             before(grammarAccess.getFaculteAccess().getNiveauxNiveauParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNiveau();

            state._fsp--;

             after(grammarAccess.getFaculteAccess().getNiveauxNiveauParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__NiveauxAssignment_4_3_1"


    // $ANTLR start "rule__Faculte__IntervenantsAssignment_5_2"
    // InternalLangFil.g:6572:1: rule__Faculte__IntervenantsAssignment_5_2 : ( ruleIntervenant ) ;
    public final void rule__Faculte__IntervenantsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6576:1: ( ( ruleIntervenant ) )
            // InternalLangFil.g:6577:2: ( ruleIntervenant )
            {
            // InternalLangFil.g:6577:2: ( ruleIntervenant )
            // InternalLangFil.g:6578:3: ruleIntervenant
            {
             before(grammarAccess.getFaculteAccess().getIntervenantsIntervenantParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntervenant();

            state._fsp--;

             after(grammarAccess.getFaculteAccess().getIntervenantsIntervenantParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__IntervenantsAssignment_5_2"


    // $ANTLR start "rule__Faculte__IntervenantsAssignment_5_3_1"
    // InternalLangFil.g:6587:1: rule__Faculte__IntervenantsAssignment_5_3_1 : ( ruleIntervenant ) ;
    public final void rule__Faculte__IntervenantsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6591:1: ( ( ruleIntervenant ) )
            // InternalLangFil.g:6592:2: ( ruleIntervenant )
            {
            // InternalLangFil.g:6592:2: ( ruleIntervenant )
            // InternalLangFil.g:6593:3: ruleIntervenant
            {
             before(grammarAccess.getFaculteAccess().getIntervenantsIntervenantParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntervenant();

            state._fsp--;

             after(grammarAccess.getFaculteAccess().getIntervenantsIntervenantParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Faculte__IntervenantsAssignment_5_3_1"


    // $ANTLR start "rule__Niveau__NameAssignment_2"
    // InternalLangFil.g:6602:1: rule__Niveau__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Niveau__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6606:1: ( ( ruleEString ) )
            // InternalLangFil.g:6607:2: ( ruleEString )
            {
            // InternalLangFil.g:6607:2: ( ruleEString )
            // InternalLangFil.g:6608:3: ruleEString
            {
             before(grammarAccess.getNiveauAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__NameAssignment_2"


    // $ANTLR start "rule__Niveau__PseudoAssignment_4_1"
    // InternalLangFil.g:6617:1: rule__Niveau__PseudoAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Niveau__PseudoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6621:1: ( ( ruleEString ) )
            // InternalLangFil.g:6622:2: ( ruleEString )
            {
            // InternalLangFil.g:6622:2: ( ruleEString )
            // InternalLangFil.g:6623:3: ruleEString
            {
             before(grammarAccess.getNiveauAccess().getPseudoEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getPseudoEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__PseudoAssignment_4_1"


    // $ANTLR start "rule__Niveau__ResponsablesAssignment_5_2"
    // InternalLangFil.g:6632:1: rule__Niveau__ResponsablesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Niveau__ResponsablesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6636:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:6637:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:6637:2: ( ( ruleEString ) )
            // InternalLangFil.g:6638:3: ( ruleEString )
            {
             before(grammarAccess.getNiveauAccess().getResponsablesIntervenantCrossReference_5_2_0()); 
            // InternalLangFil.g:6639:3: ( ruleEString )
            // InternalLangFil.g:6640:4: ruleEString
            {
             before(grammarAccess.getNiveauAccess().getResponsablesIntervenantEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getResponsablesIntervenantEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getNiveauAccess().getResponsablesIntervenantCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__ResponsablesAssignment_5_2"


    // $ANTLR start "rule__Niveau__ResponsablesAssignment_5_3_1"
    // InternalLangFil.g:6651:1: rule__Niveau__ResponsablesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Niveau__ResponsablesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6655:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:6656:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:6656:2: ( ( ruleEString ) )
            // InternalLangFil.g:6657:3: ( ruleEString )
            {
             before(grammarAccess.getNiveauAccess().getResponsablesIntervenantCrossReference_5_3_1_0()); 
            // InternalLangFil.g:6658:3: ( ruleEString )
            // InternalLangFil.g:6659:4: ruleEString
            {
             before(grammarAccess.getNiveauAccess().getResponsablesIntervenantEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getResponsablesIntervenantEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getNiveauAccess().getResponsablesIntervenantCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__ResponsablesAssignment_5_3_1"


    // $ANTLR start "rule__Niveau__FormationsAssignment_6_2"
    // InternalLangFil.g:6670:1: rule__Niveau__FormationsAssignment_6_2 : ( ruleFormation ) ;
    public final void rule__Niveau__FormationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6674:1: ( ( ruleFormation ) )
            // InternalLangFil.g:6675:2: ( ruleFormation )
            {
            // InternalLangFil.g:6675:2: ( ruleFormation )
            // InternalLangFil.g:6676:3: ruleFormation
            {
             before(grammarAccess.getNiveauAccess().getFormationsFormationParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFormation();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getFormationsFormationParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__FormationsAssignment_6_2"


    // $ANTLR start "rule__Niveau__FormationsAssignment_6_3_1"
    // InternalLangFil.g:6685:1: rule__Niveau__FormationsAssignment_6_3_1 : ( ruleFormation ) ;
    public final void rule__Niveau__FormationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6689:1: ( ( ruleFormation ) )
            // InternalLangFil.g:6690:2: ( ruleFormation )
            {
            // InternalLangFil.g:6690:2: ( ruleFormation )
            // InternalLangFil.g:6691:3: ruleFormation
            {
             before(grammarAccess.getNiveauAccess().getFormationsFormationParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormation();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getFormationsFormationParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__FormationsAssignment_6_3_1"


    // $ANTLR start "rule__Niveau__PresentationAssignment_7_1"
    // InternalLangFil.g:6700:1: rule__Niveau__PresentationAssignment_7_1 : ( rulePresentation ) ;
    public final void rule__Niveau__PresentationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6704:1: ( ( rulePresentation ) )
            // InternalLangFil.g:6705:2: ( rulePresentation )
            {
            // InternalLangFil.g:6705:2: ( rulePresentation )
            // InternalLangFil.g:6706:3: rulePresentation
            {
             before(grammarAccess.getNiveauAccess().getPresentationPresentationParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePresentation();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getPresentationPresentationParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__PresentationAssignment_7_1"


    // $ANTLR start "rule__Niveau__UesAssignment_8_2"
    // InternalLangFil.g:6715:1: rule__Niveau__UesAssignment_8_2 : ( ruleUE ) ;
    public final void rule__Niveau__UesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6719:1: ( ( ruleUE ) )
            // InternalLangFil.g:6720:2: ( ruleUE )
            {
            // InternalLangFil.g:6720:2: ( ruleUE )
            // InternalLangFil.g:6721:3: ruleUE
            {
             before(grammarAccess.getNiveauAccess().getUesUEParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUE();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getUesUEParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__UesAssignment_8_2"


    // $ANTLR start "rule__Niveau__UesAssignment_8_3_1"
    // InternalLangFil.g:6730:1: rule__Niveau__UesAssignment_8_3_1 : ( ruleUE ) ;
    public final void rule__Niveau__UesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6734:1: ( ( ruleUE ) )
            // InternalLangFil.g:6735:2: ( ruleUE )
            {
            // InternalLangFil.g:6735:2: ( ruleUE )
            // InternalLangFil.g:6736:3: ruleUE
            {
             before(grammarAccess.getNiveauAccess().getUesUEParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUE();

            state._fsp--;

             after(grammarAccess.getNiveauAccess().getUesUEParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Niveau__UesAssignment_8_3_1"


    // $ANTLR start "rule__Intervenant__NameAssignment_2"
    // InternalLangFil.g:6745:1: rule__Intervenant__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Intervenant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6749:1: ( ( ruleEString ) )
            // InternalLangFil.g:6750:2: ( ruleEString )
            {
            // InternalLangFil.g:6750:2: ( ruleEString )
            // InternalLangFil.g:6751:3: ruleEString
            {
             before(grammarAccess.getIntervenantAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntervenantAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intervenant__NameAssignment_2"


    // $ANTLR start "rule__Intervenant__PrenomAssignment_4_1"
    // InternalLangFil.g:6760:1: rule__Intervenant__PrenomAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Intervenant__PrenomAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6764:1: ( ( ruleEString ) )
            // InternalLangFil.g:6765:2: ( ruleEString )
            {
            // InternalLangFil.g:6765:2: ( ruleEString )
            // InternalLangFil.g:6766:3: ruleEString
            {
             before(grammarAccess.getIntervenantAccess().getPrenomEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntervenantAccess().getPrenomEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intervenant__PrenomAssignment_4_1"


    // $ANTLR start "rule__Formation__NameAssignment_1"
    // InternalLangFil.g:6775:1: rule__Formation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Formation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6779:1: ( ( ruleEString ) )
            // InternalLangFil.g:6780:2: ( ruleEString )
            {
            // InternalLangFil.g:6780:2: ( ruleEString )
            // InternalLangFil.g:6781:3: ruleEString
            {
             before(grammarAccess.getFormationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__NameAssignment_1"


    // $ANTLR start "rule__Formation__PseudoAssignment_3_1"
    // InternalLangFil.g:6790:1: rule__Formation__PseudoAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Formation__PseudoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6794:1: ( ( ruleEString ) )
            // InternalLangFil.g:6795:2: ( ruleEString )
            {
            // InternalLangFil.g:6795:2: ( ruleEString )
            // InternalLangFil.g:6796:3: ruleEString
            {
             before(grammarAccess.getFormationAccess().getPseudoEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getPseudoEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__PseudoAssignment_3_1"


    // $ANTLR start "rule__Formation__ResponsablesAssignment_4_2"
    // InternalLangFil.g:6805:1: rule__Formation__ResponsablesAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Formation__ResponsablesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6809:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:6810:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:6810:2: ( ( ruleEString ) )
            // InternalLangFil.g:6811:3: ( ruleEString )
            {
             before(grammarAccess.getFormationAccess().getResponsablesIntervenantCrossReference_4_2_0()); 
            // InternalLangFil.g:6812:3: ( ruleEString )
            // InternalLangFil.g:6813:4: ruleEString
            {
             before(grammarAccess.getFormationAccess().getResponsablesIntervenantEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getResponsablesIntervenantEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getFormationAccess().getResponsablesIntervenantCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__ResponsablesAssignment_4_2"


    // $ANTLR start "rule__Formation__ResponsablesAssignment_4_3_1"
    // InternalLangFil.g:6824:1: rule__Formation__ResponsablesAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Formation__ResponsablesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6828:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:6829:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:6829:2: ( ( ruleEString ) )
            // InternalLangFil.g:6830:3: ( ruleEString )
            {
             before(grammarAccess.getFormationAccess().getResponsablesIntervenantCrossReference_4_3_1_0()); 
            // InternalLangFil.g:6831:3: ( ruleEString )
            // InternalLangFil.g:6832:4: ruleEString
            {
             before(grammarAccess.getFormationAccess().getResponsablesIntervenantEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getResponsablesIntervenantEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getFormationAccess().getResponsablesIntervenantCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__ResponsablesAssignment_4_3_1"


    // $ANTLR start "rule__Formation__EnseignantsAssignment_5_2"
    // InternalLangFil.g:6843:1: rule__Formation__EnseignantsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Formation__EnseignantsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6847:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:6848:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:6848:2: ( ( ruleEString ) )
            // InternalLangFil.g:6849:3: ( ruleEString )
            {
             before(grammarAccess.getFormationAccess().getEnseignantsIntervenantCrossReference_5_2_0()); 
            // InternalLangFil.g:6850:3: ( ruleEString )
            // InternalLangFil.g:6851:4: ruleEString
            {
             before(grammarAccess.getFormationAccess().getEnseignantsIntervenantEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getEnseignantsIntervenantEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getFormationAccess().getEnseignantsIntervenantCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__EnseignantsAssignment_5_2"


    // $ANTLR start "rule__Formation__EnseignantsAssignment_5_3_1"
    // InternalLangFil.g:6862:1: rule__Formation__EnseignantsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Formation__EnseignantsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6866:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:6867:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:6867:2: ( ( ruleEString ) )
            // InternalLangFil.g:6868:3: ( ruleEString )
            {
             before(grammarAccess.getFormationAccess().getEnseignantsIntervenantCrossReference_5_3_1_0()); 
            // InternalLangFil.g:6869:3: ( ruleEString )
            // InternalLangFil.g:6870:4: ruleEString
            {
             before(grammarAccess.getFormationAccess().getEnseignantsIntervenantEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getEnseignantsIntervenantEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getFormationAccess().getEnseignantsIntervenantCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__EnseignantsAssignment_5_3_1"


    // $ANTLR start "rule__Formation__PresentationAssignment_6_1"
    // InternalLangFil.g:6881:1: rule__Formation__PresentationAssignment_6_1 : ( rulePresentation ) ;
    public final void rule__Formation__PresentationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6885:1: ( ( rulePresentation ) )
            // InternalLangFil.g:6886:2: ( rulePresentation )
            {
            // InternalLangFil.g:6886:2: ( rulePresentation )
            // InternalLangFil.g:6887:3: rulePresentation
            {
             before(grammarAccess.getFormationAccess().getPresentationPresentationParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePresentation();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getPresentationPresentationParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__PresentationAssignment_6_1"


    // $ANTLR start "rule__Formation__S1Assignment_8"
    // InternalLangFil.g:6896:1: rule__Formation__S1Assignment_8 : ( ruleS1 ) ;
    public final void rule__Formation__S1Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6900:1: ( ( ruleS1 ) )
            // InternalLangFil.g:6901:2: ( ruleS1 )
            {
            // InternalLangFil.g:6901:2: ( ruleS1 )
            // InternalLangFil.g:6902:3: ruleS1
            {
             before(grammarAccess.getFormationAccess().getS1S1ParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleS1();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getS1S1ParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__S1Assignment_8"


    // $ANTLR start "rule__Formation__S2Assignment_10"
    // InternalLangFil.g:6911:1: rule__Formation__S2Assignment_10 : ( ruleS2 ) ;
    public final void rule__Formation__S2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6915:1: ( ( ruleS2 ) )
            // InternalLangFil.g:6916:2: ( ruleS2 )
            {
            // InternalLangFil.g:6916:2: ( ruleS2 )
            // InternalLangFil.g:6917:3: ruleS2
            {
             before(grammarAccess.getFormationAccess().getS2S2ParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleS2();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getS2S2ParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__S2Assignment_10"


    // $ANTLR start "rule__Formation__DocumentsAssignment_11_2"
    // InternalLangFil.g:6926:1: rule__Formation__DocumentsAssignment_11_2 : ( ruleDocument ) ;
    public final void rule__Formation__DocumentsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6930:1: ( ( ruleDocument ) )
            // InternalLangFil.g:6931:2: ( ruleDocument )
            {
            // InternalLangFil.g:6931:2: ( ruleDocument )
            // InternalLangFil.g:6932:3: ruleDocument
            {
             before(grammarAccess.getFormationAccess().getDocumentsDocumentParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getDocumentsDocumentParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__DocumentsAssignment_11_2"


    // $ANTLR start "rule__Formation__DocumentsAssignment_11_3_1"
    // InternalLangFil.g:6941:1: rule__Formation__DocumentsAssignment_11_3_1 : ( ruleDocument ) ;
    public final void rule__Formation__DocumentsAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6945:1: ( ( ruleDocument ) )
            // InternalLangFil.g:6946:2: ( ruleDocument )
            {
            // InternalLangFil.g:6946:2: ( ruleDocument )
            // InternalLangFil.g:6947:3: ruleDocument
            {
             before(grammarAccess.getFormationAccess().getDocumentsDocumentParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getFormationAccess().getDocumentsDocumentParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formation__DocumentsAssignment_11_3_1"


    // $ANTLR start "rule__Presentation__ContenueAssignment_3_1"
    // InternalLangFil.g:6956:1: rule__Presentation__ContenueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Presentation__ContenueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6960:1: ( ( ruleEString ) )
            // InternalLangFil.g:6961:2: ( ruleEString )
            {
            // InternalLangFil.g:6961:2: ( ruleEString )
            // InternalLangFil.g:6962:3: ruleEString
            {
             before(grammarAccess.getPresentationAccess().getContenueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPresentationAccess().getContenueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Presentation__ContenueAssignment_3_1"


    // $ANTLR start "rule__UE__NameAssignment_2"
    // InternalLangFil.g:6971:1: rule__UE__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__UE__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6975:1: ( ( ruleEString ) )
            // InternalLangFil.g:6976:2: ( ruleEString )
            {
            // InternalLangFil.g:6976:2: ( ruleEString )
            // InternalLangFil.g:6977:3: ruleEString
            {
             before(grammarAccess.getUEAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUEAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__NameAssignment_2"


    // $ANTLR start "rule__UE__PseudoAssignment_4_1"
    // InternalLangFil.g:6986:1: rule__UE__PseudoAssignment_4_1 : ( ruleEString ) ;
    public final void rule__UE__PseudoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:6990:1: ( ( ruleEString ) )
            // InternalLangFil.g:6991:2: ( ruleEString )
            {
            // InternalLangFil.g:6991:2: ( ruleEString )
            // InternalLangFil.g:6992:3: ruleEString
            {
             before(grammarAccess.getUEAccess().getPseudoEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUEAccess().getPseudoEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__PseudoAssignment_4_1"


    // $ANTLR start "rule__UE__ResponsablesAssignment_5_2"
    // InternalLangFil.g:7001:1: rule__UE__ResponsablesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__UE__ResponsablesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7005:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7006:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7006:2: ( ( ruleEString ) )
            // InternalLangFil.g:7007:3: ( ruleEString )
            {
             before(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_5_2_0()); 
            // InternalLangFil.g:7008:3: ( ruleEString )
            // InternalLangFil.g:7009:4: ruleEString
            {
             before(grammarAccess.getUEAccess().getResponsablesIntervenantEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUEAccess().getResponsablesIntervenantEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__ResponsablesAssignment_5_2"


    // $ANTLR start "rule__UE__ResponsablesAssignment_5_3_1"
    // InternalLangFil.g:7020:1: rule__UE__ResponsablesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__UE__ResponsablesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7024:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7025:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7025:2: ( ( ruleEString ) )
            // InternalLangFil.g:7026:3: ( ruleEString )
            {
             before(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_5_3_1_0()); 
            // InternalLangFil.g:7027:3: ( ruleEString )
            // InternalLangFil.g:7028:4: ruleEString
            {
             before(grammarAccess.getUEAccess().getResponsablesIntervenantEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUEAccess().getResponsablesIntervenantEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__ResponsablesAssignment_5_3_1"


    // $ANTLR start "rule__UE__EnseignantsAssignment_6_2"
    // InternalLangFil.g:7039:1: rule__UE__EnseignantsAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__UE__EnseignantsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7043:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7044:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7044:2: ( ( ruleEString ) )
            // InternalLangFil.g:7045:3: ( ruleEString )
            {
             before(grammarAccess.getUEAccess().getEnseignantsIntervenantCrossReference_6_2_0()); 
            // InternalLangFil.g:7046:3: ( ruleEString )
            // InternalLangFil.g:7047:4: ruleEString
            {
             before(grammarAccess.getUEAccess().getEnseignantsIntervenantEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUEAccess().getEnseignantsIntervenantEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getUEAccess().getEnseignantsIntervenantCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__EnseignantsAssignment_6_2"


    // $ANTLR start "rule__UE__EnseignantsAssignment_6_3_1"
    // InternalLangFil.g:7058:1: rule__UE__EnseignantsAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__UE__EnseignantsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7062:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7063:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7063:2: ( ( ruleEString ) )
            // InternalLangFil.g:7064:3: ( ruleEString )
            {
             before(grammarAccess.getUEAccess().getEnseignantsIntervenantCrossReference_6_3_1_0()); 
            // InternalLangFil.g:7065:3: ( ruleEString )
            // InternalLangFil.g:7066:4: ruleEString
            {
             before(grammarAccess.getUEAccess().getEnseignantsIntervenantEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUEAccess().getEnseignantsIntervenantEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getUEAccess().getEnseignantsIntervenantCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__EnseignantsAssignment_6_3_1"


    // $ANTLR start "rule__UE__DocumentsAssignment_7_2"
    // InternalLangFil.g:7077:1: rule__UE__DocumentsAssignment_7_2 : ( ruleDocument ) ;
    public final void rule__UE__DocumentsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7081:1: ( ( ruleDocument ) )
            // InternalLangFil.g:7082:2: ( ruleDocument )
            {
            // InternalLangFil.g:7082:2: ( ruleDocument )
            // InternalLangFil.g:7083:3: ruleDocument
            {
             before(grammarAccess.getUEAccess().getDocumentsDocumentParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getUEAccess().getDocumentsDocumentParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__DocumentsAssignment_7_2"


    // $ANTLR start "rule__UE__DocumentsAssignment_7_3_1"
    // InternalLangFil.g:7092:1: rule__UE__DocumentsAssignment_7_3_1 : ( ruleDocument ) ;
    public final void rule__UE__DocumentsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7096:1: ( ( ruleDocument ) )
            // InternalLangFil.g:7097:2: ( ruleDocument )
            {
            // InternalLangFil.g:7097:2: ( ruleDocument )
            // InternalLangFil.g:7098:3: ruleDocument
            {
             before(grammarAccess.getUEAccess().getDocumentsDocumentParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getUEAccess().getDocumentsDocumentParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__DocumentsAssignment_7_3_1"


    // $ANTLR start "rule__UE__PresentationAssignment_8_1"
    // InternalLangFil.g:7107:1: rule__UE__PresentationAssignment_8_1 : ( rulePresentation ) ;
    public final void rule__UE__PresentationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7111:1: ( ( rulePresentation ) )
            // InternalLangFil.g:7112:2: ( rulePresentation )
            {
            // InternalLangFil.g:7112:2: ( rulePresentation )
            // InternalLangFil.g:7113:3: rulePresentation
            {
             before(grammarAccess.getUEAccess().getPresentationPresentationParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            rulePresentation();

            state._fsp--;

             after(grammarAccess.getUEAccess().getPresentationPresentationParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UE__PresentationAssignment_8_1"


    // $ANTLR start "rule__S1__UesoptionnellesAssignment_3_2"
    // InternalLangFil.g:7122:1: rule__S1__UesoptionnellesAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__S1__UesoptionnellesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7126:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7127:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7127:2: ( ( ruleEString ) )
            // InternalLangFil.g:7128:3: ( ruleEString )
            {
             before(grammarAccess.getS1Access().getUesoptionnellesUECrossReference_3_2_0()); 
            // InternalLangFil.g:7129:3: ( ruleEString )
            // InternalLangFil.g:7130:4: ruleEString
            {
             before(grammarAccess.getS1Access().getUesoptionnellesUEEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getS1Access().getUesoptionnellesUEEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getS1Access().getUesoptionnellesUECrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__UesoptionnellesAssignment_3_2"


    // $ANTLR start "rule__S1__UesoptionnellesAssignment_3_3_1"
    // InternalLangFil.g:7141:1: rule__S1__UesoptionnellesAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__S1__UesoptionnellesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7145:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7146:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7146:2: ( ( ruleEString ) )
            // InternalLangFil.g:7147:3: ( ruleEString )
            {
             before(grammarAccess.getS1Access().getUesoptionnellesUECrossReference_3_3_1_0()); 
            // InternalLangFil.g:7148:3: ( ruleEString )
            // InternalLangFil.g:7149:4: ruleEString
            {
             before(grammarAccess.getS1Access().getUesoptionnellesUEEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getS1Access().getUesoptionnellesUEEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getS1Access().getUesoptionnellesUECrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__UesoptionnellesAssignment_3_3_1"


    // $ANTLR start "rule__S1__UesobligatoiresAssignment_4_2"
    // InternalLangFil.g:7160:1: rule__S1__UesobligatoiresAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__S1__UesobligatoiresAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7164:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7165:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7165:2: ( ( ruleEString ) )
            // InternalLangFil.g:7166:3: ( ruleEString )
            {
             before(grammarAccess.getS1Access().getUesobligatoiresUECrossReference_4_2_0()); 
            // InternalLangFil.g:7167:3: ( ruleEString )
            // InternalLangFil.g:7168:4: ruleEString
            {
             before(grammarAccess.getS1Access().getUesobligatoiresUEEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getS1Access().getUesobligatoiresUEEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getS1Access().getUesobligatoiresUECrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__UesobligatoiresAssignment_4_2"


    // $ANTLR start "rule__S1__UesobligatoiresAssignment_4_3_1"
    // InternalLangFil.g:7179:1: rule__S1__UesobligatoiresAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__S1__UesobligatoiresAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7183:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7184:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7184:2: ( ( ruleEString ) )
            // InternalLangFil.g:7185:3: ( ruleEString )
            {
             before(grammarAccess.getS1Access().getUesobligatoiresUECrossReference_4_3_1_0()); 
            // InternalLangFil.g:7186:3: ( ruleEString )
            // InternalLangFil.g:7187:4: ruleEString
            {
             before(grammarAccess.getS1Access().getUesobligatoiresUEEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getS1Access().getUesobligatoiresUEEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getS1Access().getUesobligatoiresUECrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S1__UesobligatoiresAssignment_4_3_1"


    // $ANTLR start "rule__S2__UesoptionnellesAssignment_3_2"
    // InternalLangFil.g:7198:1: rule__S2__UesoptionnellesAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__S2__UesoptionnellesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7202:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7203:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7203:2: ( ( ruleEString ) )
            // InternalLangFil.g:7204:3: ( ruleEString )
            {
             before(grammarAccess.getS2Access().getUesoptionnellesUECrossReference_3_2_0()); 
            // InternalLangFil.g:7205:3: ( ruleEString )
            // InternalLangFil.g:7206:4: ruleEString
            {
             before(grammarAccess.getS2Access().getUesoptionnellesUEEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getS2Access().getUesoptionnellesUEEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getS2Access().getUesoptionnellesUECrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__UesoptionnellesAssignment_3_2"


    // $ANTLR start "rule__S2__UesoptionnellesAssignment_3_3_1"
    // InternalLangFil.g:7217:1: rule__S2__UesoptionnellesAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__S2__UesoptionnellesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7221:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7222:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7222:2: ( ( ruleEString ) )
            // InternalLangFil.g:7223:3: ( ruleEString )
            {
             before(grammarAccess.getS2Access().getUesoptionnellesUECrossReference_3_3_1_0()); 
            // InternalLangFil.g:7224:3: ( ruleEString )
            // InternalLangFil.g:7225:4: ruleEString
            {
             before(grammarAccess.getS2Access().getUesoptionnellesUEEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getS2Access().getUesoptionnellesUEEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getS2Access().getUesoptionnellesUECrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__UesoptionnellesAssignment_3_3_1"


    // $ANTLR start "rule__S2__UesobligatoiresAssignment_4_2"
    // InternalLangFil.g:7236:1: rule__S2__UesobligatoiresAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__S2__UesobligatoiresAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7240:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7241:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7241:2: ( ( ruleEString ) )
            // InternalLangFil.g:7242:3: ( ruleEString )
            {
             before(grammarAccess.getS2Access().getUesobligatoiresUECrossReference_4_2_0()); 
            // InternalLangFil.g:7243:3: ( ruleEString )
            // InternalLangFil.g:7244:4: ruleEString
            {
             before(grammarAccess.getS2Access().getUesobligatoiresUEEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getS2Access().getUesobligatoiresUEEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getS2Access().getUesobligatoiresUECrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__UesobligatoiresAssignment_4_2"


    // $ANTLR start "rule__S2__UesobligatoiresAssignment_4_3_1"
    // InternalLangFil.g:7255:1: rule__S2__UesobligatoiresAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__S2__UesobligatoiresAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7259:1: ( ( ( ruleEString ) ) )
            // InternalLangFil.g:7260:2: ( ( ruleEString ) )
            {
            // InternalLangFil.g:7260:2: ( ( ruleEString ) )
            // InternalLangFil.g:7261:3: ( ruleEString )
            {
             before(grammarAccess.getS2Access().getUesobligatoiresUECrossReference_4_3_1_0()); 
            // InternalLangFil.g:7262:3: ( ruleEString )
            // InternalLangFil.g:7263:4: ruleEString
            {
             before(grammarAccess.getS2Access().getUesobligatoiresUEEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getS2Access().getUesobligatoiresUEEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getS2Access().getUesobligatoiresUECrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S2__UesobligatoiresAssignment_4_3_1"


    // $ANTLR start "rule__Video__NameAssignment_2"
    // InternalLangFil.g:7274:1: rule__Video__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7278:1: ( ( ruleEString ) )
            // InternalLangFil.g:7279:2: ( ruleEString )
            {
            // InternalLangFil.g:7279:2: ( ruleEString )
            // InternalLangFil.g:7280:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__NameAssignment_2"


    // $ANTLR start "rule__Video__DescriptionAssignment_4_1"
    // InternalLangFil.g:7289:1: rule__Video__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Video__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7293:1: ( ( ruleEString ) )
            // InternalLangFil.g:7294:2: ( ruleEString )
            {
            // InternalLangFil.g:7294:2: ( ruleEString )
            // InternalLangFil.g:7295:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Video__LienAssignment_5_1"
    // InternalLangFil.g:7304:1: rule__Video__LienAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Video__LienAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7308:1: ( ( ruleEString ) )
            // InternalLangFil.g:7309:2: ( ruleEString )
            {
            // InternalLangFil.g:7309:2: ( ruleEString )
            // InternalLangFil.g:7310:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getLienEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getLienEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__LienAssignment_5_1"


    // $ANTLR start "rule__Video__DureeAssignment_6_1"
    // InternalLangFil.g:7319:1: rule__Video__DureeAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Video__DureeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7323:1: ( ( ruleEString ) )
            // InternalLangFil.g:7324:2: ( ruleEString )
            {
            // InternalLangFil.g:7324:2: ( ruleEString )
            // InternalLangFil.g:7325:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getDureeEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getDureeEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__DureeAssignment_6_1"


    // $ANTLR start "rule__Fichier__NameAssignment_2"
    // InternalLangFil.g:7334:1: rule__Fichier__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Fichier__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7338:1: ( ( ruleEString ) )
            // InternalLangFil.g:7339:2: ( ruleEString )
            {
            // InternalLangFil.g:7339:2: ( ruleEString )
            // InternalLangFil.g:7340:3: ruleEString
            {
             before(grammarAccess.getFichierAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFichierAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__NameAssignment_2"


    // $ANTLR start "rule__Fichier__DescriptionAssignment_4_1"
    // InternalLangFil.g:7349:1: rule__Fichier__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Fichier__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7353:1: ( ( ruleEString ) )
            // InternalLangFil.g:7354:2: ( ruleEString )
            {
            // InternalLangFil.g:7354:2: ( ruleEString )
            // InternalLangFil.g:7355:3: ruleEString
            {
             before(grammarAccess.getFichierAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFichierAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Fichier__LienAssignment_5_1"
    // InternalLangFil.g:7364:1: rule__Fichier__LienAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Fichier__LienAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7368:1: ( ( ruleEString ) )
            // InternalLangFil.g:7369:2: ( ruleEString )
            {
            // InternalLangFil.g:7369:2: ( ruleEString )
            // InternalLangFil.g:7370:3: ruleEString
            {
             before(grammarAccess.getFichierAccess().getLienEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFichierAccess().getLienEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__LienAssignment_5_1"


    // $ANTLR start "rule__Fichier__AuteurAssignment_6_1"
    // InternalLangFil.g:7379:1: rule__Fichier__AuteurAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Fichier__AuteurAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7383:1: ( ( ruleEString ) )
            // InternalLangFil.g:7384:2: ( ruleEString )
            {
            // InternalLangFil.g:7384:2: ( ruleEString )
            // InternalLangFil.g:7385:3: ruleEString
            {
             before(grammarAccess.getFichierAccess().getAuteurEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFichierAccess().getAuteurEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fichier__AuteurAssignment_6_1"


    // $ANTLR start "rule__Audio__NameAssignment_2"
    // InternalLangFil.g:7394:1: rule__Audio__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Audio__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7398:1: ( ( ruleEString ) )
            // InternalLangFil.g:7399:2: ( ruleEString )
            {
            // InternalLangFil.g:7399:2: ( ruleEString )
            // InternalLangFil.g:7400:3: ruleEString
            {
             before(grammarAccess.getAudioAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__NameAssignment_2"


    // $ANTLR start "rule__Audio__DescriptionAssignment_4_1"
    // InternalLangFil.g:7409:1: rule__Audio__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Audio__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7413:1: ( ( ruleEString ) )
            // InternalLangFil.g:7414:2: ( ruleEString )
            {
            // InternalLangFil.g:7414:2: ( ruleEString )
            // InternalLangFil.g:7415:3: ruleEString
            {
             before(grammarAccess.getAudioAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Audio__LienAssignment_5_1"
    // InternalLangFil.g:7424:1: rule__Audio__LienAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Audio__LienAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7428:1: ( ( ruleEString ) )
            // InternalLangFil.g:7429:2: ( ruleEString )
            {
            // InternalLangFil.g:7429:2: ( ruleEString )
            // InternalLangFil.g:7430:3: ruleEString
            {
             before(grammarAccess.getAudioAccess().getLienEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getLienEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__LienAssignment_5_1"


    // $ANTLR start "rule__Audio__DureeAssignment_6_1"
    // InternalLangFil.g:7439:1: rule__Audio__DureeAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Audio__DureeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLangFil.g:7443:1: ( ( ruleEString ) )
            // InternalLangFil.g:7444:2: ( ruleEString )
            {
            // InternalLangFil.g:7444:2: ( ruleEString )
            // InternalLangFil.g:7445:3: ruleEString
            {
             before(grammarAccess.getAudioAccess().getDureeEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getDureeEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__DureeAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001CC2000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000508C0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000288000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C08C2000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000070000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000130000002000L});

}