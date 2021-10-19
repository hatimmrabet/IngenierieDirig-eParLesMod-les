/**
 */
package fIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Niveau#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.Niveau#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link fIL.Niveau#getFormations <em>Formations</em>}</li>
 *   <li>{@link fIL.Niveau#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link fIL.Niveau#getResponsables <em>Responsables</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getNiveau()
 * @model
 * @generated
 */
public interface Niveau extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fIL.FILPackage#getNiveau_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fIL.Niveau#getNom <em>Nom</em>}' attribute.
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
	 * @see fIL.FILPackage#getNiveau_Pseudo()
	 * @model
	 * @generated
	 */
	String getPseudo();

	/**
	 * Sets the value of the '{@link fIL.Niveau#getPseudo <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudo</em>' attribute.
	 * @see #getPseudo()
	 * @generated
	 */
	void setPseudo(String value);

	/**
	 * Returns the value of the '<em><b>Formations</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formations</em>' containment reference list.
	 * @see fIL.FILPackage#getNiveau_Formations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Formation> getFormations();

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' containment reference.
	 * @see #setPresentation(Presentation)
	 * @see fIL.FILPackage#getNiveau_Presentation()
	 * @model containment="true"
	 * @generated
	 */
	Presentation getPresentation();

	/**
	 * Sets the value of the '{@link fIL.Niveau#getPresentation <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' containment reference.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(Presentation value);

	/**
	 * Returns the value of the '<em><b>Responsables</b></em>' reference list.
	 * The list contents are of type {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsables</em>' reference list.
	 * @see fIL.FILPackage#getNiveau_Responsables()
	 * @model required="true" derived="true"
	 * @generated
	 */
	EList<Intervenant> getResponsables();

} // Niveau
