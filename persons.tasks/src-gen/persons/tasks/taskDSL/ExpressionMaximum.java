/**
 * generated by Xtext 2.32.0
 */
package persons.tasks.taskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Maximum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.ExpressionMaximum#getLeft <em>Left</em>}</li>
 *   <li>{@link persons.tasks.taskDSL.ExpressionMaximum#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see persons.tasks.taskDSL.TaskDSLPackage#getExpressionMaximum()
 * @model
 * @generated
 */
public interface ExpressionMaximum extends IntExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(IntExpression)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getExpressionMaximum_Left()
   * @model containment="true"
   * @generated
   */
  IntExpression getLeft();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.ExpressionMaximum#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(IntExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(IntExpression)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getExpressionMaximum_Right()
   * @model containment="true"
   * @generated
   */
  IntExpression getRight();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.ExpressionMaximum#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(IntExpression value);

} // ExpressionMaximum
