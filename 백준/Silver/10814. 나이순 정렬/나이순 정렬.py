import sys
input = sys.stdin.readline

n = int(input())
joined_list =[]
for _ in range(n):
    user = input().split() 
    joined_list.append([int(user[0]), user[1]])

result = sorted(joined_list, key = lambda x : x[0])
for user in result:
    print(' '.join(map(str, user)))