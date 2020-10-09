package Training;

public class UserInfo {
	
	String name;
	String DOB;
	String country;

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public void setDOB(String dob) {
		// TODO Auto-generated method stub
		this.DOB = dob;
	}

	public void setCountry(String country) {
		// TODO Auto-generated method stub
		this.country = country;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDOB(){
		return DOB;
	}
	
	public String getCountry(){
		return country;
	}
	
	public boolean equals(UserInfo user){
		return this.name.equals(user.getName()) &&
		this.DOB.equals(user.getDOB())&&
		this.country.equals(user.getCountry());
	}
}
