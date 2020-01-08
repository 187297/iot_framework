/**
 */
package com.pfc.iot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.Component#getRequiredport <em>Requiredport</em>}</li>
 *   <li>{@link com.pfc.iot.Component#getProvidedport <em>Providedport</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends Item {
	/**
	 * Returns the value of the '<em><b>Requiredport</b></em>' containment reference list.
	 * The list contents are of type {@link com.pfc.iot.RequiredPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredport</em>' containment reference list.
	 * @see com.pfc.iot.IotPackage#getComponent_Requiredport()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredPort> getRequiredport();

	/**
	 * Returns the value of the '<em><b>Providedport</b></em>' containment reference list.
	 * The list contents are of type {@link com.pfc.iot.ProvidedPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedport</em>' containment reference list.
	 * @see com.pfc.iot.IotPackage#getComponent_Providedport()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedPort> getProvidedport();

} // Component
