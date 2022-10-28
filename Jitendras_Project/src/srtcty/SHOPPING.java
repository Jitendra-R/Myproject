package srtcty;
public class SHOPPING 
{
 private String productname,productname2,productname3;
private String comapanyname,comapanyname2,companyname3;
 private int quantity,quantity2,quantity3;
 private long cost,cost2,cost3;
 private long totalcost;
 
 public SHOPPING()
 {
 	
 }
 public SHOPPING(String productname, String productname2, String productname3, String comapanyname, String comapanyname2,
 			String companyname3, int quantity, int quantity2, int quantity3, long cost, long cost2, long cost3,
 			long totalcost) {
 		super();
 		this.productname = productname;
 		this.productname2 = productname2;
 		this.productname3 = productname3;
 		this.comapanyname = comapanyname;
 		this.comapanyname2 = comapanyname2;
 		this.companyname3 = companyname3;
 		this.quantity = quantity;
 		this.quantity2 = quantity2;
 		this.quantity3 = quantity3;
 		this.cost = cost;
 		this.cost2 = cost2;
 		this.cost3 = cost3;
 		this.totalcost = totalcost;
 	}
 public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getProductname2() {
	return productname2;
}
public void setProductname2(String productname2) {
	this.productname2 = productname2;
}
public String getProductname3() {
	return productname3;
}
public void setProductname3(String productname3) {
	this.productname3 = productname3;
}
public String getComapanyname() {
	return comapanyname;
}
public void setComapanyname(String comapanyname) {
	this.comapanyname = comapanyname;
}
public String getComapanyname2() {
	return comapanyname2;
}
public void setComapanyname2(String comapanyname2) {
	this.comapanyname2 = comapanyname2;
}
public String getCompanyname3() {
	return companyname3;
}
public void setCompanyname3(String companyname3) {
	this.companyname3 = companyname3;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getQuantity2() {
	return quantity2;
}
public void setQuantity2(int quantity2) {
	this.quantity2 = quantity2;
}
public int getQuantity3() {
	return quantity3;
}
public void setQuantity3(int quantity3) {
	this.quantity3 = quantity3;
}
public long getCost() {
	return cost;
}
public void setCost(long cost) {
	this.cost = cost;
}
public long getCost2() {
	return cost2;
}
public void setCost2(long cost2) {
	this.cost2 = cost2;
}
public long getCost3() {
	return cost3;
}
public void setCost3(long cost3) {
	this.cost3 = cost3;
}
public long getTotalcost() {
	return totalcost;
}
public void setTotalcost(long totalcost) {
	this.totalcost = totalcost;
}
 
}