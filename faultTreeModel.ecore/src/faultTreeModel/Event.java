/**
 */
package faultTreeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link faultTreeModel.Event#getID <em>ID</em>}</li>
 *   <li>{@link faultTreeModel.Event#getDescription <em>Description</em>}</li>
 *   <li>{@link faultTreeModel.Event#getChildren <em>Children</em>}</li>
 *   <li>{@link faultTreeModel.Event#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see faultTreeModel.FaultTreeModelPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends IntermediateEvent, ExternalEvent, BasicEvent, ConditionalEvent {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see faultTreeModel.FaultTreeModelPackage#getEvent_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link faultTreeModel.Event#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see faultTreeModel.FaultTreeModelPackage#getEvent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link faultTreeModel.Event#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link faultTreeModel.Event}.
	 * It is bidirectional and its opposite is '{@link faultTreeModel.Event#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see faultTreeModel.FaultTreeModelPackage#getEvent_Children()
	 * @see faultTreeModel.Event#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Event> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link faultTreeModel.Event#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Event)
	 * @see faultTreeModel.FaultTreeModelPackage#getEvent_Parent()
	 * @see faultTreeModel.Event#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	Event getParent();

	/**
	 * Sets the value of the '{@link faultTreeModel.Event#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Event value);

} // Event
