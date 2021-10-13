/**
 */
package fIL.impl;

import fIL.FILPackage;
import fIL.Fichier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fichier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.FichierImpl#getLien <em>Lien</em>}</li>
 *   <li>{@link fIL.impl.FichierImpl#getAuteur <em>Auteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FichierImpl extends DocumentsImpl implements Fichier {
	/**
	 * The default value of the '{@link #getLien() <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLien()
	 * @generated
	 * @ordered
	 */
	protected static final String LIEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLien() <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLien()
	 * @generated
	 * @ordered
	 */
	protected String lien = LIEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuteur() <em>Auteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuteur()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuteur() <em>Auteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuteur()
	 * @generated
	 * @ordered
	 */
	protected String auteur = AUTEUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FichierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.FICHIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLien() {
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLien(String newLien) {
		String oldLien = lien;
		lien = newLien;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.FICHIER__LIEN, oldLien, lien));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuteur(String newAuteur) {
		String oldAuteur = auteur;
		auteur = newAuteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.FICHIER__AUTEUR, oldAuteur, auteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FILPackage.FICHIER__LIEN:
			return getLien();
		case FILPackage.FICHIER__AUTEUR:
			return getAuteur();
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
		case FILPackage.FICHIER__LIEN:
			setLien((String) newValue);
			return;
		case FILPackage.FICHIER__AUTEUR:
			setAuteur((String) newValue);
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
		case FILPackage.FICHIER__LIEN:
			setLien(LIEN_EDEFAULT);
			return;
		case FILPackage.FICHIER__AUTEUR:
			setAuteur(AUTEUR_EDEFAULT);
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
		case FILPackage.FICHIER__LIEN:
			return LIEN_EDEFAULT == null ? lien != null : !LIEN_EDEFAULT.equals(lien);
		case FILPackage.FICHIER__AUTEUR:
			return AUTEUR_EDEFAULT == null ? auteur != null : !AUTEUR_EDEFAULT.equals(auteur);
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
		result.append(" (lien: ");
		result.append(lien);
		result.append(", auteur: ");
		result.append(auteur);
		result.append(')');
		return result.toString();
	}

} //FichierImpl
