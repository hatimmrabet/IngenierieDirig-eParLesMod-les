/**
 */
package fIL.impl;

import fIL.FILPackage;
import fIL.Formation;
import fIL.Intervenant;
import fIL.Niveau;

import fIL.Presentation;
import fIL.UE;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.NiveauImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.impl.NiveauImpl#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link fIL.impl.NiveauImpl#getFormations <em>Formations</em>}</li>
 *   <li>{@link fIL.impl.NiveauImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link fIL.impl.NiveauImpl#getResponsables <em>Responsables</em>}</li>
 *   <li>{@link fIL.impl.NiveauImpl#getUes <em>Ues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NiveauImpl extends MinimalEObjectImpl.Container implements Niveau {
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
	 * The default value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudo()
	 * @generated
	 * @ordered
	 */
	protected static final String PSEUDO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPseudo() <em>Pseudo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudo()
	 * @generated
	 * @ordered
	 */
	protected String pseudo = PSEUDO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormations() <em>Formations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormations()
	 * @generated
	 * @ordered
	 */
	protected EList<Formation> formations;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected Presentation presentation;

	/**
	 * The cached value of the '{@link #getResponsables() <em>Responsables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsables()
	 * @generated
	 * @ordered
	 */
	protected EList<Intervenant> responsables;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NiveauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.NIVEAU;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.NIVEAU__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudo(String newPseudo) {
		String oldPseudo = pseudo;
		pseudo = newPseudo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.NIVEAU__PSEUDO, oldPseudo, pseudo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formation> getFormations() {
		if (formations == null) {
			formations = new EObjectContainmentEList<Formation>(Formation.class, this, FILPackage.NIVEAU__FORMATIONS);
		}
		return formations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Presentation getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentation(Presentation newPresentation, NotificationChain msgs) {
		Presentation oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FILPackage.NIVEAU__PRESENTATION, oldPresentation, newPresentation);
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
	public void setPresentation(Presentation newPresentation) {
		if (newPresentation != presentation) {
			NotificationChain msgs = null;
			if (presentation != null)
				msgs = ((InternalEObject) presentation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FILPackage.NIVEAU__PRESENTATION, null, msgs);
			if (newPresentation != null)
				msgs = ((InternalEObject) newPresentation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FILPackage.NIVEAU__PRESENTATION, null, msgs);
			msgs = basicSetPresentation(newPresentation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.NIVEAU__PRESENTATION, newPresentation,
					newPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervenant> getResponsables() {
		if (responsables == null) {
			responsables = new EObjectResolvingEList<Intervenant>(Intervenant.class, this,
					FILPackage.NIVEAU__RESPONSABLES);
		}
		return responsables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUes() {
		if (ues == null) {
			ues = new EObjectContainmentEList<UE>(UE.class, this, FILPackage.NIVEAU__UES);
		}
		return ues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FILPackage.NIVEAU__FORMATIONS:
			return ((InternalEList<?>) getFormations()).basicRemove(otherEnd, msgs);
		case FILPackage.NIVEAU__PRESENTATION:
			return basicSetPresentation(null, msgs);
		case FILPackage.NIVEAU__UES:
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
		case FILPackage.NIVEAU__NOM:
			return getNom();
		case FILPackage.NIVEAU__PSEUDO:
			return getPseudo();
		case FILPackage.NIVEAU__FORMATIONS:
			return getFormations();
		case FILPackage.NIVEAU__PRESENTATION:
			return getPresentation();
		case FILPackage.NIVEAU__RESPONSABLES:
			return getResponsables();
		case FILPackage.NIVEAU__UES:
			return getUes();
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
		case FILPackage.NIVEAU__NOM:
			setNom((String) newValue);
			return;
		case FILPackage.NIVEAU__PSEUDO:
			setPseudo((String) newValue);
			return;
		case FILPackage.NIVEAU__FORMATIONS:
			getFormations().clear();
			getFormations().addAll((Collection<? extends Formation>) newValue);
			return;
		case FILPackage.NIVEAU__PRESENTATION:
			setPresentation((Presentation) newValue);
			return;
		case FILPackage.NIVEAU__RESPONSABLES:
			getResponsables().clear();
			getResponsables().addAll((Collection<? extends Intervenant>) newValue);
			return;
		case FILPackage.NIVEAU__UES:
			getUes().clear();
			getUes().addAll((Collection<? extends UE>) newValue);
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
		case FILPackage.NIVEAU__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case FILPackage.NIVEAU__PSEUDO:
			setPseudo(PSEUDO_EDEFAULT);
			return;
		case FILPackage.NIVEAU__FORMATIONS:
			getFormations().clear();
			return;
		case FILPackage.NIVEAU__PRESENTATION:
			setPresentation((Presentation) null);
			return;
		case FILPackage.NIVEAU__RESPONSABLES:
			getResponsables().clear();
			return;
		case FILPackage.NIVEAU__UES:
			getUes().clear();
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
		case FILPackage.NIVEAU__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case FILPackage.NIVEAU__PSEUDO:
			return PSEUDO_EDEFAULT == null ? pseudo != null : !PSEUDO_EDEFAULT.equals(pseudo);
		case FILPackage.NIVEAU__FORMATIONS:
			return formations != null && !formations.isEmpty();
		case FILPackage.NIVEAU__PRESENTATION:
			return presentation != null;
		case FILPackage.NIVEAU__RESPONSABLES:
			return responsables != null && !responsables.isEmpty();
		case FILPackage.NIVEAU__UES:
			return ues != null && !ues.isEmpty();
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
		result.append(", pseudo: ");
		result.append(pseudo);
		result.append(')');
		return result.toString();
	}

} //NiveauImpl
