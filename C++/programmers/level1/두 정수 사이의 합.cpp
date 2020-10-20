#include <string>
#include <vector>

using namespace std;

long long solution(int a, int b) {
    long long answer = 0;
    int max, min;
    if(a<=b){
        max = b;
        min = a;
    }
    else{
        max = a;
        min = b;
    }
    for(;min<=max;min++){
        answer += min;
    }
    return answer;
}