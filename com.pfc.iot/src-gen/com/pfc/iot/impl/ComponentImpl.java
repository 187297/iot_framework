/**
 */
package com.pfc.iot.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.pfc.iot.Component;
import com.pfc.iot.IotPackage;
import com.pfc.iot.ProvidedPort;
import com.pfc.iot.RequiredPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.ComponentImpl#getRequiredport <em>Requiredport</em>}</li>
 *   <li>{@link com.pfc.iot.impl.ComponentImpl#getProvidedport <em>Providedport</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends ItemImpl implements Component {
	/**
	 * The cached value of the '{@link #getRequiredport() <em>Requiredport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredport()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredPort> requiredport;

	/**
	 * The cached value of the '{@link #getProvidedport() <em>Providedport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedport()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedPort> providedport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequiredPort> getRequiredport() {
		if (requiredport == null) {
			requiredport = new EObjectContainmentEList<RequiredPort>(RequiredPort.class, this,
					IotPackage.COMPONENT__REQUIREDPORT);
		}
		return requiredport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProvidedPort> getProvidedport() {
		if (providedport == null) {
			providedport = new EObjectContainmentEList<ProvidedPort>(ProvidedPort.class, this,
					IotPackage.COMPONENT__PROVIDEDPORT);
		}
		return providedport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IotPackage.COMPONENT__REQUIREDPORT:
			return ((InternalEList<?>) getRequiredport()).basicRemove(otherEnd, msgs);
		case IotPackage.COMPONENT__PROVIDEDPORT:
			return ((InternalEList<?>) getProvidedport()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IotPackage.COMPONENT__REQUIREDPORT:
			return getRequiredport();
		case IotPackage.COMPONENT__PROVIDEDPORT:
			return getProvidedport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IotPackage.COMPONENT__REQUIREDPORT:
			getRequiredport().clear();
			getRequiredport().addAll((Collection<? extends RequiredPort>) newValue);
			return;
		case IotPackage.COMPONENT__PROVIDEDPORT:
			getProvidedport().clear();
			getProvidedport().addAll((Collection<? extends ProvidedPort>) newValue);
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
		case IotPackage.COMPONENT__REQUIREDPORT:
			getRequiredport().clear();
			return;
		case IotPackage.COMPONENT__PROVIDEDPORT:
			getProvidedport().clear();
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
		case IotPackage.COMPONENT__REQUIREDPORT:
			return requiredport != null && !requiredport.isEmpty();
		case IotPackage.COMPONENT__PROVIDEDPORT:
			return providedport != null && !providedport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
