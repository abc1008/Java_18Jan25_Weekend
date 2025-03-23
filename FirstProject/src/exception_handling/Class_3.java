package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_3 {

	public static void m1(int num) {
		System.out.println(num);

		if (num > 0) {
			num = num + 1; // 6, 7
			m1(num); // 6, 7
		}
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {

		m1(5);
		System.out.println("After m1 call");

	}

}
