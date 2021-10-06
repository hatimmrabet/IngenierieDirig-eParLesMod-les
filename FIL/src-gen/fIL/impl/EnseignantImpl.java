/**
 */
package fIL.impl;

import fIL.Enseignant;
import fIL.FILPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enseignant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.EnseignantImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.impl.EnseignantImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fIL.impl.EnseignantImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link fIL.impl.EnseignantImpl#getTel <em>Tel</em>}</li>
 *   <li>{@link fIL.impl.EnseignantImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link fIL.impl.EnseignantImpl#getFax <em>Fax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnseignantImpl extends MinimalEObjectImpl.Container implements Enseignant {
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
	 * The default value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected String mail = MAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTel() <em>Tel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTel()
	 * @generated
	 * @ordered
	 */
	protected static final String TEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTel() <em>Tel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTel()
	 * @generated
	 * @ordered
	 */
	protected String tel = TEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected String fax = FAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnseignantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.ENSEIGNANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.ENSEIGNANT__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.ENSEIGNANT__PRENOM, oldPrenom, prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMail(String newMail) {
		String oldMail = mail;
		mail = newMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.ENSEIGNANT__MAIL, oldMail, mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTel(String newTel) {
		String oldTel = tel;
		tel = newTel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.ENSEIGNANT__TEL, oldTel, tel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.ENSEIGNANT__ADRESSE, oldAdresse, adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		String oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.ENSEIGNANT__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FILPackage.ENSEIGNANT__NOM:
			return getNom();
		case FILPackage.ENSEIGNANT__PRENOM:
			return getPrenom();
		case FILPackage.ENSEIGNANT__MAIL:
			return getMail();
		case FILPackage.ENSEIGNANT__TEL:
			return getTel();
		case FILPackage.ENSEIGNANT__ADRESSE:
			return getAdresse();
		case FILPackage.ENSEIGNANT__FAX:
			return getFax();
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
		case FILPackage.ENSEIGNANT__NOM:
			setNom((String) newValue);
			return;
		case FILPackage.ENSEIGNANT__PRENOM:
			setPrenom((String) newValue);
			return;
		case FILPackage.ENSEIGNANT__MAIL:
			setMail((String) newValue);
			return;
		case FILPackage.ENSEIGNANT__TEL:
			setTel((String) newValue);
			return;
		case FILPackage.ENSEIGNANT__ADRESSE:
			setAdresse((String) newValue);
			return;
		case FILPackage.ENSEIGNANT__FAX:
			setFax((String) newValue);
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
		case FILPackage.ENSEIGNANT__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case FILPackage.ENSEIGNANT__PRENOM:
			setPrenom(PRENOM_EDEFAULT);
			return;
		case FILPackage.ENSEIGNANT__MAIL:
			setMail(MAIL_EDEFAULT);
			return;
		case FILPackage.ENSEIGNANT__TEL:
			setTel(TEL_EDEFAULT);
			return;
		case FILPackage.ENSEIGNANT__ADRESSE:
			setAdresse(ADRESSE_EDEFAULT);
			return;
		case FILPackage.ENSEIGNANT__FAX:
			setFax(FAX_EDEFAULT);
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
		case FILPackage.ENSEIGNANT__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case FILPackage.ENSEIGNANT__PRENOM:
			return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
		case FILPackage.ENSEIGNANT__MAIL:
			return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
		case FILPackage.ENSEIGNANT__TEL:
			return TEL_EDEFAULT == null ? tel != null : !TEL_EDEFAULT.equals(tel);
		case FILPackage.ENSEIGNANT__ADRESSE:
			return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
		case FILPackage.ENSEIGNANT__FAX:
			return FAX_EDEFAULT == null ? fax != null : !FAX_EDEFAULT.equals(fax);
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
		result.append(", mail: ");
		result.append(mail);
		result.append(", tel: ");
		result.append(tel);
		result.append(", adresse: ");
		result.append(adresse);
		result.append(", fax: ");
		result.append(fax);
		result.append(')');
		return result.toString();
	}

} //EnseignantImpl
