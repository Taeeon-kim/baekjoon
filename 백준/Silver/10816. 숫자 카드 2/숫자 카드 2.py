import sys
input = sys.stdin.readline

cardHashTable = {}
_ = int(input())
cards = list(map(int,input().split()))
_ = int(input())
numbers = list(map(int,input().split()))
results =[]
for card in cards:
    cardHashTable[card] = cardHashTable.get(card, 0) + 1

for number in numbers:
    results.append(cardHashTable.get(number, 0))

print(" ".join(map(str, results)))

# 시간복잡도 O(N+M), 공간복잡도 O(N+M)