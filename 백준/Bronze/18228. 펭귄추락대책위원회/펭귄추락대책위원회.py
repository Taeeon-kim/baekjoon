pIndex = -1
n = int(input())
aList = list(map(int, input().split()))
pIndex = aList.index(-1)
leftMin = min(aList[:pIndex])
rightMin = min(aList[pIndex+1:])
print(leftMin+rightMin)