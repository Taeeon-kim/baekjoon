import sys
input = sys.stdin.readline
n = int(input())
num_list =[]
dp = [0] * 11
results =[]
for _ in range(n):
    num_list.append(int(input())) 

for i in range(max(num_list)+1):
    if i == 1:
        dp[1] = 1  
    elif i == 2:
        dp[2] = 2
    elif i ==3:
        dp[3] = 4
    else:
        dp[i] = dp[i-1] + dp[i-2] + dp[i-3]
for num in num_list:
    if num == 1:
        results.append(dp[1])  
    elif num == 2:
        results.append(dp[2])
    elif num ==3:
        results.append(dp[3])
    else:
        results.append(dp[num])
print('\n'.join(map(str, results)))