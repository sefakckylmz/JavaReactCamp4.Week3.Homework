package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignName;
	private double discountPercant;
	
	public Campaign(int id, String campaignName, double discountPercant) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPercant = discountPercant;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountPercant() {
		return discountPercant;
	}

	public void setDiscountPercant(double discountPercant) {
		this.discountPercant = discountPercant;
	}
}
