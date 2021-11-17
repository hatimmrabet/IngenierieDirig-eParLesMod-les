package fil.xtextfil.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fil.xtextfil.services.LangFilGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLangFilParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Faculte'", "'{'", "'nom'", "'niveaux'", "','", "'}'", "'intervenants'", "'Niveau'", "'pseudo'", "'Intervenant'", "'prenom'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalLangFil.g:71:1: ruleFaculte returns [EObject current=null] : (otherlv_0= 'Faculte' otherlv_1= '{' otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )? (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleFaculte() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
        AntlrDatatypeRuleToken lv_nom_3_0 = null;

        EObject lv_niveaux_6_0 = null;

        EObject lv_niveaux_8_0 = null;

        EObject lv_intervenants_12_0 = null;

        EObject lv_intervenants_14_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:77:2: ( (otherlv_0= 'Faculte' otherlv_1= '{' otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )? (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalLangFil.g:78:2: (otherlv_0= 'Faculte' otherlv_1= '{' otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )? (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalLangFil.g:78:2: (otherlv_0= 'Faculte' otherlv_1= '{' otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )? (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalLangFil.g:79:3: otherlv_0= 'Faculte' otherlv_1= '{' otherlv_2= 'nom' ( (lv_nom_3_0= ruleEString ) ) (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )? (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFaculteAccess().getFaculteKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFaculteAccess().getNomKeyword_2());
            		
            // InternalLangFil.g:91:3: ( (lv_nom_3_0= ruleEString ) )
            // InternalLangFil.g:92:4: (lv_nom_3_0= ruleEString )
            {
            // InternalLangFil.g:92:4: (lv_nom_3_0= ruleEString )
            // InternalLangFil.g:93:5: lv_nom_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFaculteAccess().getNomEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_nom_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFaculteRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_3_0,
            						"fil.xtextfil.LangFil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLangFil.g:110:3: (otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLangFil.g:111:4: otherlv_4= 'niveaux' otherlv_5= '{' ( (lv_niveaux_6_0= ruleNiveau ) ) (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFaculteAccess().getNiveauxKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalLangFil.g:119:4: ( (lv_niveaux_6_0= ruleNiveau ) )
                    // InternalLangFil.g:120:5: (lv_niveaux_6_0= ruleNiveau )
                    {
                    // InternalLangFil.g:120:5: (lv_niveaux_6_0= ruleNiveau )
                    // InternalLangFil.g:121:6: lv_niveaux_6_0= ruleNiveau
                    {

                    						newCompositeNode(grammarAccess.getFaculteAccess().getNiveauxNiveauParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_niveaux_6_0=ruleNiveau();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFaculteRule());
                    						}
                    						add(
                    							current,
                    							"niveaux",
                    							lv_niveaux_6_0,
                    							"fil.xtextfil.LangFil.Niveau");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:138:4: (otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalLangFil.g:139:5: otherlv_7= ',' ( (lv_niveaux_8_0= ruleNiveau ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFaculteAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalLangFil.g:143:5: ( (lv_niveaux_8_0= ruleNiveau ) )
                    	    // InternalLangFil.g:144:6: (lv_niveaux_8_0= ruleNiveau )
                    	    {
                    	    // InternalLangFil.g:144:6: (lv_niveaux_8_0= ruleNiveau )
                    	    // InternalLangFil.g:145:7: lv_niveaux_8_0= ruleNiveau
                    	    {

                    	    							newCompositeNode(grammarAccess.getFaculteAccess().getNiveauxNiveauParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_niveaux_8_0=ruleNiveau();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFaculteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"niveaux",
                    	    								lv_niveaux_8_0,
                    	    								"fil.xtextfil.LangFil.Niveau");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalLangFil.g:168:3: (otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLangFil.g:169:4: otherlv_10= 'intervenants' otherlv_11= '{' ( (lv_intervenants_12_0= ruleIntervenant ) ) (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getFaculteAccess().getIntervenantsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getFaculteAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalLangFil.g:177:4: ( (lv_intervenants_12_0= ruleIntervenant ) )
                    // InternalLangFil.g:178:5: (lv_intervenants_12_0= ruleIntervenant )
                    {
                    // InternalLangFil.g:178:5: (lv_intervenants_12_0= ruleIntervenant )
                    // InternalLangFil.g:179:6: lv_intervenants_12_0= ruleIntervenant
                    {

                    						newCompositeNode(grammarAccess.getFaculteAccess().getIntervenantsIntervenantParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_intervenants_12_0=ruleIntervenant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFaculteRule());
                    						}
                    						add(
                    							current,
                    							"intervenants",
                    							lv_intervenants_12_0,
                    							"fil.xtextfil.LangFil.Intervenant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLangFil.g:196:4: (otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalLangFil.g:197:5: otherlv_13= ',' ( (lv_intervenants_14_0= ruleIntervenant ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getFaculteAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalLangFil.g:201:5: ( (lv_intervenants_14_0= ruleIntervenant ) )
                    	    // InternalLangFil.g:202:6: (lv_intervenants_14_0= ruleIntervenant )
                    	    {
                    	    // InternalLangFil.g:202:6: (lv_intervenants_14_0= ruleIntervenant )
                    	    // InternalLangFil.g:203:7: lv_intervenants_14_0= ruleIntervenant
                    	    {

                    	    							newCompositeNode(grammarAccess.getFaculteAccess().getIntervenantsIntervenantParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_intervenants_14_0=ruleIntervenant();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFaculteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"intervenants",
                    	    								lv_intervenants_14_0,
                    	    								"fil.xtextfil.LangFil.Intervenant");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getFaculteAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalLangFil.g:234:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalLangFil.g:234:47: (iv_ruleEString= ruleEString EOF )
            // InternalLangFil.g:235:2: iv_ruleEString= ruleEString EOF
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
    // InternalLangFil.g:241:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalLangFil.g:247:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalLangFil.g:248:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalLangFil.g:248:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLangFil.g:249:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLangFil.g:257:3: this_ID_1= RULE_ID
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
    // InternalLangFil.g:268:1: entryRuleNiveau returns [EObject current=null] : iv_ruleNiveau= ruleNiveau EOF ;
    public final EObject entryRuleNiveau() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNiveau = null;


        try {
            // InternalLangFil.g:268:47: (iv_ruleNiveau= ruleNiveau EOF )
            // InternalLangFil.g:269:2: iv_ruleNiveau= ruleNiveau EOF
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
    // InternalLangFil.g:275:1: ruleNiveau returns [EObject current=null] : ( () otherlv_1= 'Niveau' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleNiveau() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_nom_4_0 = null;

        AntlrDatatypeRuleToken lv_pseudo_6_0 = null;



        	enterRule();

        try {
            // InternalLangFil.g:281:2: ( ( () otherlv_1= 'Niveau' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalLangFil.g:282:2: ( () otherlv_1= 'Niveau' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalLangFil.g:282:2: ( () otherlv_1= 'Niveau' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalLangFil.g:283:3: () otherlv_1= 'Niveau' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalLangFil.g:283:3: ()
            // InternalLangFil.g:284:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNiveauAccess().getNiveauAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNiveauAccess().getNiveauKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getNiveauAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLangFil.g:298:3: (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLangFil.g:299:4: otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getNiveauAccess().getNomKeyword_3_0());
                    			
                    // InternalLangFil.g:303:4: ( (lv_nom_4_0= ruleEString ) )
                    // InternalLangFil.g:304:5: (lv_nom_4_0= ruleEString )
                    {
                    // InternalLangFil.g:304:5: (lv_nom_4_0= ruleEString )
                    // InternalLangFil.g:305:6: lv_nom_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNiveauAccess().getNomEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nom_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNiveauRule());
                    						}
                    						set(
                    							current,
                    							"nom",
                    							lv_nom_4_0,
                    							"fil.xtextfil.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLangFil.g:323:3: (otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLangFil.g:324:4: otherlv_5= 'pseudo' ( (lv_pseudo_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getNiveauAccess().getPseudoKeyword_4_0());
                    			
                    // InternalLangFil.g:328:4: ( (lv_pseudo_6_0= ruleEString ) )
                    // InternalLangFil.g:329:5: (lv_pseudo_6_0= ruleEString )
                    {
                    // InternalLangFil.g:329:5: (lv_pseudo_6_0= ruleEString )
                    // InternalLangFil.g:330:6: lv_pseudo_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNiveauAccess().getPseudoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_pseudo_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNiveauRule());
                    						}
                    						set(
                    							current,
                    							"pseudo",
                    							lv_pseudo_6_0,
                    							"fil.xtextfil.LangFil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNiveauAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalLangFil.g:356:1: entryRuleIntervenant returns [EObject current=null] : iv_ruleIntervenant= ruleIntervenant EOF ;
    public final EObject entryRuleIntervenant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervenant = null;


        try {
            // InternalLangFil.g:356:52: (iv_ruleIntervenant= ruleIntervenant EOF )
            // InternalLangFil.g:357:2: iv_ruleIntervenant= ruleIntervenant EOF
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
    // InternalLangFil.g:363:1: ruleIntervenant returns [EObject current=null] : ( () otherlv_1= 'Intervenant' otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_ID ) ) (otherlv_5= 'prenom' ( (lv_prenom_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleIntervenant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_nom_4_0=null;
        Token otherlv_5=null;
        Token lv_prenom_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalLangFil.g:369:2: ( ( () otherlv_1= 'Intervenant' otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_ID ) ) (otherlv_5= 'prenom' ( (lv_prenom_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // InternalLangFil.g:370:2: ( () otherlv_1= 'Intervenant' otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_ID ) ) (otherlv_5= 'prenom' ( (lv_prenom_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // InternalLangFil.g:370:2: ( () otherlv_1= 'Intervenant' otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_ID ) ) (otherlv_5= 'prenom' ( (lv_prenom_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // InternalLangFil.g:371:3: () otherlv_1= 'Intervenant' otherlv_2= '{' otherlv_3= 'nom' ( (lv_nom_4_0= RULE_ID ) ) (otherlv_5= 'prenom' ( (lv_prenom_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // InternalLangFil.g:371:3: ()
            // InternalLangFil.g:372:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntervenantAccess().getIntervenantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervenantAccess().getIntervenantKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervenantAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getIntervenantAccess().getNomKeyword_3());
            		
            // InternalLangFil.g:390:3: ( (lv_nom_4_0= RULE_ID ) )
            // InternalLangFil.g:391:4: (lv_nom_4_0= RULE_ID )
            {
            // InternalLangFil.g:391:4: (lv_nom_4_0= RULE_ID )
            // InternalLangFil.g:392:5: lv_nom_4_0= RULE_ID
            {
            lv_nom_4_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_nom_4_0, grammarAccess.getIntervenantAccess().getNomIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntervenantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLangFil.g:408:3: (otherlv_5= 'prenom' ( (lv_prenom_6_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLangFil.g:409:4: otherlv_5= 'prenom' ( (lv_prenom_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getIntervenantAccess().getPrenomKeyword_5_0());
                    			
                    // InternalLangFil.g:413:4: ( (lv_prenom_6_0= RULE_STRING ) )
                    // InternalLangFil.g:414:5: (lv_prenom_6_0= RULE_STRING )
                    {
                    // InternalLangFil.g:414:5: (lv_prenom_6_0= RULE_STRING )
                    // InternalLangFil.g:415:6: lv_prenom_6_0= RULE_STRING
                    {
                    lv_prenom_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_prenom_6_0, grammarAccess.getIntervenantAccess().getPrenomSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntervenantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"prenom",
                    							lv_prenom_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIntervenantAccess().getRightCurlyBracketKeyword_6());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000092000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});

}