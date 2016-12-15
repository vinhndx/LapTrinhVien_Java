package com.t3h.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the order_records database table.
 * 
 */
@Entity
@Table(name="order_records")
@NamedQuery(name="OrderRecord.findAll", query="SELECT o FROM OrderRecord o")
public class OrderRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cust_email")
	private String custEmail;

	@Column(name="cust_name")
	private String custName;

	@Column(name="cust_phone")
	private String custPhone;

	@Id
	private int id;

	@Column(name="qty_ordered")
	private int qtyOrdered;

	public OrderRecord() {
	}

	public String getCustEmail() {
		return this.custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPhone() {
		return this.custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQtyOrdered() {
		return this.qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

}