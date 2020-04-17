package ExcdptinHandling;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionsdemo {

	public static void main(String[] args) throws IOException {

		// checkedExceptionDemo();

		try {
			myOwnExceptionDemo(150);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}

	}

	private static void myOwnExceptionDemo(int age) throws InvalidAgeException, NullPointerException {
		if (age < 0 || age > 100) {
			throw new InvalidAgeException();
		}
		if (age < 50) {
			throw new NullPointerException();
		}

	}

	private static void checkedExceptionDemo() throws IOException {
		System.out.println("starting of main method");

		// System.out.println(10/0);
		String location = "I:/Users/Donepudi/Desktop/files/dmo.txt";
		File fileobj = new File(location);
		fileobj.createNewFile();

		System.out.println("ending of main method");
	}

}
