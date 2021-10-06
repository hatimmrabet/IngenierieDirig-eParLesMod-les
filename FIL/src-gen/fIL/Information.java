/**
 */
package fIL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Information#getTitre <em>Titre</em>}</li>
 *   <li>{@link fIL.Information#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getInformation()
 * @model
 * @generated
 */
public interface Information extends EObject {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see fIL.FILPackage#getInformation_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link fIL.Information#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' reference list.
	 * The list contents are of type {@link fIL.Article}.
	 * It is bidirectional and its opposite is '{@link fIL.Article#getOnglet <em>Onglet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' reference list.
	 * @see fIL.FILPackage#getInformation_Articles()
	 * @see fIL.Article#getOnglet
	 * @model opposite="onglet"
	 * @generated
	 */
	EList<Article> getArticles();

} // Information
