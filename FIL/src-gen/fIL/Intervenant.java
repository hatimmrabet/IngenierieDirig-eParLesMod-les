/**
 */
package fIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intervenant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Intervenant#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.Intervenant#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fIL.Intervenant#isResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getIntervenant()
 * @model
 * @generated
 */
public interface Intervenant extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fIL.FILPackage#getIntervenant_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fIL.Intervenant#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see fIL.FILPackage#getIntervenant_Prenom()
	 * @model
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link fIL.Intervenant#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' attribute.
	 * @see #setResponsable(boolean)
	 * @see fIL.FILPackage#getIntervenant_Responsable()
	 * @model
	 * @generated
	 */
	boolean isResponsable();

	/**
	 * Sets the value of the '{@link fIL.Intervenant#isResponsable <em>Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' attribute.
	 * @see #isResponsable()
	 * @generated
	 */
	void setResponsable(boolean value);

} // Intervenant
