/**
 */
package fIL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Formation#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.Formation#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link fIL.Formation#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link fIL.Formation#getS1 <em>S1</em>}</li>
 *   <li>{@link fIL.Formation#getS2 <em>S2</em>}</li>
 *   <li>{@link fIL.Formation#getIntervenant <em>Intervenant</em>}</li>
 *   <li>{@link fIL.Formation#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link fIL.Formation#getEnseignants <em>Enseignants</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getFormation()
 * @model
 * @generated
 */
public interface Formation extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fIL.FILPackage#getFormation_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fIL.Formation#getNom <em>Nom</em>}' attribute.
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
	 * @see fIL.FILPackage#getFormation_Pseudo()
	 * @model
	 * @generated
	 */
	String getPseudo();

	/**
	 * Sets the value of the '{@link fIL.Formation#getPseudo <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudo</em>' attribute.
	 * @see #getPseudo()
	 * @generated
	 */
	void setPseudo(String value);

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' containment reference.
	 * @see #setPresentation(Presentation)
	 * @see fIL.FILPackage#getFormation_Presentation()
	 * @model containment="true"
	 * @generated
	 */
	Presentation getPresentation();

	/**
	 * Sets the value of the '{@link fIL.Formation#getPresentation <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' containment reference.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(Presentation value);

	/**
	 * Returns the value of the '<em><b>S1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S1</em>' containment reference.
	 * @see #setS1(S1)
	 * @see fIL.FILPackage#getFormation_S1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	S1 getS1();

	/**
	 * Sets the value of the '{@link fIL.Formation#getS1 <em>S1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S1</em>' containment reference.
	 * @see #getS1()
	 * @generated
	 */
	void setS1(S1 value);

	/**
	 * Returns the value of the '<em><b>S2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S2</em>' containment reference.
	 * @see #setS2(S2)
	 * @see fIL.FILPackage#getFormation_S2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	S2 getS2();

	/**
	 * Sets the value of the '{@link fIL.Formation#getS2 <em>S2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S2</em>' containment reference.
	 * @see #getS2()
	 * @generated
	 */
	void setS2(S2 value);

	/**
	 * Returns the value of the '<em><b>Intervenant</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervenant</em>' containment reference list.
	 * @see fIL.FILPackage#getFormation_Intervenant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Intervenant> getIntervenant();

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(Intervenant)
	 * @see fIL.FILPackage#getFormation_Responsable()
	 * @model required="true" derived="true"
	 * @generated
	 */
	Intervenant getResponsable();

	/**
	 * Sets the value of the '{@link fIL.Formation#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Intervenant value);

	/**
	 * Returns the value of the '<em><b>Enseignants</b></em>' reference list.
	 * The list contents are of type {@link fIL.Intervenant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enseignants</em>' reference list.
	 * @see fIL.FILPackage#getFormation_Enseignants()
	 * @model derived="true"
	 * @generated
	 */
	EList<Intervenant> getEnseignants();

} // Formation
