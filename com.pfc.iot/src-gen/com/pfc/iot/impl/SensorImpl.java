/**
 */
package com.pfc.iot.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.pfc.iot.IotPackage;
import com.pfc.iot.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.SensorImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends HardwareImpl implements Sensor {

	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected String script = SCRIPT_EDEFAULT;

	@Override
	public Object invoke() {
		return this.getData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(String newScript) {
		String oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.SENSOR__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getData() {
		StringBuilder output = new StringBuilder();
		try {
			Process process = null;
			String script = "python sensor.py";
			if (this.script != null && this.script != "") {
				script = this.script;
			}
			script = script.concat(" -p " + this.pinNumber);
			if (this.mode) {
				script = script.concat(" -m 1");
			}
			if (this.timeInterval != 0) {
				script = script.concat(" -t ").concat(String.valueOf(this.timeInterval));
			}
//			System.out.println(script);

			process = Runtime.getRuntime().exec(script);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			BufferedReader errReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				output.append(line);
				System.out.println("Sensor " + this.name + " pin " + this.pinNumber + " : " + line);
			}

			String errLine;
			if ((errLine = errReader.readLine()) != null) {
				output.append("Run Failed!\n");
				System.out.println("Run Failed!\n");
			}
			while ((errLine = errReader.readLine()) != null) {
				output.append(errLine + "\n");
				System.out.println(errLine);
			}

			int exitVal = process.waitFor();
			if (exitVal != 0) {
				output.append("Run Failed!\n");
			}

		} catch (IOException e) {
			output.append("Run Failed!\n");
			output.append(e.getLocalizedMessage());
		} catch (InterruptedException e) {
			output.append("Run Complete!\n");
			output.append(e.getLocalizedMessage());
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IotPackage.SENSOR__SCRIPT:
			return getScript();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IotPackage.SENSOR__SCRIPT:
			setScript((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case IotPackage.SENSOR__SCRIPT:
			setScript(SCRIPT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case IotPackage.SENSOR__SCRIPT:
			return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case IotPackage.SENSOR___GET_DATA:
			return getData();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (script: ");
		result.append(script);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
