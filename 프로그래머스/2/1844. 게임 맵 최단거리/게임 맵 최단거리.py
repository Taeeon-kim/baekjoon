from collections import deque
def solution(maps):
    n = len(maps)
    m = len(maps[0])
    dx = [-1, 1,0 , 0]
    dy = [0, 0, -1, 1]
    # bfs + 방향, 100 이하 반복문 + queue
    # 반복문을 다 돌아도 마지막 visited가 n,m 이 아니면 -1 리턴     
    visited = [[0] * m for _ in range(n)]
    maze = maps
    x = y = 0
        
    def bfs(x,y):
        queue = deque()
        queue.append((x,y))
        visited[x][y] = 1
        
        while len(queue):
            x,y = queue.popleft()
            
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
            
                if 0 <= nx < n and 0 <= ny < m:
                    if maze[nx][ny] == 1 and visited[nx][ny] == 0:
                        visited[nx][ny] = visited[x][y] + 1
                        queue.append((nx,ny))
        if visited[n-1][m-1] > 0 :
            return visited[n-1][m-1]
        else :
            return -1 
    
    return bfs(0,0)