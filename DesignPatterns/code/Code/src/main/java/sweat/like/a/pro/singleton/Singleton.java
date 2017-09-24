package sweat.like.a.pro.singleton;

public class Singleton {

	public static void main(String[] args) {
		DBConnection connection = DBConnection.getConnection();
		
		
		
		
		
		/*
		 * Only one instance per JVM
		 * This will not create new connection but reuse the same connection object which is singleton
		 */
		DBConnection connection2 = DBConnection.getConnection();
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
		
		System.out.println("hashcode : "+connection.hashCode());
		return connection;
	}
}