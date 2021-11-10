/**
 */
package fIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Semestre#getUesoptionnelles <em>Uesoptionnelles</em>}</li>
 *   <li>{@link fIL.Semestre#getUesobligatoires <em>Uesobligatoires</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getSemestre()
 * @model abstract="true"
 * @generated
 */
public interface Semestre extends EObject {
	/**
	 * Returns the value of the '<em><b>Uesoptionnelles</b></em>' reference list.
	 * The list contents are of type {@link fIL.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uesoptionnelles</em>' reference list.
	 * @see fIL.FILPackage#getSemestre_Uesoptionnelles()
	 * @model
	 * @generated
	 */
	EList<UE> getUesoptionnelles();

	/**
	 * Returns the value of the '<em><b>Uesobligatoires</b></em>' reference list.
	 * The list contents are of type {@link fIL.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uesobligatoires</em>' reference list.
	 * @see fIL.FILPackage#getSemestre_Uesobligatoires()
	 * @model
	 * @generated
	 */
	EList<UE> getUesobligatoires();

} // Semestre
