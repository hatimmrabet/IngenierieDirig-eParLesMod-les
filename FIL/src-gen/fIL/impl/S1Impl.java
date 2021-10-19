/**
 */
package fIL.impl;

import fIL.FILPackage;
import fIL.S1;
import fIL.UE;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>S1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.S1Impl#getUes <em>Ues</em>}</li>
 *   <li>{@link fIL.impl.S1Impl#getUesoptionnelles <em>Uesoptionnelles</em>}</li>
 *   <li>{@link fIL.impl.S1Impl#getUesobligatoires <em>Uesobligatoires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class S1Impl extends MinimalEObjectImpl.Container implements S1 {
	/**
	 * The cached value of the '{@link #getUes() <em>Ues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUes()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> ues;

	/**
	 * The cached value of the '{@link #getUesoptionnelles() <em>Uesoptionnelles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUesoptionnelles()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> uesoptionnelles;
	/**
	 * The cached value of the '{@link #getUesobligatoires() <em>Uesobligatoires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUesobligatoires()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> uesobligatoires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected S1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.S1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUes() {
		if (ues == null) {
			ues = new EObjectContainmentEList<UE>(UE.class, this, FILPackage.S1__UES);
		}
		return ues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUesoptionnelles() {
		if (uesoptionnelles == null) {
			uesoptionnelles = new EObjectResolvingEList<UE>(UE.class, this, FILPackage.S1__UESOPTIONNELLES);
		}
		return uesoptionnelles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUesobligatoires() {
		if (uesobligatoires == null) {
			uesobligatoires = new EObjectResolvingEList<UE>(UE.class, this, FILPackage.S1__UESOBLIGATOIRES);
		}
		return uesobligatoires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FILPackage.S1__UES:
			return ((InternalEList<?>) getUes()).basicRemove(otherEnd, msgs);
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
		case FILPackage.S1__UES:
			return getUes();
		case FILPackage.S1__UESOPTIONNELLES:
			return getUesoptionnelles();
		case FILPackage.S1__UESOBLIGATOIRES:
			return getUesobligatoires();
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
		case FILPackage.S1__UES:
			getUes().clear();
			getUes().addAll((Collection<? extends UE>) newValue);
			return;
		case FILPackage.S1__UESOPTIONNELLES:
			getUesoptionnelles().clear();
			getUesoptionnelles().addAll((Collection<? extends UE>) newValue);
			return;
		case FILPackage.S1__UESOBLIGATOIRES:
			getUesobligatoires().clear();
			getUesobligatoires().addAll((Collection<? extends UE>) newValue);
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
		case FILPackage.S1__UES:
			getUes().clear();
			return;
		case FILPackage.S1__UESOPTIONNELLES:
			getUesoptionnelles().clear();
			return;
		case FILPackage.S1__UESOBLIGATOIRES:
			getUesobligatoires().clear();
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
		case FILPackage.S1__UES:
			return ues != null && !ues.isEmpty();
		case FILPackage.S1__UESOPTIONNELLES:
			return uesoptionnelles != null && !uesoptionnelles.isEmpty();
		case FILPackage.S1__UESOBLIGATOIRES:
			return uesobligatoires != null && !uesobligatoires.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //S1Impl
