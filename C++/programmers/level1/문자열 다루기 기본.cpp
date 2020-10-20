#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;
    if (s.size() != 4 && s.size() != 6) {
        return answer = false;
    }
    string::iterator iter;
    for (iter = s.begin(); iter != s.end(); iter++) {
        if (isdigit(*iter) == 0) {
            answer = false;
        }
    }
    return answer;
}