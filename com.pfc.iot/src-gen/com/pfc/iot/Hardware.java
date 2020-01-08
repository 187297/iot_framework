/**
 */
package com.pfc.iot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.Hardware#getType <em>Type</em>}</li>
 *   <li>{@link com.pfc.iot.Hardware#getPinNumber <em>Pin Number</em>}</li>
 *   <li>{@link com.pfc.iot.Hardware#isMode <em>Mode</em>}</li>
 *   <li>{@link com.pfc.iot.Hardware#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getHardware()
 * @model abstract="true"
 * @generated
 */
public interface Hardware extends Component {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.pfc.iot.IotPackage#getHardware_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Hardware#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Number</em>' attribute.
	 * @see #setPinNumber(int)
	 * @see com.pfc.iot.IotPackage#getHardware_PinNumber()
	 * @model required="true"
	 * @generated
	 */
	int getPinNumber();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Hardware#getPinNumber <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Number</em>' attribute.
	 * @see #getPinNumber()
	 * @generated
	 */
	void setPinNumber(int value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(boolean)
	 * @see com.pfc.iot.IotPackage#getHardware_Mode()
	 * @model required="true"
	 * @generated
	 */
	boolean isMode();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Hardware#isMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #isMode()
	 * @generated
	 */
	void setMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(int)
	 * @see com.pfc.iot.IotPackage#getHardware_TimeInterval()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getTimeInterval();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Hardware#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(int value);

} // Hardware
