/**
 */
package faultTreeModel;

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
 * @see faultTreeModel.FaultTreeModelFactory
 * @model kind="package"
 * @generated
 */
public interface FaultTreeModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "faultTreeModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/faultTreeModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "faultTreeModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FaultTreeModelPackage eINSTANCE = faultTreeModel.impl.FaultTreeModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link faultTreeModel.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see faultTreeModel.impl.TreeImpl
	 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__GATES = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ROOT = 2;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link faultTreeModel.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see faultTreeModel.impl.IntermediateEventImpl
	 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getIntermediateEvent()
	 * @generated
	 */
	int INTERMEDIATE_EVENT = 3;

	/**
	 * The number of structural features of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link faultTreeModel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see faultTreeModel.impl.EventImpl
	 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = INTERMEDIATE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = INTERMEDIATE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CHILDREN = INTERMEDIATE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARENT = INTERMEDIATE_EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = INTERMEDIATE_EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = INTERMEDIATE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link faultTreeModel.impl.AndGateImpl <em>And Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see faultTreeModel.impl.AndGateImpl
	 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getAndGate()
	 * @generated
	 */
	int AND_GATE = 7;

	/**
	 * The number of structural features of the '<em>And Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>And Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_GATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link faultTreeModel.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see faultTreeModel.impl.GateImpl
	 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CONDITION = AND_GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__INPUTS = AND_GATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = AND_GATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = AND_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link faultTreeModel.impl.ExternalEventImpl <em>External Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see faultTreeModel.impl.ExternalEventImpl
	 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getExternalEvent()
	 * @generated
	 */
	int EXTERNAL_EVENT = 4;

	/**
	 * The number of structural features of the '<em>External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>External Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link faultTreeModel.impl.BasicEventImpl <em>Basic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see faultTreeModel.impl.BasicEventImpl
	 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getBasicEvent()
	 * @generated
	 */
	int BASIC_EVENT = 5;

	/**
	 * The number of structural features of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link faultTreeModel.impl.ConditionalEventImpl <em>Conditional Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see faultTreeModel.impl.ConditionalEventImpl
	 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getConditionalEvent()
	 * @generated
	 */
	int CONDITIONAL_EVENT = 6;

	/**
	 * The number of structural features of the '<em>Conditional Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Conditional Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link faultTreeModel.impl.OrGateImpl <em>Or Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see faultTreeModel.impl.OrGateImpl
	 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getOrGate()
	 * @generated
	 */
	int OR_GATE = 8;

	/**
	 * The number of structural features of the '<em>Or Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Or Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_GATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link faultTreeModel.impl.InhibitGateImpl <em>Inhibit Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see faultTreeModel.impl.InhibitGateImpl
	 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getInhibitGate()
	 * @generated
	 */
	int INHIBIT_GATE = 9;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_GATE__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Inhibit Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_GATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inhibit Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBIT_GATE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link faultTreeModel.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see faultTreeModel.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for the containment reference list '{@link faultTreeModel.Tree#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see faultTreeModel.Tree#getEvents()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link faultTreeModel.Tree#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see faultTreeModel.Tree#getGates()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_Gates();

	/**
	 * Returns the meta object for the reference '{@link faultTreeModel.Tree#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see faultTreeModel.Tree#getRoot()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_Root();

	/**
	 * Returns the meta object for class '{@link faultTreeModel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see faultTreeModel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link faultTreeModel.Event#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see faultTreeModel.Event#getID()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_ID();

	/**
	 * Returns the meta object for the attribute '{@link faultTreeModel.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see faultTreeModel.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for the reference list '{@link faultTreeModel.Event#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see faultTreeModel.Event#getChildren()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Children();

	/**
	 * Returns the meta object for the reference '{@link faultTreeModel.Event#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see faultTreeModel.Event#getParent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Parent();

	/**
	 * Returns the meta object for class '{@link faultTreeModel.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see faultTreeModel.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the reference list '{@link faultTreeModel.Gate#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see faultTreeModel.Gate#getInputs()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Inputs();

	/**
	 * Returns the meta object for class '{@link faultTreeModel.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Event</em>'.
	 * @see faultTreeModel.IntermediateEvent
	 * @generated
	 */
	EClass getIntermediateEvent();

	/**
	 * Returns the meta object for class '{@link faultTreeModel.ExternalEvent <em>External Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Event</em>'.
	 * @see faultTreeModel.ExternalEvent
	 * @generated
	 */
	EClass getExternalEvent();

	/**
	 * Returns the meta object for class '{@link faultTreeModel.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Event</em>'.
	 * @see faultTreeModel.BasicEvent
	 * @generated
	 */
	EClass getBasicEvent();

	/**
	 * Returns the meta object for class '{@link faultTreeModel.ConditionalEvent <em>Conditional Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Event</em>'.
	 * @see faultTreeModel.ConditionalEvent
	 * @generated
	 */
	EClass getConditionalEvent();

	/**
	 * Returns the meta object for class '{@link faultTreeModel.AndGate <em>And Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Gate</em>'.
	 * @see faultTreeModel.AndGate
	 * @generated
	 */
	EClass getAndGate();

	/**
	 * Returns the meta object for class '{@link faultTreeModel.OrGate <em>Or Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Gate</em>'.
	 * @see faultTreeModel.OrGate
	 * @generated
	 */
	EClass getOrGate();

	/**
	 * Returns the meta object for class '{@link faultTreeModel.InhibitGate <em>Inhibit Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inhibit Gate</em>'.
	 * @see faultTreeModel.InhibitGate
	 * @generated
	 */
	EClass getInhibitGate();

	/**
	 * Returns the meta object for the reference '{@link faultTreeModel.InhibitGate#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see faultTreeModel.InhibitGate#getCondition()
	 * @see #getInhibitGate()
	 * @generated
	 */
	EReference getInhibitGate_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FaultTreeModelFactory getFaultTreeModelFactory();

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
		 * The meta object literal for the '{@link faultTreeModel.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see faultTreeModel.impl.TreeImpl
		 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__EVENTS = eINSTANCE.getTree_Events();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__GATES = eINSTANCE.getTree_Gates();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__ROOT = eINSTANCE.getTree_Root();

		/**
		 * The meta object literal for the '{@link faultTreeModel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see faultTreeModel.impl.EventImpl
		 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ID = eINSTANCE.getEvent_ID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CHILDREN = eINSTANCE.getEvent_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PARENT = eINSTANCE.getEvent_Parent();

		/**
		 * The meta object literal for the '{@link faultTreeModel.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see faultTreeModel.impl.GateImpl
		 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__INPUTS = eINSTANCE.getGate_Inputs();

		/**
		 * The meta object literal for the '{@link faultTreeModel.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see faultTreeModel.impl.IntermediateEventImpl
		 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getIntermediateEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_EVENT = eINSTANCE.getIntermediateEvent();

		/**
		 * The meta object literal for the '{@link faultTreeModel.impl.ExternalEventImpl <em>External Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see faultTreeModel.impl.ExternalEventImpl
		 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getExternalEvent()
		 * @generated
		 */
		EClass EXTERNAL_EVENT = eINSTANCE.getExternalEvent();

		/**
		 * The meta object literal for the '{@link faultTreeModel.impl.BasicEventImpl <em>Basic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see faultTreeModel.impl.BasicEventImpl
		 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getBasicEvent()
		 * @generated
		 */
		EClass BASIC_EVENT = eINSTANCE.getBasicEvent();

		/**
		 * The meta object literal for the '{@link faultTreeModel.impl.ConditionalEventImpl <em>Conditional Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see faultTreeModel.impl.ConditionalEventImpl
		 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getConditionalEvent()
		 * @generated
		 */
		EClass CONDITIONAL_EVENT = eINSTANCE.getConditionalEvent();

		/**
		 * The meta object literal for the '{@link faultTreeModel.impl.AndGateImpl <em>And Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see faultTreeModel.impl.AndGateImpl
		 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getAndGate()
		 * @generated
		 */
		EClass AND_GATE = eINSTANCE.getAndGate();

		/**
		 * The meta object literal for the '{@link faultTreeModel.impl.OrGateImpl <em>Or Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see faultTreeModel.impl.OrGateImpl
		 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getOrGate()
		 * @generated
		 */
		EClass OR_GATE = eINSTANCE.getOrGate();

		/**
		 * The meta object literal for the '{@link faultTreeModel.impl.InhibitGateImpl <em>Inhibit Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see faultTreeModel.impl.InhibitGateImpl
		 * @see faultTreeModel.impl.FaultTreeModelPackageImpl#getInhibitGate()
		 * @generated
		 */
		EClass INHIBIT_GATE = eINSTANCE.getInhibitGate();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHIBIT_GATE__CONDITION = eINSTANCE.getInhibitGate_Condition();

	}

} //FaultTreeModelPackage
