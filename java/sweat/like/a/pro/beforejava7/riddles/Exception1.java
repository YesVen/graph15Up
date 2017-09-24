package sweat.like.a.pro.beforejava7.riddles;

public class Exception1 {
	public static void main(String[] args) {
		try {
			return;
		} finally {
			System.out.println("Will this print?");
		}
	}
}
