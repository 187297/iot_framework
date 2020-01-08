/**
 */
package com.pfc.iot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.Actuator#isToggle <em>Toggle</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Hardware {
	/**
	 * Returns the value of the '<em><b>Toggle</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggle</em>' attribute.
	 * @see #setToggle(boolean)
	 * @see com.pfc.iot.IotPackage#getActuator_Toggle()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isToggle();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Actuator#isToggle <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toggle</em>' attribute.
	 * @see #isToggle()
	 * @generated
	 */
	void setToggle(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object toggle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean getStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" onOffDataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object switchOnOff(Object onOff);

} // Actuator
