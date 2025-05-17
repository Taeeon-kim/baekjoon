t = int(input())
results =[]
for _ in range(t):
    matrix = []
    sum = 0
    n = int(input())
    for _ in range(n):
        matrix.append(list(map(int, input().split())))
    for arr in matrix:
        maxValue = max(arr)
        if maxValue < 0: maxValue = 0
        sum+=maxValue
    results.append(sum)
print('\n'.join(map(str, results)))