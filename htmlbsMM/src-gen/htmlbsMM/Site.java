/**
 */
package htmlbsMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlbsMM.Site#getName <em>Name</em>}</li>
 *   <li>{@link htmlbsMM.Site#getPages <em>Pages</em>}</li>
 *   <li>{@link htmlbsMM.Site#getRedirections <em>Redirections</em>}</li>
 * </ul>
 *
 * @see htmlbsMM.HtmlbsMMPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see htmlbsMM.HtmlbsMMPackage#getSite_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link htmlbsMM.Site#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link htmlbsMM.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see htmlbsMM.HtmlbsMMPackage#getSite_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Redirections</b></em>' reference list.
	 * The list contents are of type {@link htmlbsMM.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirections</em>' reference list.
	 * @see htmlbsMM.HtmlbsMMPackage#getSite_Redirections()
	 * @model
	 * @generated
	 */
	EList<Page> getRedirections();

} // Site
