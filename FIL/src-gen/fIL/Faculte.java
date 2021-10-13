/**
 */
package fIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Faculte#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.Faculte#getNiveau <em>Niveau</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getFaculte()
 * @model
 * @generated
 */
public interface Faculte extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fIL.FILPackage#getFaculte_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fIL.Faculte#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Niveau}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' containment reference list.
	 * @see fIL.FILPackage#getFaculte_Niveau()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Niveau> getNiveau();

} // Faculte
