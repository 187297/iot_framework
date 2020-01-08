/**
 */
package com.pfc.iot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.RequiredPort#getName <em>Name</em>}</li>
 *   <li>{@link com.pfc.iot.RequiredPort#getUse <em>Use</em>}</li>
 *   <li>{@link com.pfc.iot.RequiredPort#getUUID <em>UUID</em>}</li>
 *   <li>{@link com.pfc.iot.RequiredPort#getMethod <em>Method</em>}</li>
 *   <li>{@link com.pfc.iot.RequiredPort#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getRequiredPort()
 * @model
 * @generated
 */
public interface RequiredPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.pfc.iot.IotPackage#getRequiredPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.pfc.iot.RequiredPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference.
	 * @see #setUse(ProvidedPort)
	 * @see com.pfc.iot.IotPackage#getRequiredPort_Use()
	 * @model
	 * @generated
	 */
	ProvidedPort getUse();

	/**
	 * Sets the value of the '{@link com.pfc.iot.RequiredPort#getUse <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(ProvidedPort value);

	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see com.pfc.iot.IotPackage#getRequiredPort_UUID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link com.pfc.iot.RequiredPort#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The default value is <code>"invoke"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see com.pfc.iot.IotPackage#getRequiredPort_Method()
	 * @model default="invoke"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link com.pfc.iot.RequiredPort#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see com.pfc.iot.IotPackage#getRequiredPort_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link com.pfc.iot.RequiredPort#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object invoke(String method);

} // RequiredPort
