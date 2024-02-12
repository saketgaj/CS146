**Problem 1:**
1) 10000000000n^2 vs n^3
n^3 > n^2
10000000000n^2 grows n^2
n^3 grows n^3
Thus, n^3 is asymptotically greater 

2) n^2log(n) vs n(log(n))^10
n^2log(n) grows n^2
n(log(n))^10 = 10nlog(n) grows n
Thus, n^2log(n) is asymptotically greater 

3) n^logn vs 2^rootn
log(n^log(n)) vs log(2^root(n))
log(n)log(n) vs root(n)log(2)
Log(log(n)^2) vs log(root(n)log(2))
2log(log(n)) vs log(root(n)) + log(log(2))
~ 2log(log(n)) vs log(root(n))
Thus, 2^rootn is asymptotically greater 

4) 2^n vs 2^2n
log(2^n) vs log(2^2n)
nlog(2) vs 2nlog(2)
log(2)n vs 2log(2)n
Thus, 2^2n is asymptotically greater 

**Problem 2:**
Best Case: O(1) when multiple of 2
Average Case: O(root(n)) when prime number
i^2 = n
i = Theta(root(n))
Worst Case: O(n) 



