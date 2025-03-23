package testpack1;

public class Arrays {

	public static void main(String[] args) {

		try {
//			SYNTAX: 

//			1. dataType [] arrayName = {data1, data2,...data_n};

			int[] array1 = { 10, 20, 30, 40, 50 };

			System.out.println(array1[0]);
			System.out.println(array1[2]);

			array1[0] = 1000;
			System.out.println(array1[0]);

			System.out.println();

//			2. dataType [] arrayName = new dataType[arrayLength]; 

			int[] array2 = new int[5];

//			4 bytes * arraySize

			array2[2] = 200;
			array2[1] = 100;
			array2[3] = 300;
			array2[4] = 400;
			array2[0] = 500;

			System.out.println(array2[0]);
			System.out.println(array2[1]);
			System.out.println(array2[2]);
			System.out.println(array2[3]);
			System.out.println(array2[4]);

			System.out.println();
			System.out.println("using loop");
			System.out.println();

			for (int i = 0; i <= 4; i++) {
				System.out.println(array2[i]); // 0, 1, 2, 3, 4, 5
			}

//			Array length : total number of elements in array
//			Numeric indexing is provided to each element of array which starts from 0
//			Once array is created in the memory, its size will be fixed i.e. we cannot
//			change the array size on further lines of code. 

			System.out.println();
			System.out.println("Length of array : " + array2.length);

			int[] clonedArray = array2.clone();

			for (int i = 0; i <= 4; i++) {
				System.out.println(clonedArray[i]); // 0, 1, 2, 3, 4, 5
			}

		} 
		catch (Exception ex) 
		{
			System.out.println("Catch Block Running");
			ex.printStackTrace();
		}

		System.out.println("After try catch");

	}

}
