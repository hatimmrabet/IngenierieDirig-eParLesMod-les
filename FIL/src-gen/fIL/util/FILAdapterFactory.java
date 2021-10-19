/**
 */
package fIL.util;

import fIL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fIL.FILPackage
 * @generated
 */
public class FILAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FILPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FILAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FILPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FILSwitch<Adapter> modelSwitch = new FILSwitch<Adapter>() {
		@Override
		public Adapter caseFaculte(Faculte object) {
			return createFaculteAdapter();
		}

		@Override
		public Adapter caseNiveau(Niveau object) {
			return createNiveauAdapter();
		}

		@Override
		public Adapter caseFormation(Formation object) {
			return createFormationAdapter();
		}

		@Override
		public Adapter caseUE(UE object) {
			return createUEAdapter();
		}

		@Override
		public Adapter caseDocument(Document object) {
			return createDocumentAdapter();
		}

		@Override
		public Adapter caseVideo(Video object) {
			return createVideoAdapter();
		}

		@Override
		public Adapter caseFichier(Fichier object) {
			return createFichierAdapter();
		}

		@Override
		public Adapter caseAudio(Audio object) {
			return createAudioAdapter();
		}

		@Override
		public Adapter casePresentation(Presentation object) {
			return createPresentationAdapter();
		}

		@Override
		public Adapter caseIntervenant(Intervenant object) {
			return createIntervenantAdapter();
		}

		@Override
		public Adapter caseResponsable(Responsable object) {
			return createResponsableAdapter();
		}

		@Override
		public Adapter caseEnseignant(Enseignant object) {
			return createEnseignantAdapter();
		}

		@Override
		public Adapter caseS1(S1 object) {
			return createS1Adapter();
		}

		@Override
		public Adapter caseS2(S2 object) {
			return createS2Adapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Faculte <em>Faculte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Faculte
	 * @generated
	 */
	public Adapter createFaculteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Niveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Niveau
	 * @generated
	 */
	public Adapter createNiveauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Formation
	 * @generated
	 */
	public Adapter createFormationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.UE
	 * @generated
	 */
	public Adapter createUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Video
	 * @generated
	 */
	public Adapter createVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Fichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Fichier
	 * @generated
	 */
	public Adapter createFichierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Audio
	 * @generated
	 */
	public Adapter createAudioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Presentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Presentation
	 * @generated
	 */
	public Adapter createPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Intervenant <em>Intervenant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Intervenant
	 * @generated
	 */
	public Adapter createIntervenantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Responsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Responsable
	 * @generated
	 */
	public Adapter createResponsableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.Enseignant <em>Enseignant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.Enseignant
	 * @generated
	 */
	public Adapter createEnseignantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.S1 <em>S1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.S1
	 * @generated
	 */
	public Adapter createS1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fIL.S2 <em>S2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fIL.S2
	 * @generated
	 */
	public Adapter createS2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FILAdapterFactory
