/**
 */
package com.pfc.iot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.Branching#getIfport <em>Ifport</em>}</li>
 *   <li>{@link com.pfc.iot.Branching#getThenport <em>Thenport</em>}</li>
 *   <li>{@link com.pfc.iot.Branching#getElseport <em>Elseport</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getBranching()
 * @model
 * @generated
 */
public interface Branching extends Controller {
	/**
	 * Returns the value of the '<em><b>Ifport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifport</em>' containment reference.
	 * @see #setIfport(IfPort)
	 * @see com.pfc.iot.IotPackage#getBranching_Ifport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfPort getIfport();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Branching#getIfport <em>Ifport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifport</em>' containment reference.
	 * @see #getIfport()
	 * @generated
	 */
	void setIfport(IfPort value);

	/**
	 * Returns the value of the '<em><b>Thenport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thenport</em>' containment reference.
	 * @see #setThenport(ThenPort)
	 * @see com.pfc.iot.IotPackage#getBranching_Thenport()
	 * @model containment="true"
	 * @generated
	 */
	ThenPort getThenport();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Branching#getThenport <em>Thenport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thenport</em>' containment reference.
	 * @see #getThenport()
	 * @generated
	 */
	void setThenport(ThenPort value);

	/**
	 * Returns the value of the '<em><b>Elseport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseport</em>' containment reference.
	 * @see #setElseport(ElsePort)
	 * @see com.pfc.iot.IotPackage#getBranching_Elseport()
	 * @model containment="true"
	 * @generated
	 */
	ElsePort getElseport();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Branching#getElseport <em>Elseport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elseport</em>' containment reference.
	 * @see #getElseport()
	 * @generated
	 */
	void setElseport(ElsePort value);

} // Branching
