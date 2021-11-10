/**
 */
package fIL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fichier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Fichier#getAuteur <em>Auteur</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getFichier()
 * @model
 * @generated
 */
public interface Fichier extends Document {
	/**
	 * Returns the value of the '<em><b>Auteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auteur</em>' attribute.
	 * @see #setAuteur(String)
	 * @see fIL.FILPackage#getFichier_Auteur()
	 * @model
	 * @generated
	 */
	String getAuteur();

	/**
	 * Sets the value of the '{@link fIL.Fichier#getAuteur <em>Auteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auteur</em>' attribute.
	 * @see #getAuteur()
	 * @generated
	 */
	void setAuteur(String value);

} // Fichier
