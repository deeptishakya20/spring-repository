package com.example.onetoonemappingjpa.person;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.onetoonemappingjpa.profile.Profile;


@Entity
public class Person {
	
	@Id
	private int PersonId;
	private String PersonName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Profile profile;

	public Person() {
		super();
	}

	public Person(int personId, String personName, Profile Profile) {
		super();
		PersonId = personId;
		PersonName = personName;
		profile = Profile;
		
	}


	public int getPersonId() {
		return PersonId;
	}



	public void setPersonId(int personId) {
		PersonId = personId;
	}



	public String getPersonName() {
		return PersonName;
	}



	public void setPersonName(String personName) {
		PersonName = personName;
	}

	
  
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
	
    public String toString() {
    	return PersonId+" "+PersonName+" "+profile;
    }

}