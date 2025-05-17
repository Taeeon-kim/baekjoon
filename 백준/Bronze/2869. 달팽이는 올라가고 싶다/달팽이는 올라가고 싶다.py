import math
import sys
input = sys.stdin.readline
p = 0
day = 0
a, b, v = map(int,input().split())
print(math.ceil((v-b)/(a-b)))