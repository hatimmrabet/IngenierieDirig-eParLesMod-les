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
    // InternalLangFil.g:240:1: ruleNiveau returns [EObject current=null] : ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )* ) ) ) otherlv_16= '}' ) ;
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
            // InternalLangFil.g:246:2: ( ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )* ) ) ) otherlv_16= '}' ) )
            // InternalLangFil.g:247:2: ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )* ) ) ) otherlv_16= '}' )
            {
            // InternalLangFil.g:247:2: ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )* ) ) ) otherlv_16= '}' )
            // InternalLangFil.g:248:3: () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )* ) ) ) otherlv_16= '}'
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
            		
            // InternalLangFil.g:282:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )* ) ) )
            // InternalLangFil.g:283:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )* ) )
            {
            // InternalLangFil.g:283:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )* ) )
            // InternalLangFil.g:284:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNiveauAccess().getUnorderedGroup_4());
            				
            // InternalLangFil.g:287:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )* )
            // InternalLangFil.g:288:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )*
            {
            // InternalLangFil.g:288:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_13_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) ) )*
            loop7:
            do {
                int alt7=6;
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
                else if ( LA7_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 3) ) {
                    alt7=4;
                }
                else if ( LA7_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 4) ) {
                    alt7=5;
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
            	    										
            	    pushFollow(FOLLOW_6);
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
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

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
            	    										
            	    pushFollow(FOLLOW_8);
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
            	    	    											
            	    	    pushFollow(FOLLOW_8);
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

            	    otherlv_12=(Token)match(input,18,FOLLOW_6); 

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
            	    									
            	    pushFollow(FOLLOW_6);
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
            	    // InternalLangFil.g:412:4: ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) )
            	    {
            	    // InternalLangFil.g:412:4: ({...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ ) )
            	    // InternalLangFil.g:413:5: {...}? => ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNiveau", "getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalLangFil.g:413:103: ( ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+ )
            	    // InternalLangFil.g:414:6: ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalLangFil.g:417:9: ({...}? => ( (lv_formations_14_0= ruleFormation ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==22) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalLangFil.g:417:10: {...}? => ( (lv_formations_14_0= ruleFormation ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleNiveau", "true");
            	    	    }
            	    	    // InternalLangFil.g:417:19: ( (lv_formations_14_0= ruleFormation ) )
            	    	    // InternalLangFil.g:417:20: (lv_formations_14_0= ruleFormation )
            	    	    {
            	    	    // InternalLangFil.g:417:20: (lv_formations_14_0= ruleFormation )
            	    	    // InternalLangFil.g:418:10: lv_formations_14_0= ruleFormation
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getNiveauAccess().getFormationsFormationParserRuleCall_4_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
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

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNiveauAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLangFil.g:440:4: ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) )
            	    {
            	    // InternalLangFil.g:440:4: ({...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ ) )
            	    // InternalLangFil.g:441:5: {...}? => ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNiveau", "getUnorderedGroupHelper().canSelect(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalLangFil.g:441:103: ( ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+ )
            	    // InternalLangFil.g:442:6: ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNiveauAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalLangFil.g:445:9: ({...}? => ( (lv_ues_15_0= ruleUE ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==25) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalLangFil.g:445:10: {...}? => ( (lv_ues_15_0= ruleUE ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleNiveau", "true");
            	    	    }
            	    	    // InternalLangFil.g:445:19: ( (lv_ues_15_0= ruleUE ) )
            	    	    // InternalLangFil.g:445:20: (lv_ues_15_0= ruleUE )
            	    	    {
            	    	    // InternalLangFil.g:445:20: (lv_ues_15_0= ruleUE )
            	    	    // InternalLangFil.g:446:10: lv_ues_15_0= ruleUE
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getNiveauAccess().getUesUEParserRuleCall_4_4_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
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
            	    break loop7;
                }
            } while (true);


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
    // InternalLangFil.g:483:1: entryRuleIntervenant returns [EObject current=null] : iv_ruleIntervenant= ruleIntervenant EOF ;
    public final EObject entryRuleIntervenant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervenant = null;


        try {
            // InternalLangFil.g:483:52: (iv_ruleIntervenant= ruleIntervenant EOF )
            // InternalLangFil.g:484:2: iv_ruleIntervenant= ruleIntervenant EOF
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
    // InternalLangFil.g:490:1: ruleIntervenant returns [EObject current=null] : ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalLangFil.g:496:2: ( ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalLangFil.g:497:2: ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalLangFil.g:497:2: ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalLangFil.g:498:3: () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalLangFil.g:498:3: ()
            // InternalLangFil.g:499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntervenantAccess().getIntervenantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervenantAccess().getIntervenantKeyword_1());
            		
            // InternalLangFil.g:509:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:510:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:510:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:511:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getIntervenantAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:532:3: (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLangFil.g:533:4: otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getIntervenantAccess().getPrenomKeyword_4_0());
                    			
                    // InternalLangFil.g:537:4: ( (lv_prenom_5_0= ruleEString ) )
                    // InternalLangFil.g:538:5: (lv_prenom_5_0= ruleEString )
                    {
                    // InternalLangFil.g:538:5: (lv_prenom_5_0= ruleEString )
                    // InternalLangFil.g:539:6: lv_prenom_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntervenantAccess().getPrenomEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
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
    // InternalLangFil.g:565:1: entryRuleFormation returns [EObject current=null] : iv_ruleFormation= ruleFormation EOF ;
    public final EObject entryRuleFormation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormation = null;


        try {
            // InternalLangFil.g:565:50: (iv_ruleFormation= ruleFormation EOF )
            // InternalLangFil.g:566:2: iv_ruleFormation= ruleFormation EOF
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
    // InternalLangFil.g:572:1: ruleFormation returns [EObject current=null] : ( () otherlv_1= 'Formation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_23= '}' ) ;
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
            // InternalLangFil.g:578:2: ( ( () otherlv_1= 'Formation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_23= '}' ) )
            // InternalLangFil.g:579:2: ( () otherlv_1= 'Formation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_23= '}' )
            {
            // InternalLangFil.g:579:2: ( () otherlv_1= 'Formation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_23= '}' )
            // InternalLangFil.g:580:3: () otherlv_1= 'Formation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) ) otherlv_23= '}'
            {
            // InternalLangFil.g:580:3: ()
            // InternalLangFil.g:581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormationAccess().getFormationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFormationAccess().getFormationKeyword_1());
            		
            // InternalLangFil.g:591:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:592:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:592:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:593:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getFormationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:614:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) ) )
            // InternalLangFil.g:615:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) )
            {
            // InternalLangFil.g:615:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?) )
            // InternalLangFil.g:616:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            				
            // InternalLangFil.g:619:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?)
            // InternalLangFil.g:620:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+ {...}?
            {
            // InternalLangFil.g:620:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) ) )+
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
            	    // InternalLangFil.g:621:4: ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalLangFil.g:621:4: ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) )
            	    // InternalLangFil.g:622:5: {...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalLangFil.g:622:106: ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) )
            	    // InternalLangFil.g:623:6: ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalLangFil.g:626:9: ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) )
            	    // InternalLangFil.g:626:10: {...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:626:19: (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )
            	    // InternalLangFil.g:626:20: otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getFormationAccess().getPseudoKeyword_4_0_0());
            	    								
            	    // InternalLangFil.g:630:9: ( (lv_pseudo_6_0= ruleEString ) )
            	    // InternalLangFil.g:631:10: (lv_pseudo_6_0= ruleEString )
            	    {
            	    // InternalLangFil.g:631:10: (lv_pseudo_6_0= ruleEString )
            	    // InternalLangFil.g:632:11: lv_pseudo_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getFormationAccess().getPseudoEStringParserRuleCall_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_12);
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
            	    // InternalLangFil.g:655:4: ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:655:4: ({...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) ) )
            	    // InternalLangFil.g:656:5: {...}? => ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalLangFil.g:656:106: ( ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) ) )
            	    // InternalLangFil.g:657:6: ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalLangFil.g:660:9: ({...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' ) )
            	    // InternalLangFil.g:660:10: {...}? => (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:660:19: (otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )
            	    // InternalLangFil.g:660:20: otherlv_7= 'responsables' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFormationAccess().getResponsablesKeyword_4_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_8, grammarAccess.getFormationAccess().getLeftParenthesisKeyword_4_1_1());
            	    								
            	    // InternalLangFil.g:668:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:669:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:669:10: ( ruleEString )
            	    // InternalLangFil.g:670:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getFormationRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getFormationAccess().getResponsablesIntervenantCrossReference_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:684:9: (otherlv_10= ',' ( ( ruleEString ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==17) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalLangFil.g:685:10: otherlv_10= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getFormationAccess().getCommaKeyword_4_1_3_0());
            	    	    									
            	    	    // InternalLangFil.g:689:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:690:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:690:11: ( ruleEString )
            	    	    // InternalLangFil.g:691:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getFormationRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getFormationAccess().getResponsablesIntervenantCrossReference_4_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_8);
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

            	    otherlv_12=(Token)match(input,18,FOLLOW_12); 

            	    									newLeafNode(otherlv_12, grammarAccess.getFormationAccess().getRightParenthesisKeyword_4_1_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLangFil.g:716:4: ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:716:4: ({...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) ) )
            	    // InternalLangFil.g:717:5: {...}? => ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalLangFil.g:717:106: ( ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) ) )
            	    // InternalLangFil.g:718:6: ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalLangFil.g:721:9: ({...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' ) )
            	    // InternalLangFil.g:721:10: {...}? => (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:721:19: (otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )
            	    // InternalLangFil.g:721:20: otherlv_13= 'enseignants' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
            	    {
            	    otherlv_13=(Token)match(input,23,FOLLOW_7); 

            	    									newLeafNode(otherlv_13, grammarAccess.getFormationAccess().getEnseignantsKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_14, grammarAccess.getFormationAccess().getLeftParenthesisKeyword_4_2_1());
            	    								
            	    // InternalLangFil.g:729:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:730:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:730:10: ( ruleEString )
            	    // InternalLangFil.g:731:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getFormationRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getFormationAccess().getEnseignantsIntervenantCrossReference_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:745:9: (otherlv_16= ',' ( ( ruleEString ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==17) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalLangFil.g:746:10: otherlv_16= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_16, grammarAccess.getFormationAccess().getCommaKeyword_4_2_3_0());
            	    	    									
            	    	    // InternalLangFil.g:750:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:751:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:751:11: ( ruleEString )
            	    	    // InternalLangFil.g:752:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getFormationRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getFormationAccess().getEnseignantsIntervenantCrossReference_4_2_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_8);
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

            	    otherlv_18=(Token)match(input,18,FOLLOW_12); 

            	    									newLeafNode(otherlv_18, grammarAccess.getFormationAccess().getRightParenthesisKeyword_4_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFormationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLangFil.g:777:4: ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) )
            	    {
            	    // InternalLangFil.g:777:4: ({...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) ) )
            	    // InternalLangFil.g:778:5: {...}? => ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalLangFil.g:778:106: ( ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) ) )
            	    // InternalLangFil.g:779:6: ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalLangFil.g:782:9: ({...}? => ( (lv_presentation_19_0= rulePresentation ) ) )
            	    // InternalLangFil.g:782:10: {...}? => ( (lv_presentation_19_0= rulePresentation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:782:19: ( (lv_presentation_19_0= rulePresentation ) )
            	    // InternalLangFil.g:782:20: (lv_presentation_19_0= rulePresentation )
            	    {
            	    // InternalLangFil.g:782:20: (lv_presentation_19_0= rulePresentation )
            	    // InternalLangFil.g:783:10: lv_presentation_19_0= rulePresentation
            	    {

            	    										newCompositeNode(grammarAccess.getFormationAccess().getPresentationPresentationParserRuleCall_4_3_0());
            	    									
            	    pushFollow(FOLLOW_12);
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
            	    // InternalLangFil.g:805:4: ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) )
            	    {
            	    // InternalLangFil.g:805:4: ({...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) ) )
            	    // InternalLangFil.g:806:5: {...}? => ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalLangFil.g:806:106: ( ({...}? => ( (lv_s1_20_0= ruleS1 ) ) ) )
            	    // InternalLangFil.g:807:6: ({...}? => ( (lv_s1_20_0= ruleS1 ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalLangFil.g:810:9: ({...}? => ( (lv_s1_20_0= ruleS1 ) ) )
            	    // InternalLangFil.g:810:10: {...}? => ( (lv_s1_20_0= ruleS1 ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:810:19: ( (lv_s1_20_0= ruleS1 ) )
            	    // InternalLangFil.g:810:20: (lv_s1_20_0= ruleS1 )
            	    {
            	    // InternalLangFil.g:810:20: (lv_s1_20_0= ruleS1 )
            	    // InternalLangFil.g:811:10: lv_s1_20_0= ruleS1
            	    {

            	    										newCompositeNode(grammarAccess.getFormationAccess().getS1S1ParserRuleCall_4_4_0());
            	    									
            	    pushFollow(FOLLOW_12);
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
            	    // InternalLangFil.g:833:4: ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) )
            	    {
            	    // InternalLangFil.g:833:4: ({...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) ) )
            	    // InternalLangFil.g:834:5: {...}? => ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalLangFil.g:834:106: ( ({...}? => ( (lv_s2_21_0= ruleS2 ) ) ) )
            	    // InternalLangFil.g:835:6: ({...}? => ( (lv_s2_21_0= ruleS2 ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalLangFil.g:838:9: ({...}? => ( (lv_s2_21_0= ruleS2 ) ) )
            	    // InternalLangFil.g:838:10: {...}? => ( (lv_s2_21_0= ruleS2 ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    }
            	    // InternalLangFil.g:838:19: ( (lv_s2_21_0= ruleS2 ) )
            	    // InternalLangFil.g:838:20: (lv_s2_21_0= ruleS2 )
            	    {
            	    // InternalLangFil.g:838:20: (lv_s2_21_0= ruleS2 )
            	    // InternalLangFil.g:839:10: lv_s2_21_0= ruleS2
            	    {

            	    										newCompositeNode(grammarAccess.getFormationAccess().getS2S2ParserRuleCall_4_5_0());
            	    									
            	    pushFollow(FOLLOW_12);
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
            	    // InternalLangFil.g:861:4: ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) )
            	    {
            	    // InternalLangFil.g:861:4: ({...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ ) )
            	    // InternalLangFil.g:862:5: {...}? => ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleFormation", "getUnorderedGroupHelper().canSelect(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalLangFil.g:862:106: ( ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+ )
            	    // InternalLangFil.g:863:6: ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFormationAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalLangFil.g:866:9: ({...}? => ( (lv_documents_22_0= ruleDocument ) ) )+
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
            	    	    // InternalLangFil.g:866:10: {...}? => ( (lv_documents_22_0= ruleDocument ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFormation", "true");
            	    	    }
            	    	    // InternalLangFil.g:866:19: ( (lv_documents_22_0= ruleDocument ) )
            	    	    // InternalLangFil.g:866:20: (lv_documents_22_0= ruleDocument )
            	    	    {
            	    	    // InternalLangFil.g:866:20: (lv_documents_22_0= ruleDocument )
            	    	    // InternalLangFil.g:867:10: lv_documents_22_0= ruleDocument
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getFormationAccess().getDocumentsDocumentParserRuleCall_4_6_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
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
    // InternalLangFil.g:905:1: entryRulePresentation returns [EObject current=null] : iv_rulePresentation= rulePresentation EOF ;
    public final EObject entryRulePresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentation = null;


        try {
            // InternalLangFil.g:905:53: (iv_rulePresentation= rulePresentation EOF )
            // InternalLangFil.g:906:2: iv_rulePresentation= rulePresentation EOF
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
    // InternalLangFil.g:912:1: rulePresentation returns [EObject current=null] : ( () otherlv_1= 'Presentation' ( (lv_contenue_2_0= ruleEString ) ) ) ;
    public final EObject rulePresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_contenue_2_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:918:2: ( ( () otherlv_1= 'Presentation' ( (lv_contenue_2_0= ruleEString ) ) ) )
            // InternalLangFil.g:919:2: ( () otherlv_1= 'Presentation' ( (lv_contenue_2_0= ruleEString ) ) )
            {
            // InternalLangFil.g:919:2: ( () otherlv_1= 'Presentation' ( (lv_contenue_2_0= ruleEString ) ) )
            // InternalLangFil.g:920:3: () otherlv_1= 'Presentation' ( (lv_contenue_2_0= ruleEString ) )
            {
            // InternalLangFil.g:920:3: ()
            // InternalLangFil.g:921:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPresentationAccess().getPresentationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPresentationAccess().getPresentationKeyword_1());
            		
            // InternalLangFil.g:931:3: ( (lv_contenue_2_0= ruleEString ) )
            // InternalLangFil.g:932:4: (lv_contenue_2_0= ruleEString )
            {
            // InternalLangFil.g:932:4: (lv_contenue_2_0= ruleEString )
            // InternalLangFil.g:933:5: lv_contenue_2_0= ruleEString
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
    // InternalLangFil.g:954:1: entryRuleUE returns [EObject current=null] : iv_ruleUE= ruleUE EOF ;
    public final EObject entryRuleUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUE = null;


        try {
            // InternalLangFil.g:954:43: (iv_ruleUE= ruleUE EOF )
            // InternalLangFil.g:955:2: iv_ruleUE= ruleUE EOF
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
    // InternalLangFil.g:961:1: ruleUE returns [EObject current=null] : ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) ;
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
            // InternalLangFil.g:967:2: ( ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalLangFil.g:968:2: ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalLangFil.g:968:2: ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
            // InternalLangFil.g:969:3: () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )* ) ) ) otherlv_21= '}'
            {
            // InternalLangFil.g:969:3: ()
            // InternalLangFil.g:970:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUEAccess().getUEAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUEAccess().getUEKeyword_1());
            		
            // InternalLangFil.g:980:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:981:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:981:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:982:5: lv_name_2_0= ruleEString
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
            		
            // InternalLangFil.g:1003:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )* ) ) )
            // InternalLangFil.g:1004:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )* ) )
            {
            // InternalLangFil.g:1004:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )* ) )
            // InternalLangFil.g:1005:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getUEAccess().getUnorderedGroup_4());
            				
            // InternalLangFil.g:1008:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )* )
            // InternalLangFil.g:1009:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )*
            {
            // InternalLangFil.g:1009:6: ( ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) ) )*
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
            	    // InternalLangFil.g:1010:4: ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalLangFil.g:1010:4: ({...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) ) )
            	    // InternalLangFil.g:1011:5: {...}? => ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalLangFil.g:1011:99: ( ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) ) )
            	    // InternalLangFil.g:1012:6: ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUEAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalLangFil.g:1015:9: ({...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) ) )
            	    // InternalLangFil.g:1015:10: {...}? => (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "true");
            	    }
            	    // InternalLangFil.g:1015:19: (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )
            	    // InternalLangFil.g:1015:20: otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getUEAccess().getPseudoKeyword_4_0_0());
            	    								
            	    // InternalLangFil.g:1019:9: ( (lv_pseudo_6_0= ruleEString ) )
            	    // InternalLangFil.g:1020:10: (lv_pseudo_6_0= ruleEString )
            	    {
            	    // InternalLangFil.g:1020:10: (lv_pseudo_6_0= ruleEString )
            	    // InternalLangFil.g:1021:11: lv_pseudo_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getUEAccess().getPseudoEStringParserRuleCall_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_12);
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
            	    // InternalLangFil.g:1044:4: ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) )
            	    {
            	    // InternalLangFil.g:1044:4: ({...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) ) )
            	    // InternalLangFil.g:1045:5: {...}? => ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalLangFil.g:1045:99: ( ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) ) )
            	    // InternalLangFil.g:1046:6: ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUEAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalLangFil.g:1049:9: ({...}? => ( (lv_presentation_7_0= rulePresentation ) ) )
            	    // InternalLangFil.g:1049:10: {...}? => ( (lv_presentation_7_0= rulePresentation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "true");
            	    }
            	    // InternalLangFil.g:1049:19: ( (lv_presentation_7_0= rulePresentation ) )
            	    // InternalLangFil.g:1049:20: (lv_presentation_7_0= rulePresentation )
            	    {
            	    // InternalLangFil.g:1049:20: (lv_presentation_7_0= rulePresentation )
            	    // InternalLangFil.g:1050:10: lv_presentation_7_0= rulePresentation
            	    {

            	    										newCompositeNode(grammarAccess.getUEAccess().getPresentationPresentationParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_12);
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
            	    // InternalLangFil.g:1072:4: ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:1072:4: ({...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) ) )
            	    // InternalLangFil.g:1073:5: {...}? => ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalLangFil.g:1073:99: ( ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) ) )
            	    // InternalLangFil.g:1074:6: ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUEAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalLangFil.g:1077:9: ({...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' ) )
            	    // InternalLangFil.g:1077:10: {...}? => (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "true");
            	    }
            	    // InternalLangFil.g:1077:19: (otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')' )
            	    // InternalLangFil.g:1077:20: otherlv_8= 'responsables' otherlv_9= '(' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ')'
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getUEAccess().getResponsablesKeyword_4_2_0());
            	    								
            	    otherlv_9=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getUEAccess().getLeftParenthesisKeyword_4_2_1());
            	    								
            	    // InternalLangFil.g:1085:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:1086:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:1086:10: ( ruleEString )
            	    // InternalLangFil.g:1087:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getUERule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:1101:9: (otherlv_11= ',' ( ( ruleEString ) ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==17) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalLangFil.g:1102:10: otherlv_11= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_11, grammarAccess.getUEAccess().getCommaKeyword_4_2_3_0());
            	    	    									
            	    	    // InternalLangFil.g:1106:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:1107:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:1107:11: ( ruleEString )
            	    	    // InternalLangFil.g:1108:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getUERule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_4_2_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_8);
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

            	    otherlv_13=(Token)match(input,18,FOLLOW_12); 

            	    									newLeafNode(otherlv_13, grammarAccess.getUEAccess().getRightParenthesisKeyword_4_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUEAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLangFil.g:1133:4: ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) )
            	    {
            	    // InternalLangFil.g:1133:4: ({...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) ) )
            	    // InternalLangFil.g:1134:5: {...}? => ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalLangFil.g:1134:99: ( ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) ) )
            	    // InternalLangFil.g:1135:6: ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUEAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalLangFil.g:1138:9: ({...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' ) )
            	    // InternalLangFil.g:1138:10: {...}? => (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "true");
            	    }
            	    // InternalLangFil.g:1138:19: (otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )
            	    // InternalLangFil.g:1138:20: otherlv_14= 'enseignants' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
            	    {
            	    otherlv_14=(Token)match(input,23,FOLLOW_7); 

            	    									newLeafNode(otherlv_14, grammarAccess.getUEAccess().getEnseignantsKeyword_4_3_0());
            	    								
            	    otherlv_15=(Token)match(input,16,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getUEAccess().getLeftParenthesisKeyword_4_3_1());
            	    								
            	    // InternalLangFil.g:1146:9: ( ( ruleEString ) )
            	    // InternalLangFil.g:1147:10: ( ruleEString )
            	    {
            	    // InternalLangFil.g:1147:10: ( ruleEString )
            	    // InternalLangFil.g:1148:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getUERule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getUEAccess().getEnseignantsIntervenantCrossReference_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalLangFil.g:1162:9: (otherlv_17= ',' ( ( ruleEString ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==17) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalLangFil.g:1163:10: otherlv_17= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,17,FOLLOW_3); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getUEAccess().getCommaKeyword_4_3_3_0());
            	    	    									
            	    	    // InternalLangFil.g:1167:10: ( ( ruleEString ) )
            	    	    // InternalLangFil.g:1168:11: ( ruleEString )
            	    	    {
            	    	    // InternalLangFil.g:1168:11: ( ruleEString )
            	    	    // InternalLangFil.g:1169:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getUERule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getUEAccess().getEnseignantsIntervenantCrossReference_4_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_8);
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

            	    otherlv_19=(Token)match(input,18,FOLLOW_12); 

            	    									newLeafNode(otherlv_19, grammarAccess.getUEAccess().getRightParenthesisKeyword_4_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUEAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLangFil.g:1194:4: ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) )
            	    {
            	    // InternalLangFil.g:1194:4: ({...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ ) )
            	    // InternalLangFil.g:1195:5: {...}? => ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleUE", "getUnorderedGroupHelper().canSelect(grammarAccess.getUEAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalLangFil.g:1195:99: ( ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+ )
            	    // InternalLangFil.g:1196:6: ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUEAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalLangFil.g:1199:9: ({...}? => ( (lv_documents_20_0= ruleDocument ) ) )+
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
            	    	    // InternalLangFil.g:1199:10: {...}? => ( (lv_documents_20_0= ruleDocument ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleUE", "true");
            	    	    }
            	    	    // InternalLangFil.g:1199:19: ( (lv_documents_20_0= ruleDocument ) )
            	    	    // InternalLangFil.g:1199:20: (lv_documents_20_0= ruleDocument )
            	    	    {
            	    	    // InternalLangFil.g:1199:20: (lv_documents_20_0= ruleDocument )
            	    	    // InternalLangFil.g:1200:10: lv_documents_20_0= ruleDocument
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getUEAccess().getDocumentsDocumentParserRuleCall_4_4_0());
            	    	    									
            	    	    pushFollow(FOLLOW_12);
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
            	    break loop16;
                }
            } while (true);


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
    // InternalLangFil.g:1237:1: entryRuleS1 returns [EObject current=null] : iv_ruleS1= ruleS1 EOF ;
    public final EObject entryRuleS1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS1 = null;


        try {
            // InternalLangFil.g:1237:43: (iv_ruleS1= ruleS1 EOF )
            // InternalLangFil.g:1238:2: iv_ruleS1= ruleS1 EOF
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
    // InternalLangFil.g:1244:1: ruleS1 returns [EObject current=null] : ( () otherlv_1= 'S1' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) ;
    public final EObject ruleS1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalLangFil.g:1250:2: ( ( () otherlv_1= 'S1' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) )
            // InternalLangFil.g:1251:2: ( () otherlv_1= 'S1' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            {
            // InternalLangFil.g:1251:2: ( () otherlv_1= 'S1' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            // InternalLangFil.g:1252:3: () otherlv_1= 'S1' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}'
            {
            // InternalLangFil.g:1252:3: ()
            // InternalLangFil.g:1253:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getS1Access().getS1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getS1Access().getS1Keyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getS1Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalLangFil.g:1267:3: (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLangFil.g:1268:4: otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getS1Access().getUesoptionnellesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getS1Access().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalLangFil.g:1276:4: ( ( ruleEString ) )
                    // InternalLangFil.g:1277:5: ( ruleEString )
                    {
                    // InternalLangFil.g:1277:5: ( ruleEString )
                    // InternalLangFil.g:1278:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getS1Rule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getS1Access().getUesoptionnellesUECrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:1292:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalLangFil.g:1293:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getS1Access().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalLangFil.g:1297:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:1298:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:1298:6: ( ruleEString )
                    	    // InternalLangFil.g:1299:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getS1Rule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getS1Access().getUesoptionnellesUECrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_8=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getS1Access().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:1319:3: (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLangFil.g:1320:4: otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getS1Access().getUesobligatoiresKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getS1Access().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalLangFil.g:1328:4: ( ( ruleEString ) )
                    // InternalLangFil.g:1329:5: ( ruleEString )
                    {
                    // InternalLangFil.g:1329:5: ( ruleEString )
                    // InternalLangFil.g:1330:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getS1Rule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getS1Access().getUesobligatoiresUECrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:1344:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==17) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalLangFil.g:1345:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getS1Access().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalLangFil.g:1349:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:1350:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:1350:6: ( ruleEString )
                    	    // InternalLangFil.g:1351:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getS1Rule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getS1Access().getUesobligatoiresUECrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getS1Access().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getS1Access().getRightCurlyBracketKeyword_5());
            		

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
    // InternalLangFil.g:1379:1: entryRuleS2 returns [EObject current=null] : iv_ruleS2= ruleS2 EOF ;
    public final EObject entryRuleS2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS2 = null;


        try {
            // InternalLangFil.g:1379:43: (iv_ruleS2= ruleS2 EOF )
            // InternalLangFil.g:1380:2: iv_ruleS2= ruleS2 EOF
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
    // InternalLangFil.g:1386:1: ruleS2 returns [EObject current=null] : ( () otherlv_1= 'S2' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) ;
    public final EObject ruleS2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalLangFil.g:1392:2: ( ( () otherlv_1= 'S2' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) )
            // InternalLangFil.g:1393:2: ( () otherlv_1= 'S2' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            {
            // InternalLangFil.g:1393:2: ( () otherlv_1= 'S2' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            // InternalLangFil.g:1394:3: () otherlv_1= 'S2' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}'
            {
            // InternalLangFil.g:1394:3: ()
            // InternalLangFil.g:1395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getS2Access().getS2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getS2Access().getS2Keyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getS2Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalLangFil.g:1409:3: (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLangFil.g:1410:4: otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getS2Access().getUesoptionnellesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getS2Access().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalLangFil.g:1418:4: ( ( ruleEString ) )
                    // InternalLangFil.g:1419:5: ( ruleEString )
                    {
                    // InternalLangFil.g:1419:5: ( ruleEString )
                    // InternalLangFil.g:1420:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getS2Rule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getS2Access().getUesoptionnellesUECrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:1434:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==17) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalLangFil.g:1435:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getS2Access().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalLangFil.g:1439:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:1440:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:1440:6: ( ruleEString )
                    	    // InternalLangFil.g:1441:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getS2Rule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getS2Access().getUesoptionnellesUECrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_8=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getS2Access().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:1461:3: (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLangFil.g:1462:4: otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getS2Access().getUesobligatoiresKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getS2Access().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalLangFil.g:1470:4: ( ( ruleEString ) )
                    // InternalLangFil.g:1471:5: ( ruleEString )
                    {
                    // InternalLangFil.g:1471:5: ( ruleEString )
                    // InternalLangFil.g:1472:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getS2Rule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getS2Access().getUesobligatoiresUECrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:1486:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalLangFil.g:1487:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getS2Access().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalLangFil.g:1491:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:1492:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:1492:6: ( ruleEString )
                    	    // InternalLangFil.g:1493:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getS2Rule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getS2Access().getUesobligatoiresUECrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getS2Access().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getS2Access().getRightCurlyBracketKeyword_5());
            		

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
    // InternalLangFil.g:1521:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalLangFil.g:1521:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalLangFil.g:1522:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalLangFil.g:1528:1: ruleVideo returns [EObject current=null] : ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
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
            // InternalLangFil.g:1534:2: ( ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalLangFil.g:1535:2: ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalLangFil.g:1535:2: ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalLangFil.g:1536:3: () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalLangFil.g:1536:3: ()
            // InternalLangFil.g:1537:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoAccess().getVideoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getVideoKeyword_1());
            		
            // InternalLangFil.g:1547:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:1548:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:1548:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:1549:5: lv_name_2_0= ruleEString
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
            		
            // InternalLangFil.g:1570:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLangFil.g:1571:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getVideoAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalLangFil.g:1575:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalLangFil.g:1576:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalLangFil.g:1576:5: (lv_description_5_0= ruleEString )
                    // InternalLangFil.g:1577:6: lv_description_5_0= ruleEString
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
            		
            // InternalLangFil.g:1599:3: ( (lv_lien_7_0= ruleEString ) )
            // InternalLangFil.g:1600:4: (lv_lien_7_0= ruleEString )
            {
            // InternalLangFil.g:1600:4: (lv_lien_7_0= ruleEString )
            // InternalLangFil.g:1601:5: lv_lien_7_0= ruleEString
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

            // InternalLangFil.g:1618:3: (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLangFil.g:1619:4: otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getVideoAccess().getDureeKeyword_7_0());
                    			
                    // InternalLangFil.g:1623:4: ( (lv_duree_9_0= ruleEString ) )
                    // InternalLangFil.g:1624:5: (lv_duree_9_0= ruleEString )
                    {
                    // InternalLangFil.g:1624:5: (lv_duree_9_0= ruleEString )
                    // InternalLangFil.g:1625:6: lv_duree_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getDureeEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
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
    // InternalLangFil.g:1651:1: entryRuleFichier returns [EObject current=null] : iv_ruleFichier= ruleFichier EOF ;
    public final EObject entryRuleFichier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFichier = null;


        try {
            // InternalLangFil.g:1651:48: (iv_ruleFichier= ruleFichier EOF )
            // InternalLangFil.g:1652:2: iv_ruleFichier= ruleFichier EOF
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
    // InternalLangFil.g:1658:1: ruleFichier returns [EObject current=null] : ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
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
            // InternalLangFil.g:1664:2: ( ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalLangFil.g:1665:2: ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalLangFil.g:1665:2: ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalLangFil.g:1666:3: () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalLangFil.g:1666:3: ()
            // InternalLangFil.g:1667:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFichierAccess().getFichierAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFichierAccess().getFichierKeyword_1());
            		
            // InternalLangFil.g:1677:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:1678:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:1678:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:1679:5: lv_name_2_0= ruleEString
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
            		
            // InternalLangFil.g:1700:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLangFil.g:1701:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFichierAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalLangFil.g:1705:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalLangFil.g:1706:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalLangFil.g:1706:5: (lv_description_5_0= ruleEString )
                    // InternalLangFil.g:1707:6: lv_description_5_0= ruleEString
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
            		
            // InternalLangFil.g:1729:3: ( (lv_lien_7_0= ruleEString ) )
            // InternalLangFil.g:1730:4: (lv_lien_7_0= ruleEString )
            {
            // InternalLangFil.g:1730:4: (lv_lien_7_0= ruleEString )
            // InternalLangFil.g:1731:5: lv_lien_7_0= ruleEString
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

            // InternalLangFil.g:1748:3: (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLangFil.g:1749:4: otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getFichierAccess().getAuteurKeyword_7_0());
                    			
                    // InternalLangFil.g:1753:4: ( (lv_auteur_9_0= ruleEString ) )
                    // InternalLangFil.g:1754:5: (lv_auteur_9_0= ruleEString )
                    {
                    // InternalLangFil.g:1754:5: (lv_auteur_9_0= ruleEString )
                    // InternalLangFil.g:1755:6: lv_auteur_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFichierAccess().getAuteurEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
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
    // InternalLangFil.g:1781:1: entryRuleAudio returns [EObject current=null] : iv_ruleAudio= ruleAudio EOF ;
    public final EObject entryRuleAudio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudio = null;


        try {
            // InternalLangFil.g:1781:46: (iv_ruleAudio= ruleAudio EOF )
            // InternalLangFil.g:1782:2: iv_ruleAudio= ruleAudio EOF
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
    // InternalLangFil.g:1788:1: ruleAudio returns [EObject current=null] : ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
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
            // InternalLangFil.g:1794:2: ( ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalLangFil.g:1795:2: ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalLangFil.g:1795:2: ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalLangFil.g:1796:3: () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalLangFil.g:1796:3: ()
            // InternalLangFil.g:1797:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAudioAccess().getAudioAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAudioAccess().getAudioKeyword_1());
            		
            // InternalLangFil.g:1807:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:1808:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:1808:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:1809:5: lv_name_2_0= ruleEString
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
            		
            // InternalLangFil.g:1830:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLangFil.g:1831:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAudioAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalLangFil.g:1835:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalLangFil.g:1836:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalLangFil.g:1836:5: (lv_description_5_0= ruleEString )
                    // InternalLangFil.g:1837:6: lv_description_5_0= ruleEString
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
            		
            // InternalLangFil.g:1859:3: ( (lv_lien_7_0= ruleEString ) )
            // InternalLangFil.g:1860:4: (lv_lien_7_0= ruleEString )
            {
            // InternalLangFil.g:1860:4: (lv_lien_7_0= ruleEString )
            // InternalLangFil.g:1861:5: lv_lien_7_0= ruleEString
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

            // InternalLangFil.g:1878:3: (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalLangFil.g:1879:4: otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getAudioAccess().getDureeKeyword_7_0());
                    			
                    // InternalLangFil.g:1883:4: ( (lv_duree_9_0= ruleEString ) )
                    // InternalLangFil.g:1884:5: (lv_duree_9_0= ruleEString )
                    {
                    // InternalLangFil.g:1884:5: (lv_duree_9_0= ruleEString )
                    // InternalLangFil.g:1885:6: lv_duree_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getDureeEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000348C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000146580C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000146588C000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000018080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800080000L});

}
