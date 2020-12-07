# -*- coding:utf-8 -*-

#제일 작은 수 제거하기

# 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
#단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
#예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

def solution(arr):
    print(arr)
    # print(type(arr)) : list
    
    # min(arr) 배열에서 가장 작은 수를 가져오는 메소드
    minarr = min(arr)
    # 가장 작은 수를 가져와서 remove()로 지워줌
    arr.remove(minarr)
    print(arr)
    
    if(arr.__len__() <= 1):
        # arr배열의 길이가 1보닥 작거나 같을 경우
        # arr배열에 0번지에 -1을 넣어준다
        arr.insert(0, -1)
    return arr
    

if __name__ == '__main__':
    arr = [4, 3, 2, 1]
    solution(arr)
    print(arr)
    
