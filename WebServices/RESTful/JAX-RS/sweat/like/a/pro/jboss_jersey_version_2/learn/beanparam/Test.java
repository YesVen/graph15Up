package like.a.pro.jboss_jersey_version_2.learn.beanparam;

import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Test {

	public Test(String string, String string2) {
		fname = string;
		lname = string2;
	}
	
	public Test()
	{
		super();
	}

	@QueryParam("fname")
	String fname;
	
	@QueryParam("lname")
	String lname;
	
}
