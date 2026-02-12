/**
 */
package LDP.impl;

import LDP.CreateObject;
import LDP.LDPPackage;
import LDP.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.CreateObjectImpl#getClasse <em>Classe</em>}</li>
 *   <li>{@link LDP.impl.CreateObjectImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateObjectImpl extends ActionImpl implements CreateObject {
	/**
	 * The default value of the '{@link #getClasse() <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClasse() <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected String classe = CLASSE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.CREATE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClasse() {
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClasse(String newClasse) {
		String oldClasse = classe;
		classe = newClasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.CREATE_OBJECT__CLASSE, oldClasse, classe));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPPackage.CREATE_OBJECT__VARIABLE, oldVariable, newVariable);
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
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDPPackage.CREATE_OBJECT__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDPPackage.CREATE_OBJECT__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.CREATE_OBJECT__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDPPackage.CREATE_OBJECT__VARIABLE:
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
			case LDPPackage.CREATE_OBJECT__CLASSE:
				return getClasse();
			case LDPPackage.CREATE_OBJECT__VARIABLE:
				return getVariable();
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
			case LDPPackage.CREATE_OBJECT__CLASSE:
				setClasse((String)newValue);
				return;
			case LDPPackage.CREATE_OBJECT__VARIABLE:
				setVariable((Variable)newValue);
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
			case LDPPackage.CREATE_OBJECT__CLASSE:
				setClasse(CLASSE_EDEFAULT);
				return;
			case LDPPackage.CREATE_OBJECT__VARIABLE:
				setVariable((Variable)null);
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
			case LDPPackage.CREATE_OBJECT__CLASSE:
				return CLASSE_EDEFAULT == null ? classe != null : !CLASSE_EDEFAULT.equals(classe);
			case LDPPackage.CREATE_OBJECT__VARIABLE:
				return variable != null;
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
		result.append(" (classe: ");
		result.append(classe);
		result.append(')');
		return result.toString();
	}

} //CreateObjectImpl
