#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
    string answer = "";
    vector<string> day_w = { "SUN","MON","TUE","WED","THU","FRI","SAT" };
    vector<int> day_m = { 31,29,31,30,31,30,31,31,30,31,30,31 };
    int hap = 0;
    for (int i = 1; i < a; i++) {
        hap += day_m[i - 1];
    }
    hap += b - 1;
    answer = day_w[(hap + 5) % 7];
    return answer;
}