def target_sum(arr, target):
    map = {}
    for i in range(len(arr)):
        map[i] = target - arr[i]
        value = map[i]
        if value < len(arr):
            ind = [i, value]
            return ind
    return None

if __name__ == "__main__":
    arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    target = 17
    result = target_sum(arr, target)
    if result:
        print(result[0], result[1])
