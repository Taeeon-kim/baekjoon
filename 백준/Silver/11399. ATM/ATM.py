import sys
input = sys.stdin.readline
N = input()
ascSortedPList = sorted(list(map(int, input().split())))
totalP = 0
totalSumP = 0
for p in ascSortedPList:
    totalP  += p
    totalSumP += totalP
print(totalSumP)