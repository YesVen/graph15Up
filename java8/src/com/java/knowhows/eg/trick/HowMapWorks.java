package com.java.knowhows.eg.trick;

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
	 
	        System.out.println(hashMap.size() + "   size of hashmap");
	 
	        Set<Employee> keySet = hashMap.keySet();
	 
	        for (Employee employee2 : keySet) {
	            System.out.println(hashMap.get(employee2));
	        }
	    }



}
