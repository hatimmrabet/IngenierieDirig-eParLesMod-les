/**
 */
package fIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Presentation#getTitre <em>Titre</em>}</li>
 *   <li>{@link fIL.Presentation#getContenue <em>Contenue</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getPresentation()
 * @model
 * @generated
 */
public interface Presentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see fIL.FILPackage#getPresentation_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link fIL.Presentation#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Contenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenue</em>' attribute.
	 * @see #setContenue(String)
	 * @see fIL.FILPackage#getPresentation_Contenue()
	 * @model
	 * @generated
	 */
	String getContenue();

	/**
	 * Sets the value of the '{@link fIL.Presentation#getContenue <em>Contenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenue</em>' attribute.
	 * @see #getContenue()
	 * @generated
	 */
	void setContenue(String value);

} // Presentation
