/**
 * generated by Xtext 2.32.0
 */
package persons.tasks.taskDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link persons.tasks.taskDSL.PaymentAction#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see persons.tasks.taskDSL.TaskDSLPackage#getPaymentAction()
 * @model
 * @generated
 */
public interface PaymentAction extends Action
{
  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(int)
   * @see persons.tasks.taskDSL.TaskDSLPackage#getPaymentAction_Amount()
   * @model
   * @generated
   */
  int getAmount();

  /**
   * Sets the value of the '{@link persons.tasks.taskDSL.PaymentAction#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(int value);

} // PaymentAction
