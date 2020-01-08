/**
 */
package com.pfc.iot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.Iteration#getRequiredport <em>Requiredport</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getIteration()
 * @model abstract="true"
 * @generated
 */
public interface Iteration extends Controller {
	/**
	 * Returns the value of the '<em><b>Requiredport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requiredport</em>' containment reference.
	 * @see #setRequiredport(RequiredPort)
	 * @see com.pfc.iot.IotPackage#getIteration_Requiredport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RequiredPort getRequiredport();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Iteration#getRequiredport <em>Requiredport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requiredport</em>' containment reference.
	 * @see #getRequiredport()
	 * @generated
	 */
	void setRequiredport(RequiredPort value);

} // Iteration
