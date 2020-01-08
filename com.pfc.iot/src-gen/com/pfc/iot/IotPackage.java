/**
 */
package com.pfc.iot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.pfc.iot.IotFactory
 * @model kind="package"
 * @generated
 */
public interface IotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/iot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotPackage eINSTANCE = com.pfc.iot.impl.IotPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.ItemImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__UUID = 1;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NEW_THREAD = 2;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___INVOKE = 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.ComponentImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UUID = ITEM__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NEW_THREAD = ITEM__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIREDPORT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDEDPORT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___INVOKE = ITEM___INVOKE;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.SoftwareImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__UUID = COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__NEW_THREAD = COMPONENT__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__REQUIREDPORT = COMPONENT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__PROVIDEDPORT = COMPONENT__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__ITEM = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE___INVOKE = COMPONENT___INVOKE;

	/**
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.HardwareImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__UUID = COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__NEW_THREAD = COMPONENT__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__REQUIREDPORT = COMPONENT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__PROVIDEDPORT = COMPONENT__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__TYPE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__PIN_NUMBER = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__MODE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__TIME_INTERVAL = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE___INVOKE = COMPONENT___INVOKE;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.ControllerImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__UUID = ITEM__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NEW_THREAD = ITEM__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PROVIDEDPORT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___INVOKE = ITEM___INVOKE;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.IterationImpl <em>Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.IterationImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getIteration()
	 * @generated
	 */
	int ITERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__UUID = CONTROLLER__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__NEW_THREAD = CONTROLLER__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__PROVIDEDPORT = CONTROLLER__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION__REQUIREDPORT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION___INVOKE = CONTROLLER___INVOKE;

	/**
	 * The number of operations of the '<em>Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATION_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.CounterLoopImpl <em>Counter Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.CounterLoopImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getCounterLoop()
	 * @generated
	 */
	int COUNTER_LOOP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_LOOP__NAME = ITERATION__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_LOOP__UUID = ITERATION__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_LOOP__NEW_THREAD = ITERATION__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_LOOP__PROVIDEDPORT = ITERATION__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_LOOP__REQUIREDPORT = ITERATION__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_LOOP__COUNTER = ITERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Counter Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_LOOP_FEATURE_COUNT = ITERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_LOOP___INVOKE = ITERATION___INVOKE;

	/**
	 * The number of operations of the '<em>Counter Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_LOOP_OPERATION_COUNT = ITERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.RequiredPortImpl <em>Required Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.RequiredPortImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getRequiredPort()
	 * @generated
	 */
	int REQUIRED_PORT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__USE = 1;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__UUID = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__METHOD = 3;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__ARGS = 4;

	/**
	 * The number of structural features of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT___INVOKE__STRING = 0;

	/**
	 * The number of operations of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.IfPortImpl <em>If Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.IfPortImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getIfPort()
	 * @generated
	 */
	int IF_PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT__NAME = REQUIRED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT__USE = REQUIRED_PORT__USE;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT__UUID = REQUIRED_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT__METHOD = REQUIRED_PORT__METHOD;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT__ARGS = REQUIRED_PORT__ARGS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT__CONDITION = REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT__VAR = REQUIRED_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT__OPERATOR = REQUIRED_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT_FEATURE_COUNT = REQUIRED_PORT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT___INVOKE__STRING = REQUIRED_PORT___INVOKE__STRING;

	/**
	 * The number of operations of the '<em>If Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_PORT_OPERATION_COUNT = REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.ActuatorImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = HARDWARE__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__UUID = HARDWARE__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NEW_THREAD = HARDWARE__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__REQUIREDPORT = HARDWARE__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PROVIDEDPORT = HARDWARE__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = HARDWARE__TYPE;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PIN_NUMBER = HARDWARE__PIN_NUMBER;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__MODE = HARDWARE__MODE;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TIME_INTERVAL = HARDWARE__TIME_INTERVAL;

	/**
	 * The feature id for the '<em><b>Toggle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TOGGLE = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___INVOKE = HARDWARE___INVOKE;

	/**
	 * The operation id for the '<em>Toggle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___TOGGLE = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___GET_STATUS = HARDWARE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Switch On Off</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___SWITCH_ON_OFF__OBJECT = HARDWARE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.IterativeLoopImpl <em>Iterative Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.IterativeLoopImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getIterativeLoop()
	 * @generated
	 */
	int ITERATIVE_LOOP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP__NAME = ITERATION__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP__UUID = ITERATION__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP__NEW_THREAD = ITERATION__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP__PROVIDEDPORT = ITERATION__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP__REQUIREDPORT = ITERATION__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP__VAR = ITERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP__OPERATOR = ITERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP__CONDITION = ITERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Iterative Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP_FEATURE_COUNT = ITERATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP___INVOKE = ITERATION___INVOKE;

	/**
	 * The number of operations of the '<em>Iterative Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_LOOP_OPERATION_COUNT = ITERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.ProvidedPortImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getProvidedPort()
	 * @generated
	 */
	int PROVIDED_PORT = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__UUID = 0;

	/**
	 * The feature id for the '<em><b>Referto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__REFERTO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT___INVOKE__STRING_OBJECT = 0;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT___INVOKE__STRING = 1;

	/**
	 * The number of operations of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.BranchingImpl <em>Branching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.BranchingImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getBranching()
	 * @generated
	 */
	int BRANCHING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING__UUID = CONTROLLER__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING__NEW_THREAD = CONTROLLER__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING__PROVIDEDPORT = CONTROLLER__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Ifport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING__IFPORT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thenport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING__THENPORT = CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elseport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING__ELSEPORT = CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Branching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING___INVOKE = CONTROLLER___INVOKE;

	/**
	 * The number of operations of the '<em>Branching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHING_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.SensorImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = HARDWARE__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__UUID = HARDWARE__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NEW_THREAD = HARDWARE__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__REQUIREDPORT = HARDWARE__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PROVIDEDPORT = HARDWARE__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = HARDWARE__TYPE;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PIN_NUMBER = HARDWARE__PIN_NUMBER;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MODE = HARDWARE__MODE;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TIME_INTERVAL = HARDWARE__TIME_INTERVAL;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SCRIPT = HARDWARE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = HARDWARE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___INVOKE = HARDWARE___INVOKE;

	/**
	 * The operation id for the '<em>Get Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___GET_DATA = HARDWARE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = HARDWARE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.SequenceImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__UUID = CONTROLLER__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NEW_THREAD = CONTROLLER__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__PROVIDEDPORT = CONTROLLER__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__REQUIREDPORT = CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___INVOKE = CONTROLLER___INVOKE;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.SnippetImpl <em>Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.SnippetImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getSnippet()
	 * @generated
	 */
	int SNIPPET = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__UUID = COMPONENT__UUID;

	/**
	 * The feature id for the '<em><b>New Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__NEW_THREAD = COMPONENT__NEW_THREAD;

	/**
	 * The feature id for the '<em><b>Requiredport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__REQUIREDPORT = COMPONENT__REQUIREDPORT;

	/**
	 * The feature id for the '<em><b>Providedport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__PROVIDEDPORT = COMPONENT__PROVIDEDPORT;

	/**
	 * The feature id for the '<em><b>Script Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__SCRIPT_PATH = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET___INVOKE = COMPONENT___INVOKE;

	/**
	 * The number of operations of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.ConditionPortImpl <em>Condition Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.ConditionPortImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getConditionPort()
	 * @generated
	 */
	int CONDITION_PORT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PORT__NAME = REQUIRED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PORT__USE = REQUIRED_PORT__USE;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PORT__UUID = REQUIRED_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PORT__METHOD = REQUIRED_PORT__METHOD;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PORT__ARGS = REQUIRED_PORT__ARGS;

	/**
	 * The number of structural features of the '<em>Condition Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PORT_FEATURE_COUNT = REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PORT___INVOKE__STRING = REQUIRED_PORT___INVOKE__STRING;

	/**
	 * The number of operations of the '<em>Condition Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PORT_OPERATION_COUNT = REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.ThenPortImpl <em>Then Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.ThenPortImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getThenPort()
	 * @generated
	 */
	int THEN_PORT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_PORT__NAME = REQUIRED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_PORT__USE = REQUIRED_PORT__USE;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_PORT__UUID = REQUIRED_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_PORT__METHOD = REQUIRED_PORT__METHOD;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_PORT__ARGS = REQUIRED_PORT__ARGS;

	/**
	 * The number of structural features of the '<em>Then Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_PORT_FEATURE_COUNT = REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_PORT___INVOKE__STRING = REQUIRED_PORT___INVOKE__STRING;

	/**
	 * The number of operations of the '<em>Then Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEN_PORT_OPERATION_COUNT = REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.impl.ElsePortImpl <em>Else Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.impl.ElsePortImpl
	 * @see com.pfc.iot.impl.IotPackageImpl#getElsePort()
	 * @generated
	 */
	int ELSE_PORT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_PORT__NAME = REQUIRED_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_PORT__USE = REQUIRED_PORT__USE;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_PORT__UUID = REQUIRED_PORT__UUID;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_PORT__METHOD = REQUIRED_PORT__METHOD;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_PORT__ARGS = REQUIRED_PORT__ARGS;

	/**
	 * The number of structural features of the '<em>Else Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_PORT_FEATURE_COUNT = REQUIRED_PORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_PORT___INVOKE__STRING = REQUIRED_PORT___INVOKE__STRING;

	/**
	 * The number of operations of the '<em>Else Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_PORT_OPERATION_COUNT = REQUIRED_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.pfc.iot.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pfc.iot.Operator
	 * @see com.pfc.iot.impl.IotPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 19;

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see com.pfc.iot.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the containment reference list '{@link com.pfc.iot.Software#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see com.pfc.iot.Software#getItem()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Item();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see com.pfc.iot.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.Hardware#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.pfc.iot.Hardware#getType()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.Hardware#getPinNumber <em>Pin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Number</em>'.
	 * @see com.pfc.iot.Hardware#getPinNumber()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_PinNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.Hardware#isMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see com.pfc.iot.Hardware#isMode()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_Mode();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.Hardware#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see com.pfc.iot.Hardware#getTimeInterval()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_TimeInterval();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.CounterLoop <em>Counter Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter Loop</em>'.
	 * @see com.pfc.iot.CounterLoop
	 * @generated
	 */
	EClass getCounterLoop();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.CounterLoop#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see com.pfc.iot.CounterLoop#getCounter()
	 * @see #getCounterLoop()
	 * @generated
	 */
	EAttribute getCounterLoop_Counter();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.IfPort <em>If Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Port</em>'.
	 * @see com.pfc.iot.IfPort
	 * @generated
	 */
	EClass getIfPort();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.IfPort#isCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see com.pfc.iot.IfPort#isCondition()
	 * @see #getIfPort()
	 * @generated
	 */
	EAttribute getIfPort_Condition();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.IfPort#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see com.pfc.iot.IfPort#getVar()
	 * @see #getIfPort()
	 * @generated
	 */
	EAttribute getIfPort_Var();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.IfPort#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.pfc.iot.IfPort#getOperator()
	 * @see #getIfPort()
	 * @generated
	 */
	EAttribute getIfPort_Operator();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see com.pfc.iot.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.Actuator#isToggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toggle</em>'.
	 * @see com.pfc.iot.Actuator#isToggle()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Toggle();

	/**
	 * Returns the meta object for the '{@link com.pfc.iot.Actuator#toggle() <em>Toggle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Toggle</em>' operation.
	 * @see com.pfc.iot.Actuator#toggle()
	 * @generated
	 */
	EOperation getActuator__Toggle();

	/**
	 * Returns the meta object for the '{@link com.pfc.iot.Actuator#getStatus() <em>Get Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Status</em>' operation.
	 * @see com.pfc.iot.Actuator#getStatus()
	 * @generated
	 */
	EOperation getActuator__GetStatus();

	/**
	 * Returns the meta object for the '{@link com.pfc.iot.Actuator#switchOnOff(java.lang.Object) <em>Switch On Off</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Switch On Off</em>' operation.
	 * @see com.pfc.iot.Actuator#switchOnOff(java.lang.Object)
	 * @generated
	 */
	EOperation getActuator__SwitchOnOff__Object();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.IterativeLoop <em>Iterative Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterative Loop</em>'.
	 * @see com.pfc.iot.IterativeLoop
	 * @generated
	 */
	EClass getIterativeLoop();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.IterativeLoop#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see com.pfc.iot.IterativeLoop#getVar()
	 * @see #getIterativeLoop()
	 * @generated
	 */
	EAttribute getIterativeLoop_Var();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.IterativeLoop#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.pfc.iot.IterativeLoop#getOperator()
	 * @see #getIterativeLoop()
	 * @generated
	 */
	EAttribute getIterativeLoop_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link com.pfc.iot.IterativeLoop#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.pfc.iot.IterativeLoop#getCondition()
	 * @see #getIterativeLoop()
	 * @generated
	 */
	EReference getIterativeLoop_Condition();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Port</em>'.
	 * @see com.pfc.iot.ProvidedPort
	 * @generated
	 */
	EClass getProvidedPort();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.ProvidedPort#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see com.pfc.iot.ProvidedPort#getUUID()
	 * @see #getProvidedPort()
	 * @generated
	 */
	EAttribute getProvidedPort_UUID();

	/**
	 * Returns the meta object for the reference '{@link com.pfc.iot.ProvidedPort#getReferto <em>Referto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referto</em>'.
	 * @see com.pfc.iot.ProvidedPort#getReferto()
	 * @see #getProvidedPort()
	 * @generated
	 */
	EReference getProvidedPort_Referto();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.ProvidedPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.pfc.iot.ProvidedPort#getName()
	 * @see #getProvidedPort()
	 * @generated
	 */
	EAttribute getProvidedPort_Name();

	/**
	 * Returns the meta object for the '{@link com.pfc.iot.ProvidedPort#invoke(java.lang.String, java.lang.Object) <em>Invoke</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoke</em>' operation.
	 * @see com.pfc.iot.ProvidedPort#invoke(java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getProvidedPort__Invoke__String_Object();

	/**
	 * Returns the meta object for the '{@link com.pfc.iot.ProvidedPort#invoke(java.lang.String) <em>Invoke</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoke</em>' operation.
	 * @see com.pfc.iot.ProvidedPort#invoke(java.lang.String)
	 * @generated
	 */
	EOperation getProvidedPort__Invoke__String();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Branching <em>Branching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branching</em>'.
	 * @see com.pfc.iot.Branching
	 * @generated
	 */
	EClass getBranching();

	/**
	 * Returns the meta object for the containment reference '{@link com.pfc.iot.Branching#getIfport <em>Ifport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ifport</em>'.
	 * @see com.pfc.iot.Branching#getIfport()
	 * @see #getBranching()
	 * @generated
	 */
	EReference getBranching_Ifport();

	/**
	 * Returns the meta object for the containment reference '{@link com.pfc.iot.Branching#getThenport <em>Thenport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thenport</em>'.
	 * @see com.pfc.iot.Branching#getThenport()
	 * @see #getBranching()
	 * @generated
	 */
	EReference getBranching_Thenport();

	/**
	 * Returns the meta object for the containment reference '{@link com.pfc.iot.Branching#getElseport <em>Elseport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elseport</em>'.
	 * @see com.pfc.iot.Branching#getElseport()
	 * @see #getBranching()
	 * @generated
	 */
	EReference getBranching_Elseport();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Iteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteration</em>'.
	 * @see com.pfc.iot.Iteration
	 * @generated
	 */
	EClass getIteration();

	/**
	 * Returns the meta object for the containment reference '{@link com.pfc.iot.Iteration#getRequiredport <em>Requiredport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requiredport</em>'.
	 * @see com.pfc.iot.Iteration#getRequiredport()
	 * @see #getIteration()
	 * @generated
	 */
	EReference getIteration_Requiredport();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see com.pfc.iot.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.Sensor#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see com.pfc.iot.Sensor#getScript()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Script();

	/**
	 * Returns the meta object for the '{@link com.pfc.iot.Sensor#getData() <em>Get Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data</em>' operation.
	 * @see com.pfc.iot.Sensor#getData()
	 * @generated
	 */
	EOperation getSensor__GetData();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see com.pfc.iot.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link com.pfc.iot.Sequence#getRequiredport <em>Requiredport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requiredport</em>'.
	 * @see com.pfc.iot.Sequence#getRequiredport()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Requiredport();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see com.pfc.iot.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link com.pfc.iot.Component#getRequiredport <em>Requiredport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requiredport</em>'.
	 * @see com.pfc.iot.Component#getRequiredport()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Requiredport();

	/**
	 * Returns the meta object for the containment reference list '{@link com.pfc.iot.Component#getProvidedport <em>Providedport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providedport</em>'.
	 * @see com.pfc.iot.Component#getProvidedport()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Providedport();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see com.pfc.iot.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the containment reference '{@link com.pfc.iot.Controller#getProvidedport <em>Providedport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Providedport</em>'.
	 * @see com.pfc.iot.Controller#getProvidedport()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Providedport();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Port</em>'.
	 * @see com.pfc.iot.RequiredPort
	 * @generated
	 */
	EClass getRequiredPort();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.RequiredPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.pfc.iot.RequiredPort#getName()
	 * @see #getRequiredPort()
	 * @generated
	 */
	EAttribute getRequiredPort_Name();

	/**
	 * Returns the meta object for the reference '{@link com.pfc.iot.RequiredPort#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see com.pfc.iot.RequiredPort#getUse()
	 * @see #getRequiredPort()
	 * @generated
	 */
	EReference getRequiredPort_Use();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.RequiredPort#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see com.pfc.iot.RequiredPort#getUUID()
	 * @see #getRequiredPort()
	 * @generated
	 */
	EAttribute getRequiredPort_UUID();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.RequiredPort#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see com.pfc.iot.RequiredPort#getMethod()
	 * @see #getRequiredPort()
	 * @generated
	 */
	EAttribute getRequiredPort_Method();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.RequiredPort#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see com.pfc.iot.RequiredPort#getArgs()
	 * @see #getRequiredPort()
	 * @generated
	 */
	EAttribute getRequiredPort_Args();

	/**
	 * Returns the meta object for the '{@link com.pfc.iot.RequiredPort#invoke(java.lang.String) <em>Invoke</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoke</em>' operation.
	 * @see com.pfc.iot.RequiredPort#invoke(java.lang.String)
	 * @generated
	 */
	EOperation getRequiredPort__Invoke__String();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Snippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snippet</em>'.
	 * @see com.pfc.iot.Snippet
	 * @generated
	 */
	EClass getSnippet();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.Snippet#getScriptPath <em>Script Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Path</em>'.
	 * @see com.pfc.iot.Snippet#getScriptPath()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_ScriptPath();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see com.pfc.iot.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.pfc.iot.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.Item#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see com.pfc.iot.Item#getUUID()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_UUID();

	/**
	 * Returns the meta object for the attribute '{@link com.pfc.iot.Item#isNewThread <em>New Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Thread</em>'.
	 * @see com.pfc.iot.Item#isNewThread()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_NewThread();

	/**
	 * Returns the meta object for the '{@link com.pfc.iot.Item#invoke() <em>Invoke</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoke</em>' operation.
	 * @see com.pfc.iot.Item#invoke()
	 * @generated
	 */
	EOperation getItem__Invoke();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.ConditionPort <em>Condition Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Port</em>'.
	 * @see com.pfc.iot.ConditionPort
	 * @generated
	 */
	EClass getConditionPort();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.ThenPort <em>Then Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Then Port</em>'.
	 * @see com.pfc.iot.ThenPort
	 * @generated
	 */
	EClass getThenPort();

	/**
	 * Returns the meta object for class '{@link com.pfc.iot.ElsePort <em>Else Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Port</em>'.
	 * @see com.pfc.iot.ElsePort
	 * @generated
	 */
	EClass getElsePort();

	/**
	 * Returns the meta object for enum '{@link com.pfc.iot.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see com.pfc.iot.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IotFactory getIotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.SoftwareImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__ITEM = eINSTANCE.getSoftware_Item();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.HardwareImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__TYPE = eINSTANCE.getHardware_Type();

		/**
		 * The meta object literal for the '<em><b>Pin Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__PIN_NUMBER = eINSTANCE.getHardware_PinNumber();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__MODE = eINSTANCE.getHardware_Mode();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__TIME_INTERVAL = eINSTANCE.getHardware_TimeInterval();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.CounterLoopImpl <em>Counter Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.CounterLoopImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getCounterLoop()
		 * @generated
		 */
		EClass COUNTER_LOOP = eINSTANCE.getCounterLoop();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER_LOOP__COUNTER = eINSTANCE.getCounterLoop_Counter();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.IfPortImpl <em>If Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.IfPortImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getIfPort()
		 * @generated
		 */
		EClass IF_PORT = eINSTANCE.getIfPort();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_PORT__CONDITION = eINSTANCE.getIfPort_Condition();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_PORT__VAR = eINSTANCE.getIfPort_Var();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_PORT__OPERATOR = eINSTANCE.getIfPort_Operator();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.ActuatorImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Toggle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__TOGGLE = eINSTANCE.getActuator_Toggle();

		/**
		 * The meta object literal for the '<em><b>Toggle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTUATOR___TOGGLE = eINSTANCE.getActuator__Toggle();

		/**
		 * The meta object literal for the '<em><b>Get Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTUATOR___GET_STATUS = eINSTANCE.getActuator__GetStatus();

		/**
		 * The meta object literal for the '<em><b>Switch On Off</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTUATOR___SWITCH_ON_OFF__OBJECT = eINSTANCE.getActuator__SwitchOnOff__Object();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.IterativeLoopImpl <em>Iterative Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.IterativeLoopImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getIterativeLoop()
		 * @generated
		 */
		EClass ITERATIVE_LOOP = eINSTANCE.getIterativeLoop();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATIVE_LOOP__VAR = eINSTANCE.getIterativeLoop_Var();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATIVE_LOOP__OPERATOR = eINSTANCE.getIterativeLoop_Operator();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATIVE_LOOP__CONDITION = eINSTANCE.getIterativeLoop_Condition();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.ProvidedPortImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getProvidedPort()
		 * @generated
		 */
		EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_PORT__UUID = eINSTANCE.getProvidedPort_UUID();

		/**
		 * The meta object literal for the '<em><b>Referto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_PORT__REFERTO = eINSTANCE.getProvidedPort_Referto();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDED_PORT__NAME = eINSTANCE.getProvidedPort_Name();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROVIDED_PORT___INVOKE__STRING_OBJECT = eINSTANCE.getProvidedPort__Invoke__String_Object();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROVIDED_PORT___INVOKE__STRING = eINSTANCE.getProvidedPort__Invoke__String();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.BranchingImpl <em>Branching</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.BranchingImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getBranching()
		 * @generated
		 */
		EClass BRANCHING = eINSTANCE.getBranching();

		/**
		 * The meta object literal for the '<em><b>Ifport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCHING__IFPORT = eINSTANCE.getBranching_Ifport();

		/**
		 * The meta object literal for the '<em><b>Thenport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCHING__THENPORT = eINSTANCE.getBranching_Thenport();

		/**
		 * The meta object literal for the '<em><b>Elseport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCHING__ELSEPORT = eINSTANCE.getBranching_Elseport();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.IterationImpl <em>Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.IterationImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getIteration()
		 * @generated
		 */
		EClass ITERATION = eINSTANCE.getIteration();

		/**
		 * The meta object literal for the '<em><b>Requiredport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATION__REQUIREDPORT = eINSTANCE.getIteration_Requiredport();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.SensorImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__SCRIPT = eINSTANCE.getSensor_Script();

		/**
		 * The meta object literal for the '<em><b>Get Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR___GET_DATA = eINSTANCE.getSensor__GetData();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.SequenceImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Requiredport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__REQUIREDPORT = eINSTANCE.getSequence_Requiredport();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.ComponentImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Requiredport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIREDPORT = eINSTANCE.getComponent_Requiredport();

		/**
		 * The meta object literal for the '<em><b>Providedport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDEDPORT = eINSTANCE.getComponent_Providedport();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.ControllerImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Providedport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__PROVIDEDPORT = eINSTANCE.getController_Providedport();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.RequiredPortImpl <em>Required Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.RequiredPortImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getRequiredPort()
		 * @generated
		 */
		EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PORT__NAME = eINSTANCE.getRequiredPort_Name();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_PORT__USE = eINSTANCE.getRequiredPort_Use();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PORT__UUID = eINSTANCE.getRequiredPort_UUID();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PORT__METHOD = eINSTANCE.getRequiredPort_Method();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PORT__ARGS = eINSTANCE.getRequiredPort_Args();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIRED_PORT___INVOKE__STRING = eINSTANCE.getRequiredPort__Invoke__String();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.SnippetImpl <em>Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.SnippetImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getSnippet()
		 * @generated
		 */
		EClass SNIPPET = eINSTANCE.getSnippet();

		/**
		 * The meta object literal for the '<em><b>Script Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__SCRIPT_PATH = eINSTANCE.getSnippet_ScriptPath();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.ItemImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__UUID = eINSTANCE.getItem_UUID();

		/**
		 * The meta object literal for the '<em><b>New Thread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NEW_THREAD = eINSTANCE.getItem_NewThread();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___INVOKE = eINSTANCE.getItem__Invoke();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.ConditionPortImpl <em>Condition Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.ConditionPortImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getConditionPort()
		 * @generated
		 */
		EClass CONDITION_PORT = eINSTANCE.getConditionPort();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.ThenPortImpl <em>Then Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.ThenPortImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getThenPort()
		 * @generated
		 */
		EClass THEN_PORT = eINSTANCE.getThenPort();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.impl.ElsePortImpl <em>Else Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.impl.ElsePortImpl
		 * @see com.pfc.iot.impl.IotPackageImpl#getElsePort()
		 * @generated
		 */
		EClass ELSE_PORT = eINSTANCE.getElsePort();

		/**
		 * The meta object literal for the '{@link com.pfc.iot.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pfc.iot.Operator
		 * @see com.pfc.iot.impl.IotPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //IotPackage
