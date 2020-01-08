/**
 */
package com.pfc.iot.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.pfc.iot.IotPackage;
import com.pfc.iot.Snippet;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Snippet</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.SnippetImpl#getScriptPath <em>Script Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SnippetImpl extends ComponentImpl implements Snippet {

	@Override
	public Object invoke() {
		StringBuilder output = new StringBuilder();
		try {
			if (this.scriptPath.endsWith(".py") && !this.scriptPath.startsWith("python ")) {
				this.scriptPath = "python " + this.scriptPath;
			} else if (this.scriptPath.endsWith(".php") && !this.scriptPath.startsWith("php ")) {
				this.scriptPath = "php " + this.scriptPath;
			}

			Process process = Runtime.getRuntime().exec(this.scriptPath);

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			BufferedReader errReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
				System.out.println(line);
			}

			String errLine;
			//			if ((errLine = errReader.readLine()) != null) {
			//				output.append("Run Failed!\n");
			//			}
			while ((errLine = errReader.readLine()) != null) {
				output.append(errLine + "\n");
				System.out.println(errLine);
			}

			int exitVal = process.waitFor();
			if (exitVal == 0) {
				//				output.insert(0, "Run Complete!\n");
			} else {
				output.append("Run Failed!");
			}

		} catch (IOException | InterruptedException e) {
			output.append("Run Failed!\n");
			output.append(e.getLocalizedMessage());
		}
		return output;
	}

	/**
	 * The default value of the '{@link #getScriptPath() <em>Script Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScriptPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptPath() <em>Script Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScriptPath()
	 * @generated
	 * @ordered
	 */
	protected String scriptPath = SCRIPT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SnippetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.SNIPPET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptPath() {
		return scriptPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptPath(String newScriptPath) {
		String oldScriptPath = scriptPath;
		scriptPath = newScriptPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.SNIPPET__SCRIPT_PATH, oldScriptPath,
					scriptPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IotPackage.SNIPPET__SCRIPT_PATH:
			return getScriptPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IotPackage.SNIPPET__SCRIPT_PATH:
			setScriptPath((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case IotPackage.SNIPPET__SCRIPT_PATH:
			setScriptPath(SCRIPT_PATH_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case IotPackage.SNIPPET__SCRIPT_PATH:
			return SCRIPT_PATH_EDEFAULT == null ? scriptPath != null : !SCRIPT_PATH_EDEFAULT.equals(scriptPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (scriptPath: ");
		result.append(scriptPath);
		result.append(')');
		return result.toString();
	}

} // SnippetImpl
