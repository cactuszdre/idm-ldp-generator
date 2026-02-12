/**
 */
package LDP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LDP.LDPFactory
 * @model kind="package"
 * @generated
 */
public interface LDPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LDP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://LDP/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LDP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDPPackage eINSTANCE = LDP.impl.LDPPackageImpl.init();

	/**
	 * The meta object id for the '{@link LDP.impl.ProcessusImpl <em>Processus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ProcessusImpl
	 * @see LDP.impl.LDPPackageImpl#getProcessus()
	 * @generated
	 */
	int PROCESSUS = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__NOM = 0;

	/**
	 * The feature id for the '<em><b>Activites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ACTIVITES = 1;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__DEBUT = 2;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__FIN = 3;

	/**
	 * The feature id for the '<em><b>Activite Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ACTIVITE_COURANTE = 4;

	/**
	 * The number of structural features of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.ActiviteImpl <em>Activite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ActiviteImpl
	 * @see LDP.impl.LDPPackageImpl#getActivite()
	 * @generated
	 */
	int ACTIVITE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Precedente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__PRECEDENTE = 1;

	/**
	 * The feature id for the '<em><b>Suivante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__SUIVANTE = 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__ACTIONS = 3;

	/**
	 * The number of structural features of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.PseudoEtatImpl
	 * @see LDP.impl.LDPPackageImpl#getPseudoEtat()
	 * @generated
	 */
	int PSEUDO_ETAT = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Pseudo Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pseudo Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.DebutImpl <em>Debut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.DebutImpl
	 * @see LDP.impl.LDPPackageImpl#getDebut()
	 * @generated
	 */
	int DEBUT = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT__REFERENCE = PSEUDO_ETAT__REFERENCE;

	/**
	 * The number of structural features of the '<em>Debut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT_FEATURE_COUNT = PSEUDO_ETAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Debut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT_OPERATION_COUNT = PSEUDO_ETAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.FinImpl <em>Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.FinImpl
	 * @see LDP.impl.LDPPackageImpl#getFin()
	 * @generated
	 */
	int FIN = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__REFERENCE = PSEUDO_ETAT__REFERENCE;

	/**
	 * The number of structural features of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_FEATURE_COUNT = PSEUDO_ETAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_OPERATION_COUNT = PSEUDO_ETAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ActionImpl
	 * @see LDP.impl.LDPPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.VariableImpl
	 * @see LDP.impl.LDPPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.InitVariableImpl <em>Init Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.InitVariableImpl
	 * @see LDP.impl.LDPPackageImpl#getInitVariable()
	 * @generated
	 */
	int INIT_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_VARIABLE__VARIABLE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valeur Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_VARIABLE__VALEUR_INIT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Init Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_VARIABLE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Init Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_VARIABLE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.CreateObjectImpl <em>Create Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.CreateObjectImpl
	 * @see LDP.impl.LDPPackageImpl#getCreateObject()
	 * @generated
	 */
	int CREATE_OBJECT = 8;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT__CLASSE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT__VARIABLE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Create Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.CallMethodImpl <em>Call Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.CallMethodImpl
	 * @see LDP.impl.LDPPackageImpl#getCallMethod()
	 * @generated
	 */
	int CALL_METHOD = 9;

	/**
	 * The feature id for the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_METHOD__NOM_METHODE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objet Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_METHOD__OBJET_CIBLE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parametres</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_METHOD__PARAMETRES = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resultat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_METHOD__RESULTAT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Call Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_METHOD_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Call Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_METHOD_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link LDP.Processus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processus</em>'.
	 * @see LDP.Processus
	 * @generated
	 */
	EClass getProcessus();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Processus#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP.Processus#getNom()
	 * @see #getProcessus()
	 * @generated
	 */
	EAttribute getProcessus_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP.Processus#getActivites <em>Activites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activites</em>'.
	 * @see LDP.Processus#getActivites()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Activites();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.Processus#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Debut</em>'.
	 * @see LDP.Processus#getDebut()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Debut();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.Processus#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fin</em>'.
	 * @see LDP.Processus#getFin()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Fin();

	/**
	 * Returns the meta object for the reference '{@link LDP.Processus#getActiviteCourante <em>Activite Courante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activite Courante</em>'.
	 * @see LDP.Processus#getActiviteCourante()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_ActiviteCourante();

	/**
	 * Returns the meta object for class '{@link LDP.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activite</em>'.
	 * @see LDP.Activite
	 * @generated
	 */
	EClass getActivite();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Activite#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP.Activite#getNom()
	 * @see #getActivite()
	 * @generated
	 */
	EAttribute getActivite_Nom();

	/**
	 * Returns the meta object for the reference '{@link LDP.Activite#getPrecedente <em>Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precedente</em>'.
	 * @see LDP.Activite#getPrecedente()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Precedente();

	/**
	 * Returns the meta object for the reference '{@link LDP.Activite#getSuivante <em>Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suivante</em>'.
	 * @see LDP.Activite#getSuivante()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Suivante();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP.Activite#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see LDP.Activite#getActions()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Actions();

	/**
	 * Returns the meta object for class '{@link LDP.PseudoEtat <em>Pseudo Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Etat</em>'.
	 * @see LDP.PseudoEtat
	 * @generated
	 */
	EClass getPseudoEtat();

	/**
	 * Returns the meta object for the reference '{@link LDP.PseudoEtat#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see LDP.PseudoEtat#getReference()
	 * @see #getPseudoEtat()
	 * @generated
	 */
	EReference getPseudoEtat_Reference();

	/**
	 * Returns the meta object for class '{@link LDP.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debut</em>'.
	 * @see LDP.Debut
	 * @generated
	 */
	EClass getDebut();

	/**
	 * Returns the meta object for class '{@link LDP.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin</em>'.
	 * @see LDP.Fin
	 * @generated
	 */
	EClass getFin();

	/**
	 * Returns the meta object for class '{@link LDP.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see LDP.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link LDP.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see LDP.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Variable#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP.Variable#getNom()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Nom();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see LDP.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link LDP.InitVariable <em>Init Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Variable</em>'.
	 * @see LDP.InitVariable
	 * @generated
	 */
	EClass getInitVariable();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.InitVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see LDP.InitVariable#getVariable()
	 * @see #getInitVariable()
	 * @generated
	 */
	EReference getInitVariable_Variable();

	/**
	 * Returns the meta object for the attribute '{@link LDP.InitVariable#getValeurInit <em>Valeur Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur Init</em>'.
	 * @see LDP.InitVariable#getValeurInit()
	 * @see #getInitVariable()
	 * @generated
	 */
	EAttribute getInitVariable_ValeurInit();

	/**
	 * Returns the meta object for class '{@link LDP.CreateObject <em>Create Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Object</em>'.
	 * @see LDP.CreateObject
	 * @generated
	 */
	EClass getCreateObject();

	/**
	 * Returns the meta object for the attribute '{@link LDP.CreateObject#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classe</em>'.
	 * @see LDP.CreateObject#getClasse()
	 * @see #getCreateObject()
	 * @generated
	 */
	EAttribute getCreateObject_Classe();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.CreateObject#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see LDP.CreateObject#getVariable()
	 * @see #getCreateObject()
	 * @generated
	 */
	EReference getCreateObject_Variable();

	/**
	 * Returns the meta object for class '{@link LDP.CallMethod <em>Call Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Method</em>'.
	 * @see LDP.CallMethod
	 * @generated
	 */
	EClass getCallMethod();

	/**
	 * Returns the meta object for the attribute '{@link LDP.CallMethod#getNomMethode <em>Nom Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Methode</em>'.
	 * @see LDP.CallMethod#getNomMethode()
	 * @see #getCallMethod()
	 * @generated
	 */
	EAttribute getCallMethod_NomMethode();

	/**
	 * Returns the meta object for the reference '{@link LDP.CallMethod#getObjetCible <em>Objet Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objet Cible</em>'.
	 * @see LDP.CallMethod#getObjetCible()
	 * @see #getCallMethod()
	 * @generated
	 */
	EReference getCallMethod_ObjetCible();

	/**
	 * Returns the meta object for the reference list '{@link LDP.CallMethod#getParametres <em>Parametres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parametres</em>'.
	 * @see LDP.CallMethod#getParametres()
	 * @see #getCallMethod()
	 * @generated
	 */
	EReference getCallMethod_Parametres();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.CallMethod#getResultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resultat</em>'.
	 * @see LDP.CallMethod#getResultat()
	 * @see #getCallMethod()
	 * @generated
	 */
	EReference getCallMethod_Resultat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LDPFactory getLDPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link LDP.impl.ProcessusImpl <em>Processus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ProcessusImpl
		 * @see LDP.impl.LDPPackageImpl#getProcessus()
		 * @generated
		 */
		EClass PROCESSUS = eINSTANCE.getProcessus();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSUS__NOM = eINSTANCE.getProcessus_Nom();

		/**
		 * The meta object literal for the '<em><b>Activites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__ACTIVITES = eINSTANCE.getProcessus_Activites();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__DEBUT = eINSTANCE.getProcessus_Debut();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__FIN = eINSTANCE.getProcessus_Fin();

		/**
		 * The meta object literal for the '<em><b>Activite Courante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__ACTIVITE_COURANTE = eINSTANCE.getProcessus_ActiviteCourante();

		/**
		 * The meta object literal for the '{@link LDP.impl.ActiviteImpl <em>Activite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ActiviteImpl
		 * @see LDP.impl.LDPPackageImpl#getActivite()
		 * @generated
		 */
		EClass ACTIVITE = eINSTANCE.getActivite();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITE__NOM = eINSTANCE.getActivite_Nom();

		/**
		 * The meta object literal for the '<em><b>Precedente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__PRECEDENTE = eINSTANCE.getActivite_Precedente();

		/**
		 * The meta object literal for the '<em><b>Suivante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__SUIVANTE = eINSTANCE.getActivite_Suivante();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__ACTIONS = eINSTANCE.getActivite_Actions();

		/**
		 * The meta object literal for the '{@link LDP.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.PseudoEtatImpl
		 * @see LDP.impl.LDPPackageImpl#getPseudoEtat()
		 * @generated
		 */
		EClass PSEUDO_ETAT = eINSTANCE.getPseudoEtat();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEUDO_ETAT__REFERENCE = eINSTANCE.getPseudoEtat_Reference();

		/**
		 * The meta object literal for the '{@link LDP.impl.DebutImpl <em>Debut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.DebutImpl
		 * @see LDP.impl.LDPPackageImpl#getDebut()
		 * @generated
		 */
		EClass DEBUT = eINSTANCE.getDebut();

		/**
		 * The meta object literal for the '{@link LDP.impl.FinImpl <em>Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.FinImpl
		 * @see LDP.impl.LDPPackageImpl#getFin()
		 * @generated
		 */
		EClass FIN = eINSTANCE.getFin();

		/**
		 * The meta object literal for the '{@link LDP.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ActionImpl
		 * @see LDP.impl.LDPPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link LDP.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.VariableImpl
		 * @see LDP.impl.LDPPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NOM = eINSTANCE.getVariable_Nom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link LDP.impl.InitVariableImpl <em>Init Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.InitVariableImpl
		 * @see LDP.impl.LDPPackageImpl#getInitVariable()
		 * @generated
		 */
		EClass INIT_VARIABLE = eINSTANCE.getInitVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_VARIABLE__VARIABLE = eINSTANCE.getInitVariable_Variable();

		/**
		 * The meta object literal for the '<em><b>Valeur Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_VARIABLE__VALEUR_INIT = eINSTANCE.getInitVariable_ValeurInit();

		/**
		 * The meta object literal for the '{@link LDP.impl.CreateObjectImpl <em>Create Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.CreateObjectImpl
		 * @see LDP.impl.LDPPackageImpl#getCreateObject()
		 * @generated
		 */
		EClass CREATE_OBJECT = eINSTANCE.getCreateObject();

		/**
		 * The meta object literal for the '<em><b>Classe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_OBJECT__CLASSE = eINSTANCE.getCreateObject_Classe();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_OBJECT__VARIABLE = eINSTANCE.getCreateObject_Variable();

		/**
		 * The meta object literal for the '{@link LDP.impl.CallMethodImpl <em>Call Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.CallMethodImpl
		 * @see LDP.impl.LDPPackageImpl#getCallMethod()
		 * @generated
		 */
		EClass CALL_METHOD = eINSTANCE.getCallMethod();

		/**
		 * The meta object literal for the '<em><b>Nom Methode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_METHOD__NOM_METHODE = eINSTANCE.getCallMethod_NomMethode();

		/**
		 * The meta object literal for the '<em><b>Objet Cible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_METHOD__OBJET_CIBLE = eINSTANCE.getCallMethod_ObjetCible();

		/**
		 * The meta object literal for the '<em><b>Parametres</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_METHOD__PARAMETRES = eINSTANCE.getCallMethod_Parametres();

		/**
		 * The meta object literal for the '<em><b>Resultat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_METHOD__RESULTAT = eINSTANCE.getCallMethod_Resultat();

	}

} //LDPPackage
