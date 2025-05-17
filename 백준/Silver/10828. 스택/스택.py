import sys
input = sys.stdin.readline

class Stack:
    def __init__(self):
        self.data = []

    def push(self, x):
        self.data.append(x)

    def pop(self):
        if self.empty():
            return -1
        return self.data.pop()

    def size(self):
        return len(self.data)

    def empty(self):
        return 1 if len(self.data) == 0 else 0

    def top(self):
        if self.empty():
            return -1
        return self.data[-1]
    
n = int(input())
stack = Stack()
result = []

for _ in range(n):
    cmd = input().split()

    if cmd[0] == 'push':
        stack.push(cmd[1])
    elif cmd[0] == 'pop':
        result.append(stack.pop())
    elif cmd[0] == 'size':
        result.append(stack.size())
    elif cmd[0] == 'empty':
        result.append(stack.empty())
    elif cmd[0] == 'top':
        result.append(stack.top())
print('\n'.join(map(str, result)))


