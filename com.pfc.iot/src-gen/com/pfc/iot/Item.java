/**
 */
package com.pfc.iot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.Item#getName <em>Name</em>}</li>
 *   <li>{@link com.pfc.iot.Item#getUUID <em>UUID</em>}</li>
 *   <li>{@link com.pfc.iot.Item#isNewThread <em>New Thread</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.pfc.iot.IotPackage#getItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see com.pfc.iot.IotPackage#getItem_UUID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Item#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

	/**
	 * Returns the value of the '<em><b>New Thread</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Thread</em>' attribute.
	 * @see #setNewThread(boolean)
	 * @see com.pfc.iot.IotPackage#getItem_NewThread()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNewThread();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Item#isNewThread <em>New Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Thread</em>' attribute.
	 * @see #isNewThread()
	 * @generated
	 */
	void setNewThread(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object invoke();

} // Item
