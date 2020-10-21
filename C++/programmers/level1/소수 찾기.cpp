//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    vector<bool> v(n + 1);
    v[0] = true;
    v[1] = true;
    for (int i = 2; i <= n; i++) {
        if (v[i])   continue;
        for (int j = i + i; j <= n; j += i) {
            v[j] = 1;
        }
    }
    for (int i = 2; i <= n; i++) {
        if (!v[i])  answer++;
    }
    return answer;
}

//references https://coding-factory.tistory.com/600 & Sieve of Eratosthenes wiki
/*
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3
입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
*/