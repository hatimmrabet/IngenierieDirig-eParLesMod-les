/**
 */
package fIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.UE#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.UE#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link fIL.UE#getDocuments <em>Documents</em>}</li>
 *   <li>{@link fIL.UE#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link fIL.UE#getIntervenants <em>Intervenants</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getUE()
 * @model
 * @generated
 */
public interface UE extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fIL.FILPackage#getUE_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fIL.UE#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Pseudo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudo</em>' attribute.
	 * @see #setPseudo(String)
	 * @see fIL.FILPackage#getUE_Pseudo()
	 * @model
	 * @generated
	 */
	String getPseudo();

	/**
	 * Sets the value of the '{@link fIL.UE#getPseudo <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudo</em>' attribute.
	 * @see #getPseudo()
	 * @generated
	 */
	void setPseudo(String value);

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' containment reference list.
	 * @see fIL.FILPackage#getUE_Documents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Document> getDocuments();

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Presentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' containment reference list.
	 * @see fIL.FILPackage#getUE_Presentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Presentation> getPresentation();

	/**
	 * Returns the value of the '<em><b>Intervenants</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervenants</em>' containment reference list.
	 * @see fIL.FILPackage#getUE_Intervenants()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Intervenant> getIntervenants();

} // UE
