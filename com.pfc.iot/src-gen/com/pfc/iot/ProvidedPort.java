/**
 */
package com.pfc.iot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.ProvidedPort#getUUID <em>UUID</em>}</li>
 *   <li>{@link com.pfc.iot.ProvidedPort#getReferto <em>Referto</em>}</li>
 *   <li>{@link com.pfc.iot.ProvidedPort#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getProvidedPort()
 * @model
 * @generated
 */
public interface ProvidedPort extends EObject {
	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see com.pfc.iot.IotPackage#getProvidedPort_UUID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link com.pfc.iot.ProvidedPort#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

	/**
	 * Returns the value of the '<em><b>Referto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referto</em>' reference.
	 * @see #setReferto(Item)
	 * @see com.pfc.iot.IotPackage#getProvidedPort_Referto()
	 * @model required="true"
	 * @generated
	 */
	Item getReferto();

	/**
	 * Sets the value of the '{@link com.pfc.iot.ProvidedPort#getReferto <em>Referto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referto</em>' reference.
	 * @see #getReferto()
	 * @generated
	 */
	void setReferto(Item value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.pfc.iot.IotPackage#getProvidedPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.pfc.iot.ProvidedPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true" argsDataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 * @generated
	 */
	Object invoke(String method, Object args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object invoke(String method);

} // ProvidedPort
