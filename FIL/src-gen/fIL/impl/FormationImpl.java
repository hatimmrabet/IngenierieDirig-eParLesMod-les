/**
 */
package fIL.impl;

import fIL.Contact;
import fIL.FILPackage;
import fIL.Formation;
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
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link fIL.impl.FormationImpl#getContient <em>Contient</em>}</li>
 *   <li>{@link fIL.impl.FormationImpl#getUes <em>Ues</em>}</li>
 *   <li>{@link fIL.impl.FormationImpl#getContacts <em>Contacts</em>}</li>
 *   <li>{@link fIL.impl.FormationImpl#getNiveau <em>Niveau</em>}</li>
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
	 * The cached value of the '{@link #getContient() <em>Contient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContient()
	 * @generated
	 * @ordered
	 */
	protected Presentation contient;

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
	 * The cached value of the '{@link #getContacts() <em>Contacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> contacts;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected Niveau niveau;

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
	public Presentation getContient() {
		return contient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContient(Presentation newContient, NotificationChain msgs) {
		Presentation oldContient = contient;
		contient = newContient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FILPackage.FORMATION__CONTIENT, oldContient, newContient);
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
	public void setContient(Presentation newContient) {
		if (newContient != contient) {
			NotificationChain msgs = null;
			if (contient != null)
				msgs = ((InternalEObject) contient).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FILPackage.FORMATION__CONTIENT, null, msgs);
			if (newContient != null)
				msgs = ((InternalEObject) newContient).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FILPackage.FORMATION__CONTIENT, null, msgs);
			msgs = basicSetContient(newContient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.FORMATION__CONTIENT, newContient,
					newContient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUes() {
		if (ues == null) {
			ues = new EObjectContainmentEList<UE>(UE.class, this, FILPackage.FORMATION__UES);
		}
		return ues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<Contact>(Contact.class, this, FILPackage.FORMATION__CONTACTS);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Niveau getNiveau() {
		if (niveau != null && niveau.eIsProxy()) {
			InternalEObject oldNiveau = (InternalEObject) niveau;
			niveau = (Niveau) eResolveProxy(oldNiveau);
			if (niveau != oldNiveau) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FILPackage.FORMATION__NIVEAU, oldNiveau,
							niveau));
			}
		}
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Niveau basicGetNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNiveau(Niveau newNiveau, NotificationChain msgs) {
		Niveau oldNiveau = niveau;
		niveau = newNiveau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FILPackage.FORMATION__NIVEAU,
					oldNiveau, newNiveau);
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
	public void setNiveau(Niveau newNiveau) {
		if (newNiveau != niveau) {
			NotificationChain msgs = null;
			if (niveau != null)
				msgs = ((InternalEObject) niveau).eInverseRemove(this, FILPackage.NIVEAU__FORMATIONS, Niveau.class,
						msgs);
			if (newNiveau != null)
				msgs = ((InternalEObject) newNiveau).eInverseAdd(this, FILPackage.NIVEAU__FORMATIONS, Niveau.class,
						msgs);
			msgs = basicSetNiveau(newNiveau, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.FORMATION__NIVEAU, newNiveau, newNiveau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FILPackage.FORMATION__NIVEAU:
			if (niveau != null)
				msgs = ((InternalEObject) niveau).eInverseRemove(this, FILPackage.NIVEAU__FORMATIONS, Niveau.class,
						msgs);
			return basicSetNiveau((Niveau) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FILPackage.FORMATION__CONTIENT:
			return basicSetContient(null, msgs);
		case FILPackage.FORMATION__UES:
			return ((InternalEList<?>) getUes()).basicRemove(otherEnd, msgs);
		case FILPackage.FORMATION__CONTACTS:
			return ((InternalEList<?>) getContacts()).basicRemove(otherEnd, msgs);
		case FILPackage.FORMATION__NIVEAU:
			return basicSetNiveau(null, msgs);
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
		case FILPackage.FORMATION__CONTIENT:
			return getContient();
		case FILPackage.FORMATION__UES:
			return getUes();
		case FILPackage.FORMATION__CONTACTS:
			return getContacts();
		case FILPackage.FORMATION__NIVEAU:
			if (resolve)
				return getNiveau();
			return basicGetNiveau();
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
		case FILPackage.FORMATION__CONTIENT:
			setContient((Presentation) newValue);
			return;
		case FILPackage.FORMATION__UES:
			getUes().clear();
			getUes().addAll((Collection<? extends UE>) newValue);
			return;
		case FILPackage.FORMATION__CONTACTS:
			getContacts().clear();
			getContacts().addAll((Collection<? extends Contact>) newValue);
			return;
		case FILPackage.FORMATION__NIVEAU:
			setNiveau((Niveau) newValue);
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
		case FILPackage.FORMATION__CONTIENT:
			setContient((Presentation) null);
			return;
		case FILPackage.FORMATION__UES:
			getUes().clear();
			return;
		case FILPackage.FORMATION__CONTACTS:
			getContacts().clear();
			return;
		case FILPackage.FORMATION__NIVEAU:
			setNiveau((Niveau) null);
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
		case FILPackage.FORMATION__CONTIENT:
			return contient != null;
		case FILPackage.FORMATION__UES:
			return ues != null && !ues.isEmpty();
		case FILPackage.FORMATION__CONTACTS:
			return contacts != null && !contacts.isEmpty();
		case FILPackage.FORMATION__NIVEAU:
			return niveau != null;
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
