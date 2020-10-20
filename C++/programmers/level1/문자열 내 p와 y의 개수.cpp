#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    int pnum = 0, ynum = 0;
    string::iterator iter;
    for (iter = s.begin(); iter != s.end(); iter++) {
        if (*iter == 'p' || *iter == 'P')  pnum++;
        else if (*iter == 'y' || *iter == 'Y')  ynum++;
    }
    if (pnum != ynum)  answer = false;
    return answer;
}