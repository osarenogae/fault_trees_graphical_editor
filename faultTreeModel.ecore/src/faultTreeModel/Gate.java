/**
 */
package faultTreeModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link faultTreeModel.Gate#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see faultTreeModel.FaultTreeModelPackage#getGate()
 * @model abstract="true"
 * @generated
 */
public interface Gate extends AndGate, OrGate, InhibitGate {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link faultTreeModel.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see faultTreeModel.FaultTreeModelPackage#getGate_Inputs()
	 * @model upper="2"
	 * @generated
	 */
	EList<Event> getInputs();

} // Gate
