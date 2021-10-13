/**
 */
package fIL.impl;

import fIL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FILFactoryImpl extends EFactoryImpl implements FILFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FILFactory init() {
		try {
			FILFactory theFILFactory = (FILFactory) EPackage.Registry.INSTANCE.getEFactory(FILPackage.eNS_URI);
			if (theFILFactory != null) {
				return theFILFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FILFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FILFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FILPackage.FORMATION:
			return createFormation();
		case FILPackage.UE:
			return createUE();
		case FILPackage.NIVEAU:
			return createNiveau();
		case FILPackage.INTERVENANT:
			return createIntervenant();
		case FILPackage.DOCUMENTS:
			return createDocuments();
		case FILPackage.VIDEO:
			return createVideo();
		case FILPackage.FICHIER:
			return createFichier();
		case FILPackage.AUDIO:
			return createAudio();
		case FILPackage.PRESENTATION:
			return createPresentation();
		case FILPackage.FACULTE:
			return createFaculte();
		case FILPackage.RESPONSABLE:
			return createResponsable();
		case FILPackage.ENSEIGNANT:
			return createEnseignant();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation createFormation() {
		FormationImpl formation = new FormationImpl();
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UE createUE() {
		UEImpl ue = new UEImpl();
		return ue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Audio createAudio() {
		AudioImpl audio = new AudioImpl();
		return audio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Presentation createPresentation() {
		PresentationImpl presentation = new PresentationImpl();
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Faculte createFaculte() {
		FaculteImpl faculte = new FaculteImpl();
		return faculte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsable createResponsable() {
		ResponsableImpl responsable = new ResponsableImpl();
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enseignant createEnseignant() {
		EnseignantImpl enseignant = new EnseignantImpl();
		return enseignant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Niveau createNiveau() {
		NiveauImpl niveau = new NiveauImpl();
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intervenant createIntervenant() {
		IntervenantImpl intervenant = new IntervenantImpl();
		return intervenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documents createDocuments() {
		DocumentsImpl documents = new DocumentsImpl();
		return documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fichier createFichier() {
		FichierImpl fichier = new FichierImpl();
		return fichier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FILPackage getFILPackage() {
		return (FILPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FILPackage getPackage() {
		return FILPackage.eINSTANCE;
	}

} //FILFactoryImpl
