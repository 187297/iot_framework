/**
 */
package com.pfc.iot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snippet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.Snippet#getScriptPath <em>Script Path</em>}</li>
 * </ul>
 *
 * @see com.pfc.iot.IotPackage#getSnippet()
 * @model
 * @generated
 */
public interface Snippet extends Component {
	/**
	 * Returns the value of the '<em><b>Script Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Path</em>' attribute.
	 * @see #setScriptPath(String)
	 * @see com.pfc.iot.IotPackage#getSnippet_ScriptPath()
	 * @model required="true"
	 * @generated
	 */
	String getScriptPath();

	/**
	 * Sets the value of the '{@link com.pfc.iot.Snippet#getScriptPath <em>Script Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Path</em>' attribute.
	 * @see #getScriptPath()
	 * @generated
	 */
	void setScriptPath(String value);

} // Snippet
