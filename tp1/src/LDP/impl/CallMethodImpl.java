/**
 */
package LDP.impl;

import LDP.CallMethod;
import LDP.LDPPackage;
import LDP.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.CallMethodImpl#getNomMethode <em>Nom Methode</em>}</li>
 *   <li>{@link LDP.impl.CallMethodImpl#getObjetCible <em>Objet Cible</em>}</li>
 *   <li>{@link LDP.impl.CallMethodImpl#getParametres <em>Parametres</em>}</li>
 *   <li>{@link LDP.impl.CallMethodImpl#getResultat <em>Resultat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallMethodImpl extends ActionImpl implements CallMethod {
	/**
	 * The default value of the '{@link #getNomMethode() <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomMethode()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_METHODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomMethode() <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomMethode()
	 * @generated
	 * @ordered
	 */
	protected String nomMethode = NOM_METHODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjetCible() <em>Objet Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetCible()
	 * @generated
	 * @ordered
	 */
	protected Variable objetCible;

	/**
	 * The cached value of the '{@link #getParametres() <em>Parametres</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametres()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> parametres;

	/**
	 * The cached value of the '{@link #getResultat() <em>Resultat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultat()
	 * @generated
	 * @ordered
	 */
	protected Variable resultat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.CALL_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNomMethode() {
		return nomMethode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNomMethode(String newNomMethode) {
		String oldNomMethode = nomMethode;
		nomMethode = newNomMethode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.CALL_METHOD__NOM_METHODE, oldNomMethode, nomMethode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getObjetCible() {
		if (objetCible != null && objetCible.eIsProxy()) {
			InternalEObject oldObjetCible = (InternalEObject)objetCible;
			objetCible = (Variable)eResolveProxy(oldObjetCible);
			if (objetCible != oldObjetCible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDPPackage.CALL_METHOD__OBJET_CIBLE, oldObjetCible, objetCible));
			}
		}
		return objetCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetObjetCible() {
		return objetCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjetCible(Variable newObjetCible) {
		Variable oldObjetCible = objetCible;
		objetCible = newObjetCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.CALL_METHOD__OBJET_CIBLE, oldObjetCible, objetCible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getParametres() {
		if (parametres == null) {
			parametres = new EObjectResolvingEList<Variable>(Variable.class, this, LDPPackage.CALL_METHOD__PARAMETRES);
		}
		return parametres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getResultat() {
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultat(Variable newResultat, NotificationChain msgs) {
		Variable oldResultat = resultat;
		resultat = newResultat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPPackage.CALL_METHOD__RESULTAT, oldResultat, newResultat);
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
	public void setResultat(Variable newResultat) {
		if (newResultat != resultat) {
			NotificationChain msgs = null;
			if (resultat != null)
				msgs = ((InternalEObject)resultat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDPPackage.CALL_METHOD__RESULTAT, null, msgs);
			if (newResultat != null)
				msgs = ((InternalEObject)newResultat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDPPackage.CALL_METHOD__RESULTAT, null, msgs);
			msgs = basicSetResultat(newResultat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.CALL_METHOD__RESULTAT, newResultat, newResultat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDPPackage.CALL_METHOD__RESULTAT:
				return basicSetResultat(null, msgs);
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
			case LDPPackage.CALL_METHOD__NOM_METHODE:
				return getNomMethode();
			case LDPPackage.CALL_METHOD__OBJET_CIBLE:
				if (resolve) return getObjetCible();
				return basicGetObjetCible();
			case LDPPackage.CALL_METHOD__PARAMETRES:
				return getParametres();
			case LDPPackage.CALL_METHOD__RESULTAT:
				return getResultat();
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
			case LDPPackage.CALL_METHOD__NOM_METHODE:
				setNomMethode((String)newValue);
				return;
			case LDPPackage.CALL_METHOD__OBJET_CIBLE:
				setObjetCible((Variable)newValue);
				return;
			case LDPPackage.CALL_METHOD__PARAMETRES:
				getParametres().clear();
				getParametres().addAll((Collection<? extends Variable>)newValue);
				return;
			case LDPPackage.CALL_METHOD__RESULTAT:
				setResultat((Variable)newValue);
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
			case LDPPackage.CALL_METHOD__NOM_METHODE:
				setNomMethode(NOM_METHODE_EDEFAULT);
				return;
			case LDPPackage.CALL_METHOD__OBJET_CIBLE:
				setObjetCible((Variable)null);
				return;
			case LDPPackage.CALL_METHOD__PARAMETRES:
				getParametres().clear();
				return;
			case LDPPackage.CALL_METHOD__RESULTAT:
				setResultat((Variable)null);
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
			case LDPPackage.CALL_METHOD__NOM_METHODE:
				return NOM_METHODE_EDEFAULT == null ? nomMethode != null : !NOM_METHODE_EDEFAULT.equals(nomMethode);
			case LDPPackage.CALL_METHOD__OBJET_CIBLE:
				return objetCible != null;
			case LDPPackage.CALL_METHOD__PARAMETRES:
				return parametres != null && !parametres.isEmpty();
			case LDPPackage.CALL_METHOD__RESULTAT:
				return resultat != null;
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
		result.append(" (nomMethode: ");
		result.append(nomMethode);
		result.append(')');
		return result.toString();
	}

} //CallMethodImpl
