/**
 */
package com.pfc.iot.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.pfc.iot.IotPackage;
import com.pfc.iot.RequiredPort;
import com.pfc.iot.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.SequenceImpl#getRequiredport <em>Requiredport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceImpl extends ControllerImpl implements Sequence {

	@Override
	public Object invoke() {
		ArrayList<Object> result = new ArrayList<>();
		this.requiredport.forEach((port) -> {
			result.add(port.invoke("invoke"));
		});
		return result;
	}

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.SEQUENCE;
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
					IotPackage.SEQUENCE__REQUIREDPORT);
		}
		return requiredport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IotPackage.SEQUENCE__REQUIREDPORT:
			return ((InternalEList<?>) getRequiredport()).basicRemove(otherEnd, msgs);
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
		case IotPackage.SEQUENCE__REQUIREDPORT:
			return getRequiredport();
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
		case IotPackage.SEQUENCE__REQUIREDPORT:
			getRequiredport().clear();
			getRequiredport().addAll((Collection<? extends RequiredPort>) newValue);
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
		case IotPackage.SEQUENCE__REQUIREDPORT:
			getRequiredport().clear();
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
		case IotPackage.SEQUENCE__REQUIREDPORT:
			return requiredport != null && !requiredport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
