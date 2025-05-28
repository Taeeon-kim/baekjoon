import sys
input = sys.stdin.readline

boardSize = list(map(int, input().split()))
Board  =[]
def checkWrongColor(x,y):
    repaint_start_w = 0
    repaint_start_b = 0
    for i in range(8):
        for j in range(8):
            current = Board[x+i][y+j]
            if (i+j)%2 == 0:
                if current != 'W':
                    repaint_start_w +=1
                if current != 'B':
                    repaint_start_b +=1
            else :
                  if current != 'B':
                      repaint_start_w +=1
                  if current != 'W':
                      repaint_start_b +=1
    return min(repaint_start_w, repaint_start_b)


for _ in range(boardSize[0]):
    boardRows = input()
    boardRows= list(boardRows.strip())
    Board.append(boardRows)

min_paint_count = float('inf')
for i in range(boardSize[0] - 7 ):
        for j in range(boardSize[1] - 7):
            min_paint_count = min(min_paint_count, checkWrongColor(i, j))

print(min_paint_count)