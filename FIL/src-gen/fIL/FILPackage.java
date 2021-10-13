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
	 * The feature id for the '<em><b>Ues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__UES = 2;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__PRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>Intervenant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__INTERVENANT = 4;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__DOCUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__PRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>Intervenant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__INTERVENANT = 4;

	/**
	 * The feature id for the '<em><b>Enseignants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__ENSEIGNANTS = 5;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__RESPONSABLE = 6;

	/**
	 * The number of structural features of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fIL.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.AudioImpl
	 * @see fIL.impl.FILPackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 7;

	/**
	 * The meta object id for the '{@link fIL.impl.NiveauImpl <em>Niveau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.NiveauImpl
	 * @see fIL.impl.FILPackageImpl#getNiveau()
	 * @generated
	 */
	int NIVEAU = 2;

	/**
	 * The meta object id for the '{@link fIL.impl.IntervenantImpl <em>Intervenant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.IntervenantImpl
	 * @see fIL.impl.FILPackageImpl#getIntervenant()
	 * @generated
	 */
	int INTERVENANT = 3;

	/**
	 * The meta object id for the '{@link fIL.impl.DocumentsImpl <em>Documents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.DocumentsImpl
	 * @see fIL.impl.FILPackageImpl#getDocuments()
	 * @generated
	 */
	int DOCUMENTS = 4;

	/**
	 * The meta object id for the '{@link fIL.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.VideoImpl
	 * @see fIL.impl.FILPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 5;

	/**
	 * The meta object id for the '{@link fIL.impl.FichierImpl <em>Fichier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.FichierImpl
	 * @see fIL.impl.FILPackageImpl#getFichier()
	 * @generated
	 */
	int FICHIER = 6;

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
	 * The feature id for the '<em><b>Formation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__FORMATION = 2;

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
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__PRENOM = 1;

	/**
	 * The number of structural features of the '<em>Intervenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Intervenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS__TAILLE = 2;

	/**
	 * The number of structural features of the '<em>Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Documents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NOM = DOCUMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DESCRIPTION = DOCUMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__TAILLE = DOCUMENTS__TAILLE;

	/**
	 * The feature id for the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DUREE = DOCUMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = DOCUMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = DOCUMENTS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__NOM = DOCUMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__DESCRIPTION = DOCUMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__TAILLE = DOCUMENTS__TAILLE;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__LIEN = DOCUMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__AUTEUR = DOCUMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fichier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_FEATURE_COUNT = DOCUMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fichier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_OPERATION_COUNT = DOCUMENTS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__NOM = DOCUMENTS__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__DESCRIPTION = DOCUMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__TAILLE = DOCUMENTS__TAILLE;

	/**
	 * The feature id for the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__DUREE = DOCUMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = DOCUMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OPERATION_COUNT = DOCUMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fIL.impl.PresentationImpl <em>Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.PresentationImpl
	 * @see fIL.impl.FILPackageImpl#getPresentation()
	 * @generated
	 */
	int PRESENTATION = 8;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__TITRE = 0;

	/**
	 * The feature id for the '<em><b>Contenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__CONTENUE = 1;

	/**
	 * The number of structural features of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fIL.impl.FaculteImpl <em>Faculte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.FaculteImpl
	 * @see fIL.impl.FILPackageImpl#getFaculte()
	 * @generated
	 */
	int FACULTE = 9;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTE__NIVEAU = 1;

	/**
	 * The number of structural features of the '<em>Faculte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Faculte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fIL.impl.ResponsableImpl <em>Responsable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.ResponsableImpl
	 * @see fIL.impl.FILPackageImpl#getResponsable()
	 * @generated
	 */
	int RESPONSABLE = 10;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__NOM = INTERVENANT__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__PRENOM = INTERVENANT__PRENOM;

	/**
	 * The number of structural features of the '<em>Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE_FEATURE_COUNT = INTERVENANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE_OPERATION_COUNT = INTERVENANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fIL.impl.EnseignantImpl <em>Enseignant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fIL.impl.EnseignantImpl
	 * @see fIL.impl.FILPackageImpl#getEnseignant()
	 * @generated
	 */
	int ENSEIGNANT = 11;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__NOM = INTERVENANT__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT__PRENOM = INTERVENANT__PRENOM;

	/**
	 * The number of structural features of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_FEATURE_COUNT = INTERVENANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enseignant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEIGNANT_OPERATION_COUNT = INTERVENANT_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link fIL.Formation#getIntervenant <em>Intervenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intervenant</em>'.
	 * @see fIL.Formation#getIntervenant()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Intervenant();

	/**
	 * Returns the meta object for the containment reference '{@link fIL.Formation#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation</em>'.
	 * @see fIL.Formation#getPresentation()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Presentation();

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
	 * Returns the meta object for the containment reference list '{@link fIL.UE#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documents</em>'.
	 * @see fIL.UE#getDocuments()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Documents();

	/**
	 * Returns the meta object for the containment reference '{@link fIL.UE#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Presentation</em>'.
	 * @see fIL.UE#getPresentation()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Presentation();

	/**
	 * Returns the meta object for the containment reference list '{@link fIL.UE#getIntervenant <em>Intervenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intervenant</em>'.
	 * @see fIL.UE#getIntervenant()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Intervenant();

	/**
	 * Returns the meta object for the reference list '{@link fIL.UE#getEnseignants <em>Enseignants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enseignants</em>'.
	 * @see fIL.UE#getEnseignants()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Enseignants();

	/**
	 * Returns the meta object for the reference list '{@link fIL.UE#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsable</em>'.
	 * @see fIL.UE#getResponsable()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Responsable();

	/**
	 * Returns the meta object for class '{@link fIL.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see fIL.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Audio#getDuree <em>Duree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duree</em>'.
	 * @see fIL.Audio#getDuree()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Duree();

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
	 * Returns the meta object for the attribute '{@link fIL.Presentation#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see fIL.Presentation#getTitre()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Titre();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Presentation#getContenue <em>Contenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenue</em>'.
	 * @see fIL.Presentation#getContenue()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Contenue();

	/**
	 * Returns the meta object for class '{@link fIL.Faculte <em>Faculte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faculte</em>'.
	 * @see fIL.Faculte
	 * @generated
	 */
	EClass getFaculte();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Faculte#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fIL.Faculte#getNom()
	 * @see #getFaculte()
	 * @generated
	 */
	EAttribute getFaculte_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link fIL.Faculte#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Niveau</em>'.
	 * @see fIL.Faculte#getNiveau()
	 * @see #getFaculte()
	 * @generated
	 */
	EReference getFaculte_Niveau();

	/**
	 * Returns the meta object for class '{@link fIL.Responsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsable</em>'.
	 * @see fIL.Responsable
	 * @generated
	 */
	EClass getResponsable();

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
	 * Returns the meta object for the containment reference list '{@link fIL.Niveau#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formation</em>'.
	 * @see fIL.Niveau#getFormation()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Formation();

	/**
	 * Returns the meta object for class '{@link fIL.Intervenant <em>Intervenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervenant</em>'.
	 * @see fIL.Intervenant
	 * @generated
	 */
	EClass getIntervenant();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Intervenant#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fIL.Intervenant#getNom()
	 * @see #getIntervenant()
	 * @generated
	 */
	EAttribute getIntervenant_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Intervenant#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see fIL.Intervenant#getPrenom()
	 * @see #getIntervenant()
	 * @generated
	 */
	EAttribute getIntervenant_Prenom();

	/**
	 * Returns the meta object for class '{@link fIL.Documents <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documents</em>'.
	 * @see fIL.Documents
	 * @generated
	 */
	EClass getDocuments();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Documents#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fIL.Documents#getNom()
	 * @see #getDocuments()
	 * @generated
	 */
	EAttribute getDocuments_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Documents#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fIL.Documents#getDescription()
	 * @see #getDocuments()
	 * @generated
	 */
	EAttribute getDocuments_Description();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Documents#getTaille <em>Taille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille</em>'.
	 * @see fIL.Documents#getTaille()
	 * @see #getDocuments()
	 * @generated
	 */
	EAttribute getDocuments_Taille();

	/**
	 * Returns the meta object for class '{@link fIL.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see fIL.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Video#getDuree <em>Duree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duree</em>'.
	 * @see fIL.Video#getDuree()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Duree();

	/**
	 * Returns the meta object for class '{@link fIL.Fichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fichier</em>'.
	 * @see fIL.Fichier
	 * @generated
	 */
	EClass getFichier();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Fichier#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lien</em>'.
	 * @see fIL.Fichier#getLien()
	 * @see #getFichier()
	 * @generated
	 */
	EAttribute getFichier_Lien();

	/**
	 * Returns the meta object for the attribute '{@link fIL.Fichier#getAuteur <em>Auteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auteur</em>'.
	 * @see fIL.Fichier#getAuteur()
	 * @see #getFichier()
	 * @generated
	 */
	EAttribute getFichier_Auteur();

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
		 * The meta object literal for the '<em><b>Ues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__UES = eINSTANCE.getFormation_Ues();

		/**
		 * The meta object literal for the '<em><b>Intervenant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__INTERVENANT = eINSTANCE.getFormation_Intervenant();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__PRESENTATION = eINSTANCE.getFormation_Presentation();

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
		 * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__DOCUMENTS = eINSTANCE.getUE_Documents();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__PRESENTATION = eINSTANCE.getUE_Presentation();

		/**
		 * The meta object literal for the '<em><b>Intervenant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__INTERVENANT = eINSTANCE.getUE_Intervenant();

		/**
		 * The meta object literal for the '<em><b>Enseignants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__ENSEIGNANTS = eINSTANCE.getUE_Enseignants();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__RESPONSABLE = eINSTANCE.getUE_Responsable();

		/**
		 * The meta object literal for the '{@link fIL.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.AudioImpl
		 * @see fIL.impl.FILPackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__DUREE = eINSTANCE.getAudio_Duree();

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
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__TITRE = eINSTANCE.getPresentation_Titre();

		/**
		 * The meta object literal for the '<em><b>Contenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__CONTENUE = eINSTANCE.getPresentation_Contenue();

		/**
		 * The meta object literal for the '{@link fIL.impl.FaculteImpl <em>Faculte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.FaculteImpl
		 * @see fIL.impl.FILPackageImpl#getFaculte()
		 * @generated
		 */
		EClass FACULTE = eINSTANCE.getFaculte();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACULTE__NOM = eINSTANCE.getFaculte_Nom();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTE__NIVEAU = eINSTANCE.getFaculte_Niveau();

		/**
		 * The meta object literal for the '{@link fIL.impl.ResponsableImpl <em>Responsable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.ResponsableImpl
		 * @see fIL.impl.FILPackageImpl#getResponsable()
		 * @generated
		 */
		EClass RESPONSABLE = eINSTANCE.getResponsable();

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
		 * The meta object literal for the '<em><b>Formation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__FORMATION = eINSTANCE.getNiveau_Formation();

		/**
		 * The meta object literal for the '{@link fIL.impl.IntervenantImpl <em>Intervenant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.IntervenantImpl
		 * @see fIL.impl.FILPackageImpl#getIntervenant()
		 * @generated
		 */
		EClass INTERVENANT = eINSTANCE.getIntervenant();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVENANT__NOM = eINSTANCE.getIntervenant_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVENANT__PRENOM = eINSTANCE.getIntervenant_Prenom();

		/**
		 * The meta object literal for the '{@link fIL.impl.DocumentsImpl <em>Documents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.DocumentsImpl
		 * @see fIL.impl.FILPackageImpl#getDocuments()
		 * @generated
		 */
		EClass DOCUMENTS = eINSTANCE.getDocuments();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTS__NOM = eINSTANCE.getDocuments_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTS__DESCRIPTION = eINSTANCE.getDocuments_Description();

		/**
		 * The meta object literal for the '<em><b>Taille</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTS__TAILLE = eINSTANCE.getDocuments_Taille();

		/**
		 * The meta object literal for the '{@link fIL.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.VideoImpl
		 * @see fIL.impl.FILPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DUREE = eINSTANCE.getVideo_Duree();

		/**
		 * The meta object literal for the '{@link fIL.impl.FichierImpl <em>Fichier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fIL.impl.FichierImpl
		 * @see fIL.impl.FILPackageImpl#getFichier()
		 * @generated
		 */
		EClass FICHIER = eINSTANCE.getFichier();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHIER__LIEN = eINSTANCE.getFichier_Lien();

		/**
		 * The meta object literal for the '<em><b>Auteur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHIER__AUTEUR = eINSTANCE.getFichier_Auteur();

	}

} //FILPackage
