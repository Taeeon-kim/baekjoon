from collections import deque
import sys
input = sys.stdin.readline


class Graph:
    def __init__(self, N):
        self.n = N
        self.adj_mat = [ [0] * N for _ in range(N)]
    
    
    
    def insert_edge(self, start, end):
        if(start >= self.n) or (end >= self.n):
            return
      
        self.adj_mat[start][end] = 1
        self.adj_mat[end][start] = 1
    
def dfs_mat(g: Graph, v: int, visited : list):
       
        visited[v] = True
        results.append(v)
        for i in range(g.n):
            if g.adj_mat[v][i] and not visited[i]:
                dfs_mat(g, i, visited)

def bfs(g: Graph, v:int, visited:list):
    queue = deque()
    visited[v] = True
    results2.append(v)
    queue.append(v)
    while queue:
        v = queue.popleft()
        for w in range(g.n):
            if(g.adj_mat[v][w] and not visited[w]):
                visited[w] = True
                results2.append(w)
                queue.append(w)

N, M, V = map(int, input().split())
g = Graph(N)

for _ in range(M):
  s,e =  map(int, input().split())
  g.insert_edge(s-1,e-1)
results = []
results2 = []
visited = [False] * N  
visited2 = [False] * N
dfs_mat(g, V - 1, visited)
bfs(g, V - 1 , visited2)
print(' '.join(str(x+1) for x in results))
print(' '.join(str(x+1) for x in results2))