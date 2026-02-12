/**
 */
package LDP.impl;

import LDP.Action;
import LDP.Activite;
import LDP.LDPPackage;

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
 * An implementation of the model object '<em><b>Activite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.ActiviteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link LDP.impl.ActiviteImpl#getPrecedente <em>Precedente</em>}</li>
 *   <li>{@link LDP.impl.ActiviteImpl#getSuivante <em>Suivante</em>}</li>
 *   <li>{@link LDP.impl.ActiviteImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActiviteImpl extends MinimalEObjectImpl.Container implements Activite {
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
	 * The cached value of the '{@link #getPrecedente() <em>Precedente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedente()
	 * @generated
	 * @ordered
	 */
	protected Activite precedente;

	/**
	 * The cached value of the '{@link #getSuivante() <em>Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuivante()
	 * @generated
	 * @ordered
	 */
	protected Activite suivante;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiviteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.ACTIVITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.ACTIVITE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activite getPrecedente() {
		if (precedente != null && precedente.eIsProxy()) {
			InternalEObject oldPrecedente = (InternalEObject)precedente;
			precedente = (Activite)eResolveProxy(oldPrecedente);
			if (precedente != oldPrecedente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDPPackage.ACTIVITE__PRECEDENTE, oldPrecedente, precedente));
			}
		}
		return precedente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite basicGetPrecedente() {
		return precedente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedente(Activite newPrecedente, NotificationChain msgs) {
		Activite oldPrecedente = precedente;
		precedente = newPrecedente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPPackage.ACTIVITE__PRECEDENTE, oldPrecedente, newPrecedente);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecedente(Activite newPrecedente) {
		if (newPrecedente != precedente) {
			NotificationChain msgs = null;
			if (precedente != null)
				msgs = ((InternalEObject)precedente).eInverseRemove(this, LDPPackage.ACTIVITE__SUIVANTE, Activite.class, msgs);
			if (newPrecedente != null)
				msgs = ((InternalEObject)newPrecedente).eInverseAdd(this, LDPPackage.ACTIVITE__SUIVANTE, Activite.class, msgs);
			msgs = basicSetPrecedente(newPrecedente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.ACTIVITE__PRECEDENTE, newPrecedente, newPrecedente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activite getSuivante() {
		if (suivante != null && suivante.eIsProxy()) {
			InternalEObject oldSuivante = (InternalEObject)suivante;
			suivante = (Activite)eResolveProxy(oldSuivante);
			if (suivante != oldSuivante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDPPackage.ACTIVITE__SUIVANTE, oldSuivante, suivante));
			}
		}
		return suivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite basicGetSuivante() {
		return suivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuivante(Activite newSuivante, NotificationChain msgs) {
		Activite oldSuivante = suivante;
		suivante = newSuivante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPPackage.ACTIVITE__SUIVANTE, oldSuivante, newSuivante);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuivante(Activite newSuivante) {
		if (newSuivante != suivante) {
			NotificationChain msgs = null;
			if (suivante != null)
				msgs = ((InternalEObject)suivante).eInverseRemove(this, LDPPackage.ACTIVITE__PRECEDENTE, Activite.class, msgs);
			if (newSuivante != null)
				msgs = ((InternalEObject)newSuivante).eInverseAdd(this, LDPPackage.ACTIVITE__PRECEDENTE, Activite.class, msgs);
			msgs = basicSetSuivante(newSuivante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.ACTIVITE__SUIVANTE, newSuivante, newSuivante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, LDPPackage.ACTIVITE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDPPackage.ACTIVITE__PRECEDENTE:
				if (precedente != null)
					msgs = ((InternalEObject)precedente).eInverseRemove(this, LDPPackage.ACTIVITE__SUIVANTE, Activite.class, msgs);
				return basicSetPrecedente((Activite)otherEnd, msgs);
			case LDPPackage.ACTIVITE__SUIVANTE:
				if (suivante != null)
					msgs = ((InternalEObject)suivante).eInverseRemove(this, LDPPackage.ACTIVITE__PRECEDENTE, Activite.class, msgs);
				return basicSetSuivante((Activite)otherEnd, msgs);
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
			case LDPPackage.ACTIVITE__PRECEDENTE:
				return basicSetPrecedente(null, msgs);
			case LDPPackage.ACTIVITE__SUIVANTE:
				return basicSetSuivante(null, msgs);
			case LDPPackage.ACTIVITE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case LDPPackage.ACTIVITE__NOM:
				return getNom();
			case LDPPackage.ACTIVITE__PRECEDENTE:
				if (resolve) return getPrecedente();
				return basicGetPrecedente();
			case LDPPackage.ACTIVITE__SUIVANTE:
				if (resolve) return getSuivante();
				return basicGetSuivante();
			case LDPPackage.ACTIVITE__ACTIONS:
				return getActions();
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
			case LDPPackage.ACTIVITE__NOM:
				setNom((String)newValue);
				return;
			case LDPPackage.ACTIVITE__PRECEDENTE:
				setPrecedente((Activite)newValue);
				return;
			case LDPPackage.ACTIVITE__SUIVANTE:
				setSuivante((Activite)newValue);
				return;
			case LDPPackage.ACTIVITE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case LDPPackage.ACTIVITE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case LDPPackage.ACTIVITE__PRECEDENTE:
				setPrecedente((Activite)null);
				return;
			case LDPPackage.ACTIVITE__SUIVANTE:
				setSuivante((Activite)null);
				return;
			case LDPPackage.ACTIVITE__ACTIONS:
				getActions().clear();
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
			case LDPPackage.ACTIVITE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case LDPPackage.ACTIVITE__PRECEDENTE:
				return precedente != null;
			case LDPPackage.ACTIVITE__SUIVANTE:
				return suivante != null;
			case LDPPackage.ACTIVITE__ACTIONS:
				return actions != null && !actions.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //ActiviteImpl
