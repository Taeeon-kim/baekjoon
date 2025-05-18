import sys
input = sys.stdin.readline
n = int(input())
numberList = []
for _ in range(n):
    numberList.append(int(input()))
print('\n'.join(map(str,sorted(numberList))))