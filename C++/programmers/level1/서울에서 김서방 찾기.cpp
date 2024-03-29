//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
#include <string>
#include <vector>

using namespace std;

string solution(vector<string> seoul) {
    string answer = "";
   vector<string>::iterator iter;
    int a = 0;
    string b = "";
    for (iter = seoul.begin();; iter++, a++) {
        if (*iter == "Kim") {
            answer.append("김서방은 ");
            b = to_string(a);
            answer.append(b);
            answer.append("에 있다");
            break;
        }
    }
    return answer;
}
/*
문제 설명
String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

제한 사항
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
Kim은 반드시 seoul 안에 포함되어 있습니다.
입출력 예
seoul	return
[Jane, Kim]	김서방은 1에 있다
*/