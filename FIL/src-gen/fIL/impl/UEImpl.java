/**
 */
package fIL.impl;

import fIL.Document;
import fIL.FILPackage;
import fIL.Intervenant;
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
 * An implementation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fIL.impl.UEImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fIL.impl.UEImpl#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link fIL.impl.UEImpl#getDocuments <em>Documents</em>}</li>
 *   <li>{@link fIL.impl.UEImpl#getIntervenants <em>Intervenants</em>}</li>
 *   <li>{@link fIL.impl.UEImpl#isObligatoire <em>Obligatoire</em>}</li>
 *   <li>{@link fIL.impl.UEImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link fIL.impl.UEImpl#getEnseignants <em>Enseignants</em>}</li>
 *   <li>{@link fIL.impl.UEImpl#getPresentation <em>Presentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UEImpl extends MinimalEObjectImpl.Container implements UE {
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
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

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
	 * The default value of the '{@link #isObligatoire() <em>Obligatoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatoire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBLIGATOIRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObligatoire() <em>Obligatoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatoire()
	 * @generated
	 * @ordered
	 */
	protected boolean obligatoire = OBLIGATOIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected Intervenant responsable;

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
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected Presentation presentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FILPackage.Literals.UE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.UE__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.UE__PSEUDO, oldPseudo, pseudo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new EObjectContainmentEList<Document>(Document.class, this, FILPackage.UE__DOCUMENTS);
		}
		return documents;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FILPackage.UE__PRESENTATION,
					oldPresentation, newPresentation);
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
						EOPPOSITE_FEATURE_BASE - FILPackage.UE__PRESENTATION, null, msgs);
			if (newPresentation != null)
				msgs = ((InternalEObject) newPresentation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FILPackage.UE__PRESENTATION, null, msgs);
			msgs = basicSetPresentation(newPresentation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.UE__PRESENTATION, newPresentation,
					newPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervenant> getIntervenants() {
		if (intervenants == null) {
			intervenants = new EObjectContainmentEList<Intervenant>(Intervenant.class, this,
					FILPackage.UE__INTERVENANTS);
		}
		return intervenants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObligatoire() {
		return obligatoire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObligatoire(boolean newObligatoire) {
		boolean oldObligatoire = obligatoire;
		obligatoire = newObligatoire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.UE__OBLIGATOIRE, oldObligatoire,
					obligatoire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intervenant getResponsable() {
		if (responsable != null && responsable.eIsProxy()) {
			InternalEObject oldResponsable = (InternalEObject) responsable;
			responsable = (Intervenant) eResolveProxy(oldResponsable);
			if (responsable != oldResponsable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FILPackage.UE__RESPONSABLE,
							oldResponsable, responsable));
			}
		}
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intervenant basicGetResponsable() {
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(Intervenant newResponsable) {
		Intervenant oldResponsable = responsable;
		responsable = newResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FILPackage.UE__RESPONSABLE, oldResponsable,
					responsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervenant> getEnseignants() {
		if (enseignants == null) {
			enseignants = new EObjectResolvingEList<Intervenant>(Intervenant.class, this, FILPackage.UE__ENSEIGNANTS);
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
		case FILPackage.UE__DOCUMENTS:
			return ((InternalEList<?>) getDocuments()).basicRemove(otherEnd, msgs);
		case FILPackage.UE__INTERVENANTS:
			return ((InternalEList<?>) getIntervenants()).basicRemove(otherEnd, msgs);
		case FILPackage.UE__PRESENTATION:
			return basicSetPresentation(null, msgs);
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
		case FILPackage.UE__NOM:
			return getNom();
		case FILPackage.UE__PSEUDO:
			return getPseudo();
		case FILPackage.UE__DOCUMENTS:
			return getDocuments();
		case FILPackage.UE__INTERVENANTS:
			return getIntervenants();
		case FILPackage.UE__OBLIGATOIRE:
			return isObligatoire();
		case FILPackage.UE__RESPONSABLE:
			if (resolve)
				return getResponsable();
			return basicGetResponsable();
		case FILPackage.UE__ENSEIGNANTS:
			return getEnseignants();
		case FILPackage.UE__PRESENTATION:
			return getPresentation();
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
		case FILPackage.UE__NOM:
			setNom((String) newValue);
			return;
		case FILPackage.UE__PSEUDO:
			setPseudo((String) newValue);
			return;
		case FILPackage.UE__DOCUMENTS:
			getDocuments().clear();
			getDocuments().addAll((Collection<? extends Document>) newValue);
			return;
		case FILPackage.UE__INTERVENANTS:
			getIntervenants().clear();
			getIntervenants().addAll((Collection<? extends Intervenant>) newValue);
			return;
		case FILPackage.UE__OBLIGATOIRE:
			setObligatoire((Boolean) newValue);
			return;
		case FILPackage.UE__RESPONSABLE:
			setResponsable((Intervenant) newValue);
			return;
		case FILPackage.UE__ENSEIGNANTS:
			getEnseignants().clear();
			getEnseignants().addAll((Collection<? extends Intervenant>) newValue);
			return;
		case FILPackage.UE__PRESENTATION:
			setPresentation((Presentation) newValue);
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
		case FILPackage.UE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case FILPackage.UE__PSEUDO:
			setPseudo(PSEUDO_EDEFAULT);
			return;
		case FILPackage.UE__DOCUMENTS:
			getDocuments().clear();
			return;
		case FILPackage.UE__INTERVENANTS:
			getIntervenants().clear();
			return;
		case FILPackage.UE__OBLIGATOIRE:
			setObligatoire(OBLIGATOIRE_EDEFAULT);
			return;
		case FILPackage.UE__RESPONSABLE:
			setResponsable((Intervenant) null);
			return;
		case FILPackage.UE__ENSEIGNANTS:
			getEnseignants().clear();
			return;
		case FILPackage.UE__PRESENTATION:
			setPresentation((Presentation) null);
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
		case FILPackage.UE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case FILPackage.UE__PSEUDO:
			return PSEUDO_EDEFAULT == null ? pseudo != null : !PSEUDO_EDEFAULT.equals(pseudo);
		case FILPackage.UE__DOCUMENTS:
			return documents != null && !documents.isEmpty();
		case FILPackage.UE__INTERVENANTS:
			return intervenants != null && !intervenants.isEmpty();
		case FILPackage.UE__OBLIGATOIRE:
			return obligatoire != OBLIGATOIRE_EDEFAULT;
		case FILPackage.UE__RESPONSABLE:
			return responsable != null;
		case FILPackage.UE__ENSEIGNANTS:
			return enseignants != null && !enseignants.isEmpty();
		case FILPackage.UE__PRESENTATION:
			return presentation != null;
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
		result.append(", obligatoire: ");
		result.append(obligatoire);
		result.append(')');
		return result.toString();
	}

} //UEImpl
