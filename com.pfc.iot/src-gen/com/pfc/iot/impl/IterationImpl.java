/**
 */
package com.pfc.iot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.pfc.iot.IotPackage;
import com.pfc.iot.Iteration;
import com.pfc.iot.RequiredPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.IterationImpl#getRequiredport <em>Requiredport</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IterationImpl extends ControllerImpl implements Iteration {
	/**
	 * The cached value of the '{@link #getRequiredport() <em>Requiredport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredport()
	 * @generated
	 * @ordered
	 */
	protected RequiredPort requiredport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.ITERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredPort getRequiredport() {
		return requiredport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredport(RequiredPort newRequiredport, NotificationChain msgs) {
		RequiredPort oldRequiredport = requiredport;
		requiredport = newRequiredport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					IotPackage.ITERATION__REQUIREDPORT, oldRequiredport, newRequiredport);
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
	public void setRequiredport(RequiredPort newRequiredport) {
		if (newRequiredport != requiredport) {
			NotificationChain msgs = null;
			if (requiredport != null)
				msgs = ((InternalEObject) requiredport).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.ITERATION__REQUIREDPORT, null, msgs);
			if (newRequiredport != null)
				msgs = ((InternalEObject) newRequiredport).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.ITERATION__REQUIREDPORT, null, msgs);
			msgs = basicSetRequiredport(newRequiredport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.ITERATION__REQUIREDPORT, newRequiredport,
					newRequiredport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IotPackage.ITERATION__REQUIREDPORT:
			return basicSetRequiredport(null, msgs);
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
		case IotPackage.ITERATION__REQUIREDPORT:
			return getRequiredport();
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
		case IotPackage.ITERATION__REQUIREDPORT:
			setRequiredport((RequiredPort) newValue);
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
		case IotPackage.ITERATION__REQUIREDPORT:
			setRequiredport((RequiredPort) null);
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
		case IotPackage.ITERATION__REQUIREDPORT:
			return requiredport != null;
		}
		return super.eIsSet(featureID);
	}

} //IterationImpl
