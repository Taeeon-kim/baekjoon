from collections import deque
import sys
input = sys.stdin.readline
class Queue:

    def __init__(self):
        self.queue= deque()
    def push(self, x):
        self.queue.append(x)
    def pop(self):
        if self.empty():
            return -1
        else:
            return self.queue.popleft()
    def size(self):
        return len(self.queue)
    def empty(self):
        if self.queue:
            return 0
        else: 
            return 1
    def front(self):
        if(self.empty()): return -1
        else: return self.queue[0]
    def back(self):
        if(self.empty()): return -1
        else: return self.queue[-1]

queue = Queue()
n = int(input())
result =[]
for _ in range(n):
    cmd = input().split()
    if(cmd[0]== 'push'):
        queue.push(cmd[1])
    elif(cmd[0] == 'pop'):
        result.append(queue.pop())
    elif(cmd[0] == 'size'):
        result.append(queue.size())
    elif(cmd[0] == 'empty'):
        result.append(queue.empty())
    elif(cmd[0] == 'front'):
        result.append(queue.front())
    elif(cmd[0] == 'back'):
        result.append(queue.back())

print('\n'.join(map(str, result)))
