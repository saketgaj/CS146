for i from 1 to rows_A do: //N
    for j from 1 to cols_B do: //(N)(N+1) 
    sum ← 0 //(N)(N)
        for k from 1 to cols_A do: (N)(N)(N)
          sum ← sum + A[i][k] * B[k][j] (N)(N)(N)
    result[i][j] ← sum return result (N)(N)

N + N(N+1) + N*N + N*N*N + N*N*N + N*N = 
N + N*N + N + N*N + N*N*N + N*N*N + N*N =
2N + 4(N*N) + 2(N*N*N)
~ N*N*N

**Degree:N^3, Time Complexity: O(N^3)**
