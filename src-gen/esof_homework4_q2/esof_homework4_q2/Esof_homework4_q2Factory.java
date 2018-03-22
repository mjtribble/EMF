/**
 */
package esof_homework4_q2.esof_homework4_q2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see esof_homework4_q2.esof_homework4_q2.Esof_homework4_q2Package
 * @generated
 */
public interface Esof_homework4_q2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Esof_homework4_q2Factory eINSTANCE = esof_homework4_q2.esof_homework4_q2.impl.Esof_homework4_q2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Purchase Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purchase Order</em>'.
	 * @generated
	 */
	PurchaseOrder createPurchaseOrder();

	/**
	 * Returns a new object of class '<em>US Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>US Address</em>'.
	 * @generated
	 */
	USAddress createUSAddress();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Esof_homework4_q2Package getEsof_homework4_q2Package();

} //Esof_homework4_q2Factory
