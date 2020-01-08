/**
 */
package com.pfc.iot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.CounterLoop#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getCounterLoop()
 * @model
 * @generated
 */
public interface CounterLoop extends Iteration {
	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(int)
	 * @see com.pfc.iot.IotPackage#getCounterLoop_Counter()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getCounter();

	/**
	 * Sets the value of the '{@link com.pfc.iot.CounterLoop#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int value);

} // CounterLoop
