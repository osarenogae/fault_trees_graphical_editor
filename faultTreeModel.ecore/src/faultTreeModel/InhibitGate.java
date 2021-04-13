/**
 */
package faultTreeModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inhibit Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link faultTreeModel.InhibitGate#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see faultTreeModel.FaultTreeModelPackage#getInhibitGate()
 * @model
 * @generated
 */
public interface InhibitGate extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(ConditionalEvent)
	 * @see faultTreeModel.FaultTreeModelPackage#getInhibitGate_Condition()
	 * @model
	 * @generated
	 */
	ConditionalEvent getCondition();

	/**
	 * Sets the value of the '{@link faultTreeModel.InhibitGate#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ConditionalEvent value);

} // InhibitGate
