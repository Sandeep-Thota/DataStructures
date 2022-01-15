package codewars;

public class EvenOddArray {

	public int find(int[] integers) {

		int i = 0;
		int temp = 0;
		while (i < integers.length-2) {
			if(integers[i] >0 && integers[i+1] > 0) { 
			if (integers[i] % 2 == integers[i + 1] % 2) {
			
				if (integers[i] % 2 == 0) {
					// Array of even numbers need to find Odd
					for (int j = 0; j < integers.length; j++) {
						if (integers[j] % 2 == 1) {
							temp = integers[j];
							return temp;
						}
					}
				} else if (integers[i] % 2 == 1) {
					// Array of odd numbers need to find even
					for (int j = 0; j < integers.length; j++) {
						if (integers[j] % 2 == 0) {
							temp = integers[j];
							return temp;
						}
					}

				
			}

			} else {
				if (integers[i + 1] % 2 == integers[i + 2] % 2) {
					if (integers[i+1] % 2 == 0) {
						// Array of even numbers need to find Odd
						for (int j = 0; j < integers.length; j++) {
							if (integers[j] % 2 == 1) {
								temp = integers[j];
								return temp;
							}
						}
					} else if (integers[i+1] % 2 == 1) {
						// Array of odd numbers need to find even
						for (int j = 0; j < integers.length; j++) {
							if (integers[j] % 2 == 0) {
								temp = integers[j];
								return temp;
							}
						}

					}
				}
			}
		}
			i++;

		}
		return temp;

	}

}
