/**
 */
package htmlbsMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlbsMM.Block#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see htmlbsMM.HtmlbsMMPackage#getBlock()
 * @model abstract="true"
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link htmlbsMM.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see htmlbsMM.HtmlbsMMPackage#getBlock_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getElements();

} // Block
