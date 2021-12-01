/**
 */
package htmlbsMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlbsMM.Title#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see htmlbsMM.HtmlbsMMPackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends Content {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see htmlbsMM.HtmlbsMMPackage#getTitle_Level()
	 * @model default="2"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link htmlbsMM.Title#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

} // Title
