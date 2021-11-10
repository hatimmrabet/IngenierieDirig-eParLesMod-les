/**
 */
package fIL.impl;

import fIL.Audio;
import fIL.Document;
import fIL.Enseignant;
import fIL.FILFactory;
import fIL.FILPackage;
import fIL.Faculte;
import fIL.Fichier;
import fIL.Formation;
import fIL.Intervenant;
import fIL.Niveau;
import fIL.Presentation;
import fIL.Responsable;
import fIL.Semestre;
import fIL.Video;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FILPackageImpl extends EPackageImpl implements FILPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faculteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass niveauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fichierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervenantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enseignantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass s2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semestreEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fIL.FILPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FILPackageImpl() {
		super(eNS_URI, FILFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FILPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FILPackage init() {
		if (isInited)
			return (FILPackage) EPackage.Registry.INSTANCE.getEPackage(FILPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFILPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FILPackageImpl theFILPackage = registeredFILPackage instanceof FILPackageImpl
				? (FILPackageImpl) registeredFILPackage
				: new FILPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFILPackage.createPackageContents();

		// Initialize created meta-data
		theFILPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFILPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FILPackage.eNS_URI, theFILPackage);
		return theFILPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaculte() {
		return faculteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaculte_Nom() {
		return (EAttribute) faculteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaculte_Niveaux() {
		return (EReference) faculteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFaculte_Intervenants() {
		return (EReference) faculteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNiveau() {
		return niveauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNiveau_Nom() {
		return (EAttribute) niveauEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNiveau_Pseudo() {
		return (EAttribute) niveauEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Formations() {
		return (EReference) niveauEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Presentation() {
		return (EReference) niveauEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Responsables() {
		return (EReference) niveauEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNiveau_Ues() {
		return (EReference) niveauEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormation() {
		return formationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormation_Nom() {
		return (EAttribute) formationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormation_Pseudo() {
		return (EAttribute) formationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Presentation() {
		return (EReference) formationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_S1() {
		return (EReference) formationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_S2() {
		return (EReference) formationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Responsables() {
		return (EReference) formationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Enseignants() {
		return (EReference) formationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUE() {
		return ueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_Nom() {
		return (EAttribute) ueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUE_Pseudo() {
		return (EAttribute) ueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Documents() {
		return (EReference) ueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Presentation() {
		return (EReference) ueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Responsables() {
		return (EReference) ueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUE_Enseignants() {
		return (EReference) ueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Nom() {
		return (EAttribute) documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Description() {
		return (EAttribute) documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Taille() {
		return (EAttribute) documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideo_Duree() {
		return (EAttribute) videoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFichier() {
		return fichierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichier_Lien() {
		return (EAttribute) fichierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichier_Auteur() {
		return (EAttribute) fichierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudio() {
		return audioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudio_Duree() {
		return (EAttribute) audioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresentation() {
		return presentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Contenue() {
		return (EAttribute) presentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervenant() {
		return intervenantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervenant_Nom() {
		return (EAttribute) intervenantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervenant_Prenom() {
		return (EAttribute) intervenantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsable() {
		return responsableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnseignant() {
		return enseignantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS1() {
		return s1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getS2() {
		return s2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemestre() {
		return semestreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemestre_Uesoptionnelles() {
		return (EReference) semestreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemestre_Uesobligatoires() {
		return (EReference) semestreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FILFactory getFILFactory() {
		return (FILFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		faculteEClass = createEClass(FACULTE);
		createEAttribute(faculteEClass, FACULTE__NOM);
		createEReference(faculteEClass, FACULTE__NIVEAUX);
		createEReference(faculteEClass, FACULTE__INTERVENANTS);

		niveauEClass = createEClass(NIVEAU);
		createEAttribute(niveauEClass, NIVEAU__NOM);
		createEAttribute(niveauEClass, NIVEAU__PSEUDO);
		createEReference(niveauEClass, NIVEAU__FORMATIONS);
		createEReference(niveauEClass, NIVEAU__PRESENTATION);
		createEReference(niveauEClass, NIVEAU__RESPONSABLES);
		createEReference(niveauEClass, NIVEAU__UES);

		formationEClass = createEClass(FORMATION);
		createEAttribute(formationEClass, FORMATION__NOM);
		createEAttribute(formationEClass, FORMATION__PSEUDO);
		createEReference(formationEClass, FORMATION__PRESENTATION);
		createEReference(formationEClass, FORMATION__S1);
		createEReference(formationEClass, FORMATION__S2);
		createEReference(formationEClass, FORMATION__RESPONSABLES);
		createEReference(formationEClass, FORMATION__ENSEIGNANTS);

		ueEClass = createEClass(UE);
		createEAttribute(ueEClass, UE__NOM);
		createEAttribute(ueEClass, UE__PSEUDO);
		createEReference(ueEClass, UE__DOCUMENTS);
		createEReference(ueEClass, UE__RESPONSABLES);
		createEReference(ueEClass, UE__ENSEIGNANTS);
		createEReference(ueEClass, UE__PRESENTATION);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__NOM);
		createEAttribute(documentEClass, DOCUMENT__DESCRIPTION);
		createEAttribute(documentEClass, DOCUMENT__TAILLE);

		videoEClass = createEClass(VIDEO);
		createEAttribute(videoEClass, VIDEO__DUREE);

		fichierEClass = createEClass(FICHIER);
		createEAttribute(fichierEClass, FICHIER__LIEN);
		createEAttribute(fichierEClass, FICHIER__AUTEUR);

		audioEClass = createEClass(AUDIO);
		createEAttribute(audioEClass, AUDIO__DUREE);

		presentationEClass = createEClass(PRESENTATION);
		createEAttribute(presentationEClass, PRESENTATION__CONTENUE);

		intervenantEClass = createEClass(INTERVENANT);
		createEAttribute(intervenantEClass, INTERVENANT__NOM);
		createEAttribute(intervenantEClass, INTERVENANT__PRENOM);

		responsableEClass = createEClass(RESPONSABLE);

		enseignantEClass = createEClass(ENSEIGNANT);

		s1EClass = createEClass(S1);

		s2EClass = createEClass(S2);

		semestreEClass = createEClass(SEMESTRE);
		createEReference(semestreEClass, SEMESTRE__UESOPTIONNELLES);
		createEReference(semestreEClass, SEMESTRE__UESOBLIGATOIRES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		videoEClass.getESuperTypes().add(this.getDocument());
		fichierEClass.getESuperTypes().add(this.getDocument());
		audioEClass.getESuperTypes().add(this.getDocument());
		s1EClass.getESuperTypes().add(this.getSemestre());
		s2EClass.getESuperTypes().add(this.getSemestre());

		// Initialize classes, features, and operations; add parameters
		initEClass(faculteEClass, Faculte.class, "Faculte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaculte_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Faculte.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaculte_Niveaux(), this.getNiveau(), null, "niveaux", null, 1, -1, Faculte.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFaculte_Intervenants(), this.getIntervenant(), null, "intervenants", null, 0, -1,
				Faculte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(niveauEClass, Niveau.class, "Niveau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNiveau_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Niveau.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNiveau_Pseudo(), ecorePackage.getEString(), "pseudo", null, 0, 1, Niveau.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Formations(), this.getFormation(), null, "formations", null, 1, -1, Niveau.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Presentation(), this.getPresentation(), null, "presentation", null, 0, 1, Niveau.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Responsables(), this.getIntervenant(), null, "responsables", null, 1, -1, Niveau.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNiveau_Ues(), this.getUE(), null, "ues", null, 1, -1, Niveau.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(formationEClass, Formation.class, "Formation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormation_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Formation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormation_Pseudo(), ecorePackage.getEString(), "pseudo", null, 0, 1, Formation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_Presentation(), this.getPresentation(), null, "presentation", null, 0, 1,
				Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_S1(), this.getS1(), null, "s1", null, 1, 1, Formation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFormation_S2(), this.getS2(), null, "s2", null, 1, 1, Formation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFormation_Responsables(), this.getIntervenant(), null, "responsables", null, 1, -1,
				Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_Enseignants(), this.getIntervenant(), null, "enseignants", null, 0, -1,
				Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ueEClass, fIL.UE.class, "UE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUE_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, fIL.UE.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUE_Pseudo(), ecorePackage.getEString(), "pseudo", null, 0, 1, fIL.UE.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Documents(), this.getDocument(), null, "documents", null, 0, -1, fIL.UE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Responsables(), this.getIntervenant(), null, "responsables", null, 1, -1, fIL.UE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Enseignants(), this.getIntervenant(), null, "enseignants", null, 0, -1, fIL.UE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUE_Presentation(), this.getPresentation(), null, "presentation", null, 0, 1, fIL.UE.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Document.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Description(), ecorePackage.getEString(), "description", null, 0, 1, Document.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Taille(), ecorePackage.getEString(), "taille", null, 0, 1, Document.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideo_Duree(), ecorePackage.getEString(), "duree", null, 0, 1, Video.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fichierEClass, Fichier.class, "Fichier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFichier_Lien(), ecorePackage.getEString(), "lien", null, 0, 1, Fichier.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichier_Auteur(), ecorePackage.getEString(), "auteur", null, 0, 1, Fichier.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioEClass, Audio.class, "Audio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudio_Duree(), ecorePackage.getEString(), "duree", null, 0, 1, Audio.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationEClass, Presentation.class, "Presentation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresentation_Contenue(), ecorePackage.getEString(), "contenue", null, 0, 1,
				Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(intervenantEClass, Intervenant.class, "Intervenant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervenant_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Intervenant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervenant_Prenom(), ecorePackage.getEString(), "prenom", null, 0, 1, Intervenant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsableEClass, Responsable.class, "Responsable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(enseignantEClass, Enseignant.class, "Enseignant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(s1EClass, fIL.S1.class, "S1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(s2EClass, fIL.S2.class, "S2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(semestreEClass, Semestre.class, "Semestre", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemestre_Uesoptionnelles(), this.getUE(), null, "uesoptionnelles", null, 0, -1,
				Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemestre_Uesobligatoires(), this.getUE(), null, "uesobligatoires", null, 0, -1,
				Semestre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FILPackageImpl
