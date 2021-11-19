/**
 */
package fIL.impl;

import fIL.FILPackage;
import fIL.Faculte;
import fIL.Intervenant;
import fIL.Niveau;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Faculte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.FaculteImpl#getName <em>Name</em>}</li>
 *   <li>{@link fIL.impl.FaculteImpl#getNiveaux <em>Niveaux</em>}</li>
 *   <li>{@link fIL.impl.FaculteImpl#getIntervenants <em>Intervenants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaculteImpl extends MinimalEObjectImpl.Container implements Faculte {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNiveaux() <em>Niveaux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveaux()
	 * @generated
	 * @ordered
	 */
	protected EList<Niveau> niveaux;

	/**
	 * The cached value of the '{@link #getIntervenants() <em>Intervenants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervenants()
	 * @generated
	 * @ordered
	 */
	protected EList<Intervenant> intervenants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaculteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.FACULTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.FACULTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Niveau> getNiveaux() {
		if (niveaux == null) {
			niveaux = new EObjectContainmentEList<Niveau>(Niveau.class, this, FILPackage.FACULTE__NIVEAUX);
		}
		return niveaux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervenant> getIntervenants() {
		if (intervenants == null) {
			intervenants = new EObjectContainmentEList<Intervenant>(Intervenant.class, this,
					FILPackage.FACULTE__INTERVENANTS);
		}
		return intervenants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FILPackage.FACULTE__NIVEAUX:
			return ((InternalEList<?>) getNiveaux()).basicRemove(otherEnd, msgs);
		case FILPackage.FACULTE__INTERVENANTS:
			return ((InternalEList<?>) getIntervenants()).basicRemove(otherEnd, msgs);
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
		case FILPackage.FACULTE__NAME:
			return getName();
		case FILPackage.FACULTE__NIVEAUX:
			return getNiveaux();
		case FILPackage.FACULTE__INTERVENANTS:
			return getIntervenants();
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
		case FILPackage.FACULTE__NAME:
			setName((String) newValue);
			return;
		case FILPackage.FACULTE__NIVEAUX:
			getNiveaux().clear();
			getNiveaux().addAll((Collection<? extends Niveau>) newValue);
			return;
		case FILPackage.FACULTE__INTERVENANTS:
			getIntervenants().clear();
			getIntervenants().addAll((Collection<? extends Intervenant>) newValue);
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
		case FILPackage.FACULTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FILPackage.FACULTE__NIVEAUX:
			getNiveaux().clear();
			return;
		case FILPackage.FACULTE__INTERVENANTS:
			getIntervenants().clear();
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
		case FILPackage.FACULTE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FILPackage.FACULTE__NIVEAUX:
			return niveaux != null && !niveaux.isEmpty();
		case FILPackage.FACULTE__INTERVENANTS:
			return intervenants != null && !intervenants.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FaculteImpl
