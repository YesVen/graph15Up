package sweat.like.a.pro.beforejava7.riddles.ootb;
/*
 * String is stored in heap memory as an object
 * 
 * If we create string using the literal notation, object is created on heap and a reference to that location
 * will be stored in string constant pool
 * 
 * If we use new operator to create string object, new object will be created on heap.
 * 
 * IMP : 
 * For literal notation, java checks if same object is being referenced from String pool if yes, 
 * it returns the reference to already created object
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        String s3 = new String("a");
        System.out.println("s1: "+s1.hashCode());
        System.out.println("s2: "+s2.hashCode());
        System.out.println("s3: "+s3.hashCode());
    }
}