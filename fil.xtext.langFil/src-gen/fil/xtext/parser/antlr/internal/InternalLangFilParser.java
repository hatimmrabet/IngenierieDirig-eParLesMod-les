package fil.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fil.xtext.services.LangFilGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLangFilParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Faculte'", "'Niveau'", "'{'", "'pseudo'", "'responsables'", "'('", "','", "')'", "'}'", "'Intervenant'", "'prenom'", "'Formation'", "'enseignants'", "'Presentation'", "'UE'", "'S1'", "'uesoptionnelles'", "'uesobligatoires'", "'S2'", "'Video'", "'description'", "'lien'", "'duree'", "'Fichier'", "'auteur'", "'Audio'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

        public InternalLangFilParser(TokenStream input, LangFilGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Faculte";
       	}

       	@Override
       	protected LangFilGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFaculte"
    // InternalLangFil.g:64:1: entryRuleFaculte returns [EObject current=null] : iv_ruleFaculte= ruleFaculte EOF ;
    public final EObject entryRuleFaculte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFaculte = null;


        try {
            // InternalLangFil.g:64:48: (iv_ruleFaculte= ruleFaculte EOF )
            // InternalLangFil.g:65:2: iv_ruleFaculte= ruleFaculte EOF
            {
             newCompositeNode(grammarAccess.getFaculteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFaculte=ruleFaculte();

            state._fsp--;

             current =iv_ruleFaculte; 
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
    // $ANTLR end "entryRuleFaculte"


    // $ANTLR start "ruleFaculte"
    // InternalLangFil.g:71:1: ruleFaculte returns [EObject current=null] : ( () otherlv_1= 'Faculte' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_niveaux_3_0= ruleNiveau ) ) | ( (lv_intervenants_4_0= ruleIntervenant ) ) )* ) ;
    public final EObject ruleFaculte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_niveaux_3_0 = null;

        EObject lv_intervenants_4_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:77:2: ( ( () otherlv_1= 'Faculte' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_niveaux_3_0= ruleNiveau ) ) | ( (lv_intervenants_4_0= ruleIntervenant ) ) )* ) )
            // InternalLangFil.g:78:2: ( () otherlv_1= 'Faculte' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_niveaux_3_0= ruleNiveau ) ) | ( (lv_intervenants_4_0= ruleIntervenant ) ) )* )
            {
            // InternalLangFil.g:78:2: ( () otherlv_1= 'Faculte' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_niveaux_3_0= ruleNiveau ) ) | ( (lv_intervenants_4_0= ruleIntervenant ) ) )* )
            // InternalLangFil.g:79:3: () otherlv_1= 'Faculte' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_niveaux_3_0= ruleNiveau ) ) | ( (lv_intervenants_4_0= ruleIntervenant ) ) )*
            {
            // InternalLangFil.g:79:3: ()
            // InternalLangFil.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFaculteAccess().getFaculteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFaculteAccess().getFaculteKeyword_1());
            		
            // InternalLangFil.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:91:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFaculteAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFaculteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLangFil.g:109:3: ( ( (lv_niveaux_3_0= ruleNiveau ) ) | ( (lv_intervenants_4_0= ruleIntervenant ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }
                else if ( (LA1_0==20) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLangFil.g:110:4: ( (lv_niveaux_3_0= ruleNiveau ) )
            	    {
            	    // InternalLangFil.g:110:4: ( (lv_niveaux_3_0= ruleNiveau ) )
            	    // InternalLangFil.g:111:5: (lv_niveaux_3_0= ruleNiveau )
            	    {
            	    // InternalLangFil.g:111:5: (lv_niveaux_3_0= ruleNiveau )
            	    // InternalLangFil.g:112:6: lv_niveaux_3_0= ruleNiveau
            	    {

            	    						newCompositeNode(grammarAccess.getFaculteAccess().getNiveauxNiveauParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_niveaux_3_0=ruleNiveau();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFaculteRule());
            	    						}
            	    						add(
            	    							current,
            	    							"niveaux",
            	    							lv_niveaux_3_0,
            	    							"fil.xtext.LangFil.Niveau");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLangFil.g:130:4: ( (lv_intervenants_4_0= ruleIntervenant ) )
            	    {
            	    // InternalLangFil.g:130:4: ( (lv_intervenants_4_0= ruleIntervenant ) )
            	    // InternalLangFil.g:131:5: (lv_intervenants_4_0= ruleIntervenant )
            	    {
            	    // InternalLangFil.g:131:5: (lv_intervenants_4_0= ruleIntervenant )
            	    // InternalLangFil.g:132:6: lv_intervenants_4_0= ruleIntervenant
            	    {

            	    						newCompositeNode(grammarAccess.getFaculteAccess().getIntervenantsIntervenantParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_intervenants_4_0=ruleIntervenant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFaculteRule());
            	    						}
            	    						add(
            	    							current,
            	    							"intervenants",
            	    							lv_intervenants_4_0,
            	    							"fil.xtext.LangFil.Intervenant");
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
    // $ANTLR end "ruleFaculte"


    // $ANTLR start "entryRuleDocument"
    // InternalLangFil.g:154:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalLangFil.g:154:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalLangFil.g:155:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalLangFil.g:161:1: ruleDocument returns [EObject current=null] : (this_Video_0= ruleVideo | this_Fichier_1= ruleFichier | this_Audio_2= ruleAudio ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject this_Video_0 = null;

        EObject this_Fichier_1 = null;

        EObject this_Audio_2 = null;



        	enterRule();

        try {
            // InternalLangFil.g:167:2: ( (this_Video_0= ruleVideo | this_Fichier_1= ruleFichier | this_Audio_2= ruleAudio ) )
            // InternalLangFil.g:168:2: (this_Video_0= ruleVideo | this_Fichier_1= ruleFichier | this_Audio_2= ruleAudio )
            {
            // InternalLangFil.g:168:2: (this_Video_0= ruleVideo | this_Fichier_1= ruleFichier | this_Audio_2= ruleAudio )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLangFil.g:169:3: this_Video_0= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getDocumentAccess().getVideoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_0=ruleVideo();

                    state._fsp--;


                    			current = this_Video_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLangFil.g:178:3: this_Fichier_1= ruleFichier
                    {

                    			newCompositeNode(grammarAccess.getDocumentAccess().getFichierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fichier_1=ruleFichier();

                    state._fsp--;


                    			current = this_Fichier_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLangFil.g:187:3: this_Audio_2= ruleAudio
                    {

                    			newCompositeNode(grammarAccess.getDocumentAccess().getAudioParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Audio_2=ruleAudio();

                    state._fsp--;


                    			current = this_Audio_2;
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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleEString"
    // InternalLangFil.g:199:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalLangFil.g:199:47: (iv_ruleEString= ruleEString EOF )
            // InternalLangFil.g:200:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalLangFil.g:206:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalLangFil.g:212:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalLangFil.g:213:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalLangFil.g:213:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLangFil.g:214:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLangFil.g:222:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleNiveau"
    // InternalLangFil.g:233:1: entryRuleNiveau returns [EObject current=null] : iv_ruleNiveau= ruleNiveau EOF ;
    public final EObject entryRuleNiveau() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNiveau = null;


        try {
            // InternalLangFil.g:233:47: (iv_ruleNiveau= ruleNiveau EOF )
            // InternalLangFil.g:234:2: iv_ruleNiveau= ruleNiveau EOF
            {
             newCompositeNode(grammarAccess.getNiveauRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNiveau=ruleNiveau();

            state._fsp--;

             current =iv_ruleNiveau; 
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
    // $ANTLR end "entryRuleNiveau"


    // $ANTLR start "ruleNiveau"
    // InternalLangFil.g:240:1: ruleNiveau returns [EObject current=null] : ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_16= '}' ) ;
    public final EObject ruleNiveau() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pseudo_6_0 = null;

        EObject lv_presentation_13_0 = null;

        EObject lv_formations_14_0 = null;

        EObject lv_ues_15_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:246:2: ( ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_16= '}' ) )
            // InternalLangFil.g:247:2: ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_16= '}' )
            {
            // InternalLangFil.g:247:2: ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_16= '}' )
            // InternalLangFil.g:248:3: () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_16= '}'
            {
            // InternalLangFil.g:248:3: ()
            // InternalLangFil.g:249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNiveauAccess().getNiveauAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNiveauAccess().getNiveauKeyword_1());
            		
            // InternalLangFil.g:259:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:260:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:260:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:261:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNiveauAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNiveauRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:282:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?) ) )
            // InternalLangFil.g:283:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?) )
            {
            // InternalLangFil.g:283:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?) )
            // InternalLangFil.g:284:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNiveauAccess().getUnorderedGroup_4());
            				
            // InternalLangFil.g:287:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?)
            // InternalLangFil.g:288:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+ {...}?
            {
            // InternalLangFil.g:288:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=5;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 2) ) {
                    alt7=3;
                }
                else if ( ( LA7_0 == 22 || LA7_0 == 25 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 3) ) {
                    alt7=4;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLangFil.g:289:4: ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalLangFil.g:289:4: ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) )
            	    // InternalLangFil.g:290:5: {...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNiveau", "getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalLangFil.g:290:103: ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) )
            	    // InternalLangFil.g:291:6: ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalLangFil.g:294:9: ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) )
            	    // InternalLangFil.g:294:10: {...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNiveau", "true");
            	    }
            	    // InternalLangFil.g:294:19: (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )
            	    // InternalLangFil.g:294:20: otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getNiveauAccess().getPseudoKeyword_4_0_0());
            	    								
            	    // InternalLangFil.g:298:9: ( (lv_pseudo_6_0= ruleEString ) )
            	    // InternalLangFil.g:299:10: (lv_pseudo_6_0= ruleEString )
            	    {
            	    // InternalLangFil.g:299:10: (lv_pseudo_6_0= ruleEString )
            	    // InternalLangFil.g:300:11: lv_pseudo_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getNiveauAccess().getPseudoEStringParserRuleCall_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_pseudo_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNiveauRule());
            	    											}
            	    											set(
            	    												current,
            	    												"pseudo",
            	    												lv_pseudo_6_0,
            	    												"fil.xtext.LangFil.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNiveauAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLangFil.g:323:4: ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:323:4: ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) )
            	    // InternalLangFil.g:324:5: {...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNiveau", "getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalLangFil.g:324:103: ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) )
            	    // InternalLangFil.g:325:6: ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalLangFil.g:328:9: ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) )
            	    // InternalLangFil.g:328:10: {...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNiveau", "true");
            	    }
            	    // InternalLangFil.g:328:19: (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )
            	    // InternalLangFil.g:328:20: otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_8); 

            	    									newLeafNode(otherlv_7, grammarAccess.getNiveauAccess().getResponsablesKeyword_4_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_8, grammarAccess.getNiveauAccess().getLeftParenthesisKeyword_4_1_1());
            	    								
            	    // InternalLangFil.g:336:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:337:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:337:10: ( ruleEString )
            	    // InternalLangFil.g:338:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getNiveauRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getNiveauAccess().getResponsablesIntervenantCrossReference_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:352:9: (otherlv_10= ',' ( ( ruleEString ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==17) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalLangFil.g:353:10: otherlv_10= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getNiveauAccess().getCommaKeyword_4_1_3_0());
            	    	    									
            	    	    // InternalLangFil.g:357:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:358:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:358:11: ( ruleEString )
            	    	    // InternalLangFil.g:359:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getNiveauRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getNiveauAccess().getResponsablesIntervenantCrossReference_4_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,18,FOLLOW_7); 

            	    									newLeafNode(otherlv_12, grammarAccess.getNiveauAccess().getRightParenthesisKeyword_4_1_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNiveauAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLangFil.g:384:4: ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) )
            	    {
            	    // InternalLangFil.g:384:4: ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) )
            	    // InternalLangFil.g:385:5: {...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNiveau", "getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalLangFil.g:385:103: ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) )
            	    // InternalLangFil.g:386:6: ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalLangFil.g:389:9: ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) )
            	    // InternalLangFil.g:389:10: {...}? => ( (lv_presentation_13_0= rulePresentation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNiveau", "true");
            	    }
            	    // InternalLangFil.g:389:19: ( (lv_presentation_13_0= rulePresentation ) )
            	    // InternalLangFil.g:389:20: (lv_presentation_13_0= rulePresentation )
            	    {
            	    // InternalLangFil.g:389:20: (lv_presentation_13_0= rulePresentation )
            	    // InternalLangFil.g:390:10: lv_presentation_13_0= rulePresentation
            	    {

            	    										newCompositeNode(grammarAccess.getNiveauAccess().getPresentationPresentationParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_presentation_13_0=rulePresentation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getNiveauRule());
            	    										}
            	    										set(
            	    											current,
            	    											"presentation",
            	    											lv_presentation_13_0,
            	    											"fil.xtext.LangFil.Presentation");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNiveauAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLangFil.g:412:4: ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) )
            	    {
            	    // InternalLangFil.g:412:4: ({...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ ) )
            	    // InternalLangFil.g:413:5: {...}? => ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNiveau", "getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalLangFil.g:413:103: ( ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+ )
            	    // InternalLangFil.g:414:6: ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalLangFil.g:417:9: ({...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==22) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }
            	        else if ( (LA6_0==25) ) {
            	            int LA6_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalLangFil.g:417:10: {...}? => ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleNiveau", "true");
            	    	    }
            	    	    // InternalLangFil.g:417:19: ( ( (lv_formations_14_0= ruleFormation ) ) | ( (lv_ues_15_0= ruleUE ) ) )
            	    	    int alt5=2;
            	    	    int LA5_0 = input.LA(1);

            	    	    if ( (LA5_0==22) ) {
            	    	        alt5=1;
            	    	    }
            	    	    else if ( (LA5_0==25) ) {
            	    	        alt5=2;
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 5, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt5) {
            	    	        case 1 :
            	    	            // InternalLangFil.g:417:20: ( (lv_formations_14_0= ruleFormation ) )
            	    	            {
            	    	            // InternalLangFil.g:417:20: ( (lv_formations_14_0= ruleFormation ) )
            	    	            // InternalLangFil.g:418:10: (lv_formations_14_0= ruleFormation )
            	    	            {
            	    	            // InternalLangFil.g:418:10: (lv_formations_14_0= ruleFormation )
            	    	            // InternalLangFil.g:419:11: lv_formations_14_0= ruleFormation
            	    	            {

            	    	            											newCompositeNode(grammarAccess.getNiveauAccess().getFormationsFormationParserRuleCall_4_3_0_0());
            	    	            										
            	    	            pushFollow(FOLLOW_7);
            	    	            lv_formations_14_0=ruleFormation();

            	    	            state._fsp--;


            	    	            											if (current==null) {
            	    	            												current = createModelElementForParent(grammarAccess.getNiveauRule());
            	    	            											}
            	    	            											add(
            	    	            												current,
            	    	            												"formations",
            	    	            												lv_formations_14_0,
            	    	            												"fil.xtext.LangFil.Formation");
            	    	            											afterParserOrEnumRuleCall();
            	    	            										

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalLangFil.g:437:9: ( (lv_ues_15_0= ruleUE ) )
            	    	            {
            	    	            // InternalLangFil.g:437:9: ( (lv_ues_15_0= ruleUE ) )
            	    	            // InternalLangFil.g:438:10: (lv_ues_15_0= ruleUE )
            	    	            {
            	    	            // InternalLangFil.g:438:10: (lv_ues_15_0= ruleUE )
            	    	            // InternalLangFil.g:439:11: lv_ues_15_0= ruleUE
            	    	            {

            	    	            											newCompositeNode(grammarAccess.getNiveauAccess().getUesUEParserRuleCall_4_3_1_0());
            	    	            										
            	    	            pushFollow(FOLLOW_7);
            	    	            lv_ues_15_0=ruleUE();

            	    	            state._fsp--;


            	    	            											if (current==null) {
            	    	            												current = createModelElementForParent(grammarAccess.getNiveauRule());
            	    	            											}
            	    	            											add(
            	    	            												current,
            	    	            												"ues",
            	    	            												lv_ues_15_0,
            	    	            												"fil.xtext.LangFil.UE");
            	    	            											afterParserOrEnumRuleCall();
            	    	            										

            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNiveauAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNiveauAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleNiveau", "getUnorderedGroupHelper().canLeave(grammarAccess.getNiveauAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getNiveauAccess().getUnorderedGroup_4());
            				

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNiveau"


    // $ANTLR start "entryRuleIntervenant"
    // InternalLangFil.g:478:1: entryRuleIntervenant returns [EObject current=null] : iv_ruleIntervenant= ruleIntervenant EOF ;
    public final EObject entryRuleIntervenant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervenant = null;


        try {
            // InternalLangFil.g:478:52: (iv_ruleIntervenant= ruleIntervenant EOF )
            // InternalLangFil.g:479:2: iv_ruleIntervenant= ruleIntervenant EOF
            {
             newCompositeNode(grammarAccess.getIntervenantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntervenant=ruleIntervenant();

            state._fsp--;

             current =iv_ruleIntervenant; 
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
    // $ANTLR end "entryRuleIntervenant"


    // $ANTLR start "ruleIntervenant"
    // InternalLangFil.g:485:1: ruleIntervenant returns [EObject current=null] : ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleIntervenant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_prenom_5_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:491:2: ( ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalLangFil.g:492:2: ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalLangFil.g:492:2: ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalLangFil.g:493:3: () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalLangFil.g:493:3: ()
            // InternalLangFil.g:494:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntervenantAccess().getIntervenantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervenantAccess().getIntervenantKeyword_1());
            		
            // InternalLangFil.g:504:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:505:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:505:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:506:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntervenantAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervenantRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getIntervenantAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:527:3: (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLangFil.g:528:4: otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getIntervenantAccess().getPrenomKeyword_4_0());
                    			
                    // InternalLangFil.g:532:4: ( (lv_prenom_5_0= ruleEString ) )
                    // InternalLangFil.g:533:5: (lv_prenom_5_0= ruleEString )
                    {
                    // InternalLangFil.g:533:5: (lv_prenom_5_0= ruleEString )
                    // InternalLangFil.g:534:6: lv_prenom_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntervenantAccess().getPrenomEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_prenom_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntervenantRule());
                    						}
                    						set(
                    							current,
                    							"prenom",
                    							lv_prenom_5_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIntervenantAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleIntervenant"


    // $ANTLR start "entryRuleFormation"
    // InternalLangFil.g:560:1: entryRuleFormation returns [EObject current=null] : iv_ruleFormation= ruleFormation EOF ;
    public final EObject entryRuleFormation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormation = null;


        try {
            // InternalLangFil.g:560:50: (iv_ruleFormation= ruleFormation EOF )
            // InternalLangFil.g:561:2: iv_ruleFormation= ruleFormation EOF
            {
             newCompositeNode(grammarAccess.getFormationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormation=ruleFormation();

            state._fsp--;

             current =iv_ruleFormation; 
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
    // $ANTLR end "entryRuleFormation"


    // $ANTLR start "ruleFormation"
    // InternalLangFil.g:567:1: ruleFormation returns [EObject current=null] : ( () otherlv_1= 'Formation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_23= '}' ) ;
    public final EObject ruleFormation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pseudo_6_0 = null;

        EObject lv_presentation_19_0 = null;

        EObject lv_s1_20_0 = null;

        EObject lv_s2_21_0 = null;

        EObject lv_documents_22_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:573:2: ( ( () otherlv_1= 'Formation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_23= '}' ) )
            // InternalLangFil.g:574:2: ( () otherlv_1= 'Formation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_23= '}' )
            {
            // InternalLangFil.g:574:2: ( () otherlv_1= 'Formation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_23= '}' )
            // InternalLangFil.g:575:3: () otherlv_1= 'Formation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_23= '}'
            {
            // InternalLangFil.g:575:3: ()
            // InternalLangFil.g:576:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormationAccess().getFormationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFormationAccess().getFormationKeyword_1());
            		
            // InternalLangFil.g:586:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:587:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:587:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:588:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFormationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getFormationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:609:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) )
            // InternalLangFil.g:610:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) )
            {
            // InternalLangFil.g:610:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) )
            // InternalLangFil.g:611:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            				
            // InternalLangFil.g:614:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?)
            // InternalLangFil.g:615:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?
            {
            // InternalLangFil.g:615:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=8;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 3) ) {
                    alt12=4;
                }
                else if ( LA12_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 4) ) {
                    alt12=5;
                }
                else if ( LA12_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 5) ) {
                    alt12=6;
                }
                else if ( ( LA12_0 == 30 || LA12_0 == 34 || LA12_0 == 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 6) ) {
                    alt12=7;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLangFil.g:616:4: ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalLangFil.g:616:4: ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) )
            	    // InternalLangFil.g:617:5: {...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalLangFil.g:617:106: ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) )
            	    // InternalLangFil.g:618:6: ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalLangFil.g:621:9: ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) )
            	    // InternalLangFil.g:621:10: {...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:621:19: (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )
            	    // InternalLangFil.g:621:20: otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getFormationAccess().getPseudoKeyword_4_0_0());
            	    								
            	    // InternalLangFil.g:625:9: ( (lv_pseudo_6_0= ruleEString ) )
            	    // InternalLangFil.g:626:10: (lv_pseudo_6_0= ruleEString )
            	    {
            	    // InternalLangFil.g:626:10: (lv_pseudo_6_0= ruleEString )
            	    // InternalLangFil.g:627:11: lv_pseudo_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getFormationAccess().getPseudoEStringParserRuleCall_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_pseudo_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getFormationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"pseudo",
            	    												lv_pseudo_6_0,
            	    												"fil.xtext.LangFil.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLangFil.g:650:4: ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:650:4: ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) )
            	    // InternalLangFil.g:651:5: {...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalLangFil.g:651:106: ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) )
            	    // InternalLangFil.g:652:6: ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalLangFil.g:655:9: ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) )
            	    // InternalLangFil.g:655:10: {...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:655:19: (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )
            	    // InternalLangFil.g:655:20: otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_8); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFormationAccess().getResponsablesKeyword_4_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_8, grammarAccess.getFormationAccess().getLeftParenthesisKeyword_4_1_1());
            	    								
            	    // InternalLangFil.g:663:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:664:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:664:10: ( ruleEString )
            	    // InternalLangFil.g:665:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getFormationRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getFormationAccess().getResponsablesIntervenantCrossReference_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:679:9: (otherlv_10= ',' ( ( ruleEString ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==17) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalLangFil.g:680:10: otherlv_10= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getFormationAccess().getCommaKeyword_4_1_3_0());
            	    	    									
            	    	    // InternalLangFil.g:684:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:685:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:685:11: ( ruleEString )
            	    	    // InternalLangFil.g:686:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getFormationRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getFormationAccess().getResponsablesIntervenantCrossReference_4_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_12, grammarAccess.getFormationAccess().getRightParenthesisKeyword_4_1_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLangFil.g:711:4: ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:711:4: ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) )
            	    // InternalLangFil.g:712:5: {...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalLangFil.g:712:106: ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) )
            	    // InternalLangFil.g:713:6: ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalLangFil.g:716:9: ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) )
            	    // InternalLangFil.g:716:10: {...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:716:19: (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )
            	    // InternalLangFil.g:716:20: otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
            	    {
            	    otherlv_13=(Token)match(input,23,FOLLOW_8); 

            	    									newLeafNode(otherlv_13, grammarAccess.getFormationAccess().getEnseignantsKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_14, grammarAccess.getFormationAccess().getLeftParenthesisKeyword_4_2_1());
            	    								
            	    // InternalLangFil.g:724:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:725:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:725:10: ( ruleEString )
            	    // InternalLangFil.g:726:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getFormationRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getFormationAccess().getEnseignantsIntervenantCrossReference_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:740:9: (otherlv_16= ',' ( ( ruleEString ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==17) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalLangFil.g:741:10: otherlv_16= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_16, grammarAccess.getFormationAccess().getCommaKeyword_4_2_3_0());
            	    	    									
            	    	    // InternalLangFil.g:745:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:746:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:746:11: ( ruleEString )
            	    	    // InternalLangFil.g:747:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getFormationRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getFormationAccess().getEnseignantsIntervenantCrossReference_4_2_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_18, grammarAccess.getFormationAccess().getRightParenthesisKeyword_4_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLangFil.g:772:4: ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) )
            	    {
            	    // InternalLangFil.g:772:4: ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) )
            	    // InternalLangFil.g:773:5: {...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalLangFil.g:773:106: ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) )
            	    // InternalLangFil.g:774:6: ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalLangFil.g:777:9: ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) )
            	    // InternalLangFil.g:777:10: {...}? => ( (lv_presentation_19_0= rulePresentation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:777:19: ( (lv_presentation_19_0= rulePresentation ) )
            	    // InternalLangFil.g:777:20: (lv_presentation_19_0= rulePresentation )
            	    {
            	    // InternalLangFil.g:777:20: (lv_presentation_19_0= rulePresentation )
            	    // InternalLangFil.g:778:10: lv_presentation_19_0= rulePresentation
            	    {

            	    										newCompositeNode(grammarAccess.getFormationAccess().getPresentationPresentationParserRuleCall_4_3_0());
            	    									
            	    pushFollow(FOLLOW_13);
            	    lv_presentation_19_0=rulePresentation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFormationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"presentation",
            	    											lv_presentation_19_0,
            	    											"fil.xtext.LangFil.Presentation");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLangFil.g:800:4: ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) )
            	    {
            	    // InternalLangFil.g:800:4: ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) )
            	    // InternalLangFil.g:801:5: {...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalLangFil.g:801:106: ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) )
            	    // InternalLangFil.g:802:6: ({...}? => ( (lv_s1_20_0= ruleS1 ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalLangFil.g:805:9: ({...}? => ( (lv_s1_20_0= ruleS1 ) ) )
            	    // InternalLangFil.g:805:10: {...}? => ( (lv_s1_20_0= ruleS1 ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:805:19: ( (lv_s1_20_0= ruleS1 ) )
            	    // InternalLangFil.g:805:20: (lv_s1_20_0= ruleS1 )
            	    {
            	    // InternalLangFil.g:805:20: (lv_s1_20_0= ruleS1 )
            	    // InternalLangFil.g:806:10: lv_s1_20_0= ruleS1
            	    {

            	    										newCompositeNode(grammarAccess.getFormationAccess().getS1S1ParserRuleCall_4_4_0());
            	    									
            	    pushFollow(FOLLOW_13);
            	    lv_s1_20_0=ruleS1();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFormationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"s1",
            	    											lv_s1_20_0,
            	    											"fil.xtext.LangFil.S1");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalLangFil.g:828:4: ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) )
            	    {
            	    // InternalLangFil.g:828:4: ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) )
            	    // InternalLangFil.g:829:5: {...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalLangFil.g:829:106: ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) )
            	    // InternalLangFil.g:830:6: ({...}? => ( (lv_s2_21_0= ruleS2 ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalLangFil.g:833:9: ({...}? => ( (lv_s2_21_0= ruleS2 ) ) )
            	    // InternalLangFil.g:833:10: {...}? => ( (lv_s2_21_0= ruleS2 ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:833:19: ( (lv_s2_21_0= ruleS2 ) )
            	    // InternalLangFil.g:833:20: (lv_s2_21_0= ruleS2 )
            	    {
            	    // InternalLangFil.g:833:20: (lv_s2_21_0= ruleS2 )
            	    // InternalLangFil.g:834:10: lv_s2_21_0= ruleS2
            	    {

            	    										newCompositeNode(grammarAccess.getFormationAccess().getS2S2ParserRuleCall_4_5_0());
            	    									
            	    pushFollow(FOLLOW_13);
            	    lv_s2_21_0=ruleS2();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFormationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"s2",
            	    											lv_s2_21_0,
            	    											"fil.xtext.LangFil.S2");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalLangFil.g:856:4: ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) )
            	    {
            	    // InternalLangFil.g:856:4: ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) )
            	    // InternalLangFil.g:857:5: {...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalLangFil.g:857:106: ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ )
            	    // InternalLangFil.g:858:6: ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalLangFil.g:861:9: ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        switch ( input.LA(1) ) {
            	        case 30:
            	            {
            	            int LA11_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt11=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA11_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt11=1;
            	            }


            	            }
            	            break;
            	        case 36:
            	            {
            	            int LA11_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt11=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalLangFil.g:861:10: {...}? => ( (lv_documents_22_0= ruleDocument ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    	    }
            	    	    // InternalLangFil.g:861:19: ( (lv_documents_22_0= ruleDocument ) )
            	    	    // InternalLangFil.g:861:20: (lv_documents_22_0= ruleDocument )
            	    	    {
            	    	    // InternalLangFil.g:861:20: (lv_documents_22_0= ruleDocument )
            	    	    // InternalLangFil.g:862:10: lv_documents_22_0= ruleDocument
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getFormationAccess().getDocumentsDocumentParserRuleCall_4_6_0());
            	    	    									
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_documents_22_0=ruleDocument();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getFormationRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"documents",
            	    	    											lv_documents_22_0,
            	    	    											"fil.xtext.LangFil.Document");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt11 >= 1 ) break loop11;
            	                EarlyExitException eee =
            	                    new EarlyExitException(11, input);
            	                throw eee;
            	        }
            	        cnt11++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFormationAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canLeave(grammarAccess.getFormationAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            				

            }

            otherlv_23=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getFormationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFormation"


    // $ANTLR start "entryRulePresentation"
    // InternalLangFil.g:900:1: entryRulePresentation returns [EObject current=null] : iv_rulePresentation= rulePresentation EOF ;
    public final EObject entryRulePresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentation = null;


        try {
            // InternalLangFil.g:900:53: (iv_rulePresentation= rulePresentation EOF )
            // InternalLangFil.g:901:2: iv_rulePresentation= rulePresentation EOF
            {
             newCompositeNode(grammarAccess.getPresentationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresentation=rulePresentation();

            state._fsp--;

             current =iv_rulePresentation; 
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
    // $ANTLR end "entryRulePresentation"


    // $ANTLR start "rulePresentation"
    // InternalLangFil.g:907:1: rulePresentation returns [EObject current=null] : ( () otherlv_1= 'Presentation' ( (lv_contenue_2_0= ruleEString ) ) ) ;
    public final EObject rulePresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_contenue_2_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:913:2: ( ( () otherlv_1= 'Presentation' ( (lv_contenue_2_0= ruleEString ) ) ) )
            // InternalLangFil.g:914:2: ( () otherlv_1= 'Presentation' ( (lv_contenue_2_0= ruleEString ) ) )
            {
            // InternalLangFil.g:914:2: ( () otherlv_1= 'Presentation' ( (lv_contenue_2_0= ruleEString ) ) )
            // InternalLangFil.g:915:3: () otherlv_1= 'Presentation' ( (lv_contenue_2_0= ruleEString ) )
            {
            // InternalLangFil.g:915:3: ()
            // InternalLangFil.g:916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPresentationAccess().getPresentationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPresentationAccess().getPresentationKeyword_1());
            		
            // InternalLangFil.g:926:3: ( (lv_contenue_2_0= ruleEString ) )
            // InternalLangFil.g:927:4: (lv_contenue_2_0= ruleEString )
            {
            // InternalLangFil.g:927:4: (lv_contenue_2_0= ruleEString )
            // InternalLangFil.g:928:5: lv_contenue_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPresentationAccess().getContenueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_contenue_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPresentationRule());
            					}
            					set(
            						current,
            						"contenue",
            						lv_contenue_2_0,
            						"fil.xtext.LangFil.EString");
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
    // $ANTLR end "rulePresentation"


    // $ANTLR start "entryRuleUE"
    // InternalLangFil.g:949:1: entryRuleUE returns [EObject current=null] : iv_ruleUE= ruleUE EOF ;
    public final EObject entryRuleUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUE = null;


        try {
            // InternalLangFil.g:949:43: (iv_ruleUE= ruleUE EOF )
            // InternalLangFil.g:950:2: iv_ruleUE= ruleUE EOF
            {
             newCompositeNode(grammarAccess.getUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUE=ruleUE();

            state._fsp--;

             current =iv_ruleUE; 
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
    // $ANTLR end "entryRuleUE"


    // $ANTLR start "ruleUE"
    // InternalLangFil.g:956:1: ruleUE returns [EObject current=null] : ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' ) ;
    public final EObject ruleUE() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pseudo_6_0 = null;

        EObject lv_presentation_7_0 = null;

        EObject lv_documents_20_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:962:2: ( ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' ) )
            // InternalLangFil.g:963:2: ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' )
            {
            // InternalLangFil.g:963:2: ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}' )
            // InternalLangFil.g:964:3: () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_21= '}'
            {
            // InternalLangFil.g:964:3: ()
            // InternalLangFil.g:965:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUEAccess().getUEAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUEAccess().getUEKeyword_1());
            		
            // InternalLangFil.g:975:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:976:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:976:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:977:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUEAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:998:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) )
            // InternalLangFil.g:999:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?) )
            {
            // InternalLangFil.g:999:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?) )
            // InternalLangFil.g:1000:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getUEAccess().getUnorderedGroup_4());
            				
            // InternalLangFil.g:1003:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?)
            // InternalLangFil.g:1004:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+ {...}?
            {
            // InternalLangFil.g:1004:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=6;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 2) ) {
                    alt16=3;
                }
                else if ( LA16_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 3) ) {
                    alt16=4;
                }
                else if ( ( LA16_0 == 30 || LA16_0 == 34 || LA16_0 == 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 4) ) {
                    alt16=5;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLangFil.g:1005:4: ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalLangFil.g:1005:4: ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) )
            	    // InternalLangFil.g:1006:5: {...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalLangFil.g:1006:99: ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) )
            	    // InternalLangFil.g:1007:6: ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUEAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalLangFil.g:1010:9: ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) )
            	    // InternalLangFil.g:1010:10: {...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "true");
            	    }
            	    // InternalLangFil.g:1010:19: (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )
            	    // InternalLangFil.g:1010:20: otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getUEAccess().getPseudoKeyword_4_0_0());
            	    								
            	    // InternalLangFil.g:1014:9: ( (lv_pseudo_6_0= ruleEString ) )
            	    // InternalLangFil.g:1015:10: (lv_pseudo_6_0= ruleEString )
            	    {
            	    // InternalLangFil.g:1015:10: (lv_pseudo_6_0= ruleEString )
            	    // InternalLangFil.g:1016:11: lv_pseudo_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getUEAccess().getPseudoEStringParserRuleCall_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_pseudo_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getUERule());
            	    											}
            	    											set(
            	    												current,
            	    												"pseudo",
            	    												lv_pseudo_6_0,
            	    												"fil.xtext.LangFil.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUEAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLangFil.g:1039:4: ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) )
            	    {
            	    // InternalLangFil.g:1039:4: ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) )
            	    // InternalLangFil.g:1040:5: {...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalLangFil.g:1040:99: ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) )
            	    // InternalLangFil.g:1041:6: ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUEAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalLangFil.g:1044:9: ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) )
            	    // InternalLangFil.g:1044:10: {...}? => ( (lv_presentation_7_0= rulePresentation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "true");
            	    }
            	    // InternalLangFil.g:1044:19: ( (lv_presentation_7_0= rulePresentation ) )
            	    // InternalLangFil.g:1044:20: (lv_presentation_7_0= rulePresentation )
            	    {
            	    // InternalLangFil.g:1044:20: (lv_presentation_7_0= rulePresentation )
            	    // InternalLangFil.g:1045:10: lv_presentation_7_0= rulePresentation
            	    {

            	    										newCompositeNode(grammarAccess.getUEAccess().getPresentationPresentationParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_13);
            	    lv_presentation_7_0=rulePresentation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getUERule());
            	    										}
            	    										set(
            	    											current,
            	    											"presentation",
            	    											lv_presentation_7_0,
            	    											"fil.xtext.LangFil.Presentation");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUEAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLangFil.g:1067:4: ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:1067:4: ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) )
            	    // InternalLangFil.g:1068:5: {...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalLangFil.g:1068:99: ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) )
            	    // InternalLangFil.g:1069:6: ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUEAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalLangFil.g:1072:9: ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) )
            	    // InternalLangFil.g:1072:10: {...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "true");
            	    }
            	    // InternalLangFil.g:1072:19: (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )
            	    // InternalLangFil.g:1072:20: otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_8); 

            	    									newLeafNode(otherlv_8, grammarAccess.getUEAccess().getResponsablesKeyword_4_2_0());
            	    								
            	    otherlv_9=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getUEAccess().getLeftParenthesisKeyword_4_2_1());
            	    								
            	    // InternalLangFil.g:1080:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:1081:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:1081:10: ( ruleEString )
            	    // InternalLangFil.g:1082:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getUERule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:1096:9: (otherlv_11= ',' ( ( ruleEString ) ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==17) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalLangFil.g:1097:10: otherlv_11= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_11, grammarAccess.getUEAccess().getCommaKeyword_4_2_3_0());
            	    	    									
            	    	    // InternalLangFil.g:1101:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:1102:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:1102:11: ( ruleEString )
            	    	    // InternalLangFil.g:1103:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getUERule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_4_2_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    otherlv_13=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_13, grammarAccess.getUEAccess().getRightParenthesisKeyword_4_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUEAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLangFil.g:1128:4: ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:1128:4: ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) )
            	    // InternalLangFil.g:1129:5: {...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalLangFil.g:1129:99: ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) )
            	    // InternalLangFil.g:1130:6: ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUEAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalLangFil.g:1133:9: ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) )
            	    // InternalLangFil.g:1133:10: {...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "true");
            	    }
            	    // InternalLangFil.g:1133:19: (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )
            	    // InternalLangFil.g:1133:20: otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
            	    {
            	    otherlv_14=(Token)match(input,23,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getUEAccess().getEnseignantsKeyword_4_3_0());
            	    								
            	    otherlv_15=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getUEAccess().getLeftParenthesisKeyword_4_3_1());
            	    								
            	    // InternalLangFil.g:1141:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:1142:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:1142:10: ( ruleEString )
            	    // InternalLangFil.g:1143:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getUERule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getUEAccess().getEnseignantsIntervenantCrossReference_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:1157:9: (otherlv_17= ',' ( ( ruleEString ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==17) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalLangFil.g:1158:10: otherlv_17= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getUEAccess().getCommaKeyword_4_3_3_0());
            	    	    									
            	    	    // InternalLangFil.g:1162:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:1163:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:1163:11: ( ruleEString )
            	    	    // InternalLangFil.g:1164:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getUERule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getUEAccess().getEnseignantsIntervenantCrossReference_4_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,18,FOLLOW_13); 

            	    									newLeafNode(otherlv_19, grammarAccess.getUEAccess().getRightParenthesisKeyword_4_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUEAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLangFil.g:1189:4: ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) )
            	    {
            	    // InternalLangFil.g:1189:4: ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) )
            	    // InternalLangFil.g:1190:5: {...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalLangFil.g:1190:99: ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ )
            	    // InternalLangFil.g:1191:6: ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUEAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalLangFil.g:1194:9: ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        switch ( input.LA(1) ) {
            	        case 30:
            	            {
            	            int LA15_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt15=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA15_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt15=1;
            	            }


            	            }
            	            break;
            	        case 36:
            	            {
            	            int LA15_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt15=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalLangFil.g:1194:10: {...}? => ( (lv_documents_20_0= ruleDocument ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleUE", "true");
            	    	    }
            	    	    // InternalLangFil.g:1194:19: ( (lv_documents_20_0= ruleDocument ) )
            	    	    // InternalLangFil.g:1194:20: (lv_documents_20_0= ruleDocument )
            	    	    {
            	    	    // InternalLangFil.g:1194:20: (lv_documents_20_0= ruleDocument )
            	    	    // InternalLangFil.g:1195:10: lv_documents_20_0= ruleDocument
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getUEAccess().getDocumentsDocumentParserRuleCall_4_4_0());
            	    	    									
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_documents_20_0=ruleDocument();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getUERule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"documents",
            	    	    											lv_documents_20_0,
            	    	    											"fil.xtext.LangFil.Document");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUEAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getUEAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canLeave(grammarAccess.getUEAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getUEAccess().getUnorderedGroup_4());
            				

            }

            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getUEAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleUE"


    // $ANTLR start "entryRuleS1"
    // InternalLangFil.g:1233:1: entryRuleS1 returns [EObject current=null] : iv_ruleS1= ruleS1 EOF ;
    public final EObject entryRuleS1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS1 = null;


        try {
            // InternalLangFil.g:1233:43: (iv_ruleS1= ruleS1 EOF )
            // InternalLangFil.g:1234:2: iv_ruleS1= ruleS1 EOF
            {
             newCompositeNode(grammarAccess.getS1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleS1=ruleS1();

            state._fsp--;

             current =iv_ruleS1; 
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
    // $ANTLR end "entryRuleS1"


    // $ANTLR start "ruleS1"
    // InternalLangFil.g:1240:1: ruleS1 returns [EObject current=null] : ( () otherlv_1= 'S1' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) ) otherlv_16= '}' ) ;
    public final EObject ruleS1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalLangFil.g:1246:2: ( ( () otherlv_1= 'S1' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) ) otherlv_16= '}' ) )
            // InternalLangFil.g:1247:2: ( () otherlv_1= 'S1' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) ) otherlv_16= '}' )
            {
            // InternalLangFil.g:1247:2: ( () otherlv_1= 'S1' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) ) otherlv_16= '}' )
            // InternalLangFil.g:1248:3: () otherlv_1= 'S1' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) ) otherlv_16= '}'
            {
            // InternalLangFil.g:1248:3: ()
            // InternalLangFil.g:1249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getS1Access().getS1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getS1Access().getS1Keyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getS1Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalLangFil.g:1263:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) )
            // InternalLangFil.g:1264:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) )
            {
            // InternalLangFil.g:1264:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) )
            // InternalLangFil.g:1265:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getS1Access().getUnorderedGroup_3());
            				
            // InternalLangFil.g:1268:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* )
            // InternalLangFil.g:1269:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )*
            {
            // InternalLangFil.g:1269:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( LA19_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getS1Access().getUnorderedGroup_3(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getS1Access().getUnorderedGroup_3(), 1) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLangFil.g:1270:4: ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:1270:4: ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) )
            	    // InternalLangFil.g:1271:5: {...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getS1Access().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleS1", "getUnorderedGroupHelper().canSelect(grammarAccess.getS1Access().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalLangFil.g:1271:99: ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) )
            	    // InternalLangFil.g:1272:6: ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getS1Access().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalLangFil.g:1275:9: ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) )
            	    // InternalLangFil.g:1275:10: {...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleS1", "true");
            	    }
            	    // InternalLangFil.g:1275:19: (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )
            	    // InternalLangFil.g:1275:20: otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getS1Access().getUesoptionnellesKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getS1Access().getLeftParenthesisKeyword_3_0_1());
            	    								
            	    // InternalLangFil.g:1283:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:1284:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:1284:10: ( ruleEString )
            	    // InternalLangFil.g:1285:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getS1Rule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getS1Access().getUesoptionnellesUECrossReference_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:1299:9: (otherlv_7= ',' ( ( ruleEString ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==17) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalLangFil.g:1300:10: otherlv_7= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_7, grammarAccess.getS1Access().getCommaKeyword_3_0_3_0());
            	    	    									
            	    	    // InternalLangFil.g:1304:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:1305:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:1305:11: ( ruleEString )
            	    	    // InternalLangFil.g:1306:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getS1Rule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getS1Access().getUesoptionnellesUECrossReference_3_0_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,18,FOLLOW_14); 

            	    									newLeafNode(otherlv_9, grammarAccess.getS1Access().getRightParenthesisKeyword_3_0_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getS1Access().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLangFil.g:1331:4: ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:1331:4: ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) )
            	    // InternalLangFil.g:1332:5: {...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getS1Access().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleS1", "getUnorderedGroupHelper().canSelect(grammarAccess.getS1Access().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalLangFil.g:1332:99: ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) )
            	    // InternalLangFil.g:1333:6: ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getS1Access().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalLangFil.g:1336:9: ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) )
            	    // InternalLangFil.g:1336:10: {...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleS1", "true");
            	    }
            	    // InternalLangFil.g:1336:19: (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )
            	    // InternalLangFil.g:1336:20: otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getS1Access().getUesobligatoiresKeyword_3_1_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getS1Access().getLeftParenthesisKeyword_3_1_1());
            	    								
            	    // InternalLangFil.g:1344:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:1345:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:1345:10: ( ruleEString )
            	    // InternalLangFil.g:1346:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getS1Rule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getS1Access().getUesobligatoiresUECrossReference_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:1360:9: (otherlv_13= ',' ( ( ruleEString ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==17) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalLangFil.g:1361:10: otherlv_13= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_13, grammarAccess.getS1Access().getCommaKeyword_3_1_3_0());
            	    	    									
            	    	    // InternalLangFil.g:1365:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:1366:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:1366:11: ( ruleEString )
            	    	    // InternalLangFil.g:1367:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getS1Rule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getS1Access().getUesobligatoiresUECrossReference_3_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,18,FOLLOW_14); 

            	    									newLeafNode(otherlv_15, grammarAccess.getS1Access().getRightParenthesisKeyword_3_1_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getS1Access().getUnorderedGroup_3());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getS1Access().getUnorderedGroup_3());
            				

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getS1Access().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleS1"


    // $ANTLR start "entryRuleS2"
    // InternalLangFil.g:1407:1: entryRuleS2 returns [EObject current=null] : iv_ruleS2= ruleS2 EOF ;
    public final EObject entryRuleS2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS2 = null;


        try {
            // InternalLangFil.g:1407:43: (iv_ruleS2= ruleS2 EOF )
            // InternalLangFil.g:1408:2: iv_ruleS2= ruleS2 EOF
            {
             newCompositeNode(grammarAccess.getS2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleS2=ruleS2();

            state._fsp--;

             current =iv_ruleS2; 
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
    // $ANTLR end "entryRuleS2"


    // $ANTLR start "ruleS2"
    // InternalLangFil.g:1414:1: ruleS2 returns [EObject current=null] : ( () otherlv_1= 'S2' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) ) otherlv_16= '}' ) ;
    public final EObject ruleS2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalLangFil.g:1420:2: ( ( () otherlv_1= 'S2' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) ) otherlv_16= '}' ) )
            // InternalLangFil.g:1421:2: ( () otherlv_1= 'S2' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) ) otherlv_16= '}' )
            {
            // InternalLangFil.g:1421:2: ( () otherlv_1= 'S2' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) ) otherlv_16= '}' )
            // InternalLangFil.g:1422:3: () otherlv_1= 'S2' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) ) otherlv_16= '}'
            {
            // InternalLangFil.g:1422:3: ()
            // InternalLangFil.g:1423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getS2Access().getS2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getS2Access().getS2Keyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getS2Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalLangFil.g:1437:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) ) )
            // InternalLangFil.g:1438:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) )
            {
            // InternalLangFil.g:1438:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* ) )
            // InternalLangFil.g:1439:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getS2Access().getUnorderedGroup_3());
            				
            // InternalLangFil.g:1442:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )* )
            // InternalLangFil.g:1443:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )*
            {
            // InternalLangFil.g:1443:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getS2Access().getUnorderedGroup_3(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getS2Access().getUnorderedGroup_3(), 1) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLangFil.g:1444:4: ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:1444:4: ({...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) ) )
            	    // InternalLangFil.g:1445:5: {...}? => ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getS2Access().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleS2", "getUnorderedGroupHelper().canSelect(grammarAccess.getS2Access().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalLangFil.g:1445:99: ( ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) ) )
            	    // InternalLangFil.g:1446:6: ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getS2Access().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalLangFil.g:1449:9: ({...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' ) )
            	    // InternalLangFil.g:1449:10: {...}? => (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleS2", "true");
            	    }
            	    // InternalLangFil.g:1449:19: (otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )
            	    // InternalLangFil.g:1449:20: otherlv_4= 'uesoptionnelles' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getS2Access().getUesoptionnellesKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getS2Access().getLeftParenthesisKeyword_3_0_1());
            	    								
            	    // InternalLangFil.g:1457:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:1458:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:1458:10: ( ruleEString )
            	    // InternalLangFil.g:1459:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getS2Rule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getS2Access().getUesoptionnellesUECrossReference_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:1473:9: (otherlv_7= ',' ( ( ruleEString ) ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==17) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalLangFil.g:1474:10: otherlv_7= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_7, grammarAccess.getS2Access().getCommaKeyword_3_0_3_0());
            	    	    									
            	    	    // InternalLangFil.g:1478:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:1479:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:1479:11: ( ruleEString )
            	    	    // InternalLangFil.g:1480:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getS2Rule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getS2Access().getUesoptionnellesUECrossReference_3_0_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,18,FOLLOW_14); 

            	    									newLeafNode(otherlv_9, grammarAccess.getS2Access().getRightParenthesisKeyword_3_0_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getS2Access().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLangFil.g:1505:4: ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:1505:4: ({...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) ) )
            	    // InternalLangFil.g:1506:5: {...}? => ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getS2Access().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleS2", "getUnorderedGroupHelper().canSelect(grammarAccess.getS2Access().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalLangFil.g:1506:99: ( ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) ) )
            	    // InternalLangFil.g:1507:6: ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getS2Access().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalLangFil.g:1510:9: ({...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' ) )
            	    // InternalLangFil.g:1510:10: {...}? => (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleS2", "true");
            	    }
            	    // InternalLangFil.g:1510:19: (otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )
            	    // InternalLangFil.g:1510:20: otherlv_10= 'uesobligatoires' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getS2Access().getUesobligatoiresKeyword_3_1_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getS2Access().getLeftParenthesisKeyword_3_1_1());
            	    								
            	    // InternalLangFil.g:1518:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:1519:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:1519:10: ( ruleEString )
            	    // InternalLangFil.g:1520:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getS2Rule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getS2Access().getUesobligatoiresUECrossReference_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:1534:9: (otherlv_13= ',' ( ( ruleEString ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==17) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalLangFil.g:1535:10: otherlv_13= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_13, grammarAccess.getS2Access().getCommaKeyword_3_1_3_0());
            	    	    									
            	    	    // InternalLangFil.g:1539:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:1540:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:1540:11: ( ruleEString )
            	    	    // InternalLangFil.g:1541:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getS2Rule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getS2Access().getUesobligatoiresUECrossReference_3_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,18,FOLLOW_14); 

            	    									newLeafNode(otherlv_15, grammarAccess.getS2Access().getRightParenthesisKeyword_3_1_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getS2Access().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getS2Access().getUnorderedGroup_3());
            				

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getS2Access().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleS2"


    // $ANTLR start "entryRuleVideo"
    // InternalLangFil.g:1581:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalLangFil.g:1581:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalLangFil.g:1582:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalLangFil.g:1588:1: ruleVideo returns [EObject current=null] : ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_lien_7_0 = null;

        AntlrDatatypeRuleToken lv_duree_9_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:1594:2: ( ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalLangFil.g:1595:2: ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalLangFil.g:1595:2: ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalLangFil.g:1596:3: () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalLangFil.g:1596:3: ()
            // InternalLangFil.g:1597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoAccess().getVideoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getVideoKeyword_1());
            		
            // InternalLangFil.g:1607:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:1608:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:1608:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:1609:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:1630:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLangFil.g:1631:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getVideoAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalLangFil.g:1635:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalLangFil.g:1636:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalLangFil.g:1636:5: (lv_description_5_0= ruleEString )
                    // InternalLangFil.g:1637:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getVideoAccess().getLienKeyword_5());
            		
            // InternalLangFil.g:1659:3: ( (lv_lien_7_0= ruleEString ) )
            // InternalLangFil.g:1660:4: (lv_lien_7_0= ruleEString )
            {
            // InternalLangFil.g:1660:4: (lv_lien_7_0= ruleEString )
            // InternalLangFil.g:1661:5: lv_lien_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getLienEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_lien_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"lien",
            						lv_lien_7_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLangFil.g:1678:3: (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLangFil.g:1679:4: otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getVideoAccess().getDureeKeyword_7_0());
                    			
                    // InternalLangFil.g:1683:4: ( (lv_duree_9_0= ruleEString ) )
                    // InternalLangFil.g:1684:5: (lv_duree_9_0= ruleEString )
                    {
                    // InternalLangFil.g:1684:5: (lv_duree_9_0= ruleEString )
                    // InternalLangFil.g:1685:6: lv_duree_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getDureeEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_duree_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"duree",
                    							lv_duree_9_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleFichier"
    // InternalLangFil.g:1711:1: entryRuleFichier returns [EObject current=null] : iv_ruleFichier= ruleFichier EOF ;
    public final EObject entryRuleFichier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFichier = null;


        try {
            // InternalLangFil.g:1711:48: (iv_ruleFichier= ruleFichier EOF )
            // InternalLangFil.g:1712:2: iv_ruleFichier= ruleFichier EOF
            {
             newCompositeNode(grammarAccess.getFichierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFichier=ruleFichier();

            state._fsp--;

             current =iv_ruleFichier; 
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
    // $ANTLR end "entryRuleFichier"


    // $ANTLR start "ruleFichier"
    // InternalLangFil.g:1718:1: ruleFichier returns [EObject current=null] : ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleFichier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_lien_7_0 = null;

        AntlrDatatypeRuleToken lv_auteur_9_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:1724:2: ( ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalLangFil.g:1725:2: ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalLangFil.g:1725:2: ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalLangFil.g:1726:3: () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalLangFil.g:1726:3: ()
            // InternalLangFil.g:1727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFichierAccess().getFichierAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFichierAccess().getFichierKeyword_1());
            		
            // InternalLangFil.g:1737:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:1738:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:1738:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:1739:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFichierAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFichierRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getFichierAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:1760:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLangFil.g:1761:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFichierAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalLangFil.g:1765:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalLangFil.g:1766:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalLangFil.g:1766:5: (lv_description_5_0= ruleEString )
                    // InternalLangFil.g:1767:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFichierAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFichierRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getFichierAccess().getLienKeyword_5());
            		
            // InternalLangFil.g:1789:3: ( (lv_lien_7_0= ruleEString ) )
            // InternalLangFil.g:1790:4: (lv_lien_7_0= ruleEString )
            {
            // InternalLangFil.g:1790:4: (lv_lien_7_0= ruleEString )
            // InternalLangFil.g:1791:5: lv_lien_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFichierAccess().getLienEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_lien_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFichierRule());
            					}
            					set(
            						current,
            						"lien",
            						lv_lien_7_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLangFil.g:1808:3: (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLangFil.g:1809:4: otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getFichierAccess().getAuteurKeyword_7_0());
                    			
                    // InternalLangFil.g:1813:4: ( (lv_auteur_9_0= ruleEString ) )
                    // InternalLangFil.g:1814:5: (lv_auteur_9_0= ruleEString )
                    {
                    // InternalLangFil.g:1814:5: (lv_auteur_9_0= ruleEString )
                    // InternalLangFil.g:1815:6: lv_auteur_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFichierAccess().getAuteurEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_auteur_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFichierRule());
                    						}
                    						set(
                    							current,
                    							"auteur",
                    							lv_auteur_9_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFichierAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFichier"


    // $ANTLR start "entryRuleAudio"
    // InternalLangFil.g:1841:1: entryRuleAudio returns [EObject current=null] : iv_ruleAudio= ruleAudio EOF ;
    public final EObject entryRuleAudio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudio = null;


        try {
            // InternalLangFil.g:1841:46: (iv_ruleAudio= ruleAudio EOF )
            // InternalLangFil.g:1842:2: iv_ruleAudio= ruleAudio EOF
            {
             newCompositeNode(grammarAccess.getAudioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAudio=ruleAudio();

            state._fsp--;

             current =iv_ruleAudio; 
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
    // $ANTLR end "entryRuleAudio"


    // $ANTLR start "ruleAudio"
    // InternalLangFil.g:1848:1: ruleAudio returns [EObject current=null] : ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleAudio() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_lien_7_0 = null;

        AntlrDatatypeRuleToken lv_duree_9_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:1854:2: ( ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalLangFil.g:1855:2: ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalLangFil.g:1855:2: ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalLangFil.g:1856:3: () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalLangFil.g:1856:3: ()
            // InternalLangFil.g:1857:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAudioAccess().getAudioAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAudioAccess().getAudioKeyword_1());
            		
            // InternalLangFil.g:1867:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:1868:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:1868:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:1869:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:1890:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLangFil.g:1891:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAudioAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalLangFil.g:1895:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalLangFil.g:1896:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalLangFil.g:1896:5: (lv_description_5_0= ruleEString )
                    // InternalLangFil.g:1897:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getAudioAccess().getLienKeyword_5());
            		
            // InternalLangFil.g:1919:3: ( (lv_lien_7_0= ruleEString ) )
            // InternalLangFil.g:1920:4: (lv_lien_7_0= ruleEString )
            {
            // InternalLangFil.g:1920:4: (lv_lien_7_0= ruleEString )
            // InternalLangFil.g:1921:5: lv_lien_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioAccess().getLienEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_lien_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioRule());
            					}
            					set(
            						current,
            						"lien",
            						lv_lien_7_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLangFil.g:1938:3: (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLangFil.g:1939:4: otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getAudioAccess().getDureeKeyword_7_0());
                    			
                    // InternalLangFil.g:1943:4: ( (lv_duree_9_0= ruleEString ) )
                    // InternalLangFil.g:1944:5: (lv_duree_9_0= ruleEString )
                    {
                    // InternalLangFil.g:1944:5: (lv_duree_9_0= ruleEString )
                    // InternalLangFil.g:1945:6: lv_duree_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getDureeEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_duree_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioRule());
                    						}
                    						set(
                    							current,
                    							"duree",
                    							lv_duree_9_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAudio"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000340C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000348C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000146580C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000146588C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800080000L});

}
