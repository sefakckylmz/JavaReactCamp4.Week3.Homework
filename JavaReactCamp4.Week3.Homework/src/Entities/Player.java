package Entities;

import java.util.Date;

import Abstract.Entity;

public class Player implements Entity{
	private int id;
	 private String firstname;
	 private String lastname;
	 private Date 	DateofBirth;
	 private String NationalityId;
	 //entities varlýklar için kullanýlýr. 
	public Player(int id, String firstname, String lastname, Date dateofBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		DateofBirth = dateofBirth;
		NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateofBirth() {
		return DateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		DateofBirth = dateofBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
}
