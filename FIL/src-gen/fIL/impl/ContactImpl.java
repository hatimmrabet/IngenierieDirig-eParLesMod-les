/**
 */
package fIL.impl;

import fIL.Contact;
import fIL.Enseignant;
import fIL.FILPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.ContactImpl#getResponsables <em>Responsables</em>}</li>
 *   <li>{@link fIL.impl.ContactImpl#getStatut <em>Statut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactImpl extends MinimalEObjectImpl.Container implements Contact {
	/**
	 * The cached value of the '{@link #getResponsables() <em>Responsables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsables()
	 * @generated
	 * @ordered
	 */
	protected EList<Enseignant> responsables;

	/**
	 * The default value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected String statut = STATUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.CONTACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enseignant> getResponsables() {
		if (responsables == null) {
			responsables = new EObjectResolvingEList<Enseignant>(Enseignant.class, this,
					FILPackage.CONTACT__RESPONSABLES);
		}
		return responsables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatut() {
		return statut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatut(String newStatut) {
		String oldStatut = statut;
		statut = newStatut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.CONTACT__STATUT, oldStatut, statut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FILPackage.CONTACT__RESPONSABLES:
			return getResponsables();
		case FILPackage.CONTACT__STATUT:
			return getStatut();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FILPackage.CONTACT__RESPONSABLES:
			getResponsables().clear();
			getResponsables().addAll((Collection<? extends Enseignant>) newValue);
			return;
		case FILPackage.CONTACT__STATUT:
			setStatut((String) newValue);
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
		case FILPackage.CONTACT__RESPONSABLES:
			getResponsables().clear();
			return;
		case FILPackage.CONTACT__STATUT:
			setStatut(STATUT_EDEFAULT);
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
		case FILPackage.CONTACT__RESPONSABLES:
			return responsables != null && !responsables.isEmpty();
		case FILPackage.CONTACT__STATUT:
			return STATUT_EDEFAULT == null ? statut != null : !STATUT_EDEFAULT.equals(statut);
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
		result.append(" (statut: ");
		result.append(statut);
		result.append(')');
		return result.toString();
	}

} //ContactImpl
