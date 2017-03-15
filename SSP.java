public class SubsetSum {

	public static boolean subset_sum(Integer set[], int n, int sum) {

		if (sum == 0) {

			return true;
		}

		if (sum < 0  || n == 0) {

			return false;
		}

		return (subset_sum(set, n-1, sum - set[n-1])  ||  subset_sum(set, n-1, sum));
	}

	public static void main(String args[]) {

		Integer set[] = {2,5,7,3,9};
		System.out.println(subset_sum(set, 5, 4) ? "TRUE":"FALSE");
	}
}