
import sys
input = sys.stdin.readline

n = int(input())

for i in range(1, 10):
    answer = n * i
    print(f"{n} * {i} = {answer}")