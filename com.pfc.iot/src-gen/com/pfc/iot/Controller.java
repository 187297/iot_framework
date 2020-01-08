/**
 */
package com.pfc.iot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.Controller#getProvidedport <em>Providedport</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getController()
 * @model abstract="true"
 * @generated
 */
public interface Controller extends Item {
	/**
	 * Returns the value of the '<em><b>Providedport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providedport</em>' containment reference.
	 * @see #setProvidedport(ProvidedPort)
	 * @see com.pfc.iot.IotPackage#getController_Providedport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProvidedPort getProvidedport();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Controller#getProvidedport <em>Providedport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Providedport</em>' containment reference.
	 * @see #getProvidedport()
	 * @generated
	 */
	void setProvidedport(ProvidedPort value);

} // Controller
