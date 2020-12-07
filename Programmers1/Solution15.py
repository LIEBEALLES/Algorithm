# -*- coding:utf-8 -*-

#두 개 뽑아서 더하기
#정수 배열 numbers가 주어집니다. 
#numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 
#return 하도록 solution 함수를 완성해주세요.

def solution(numbers):
    answer = set()
    print(type(numbers))
    
    for i in range(numbers.__len__()):
        for j in range(i+1, numbers.__len__()):
            answer.add(numbers[i]+numbers[j])
    answer = list(answer)
    answer.sort()
            
    return answer

if __name__ == '__main__':
    numbers = [5,0,2,7]
    solution(numbers)
    print(solution(numbers))
    