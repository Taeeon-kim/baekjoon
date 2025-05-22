from collections import deque
import sys
input = sys.stdin.readline

def dfs(x,y):
    stack = [] # stack쓰는이유는 맵크기 50,50의로 최대 2500개의 재귀호출시 파이썬 기본 1000개 초과
    visited[x][y] = 1
    stack.append((x,y))
    while stack:
        x, y = stack.pop()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < N and 0<= ny < M:
                if adj_mat[nx][ny] and not visited[nx][ny]:
                    visited[nx][ny] = 1
                    stack.append((nx,ny))

results = deque()
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
t = int(input())

for _ in range(t):
    M, N, K = map(int, input().split()) # N = 행(column), M 열(row), 배추 개수

    adj_mat = [[0] * M for _ in range(N)]
    visited = [[0] * M for _ in range(N)]
    x = y = 0
    for _ in range(K):
        x, y = map(int, input().split())
        adj_mat[y][x] = 1

    # 이중for문 맵전체 순회
    bugs = 0
    for i in range(N):
        for j in range(M):
            if adj_mat[i][j] and not visited[i][j]:
                dfs(i, j)
                bugs+=1
    results.append(bugs)
for result in results:
    print(result)