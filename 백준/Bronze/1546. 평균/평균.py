import sys
input = sys.stdin.readline

count = int(input())
scores = list(map(int, input().split()))
bestScore = max(scores)
newScoreSum=0
for score in scores:
    newScore = score/bestScore*100
    newScoreSum+=newScore

print(newScoreSum/len(scores))