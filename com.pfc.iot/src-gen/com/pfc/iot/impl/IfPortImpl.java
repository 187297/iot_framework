/**
 */
package com.pfc.iot.impl;

import com.pfc.iot.IfPort;
import com.pfc.iot.IotPackage;
import com.pfc.iot.Operator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.pfc.iot.impl.IfPortImpl#isCondition <em>Condition</em>}</li>
 *   <li>{@link com.pfc.iot.impl.IfPortImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.pfc.iot.impl.IfPortImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfPortImpl extends RequiredPortImpl implements IfPort {
	/**
	 * The default value of the '{@link #isCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCondition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONDITION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCondition()
	 * @generated
	 * @ordered
	 */
	protected boolean condition = CONDITION_EDEFAULT;
	/**
	 * This is true if the Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionESet;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotPackage.Literals.IF_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isCondition() {
		//		System.out.println("test");
		this.setCondition(false);
		Object var1 = this.invoke("invoke");
		switch (this.operator) {
		case EQ:
			//			System.out.println(Double.parseDouble(var1.toString()));
			try {
				if (Double.parseDouble(var1.toString()) == Double.parseDouble(this.var.toString())) {
					this.setCondition(true);
				}
			} catch (NumberFormatException e) {
				if (var1.equals(this.var)) {
					this.setCondition(true);
				}
			}
			break;
		case GE:
			try {
				if (Double.parseDouble(var1.toString()) >= Double.parseDouble(this.var.toString())) {
					this.setCondition(true);
				}
			} catch (NumberFormatException e) {
				if (var1.toString().compareTo(this.var.toString()) >= 0) {
					this.setCondition(true);
				}
			}
			break;
		case GT:
			try {
				if (Double.parseDouble(var1.toString()) > Double.parseDouble(this.var.toString())) {
					this.setCondition(true);
				}
			} catch (NumberFormatException e) {
				if (var1.toString().compareTo(this.var.toString()) > 0) {
					this.setCondition(true);
				}
			}
			break;
		case LE:
			try {
				if (Double.parseDouble(var1.toString()) <= Double.parseDouble(this.var.toString())) {
					this.setCondition(true);
				}
			} catch (NumberFormatException e) {
				if (var1.toString().compareTo(this.var.toString()) <= 0) {
					this.setCondition(true);
				}
			}
			break;
		case LT:
			try {
				if (Double.parseDouble(var1.toString()) < Double.parseDouble(this.var.toString())) {
					this.setCondition(true);
				}
			} catch (NumberFormatException e) {
				if (var1.toString().compareTo(this.var.toString()) < 0) {
					this.setCondition(true);
				}
			}
			break;
		case NE:
			try {
				if (Double.parseDouble(var1.toString()) != Double.parseDouble(this.var.toString())) {
					this.setCondition(true);
				}
			} catch (NumberFormatException e) {
				if (!var1.equals(this.var)) {
					this.setCondition(true);
				}
			}
			break;
		default:
			break;
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(boolean newCondition) {
		boolean oldCondition = condition;
		condition = newCondition;
		boolean oldConditionESet = conditionESet;
		conditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.IF_PORT__CONDITION, oldCondition,
					condition, !oldConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCondition() {
		boolean oldCondition = condition;
		boolean oldConditionESet = conditionESet;
		condition = CONDITION_EDEFAULT;
		conditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IotPackage.IF_PORT__CONDITION, oldCondition,
					CONDITION_EDEFAULT, oldConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCondition() {
		return conditionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.IF_PORT__VAR, oldVar, var));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotPackage.IF_PORT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IotPackage.IF_PORT__CONDITION:
			return isCondition();
		case IotPackage.IF_PORT__VAR:
			return getVar();
		case IotPackage.IF_PORT__OPERATOR:
			return getOperator();
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
		case IotPackage.IF_PORT__CONDITION:
			setCondition((Boolean) newValue);
			return;
		case IotPackage.IF_PORT__VAR:
			setVar(newValue);
			return;
		case IotPackage.IF_PORT__OPERATOR:
			setOperator((Operator) newValue);
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
		case IotPackage.IF_PORT__CONDITION:
			unsetCondition();
			return;
		case IotPackage.IF_PORT__VAR:
			setVar(VAR_EDEFAULT);
			return;
		case IotPackage.IF_PORT__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
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
		case IotPackage.IF_PORT__CONDITION:
			return isSetCondition();
		case IotPackage.IF_PORT__VAR:
			return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
		case IotPackage.IF_PORT__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
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
		result.append(" (condition: ");
		if (conditionESet)
			result.append(condition);
		else
			result.append("<unset>");
		result.append(", var: ");
		result.append(var);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //IfPortImpl
