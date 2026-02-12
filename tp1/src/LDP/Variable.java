/**
 */
package LDP;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Variable#getNom <em>Nom</em>}</li>
 *   <li>{@link LDP.Variable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see LDP.LDPPackage#getVariable_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LDP.Variable#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see LDP.LDPPackage#getVariable_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link LDP.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Variable
