/**
 */
package fIL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fIL.FILPackage
 * @generated
 */
public interface FILFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FILFactory eINSTANCE = fIL.impl.FILFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Faculte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Faculte</em>'.
	 * @generated
	 */
	Faculte createFaculte();

	/**
	 * Returns a new object of class '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Niveau</em>'.
	 * @generated
	 */
	Niveau createNiveau();

	/**
	 * Returns a new object of class '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formation</em>'.
	 * @generated
	 */
	Formation createFormation();

	/**
	 * Returns a new object of class '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UE</em>'.
	 * @generated
	 */
	UE createUE();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video</em>'.
	 * @generated
	 */
	Video createVideo();

	/**
	 * Returns a new object of class '<em>Fichier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fichier</em>'.
	 * @generated
	 */
	Fichier createFichier();

	/**
	 * Returns a new object of class '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio</em>'.
	 * @generated
	 */
	Audio createAudio();

	/**
	 * Returns a new object of class '<em>Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presentation</em>'.
	 * @generated
	 */
	Presentation createPresentation();

	/**
	 * Returns a new object of class '<em>Intervenant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intervenant</em>'.
	 * @generated
	 */
	Intervenant createIntervenant();

	/**
	 * Returns a new object of class '<em>Responsable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsable</em>'.
	 * @generated
	 */
	Responsable createResponsable();

	/**
	 * Returns a new object of class '<em>Enseignant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enseignant</em>'.
	 * @generated
	 */
	Enseignant createEnseignant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FILPackage getFILPackage();

} //FILFactory
