import sys
input = sys.stdin.readline
results =[]
t = int(input())

for _ in range(t):
    num = int(input())
    def zero_fibo(n):
        memo = [0] * (n+2)
        memo[0] = 1
        memo[1] = 0
        if n == 0 :
            return memo[0]
        if n == 1 :
            return memo[1]
        for i in range(2, n+1):
            memo[i] = memo[i-1] + memo[i-2]
        return memo[n]
        
    def one_fibo(n):
        memo = [0] * (n+2)
        memo[0] = 0
        memo[1] = 1 
        if n == 0 :
            return memo[0]
        if n == 1 :
            return memo[1]
        for i in range(2, n+1):
            memo[i] = memo[i-1] + memo[i-2]
        return memo[n]
    tablation_result = [str(zero_fibo(num)), str(one_fibo(num))]   

    result = ' '.join(tablation_result)
    results.append(result)

for result in results:
    print(result)