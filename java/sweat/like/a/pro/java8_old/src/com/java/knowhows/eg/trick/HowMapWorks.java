package sweat.like.a.pro.java8_old.src.com.java.knowhows.eg.trick;

import java.util.HashMap;
import java.util.Set;


class Employee {
 
    @Override
    public int hashCode() {     
        return 20;
    }
 
    @Override
    public boolean equals(Object obj) {
        return false;
    }
 
}
 
 


public class HowMapWorks {

	 public static void main(String[] args) {
	        Employee employee = new Employee();
	        Employee employee1 = new Employee();
	 
	        System.out.println(employee == employee);//references are pointing to same address so same
	        
	        System.out.println("asdasdas" == "asdasdas");
	        
	        HashMap<Employee, String> hashMap = new HashMap<Employee, String>();
	        hashMap.put(employee, "employee1");
	        hashMap.put(employee1, "employee2");
	        hashMap.put(employee, "employee3");
	 
	        /*
	         * The size of hashmap is 2 because, 
	         * We are returning false from equals of Employee and we are putting same employee object twice.
	         * So ideally it should allow us to add same objects twice.
	         * 
	         * But thing is hashmap first does reference check to see if objects are same and then it calls equals method.
	         * Here in our case, 
	         * line 35, employee willbe put in map
	         * line 36, hashmap will check if employee and employee1 are reference to same object or not. They are not so insert it.
	         * line 37, check if reference is same or not. Same, so overwrite the found match.
	         * 
	         * Hence size 2
	         */
	        System.out.println(hashMap.size() + "   size of hashmap");
	 
	        Set<Employee> keySet = hashMap.keySet();
	 
	        for (Employee employee2 : keySet) {
	            System.out.println(hashMap.get(employee2));
	        }
	    }



}
