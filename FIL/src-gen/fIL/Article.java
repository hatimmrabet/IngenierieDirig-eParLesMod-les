/**
 */
package fIL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fIL.Article#getTitre <em>Titre</em>}</li>
 *   <li>{@link fIL.Article#getContenue <em>Contenue</em>}</li>
 *   <li>{@link fIL.Article#getOnglet <em>Onglet</em>}</li>
 * </ul>
 *
 * @see fIL.FILPackage#getArticle()
 * @model
 * @generated
 */
public interface Article extends EObject {
	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see fIL.FILPackage#getArticle_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link fIL.Article#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Contenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenue</em>' attribute.
	 * @see #setContenue(String)
	 * @see fIL.FILPackage#getArticle_Contenue()
	 * @model
	 * @generated
	 */
	String getContenue();

	/**
	 * Sets the value of the '{@link fIL.Article#getContenue <em>Contenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenue</em>' attribute.
	 * @see #getContenue()
	 * @generated
	 */
	void setContenue(String value);

	/**
	 * Returns the value of the '<em><b>Onglet</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fIL.Information#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onglet</em>' reference.
	 * @see #setOnglet(Information)
	 * @see fIL.FILPackage#getArticle_Onglet()
	 * @see fIL.Information#getArticles
	 * @model opposite="articles" required="true"
	 * @generated
	 */
	Information getOnglet();

	/**
	 * Sets the value of the '{@link fIL.Article#getOnglet <em>Onglet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onglet</em>' reference.
	 * @see #getOnglet()
	 * @generated
	 */
	void setOnglet(Information value);

} // Article
