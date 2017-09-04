package sweat.like.a.pro.singleton.breaking;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class BreakUsingReflectionSolution {

	public static void main(String[] args) throws Exception {
		Class<DatabaseConnection> clazz = (Class<DatabaseConnection>) Class.forName("sweat.like.a.pro.singleton.breaking.DatabaseConnection");
		
		Constructor<DatabaseConnection>[] constructors = (Constructor<DatabaseConnection>[]) clazz.getDeclaredConstructors();
		
		Constructor<DatabaseConnection> con = constructors[0];
		
		con.setAccessible(true);
		
		DatabaseConnection instance = con.newInstance(null);
		System.out.println("hashcode : "+con.hashCode());
		
		DatabaseConnection connection = DatabaseConnection.getConnection();
		System.out.println("hashcode : "+connection.hashCode());
		
	}
			
}

class DatabaseConnection
{
	private static DatabaseConnection connection;

	private DatabaseConnection() throws Exception {
		if(connection == null){
			/*
			 *	Throw an exception if someone tries to create DatabaseConnection instance by any other means. 
			 */
			throw new Exception("Cannot Create Instance Using Constructor. Use getConnection() method.");
		}
	}

	public static DatabaseConnection getConnection() throws Exception{
		if(connection == null){
			System.out.println("Creating Connection");
			System.out.println("****** This will be once in entire life of this app.******");
			connection = new DatabaseConnection();
		}
		
		return connection;
	}
}
