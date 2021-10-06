/**
 */
package fIL.impl;

import fIL.Article;
import fIL.FILPackage;
import fIL.Information;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.ArticleImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link fIL.impl.ArticleImpl#getContenue <em>Contenue</em>}</li>
 *   <li>{@link fIL.impl.ArticleImpl#getOnglet <em>Onglet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticleImpl extends MinimalEObjectImpl.Container implements Article {
	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected String titre = TITRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContenue() <em>Contenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContenue() <em>Contenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenue()
	 * @generated
	 * @ordered
	 */
	protected String contenue = CONTENUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnglet() <em>Onglet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnglet()
	 * @generated
	 * @ordered
	 */
	protected Information onglet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArticleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.ARTICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitre(String newTitre) {
		String oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.ARTICLE__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContenue() {
		return contenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContenue(String newContenue) {
		String oldContenue = contenue;
		contenue = newContenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.ARTICLE__CONTENUE, oldContenue, contenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information getOnglet() {
		if (onglet != null && onglet.eIsProxy()) {
			InternalEObject oldOnglet = (InternalEObject) onglet;
			onglet = (Information) eResolveProxy(oldOnglet);
			if (onglet != oldOnglet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FILPackage.ARTICLE__ONGLET, oldOnglet,
							onglet));
			}
		}
		return onglet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information basicGetOnglet() {
		return onglet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnglet(Information newOnglet, NotificationChain msgs) {
		Information oldOnglet = onglet;
		onglet = newOnglet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FILPackage.ARTICLE__ONGLET,
					oldOnglet, newOnglet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnglet(Information newOnglet) {
		if (newOnglet != onglet) {
			NotificationChain msgs = null;
			if (onglet != null)
				msgs = ((InternalEObject) onglet).eInverseRemove(this, FILPackage.INFORMATION__ARTICLES,
						Information.class, msgs);
			if (newOnglet != null)
				msgs = ((InternalEObject) newOnglet).eInverseAdd(this, FILPackage.INFORMATION__ARTICLES,
						Information.class, msgs);
			msgs = basicSetOnglet(newOnglet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.ARTICLE__ONGLET, newOnglet, newOnglet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FILPackage.ARTICLE__ONGLET:
			if (onglet != null)
				msgs = ((InternalEObject) onglet).eInverseRemove(this, FILPackage.INFORMATION__ARTICLES,
						Information.class, msgs);
			return basicSetOnglet((Information) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FILPackage.ARTICLE__ONGLET:
			return basicSetOnglet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FILPackage.ARTICLE__TITRE:
			return getTitre();
		case FILPackage.ARTICLE__CONTENUE:
			return getContenue();
		case FILPackage.ARTICLE__ONGLET:
			if (resolve)
				return getOnglet();
			return basicGetOnglet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FILPackage.ARTICLE__TITRE:
			setTitre((String) newValue);
			return;
		case FILPackage.ARTICLE__CONTENUE:
			setContenue((String) newValue);
			return;
		case FILPackage.ARTICLE__ONGLET:
			setOnglet((Information) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FILPackage.ARTICLE__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case FILPackage.ARTICLE__CONTENUE:
			setContenue(CONTENUE_EDEFAULT);
			return;
		case FILPackage.ARTICLE__ONGLET:
			setOnglet((Information) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FILPackage.ARTICLE__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case FILPackage.ARTICLE__CONTENUE:
			return CONTENUE_EDEFAULT == null ? contenue != null : !CONTENUE_EDEFAULT.equals(contenue);
		case FILPackage.ARTICLE__ONGLET:
			return onglet != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (titre: ");
		result.append(titre);
		result.append(", contenue: ");
		result.append(contenue);
		result.append(')');
		return result.toString();
	}

} //ArticleImpl
