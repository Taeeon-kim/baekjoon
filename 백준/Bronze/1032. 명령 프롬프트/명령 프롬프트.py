input_count = input()
input_count= int(input_count)
compare_hashTable = {}
result = ''
while(input_count):
    file_name = input()
    for i in range(len(file_name)):
       if compare_hashTable.get(i, file_name[i]) == file_name[i]:
         compare_hashTable[i] = file_name[i]
       else:
          compare_hashTable[i] =  "?"
    input_count-=1
for key, value in compare_hashTable.items():
    result += value
print(result)