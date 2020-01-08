/**
 */
package com.pfc.iot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import com.pfc.iot.Branching;
import com.pfc.iot.ElsePort;
import com.pfc.iot.IfPort;
import com.pfc.iot.IotPackage;
import com.pfc.iot.ThenPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.BranchingImpl#getIfport <em>Ifport</em>}</li>
 *   <li>{@link com.pfc.iot.impl.BranchingImpl#getThenport <em>Thenport</em>}</li>
 *   <li>{@link com.pfc.iot.impl.BranchingImpl#getElseport <em>Elseport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchingImpl extends ControllerImpl implements Branching {

	/**
	 * The cached value of the '{@link #getIfport() <em>Ifport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfport()
	 * @generated
	 * @ordered
	 */
	protected IfPort ifport;
	/**
	 * The cached value of the '{@link #getThenport() <em>Thenport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenport()
	 * @generated
	 * @ordered
	 */
	protected ThenPort thenport;
	/**
	 * The cached value of the '{@link #getElseport() <em>Elseport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseport()
	 * @generated
	 * @ordered
	 */
	protected ElsePort elseport;

	@Override
	public Object invoke() {
		Object result;
		if (this.ifport.isCondition())
			result = this.thenport.invoke("invoke");
		else if (this.elseport != null)
			result = this.elseport.invoke("invoke");
		else
			result = null;
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.BRANCHING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfPort getIfport() {
		return ifport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfport(IfPort newIfport, NotificationChain msgs) {
		IfPort oldIfport = ifport;
		ifport = newIfport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotPackage.BRANCHING__IFPORT,
					oldIfport, newIfport);
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
	public void setIfport(IfPort newIfport) {
		if (newIfport != ifport) {
			NotificationChain msgs = null;
			if (ifport != null)
				msgs = ((InternalEObject) ifport).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.BRANCHING__IFPORT, null, msgs);
			if (newIfport != null)
				msgs = ((InternalEObject) newIfport).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.BRANCHING__IFPORT, null, msgs);
			msgs = basicSetIfport(newIfport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.BRANCHING__IFPORT, newIfport, newIfport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThenPort getThenport() {
		return thenport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenport(ThenPort newThenport, NotificationChain msgs) {
		ThenPort oldThenport = thenport;
		thenport = newThenport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					IotPackage.BRANCHING__THENPORT, oldThenport, newThenport);
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
	public void setThenport(ThenPort newThenport) {
		if (newThenport != thenport) {
			NotificationChain msgs = null;
			if (thenport != null)
				msgs = ((InternalEObject) thenport).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.BRANCHING__THENPORT, null, msgs);
			if (newThenport != null)
				msgs = ((InternalEObject) newThenport).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.BRANCHING__THENPORT, null, msgs);
			msgs = basicSetThenport(newThenport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.BRANCHING__THENPORT, newThenport,
					newThenport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElsePort getElseport() {
		return elseport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseport(ElsePort newElseport, NotificationChain msgs) {
		ElsePort oldElseport = elseport;
		elseport = newElseport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					IotPackage.BRANCHING__ELSEPORT, oldElseport, newElseport);
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
	public void setElseport(ElsePort newElseport) {
		if (newElseport != elseport) {
			NotificationChain msgs = null;
			if (elseport != null)
				msgs = ((InternalEObject) elseport).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.BRANCHING__ELSEPORT, null, msgs);
			if (newElseport != null)
				msgs = ((InternalEObject) newElseport).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.BRANCHING__ELSEPORT, null, msgs);
			msgs = basicSetElseport(newElseport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.BRANCHING__ELSEPORT, newElseport,
					newElseport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IotPackage.BRANCHING__IFPORT:
			return basicSetIfport(null, msgs);
		case IotPackage.BRANCHING__THENPORT:
			return basicSetThenport(null, msgs);
		case IotPackage.BRANCHING__ELSEPORT:
			return basicSetElseport(null, msgs);
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
		case IotPackage.BRANCHING__IFPORT:
			return getIfport();
		case IotPackage.BRANCHING__THENPORT:
			return getThenport();
		case IotPackage.BRANCHING__ELSEPORT:
			return getElseport();
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
		case IotPackage.BRANCHING__IFPORT:
			setIfport((IfPort) newValue);
			return;
		case IotPackage.BRANCHING__THENPORT:
			setThenport((ThenPort) newValue);
			return;
		case IotPackage.BRANCHING__ELSEPORT:
			setElseport((ElsePort) newValue);
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
		case IotPackage.BRANCHING__IFPORT:
			setIfport((IfPort) null);
			return;
		case IotPackage.BRANCHING__THENPORT:
			setThenport((ThenPort) null);
			return;
		case IotPackage.BRANCHING__ELSEPORT:
			setElseport((ElsePort) null);
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
		case IotPackage.BRANCHING__IFPORT:
			return ifport != null;
		case IotPackage.BRANCHING__THENPORT:
			return thenport != null;
		case IotPackage.BRANCHING__ELSEPORT:
			return elseport != null;
		}
		return super.eIsSet(featureID);
	}

} //BranchingImpl
