from collections import deque
import sys
input = sys.stdin.readline

def insert_edge(s, e):
    adj_matrix[s][e] = 1
    adj_matrix[e][s] = 1

virus_count = 0
def bfs(v):
    queue = deque()
    global virus_count
    visited[v] = True
    queue.append(v)
    while queue:
        v = queue.popleft()
      
        for i in range(N):
            if(adj_matrix[v][i] and not visited[i]):
                visited[i] = True
                virus_count+=1
                queue.append(i)
    if virus_count == -1:
        virus_count = 0
    
    
N = int(input())
adj_matrix = [ [0] * N for _ in range(N)  ]
E = int(input())
visited = [False] * N 

for _ in range(E):
    s, e = map(int, input().split())
    insert_edge(s-1, e-1)

bfs(0)
print(virus_count)