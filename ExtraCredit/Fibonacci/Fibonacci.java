public static void fib(int n) {
		int prev2 = 0;
		int prev = 1;
		int num;
		
		System.out.print("0 1 "); //Initial Values
		for(int i = 2; i < n; i++) {
			num = prev2 + prev;
			System.out.print(num + " ");
			prev2 = prev; 
			prev = num;
		}
}
