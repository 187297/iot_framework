/**
 */
package com.pfc.iot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterative Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.IterativeLoop#getVar <em>Var</em>}</li>
 *   <li>{@link com.pfc.iot.IterativeLoop#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.pfc.iot.IterativeLoop#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getIterativeLoop()
 * @model
 * @generated
 */
public interface IterativeLoop extends Iteration {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute.
	 * @see #setVar(Object)
	 * @see com.pfc.iot.IotPackage#getIterativeLoop_Var()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object getVar();

	/**
	 * Sets the value of the '{@link com.pfc.iot.IterativeLoop#getVar <em>Var</em>}' attribute.
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
	 * @see com.pfc.iot.IotPackage#getIterativeLoop_Operator()
	 * @model default="EQ" required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link com.pfc.iot.IterativeLoop#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.pfc.iot.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ConditionPort)
	 * @see com.pfc.iot.IotPackage#getIterativeLoop_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionPort getCondition();

	/**
	 * Sets the value of the '{@link com.pfc.iot.IterativeLoop#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ConditionPort value);

} // IterativeLoop
