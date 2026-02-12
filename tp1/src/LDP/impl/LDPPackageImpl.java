/**
 */
package LDP.impl;

import LDP.Action;
import LDP.Activite;
import LDP.CallMethod;
import LDP.CreateObject;
import LDP.Debut;
import LDP.Fin;
import LDP.InitVariable;
import LDP.LDPFactory;
import LDP.LDPPackage;
import LDP.Processus;
import LDP.PseudoEtat;
import LDP.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LDPPackageImpl extends EPackageImpl implements LDPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudoEtatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callMethodEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see LDP.LDPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LDPPackageImpl() {
		super(eNS_URI, LDPFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LDPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LDPPackage init() {
		if (isInited) return (LDPPackage)EPackage.Registry.INSTANCE.getEPackage(LDPPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLDPPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LDPPackageImpl theLDPPackage = registeredLDPPackage instanceof LDPPackageImpl ? (LDPPackageImpl)registeredLDPPackage : new LDPPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLDPPackage.createPackageContents();

		// Initialize created meta-data
		theLDPPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLDPPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LDPPackage.eNS_URI, theLDPPackage);
		return theLDPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessus() {
		return processusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessus_Nom() {
		return (EAttribute)processusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_Activites() {
		return (EReference)processusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_Debut() {
		return (EReference)processusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_Fin() {
		return (EReference)processusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_ActiviteCourante() {
		return (EReference)processusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivite() {
		return activiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivite_Nom() {
		return (EAttribute)activiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivite_Precedente() {
		return (EReference)activiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivite_Suivante() {
		return (EReference)activiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivite_Actions() {
		return (EReference)activiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPseudoEtat() {
		return pseudoEtatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPseudoEtat_Reference() {
		return (EReference)pseudoEtatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDebut() {
		return debutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFin() {
		return finEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Nom() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitVariable() {
		return initVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitVariable_Variable() {
		return (EReference)initVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInitVariable_ValeurInit() {
		return (EAttribute)initVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateObject() {
		return createObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateObject_Classe() {
		return (EAttribute)createObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateObject_Variable() {
		return (EReference)createObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallMethod() {
		return callMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallMethod_NomMethode() {
		return (EAttribute)callMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallMethod_ObjetCible() {
		return (EReference)callMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallMethod_Parametres() {
		return (EReference)callMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallMethod_Resultat() {
		return (EReference)callMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LDPFactory getLDPFactory() {
		return (LDPFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		processusEClass = createEClass(PROCESSUS);
		createEAttribute(processusEClass, PROCESSUS__NOM);
		createEReference(processusEClass, PROCESSUS__ACTIVITES);
		createEReference(processusEClass, PROCESSUS__DEBUT);
		createEReference(processusEClass, PROCESSUS__FIN);
		createEReference(processusEClass, PROCESSUS__ACTIVITE_COURANTE);

		activiteEClass = createEClass(ACTIVITE);
		createEAttribute(activiteEClass, ACTIVITE__NOM);
		createEReference(activiteEClass, ACTIVITE__PRECEDENTE);
		createEReference(activiteEClass, ACTIVITE__SUIVANTE);
		createEReference(activiteEClass, ACTIVITE__ACTIONS);

		pseudoEtatEClass = createEClass(PSEUDO_ETAT);
		createEReference(pseudoEtatEClass, PSEUDO_ETAT__REFERENCE);

		debutEClass = createEClass(DEBUT);

		finEClass = createEClass(FIN);

		actionEClass = createEClass(ACTION);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NOM);
		createEAttribute(variableEClass, VARIABLE__TYPE);

		initVariableEClass = createEClass(INIT_VARIABLE);
		createEReference(initVariableEClass, INIT_VARIABLE__VARIABLE);
		createEAttribute(initVariableEClass, INIT_VARIABLE__VALEUR_INIT);

		createObjectEClass = createEClass(CREATE_OBJECT);
		createEAttribute(createObjectEClass, CREATE_OBJECT__CLASSE);
		createEReference(createObjectEClass, CREATE_OBJECT__VARIABLE);

		callMethodEClass = createEClass(CALL_METHOD);
		createEAttribute(callMethodEClass, CALL_METHOD__NOM_METHODE);
		createEReference(callMethodEClass, CALL_METHOD__OBJET_CIBLE);
		createEReference(callMethodEClass, CALL_METHOD__PARAMETRES);
		createEReference(callMethodEClass, CALL_METHOD__RESULTAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		debutEClass.getESuperTypes().add(this.getPseudoEtat());
		finEClass.getESuperTypes().add(this.getPseudoEtat());
		initVariableEClass.getESuperTypes().add(this.getAction());
		createObjectEClass.getESuperTypes().add(this.getAction());
		callMethodEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(processusEClass, Processus.class, "Processus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessus_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_Activites(), this.getActivite(), null, "activites", null, 0, -1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_Debut(), this.getDebut(), null, "debut", null, 1, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_Fin(), this.getFin(), null, "fin", null, 1, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_ActiviteCourante(), this.getActivite(), null, "activiteCourante", null, 0, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activiteEClass, Activite.class, "Activite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivite_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivite_Precedente(), this.getActivite(), this.getActivite_Suivante(), "precedente", null, 0, 1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivite_Suivante(), this.getActivite(), this.getActivite_Precedente(), "suivante", null, 0, 1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivite_Actions(), this.getAction(), null, "actions", null, 0, -1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pseudoEtatEClass, PseudoEtat.class, "PseudoEtat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPseudoEtat_Reference(), this.getActivite(), null, "reference", null, 1, 1, PseudoEtat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(debutEClass, Debut.class, "Debut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finEClass, Fin.class, "Fin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), ecorePackage.getEString(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initVariableEClass, InitVariable.class, "InitVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitVariable_Variable(), this.getVariable(), null, "variable", null, 1, 1, InitVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitVariable_ValeurInit(), ecorePackage.getEString(), "valeurInit", null, 0, 1, InitVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createObjectEClass, CreateObject.class, "CreateObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateObject_Classe(), ecorePackage.getEString(), "classe", null, 0, 1, CreateObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateObject_Variable(), this.getVariable(), null, "variable", null, 1, 1, CreateObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callMethodEClass, CallMethod.class, "CallMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallMethod_NomMethode(), ecorePackage.getEString(), "nomMethode", null, 0, 1, CallMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallMethod_ObjetCible(), this.getVariable(), null, "objetCible", null, 1, 1, CallMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallMethod_Parametres(), this.getVariable(), null, "parametres", null, 0, -1, CallMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallMethod_Resultat(), this.getVariable(), null, "resultat", null, 0, 1, CallMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LDPPackageImpl
