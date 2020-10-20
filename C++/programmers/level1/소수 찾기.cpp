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