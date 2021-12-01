/**
 */
package htmlbsMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlbsMM.Link#getLien <em>Lien</em>}</li>
 * </ul>
 *
 * @see htmlbsMM.HtmlbsMMPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends RedirectionURL {

	/**
	 * Returns the value of the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien</em>' attribute.
	 * @see #setLien(String)
	 * @see htmlbsMM.HtmlbsMMPackage#getLink_Lien()
	 * @model
	 * @generated
	 */
	String getLien();

	/**
	 * Sets the value of the '{@link htmlbsMM.Link#getLien <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien</em>' attribute.
	 * @see #getLien()
	 * @generated
	 */
	void setLien(String value);
} // Link
