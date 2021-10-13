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
 *   <li>{@link fIL.UE#getIntervenant <em>Intervenant</em>}</li>
 *   <li>{@link fIL.UE#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link fIL.UE#getResponsable <em>Responsable</em>}</li>
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
	 * The list contents are of type {@link fIL.Documents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' containment reference list.
	 * @see fIL.FILPackage#getUE_Documents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documents> getDocuments();

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' containment reference.
	 * @see #setPresentation(Presentation)
	 * @see fIL.FILPackage#getUE_Presentation()
	 * @model containment="true"
	 * @generated
	 */
	Presentation getPresentation();

	/**
	 * Sets the value of the '{@link fIL.UE#getPresentation <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' containment reference.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(Presentation value);

	/**
	 * Returns the value of the '<em><b>Intervenant</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervenant</em>' containment reference list.
	 * @see fIL.FILPackage#getUE_Intervenant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Intervenant> getIntervenant();

	/**
	 * Returns the value of the '<em><b>Enseignants</b></em>' reference list.
	 * The list contents are of type {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseignants</em>' reference list.
	 * @see fIL.FILPackage#getUE_Enseignants()
	 * @model
	 * @generated
	 */
	EList<Intervenant> getEnseignants();

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference list.
	 * The list contents are of type {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference list.
	 * @see fIL.FILPackage#getUE_Responsable()
	 * @model required="true"
	 * @generated
	 */
	EList<Intervenant> getResponsable();

} // UE
