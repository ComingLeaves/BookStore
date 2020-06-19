package utils;

import java.util.ArrayList;

public class order {
	private String oid;
	private int uid;
	private String totalprice;
	private String receiverName;
	private String receiverAddress;
	private String receiverPhone;
	private String paytime;
	private String orderstate;
	private ArrayList<item> list;
	private String ordertime;
	
	
	public String getPaytime() {
		return paytime;
	}
	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}
	public String getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public int getUid() {
		return uid;
	}
	public ArrayList<item> getList() {
		return list;
	}
	public void setList(ArrayList<item> list) {
		this.list = list;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	@Override
	public String toString() {
		return "order [totalprice=" + totalprice + ", receiverName="
				+ receiverName + ", receiverAddress=" + receiverAddress
				+ ", receiverPhone=" + receiverPhone + ", ordertime="
				+ ordertime + "]";
	}
	

}
