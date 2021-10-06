/**
 */
package fIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Contact#getResponsables <em>Responsables</em>}</li>
 *   <li>{@link fIL.Contact#getStatut <em>Statut</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>Responsables</b></em>' reference list.
	 * The list contents are of type {@link fIL.Enseignant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsables</em>' reference list.
	 * @see fIL.FILPackage#getContact_Responsables()
	 * @model required="true"
	 * @generated
	 */
	EList<Enseignant> getResponsables();

	/**
	 * Returns the value of the '<em><b>Statut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statut</em>' attribute.
	 * @see #setStatut(String)
	 * @see fIL.FILPackage#getContact_Statut()
	 * @model
	 * @generated
	 */
	String getStatut();

	/**
	 * Sets the value of the '{@link fIL.Contact#getStatut <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statut</em>' attribute.
	 * @see #getStatut()
	 * @generated
	 */
	void setStatut(String value);

} // Contact
