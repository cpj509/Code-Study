#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int a = s.size() / 2;
    if (s.size() % 2 == 0) {
        answer.push_back(s[a - 1]);
        answer.push_back(s[a]);
    }
    else {
        answer.push_back(s[a]);
    }
    return answer;
}