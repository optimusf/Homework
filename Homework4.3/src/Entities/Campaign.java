package Entities;

import Abstracts.IEntity;

public class Campaign implements IEntity {
	
	private int discount;
	private String comment;
	
	public Campaign() {
		
	}
	
	public Campaign(int discount, String comment) {
		super();
		this.discount = discount;
		this.comment = comment;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	

}
