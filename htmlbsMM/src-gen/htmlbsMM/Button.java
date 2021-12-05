/**
 */
package htmlbsMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlbsMM.Button#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @see htmlbsMM.HtmlbsMMPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends TextElement {
	/**
	 * Returns the value of the '<em><b>Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' reference.
	 * @see #setPage(Page)
	 * @see htmlbsMM.HtmlbsMMPackage#getButton_Page()
	 * @model required="true"
	 * @generated
	 */
	Page getPage();

	/**
	 * Sets the value of the '{@link htmlbsMM.Button#getPage <em>Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Page value);

} // Button
