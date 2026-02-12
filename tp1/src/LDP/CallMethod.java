/**
 */
package LDP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.CallMethod#getNomMethode <em>Nom Methode</em>}</li>
 *   <li>{@link LDP.CallMethod#getObjetCible <em>Objet Cible</em>}</li>
 *   <li>{@link LDP.CallMethod#getParametres <em>Parametres</em>}</li>
 *   <li>{@link LDP.CallMethod#getResultat <em>Resultat</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getCallMethod()
 * @model
 * @generated
 */
public interface CallMethod extends Action {
	/**
	 * Returns the value of the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Methode</em>' attribute.
	 * @see #setNomMethode(String)
	 * @see LDP.LDPPackage#getCallMethod_NomMethode()
	 * @model
	 * @generated
	 */
	String getNomMethode();

	/**
	 * Sets the value of the '{@link LDP.CallMethod#getNomMethode <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Methode</em>' attribute.
	 * @see #getNomMethode()
	 * @generated
	 */
	void setNomMethode(String value);

	/**
	 * Returns the value of the '<em><b>Objet Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet Cible</em>' reference.
	 * @see #setObjetCible(Variable)
	 * @see LDP.LDPPackage#getCallMethod_ObjetCible()
	 * @model required="true"
	 * @generated
	 */
	Variable getObjetCible();

	/**
	 * Sets the value of the '{@link LDP.CallMethod#getObjetCible <em>Objet Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet Cible</em>' reference.
	 * @see #getObjetCible()
	 * @generated
	 */
	void setObjetCible(Variable value);

	/**
	 * Returns the value of the '<em><b>Parametres</b></em>' reference list.
	 * The list contents are of type {@link LDP.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametres</em>' reference list.
	 * @see LDP.LDPPackage#getCallMethod_Parametres()
	 * @model
	 * @generated
	 */
	EList<Variable> getParametres();

	/**
	 * Returns the value of the '<em><b>Resultat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultat</em>' containment reference.
	 * @see #setResultat(Variable)
	 * @see LDP.LDPPackage#getCallMethod_Resultat()
	 * @model containment="true"
	 * @generated
	 */
	Variable getResultat();

	/**
	 * Sets the value of the '{@link LDP.CallMethod#getResultat <em>Resultat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultat</em>' containment reference.
	 * @see #getResultat()
	 * @generated
	 */
	void setResultat(Variable value);

} // CallMethod
