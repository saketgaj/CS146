**Problem 1:**
int temp;
for (int i = 1; i < n; i++) { 
    int j = i; 

    while (j > 0 && arr[j] < arr[j-1]) { 
        //Swap arr[j] and arr[j-1] 
    }
}

Best Case (if array is already sorted):
1 2 3 4 5 : 4 comparisions (N-1 ~ N)
**O(N)
Omega(N)
Theta(n)**

Worst Case (Array is in reverse order):
5 4 3 2 1: Comparisions is 1 + 2 + 3 + (N-1) = (N)(N-1)/2 = N^2 - N ~ N^2
**O(N^2)
Omega(N^2)
Theta(N^2)**

Average Case (Array is in random order unsorted) : 
**O(N^2)
Omega(N^2)
Theta(N^2)**

Time Complexity: 
1 + N+1 + N + (N)(N+1) + (N)(N)
2 + 3N + (N*N) + (N*N)
2 + 3N + 2(N*N)
~ (N*N)

**Time Complexity: O(N^2)**


**Problem 2:**
for i from 1 to rows_A do: //N
    for j from 1 to cols_B do: //(N)(N+1) 
    sum ← 0 //(N)(N)
        for k from 1 to cols_A do: //(N)(N)(N)
          sum ← sum + A[i][k] * B[k][j] //(N)(N)(N)
    result[i][j] ← sum return result //(N)(N)

For Best case, Average case, and Worst Case:
**O(N^3)
Omega(N^3)
Theta(N^3)**

N + N(N+1) + N*N + N*N*N + N*N*N + N*N = 
N + N*N + N + N*N + N*N*N + N*N*N + N*N =
2N + 4(N*N) + 2(N*N*N)
~ N*N*N

**Time Complexity: O(N^3)**
