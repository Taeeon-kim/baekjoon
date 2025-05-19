import sys
input = sys.stdin.readline

count = int(input())
arr1= list(map(int, input().split()))
arr1.sort()
count2 = int(input())
arr2=list(map(int, input().split()))
results =[]

def bs(arr1:list, value):
        left = 0
        right = len(arr1) - 1
        while right>= left:
            midIndex = (left + right) // 2
            if arr1[midIndex] == value:
                results.append(1)
                return 
            elif arr1[midIndex] > value:
                right = midIndex -1
            elif arr1[midIndex] < value :
                left = midIndex + 1
        results.append(0)
for value2 in arr2:
    bs(arr1, value2)

print('\n'.join(map(str, results)))