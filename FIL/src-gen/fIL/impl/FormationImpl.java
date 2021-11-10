/**
 */
package fIL.impl;

import fIL.FILPackage;
import fIL.Formation;
import fIL.Intervenant;
import fIL.Presentation;
import fIL.S1;
import fIL.S2;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.FormationImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.impl.FormationImpl#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link fIL.impl.FormationImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link fIL.impl.FormationImpl#getS1 <em>S1</em>}</li>
 *   <li>{@link fIL.impl.FormationImpl#getS2 <em>S2</em>}</li>
 *   <li>{@link fIL.impl.FormationImpl#getResponsables <em>Responsables</em>}</li>
 *   <li>{@link fIL.impl.FormationImpl#getEnseignants <em>Enseignants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormationImpl extends MinimalEObjectImpl.Container implements Formation {
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
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected Presentation presentation;

	/**
	 * The cached value of the '{@link #getS1() <em>S1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS1()
	 * @generated
	 * @ordered
	 */
	protected S1 s1;

	/**
	 * The cached value of the '{@link #getS2() <em>S2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS2()
	 * @generated
	 * @ordered
	 */
	protected S2 s2;

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
	 * The cached value of the '{@link #getEnseignants() <em>Enseignants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnseignants()
	 * @generated
	 * @ordered
	 */
	protected EList<Intervenant> enseignants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.FORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.FORMATION__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.FORMATION__PSEUDO, oldPseudo, pseudo));
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
					FILPackage.FORMATION__PRESENTATION, oldPresentation, newPresentation);
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
						EOPPOSITE_FEATURE_BASE - FILPackage.FORMATION__PRESENTATION, null, msgs);
			if (newPresentation != null)
				msgs = ((InternalEObject) newPresentation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FILPackage.FORMATION__PRESENTATION, null, msgs);
			msgs = basicSetPresentation(newPresentation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.FORMATION__PRESENTATION, newPresentation,
					newPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S1 getS1() {
		return s1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetS1(S1 newS1, NotificationChain msgs) {
		S1 oldS1 = s1;
		s1 = newS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FILPackage.FORMATION__S1,
					oldS1, newS1);
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
	public void setS1(S1 newS1) {
		if (newS1 != s1) {
			NotificationChain msgs = null;
			if (s1 != null)
				msgs = ((InternalEObject) s1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FILPackage.FORMATION__S1,
						null, msgs);
			if (newS1 != null)
				msgs = ((InternalEObject) newS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FILPackage.FORMATION__S1,
						null, msgs);
			msgs = basicSetS1(newS1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.FORMATION__S1, newS1, newS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S2 getS2() {
		return s2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetS2(S2 newS2, NotificationChain msgs) {
		S2 oldS2 = s2;
		s2 = newS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FILPackage.FORMATION__S2,
					oldS2, newS2);
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
	public void setS2(S2 newS2) {
		if (newS2 != s2) {
			NotificationChain msgs = null;
			if (s2 != null)
				msgs = ((InternalEObject) s2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FILPackage.FORMATION__S2,
						null, msgs);
			if (newS2 != null)
				msgs = ((InternalEObject) newS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FILPackage.FORMATION__S2,
						null, msgs);
			msgs = basicSetS2(newS2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.FORMATION__S2, newS2, newS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervenant> getResponsables() {
		if (responsables == null) {
			responsables = new EObjectResolvingEList<Intervenant>(Intervenant.class, this,
					FILPackage.FORMATION__RESPONSABLES);
		}
		return responsables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervenant> getEnseignants() {
		if (enseignants == null) {
			enseignants = new EObjectResolvingEList<Intervenant>(Intervenant.class, this,
					FILPackage.FORMATION__ENSEIGNANTS);
		}
		return enseignants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FILPackage.FORMATION__PRESENTATION:
			return basicSetPresentation(null, msgs);
		case FILPackage.FORMATION__S1:
			return basicSetS1(null, msgs);
		case FILPackage.FORMATION__S2:
			return basicSetS2(null, msgs);
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
		case FILPackage.FORMATION__NOM:
			return getNom();
		case FILPackage.FORMATION__PSEUDO:
			return getPseudo();
		case FILPackage.FORMATION__PRESENTATION:
			return getPresentation();
		case FILPackage.FORMATION__S1:
			return getS1();
		case FILPackage.FORMATION__S2:
			return getS2();
		case FILPackage.FORMATION__RESPONSABLES:
			return getResponsables();
		case FILPackage.FORMATION__ENSEIGNANTS:
			return getEnseignants();
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
		case FILPackage.FORMATION__NOM:
			setNom((String) newValue);
			return;
		case FILPackage.FORMATION__PSEUDO:
			setPseudo((String) newValue);
			return;
		case FILPackage.FORMATION__PRESENTATION:
			setPresentation((Presentation) newValue);
			return;
		case FILPackage.FORMATION__S1:
			setS1((S1) newValue);
			return;
		case FILPackage.FORMATION__S2:
			setS2((S2) newValue);
			return;
		case FILPackage.FORMATION__RESPONSABLES:
			getResponsables().clear();
			getResponsables().addAll((Collection<? extends Intervenant>) newValue);
			return;
		case FILPackage.FORMATION__ENSEIGNANTS:
			getEnseignants().clear();
			getEnseignants().addAll((Collection<? extends Intervenant>) newValue);
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
		case FILPackage.FORMATION__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case FILPackage.FORMATION__PSEUDO:
			setPseudo(PSEUDO_EDEFAULT);
			return;
		case FILPackage.FORMATION__PRESENTATION:
			setPresentation((Presentation) null);
			return;
		case FILPackage.FORMATION__S1:
			setS1((S1) null);
			return;
		case FILPackage.FORMATION__S2:
			setS2((S2) null);
			return;
		case FILPackage.FORMATION__RESPONSABLES:
			getResponsables().clear();
			return;
		case FILPackage.FORMATION__ENSEIGNANTS:
			getEnseignants().clear();
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
		case FILPackage.FORMATION__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case FILPackage.FORMATION__PSEUDO:
			return PSEUDO_EDEFAULT == null ? pseudo != null : !PSEUDO_EDEFAULT.equals(pseudo);
		case FILPackage.FORMATION__PRESENTATION:
			return presentation != null;
		case FILPackage.FORMATION__S1:
			return s1 != null;
		case FILPackage.FORMATION__S2:
			return s2 != null;
		case FILPackage.FORMATION__RESPONSABLES:
			return responsables != null && !responsables.isEmpty();
		case FILPackage.FORMATION__ENSEIGNANTS:
			return enseignants != null && !enseignants.isEmpty();
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

} //FormationImpl
