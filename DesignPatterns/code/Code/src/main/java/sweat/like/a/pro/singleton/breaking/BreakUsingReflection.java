package sweat.like.a.pro.singleton.breaking;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class BreakUsingReflection {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<DBConnection> clazz = (Class<DBConnection>) Class.forName("sweat.like.a.pro.singleton.breaking.DBConnection");
		
		Constructor<DBConnection>[] constructors = (Constructor<DBConnection>[]) clazz.getDeclaredConstructors();
		
		Constructor<DBConnection> con = constructors[0];
		
		con.setAccessible(true);
		
		DBConnection instance = con.newInstance(null);
		System.out.println("hashcode : "+con.hashCode());
		
		DBConnection connection = DBConnection.getConnection();
		System.out.println("hashcode : "+connection.hashCode());
		
	}
			
}

class DBConnection
{
	private static DBConnection connection;

	private DBConnection() {
		
	}

	public static DBConnection getConnection(){
		if(connection == null){
			System.out.println("Creating Connection");
			System.out.println("****** This will be once in entire life of this app.******");
			connection = new DBConnection();
		}
		
		return connection;
	}
}
