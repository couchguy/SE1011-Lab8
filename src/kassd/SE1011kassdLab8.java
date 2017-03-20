package kassd;

public class SE1011kassdLab8 {

	//shift Left
	public int[] shiftLeft(int[] nums) {
		if (nums.length != 0) {
			int temp = nums[0];
			int last = nums.length - 1;

			for (int i = 0; i < nums.length - 1; i++) {
				nums[i] = nums[i + 1];
			}
			nums[last] = temp;
		} else {
		}
		return nums;
	}
	
	//triple Up
	public boolean tripleUp(int[] nums) {
		boolean tripleUp = false;
		int firstIndex = 0;
		int secondIndex = 0;
		int thirdIndex = 0;

		for (int i = 0; i < nums.length - 2; i++) {
			if (firstIndex <= nums.length - 2 && !tripleUp) {
				secondIndex = firstIndex + 1;
				thirdIndex = firstIndex + 2;

				if ((nums[firstIndex] + 1 == nums[secondIndex])
						&& (nums[firstIndex] + 2 == nums[thirdIndex])) {
					tripleUp = true;
					firstIndex++;

				} else {
					firstIndex++;
				}
			}
		}
		return tripleUp;
	}

	//series up
	public int[] seriesUp(int n) {
		int totalSum = (n * (n + 1) / 2);
		int[] pattern;
		pattern = new int[totalSum];
		int number = 1;
		int sum = 0;
		int numberInCount = 1;

		for (int i = 0; i < pattern.length; i++) {

			if (number != numberInCount) {
				pattern[i] = number;
				sum = sum + number;
				number++;

			} else {
				pattern[i] = number;
				number = 1;
				numberInCount++;
			}
		}
		return pattern;
	}

	//copy evens
	public int[] copyEvens(int[] nums, int count) {
		int[] copyEvens;
		copyEvens = new int[count];
		int decider;
		int spotInEvens = 0;
		boolean stop = false;

		for (int i = 0; i < nums.length; i++) {
			decider = nums[i] % 2;

			if (decider == 0 && !stop) {

				copyEvens[spotInEvens] = nums[i];
				spotInEvens++;
			}
			if (spotInEvens == count) {
				stop = true;
			}
		}
		return copyEvens;
	}
	
	//count clumps
	
	/**
	 * Counts the clumps of the same numbers in a row in the array
	 * @param nums is an array of integers to be counted for it clumps
	 * @returnThis This returns an integer with the number of clumps in the array
	 */
	public int countClumps(int[] nums) {
		int first = 0;
		int second = 0;
		int count = 0;
		boolean same = false;

		for (int i = 0; i < nums.length - 1; i++) {
			second = first + 1;

			if (nums[first] == nums[second] && !same) {
				count++;
				first++;
				same = true;
			}else if (nums[first] == nums[second]) {
				first++;
			}else {
				first++;
				same = false;
			}
		}
		return count;
	}
	
	//commonTwo

	/**
	 * counts the number the same letters in each array not including duplicates 
	 * @param a the first array of strings you want to compare
	 * @param b the second array of strings you want to compare
	 * @return the number of the same letters that are in each array
	 */
	
	public int commonTwo(String[] a, String[] b) {
		int common = 0;
		String lastA = " ";
		String lastB = " ";
		for (int i = 0; i < a.length; i++) {
			if (a[i] != lastA) {
				lastA = a[i];
				for (int d = 0; d < b.length; d++) {
					if (b[d] != lastB) {
						lastB = b[d];
						if (a[i] == b[d]) {
							common++;
						}
					}
				}
				lastB = " ";
			}
		}
		return common;
	}

}
