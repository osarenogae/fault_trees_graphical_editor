/**
 */
package faultTreeModel.impl;

import faultTreeModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FaultTreeModelFactoryImpl extends EFactoryImpl implements FaultTreeModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FaultTreeModelFactory init() {
		try {
			FaultTreeModelFactory theFaultTreeModelFactory = (FaultTreeModelFactory)EPackage.Registry.INSTANCE.getEFactory(FaultTreeModelPackage.eNS_URI);
			if (theFaultTreeModelFactory != null) {
				return theFaultTreeModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FaultTreeModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTreeModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FaultTreeModelPackage.TREE: return createTree();
			case FaultTreeModelPackage.INTERMEDIATE_EVENT: return createIntermediateEvent();
			case FaultTreeModelPackage.EXTERNAL_EVENT: return createExternalEvent();
			case FaultTreeModelPackage.BASIC_EVENT: return createBasicEvent();
			case FaultTreeModelPackage.CONDITIONAL_EVENT: return createConditionalEvent();
			case FaultTreeModelPackage.AND_GATE: return createAndGate();
			case FaultTreeModelPackage.OR_GATE: return createOrGate();
			case FaultTreeModelPackage.INHIBIT_GATE: return createInhibitGate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEvent createIntermediateEvent() {
		IntermediateEventImpl intermediateEvent = new IntermediateEventImpl();
		return intermediateEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalEvent createExternalEvent() {
		ExternalEventImpl externalEvent = new ExternalEventImpl();
		return externalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEvent createBasicEvent() {
		BasicEventImpl basicEvent = new BasicEventImpl();
		return basicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalEvent createConditionalEvent() {
		ConditionalEventImpl conditionalEvent = new ConditionalEventImpl();
		return conditionalEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndGate createAndGate() {
		AndGateImpl andGate = new AndGateImpl();
		return andGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrGate createOrGate() {
		OrGateImpl orGate = new OrGateImpl();
		return orGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InhibitGate createInhibitGate() {
		InhibitGateImpl inhibitGate = new InhibitGateImpl();
		return inhibitGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTreeModelPackage getFaultTreeModelPackage() {
		return (FaultTreeModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FaultTreeModelPackage getPackage() {
		return FaultTreeModelPackage.eINSTANCE;
	}

} //FaultTreeModelFactoryImpl
