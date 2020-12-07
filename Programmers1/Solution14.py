# -*- coding:utf-8 -*-

# 나누어 떨어지는 숫자배열 
# array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, 
# solution을 작성해주세요.
# divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.


def solution(arr, divisor):
    answer = []
    #for문 돌면서 나누어 떨어지면 answer에 append 하고 정렬
    for i in arr:
        if(i % divisor == 0):
            answer.append(i)
            answer.sort()
    #나누어 떨어지는 element가 하나도 없다면 insert(번지, 담을요소)반환
    if(answer.__len__() == 0):
        answer.insert(0, -1)
       
    return answer
    

if __name__ == '__main__':
    arr = [2,36,1,3]
    divisor = 1
    print(solution(arr, divisor))
