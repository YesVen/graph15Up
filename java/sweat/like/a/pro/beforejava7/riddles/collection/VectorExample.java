package sweat.like.a.pro.beforejava7.riddles.collection;

import java.util.Vector;
/**
 * See line no 30 and 31
 * @author Nightfury
 *
 */
public class VectorExample {
	public static void main(String[] args) {
		
		//Vector is synchronized collection
		//Vector implements RandomAccess Interface hence retrieval speed is fast no matter size of vector
		
		Vector<String> v = new Vector<>();
		v.addElement("one"); // VEctor's own method
		v.add("Two"); // inherited from List interface
		
		
		v.removeAllElements();//VEctor's own method
		v.clear();// inherited from List interface
		
		//vector grows its capacity by double every time. And its dangerous for memory
		//so it gave us constructor to specify how much should it grow after capacity exahaustion
		
		Vector<String> v1 = new Vector<>(20, 1/2);
		System.out.println(v1.capacity());
		
		//capacity and size comparision
		System.out.println(v1.capacity());
		System.out.println(v1.size());
	}
	
}
