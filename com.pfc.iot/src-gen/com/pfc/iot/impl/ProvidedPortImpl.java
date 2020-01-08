/**
 */
package com.pfc.iot.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.pfc.iot.IotPackage;
import com.pfc.iot.Item;
import com.pfc.iot.ProvidedPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.ProvidedPortImpl#getUUID <em>UUID</em>}</li>
 *   <li>{@link com.pfc.iot.impl.ProvidedPortImpl#getReferto <em>Referto</em>}</li>
 *   <li>{@link com.pfc.iot.impl.ProvidedPortImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedPortImpl extends MinimalEObjectImpl.Container implements ProvidedPort {
	/**
	 * The default value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferto() <em>Referto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferto()
	 * @generated
	 * @ordered
	 */
	protected Item referto;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.PROVIDED_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUUID() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUUID(String newUUID) {
		String oldUUID = uuid;
		uuid = newUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.PROVIDED_PORT__UUID, oldUUID, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Item getReferto() {
		if (referto != null && referto.eIsProxy()) {
			InternalEObject oldReferto = (InternalEObject) referto;
			referto = (Item) eResolveProxy(oldReferto);
			if (referto != oldReferto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotPackage.PROVIDED_PORT__REFERTO,
							oldReferto, referto));
			}
		}
		return referto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetReferto() {
		return referto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferto(Item newReferto) {
		Item oldReferto = referto;
		referto = newReferto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.PROVIDED_PORT__REFERTO, oldReferto,
					referto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.PROVIDED_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object invoke(String method, Object args) {
		Class itemClass = this.referto.getClass();
		Method[] methods = itemClass.getMethods();
		Object result = null;
		for (Method m : methods) {
			if (m.getName().equals(method)) {
				try {
					result = m.invoke(this.referto, (Object[]) args);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object invoke(String method) {
		Class itemClass = this.referto.getClass();
		Method[] methods = itemClass.getMethods();
		Object result = null;
		for (Method m : methods) {
			if (m.getName().equals(method)) {
				try {
					result = m.invoke(this.referto);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IotPackage.PROVIDED_PORT__UUID:
			return getUUID();
		case IotPackage.PROVIDED_PORT__REFERTO:
			if (resolve)
				return getReferto();
			return basicGetReferto();
		case IotPackage.PROVIDED_PORT__NAME:
			return getName();
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
		case IotPackage.PROVIDED_PORT__UUID:
			setUUID((String) newValue);
			return;
		case IotPackage.PROVIDED_PORT__REFERTO:
			setReferto((Item) newValue);
			return;
		case IotPackage.PROVIDED_PORT__NAME:
			setName((String) newValue);
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
		case IotPackage.PROVIDED_PORT__UUID:
			setUUID(UUID_EDEFAULT);
			return;
		case IotPackage.PROVIDED_PORT__REFERTO:
			setReferto((Item) null);
			return;
		case IotPackage.PROVIDED_PORT__NAME:
			setName(NAME_EDEFAULT);
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
		case IotPackage.PROVIDED_PORT__UUID:
			return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		case IotPackage.PROVIDED_PORT__REFERTO:
			return referto != null;
		case IotPackage.PROVIDED_PORT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		case IotPackage.PROVIDED_PORT___INVOKE__STRING_OBJECT:
			return invoke((String) arguments.get(0), arguments.get(1));
		case IotPackage.PROVIDED_PORT___INVOKE__STRING:
			return invoke((String) arguments.get(0));
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
		result.append(" (UUID: ");
		result.append(uuid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProvidedPortImpl
