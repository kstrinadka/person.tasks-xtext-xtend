/**
 * generated by Xtext 2.32.0
 */
package persons.tasks.taskDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import persons.tasks.taskDSL.Action;
import persons.tasks.taskDSL.Balance;
import persons.tasks.taskDSL.Duration;
import persons.tasks.taskDSL.ExpressionAddition;
import persons.tasks.taskDSL.ExpressionBalance;
import persons.tasks.taskDSL.ExpressionBracket;
import persons.tasks.taskDSL.ExpressionConstantInt;
import persons.tasks.taskDSL.ExpressionDivision;
import persons.tasks.taskDSL.ExpressionMaximum;
import persons.tasks.taskDSL.ExpressionMinimum;
import persons.tasks.taskDSL.ExpressionMinus;
import persons.tasks.taskDSL.ExpressionModulo;
import persons.tasks.taskDSL.ExpressionMultiply;
import persons.tasks.taskDSL.ExpressionPlus;
import persons.tasks.taskDSL.ExpressionPower;
import persons.tasks.taskDSL.ExpressionSubtraction;
import persons.tasks.taskDSL.IntExpression;
import persons.tasks.taskDSL.LunchAction;
import persons.tasks.taskDSL.MeetingAction;
import persons.tasks.taskDSL.PaperAction;
import persons.tasks.taskDSL.PaymentAction;
import persons.tasks.taskDSL.Person;
import persons.tasks.taskDSL.Planning;
import persons.tasks.taskDSL.Task;
import persons.tasks.taskDSL.TaskDSLFactory;
import persons.tasks.taskDSL.TaskDSLPackage;
import persons.tasks.taskDSL.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDSLPackageImpl extends EPackageImpl implements TaskDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass planningEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass durationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lunchActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass meetingActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paperActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paymentActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionMinusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionPlusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionBracketEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionConstantIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionBalanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionAdditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionSubtractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionMultiplyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionDivisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionMaximumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionMinimumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionModuloEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionPowerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum timeUnitEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum balanceEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see persons.tasks.taskDSL.TaskDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TaskDSLPackageImpl()
  {
    super(eNS_URI, TaskDSLFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TaskDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TaskDSLPackage init()
  {
    if (isInited) return (TaskDSLPackage)EPackage.Registry.INSTANCE.getEPackage(TaskDSLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTaskDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TaskDSLPackageImpl theTaskDSLPackage = registeredTaskDSLPackage instanceof TaskDSLPackageImpl ? (TaskDSLPackageImpl)registeredTaskDSLPackage : new TaskDSLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTaskDSLPackage.createPackageContents();

    // Initialize created meta-data
    theTaskDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTaskDSLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TaskDSLPackage.eNS_URI, theTaskDSLPackage);
    return theTaskDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPlanning()
  {
    return planningEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlanning_Name()
  {
    return (EAttribute)planningEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPlanning_Anonymous()
  {
    return (EAttribute)planningEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlanning_Persons()
  {
    return (EReference)planningEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlanning_Tasks()
  {
    return (EReference)planningEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPerson()
  {
    return personEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPerson_Name()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTask_Action()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTask_Persons()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTask_Prio()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTask_Duration()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDuration()
  {
    return durationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDuration_Dl()
  {
    return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDuration_Unit()
  {
    return (EAttribute)durationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLunchAction()
  {
    return lunchActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLunchAction_Location()
  {
    return (EAttribute)lunchActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMeetingAction()
  {
    return meetingActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMeetingAction_Topic()
  {
    return (EAttribute)meetingActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPaperAction()
  {
    return paperActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPaperAction_Report()
  {
    return (EAttribute)paperActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPaymentAction()
  {
    return paymentActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPaymentAction_Amount()
  {
    return (EReference)paymentActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntExpression()
  {
    return intExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionMinus()
  {
    return expressionMinusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionMinus_Sub()
  {
    return (EReference)expressionMinusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionPlus()
  {
    return expressionPlusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionPlus_Sub()
  {
    return (EReference)expressionPlusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionBracket()
  {
    return expressionBracketEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionBracket_Sub()
  {
    return (EReference)expressionBracketEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionConstantInt()
  {
    return expressionConstantIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExpressionConstantInt_Value()
  {
    return (EAttribute)expressionConstantIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionBalance()
  {
    return expressionBalanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getExpressionBalance_Value()
  {
    return (EAttribute)expressionBalanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionAddition()
  {
    return expressionAdditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionAddition_Left()
  {
    return (EReference)expressionAdditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionAddition_Right()
  {
    return (EReference)expressionAdditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionSubtraction()
  {
    return expressionSubtractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionSubtraction_Left()
  {
    return (EReference)expressionSubtractionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionSubtraction_Right()
  {
    return (EReference)expressionSubtractionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionMultiply()
  {
    return expressionMultiplyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionMultiply_Left()
  {
    return (EReference)expressionMultiplyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionMultiply_Right()
  {
    return (EReference)expressionMultiplyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionDivision()
  {
    return expressionDivisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionDivision_Left()
  {
    return (EReference)expressionDivisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionDivision_Right()
  {
    return (EReference)expressionDivisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionMaximum()
  {
    return expressionMaximumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionMaximum_Left()
  {
    return (EReference)expressionMaximumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionMaximum_Right()
  {
    return (EReference)expressionMaximumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionMinimum()
  {
    return expressionMinimumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionMinimum_Left()
  {
    return (EReference)expressionMinimumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionMinimum_Right()
  {
    return (EReference)expressionMinimumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionModulo()
  {
    return expressionModuloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionModulo_Left()
  {
    return (EReference)expressionModuloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionModulo_Right()
  {
    return (EReference)expressionModuloEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionPower()
  {
    return expressionPowerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionPower_Left()
  {
    return (EReference)expressionPowerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressionPower_Right()
  {
    return (EReference)expressionPowerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getTimeUnit()
  {
    return timeUnitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getBalance()
  {
    return balanceEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TaskDSLFactory getTaskDSLFactory()
  {
    return (TaskDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    planningEClass = createEClass(PLANNING);
    createEAttribute(planningEClass, PLANNING__NAME);
    createEAttribute(planningEClass, PLANNING__ANONYMOUS);
    createEReference(planningEClass, PLANNING__PERSONS);
    createEReference(planningEClass, PLANNING__TASKS);

    personEClass = createEClass(PERSON);
    createEAttribute(personEClass, PERSON__NAME);

    taskEClass = createEClass(TASK);
    createEReference(taskEClass, TASK__ACTION);
    createEReference(taskEClass, TASK__PERSONS);
    createEAttribute(taskEClass, TASK__PRIO);
    createEReference(taskEClass, TASK__DURATION);

    durationEClass = createEClass(DURATION);
    createEAttribute(durationEClass, DURATION__DL);
    createEAttribute(durationEClass, DURATION__UNIT);

    actionEClass = createEClass(ACTION);

    lunchActionEClass = createEClass(LUNCH_ACTION);
    createEAttribute(lunchActionEClass, LUNCH_ACTION__LOCATION);

    meetingActionEClass = createEClass(MEETING_ACTION);
    createEAttribute(meetingActionEClass, MEETING_ACTION__TOPIC);

    paperActionEClass = createEClass(PAPER_ACTION);
    createEAttribute(paperActionEClass, PAPER_ACTION__REPORT);

    paymentActionEClass = createEClass(PAYMENT_ACTION);
    createEReference(paymentActionEClass, PAYMENT_ACTION__AMOUNT);

    intExpressionEClass = createEClass(INT_EXPRESSION);

    expressionMinusEClass = createEClass(EXPRESSION_MINUS);
    createEReference(expressionMinusEClass, EXPRESSION_MINUS__SUB);

    expressionPlusEClass = createEClass(EXPRESSION_PLUS);
    createEReference(expressionPlusEClass, EXPRESSION_PLUS__SUB);

    expressionBracketEClass = createEClass(EXPRESSION_BRACKET);
    createEReference(expressionBracketEClass, EXPRESSION_BRACKET__SUB);

    expressionConstantIntEClass = createEClass(EXPRESSION_CONSTANT_INT);
    createEAttribute(expressionConstantIntEClass, EXPRESSION_CONSTANT_INT__VALUE);

    expressionBalanceEClass = createEClass(EXPRESSION_BALANCE);
    createEAttribute(expressionBalanceEClass, EXPRESSION_BALANCE__VALUE);

    expressionAdditionEClass = createEClass(EXPRESSION_ADDITION);
    createEReference(expressionAdditionEClass, EXPRESSION_ADDITION__LEFT);
    createEReference(expressionAdditionEClass, EXPRESSION_ADDITION__RIGHT);

    expressionSubtractionEClass = createEClass(EXPRESSION_SUBTRACTION);
    createEReference(expressionSubtractionEClass, EXPRESSION_SUBTRACTION__LEFT);
    createEReference(expressionSubtractionEClass, EXPRESSION_SUBTRACTION__RIGHT);

    expressionMultiplyEClass = createEClass(EXPRESSION_MULTIPLY);
    createEReference(expressionMultiplyEClass, EXPRESSION_MULTIPLY__LEFT);
    createEReference(expressionMultiplyEClass, EXPRESSION_MULTIPLY__RIGHT);

    expressionDivisionEClass = createEClass(EXPRESSION_DIVISION);
    createEReference(expressionDivisionEClass, EXPRESSION_DIVISION__LEFT);
    createEReference(expressionDivisionEClass, EXPRESSION_DIVISION__RIGHT);

    expressionMaximumEClass = createEClass(EXPRESSION_MAXIMUM);
    createEReference(expressionMaximumEClass, EXPRESSION_MAXIMUM__LEFT);
    createEReference(expressionMaximumEClass, EXPRESSION_MAXIMUM__RIGHT);

    expressionMinimumEClass = createEClass(EXPRESSION_MINIMUM);
    createEReference(expressionMinimumEClass, EXPRESSION_MINIMUM__LEFT);
    createEReference(expressionMinimumEClass, EXPRESSION_MINIMUM__RIGHT);

    expressionModuloEClass = createEClass(EXPRESSION_MODULO);
    createEReference(expressionModuloEClass, EXPRESSION_MODULO__LEFT);
    createEReference(expressionModuloEClass, EXPRESSION_MODULO__RIGHT);

    expressionPowerEClass = createEClass(EXPRESSION_POWER);
    createEReference(expressionPowerEClass, EXPRESSION_POWER__LEFT);
    createEReference(expressionPowerEClass, EXPRESSION_POWER__RIGHT);

    // Create enums
    timeUnitEEnum = createEEnum(TIME_UNIT);
    balanceEEnum = createEEnum(BALANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    lunchActionEClass.getESuperTypes().add(this.getAction());
    meetingActionEClass.getESuperTypes().add(this.getAction());
    paperActionEClass.getESuperTypes().add(this.getAction());
    paymentActionEClass.getESuperTypes().add(this.getAction());
    expressionMinusEClass.getESuperTypes().add(this.getIntExpression());
    expressionPlusEClass.getESuperTypes().add(this.getIntExpression());
    expressionBracketEClass.getESuperTypes().add(this.getIntExpression());
    expressionConstantIntEClass.getESuperTypes().add(this.getIntExpression());
    expressionBalanceEClass.getESuperTypes().add(this.getIntExpression());
    expressionAdditionEClass.getESuperTypes().add(this.getIntExpression());
    expressionSubtractionEClass.getESuperTypes().add(this.getIntExpression());
    expressionMultiplyEClass.getESuperTypes().add(this.getIntExpression());
    expressionDivisionEClass.getESuperTypes().add(this.getIntExpression());
    expressionMaximumEClass.getESuperTypes().add(this.getIntExpression());
    expressionMinimumEClass.getESuperTypes().add(this.getIntExpression());
    expressionModuloEClass.getESuperTypes().add(this.getIntExpression());
    expressionPowerEClass.getESuperTypes().add(this.getIntExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(planningEClass, Planning.class, "Planning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlanning_Name(), ecorePackage.getEString(), "name", null, 0, 1, Planning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlanning_Anonymous(), ecorePackage.getEBoolean(), "anonymous", null, 0, 1, Planning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlanning_Persons(), this.getPerson(), null, "persons", null, 0, -1, Planning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlanning_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Planning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTask_Action(), this.getAction(), null, "action", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Persons(), this.getPerson(), null, "persons", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Prio(), ecorePackage.getEInt(), "prio", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Duration(), this.getDuration(), null, "duration", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDuration_Dl(), ecorePackage.getEInt(), "dl", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDuration_Unit(), this.getTimeUnit(), "unit", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lunchActionEClass, LunchAction.class, "LunchAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLunchAction_Location(), ecorePackage.getEString(), "location", null, 0, 1, LunchAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(meetingActionEClass, MeetingAction.class, "MeetingAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMeetingAction_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, MeetingAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paperActionEClass, PaperAction.class, "PaperAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPaperAction_Report(), ecorePackage.getEString(), "report", null, 0, 1, PaperAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paymentActionEClass, PaymentAction.class, "PaymentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPaymentAction_Amount(), this.getIntExpression(), null, "amount", null, 0, 1, PaymentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intExpressionEClass, IntExpression.class, "IntExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionMinusEClass, ExpressionMinus.class, "ExpressionMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionMinus_Sub(), this.getIntExpression(), null, "sub", null, 0, 1, ExpressionMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionPlusEClass, ExpressionPlus.class, "ExpressionPlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionPlus_Sub(), this.getIntExpression(), null, "sub", null, 0, 1, ExpressionPlus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionBracketEClass, ExpressionBracket.class, "ExpressionBracket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionBracket_Sub(), this.getIntExpression(), null, "sub", null, 0, 1, ExpressionBracket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionConstantIntEClass, ExpressionConstantInt.class, "ExpressionConstantInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressionConstantInt_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ExpressionConstantInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionBalanceEClass, ExpressionBalance.class, "ExpressionBalance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressionBalance_Value(), this.getBalance(), "value", null, 0, 1, ExpressionBalance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionAdditionEClass, ExpressionAddition.class, "ExpressionAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionAddition_Left(), this.getIntExpression(), null, "left", null, 0, 1, ExpressionAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionAddition_Right(), this.getIntExpression(), null, "right", null, 0, 1, ExpressionAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionSubtractionEClass, ExpressionSubtraction.class, "ExpressionSubtraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionSubtraction_Left(), this.getIntExpression(), null, "left", null, 0, 1, ExpressionSubtraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionSubtraction_Right(), this.getIntExpression(), null, "right", null, 0, 1, ExpressionSubtraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionMultiplyEClass, ExpressionMultiply.class, "ExpressionMultiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionMultiply_Left(), this.getIntExpression(), null, "left", null, 0, 1, ExpressionMultiply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionMultiply_Right(), this.getIntExpression(), null, "right", null, 0, 1, ExpressionMultiply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionDivisionEClass, ExpressionDivision.class, "ExpressionDivision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionDivision_Left(), this.getIntExpression(), null, "left", null, 0, 1, ExpressionDivision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionDivision_Right(), this.getIntExpression(), null, "right", null, 0, 1, ExpressionDivision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionMaximumEClass, ExpressionMaximum.class, "ExpressionMaximum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionMaximum_Left(), this.getIntExpression(), null, "left", null, 0, 1, ExpressionMaximum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionMaximum_Right(), this.getIntExpression(), null, "right", null, 0, 1, ExpressionMaximum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionMinimumEClass, ExpressionMinimum.class, "ExpressionMinimum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionMinimum_Left(), this.getIntExpression(), null, "left", null, 0, 1, ExpressionMinimum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionMinimum_Right(), this.getIntExpression(), null, "right", null, 0, 1, ExpressionMinimum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionModuloEClass, ExpressionModulo.class, "ExpressionModulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionModulo_Left(), this.getIntExpression(), null, "left", null, 0, 1, ExpressionModulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionModulo_Right(), this.getIntExpression(), null, "right", null, 0, 1, ExpressionModulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionPowerEClass, ExpressionPower.class, "ExpressionPower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionPower_Left(), this.getIntExpression(), null, "left", null, 0, 1, ExpressionPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionPower_Right(), this.getIntExpression(), null, "right", null, 0, 1, ExpressionPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
    addEEnumLiteral(timeUnitEEnum, TimeUnit.MINUTE);
    addEEnumLiteral(timeUnitEEnum, TimeUnit.HOUR);
    addEEnumLiteral(timeUnitEEnum, TimeUnit.DAY);
    addEEnumLiteral(timeUnitEEnum, TimeUnit.WEEK);

    initEEnum(balanceEEnum, Balance.class, "Balance");
    addEEnumLiteral(balanceEEnum, Balance.BALANCE);

    // Create resource
    createResource(eNS_URI);
  }

} //TaskDSLPackageImpl
