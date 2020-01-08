/**
 */
package com.pfc.iot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.IfPort#isCondition <em>Condition</em>}</li>
 *   <li>{@link com.pfc.iot.IfPort#getVar <em>Var</em>}</li>
 *   <li>{@link com.pfc.iot.IfPort#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getIfPort()
 * @model
 * @generated
 */
public interface IfPort extends RequiredPort {

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #setCondition(boolean)
	 * @see com.pfc.iot.IotPackage#getIfPort_Condition()
	 * @model default="false" unsettable="true" required="true" transient="true" derived="true"
	 * @generated
	 */
	boolean isCondition();

	/**
	 * Sets the value of the '{@link com.pfc.iot.IfPort#isCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #isCondition()
	 * @generated
	 */
	void setCondition(boolean value);

	/**
	 * Unsets the value of the '{@link com.pfc.iot.IfPort#isCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCondition()
	 * @see #isCondition()
	 * @see #setCondition(boolean)
	 * @generated
	 */
	void unsetCondition();

	/**
	 * Returns whether the value of the '{@link com.pfc.iot.IfPort#isCondition <em>Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition</em>' attribute is set.
	 * @see #unsetCondition()
	 * @see #isCondition()
	 * @see #setCondition(boolean)
	 * @generated
	 */
	boolean isSetCondition();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute.
	 * @see #setVar(Object)
	 * @see com.pfc.iot.IotPackage#getIfPort_Var()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object getVar();

	/**
	 * Sets the value of the '{@link com.pfc.iot.IfPort#getVar <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' attribute.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(Object value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"EQ"</code>.
	 * The literals are from the enumeration {@link com.pfc.iot.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.pfc.iot.Operator
	 * @see #setOperator(Operator)
	 * @see com.pfc.iot.IotPackage#getIfPort_Operator()
	 * @model default="EQ" required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link com.pfc.iot.IfPort#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.pfc.iot.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // IfPort
