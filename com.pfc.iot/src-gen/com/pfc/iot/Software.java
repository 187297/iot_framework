/**
 */
package com.pfc.iot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.Software#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getSoftware()
 * @model
 * @generated
 */
public interface Software extends Component {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link com.pfc.iot.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see com.pfc.iot.IotPackage#getSoftware_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItem();

} // Software
