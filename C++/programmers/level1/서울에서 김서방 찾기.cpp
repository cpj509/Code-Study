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