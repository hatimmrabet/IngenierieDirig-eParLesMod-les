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
 *   <li>{@link fIL.Formation#getContient <em>Contient</em>}</li>
 *   <li>{@link fIL.Formation#getUes <em>Ues</em>}</li>
 *   <li>{@link fIL.Formation#getContacts <em>Contacts</em>}</li>
 *   <li>{@link fIL.Formation#getNiveau <em>Niveau</em>}</li>
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
	 * Returns the value of the '<em><b>Contient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contient</em>' containment reference.
	 * @see #setContient(Presentation)
	 * @see fIL.FILPackage#getFormation_Contient()
	 * @model containment="true"
	 * @generated
	 */
	Presentation getContient();

	/**
	 * Sets the value of the '{@link fIL.Formation#getContient <em>Contient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contient</em>' containment reference.
	 * @see #getContient()
	 * @generated
	 */
	void setContient(Presentation value);

	/**
	 * Returns the value of the '<em><b>Ues</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues</em>' containment reference list.
	 * @see fIL.FILPackage#getFormation_Ues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UE> getUes();

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link fIL.Contact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see fIL.FILPackage#getFormation_Contacts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Contact> getContacts();

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fIL.Niveau#getFormations <em>Formations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' reference.
	 * @see #setNiveau(Niveau)
	 * @see fIL.FILPackage#getFormation_Niveau()
	 * @see fIL.Niveau#getFormations
	 * @model opposite="formations" required="true"
	 * @generated
	 */
	Niveau getNiveau();

	/**
	 * Sets the value of the '{@link fIL.Formation#getNiveau <em>Niveau</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' reference.
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(Niveau value);

} // Formation
