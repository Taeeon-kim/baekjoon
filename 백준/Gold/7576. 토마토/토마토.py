from collections import deque
import sys
input = sys.stdin.readline

boxes = []

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
M, N = map(int, input().split())

allRipe = True
for _ in range(N):
    boxes.append(list(map(int, input().split())))

for i in range(N):
    for j in range(M):
        if boxes[i][j] == 0:
            allRipe = False
if allRipe: 
    print(0)
else :
    def bfs():
        queue = deque()
        count = -1
        for i in range(N):
            for j in range(M):
                if boxes[i][j] == 1 :
                    queue.append((i, j))

        while queue:
            for _ in range(len(queue)):
                x,y = queue.popleft()
                for i in range(4):
                    nx = x + dx[i]
                    ny = y + dy[i]

                    if 0<= nx < N and 0<= ny < M:
                        if boxes[nx][ny] == 0 :
                            boxes[nx][ny] = 1
                            queue.append((nx, ny))
            count+=1
        for i in range(N):
            for j in range(M):
                if boxes[i][j] == 0 :
                    return -1            

        return count

    print(bfs())