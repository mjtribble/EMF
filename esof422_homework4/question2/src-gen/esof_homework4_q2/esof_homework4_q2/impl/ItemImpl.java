/**
 */
package esof_homework4_q2.esof_homework4_q2.impl;

import esof_homework4_q2.esof_homework4_q2.Esof_homework4_q2Package;
import esof_homework4_q2.esof_homework4_q2.Item;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.impl.ItemImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.impl.ItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.impl.ItemImpl#getUSPrice <em>US Price</em>}</li>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.impl.ItemImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.impl.ItemImpl#getShipDate <em>Ship Date</em>}</li>
 *   <li>{@link esof_homework4_q2.esof_homework4_q2.impl.ItemImpl#getPartNum <em>Part Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUSPrice() <em>US Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int US_PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUSPrice() <em>US Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSPrice()
	 * @generated
	 * @ordered
	 */
	protected int usPrice = US_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipDate() <em>Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SHIP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipDate() <em>Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipDate()
	 * @generated
	 * @ordered
	 */
	protected Date shipDate = SHIP_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartNum() <em>Part Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNum()
	 * @generated
	 * @ordered
	 */
	protected Object partNum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Esof_homework4_q2Package.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework4_q2Package.ITEM__PRODUCT_NAME,
					oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework4_q2Package.ITEM__QUANTITY, oldQuantity,
					quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUSPrice() {
		return usPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUSPrice(int newUSPrice) {
		int oldUSPrice = usPrice;
		usPrice = newUSPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework4_q2Package.ITEM__US_PRICE, oldUSPrice,
					usPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework4_q2Package.ITEM__COMMENT, oldComment,
					comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getShipDate() {
		return shipDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipDate(Date newShipDate) {
		Date oldShipDate = shipDate;
		shipDate = newShipDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework4_q2Package.ITEM__SHIP_DATE, oldShipDate,
					shipDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPartNum() {
		return partNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartNum(Object newPartNum) {
		Object oldPartNum = partNum;
		partNum = newPartNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework4_q2Package.ITEM__PART_NUM, oldPartNum,
					partNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Esof_homework4_q2Package.ITEM__PRODUCT_NAME:
			return getProductName();
		case Esof_homework4_q2Package.ITEM__QUANTITY:
			return getQuantity();
		case Esof_homework4_q2Package.ITEM__US_PRICE:
			return getUSPrice();
		case Esof_homework4_q2Package.ITEM__COMMENT:
			return getComment();
		case Esof_homework4_q2Package.ITEM__SHIP_DATE:
			return getShipDate();
		case Esof_homework4_q2Package.ITEM__PART_NUM:
			return getPartNum();
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
		case Esof_homework4_q2Package.ITEM__PRODUCT_NAME:
			setProductName((String) newValue);
			return;
		case Esof_homework4_q2Package.ITEM__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case Esof_homework4_q2Package.ITEM__US_PRICE:
			setUSPrice((Integer) newValue);
			return;
		case Esof_homework4_q2Package.ITEM__COMMENT:
			setComment((String) newValue);
			return;
		case Esof_homework4_q2Package.ITEM__SHIP_DATE:
			setShipDate((Date) newValue);
			return;
		case Esof_homework4_q2Package.ITEM__PART_NUM:
			setPartNum(newValue);
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
		case Esof_homework4_q2Package.ITEM__PRODUCT_NAME:
			setProductName(PRODUCT_NAME_EDEFAULT);
			return;
		case Esof_homework4_q2Package.ITEM__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case Esof_homework4_q2Package.ITEM__US_PRICE:
			setUSPrice(US_PRICE_EDEFAULT);
			return;
		case Esof_homework4_q2Package.ITEM__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case Esof_homework4_q2Package.ITEM__SHIP_DATE:
			setShipDate(SHIP_DATE_EDEFAULT);
			return;
		case Esof_homework4_q2Package.ITEM__PART_NUM:
			setPartNum((Object) null);
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
		case Esof_homework4_q2Package.ITEM__PRODUCT_NAME:
			return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
		case Esof_homework4_q2Package.ITEM__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case Esof_homework4_q2Package.ITEM__US_PRICE:
			return usPrice != US_PRICE_EDEFAULT;
		case Esof_homework4_q2Package.ITEM__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case Esof_homework4_q2Package.ITEM__SHIP_DATE:
			return SHIP_DATE_EDEFAULT == null ? shipDate != null : !SHIP_DATE_EDEFAULT.equals(shipDate);
		case Esof_homework4_q2Package.ITEM__PART_NUM:
			return partNum != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (productName: ");
		result.append(productName);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", USPrice: ");
		result.append(usPrice);
		result.append(", comment: ");
		result.append(comment);
		result.append(", shipDate: ");
		result.append(shipDate);
		result.append(", partNum: ");
		result.append(partNum);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
