/**
 * generated by Xtext 2.32.0
 */
package persons.tasks.taskDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see persons.tasks.taskDSL.TaskDSLPackage
 * @generated
 */
public interface TaskDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TaskDSLFactory eINSTANCE = persons.tasks.taskDSL.impl.TaskDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Planning</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Planning</em>'.
   * @generated
   */
  Planning createPlanning();

  /**
   * Returns a new object of class '<em>Person</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Person</em>'.
   * @generated
   */
  Person createPerson();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Duration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Duration</em>'.
   * @generated
   */
  Duration createDuration();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Lunch Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lunch Action</em>'.
   * @generated
   */
  LunchAction createLunchAction();

  /**
   * Returns a new object of class '<em>Meeting Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meeting Action</em>'.
   * @generated
   */
  MeetingAction createMeetingAction();

  /**
   * Returns a new object of class '<em>Paper Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paper Action</em>'.
   * @generated
   */
  PaperAction createPaperAction();

  /**
   * Returns a new object of class '<em>Payment Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Payment Action</em>'.
   * @generated
   */
  PaymentAction createPaymentAction();

  /**
   * Returns a new object of class '<em>Int Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Expression</em>'.
   * @generated
   */
  IntExpression createIntExpression();

  /**
   * Returns a new object of class '<em>Expression Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Minus</em>'.
   * @generated
   */
  ExpressionMinus createExpressionMinus();

  /**
   * Returns a new object of class '<em>Expression Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Plus</em>'.
   * @generated
   */
  ExpressionPlus createExpressionPlus();

  /**
   * Returns a new object of class '<em>Expression Bracket</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Bracket</em>'.
   * @generated
   */
  ExpressionBracket createExpressionBracket();

  /**
   * Returns a new object of class '<em>Expression Constant Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Constant Int</em>'.
   * @generated
   */
  ExpressionConstantInt createExpressionConstantInt();

  /**
   * Returns a new object of class '<em>Expression Balance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Balance</em>'.
   * @generated
   */
  ExpressionBalance createExpressionBalance();

  /**
   * Returns a new object of class '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expression</em>'.
   * @generated
   */
  BooleanExpression createBooleanExpression();

  /**
   * Returns a new object of class '<em>Not Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Expression</em>'.
   * @generated
   */
  NotExpression createNotExpression();

  /**
   * Returns a new object of class '<em>Boolean Expression Bracket</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expression Bracket</em>'.
   * @generated
   */
  BooleanExpressionBracket createBooleanExpressionBracket();

  /**
   * Returns a new object of class '<em>Boolean Expression Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expression Constant</em>'.
   * @generated
   */
  BooleanExpressionConstant createBooleanExpressionConstant();

  /**
   * Returns a new object of class '<em>Expression Addition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Addition</em>'.
   * @generated
   */
  ExpressionAddition createExpressionAddition();

  /**
   * Returns a new object of class '<em>Expression Subtraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Subtraction</em>'.
   * @generated
   */
  ExpressionSubtraction createExpressionSubtraction();

  /**
   * Returns a new object of class '<em>Expression Multiply</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Multiply</em>'.
   * @generated
   */
  ExpressionMultiply createExpressionMultiply();

  /**
   * Returns a new object of class '<em>Expression Division</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Division</em>'.
   * @generated
   */
  ExpressionDivision createExpressionDivision();

  /**
   * Returns a new object of class '<em>Expression Maximum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Maximum</em>'.
   * @generated
   */
  ExpressionMaximum createExpressionMaximum();

  /**
   * Returns a new object of class '<em>Expression Minimum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Minimum</em>'.
   * @generated
   */
  ExpressionMinimum createExpressionMinimum();

  /**
   * Returns a new object of class '<em>Expression Modulo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Modulo</em>'.
   * @generated
   */
  ExpressionModulo createExpressionModulo();

  /**
   * Returns a new object of class '<em>Expression Power</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Power</em>'.
   * @generated
   */
  ExpressionPower createExpressionPower();

  /**
   * Returns a new object of class '<em>Expression Bin Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Bin Op</em>'.
   * @generated
   */
  ExpressionBinOp createExpressionBinOp();

  /**
   * Returns a new object of class '<em>Expression Comp Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Comp Op</em>'.
   * @generated
   */
  ExpressionCompOp createExpressionCompOp();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TaskDSLPackage getTaskDSLPackage();

} //TaskDSLFactory
