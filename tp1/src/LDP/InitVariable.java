/**
 */
package LDP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.InitVariable#getVariable <em>Variable</em>}</li>
 *   <li>{@link LDP.InitVariable#getValeurInit <em>Valeur Init</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getInitVariable()
 * @model
 * @generated
 */
public interface InitVariable extends Action {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see LDP.LDPPackage#getInitVariable_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link LDP.InitVariable#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Valeur Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur Init</em>' attribute.
	 * @see #setValeurInit(String)
	 * @see LDP.LDPPackage#getInitVariable_ValeurInit()
	 * @model
	 * @generated
	 */
	String getValeurInit();

	/**
	 * Sets the value of the '{@link LDP.InitVariable#getValeurInit <em>Valeur Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur Init</em>' attribute.
	 * @see #getValeurInit()
	 * @generated
	 */
	void setValeurInit(String value);

} // InitVariable
