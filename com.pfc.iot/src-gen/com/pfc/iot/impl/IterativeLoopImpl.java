/**
 */
package com.pfc.iot.impl;

import com.pfc.iot.ConditionPort;
import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.pfc.iot.IotPackage;
import com.pfc.iot.IterativeLoop;
import com.pfc.iot.Operator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterative Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.IterativeLoopImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.pfc.iot.impl.IterativeLoopImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.pfc.iot.impl.IterativeLoopImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IterativeLoopImpl extends IterationImpl implements IterativeLoop {

	/**
	 * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected static final Object VAR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected Object var = VAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OPERATOR_EDEFAULT = Operator.EQ;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ConditionPort condition;

	@Override
	public Object invoke() {
		ArrayList<Object> result = new ArrayList<Object>();
		switch (this.operator) {
		case EQ:
			try {
				while (Double.parseDouble(valid().toString()) == Double.parseDouble(this.var.toString())) {
					result.add(loop());
				}
			} catch (NumberFormatException e) {
				while (valid().toString().equals(this.var.toString())) {
					result.add(loop());
				}
			}
			break;
		case GE:
			try {
				while (Double.parseDouble(valid().toString()) >= Double.parseDouble(this.var.toString())) {
					result.add(loop());
				}
			} catch (NumberFormatException e) {
				while (valid().toString().compareTo(this.var.toString()) >= 0) {
					result.add(loop());
				}
			}
			break;
		case GT:
			try {
				while (Double.parseDouble(valid().toString()) > Double.parseDouble(this.var.toString())) {
					result.add(loop());
				}
			} catch (NumberFormatException e) {
				while (valid().toString().compareTo(this.var.toString()) > 0) {
					System.out.println(valid());
					result.add(loop());
				}
			}
			break;
		case LE:
			try {
				while (Double.parseDouble(valid().toString()) <= Double.parseDouble(this.var.toString())) {
					result.add(loop());
				}
			} catch (NumberFormatException e) {
				while (valid().toString().compareTo(this.var.toString()) <= 0) {
					result.add(loop());
				}
			}
			break;
		case LT:
			try {
				while (Double.parseDouble(valid().toString()) < Double.parseDouble(this.var.toString())) {
					result.add(loop());
				}
			} catch (NumberFormatException e) {
				while (valid().toString().compareTo(this.var.toString()) < 0) {
					result.add(loop());
				}
			}
			break;
		case NE:
			try {
				while (Double.parseDouble(valid().toString()) != Double.parseDouble(this.var.toString())) {
					result.add(loop());
				}
			} catch (NumberFormatException e) {
				while (! valid().toString().equals(this.var.toString())) {
					result.add(loop());
				}
			}
			break;
		default:
			break;
		}
		return result;
	}

	private Object valid() {
		return this.getCondition().invoke("invoke");
	}

	private Object loop() {
		return this.requiredport.invoke("invoke");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterativeLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.ITERATIVE_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVar(Object newVar) {
		Object oldVar = var;
		var = newVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.ITERATIVE_LOOP__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(Operator newOperator) {
		Operator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.ITERATIVE_LOOP__OPERATOR, oldOperator,
					operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionPort getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ConditionPort newCondition, NotificationChain msgs) {
		ConditionPort oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					IotPackage.ITERATIVE_LOOP__CONDITION, oldCondition, newCondition);
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
	public void setCondition(ConditionPort newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.ITERATIVE_LOOP__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - IotPackage.ITERATIVE_LOOP__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.ITERATIVE_LOOP__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IotPackage.ITERATIVE_LOOP__CONDITION:
			return basicSetCondition(null, msgs);
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
		case IotPackage.ITERATIVE_LOOP__VAR:
			return getVar();
		case IotPackage.ITERATIVE_LOOP__OPERATOR:
			return getOperator();
		case IotPackage.ITERATIVE_LOOP__CONDITION:
			return getCondition();
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
		case IotPackage.ITERATIVE_LOOP__VAR:
			setVar(newValue);
			return;
		case IotPackage.ITERATIVE_LOOP__OPERATOR:
			setOperator((Operator) newValue);
			return;
		case IotPackage.ITERATIVE_LOOP__CONDITION:
			setCondition((ConditionPort) newValue);
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
		case IotPackage.ITERATIVE_LOOP__VAR:
			setVar(VAR_EDEFAULT);
			return;
		case IotPackage.ITERATIVE_LOOP__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case IotPackage.ITERATIVE_LOOP__CONDITION:
			setCondition((ConditionPort) null);
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
		case IotPackage.ITERATIVE_LOOP__VAR:
			return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
		case IotPackage.ITERATIVE_LOOP__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case IotPackage.ITERATIVE_LOOP__CONDITION:
			return condition != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (var: ");
		result.append(var);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //IterativeLoopImpl
