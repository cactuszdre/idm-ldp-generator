/**
 */
package LDP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.CreateObject#getClasse <em>Classe</em>}</li>
 *   <li>{@link LDP.CreateObject#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getCreateObject()
 * @model
 * @generated
 */
public interface CreateObject extends Action {
	/**
	 * Returns the value of the '<em><b>Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' attribute.
	 * @see #setClasse(String)
	 * @see LDP.LDPPackage#getCreateObject_Classe()
	 * @model
	 * @generated
	 */
	String getClasse();

	/**
	 * Sets the value of the '{@link LDP.CreateObject#getClasse <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe</em>' attribute.
	 * @see #getClasse()
	 * @generated
	 */
	void setClasse(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see LDP.LDPPackage#getCreateObject_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link LDP.CreateObject#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // CreateObject
