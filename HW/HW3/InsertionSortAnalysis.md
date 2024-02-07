(Assuming worst case for sortinh)
int temp; //1
for (int i = 1; i < n; i++) { //N+1
    int j = i; //N

    while (j > 0 && arr[j] < arr[j-1]) { //(N)(N+1)
        //Swap arr[j] and arr[j-1] //(N)(N)
    }
}

Analysis:
1 + N+1 + N + (N)(N+1) + (N)(N)
2 + 3N + (N*N) + (N*N)
2 + 3N + 2(N*N)
~ (N*N)

**Degree: N^2, Time Complexity: O(N^2)**


