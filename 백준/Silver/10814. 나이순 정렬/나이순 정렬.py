import sys
input = sys.stdin.readline

def merge(arr1, arr2):
    results = []
    i = 0
    j = 0
    while (i< len(arr1) and j< len(arr2)):
        if arr1[i][0] > arr2[j][0]:
            results.append(arr2[j])
            j+=1
        else :
            results.append(arr1[i])
            i+=1
    while(i<len(arr1)):
        results.append(arr1[i])
        i+=1
    while(j<len(arr2)):
        results.append(arr2[j])
        j+=1
    return results    

def mergeSort(arr):
    if len(arr) <=1:
        return arr
    mid = len(arr)//2
    left = mergeSort(arr[:mid])
    right = mergeSort(arr[mid:])
    return merge(left, right)

n = int(input())
joined_list =[]
for _ in range(n):
    user = input().split() 
    joined_list.append([int(user[0]), user[1]])

result = mergeSort(joined_list)
for user in result:
    print(' '.join(map(str, user)))