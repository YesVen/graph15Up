package like.a.pro.jboss_jersey_version_2.learn;

public class Test {

	public Test(String string, String string2) {
		fname = string;
		lname = string2;
	}
	
	public Test()
	{
		super();
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	String fname;
	
	String lname;
	
	
	
}
