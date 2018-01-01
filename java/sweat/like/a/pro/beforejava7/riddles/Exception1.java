package sweat.like.a.pro.beforejava7.riddles;

/*
 * Its ok to have just try/finally block.
 * We can skip the catch block if we have finally accompanying try
 * 
 * Finally will not run only in case of
 * 		JVM crash
 * 		System.exit(0)
 *		?? 
 */
public class Exception1 {
	public static void main(String[] args) {
		try {
			return;
		} finally {
			System.out.println("Will this print?");
		}
	}
}
