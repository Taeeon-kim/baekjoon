from collections import deque
import sys 
input = sys.stdin.readline

N = int(input())

maze = [ list(map(int,input().strip())) for _ in range(N) ]

dx = [ -1, 1, 0, 0]
dy = [ 0, 0, -1, 1]
visited = [[0] * N for _ in range(N) ]
count = 0
def dfs(x,y):
    visited[x][y] = 1
    global count
    count +=1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <=nx < N and 0 <= ny < N:
            if maze[nx][ny] and not visited[nx][ny]:
                dfs(nx,ny)

results =[]
for i in range(N):
    for j in range(N):
        if maze[i][j] and not visited[i][j]:
            dfs(i,j)
            results.append(count)
            count = 0
results.sort()
print(len(results))
for number in results:
    print(number)