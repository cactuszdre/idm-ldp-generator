/**
 */
package LDP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Activite#getNom <em>Nom</em>}</li>
 *   <li>{@link LDP.Activite#getPrecedente <em>Precedente</em>}</li>
 *   <li>{@link LDP.Activite#getSuivante <em>Suivante</em>}</li>
 *   <li>{@link LDP.Activite#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getActivite()
 * @model
 * @generated
 */
public interface Activite extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see LDP.LDPPackage#getActivite_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LDP.Activite#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Precedente</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LDP.Activite#getSuivante <em>Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedente</em>' reference.
	 * @see #setPrecedente(Activite)
	 * @see LDP.LDPPackage#getActivite_Precedente()
	 * @see LDP.Activite#getSuivante
	 * @model opposite="suivante"
	 * @generated
	 */
	Activite getPrecedente();

	/**
	 * Sets the value of the '{@link LDP.Activite#getPrecedente <em>Precedente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedente</em>' reference.
	 * @see #getPrecedente()
	 * @generated
	 */
	void setPrecedente(Activite value);

	/**
	 * Returns the value of the '<em><b>Suivante</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LDP.Activite#getPrecedente <em>Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suivante</em>' reference.
	 * @see #setSuivante(Activite)
	 * @see LDP.LDPPackage#getActivite_Suivante()
	 * @see LDP.Activite#getPrecedente
	 * @model opposite="precedente"
	 * @generated
	 */
	Activite getSuivante();

	/**
	 * Sets the value of the '{@link LDP.Activite#getSuivante <em>Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suivante</em>' reference.
	 * @see #getSuivante()
	 * @generated
	 */
	void setSuivante(Activite value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link LDP.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see LDP.LDPPackage#getActivite_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Activite
