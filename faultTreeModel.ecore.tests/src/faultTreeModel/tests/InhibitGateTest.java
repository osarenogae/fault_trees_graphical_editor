/**
 */
package faultTreeModel.tests;

import faultTreeModel.FaultTreeModelFactory;
import faultTreeModel.InhibitGate;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inhibit Gate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InhibitGateTest extends TestCase {

	/**
	 * The fixture for this Inhibit Gate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InhibitGate fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InhibitGateTest.class);
	}

	/**
	 * Constructs a new Inhibit Gate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InhibitGateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Inhibit Gate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InhibitGate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Inhibit Gate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InhibitGate getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FaultTreeModelFactory.eINSTANCE.createInhibitGate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InhibitGateTest
