/**
 */
package fIL.impl;

import fIL.FILPackage;
import fIL.Semestre;
import fIL.UE;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.SemestreImpl#getUesoptionnelles <em>Uesoptionnelles</em>}</li>
 *   <li>{@link fIL.impl.SemestreImpl#getUesobligatoires <em>Uesobligatoires</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SemestreImpl extends MinimalEObjectImpl.Container implements Semestre {
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
	protected SemestreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.SEMESTRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUesoptionnelles() {
		if (uesoptionnelles == null) {
			uesoptionnelles = new EObjectResolvingEList<UE>(UE.class, this, FILPackage.SEMESTRE__UESOPTIONNELLES);
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
			uesobligatoires = new EObjectResolvingEList<UE>(UE.class, this, FILPackage.SEMESTRE__UESOBLIGATOIRES);
		}
		return uesobligatoires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FILPackage.SEMESTRE__UESOPTIONNELLES:
			return getUesoptionnelles();
		case FILPackage.SEMESTRE__UESOBLIGATOIRES:
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
		case FILPackage.SEMESTRE__UESOPTIONNELLES:
			getUesoptionnelles().clear();
			getUesoptionnelles().addAll((Collection<? extends UE>) newValue);
			return;
		case FILPackage.SEMESTRE__UESOBLIGATOIRES:
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
		case FILPackage.SEMESTRE__UESOPTIONNELLES:
			getUesoptionnelles().clear();
			return;
		case FILPackage.SEMESTRE__UESOBLIGATOIRES:
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
		case FILPackage.SEMESTRE__UESOPTIONNELLES:
			return uesoptionnelles != null && !uesoptionnelles.isEmpty();
		case FILPackage.SEMESTRE__UESOBLIGATOIRES:
			return uesobligatoires != null && !uesobligatoires.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemestreImpl
