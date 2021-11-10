/**
 */
package fIL.impl;

import fIL.Document;
import fIL.FILPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.DocumentImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.impl.DocumentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fIL.impl.DocumentImpl#getLien <em>Lien</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.DOCUMENT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.DOCUMENT__DESCRIPTION, oldDescription,
					description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.DOCUMENT__LIEN, oldLien, lien));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FILPackage.DOCUMENT__NOM:
			return getNom();
		case FILPackage.DOCUMENT__DESCRIPTION:
			return getDescription();
		case FILPackage.DOCUMENT__LIEN:
			return getLien();
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
		case FILPackage.DOCUMENT__NOM:
			setNom((String) newValue);
			return;
		case FILPackage.DOCUMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case FILPackage.DOCUMENT__LIEN:
			setLien((String) newValue);
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
		case FILPackage.DOCUMENT__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case FILPackage.DOCUMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case FILPackage.DOCUMENT__LIEN:
			setLien(LIEN_EDEFAULT);
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
		case FILPackage.DOCUMENT__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case FILPackage.DOCUMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case FILPackage.DOCUMENT__LIEN:
			return LIEN_EDEFAULT == null ? lien != null : !LIEN_EDEFAULT.equals(lien);
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", description: ");
		result.append(description);
		result.append(", lien: ");
		result.append(lien);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
