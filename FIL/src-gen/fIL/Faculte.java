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
 *   <li>{@link fIL.Faculte#getName <em>Name</em>}</li>
 *   <li>{@link fIL.Faculte#getNiveaux <em>Niveaux</em>}</li>
 *   <li>{@link fIL.Faculte#getIntervenants <em>Intervenants</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getFaculte()
 * @model
 * @generated
 */
public interface Faculte extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fIL.FILPackage#getFaculte_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fIL.Faculte#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Niveaux</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Niveau}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveaux</em>' containment reference list.
	 * @see fIL.FILPackage#getFaculte_Niveaux()
	 * @model containment="true"
	 * @generated
	 */
	EList<Niveau> getNiveaux();

	/**
	 * Returns the value of the '<em><b>Intervenants</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervenants</em>' containment reference list.
	 * @see fIL.FILPackage#getFaculte_Intervenants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Intervenant> getIntervenants();

} // Faculte
