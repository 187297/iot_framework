/**
 */
package com.pfc.iot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.pfc.iot.Controller;
import com.pfc.iot.IotPackage;
import com.pfc.iot.ProvidedPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.ControllerImpl#getProvidedport <em>Providedport</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControllerImpl extends ItemImpl implements Controller {
	/**
	 * The cached value of the '{@link #getProvidedport() <em>Providedport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedport()
	 * @generated
	 * @ordered
	 */
	protected ProvidedPort providedport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedPort getProvidedport() {
		return providedport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedport(ProvidedPort newProvidedport, NotificationChain msgs) {
		ProvidedPort oldProvidedport = providedport;
		providedport = newProvidedport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					IotPackage.CONTROLLER__PROVIDEDPORT, oldProvidedport, newProvidedport);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidedport(ProvidedPort newProvidedport) {
		if (newProvidedport != providedport) {
			NotificationChain msgs = null;
			if (providedport != null)
				msgs = ((InternalEObject) providedport).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.CONTROLLER__PROVIDEDPORT, null, msgs);
			if (newProvidedport != null)
				msgs = ((InternalEObject) newProvidedport).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.CONTROLLER__PROVIDEDPORT, null, msgs);
			msgs = basicSetProvidedport(newProvidedport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.CONTROLLER__PROVIDEDPORT, newProvidedport,
					newProvidedport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IotPackage.CONTROLLER__PROVIDEDPORT:
			return basicSetProvidedport(null, msgs);
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
		case IotPackage.CONTROLLER__PROVIDEDPORT:
			return getProvidedport();
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
		case IotPackage.CONTROLLER__PROVIDEDPORT:
			setProvidedport((ProvidedPort) newValue);
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
		case IotPackage.CONTROLLER__PROVIDEDPORT:
			setProvidedport((ProvidedPort) null);
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
		case IotPackage.CONTROLLER__PROVIDEDPORT:
			return providedport != null;
		}
		return super.eIsSet(featureID);
	}

} //ControllerImpl
