mirror = []
n = int(input())
mirror = [ input().strip() for _ in range(n) ]
k = int(input())

if(k == 1): 
    result = mirror
elif(k == 2): 
    result = [ line[::-1] for line in mirror ]
elif(k==3):
    result = mirror[::-1]

for line in result :
    print(line)
