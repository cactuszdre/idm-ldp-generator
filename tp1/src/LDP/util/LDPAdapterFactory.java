/**
 */
package LDP.util;

import LDP.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see LDP.LDPPackage
 * @generated
 */
public class LDPAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LDPPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDPAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LDPPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LDPSwitch<Adapter> modelSwitch =
		new LDPSwitch<Adapter>() {
			@Override
			public Adapter caseProcessus(Processus object) {
				return createProcessusAdapter();
			}
			@Override
			public Adapter caseActivite(Activite object) {
				return createActiviteAdapter();
			}
			@Override
			public Adapter casePseudoEtat(PseudoEtat object) {
				return createPseudoEtatAdapter();
			}
			@Override
			public Adapter caseDebut(Debut object) {
				return createDebutAdapter();
			}
			@Override
			public Adapter caseFin(Fin object) {
				return createFinAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseInitVariable(InitVariable object) {
				return createInitVariableAdapter();
			}
			@Override
			public Adapter caseCreateObject(CreateObject object) {
				return createCreateObjectAdapter();
			}
			@Override
			public Adapter caseCallMethod(CallMethod object) {
				return createCallMethodAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link LDP.Processus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP.Processus
	 * @generated
	 */
	public Adapter createProcessusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP.Activite
	 * @generated
	 */
	public Adapter createActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP.PseudoEtat <em>Pseudo Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP.PseudoEtat
	 * @generated
	 */
	public Adapter createPseudoEtatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP.Debut
	 * @generated
	 */
	public Adapter createDebutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP.Fin
	 * @generated
	 */
	public Adapter createFinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP.InitVariable <em>Init Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP.InitVariable
	 * @generated
	 */
	public Adapter createInitVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP.CreateObject <em>Create Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP.CreateObject
	 * @generated
	 */
	public Adapter createCreateObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP.CallMethod <em>Call Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP.CallMethod
	 * @generated
	 */
	public Adapter createCallMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LDPAdapterFactory
