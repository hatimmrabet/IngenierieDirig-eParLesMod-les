/**
 */
package fIL.impl;

import fIL.FILPackage;
import fIL.Intervenant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervenant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.IntervenantImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.impl.IntervenantImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fIL.impl.IntervenantImpl#isResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervenantImpl extends MinimalEObjectImpl.Container implements Intervenant {
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
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected String prenom = PRENOM_EDEFAULT;

	/**
	 * The default value of the '{@link #isResponsable() <em>Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESPONSABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResponsable() <em>Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResponsable()
	 * @generated
	 * @ordered
	 */
	protected boolean responsable = RESPONSABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervenantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.INTERVENANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.INTERVENANT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		String oldPrenom = prenom;
		prenom = newPrenom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.INTERVENANT__PRENOM, oldPrenom, prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResponsable() {
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(boolean newResponsable) {
		boolean oldResponsable = responsable;
		responsable = newResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.INTERVENANT__RESPONSABLE, oldResponsable,
					responsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FILPackage.INTERVENANT__NOM:
			return getNom();
		case FILPackage.INTERVENANT__PRENOM:
			return getPrenom();
		case FILPackage.INTERVENANT__RESPONSABLE:
			return isResponsable();
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
		case FILPackage.INTERVENANT__NOM:
			setNom((String) newValue);
			return;
		case FILPackage.INTERVENANT__PRENOM:
			setPrenom((String) newValue);
			return;
		case FILPackage.INTERVENANT__RESPONSABLE:
			setResponsable((Boolean) newValue);
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
		case FILPackage.INTERVENANT__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case FILPackage.INTERVENANT__PRENOM:
			setPrenom(PRENOM_EDEFAULT);
			return;
		case FILPackage.INTERVENANT__RESPONSABLE:
			setResponsable(RESPONSABLE_EDEFAULT);
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
		case FILPackage.INTERVENANT__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case FILPackage.INTERVENANT__PRENOM:
			return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
		case FILPackage.INTERVENANT__RESPONSABLE:
			return responsable != RESPONSABLE_EDEFAULT;
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
		result.append(", prenom: ");
		result.append(prenom);
		result.append(", responsable: ");
		result.append(responsable);
		result.append(')');
		return result.toString();
	}

} //IntervenantImpl
