Problem 1:
1) T(n) = 2T(n-1) + 1
T(n)= 2(2T(n-2) +1) + 1 = 2^2T(n-2)+2+1
T(n) = 2^3T(n-3) + 2^2 + 2+ 1
T(n) = 2^k T(n-k) + Series i=0 to k-1(2^i)
Let n=k
T(n) = 2^n +  Series i=0 to n-1(2^i) = 2^n + 2^n - 1/2-1
**T(n) = 2^n+1 - 1**
Cannot use Master Theorem because f(n) = n^0 which fails the n^k where k > 0 condition

2) T(n) = 3T(n-1) + n
T(n)= 3(3T(n-2) +n) + n = 3^2T(n-2)+3n+n
T(n) = 3^3T(n-3) + 3^2n + 3n+ n
T(n) = 3^k T(n-k) + n*Series i=0 to k-1(3^i)
Let n=k
**T(n) = 3^n + n((3^n - 1)/2)**
Master Theorem:
a = 3, b = 1, f(n)= n^1
Use Case 3 since a > 1: T(n) = O(n^1*3^n/1) = **Theta(n3^n)**

3) T(n) = 9T(n/2) + n^2
T(n)= 9(9T(n/2^2) + (n/2)^2) + n^2 = 
T(n) = 9^3T(n/2^3) + 9(n/2^2)^2 + (9/4)n^2 + n^2
T(n) = 9^k T(N/2^n) + n^2(9^k -1/8)
N/2^k = 1, k = log2(N), T(1) = c
T(N) = N^log2(9)T(1) + n^2(9^log2(N) - 1/8) =  cN^log2(9) + n^2(9^log2(N) - 1/8)
Master Theorem:
a = 9, b = 2, f(N) = n^2
n^log2(9) = n^2
Use Case 2 since we are comparing n^log2(9) to n^2: T(n) = O(n^log2(9)log0(n)) = **Theta(n^log2(9)log(n))**

4) T(N) = 100T(N/2) + n^log2(cn) + 1
Let x =log2(cn)
T(N) = 100^2T(N/4) + 100(n/2)^x+1 +  n^x+1
n^log2(cn)+1 = n*n^log2(cn)
Master Theorem:
a = 100, b = 2, f(n) = log2(cn)+1
n^logb(a) = n^log2(100) = n^6
n^log2(cn)+1 = n^log2(c)*n*n^log2(n)
Use Case 3 because we are compaing n^log2(n) to n^6:
Theta(n^logb(a))
n^log2(100) = n^6
n^c

5) T(N) = 4T(N/2) + n^2log(n)
T(N) = 4^2(T(N/2^2)) + 4(n/2)^2log(n/2) + n^2log(n)
T(n) = 4^2(T(N/2^2)) + (n/2)^2log(n) + n^2log(n)
T(n) = 4^2(T(N/2^2)) + 1/4(n)^2log(n) + n^2log(n)
T(n) = 4^kT(N/2^k) + n^2log(n)(SERIES from i=1 to k(1/4^i)) + n^2log(n)
N/2^k = 1, k = log2(N), T(1) = c
T(n) = 4^log2(N)c + n^2log(n)(SERIES from i=1 to log2(n)(1/4^i)) + n^2log(n)
T(n) = cN^2+ n^2log(n)(SERIES from i=1 to log2(n)(1/4^i)) + n^2log(n)
Master Theorem:
a = 4, b  = 2, f(n)= n^2log(n)
n^log2(4) = n^2
Use Case 2 since we are comparing n^log2(4) and n^2:
If f(n) = Theta(n^logb(a)), then T(n) = **Theta(n^2log(n))**

6) T(N) = 5T(N/2) + n^2/logn
T(N) = 5^2T(N/2^2) + 5(n/2)^2/log(N/2) + n^2/logn
T(N) = 5^2T(N/2^2) + 5(n/2)^2/(log(N) - log(2)) + n^2/logn
T(N) = 5^2T(N/2^2) + 5(n/2)^2/(log(N) - 1) + n^2/logn
T(N) = 5^kT(N/2^k) + SERIES from i=0 to k((5^i*(n/2^i)^2)/log(N)-i) + n^2/logn
N/2^k = 1, k = log2(N), T(1) = c
T(N) = c5^log2(N) + SERIES from i=0 to log2(N)((5^i*(n/2^i)^2)/log(N)-i) + n^2/logn
Master Theorem:
a = 5, b = 2, f(n) = n^2/log(n)
nlog(a) = nlog2(5)
Use Case 3:
Check if f(n) = Omega(n^logb(a)+e)
n^2/log(n) = Omega(nlog2(5)), so T(n) = Theta(n^2/log(n)))

Problem 2:
yetAnotherFunc(n): 1
  if n > 1: 1
    for(i=0;i<10n;i++) 10n
      doSomething; 10n
    yetAnotherFunc(n/2); 
    yetAnotherFunc(n/2);
Reccurence Relation: T(n) = 2T(n/2) + 10n
T(n) = 2^2T(n/2^2) + 20(n/2) + 10n
T(n) = 4T(N/4) + 20n
T(n) =2^kT(N/2^k) + 10kn
n/2^k = 1, T(1) = 0
n = 2^k 
k = log2(n)
T(n) = 2^log2(n)T(1) + 10nlog2(n) = (n)T(1) + 10nlog2(n)
**T(n) = 10nlog2(n)**




 
