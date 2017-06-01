package sweat.like.a.pro.beforejava7.riddles.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 *
 */
public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		
		prop.load(new FileInputStream("java/sweat/like/a/pro/beforejava7/riddles/collection/abc.properties"));
		
		System.out.println(prop);
		
		String ff = prop.getProperty("name");
		
		
		prop.store(new FileOutputStream("java/sweat/like/a/pro/beforejava7/riddles/collection/abc.properties"), "Adding new k/v pair");
		
		System.out.println(prop);
	}
}
