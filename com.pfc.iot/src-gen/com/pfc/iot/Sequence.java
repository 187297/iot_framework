/**
 */
package com.pfc.iot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.Sequence#getRequiredport <em>Requiredport</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Controller {
	/**
	 * Returns the value of the '<em><b>Requiredport</b></em>' containment reference list.
	 * The list contents are of type {@link com.pfc.iot.RequiredPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredport</em>' containment reference list.
	 * @see com.pfc.iot.IotPackage#getSequence_Requiredport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RequiredPort> getRequiredport();

} // Sequence
