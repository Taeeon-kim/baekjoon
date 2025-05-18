import sys
input = sys.stdin.readline
N = input()
PList = list(map(int, input().split()))
PList.sort()
totalP = 0
totalSumP = 0
for p in PList:
    totalP  += p
    totalSumP += totalP
print(totalSumP)