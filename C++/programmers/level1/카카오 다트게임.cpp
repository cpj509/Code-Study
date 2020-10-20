#include <string>
#include <cmath>

using namespace std;

int solution(string dartResult) {
    int answer = 0;
    int cnt = 0;
    int temp[3] = { 0 };
    for (int i = 0; i < dartResult.length(); i++) {
        if (dartResult[i] >= '0' && dartResult[i] <= '9') {//숫자 체크
            int chk = 0;//10체크용
            string a = "";
            if (i > 0) {
                if (dartResult[i - 1] >= '0' && dartResult[i - 1] <= '9') {
                    continue;
                }
            }
            a.push_back(dartResult[i]);
            if (dartResult[i + 1] >= '0' && dartResult[i + 1] <= '9') {//10체크
                chk++;
                a.push_back(dartResult[i + chk]);
                temp[cnt] = stoi(a);
            }
            else {
                temp[cnt] = stoi(a);
            }
            if (dartResult[i + 1 + chk] == 'S') {
                if (dartResult[i + 2 + chk] == '*') {
                    temp[cnt] *= 2;
                    if (cnt > 0) {
                        temp[cnt - 1] = 2 * temp[cnt - 1];
                    }
                }
                else if (dartResult[i + 2 + chk] == '#') {
                    temp[cnt] = -temp[cnt];
                }
            }
            else if (dartResult[i + 1 + chk] == 'D') {
                temp[cnt] = pow(temp[cnt], 2);
                if (dartResult[i + 2 + chk] == '*') {
                    temp[cnt] *= 2;
                    if (cnt > 0) {
                        temp[cnt - 1] = 2 * temp[cnt - 1];
                    }
                }
                else if (dartResult[i + 2 + chk] == '#') {
                    temp[cnt] = -temp[cnt];
                }
            }
            else if (dartResult[i + 1 + chk] == 'T') {
                temp[cnt] = pow(temp[cnt], 3);
                if (dartResult[i + 2 + chk] == '*') {
                    temp[cnt] *= 2;
                    if (cnt > 0) {
                        temp[cnt - 1] = 2 * temp[cnt - 1];
                    }
                }
                else if (dartResult[i + 2 + chk] == '#') {
                    temp[cnt] = -temp[cnt];
                }
            }
            cnt++;
        }
    }
    answer = temp[0] + temp[1] + temp[2];
    return answer;
}