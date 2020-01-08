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
import com.pfc.iot.Actuator;
import com.pfc.iot.IotPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Actuator</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.ActuatorImpl#isToggle <em>Toggle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends HardwareImpl implements Actuator {

	/**
	 * The default value of the '{@link #isToggle() <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToggle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOGGLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isToggle() <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToggle()
	 * @generated
	 * @ordered
	 */
	protected boolean toggle = TOGGLE_EDEFAULT;

	@Override
	public Object invoke() {
		return (this.toggle) ? this.toggle() : this.getStatus();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isToggle() {
		return toggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToggle(boolean newToggle) {
		boolean oldToggle = toggle;
		toggle = newToggle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.ACTUATOR__TOGGLE, oldToggle, toggle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean getStatus() {
		StringBuilder output = new StringBuilder();
		boolean status = false;
		try {
			Process process = null;
			String script = "python actuator.py -i -p " + this.pinNumber;
			if (this.mode) {
				script = script.concat(" -m 1");
			}
			process = Runtime.getRuntime().exec(script);

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				output.append(line);
				//				System.out.println(line);
			}

			BufferedReader errReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String errLine;
			while ((errLine = errReader.readLine()) != null) {
				output.append(errLine);
				//				System.out.println(errLine);
			}

			int exitVal = process.waitFor();
			if (exitVal != 0) {
				output.append("Run Failed! Process terminated with exit code " + exitVal);
			}

			status = Integer.parseInt(output.toString()) == 1 ? true : false;
			System.out.println("Actuator " + this.name + " pin " + this.pinNumber + " : " + output);

		} catch (Exception e) {
			output.append("Run Failed!\n");
			e.printStackTrace();
			System.out.println(output);
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object switchOnOff(Object onOff) {
		StringBuilder output = new StringBuilder();
		try {
			Process process = null;
			String script = "python actuator.py -p " + this.pinNumber;
			if (this.mode) {
				script = script.concat(" -m 1");
			}
			if (Boolean.parseBoolean((String) onOff)) {
				script = script.concat(" -s 1");
			} else {
				script = script.concat(" -s 0");
			}
//			System.out.println(script);
			process = Runtime.getRuntime().exec(script);

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				output.append(line);
				//				System.out.println(line);
			}

			BufferedReader errReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String errLine;
			while ((errLine = errReader.readLine()) != null) {
				output.append(errLine);
				//				System.out.println(errLine);
			}

			int exitVal = process.waitFor();
			if (exitVal != 0) {
				output.append("Run Failed! Process terminated with exit code " + exitVal);
			}

		} catch (Exception e) {
			output.append("Run Failed!\n");
			e.printStackTrace();
			System.out.println(output);
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
		case IotPackage.ACTUATOR__TOGGLE:
			return isToggle();
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
		case IotPackage.ACTUATOR__TOGGLE:
			setToggle((Boolean) newValue);
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
		case IotPackage.ACTUATOR__TOGGLE:
			setToggle(TOGGLE_EDEFAULT);
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
		case IotPackage.ACTUATOR__TOGGLE:
			return toggle != TOGGLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object toggle() {
		StringBuilder output = new StringBuilder();
		try {
			Process process = null;
			String script = "python actuator.py -p " + this.pinNumber;
			if (this.mode) {
				script = script.concat(" -m 1");
			}
			if (this.timeInterval != 0) {
				script = script.concat(" -t ").concat(String.valueOf(this.timeInterval));
			}

			process = Runtime.getRuntime().exec(script);

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line;
			while ((line = reader.readLine()) != null) {
				output.append(line);
				System.out.println(line);
			}

			BufferedReader errReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String errLine;
			while ((errLine = errReader.readLine()) != null) {
				output.append(errLine);
				System.out.println(errLine);
			}

			int exitVal = process.waitFor();
			if (exitVal == 0) {
				output.insert(0, "Run Complete!\n");
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case IotPackage.ACTUATOR___TOGGLE:
			return toggle();
		case IotPackage.ACTUATOR___GET_STATUS:
			return getStatus();
		case IotPackage.ACTUATOR___SWITCH_ON_OFF__OBJECT:
			return switchOnOff(arguments.get(0));
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
		result.append(" (toggle: ");
		result.append(toggle);
		result.append(')');
		return result.toString();
	}

} // ActuatorImpl
