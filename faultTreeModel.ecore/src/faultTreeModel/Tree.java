/**
 */
package faultTreeModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link faultTreeModel.Tree#getEvents <em>Events</em>}</li>
 *   <li>{@link faultTreeModel.Tree#getGates <em>Gates</em>}</li>
 *   <li>{@link faultTreeModel.Tree#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see faultTreeModel.FaultTreeModelPackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link faultTreeModel.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see faultTreeModel.FaultTreeModelPackage#getTree_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link faultTreeModel.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see faultTreeModel.FaultTreeModelPackage#getTree_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getGates();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(IntermediateEvent)
	 * @see faultTreeModel.FaultTreeModelPackage#getTree_Root()
	 * @model
	 * @generated
	 */
	IntermediateEvent getRoot();

	/**
	 * Sets the value of the '{@link faultTreeModel.Tree#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(IntermediateEvent value);

} // Tree
