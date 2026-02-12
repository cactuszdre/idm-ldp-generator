/**
 */
package LDP.impl;

import LDP.InitVariable;
import LDP.LDPPackage;
import LDP.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.InitVariableImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link LDP.impl.InitVariableImpl#getValeurInit <em>Valeur Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitVariableImpl extends ActionImpl implements InitVariable {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The default value of the '{@link #getValeurInit() <em>Valeur Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurInit()
	 * @generated
	 * @ordered
	 */
	protected static final String VALEUR_INIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValeurInit() <em>Valeur Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurInit()
	 * @generated
	 * @ordered
	 */
	protected String valeurInit = VALEUR_INIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.INIT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPPackage.INIT_VARIABLE__VARIABLE, oldVariable, newVariable);
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
	public void setVariable(Variable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDPPackage.INIT_VARIABLE__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDPPackage.INIT_VARIABLE__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.INIT_VARIABLE__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValeurInit() {
		return valeurInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValeurInit(String newValeurInit) {
		String oldValeurInit = valeurInit;
		valeurInit = newValeurInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.INIT_VARIABLE__VALEUR_INIT, oldValeurInit, valeurInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDPPackage.INIT_VARIABLE__VARIABLE:
				return basicSetVariable(null, msgs);
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
			case LDPPackage.INIT_VARIABLE__VARIABLE:
				return getVariable();
			case LDPPackage.INIT_VARIABLE__VALEUR_INIT:
				return getValeurInit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LDPPackage.INIT_VARIABLE__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case LDPPackage.INIT_VARIABLE__VALEUR_INIT:
				setValeurInit((String)newValue);
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
			case LDPPackage.INIT_VARIABLE__VARIABLE:
				setVariable((Variable)null);
				return;
			case LDPPackage.INIT_VARIABLE__VALEUR_INIT:
				setValeurInit(VALEUR_INIT_EDEFAULT);
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
			case LDPPackage.INIT_VARIABLE__VARIABLE:
				return variable != null;
			case LDPPackage.INIT_VARIABLE__VALEUR_INIT:
				return VALEUR_INIT_EDEFAULT == null ? valeurInit != null : !VALEUR_INIT_EDEFAULT.equals(valeurInit);
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
		result.append(" (valeurInit: ");
		result.append(valeurInit);
		result.append(')');
		return result.toString();
	}

} //InitVariableImpl
