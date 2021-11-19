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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Faculte'", "'{'", "'niveaux'", "','", "'}'", "'intervenants'", "'Niveau'", "'pseudo'", "'responsables'", "'('", "')'", "'formations'", "'presentation'", "'ues'", "'Intervenant'", "'prenom'", "'Formation'", "'enseignants'", "'s1'", "'s2'", "'documents'", "'Presentation'", "'contenue'", "'UE'", "'S1'", "'uesoptionnelles'", "'uesobligatoires'", "'S2'", "'Video'", "'description'", "'lien'", "'duree'", "'Fichier'", "'auteur'", "'Audio'"
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
    // InternalLangFil.g:71:1: ruleFaculte returns [EObject current=null] : ( () otherlv_1= 'Faculte' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )? (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleFaculte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_niveaux_6_0 = null;

        EObject lv_niveaux_8_0 = null;

        EObject lv_intervenants_12_0 = null;

        EObject lv_intervenants_14_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:77:2: ( ( () otherlv_1= 'Faculte' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )? (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalLangFil.g:78:2: ( () otherlv_1= 'Faculte' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )? (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalLangFil.g:78:2: ( () otherlv_1= 'Faculte' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )? (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalLangFil.g:79:3: () otherlv_1= 'Faculte' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )? (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )? otherlv_16= '}'
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

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:113:3: (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLangFil.g:114:4: otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getFaculteAccess().getNiveauxKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalLangFil.g:122:4: ( (lv_niveaux_6_0= ruleNiveau ) )
                    // InternalLangFil.g:123:5: (lv_niveaux_6_0= ruleNiveau )
                    {
                    // InternalLangFil.g:123:5: (lv_niveaux_6_0= ruleNiveau )
                    // InternalLangFil.g:124:6: lv_niveaux_6_0= ruleNiveau
                    {

                    						newCompositeNode(grammarAccess.getFaculteAccess().getNiveauxNiveauParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_niveaux_6_0=ruleNiveau();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFaculteRule());
                    						}
                    						add(
                    							current,
                    							"niveaux",
                    							lv_niveaux_6_0,
                    							"fil.xtext.LangFil.Niveau");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:141:4: (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalLangFil.g:142:5: otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFaculteAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalLangFil.g:146:5: ( (lv_niveaux_8_0= ruleNiveau ) )
                    	    // InternalLangFil.g:147:6: (lv_niveaux_8_0= ruleNiveau )
                    	    {
                    	    // InternalLangFil.g:147:6: (lv_niveaux_8_0= ruleNiveau )
                    	    // InternalLangFil.g:148:7: lv_niveaux_8_0= ruleNiveau
                    	    {

                    	    							newCompositeNode(grammarAccess.getFaculteAccess().getNiveauxNiveauParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_niveaux_8_0=ruleNiveau();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFaculteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"niveaux",
                    	    								lv_niveaux_8_0,
                    	    								"fil.xtext.LangFil.Niveau");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:171:3: (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLangFil.g:172:4: otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getFaculteAccess().getIntervenantsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalLangFil.g:180:4: ( (lv_intervenants_12_0= ruleIntervenant ) )
                    // InternalLangFil.g:181:5: (lv_intervenants_12_0= ruleIntervenant )
                    {
                    // InternalLangFil.g:181:5: (lv_intervenants_12_0= ruleIntervenant )
                    // InternalLangFil.g:182:6: lv_intervenants_12_0= ruleIntervenant
                    {

                    						newCompositeNode(grammarAccess.getFaculteAccess().getIntervenantsIntervenantParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_intervenants_12_0=ruleIntervenant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFaculteRule());
                    						}
                    						add(
                    							current,
                    							"intervenants",
                    							lv_intervenants_12_0,
                    							"fil.xtext.LangFil.Intervenant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:199:4: (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalLangFil.g:200:5: otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getFaculteAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalLangFil.g:204:5: ( (lv_intervenants_14_0= ruleIntervenant ) )
                    	    // InternalLangFil.g:205:6: (lv_intervenants_14_0= ruleIntervenant )
                    	    {
                    	    // InternalLangFil.g:205:6: (lv_intervenants_14_0= ruleIntervenant )
                    	    // InternalLangFil.g:206:7: lv_intervenants_14_0= ruleIntervenant
                    	    {

                    	    							newCompositeNode(grammarAccess.getFaculteAccess().getIntervenantsIntervenantParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_intervenants_14_0=ruleIntervenant();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFaculteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"intervenants",
                    	    								lv_intervenants_14_0,
                    	    								"fil.xtext.LangFil.Intervenant");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalLangFil.g:237:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalLangFil.g:237:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalLangFil.g:238:2: iv_ruleDocument= ruleDocument EOF
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
    // InternalLangFil.g:244:1: ruleDocument returns [EObject current=null] : (this_Video_0= ruleVideo | this_Fichier_1= ruleFichier | this_Audio_2= ruleAudio ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject this_Video_0 = null;

        EObject this_Fichier_1 = null;

        EObject this_Audio_2 = null;



        	enterRule();

        try {
            // InternalLangFil.g:250:2: ( (this_Video_0= ruleVideo | this_Fichier_1= ruleFichier | this_Audio_2= ruleAudio ) )
            // InternalLangFil.g:251:2: (this_Video_0= ruleVideo | this_Fichier_1= ruleFichier | this_Audio_2= ruleAudio )
            {
            // InternalLangFil.g:251:2: (this_Video_0= ruleVideo | this_Fichier_1= ruleFichier | this_Audio_2= ruleAudio )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 43:
                {
                alt5=2;
                }
                break;
            case 45:
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
                    // InternalLangFil.g:252:3: this_Video_0= ruleVideo
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
                    // InternalLangFil.g:261:3: this_Fichier_1= ruleFichier
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
                    // InternalLangFil.g:270:3: this_Audio_2= ruleAudio
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
    // InternalLangFil.g:282:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalLangFil.g:282:47: (iv_ruleEString= ruleEString EOF )
            // InternalLangFil.g:283:2: iv_ruleEString= ruleEString EOF
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
    // InternalLangFil.g:289:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalLangFil.g:295:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalLangFil.g:296:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalLangFil.g:296:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLangFil.g:297:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLangFil.g:305:3: this_ID_1= RULE_ID
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
    // InternalLangFil.g:316:1: entryRuleNiveau returns [EObject current=null] : iv_ruleNiveau= ruleNiveau EOF ;
    public final EObject entryRuleNiveau() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNiveau = null;


        try {
            // InternalLangFil.g:316:47: (iv_ruleNiveau= ruleNiveau EOF )
            // InternalLangFil.g:317:2: iv_ruleNiveau= ruleNiveau EOF
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
    // InternalLangFil.g:323:1: ruleNiveau returns [EObject current=null] : ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )? (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'formations' otherlv_13= '{' ( (lv_formations_14_0= ruleFormation ) ) (otherlv_15= ',' ( (lv_formations_16_0= ruleFormation ) ) )* otherlv_17= '}' )? (otherlv_18= 'presentation' ( (lv_presentation_19_0= rulePresentation ) ) )? (otherlv_20= 'ues' otherlv_21= '{' ( (lv_ues_22_0= ruleUE ) ) (otherlv_23= ',' ( (lv_ues_24_0= ruleUE ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleNiveau() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pseudo_5_0 = null;

        EObject lv_formations_14_0 = null;

        EObject lv_formations_16_0 = null;

        EObject lv_presentation_19_0 = null;

        EObject lv_ues_22_0 = null;

        EObject lv_ues_24_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:329:2: ( ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )? (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'formations' otherlv_13= '{' ( (lv_formations_14_0= ruleFormation ) ) (otherlv_15= ',' ( (lv_formations_16_0= ruleFormation ) ) )* otherlv_17= '}' )? (otherlv_18= 'presentation' ( (lv_presentation_19_0= rulePresentation ) ) )? (otherlv_20= 'ues' otherlv_21= '{' ( (lv_ues_22_0= ruleUE ) ) (otherlv_23= ',' ( (lv_ues_24_0= ruleUE ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalLangFil.g:330:2: ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )? (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'formations' otherlv_13= '{' ( (lv_formations_14_0= ruleFormation ) ) (otherlv_15= ',' ( (lv_formations_16_0= ruleFormation ) ) )* otherlv_17= '}' )? (otherlv_18= 'presentation' ( (lv_presentation_19_0= rulePresentation ) ) )? (otherlv_20= 'ues' otherlv_21= '{' ( (lv_ues_22_0= ruleUE ) ) (otherlv_23= ',' ( (lv_ues_24_0= ruleUE ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalLangFil.g:330:2: ( () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )? (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'formations' otherlv_13= '{' ( (lv_formations_14_0= ruleFormation ) ) (otherlv_15= ',' ( (lv_formations_16_0= ruleFormation ) ) )* otherlv_17= '}' )? (otherlv_18= 'presentation' ( (lv_presentation_19_0= rulePresentation ) ) )? (otherlv_20= 'ues' otherlv_21= '{' ( (lv_ues_22_0= ruleUE ) ) (otherlv_23= ',' ( (lv_ues_24_0= ruleUE ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalLangFil.g:331:3: () otherlv_1= 'Niveau' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )? (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'formations' otherlv_13= '{' ( (lv_formations_14_0= ruleFormation ) ) (otherlv_15= ',' ( (lv_formations_16_0= ruleFormation ) ) )* otherlv_17= '}' )? (otherlv_18= 'presentation' ( (lv_presentation_19_0= rulePresentation ) ) )? (otherlv_20= 'ues' otherlv_21= '{' ( (lv_ues_22_0= ruleUE ) ) (otherlv_23= ',' ( (lv_ues_24_0= ruleUE ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            // InternalLangFil.g:331:3: ()
            // InternalLangFil.g:332:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNiveauAccess().getNiveauAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNiveauAccess().getNiveauKeyword_1());
            		
            // InternalLangFil.g:342:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:343:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:343:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:344:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNiveauAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:365:3: (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLangFil.g:366:4: otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getNiveauAccess().getPseudoKeyword_4_0());
                    			
                    // InternalLangFil.g:370:4: ( (lv_pseudo_5_0= ruleEString ) )
                    // InternalLangFil.g:371:5: (lv_pseudo_5_0= ruleEString )
                    {
                    // InternalLangFil.g:371:5: (lv_pseudo_5_0= ruleEString )
                    // InternalLangFil.g:372:6: lv_pseudo_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNiveauAccess().getPseudoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_pseudo_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNiveauRule());
                    						}
                    						set(
                    							current,
                    							"pseudo",
                    							lv_pseudo_5_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLangFil.g:390:3: (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLangFil.g:391:4: otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getNiveauAccess().getResponsablesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getNiveauAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalLangFil.g:399:4: ( ( ruleEString ) )
                    // InternalLangFil.g:400:5: ( ruleEString )
                    {
                    // InternalLangFil.g:400:5: ( ruleEString )
                    // InternalLangFil.g:401:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNiveauRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getNiveauAccess().getResponsablesIntervenantCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:415:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalLangFil.g:416:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getNiveauAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalLangFil.g:420:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:421:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:421:6: ( ruleEString )
                    	    // InternalLangFil.g:422:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getNiveauRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getNiveauAccess().getResponsablesIntervenantCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getNiveauAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:442:3: (otherlv_12= 'formations' otherlv_13= '{' ( (lv_formations_14_0= ruleFormation ) ) (otherlv_15= ',' ( (lv_formations_16_0= ruleFormation ) ) )* otherlv_17= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLangFil.g:443:4: otherlv_12= 'formations' otherlv_13= '{' ( (lv_formations_14_0= ruleFormation ) ) (otherlv_15= ',' ( (lv_formations_16_0= ruleFormation ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getNiveauAccess().getFormationsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalLangFil.g:451:4: ( (lv_formations_14_0= ruleFormation ) )
                    // InternalLangFil.g:452:5: (lv_formations_14_0= ruleFormation )
                    {
                    // InternalLangFil.g:452:5: (lv_formations_14_0= ruleFormation )
                    // InternalLangFil.g:453:6: lv_formations_14_0= ruleFormation
                    {

                    						newCompositeNode(grammarAccess.getNiveauAccess().getFormationsFormationParserRuleCall_6_2_0());
                    					
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

                    // InternalLangFil.g:470:4: (otherlv_15= ',' ( (lv_formations_16_0= ruleFormation ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalLangFil.g:471:5: otherlv_15= ',' ( (lv_formations_16_0= ruleFormation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getNiveauAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalLangFil.g:475:5: ( (lv_formations_16_0= ruleFormation ) )
                    	    // InternalLangFil.g:476:6: (lv_formations_16_0= ruleFormation )
                    	    {
                    	    // InternalLangFil.g:476:6: (lv_formations_16_0= ruleFormation )
                    	    // InternalLangFil.g:477:7: lv_formations_16_0= ruleFormation
                    	    {

                    	    							newCompositeNode(grammarAccess.getNiveauAccess().getFormationsFormationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_formations_16_0=ruleFormation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNiveauRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"formations",
                    	    								lv_formations_16_0,
                    	    								"fil.xtext.LangFil.Formation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:500:3: (otherlv_18= 'presentation' ( (lv_presentation_19_0= rulePresentation ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLangFil.g:501:4: otherlv_18= 'presentation' ( (lv_presentation_19_0= rulePresentation ) )
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getNiveauAccess().getPresentationKeyword_7_0());
                    			
                    // InternalLangFil.g:505:4: ( (lv_presentation_19_0= rulePresentation ) )
                    // InternalLangFil.g:506:5: (lv_presentation_19_0= rulePresentation )
                    {
                    // InternalLangFil.g:506:5: (lv_presentation_19_0= rulePresentation )
                    // InternalLangFil.g:507:6: lv_presentation_19_0= rulePresentation
                    {

                    						newCompositeNode(grammarAccess.getNiveauAccess().getPresentationPresentationParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_presentation_19_0=rulePresentation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNiveauRule());
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
                    break;

            }

            // InternalLangFil.g:525:3: (otherlv_20= 'ues' otherlv_21= '{' ( (lv_ues_22_0= ruleUE ) ) (otherlv_23= ',' ( (lv_ues_24_0= ruleUE ) ) )* otherlv_25= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLangFil.g:526:4: otherlv_20= 'ues' otherlv_21= '{' ( (lv_ues_22_0= ruleUE ) ) (otherlv_23= ',' ( (lv_ues_24_0= ruleUE ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getNiveauAccess().getUesKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_21, grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalLangFil.g:534:4: ( (lv_ues_22_0= ruleUE ) )
                    // InternalLangFil.g:535:5: (lv_ues_22_0= ruleUE )
                    {
                    // InternalLangFil.g:535:5: (lv_ues_22_0= ruleUE )
                    // InternalLangFil.g:536:6: lv_ues_22_0= ruleUE
                    {

                    						newCompositeNode(grammarAccess.getNiveauAccess().getUesUEParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ues_22_0=ruleUE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNiveauRule());
                    						}
                    						add(
                    							current,
                    							"ues",
                    							lv_ues_22_0,
                    							"fil.xtext.LangFil.UE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:553:4: (otherlv_23= ',' ( (lv_ues_24_0= ruleUE ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalLangFil.g:554:5: otherlv_23= ',' ( (lv_ues_24_0= ruleUE ) )
                    	    {
                    	    otherlv_23=(Token)match(input,14,FOLLOW_20); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getNiveauAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalLangFil.g:558:5: ( (lv_ues_24_0= ruleUE ) )
                    	    // InternalLangFil.g:559:6: (lv_ues_24_0= ruleUE )
                    	    {
                    	    // InternalLangFil.g:559:6: (lv_ues_24_0= ruleUE )
                    	    // InternalLangFil.g:560:7: lv_ues_24_0= ruleUE
                    	    {

                    	    							newCompositeNode(grammarAccess.getNiveauAccess().getUesUEParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ues_24_0=ruleUE();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNiveauRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ues",
                    	    								lv_ues_24_0,
                    	    								"fil.xtext.LangFil.UE");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_25, grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalLangFil.g:591:1: entryRuleIntervenant returns [EObject current=null] : iv_ruleIntervenant= ruleIntervenant EOF ;
    public final EObject entryRuleIntervenant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervenant = null;


        try {
            // InternalLangFil.g:591:52: (iv_ruleIntervenant= ruleIntervenant EOF )
            // InternalLangFil.g:592:2: iv_ruleIntervenant= ruleIntervenant EOF
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
    // InternalLangFil.g:598:1: ruleIntervenant returns [EObject current=null] : ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalLangFil.g:604:2: ( ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalLangFil.g:605:2: ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalLangFil.g:605:2: ( () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalLangFil.g:606:3: () otherlv_1= 'Intervenant' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalLangFil.g:606:3: ()
            // InternalLangFil.g:607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntervenantAccess().getIntervenantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervenantAccess().getIntervenantKeyword_1());
            		
            // InternalLangFil.g:617:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:618:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:618:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:619:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntervenantAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getIntervenantAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:640:3: (otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLangFil.g:641:4: otherlv_4= 'prenom' ( (lv_prenom_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getIntervenantAccess().getPrenomKeyword_4_0());
                    			
                    // InternalLangFil.g:645:4: ( (lv_prenom_5_0= ruleEString ) )
                    // InternalLangFil.g:646:5: (lv_prenom_5_0= ruleEString )
                    {
                    // InternalLangFil.g:646:5: (lv_prenom_5_0= ruleEString )
                    // InternalLangFil.g:647:6: lv_prenom_5_0= ruleEString
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalLangFil.g:673:1: entryRuleFormation returns [EObject current=null] : iv_ruleFormation= ruleFormation EOF ;
    public final EObject entryRuleFormation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormation = null;


        try {
            // InternalLangFil.g:673:50: (iv_ruleFormation= ruleFormation EOF )
            // InternalLangFil.g:674:2: iv_ruleFormation= ruleFormation EOF
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
    // InternalLangFil.g:680:1: ruleFormation returns [EObject current=null] : (otherlv_0= 'Formation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'pseudo' ( (lv_pseudo_4_0= ruleEString ) ) )? (otherlv_5= 'responsables' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'enseignants' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'presentation' ( (lv_presentation_18_0= rulePresentation ) ) )? otherlv_19= 's1' ( (lv_s1_20_0= ruleS1 ) ) otherlv_21= 's2' ( (lv_s2_22_0= ruleS2 ) ) (otherlv_23= 'documents' otherlv_24= '{' ( (lv_documents_25_0= ruleDocument ) ) (otherlv_26= ',' ( (lv_documents_27_0= ruleDocument ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleFormation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pseudo_4_0 = null;

        EObject lv_presentation_18_0 = null;

        EObject lv_s1_20_0 = null;

        EObject lv_s2_22_0 = null;

        EObject lv_documents_25_0 = null;

        EObject lv_documents_27_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:686:2: ( (otherlv_0= 'Formation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'pseudo' ( (lv_pseudo_4_0= ruleEString ) ) )? (otherlv_5= 'responsables' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'enseignants' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'presentation' ( (lv_presentation_18_0= rulePresentation ) ) )? otherlv_19= 's1' ( (lv_s1_20_0= ruleS1 ) ) otherlv_21= 's2' ( (lv_s2_22_0= ruleS2 ) ) (otherlv_23= 'documents' otherlv_24= '{' ( (lv_documents_25_0= ruleDocument ) ) (otherlv_26= ',' ( (lv_documents_27_0= ruleDocument ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalLangFil.g:687:2: (otherlv_0= 'Formation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'pseudo' ( (lv_pseudo_4_0= ruleEString ) ) )? (otherlv_5= 'responsables' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'enseignants' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'presentation' ( (lv_presentation_18_0= rulePresentation ) ) )? otherlv_19= 's1' ( (lv_s1_20_0= ruleS1 ) ) otherlv_21= 's2' ( (lv_s2_22_0= ruleS2 ) ) (otherlv_23= 'documents' otherlv_24= '{' ( (lv_documents_25_0= ruleDocument ) ) (otherlv_26= ',' ( (lv_documents_27_0= ruleDocument ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalLangFil.g:687:2: (otherlv_0= 'Formation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'pseudo' ( (lv_pseudo_4_0= ruleEString ) ) )? (otherlv_5= 'responsables' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'enseignants' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'presentation' ( (lv_presentation_18_0= rulePresentation ) ) )? otherlv_19= 's1' ( (lv_s1_20_0= ruleS1 ) ) otherlv_21= 's2' ( (lv_s2_22_0= ruleS2 ) ) (otherlv_23= 'documents' otherlv_24= '{' ( (lv_documents_25_0= ruleDocument ) ) (otherlv_26= ',' ( (lv_documents_27_0= ruleDocument ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalLangFil.g:688:3: otherlv_0= 'Formation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'pseudo' ( (lv_pseudo_4_0= ruleEString ) ) )? (otherlv_5= 'responsables' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'enseignants' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'presentation' ( (lv_presentation_18_0= rulePresentation ) ) )? otherlv_19= 's1' ( (lv_s1_20_0= ruleS1 ) ) otherlv_21= 's2' ( (lv_s2_22_0= ruleS2 ) ) (otherlv_23= 'documents' otherlv_24= '{' ( (lv_documents_25_0= ruleDocument ) ) (otherlv_26= ',' ( (lv_documents_27_0= ruleDocument ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFormationAccess().getFormationKeyword_0());
            		
            // InternalLangFil.g:692:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLangFil.g:693:4: (lv_name_1_0= ruleEString )
            {
            // InternalLangFil.g:693:4: (lv_name_1_0= ruleEString )
            // InternalLangFil.g:694:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFormationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fil.xtext.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getFormationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLangFil.g:715:3: (otherlv_3= 'pseudo' ( (lv_pseudo_4_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLangFil.g:716:4: otherlv_3= 'pseudo' ( (lv_pseudo_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFormationAccess().getPseudoKeyword_3_0());
                    			
                    // InternalLangFil.g:720:4: ( (lv_pseudo_4_0= ruleEString ) )
                    // InternalLangFil.g:721:5: (lv_pseudo_4_0= ruleEString )
                    {
                    // InternalLangFil.g:721:5: (lv_pseudo_4_0= ruleEString )
                    // InternalLangFil.g:722:6: lv_pseudo_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFormationAccess().getPseudoEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_pseudo_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormationRule());
                    						}
                    						set(
                    							current,
                    							"pseudo",
                    							lv_pseudo_4_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLangFil.g:740:3: (otherlv_5= 'responsables' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLangFil.g:741:4: otherlv_5= 'responsables' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getFormationAccess().getResponsablesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFormationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalLangFil.g:749:4: ( ( ruleEString ) )
                    // InternalLangFil.g:750:5: ( ruleEString )
                    {
                    // InternalLangFil.g:750:5: ( ruleEString )
                    // InternalLangFil.g:751:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFormationAccess().getResponsablesIntervenantCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:765:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalLangFil.g:766:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFormationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalLangFil.g:770:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:771:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:771:6: ( ruleEString )
                    	    // InternalLangFil.g:772:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFormationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFormationAccess().getResponsablesIntervenantCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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

                    otherlv_10=(Token)match(input,21,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getFormationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:792:3: (otherlv_11= 'enseignants' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLangFil.g:793:4: otherlv_11= 'enseignants' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getFormationAccess().getEnseignantsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getFormationAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalLangFil.g:801:4: ( ( ruleEString ) )
                    // InternalLangFil.g:802:5: ( ruleEString )
                    {
                    // InternalLangFil.g:802:5: ( ruleEString )
                    // InternalLangFil.g:803:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFormationAccess().getEnseignantsIntervenantCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:817:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalLangFil.g:818:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getFormationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalLangFil.g:822:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:823:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:823:6: ( ruleEString )
                    	    // InternalLangFil.g:824:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFormationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFormationAccess().getEnseignantsIntervenantCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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

                    otherlv_16=(Token)match(input,21,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getFormationAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:844:3: (otherlv_17= 'presentation' ( (lv_presentation_18_0= rulePresentation ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLangFil.g:845:4: otherlv_17= 'presentation' ( (lv_presentation_18_0= rulePresentation ) )
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_17, grammarAccess.getFormationAccess().getPresentationKeyword_6_0());
                    			
                    // InternalLangFil.g:849:4: ( (lv_presentation_18_0= rulePresentation ) )
                    // InternalLangFil.g:850:5: (lv_presentation_18_0= rulePresentation )
                    {
                    // InternalLangFil.g:850:5: (lv_presentation_18_0= rulePresentation )
                    // InternalLangFil.g:851:6: lv_presentation_18_0= rulePresentation
                    {

                    						newCompositeNode(grammarAccess.getFormationAccess().getPresentationPresentationParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_presentation_18_0=rulePresentation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormationRule());
                    						}
                    						set(
                    							current,
                    							"presentation",
                    							lv_presentation_18_0,
                    							"fil.xtext.LangFil.Presentation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,29,FOLLOW_27); 

            			newLeafNode(otherlv_19, grammarAccess.getFormationAccess().getS1Keyword_7());
            		
            // InternalLangFil.g:873:3: ( (lv_s1_20_0= ruleS1 ) )
            // InternalLangFil.g:874:4: (lv_s1_20_0= ruleS1 )
            {
            // InternalLangFil.g:874:4: (lv_s1_20_0= ruleS1 )
            // InternalLangFil.g:875:5: lv_s1_20_0= ruleS1
            {

            					newCompositeNode(grammarAccess.getFormationAccess().getS1S1ParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_21=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_21, grammarAccess.getFormationAccess().getS2Keyword_9());
            		
            // InternalLangFil.g:896:3: ( (lv_s2_22_0= ruleS2 ) )
            // InternalLangFil.g:897:4: (lv_s2_22_0= ruleS2 )
            {
            // InternalLangFil.g:897:4: (lv_s2_22_0= ruleS2 )
            // InternalLangFil.g:898:5: lv_s2_22_0= ruleS2
            {

            					newCompositeNode(grammarAccess.getFormationAccess().getS2S2ParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_30);
            lv_s2_22_0=ruleS2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormationRule());
            					}
            					set(
            						current,
            						"s2",
            						lv_s2_22_0,
            						"fil.xtext.LangFil.S2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLangFil.g:915:3: (otherlv_23= 'documents' otherlv_24= '{' ( (lv_documents_25_0= ruleDocument ) ) (otherlv_26= ',' ( (lv_documents_27_0= ruleDocument ) ) )* otherlv_28= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLangFil.g:916:4: otherlv_23= 'documents' otherlv_24= '{' ( (lv_documents_25_0= ruleDocument ) ) (otherlv_26= ',' ( (lv_documents_27_0= ruleDocument ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getFormationAccess().getDocumentsKeyword_11_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_24, grammarAccess.getFormationAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalLangFil.g:924:4: ( (lv_documents_25_0= ruleDocument ) )
                    // InternalLangFil.g:925:5: (lv_documents_25_0= ruleDocument )
                    {
                    // InternalLangFil.g:925:5: (lv_documents_25_0= ruleDocument )
                    // InternalLangFil.g:926:6: lv_documents_25_0= ruleDocument
                    {

                    						newCompositeNode(grammarAccess.getFormationAccess().getDocumentsDocumentParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_documents_25_0=ruleDocument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormationRule());
                    						}
                    						add(
                    							current,
                    							"documents",
                    							lv_documents_25_0,
                    							"fil.xtext.LangFil.Document");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:943:4: (otherlv_26= ',' ( (lv_documents_27_0= ruleDocument ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalLangFil.g:944:5: otherlv_26= ',' ( (lv_documents_27_0= ruleDocument ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getFormationAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalLangFil.g:948:5: ( (lv_documents_27_0= ruleDocument ) )
                    	    // InternalLangFil.g:949:6: (lv_documents_27_0= ruleDocument )
                    	    {
                    	    // InternalLangFil.g:949:6: (lv_documents_27_0= ruleDocument )
                    	    // InternalLangFil.g:950:7: lv_documents_27_0= ruleDocument
                    	    {

                    	    							newCompositeNode(grammarAccess.getFormationAccess().getDocumentsDocumentParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_documents_27_0=ruleDocument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFormationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"documents",
                    	    								lv_documents_27_0,
                    	    								"fil.xtext.LangFil.Document");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_28, grammarAccess.getFormationAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getFormationAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalLangFil.g:981:1: entryRulePresentation returns [EObject current=null] : iv_rulePresentation= rulePresentation EOF ;
    public final EObject entryRulePresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentation = null;


        try {
            // InternalLangFil.g:981:53: (iv_rulePresentation= rulePresentation EOF )
            // InternalLangFil.g:982:2: iv_rulePresentation= rulePresentation EOF
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
    // InternalLangFil.g:988:1: rulePresentation returns [EObject current=null] : ( () otherlv_1= 'Presentation' otherlv_2= '{' (otherlv_3= 'contenue' ( (lv_contenue_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject rulePresentation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_contenue_4_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:994:2: ( ( () otherlv_1= 'Presentation' otherlv_2= '{' (otherlv_3= 'contenue' ( (lv_contenue_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalLangFil.g:995:2: ( () otherlv_1= 'Presentation' otherlv_2= '{' (otherlv_3= 'contenue' ( (lv_contenue_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalLangFil.g:995:2: ( () otherlv_1= 'Presentation' otherlv_2= '{' (otherlv_3= 'contenue' ( (lv_contenue_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalLangFil.g:996:3: () otherlv_1= 'Presentation' otherlv_2= '{' (otherlv_3= 'contenue' ( (lv_contenue_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalLangFil.g:996:3: ()
            // InternalLangFil.g:997:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPresentationAccess().getPresentationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPresentationAccess().getPresentationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getPresentationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLangFil.g:1011:3: (otherlv_3= 'contenue' ( (lv_contenue_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalLangFil.g:1012:4: otherlv_3= 'contenue' ( (lv_contenue_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPresentationAccess().getContenueKeyword_3_0());
                    			
                    // InternalLangFil.g:1016:4: ( (lv_contenue_4_0= ruleEString ) )
                    // InternalLangFil.g:1017:5: (lv_contenue_4_0= ruleEString )
                    {
                    // InternalLangFil.g:1017:5: (lv_contenue_4_0= ruleEString )
                    // InternalLangFil.g:1018:6: lv_contenue_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPresentationAccess().getContenueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_contenue_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPresentationRule());
                    						}
                    						set(
                    							current,
                    							"contenue",
                    							lv_contenue_4_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPresentationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalLangFil.g:1044:1: entryRuleUE returns [EObject current=null] : iv_ruleUE= ruleUE EOF ;
    public final EObject entryRuleUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUE = null;


        try {
            // InternalLangFil.g:1044:43: (iv_ruleUE= ruleUE EOF )
            // InternalLangFil.g:1045:2: iv_ruleUE= ruleUE EOF
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
    // InternalLangFil.g:1051:1: ruleUE returns [EObject current=null] : ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )? (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'enseignants' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'documents' otherlv_19= '{' ( (lv_documents_20_0= ruleDocument ) ) (otherlv_21= ',' ( (lv_documents_22_0= ruleDocument ) ) )* otherlv_23= '}' )? (otherlv_24= 'presentation' ( (lv_presentation_25_0= rulePresentation ) ) )? otherlv_26= '}' ) ;
    public final EObject ruleUE() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pseudo_5_0 = null;

        EObject lv_documents_20_0 = null;

        EObject lv_documents_22_0 = null;

        EObject lv_presentation_25_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:1057:2: ( ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )? (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'enseignants' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'documents' otherlv_19= '{' ( (lv_documents_20_0= ruleDocument ) ) (otherlv_21= ',' ( (lv_documents_22_0= ruleDocument ) ) )* otherlv_23= '}' )? (otherlv_24= 'presentation' ( (lv_presentation_25_0= rulePresentation ) ) )? otherlv_26= '}' ) )
            // InternalLangFil.g:1058:2: ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )? (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'enseignants' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'documents' otherlv_19= '{' ( (lv_documents_20_0= ruleDocument ) ) (otherlv_21= ',' ( (lv_documents_22_0= ruleDocument ) ) )* otherlv_23= '}' )? (otherlv_24= 'presentation' ( (lv_presentation_25_0= rulePresentation ) ) )? otherlv_26= '}' )
            {
            // InternalLangFil.g:1058:2: ( () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )? (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'enseignants' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'documents' otherlv_19= '{' ( (lv_documents_20_0= ruleDocument ) ) (otherlv_21= ',' ( (lv_documents_22_0= ruleDocument ) ) )* otherlv_23= '}' )? (otherlv_24= 'presentation' ( (lv_presentation_25_0= rulePresentation ) ) )? otherlv_26= '}' )
            // InternalLangFil.g:1059:3: () otherlv_1= 'UE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )? (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'enseignants' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'documents' otherlv_19= '{' ( (lv_documents_20_0= ruleDocument ) ) (otherlv_21= ',' ( (lv_documents_22_0= ruleDocument ) ) )* otherlv_23= '}' )? (otherlv_24= 'presentation' ( (lv_presentation_25_0= rulePresentation ) ) )? otherlv_26= '}'
            {
            // InternalLangFil.g:1059:3: ()
            // InternalLangFil.g:1060:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUEAccess().getUEAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUEAccess().getUEKeyword_1());
            		
            // InternalLangFil.g:1070:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:1071:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:1071:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:1072:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUEAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_3=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:1093:3: (otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLangFil.g:1094:4: otherlv_4= 'pseudo' ( (lv_pseudo_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getUEAccess().getPseudoKeyword_4_0());
                    			
                    // InternalLangFil.g:1098:4: ( (lv_pseudo_5_0= ruleEString ) )
                    // InternalLangFil.g:1099:5: (lv_pseudo_5_0= ruleEString )
                    {
                    // InternalLangFil.g:1099:5: (lv_pseudo_5_0= ruleEString )
                    // InternalLangFil.g:1100:6: lv_pseudo_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUEAccess().getPseudoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_pseudo_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUERule());
                    						}
                    						set(
                    							current,
                    							"pseudo",
                    							lv_pseudo_5_0,
                    							"fil.xtext.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLangFil.g:1118:3: (otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLangFil.g:1119:4: otherlv_6= 'responsables' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getUEAccess().getResponsablesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getUEAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalLangFil.g:1127:4: ( ( ruleEString ) )
                    // InternalLangFil.g:1128:5: ( ruleEString )
                    {
                    // InternalLangFil.g:1128:5: ( ruleEString )
                    // InternalLangFil.g:1129:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUERule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:1143:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalLangFil.g:1144:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getUEAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalLangFil.g:1148:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:1149:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:1149:6: ( ruleEString )
                    	    // InternalLangFil.g:1150:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUERule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_35); 

                    				newLeafNode(otherlv_11, grammarAccess.getUEAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:1170:3: (otherlv_12= 'enseignants' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLangFil.g:1171:4: otherlv_12= 'enseignants' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getUEAccess().getEnseignantsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getUEAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalLangFil.g:1179:4: ( ( ruleEString ) )
                    // InternalLangFil.g:1180:5: ( ruleEString )
                    {
                    // InternalLangFil.g:1180:5: ( ruleEString )
                    // InternalLangFil.g:1181:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUERule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUEAccess().getEnseignantsIntervenantCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:1195:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalLangFil.g:1196:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getUEAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalLangFil.g:1200:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:1201:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:1201:6: ( ruleEString )
                    	    // InternalLangFil.g:1202:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUERule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getUEAccess().getEnseignantsIntervenantCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,21,FOLLOW_36); 

                    				newLeafNode(otherlv_17, grammarAccess.getUEAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:1222:3: (otherlv_18= 'documents' otherlv_19= '{' ( (lv_documents_20_0= ruleDocument ) ) (otherlv_21= ',' ( (lv_documents_22_0= ruleDocument ) ) )* otherlv_23= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalLangFil.g:1223:4: otherlv_18= 'documents' otherlv_19= '{' ( (lv_documents_20_0= ruleDocument ) ) (otherlv_21= ',' ( (lv_documents_22_0= ruleDocument ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_18, grammarAccess.getUEAccess().getDocumentsKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_19, grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalLangFil.g:1231:4: ( (lv_documents_20_0= ruleDocument ) )
                    // InternalLangFil.g:1232:5: (lv_documents_20_0= ruleDocument )
                    {
                    // InternalLangFil.g:1232:5: (lv_documents_20_0= ruleDocument )
                    // InternalLangFil.g:1233:6: lv_documents_20_0= ruleDocument
                    {

                    						newCompositeNode(grammarAccess.getUEAccess().getDocumentsDocumentParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalLangFil.g:1250:4: (otherlv_21= ',' ( (lv_documents_22_0= ruleDocument ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalLangFil.g:1251:5: otherlv_21= ',' ( (lv_documents_22_0= ruleDocument ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getUEAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalLangFil.g:1255:5: ( (lv_documents_22_0= ruleDocument ) )
                    	    // InternalLangFil.g:1256:6: (lv_documents_22_0= ruleDocument )
                    	    {
                    	    // InternalLangFil.g:1256:6: (lv_documents_22_0= ruleDocument )
                    	    // InternalLangFil.g:1257:7: lv_documents_22_0= ruleDocument
                    	    {

                    	    							newCompositeNode(grammarAccess.getUEAccess().getDocumentsDocumentParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_documents_22_0=ruleDocument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUERule());
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_37); 

                    				newLeafNode(otherlv_23, grammarAccess.getUEAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:1280:3: (otherlv_24= 'presentation' ( (lv_presentation_25_0= rulePresentation ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalLangFil.g:1281:4: otherlv_24= 'presentation' ( (lv_presentation_25_0= rulePresentation ) )
                    {
                    otherlv_24=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_24, grammarAccess.getUEAccess().getPresentationKeyword_8_0());
                    			
                    // InternalLangFil.g:1285:4: ( (lv_presentation_25_0= rulePresentation ) )
                    // InternalLangFil.g:1286:5: (lv_presentation_25_0= rulePresentation )
                    {
                    // InternalLangFil.g:1286:5: (lv_presentation_25_0= rulePresentation )
                    // InternalLangFil.g:1287:6: lv_presentation_25_0= rulePresentation
                    {

                    						newCompositeNode(grammarAccess.getUEAccess().getPresentationPresentationParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_presentation_25_0=rulePresentation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUERule());
                    						}
                    						set(
                    							current,
                    							"presentation",
                    							lv_presentation_25_0,
                    							"fil.xtext.LangFil.Presentation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getUEAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalLangFil.g:1313:1: entryRuleS1 returns [EObject current=null] : iv_ruleS1= ruleS1 EOF ;
    public final EObject entryRuleS1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS1 = null;


        try {
            // InternalLangFil.g:1313:43: (iv_ruleS1= ruleS1 EOF )
            // InternalLangFil.g:1314:2: iv_ruleS1= ruleS1 EOF
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
    // InternalLangFil.g:1320:1: ruleS1 returns [EObject current=null] : ( () otherlv_1= 'S1' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) ;
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
            // InternalLangFil.g:1326:2: ( ( () otherlv_1= 'S1' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) )
            // InternalLangFil.g:1327:2: ( () otherlv_1= 'S1' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            {
            // InternalLangFil.g:1327:2: ( () otherlv_1= 'S1' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            // InternalLangFil.g:1328:3: () otherlv_1= 'S1' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}'
            {
            // InternalLangFil.g:1328:3: ()
            // InternalLangFil.g:1329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getS1Access().getS1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getS1Access().getS1Keyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getS1Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalLangFil.g:1343:3: (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalLangFil.g:1344:4: otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getS1Access().getUesoptionnellesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getS1Access().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalLangFil.g:1352:4: ( ( ruleEString ) )
                    // InternalLangFil.g:1353:5: ( ruleEString )
                    {
                    // InternalLangFil.g:1353:5: ( ruleEString )
                    // InternalLangFil.g:1354:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getS1Rule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getS1Access().getUesoptionnellesUECrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:1368:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalLangFil.g:1369:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getS1Access().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalLangFil.g:1373:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:1374:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:1374:6: ( ruleEString )
                    	    // InternalLangFil.g:1375:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getS1Rule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getS1Access().getUesoptionnellesUECrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getS1Access().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:1395:3: (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalLangFil.g:1396:4: otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getS1Access().getUesobligatoiresKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getS1Access().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalLangFil.g:1404:4: ( ( ruleEString ) )
                    // InternalLangFil.g:1405:5: ( ruleEString )
                    {
                    // InternalLangFil.g:1405:5: ( ruleEString )
                    // InternalLangFil.g:1406:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getS1Rule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getS1Access().getUesobligatoiresUECrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:1420:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalLangFil.g:1421:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getS1Access().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalLangFil.g:1425:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:1426:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:1426:6: ( ruleEString )
                    	    // InternalLangFil.g:1427:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getS1Rule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getS1Access().getUesobligatoiresUECrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getS1Access().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

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
    // InternalLangFil.g:1455:1: entryRuleS2 returns [EObject current=null] : iv_ruleS2= ruleS2 EOF ;
    public final EObject entryRuleS2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS2 = null;


        try {
            // InternalLangFil.g:1455:43: (iv_ruleS2= ruleS2 EOF )
            // InternalLangFil.g:1456:2: iv_ruleS2= ruleS2 EOF
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
    // InternalLangFil.g:1462:1: ruleS2 returns [EObject current=null] : ( () otherlv_1= 'S2' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) ;
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
            // InternalLangFil.g:1468:2: ( ( () otherlv_1= 'S2' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) )
            // InternalLangFil.g:1469:2: ( () otherlv_1= 'S2' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            {
            // InternalLangFil.g:1469:2: ( () otherlv_1= 'S2' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            // InternalLangFil.g:1470:3: () otherlv_1= 'S2' otherlv_2= '{' (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}'
            {
            // InternalLangFil.g:1470:3: ()
            // InternalLangFil.g:1471:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getS2Access().getS2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getS2Access().getS2Keyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getS2Access().getLeftCurlyBracketKeyword_2());
            		
            // InternalLangFil.g:1485:3: (otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalLangFil.g:1486:4: otherlv_3= 'uesoptionnelles' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getS2Access().getUesoptionnellesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getS2Access().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalLangFil.g:1494:4: ( ( ruleEString ) )
                    // InternalLangFil.g:1495:5: ( ruleEString )
                    {
                    // InternalLangFil.g:1495:5: ( ruleEString )
                    // InternalLangFil.g:1496:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getS2Rule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getS2Access().getUesoptionnellesUECrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:1510:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalLangFil.g:1511:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getS2Access().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalLangFil.g:1515:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:1516:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:1516:6: ( ruleEString )
                    	    // InternalLangFil.g:1517:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getS2Rule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getS2Access().getUesoptionnellesUECrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getS2Access().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:1537:3: (otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalLangFil.g:1538:4: otherlv_9= 'uesobligatoires' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getS2Access().getUesobligatoiresKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getS2Access().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalLangFil.g:1546:4: ( ( ruleEString ) )
                    // InternalLangFil.g:1547:5: ( ruleEString )
                    {
                    // InternalLangFil.g:1547:5: ( ruleEString )
                    // InternalLangFil.g:1548:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getS2Rule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getS2Access().getUesobligatoiresUECrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:1562:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalLangFil.g:1563:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getS2Access().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalLangFil.g:1567:5: ( ( ruleEString ) )
                    	    // InternalLangFil.g:1568:6: ( ruleEString )
                    	    {
                    	    // InternalLangFil.g:1568:6: ( ruleEString )
                    	    // InternalLangFil.g:1569:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getS2Rule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getS2Access().getUesobligatoiresUECrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getS2Access().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

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
    // InternalLangFil.g:1597:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalLangFil.g:1597:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalLangFil.g:1598:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalLangFil.g:1604:1: ruleVideo returns [EObject current=null] : ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
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
            // InternalLangFil.g:1610:2: ( ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalLangFil.g:1611:2: ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalLangFil.g:1611:2: ( () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalLangFil.g:1612:3: () otherlv_1= 'Video' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalLangFil.g:1612:3: ()
            // InternalLangFil.g:1613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoAccess().getVideoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getVideoKeyword_1());
            		
            // InternalLangFil.g:1623:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:1624:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:1624:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:1625:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_3=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:1646:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalLangFil.g:1647:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getVideoAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalLangFil.g:1651:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalLangFil.g:1652:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalLangFil.g:1652:5: (lv_description_5_0= ruleEString )
                    // InternalLangFil.g:1653:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
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

            // InternalLangFil.g:1671:3: (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalLangFil.g:1672:4: otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getVideoAccess().getLienKeyword_5_0());
                    			
                    // InternalLangFil.g:1676:4: ( (lv_lien_7_0= ruleEString ) )
                    // InternalLangFil.g:1677:5: (lv_lien_7_0= ruleEString )
                    {
                    // InternalLangFil.g:1677:5: (lv_lien_7_0= ruleEString )
                    // InternalLangFil.g:1678:6: lv_lien_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getLienEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_42);
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


                    }
                    break;

            }

            // InternalLangFil.g:1696:3: (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalLangFil.g:1697:4: otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getVideoAccess().getDureeKeyword_6_0());
                    			
                    // InternalLangFil.g:1701:4: ( (lv_duree_9_0= ruleEString ) )
                    // InternalLangFil.g:1702:5: (lv_duree_9_0= ruleEString )
                    {
                    // InternalLangFil.g:1702:5: (lv_duree_9_0= ruleEString )
                    // InternalLangFil.g:1703:6: lv_duree_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getDureeEStringParserRuleCall_6_1_0());
                    					
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

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalLangFil.g:1729:1: entryRuleFichier returns [EObject current=null] : iv_ruleFichier= ruleFichier EOF ;
    public final EObject entryRuleFichier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFichier = null;


        try {
            // InternalLangFil.g:1729:48: (iv_ruleFichier= ruleFichier EOF )
            // InternalLangFil.g:1730:2: iv_ruleFichier= ruleFichier EOF
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
    // InternalLangFil.g:1736:1: ruleFichier returns [EObject current=null] : ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
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
            // InternalLangFil.g:1742:2: ( ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalLangFil.g:1743:2: ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalLangFil.g:1743:2: ( () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalLangFil.g:1744:3: () otherlv_1= 'Fichier' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalLangFil.g:1744:3: ()
            // InternalLangFil.g:1745:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFichierAccess().getFichierAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFichierAccess().getFichierKeyword_1());
            		
            // InternalLangFil.g:1755:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:1756:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:1756:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:1757:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFichierAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_3=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getFichierAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:1778:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalLangFil.g:1779:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFichierAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalLangFil.g:1783:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalLangFil.g:1784:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalLangFil.g:1784:5: (lv_description_5_0= ruleEString )
                    // InternalLangFil.g:1785:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFichierAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalLangFil.g:1803:3: (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalLangFil.g:1804:4: otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getFichierAccess().getLienKeyword_5_0());
                    			
                    // InternalLangFil.g:1808:4: ( (lv_lien_7_0= ruleEString ) )
                    // InternalLangFil.g:1809:5: (lv_lien_7_0= ruleEString )
                    {
                    // InternalLangFil.g:1809:5: (lv_lien_7_0= ruleEString )
                    // InternalLangFil.g:1810:6: lv_lien_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFichierAccess().getLienEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_45);
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


                    }
                    break;

            }

            // InternalLangFil.g:1828:3: (otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalLangFil.g:1829:4: otherlv_8= 'auteur' ( (lv_auteur_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getFichierAccess().getAuteurKeyword_6_0());
                    			
                    // InternalLangFil.g:1833:4: ( (lv_auteur_9_0= ruleEString ) )
                    // InternalLangFil.g:1834:5: (lv_auteur_9_0= ruleEString )
                    {
                    // InternalLangFil.g:1834:5: (lv_auteur_9_0= ruleEString )
                    // InternalLangFil.g:1835:6: lv_auteur_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFichierAccess().getAuteurEStringParserRuleCall_6_1_0());
                    					
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

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFichierAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalLangFil.g:1861:1: entryRuleAudio returns [EObject current=null] : iv_ruleAudio= ruleAudio EOF ;
    public final EObject entryRuleAudio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudio = null;


        try {
            // InternalLangFil.g:1861:46: (iv_ruleAudio= ruleAudio EOF )
            // InternalLangFil.g:1862:2: iv_ruleAudio= ruleAudio EOF
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
    // InternalLangFil.g:1868:1: ruleAudio returns [EObject current=null] : ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) ;
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
            // InternalLangFil.g:1874:2: ( ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' ) )
            // InternalLangFil.g:1875:2: ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            {
            // InternalLangFil.g:1875:2: ( () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}' )
            // InternalLangFil.g:1876:3: () otherlv_1= 'Audio' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )? (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )? otherlv_10= '}'
            {
            // InternalLangFil.g:1876:3: ()
            // InternalLangFil.g:1877:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAudioAccess().getAudioAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAudioAccess().getAudioKeyword_1());
            		
            // InternalLangFil.g:1887:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLangFil.g:1888:4: (lv_name_2_0= ruleEString )
            {
            // InternalLangFil.g:1888:4: (lv_name_2_0= ruleEString )
            // InternalLangFil.g:1889:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_3=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLangFil.g:1910:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==40) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalLangFil.g:1911:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getAudioAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalLangFil.g:1915:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalLangFil.g:1916:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalLangFil.g:1916:5: (lv_description_5_0= ruleEString )
                    // InternalLangFil.g:1917:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
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

            // InternalLangFil.g:1935:3: (otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalLangFil.g:1936:4: otherlv_6= 'lien' ( (lv_lien_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAudioAccess().getLienKeyword_5_0());
                    			
                    // InternalLangFil.g:1940:4: ( (lv_lien_7_0= ruleEString ) )
                    // InternalLangFil.g:1941:5: (lv_lien_7_0= ruleEString )
                    {
                    // InternalLangFil.g:1941:5: (lv_lien_7_0= ruleEString )
                    // InternalLangFil.g:1942:6: lv_lien_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getLienEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_42);
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


                    }
                    break;

            }

            // InternalLangFil.g:1960:3: (otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==42) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalLangFil.g:1961:4: otherlv_8= 'duree' ( (lv_duree_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getAudioAccess().getDureeKeyword_6_0());
                    			
                    // InternalLangFil.g:1965:4: ( (lv_duree_9_0= ruleEString ) )
                    // InternalLangFil.g:1966:5: (lv_duree_9_0= ruleEString )
                    {
                    // InternalLangFil.g:1966:5: (lv_duree_9_0= ruleEString )
                    // InternalLangFil.g:1967:6: lv_duree_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getDureeEStringParserRuleCall_6_1_0());
                    					
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

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_7());
            		

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001CC8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001C88000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C08000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000308C0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030880000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000288000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000908C8000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000090888000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000090808000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080808000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000003000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000070000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000060000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000130000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000120000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000008000L});

}