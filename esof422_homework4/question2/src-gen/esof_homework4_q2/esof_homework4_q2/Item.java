/**
 */
package esof_homework4_q2.esof_homework4_q2;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.Item#getProductName <em>Product Name</em>}</li>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.Item#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.Item#getUSPrice <em>US Price</em>}</li>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.Item#getComment <em>Comment</em>}</li>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.Item#getShipDate <em>Ship Date</em>}</li>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.Item#getPartNum <em>Part Num</em>}</li>
 * </ul>
 *
 * @see esof_homework4_q2.esof_homework4_q2.Esof_homework4_q2Package#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see esof_homework4_q2.esof_homework4_q2.Esof_homework4_q2Package#getItem_ProductName()
	 * @model
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link esof_homework4_q2.esof_homework4_q2.Item#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see esof_homework4_q2.esof_homework4_q2.Esof_homework4_q2Package#getItem_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link esof_homework4_q2.esof_homework4_q2.Item#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>US Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>US Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>US Price</em>' attribute.
	 * @see #setUSPrice(int)
	 * @see esof_homework4_q2.esof_homework4_q2.Esof_homework4_q2Package#getItem_USPrice()
	 * @model
	 * @generated
	 */
	int getUSPrice();

	/**
	 * Sets the value of the '{@link esof_homework4_q2.esof_homework4_q2.Item#getUSPrice <em>US Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>US Price</em>' attribute.
	 * @see #getUSPrice()
	 * @generated
	 */
	void setUSPrice(int value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see esof_homework4_q2.esof_homework4_q2.Esof_homework4_q2Package#getItem_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link esof_homework4_q2.esof_homework4_q2.Item#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Date</em>' attribute.
	 * @see #setShipDate(Date)
	 * @see esof_homework4_q2.esof_homework4_q2.Esof_homework4_q2Package#getItem_ShipDate()
	 * @model dataType="esof_homework4_q2.esof_homework4_q2.Date"
	 * @generated
	 */
	Date getShipDate();

	/**
	 * Sets the value of the '{@link esof_homework4_q2.esof_homework4_q2.Item#getShipDate <em>Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Date</em>' attribute.
	 * @see #getShipDate()
	 * @generated
	 */
	void setShipDate(Date value);

	/**
	 * Returns the value of the '<em><b>Part Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Num</em>' attribute.
	 * @see #setPartNum(Object)
	 * @see esof_homework4_q2.esof_homework4_q2.Esof_homework4_q2Package#getItem_PartNum()
	 * @model dataType="esof_homework4_q2.esof_homework4_q2.SKU"
	 * @generated
	 */
	Object getPartNum();

	/**
	 * Sets the value of the '{@link esof_homework4_q2.esof_homework4_q2.Item#getPartNum <em>Part Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Num</em>' attribute.
	 * @see #getPartNum()
	 * @generated
	 */
	void setPartNum(Object value);

} // Item
