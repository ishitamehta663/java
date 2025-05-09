public class spiral {

	public static void printSpiral(int size)
	{

		int row = 0, col = 0;

		int boundary = size - 1;
		int sizeLeft = size - 1;
		int flag = 1;
		char move = 'r';

		// Array for matrix
		int matrix[][] = new int[size][size];

		for (int i = 1; i < size * size + 1; i++) {

			// Assign the value
			matrix[row][col] = i;

			// switch-case to determine the next index
			switch (move) {

			// If right, go right
			case 'r':
				col += 1;
				break;

			// if left, go left
			case 'l':
				col -= 1;
				break;

			// if up, go up
			case 'u':
				row -= 1;
				break;

			// if down, go down
			case 'd':
				row += 1;
				break;
			}

			if (i == boundary) {

				// Add the left size for the next boundary
				boundary += sizeLeft;

				if (flag != 2) {

					flag = 2;
				}
				else {

					flag = 1;
					sizeLeft -= 1;
				}

				// switch-case to rotate the movement
				switch (move) {

				// if right, rotate to down
				case 'r':
					move = 'd';
					break;

				// if down, rotate to left
				case 'd':
					move = 'l';
					break;

				// if left, rotate to up
				case 'l':
					move = 'u';
					break;

				// if up, rotate to right
				case 'u':
					move = 'r';
					break;
				}
			}
		}

		for (row = 0; row < size; row++) {
			for (col = 0; col < size; col++) {

				int n = matrix[row][col];
				System.out.print((n < 10) ? (n + " ")
										: (n + " "));
			}

			System.out.println();
		}
	}

	public static void main(String[] args)
	{

		int size = 5;
		printSpiral(size);
	}
}
