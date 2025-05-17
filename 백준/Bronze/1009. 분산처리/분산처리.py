test_case_count = input()
test_case_count = int(test_case_count)
test_case_list = []

while(test_case_count):
    list =  input().split()
    test_case_list.append(list)
    test_case_count-=1

while(len(test_case_list)):
    a,b = test_case_list.pop(0)
    a,b = int(a),int(b)
    result = pow(a,b, 10)
    if(result == 0):
        result = 10
    print(result)