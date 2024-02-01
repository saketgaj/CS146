public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int target = 17;
		
		int[] result = targetSum(arr, target);
		System.out.println(result[0] + " " + result[1]);
	}
	
	public static int[] targetSum(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap <Integer, Integer> () ;
		
		for(int i = 0; i < arr.length; i++) {
			map.put(i, target - arr[i]);
			int value = map.get(i);
			if(value < arr.length) {
				int[] ind = {i, value};
				return ind;
			}
		}
		return null;
	}
