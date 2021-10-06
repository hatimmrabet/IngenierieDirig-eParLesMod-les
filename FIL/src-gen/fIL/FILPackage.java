/**
 */
package fIL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fIL.FILFactory
 * @model kind="package"
 * @generated
 */
public interface FILPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fIL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/fIL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fIL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FILPackage eINSTANCE = fIL.impl.FILPackageImpl.init();

	/**
	 * The meta object id for the '{@link fIL.impl.FormationImpl <em>Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.FormationImpl
	 * @see fIL.impl.FILPackageImpl#getFormation()
	 * @generated
	 */
	int FORMATION = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NOM = 0;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__PSEUDO = 1;

	/**
	 * The feature id for the '<em><b>Contient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__CONTIENT = 2;

	/**
	 * The feature id for the '<em><b>Ues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__UES = 3;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__CONTACTS = 4;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NIVEAU = 5;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fIL.impl.UEImpl <em>UE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.UEImpl
	 * @see fIL.impl.FILPackageImpl#getUE()
	 * @generated
	 */
	int UE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__PSEUDO = 1;

	/**
	 * The number of structural features of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fIL.impl.EnseignantImpl <em>Enseignant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.EnseignantImpl
	 * @see fIL.impl.FILPackageImpl#getEnseignant()
	 * @generated
	 */
	int ENSEIGNANT = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__MAIL = 2;

	/**
	 * The feature id for the '<em><b>Tel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__TEL = 3;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__ADRESSE = 4;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__FAX = 5;

	/**
	 * The number of structural features of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fIL.impl.PresentationImpl <em>Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.PresentationImpl
	 * @see fIL.impl.FILPackageImpl#getPresentation()
	 * @generated
	 */
	int PRESENTATION = 3;

	/**
	 * The number of structural features of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fIL.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.ContactImpl
	 * @see fIL.impl.FILPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 4;

	/**
	 * The feature id for the '<em><b>Responsables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__RESPONSABLES = 0;

	/**
	 * The feature id for the '<em><b>Statut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__STATUT = 1;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fIL.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.ArticleImpl
	 * @see fIL.impl.FILPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 5;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Contenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CONTENUE = 1;

	/**
	 * The feature id for the '<em><b>Onglet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__ONGLET = 2;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fIL.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.InformationImpl
	 * @see fIL.impl.FILPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ARTICLES = 1;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fIL.impl.NiveauImpl <em>Niveau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.NiveauImpl
	 * @see fIL.impl.FILPackageImpl#getNiveau()
	 * @generated
	 */
	int NIVEAU = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__NOM = 0;

	/**
	 * The feature id for the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__PSEUDO = 1;

	/**
	 * The feature id for the '<em><b>Formations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__FORMATIONS = 2;

	/**
	 * The number of structural features of the '<em>Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fIL.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formation</em>'.
	 * @see fIL.Formation
	 * @generated
	 */
	EClass getFormation();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Formation#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fIL.Formation#getNom()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Formation#getPseudo <em>Pseudo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo</em>'.
	 * @see fIL.Formation#getPseudo()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Pseudo();

	/**
	 * Returns the meta object for the containment reference '{@link fIL.Formation#getContient <em>Contient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contient</em>'.
	 * @see fIL.Formation#getContient()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Contient();

	/**
	 * Returns the meta object for the containment reference list '{@link fIL.Formation#getUes <em>Ues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ues</em>'.
	 * @see fIL.Formation#getUes()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Ues();

	/**
	 * Returns the meta object for the containment reference list '{@link fIL.Formation#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contacts</em>'.
	 * @see fIL.Formation#getContacts()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Contacts();

	/**
	 * Returns the meta object for the reference '{@link fIL.Formation#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Niveau</em>'.
	 * @see fIL.Formation#getNiveau()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Niveau();

	/**
	 * Returns the meta object for class '{@link fIL.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UE</em>'.
	 * @see fIL.UE
	 * @generated
	 */
	EClass getUE();

	/**
	 * Returns the meta object for the attribute '{@link fIL.UE#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fIL.UE#getNom()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fIL.UE#getPseudo <em>Pseudo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo</em>'.
	 * @see fIL.UE#getPseudo()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Pseudo();

	/**
	 * Returns the meta object for class '{@link fIL.Enseignant <em>Enseignant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enseignant</em>'.
	 * @see fIL.Enseignant
	 * @generated
	 */
	EClass getEnseignant();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Enseignant#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fIL.Enseignant#getNom()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Enseignant#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see fIL.Enseignant#getPrenom()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Enseignant#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see fIL.Enseignant#getMail()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Mail();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Enseignant#getTel <em>Tel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tel</em>'.
	 * @see fIL.Enseignant#getTel()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Tel();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Enseignant#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see fIL.Enseignant#getAdresse()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Enseignant#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see fIL.Enseignant#getFax()
	 * @see #getEnseignant()
	 * @generated
	 */
	EAttribute getEnseignant_Fax();

	/**
	 * Returns the meta object for class '{@link fIL.Presentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation</em>'.
	 * @see fIL.Presentation
	 * @generated
	 */
	EClass getPresentation();

	/**
	 * Returns the meta object for class '{@link fIL.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see fIL.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the reference list '{@link fIL.Contact#getResponsables <em>Responsables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsables</em>'.
	 * @see fIL.Contact#getResponsables()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_Responsables();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Contact#getStatut <em>Statut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statut</em>'.
	 * @see fIL.Contact#getStatut()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Statut();

	/**
	 * Returns the meta object for class '{@link fIL.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see fIL.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Article#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see fIL.Article#getTitre()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Titre();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Article#getContenue <em>Contenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenue</em>'.
	 * @see fIL.Article#getContenue()
	 * @see #getArticle()
	 * @generated
	 */
	EAttribute getArticle_Contenue();

	/**
	 * Returns the meta object for the reference '{@link fIL.Article#getOnglet <em>Onglet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Onglet</em>'.
	 * @see fIL.Article#getOnglet()
	 * @see #getArticle()
	 * @generated
	 */
	EReference getArticle_Onglet();

	/**
	 * Returns the meta object for class '{@link fIL.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see fIL.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Information#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see fIL.Information#getTitre()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Titre();

	/**
	 * Returns the meta object for the reference list '{@link fIL.Information#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Articles</em>'.
	 * @see fIL.Information#getArticles()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Articles();

	/**
	 * Returns the meta object for class '{@link fIL.Niveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Niveau</em>'.
	 * @see fIL.Niveau
	 * @generated
	 */
	EClass getNiveau();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Niveau#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fIL.Niveau#getNom()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Niveau#getPseudo <em>Pseudo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudo</em>'.
	 * @see fIL.Niveau#getPseudo()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Pseudo();

	/**
	 * Returns the meta object for the reference list '{@link fIL.Niveau#getFormations <em>Formations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formations</em>'.
	 * @see fIL.Niveau#getFormations()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Formations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FILFactory getFILFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fIL.impl.FormationImpl <em>Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.FormationImpl
		 * @see fIL.impl.FILPackageImpl#getFormation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getFormation();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NOM = eINSTANCE.getFormation_Nom();

		/**
		 * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__PSEUDO = eINSTANCE.getFormation_Pseudo();

		/**
		 * The meta object literal for the '<em><b>Contient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__CONTIENT = eINSTANCE.getFormation_Contient();

		/**
		 * The meta object literal for the '<em><b>Ues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__UES = eINSTANCE.getFormation_Ues();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__CONTACTS = eINSTANCE.getFormation_Contacts();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__NIVEAU = eINSTANCE.getFormation_Niveau();

		/**
		 * The meta object literal for the '{@link fIL.impl.UEImpl <em>UE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.UEImpl
		 * @see fIL.impl.FILPackageImpl#getUE()
		 * @generated
		 */
		EClass UE = eINSTANCE.getUE();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__NOM = eINSTANCE.getUE_Nom();

		/**
		 * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__PSEUDO = eINSTANCE.getUE_Pseudo();

		/**
		 * The meta object literal for the '{@link fIL.impl.EnseignantImpl <em>Enseignant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.EnseignantImpl
		 * @see fIL.impl.FILPackageImpl#getEnseignant()
		 * @generated
		 */
		EClass ENSEIGNANT = eINSTANCE.getEnseignant();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__NOM = eINSTANCE.getEnseignant_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__PRENOM = eINSTANCE.getEnseignant_Prenom();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__MAIL = eINSTANCE.getEnseignant_Mail();

		/**
		 * The meta object literal for the '<em><b>Tel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__TEL = eINSTANCE.getEnseignant_Tel();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__ADRESSE = eINSTANCE.getEnseignant_Adresse();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENSEIGNANT__FAX = eINSTANCE.getEnseignant_Fax();

		/**
		 * The meta object literal for the '{@link fIL.impl.PresentationImpl <em>Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.PresentationImpl
		 * @see fIL.impl.FILPackageImpl#getPresentation()
		 * @generated
		 */
		EClass PRESENTATION = eINSTANCE.getPresentation();

		/**
		 * The meta object literal for the '{@link fIL.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.ContactImpl
		 * @see fIL.impl.FILPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Responsables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__RESPONSABLES = eINSTANCE.getContact_Responsables();

		/**
		 * The meta object literal for the '<em><b>Statut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__STATUT = eINSTANCE.getContact_Statut();

		/**
		 * The meta object literal for the '{@link fIL.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.ArticleImpl
		 * @see fIL.impl.FILPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__TITRE = eINSTANCE.getArticle_Titre();

		/**
		 * The meta object literal for the '<em><b>Contenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLE__CONTENUE = eINSTANCE.getArticle_Contenue();

		/**
		 * The meta object literal for the '<em><b>Onglet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTICLE__ONGLET = eINSTANCE.getArticle_Onglet();

		/**
		 * The meta object literal for the '{@link fIL.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.InformationImpl
		 * @see fIL.impl.FILPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__TITRE = eINSTANCE.getInformation_Titre();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__ARTICLES = eINSTANCE.getInformation_Articles();

		/**
		 * The meta object literal for the '{@link fIL.impl.NiveauImpl <em>Niveau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.NiveauImpl
		 * @see fIL.impl.FILPackageImpl#getNiveau()
		 * @generated
		 */
		EClass NIVEAU = eINSTANCE.getNiveau();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__NOM = eINSTANCE.getNiveau_Nom();

		/**
		 * The meta object literal for the '<em><b>Pseudo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__PSEUDO = eINSTANCE.getNiveau_Pseudo();

		/**
		 * The meta object literal for the '<em><b>Formations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__FORMATIONS = eINSTANCE.getNiveau_Formations();

	}

} //FILPackage
