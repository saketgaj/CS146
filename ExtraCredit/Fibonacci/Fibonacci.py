def fib(n):
    prev2 = 0
    prev = 1
    print("0 1", end=" ")
    for i in range(2, n):
        num = prev2 + prev
        print(num, end=" ")
        prev2 = prev
        prev = num
