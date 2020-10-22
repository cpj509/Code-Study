#include <iostream>
#include <string>

using namespace std;

bool palin(string str);
bool pseudo(string str);

int main() {
	int n = 0;
	cin >> n;
	while (n--) {
		string str;
		cin >> str;
		if (palin(str)) {
			cout << "0" << endl;
		}
		else if (pseudo(str)) {
			cout << "1" << endl;
		}
		else
			cout << "2" << endl;
	}
	return 0;
}

bool palin(string str) {//회문 체크
	for (int i = 0; i < str.size() / 2; i++) {
		if (str[i] != str[str.size() - 1 - i])	return 0;
	}
	return 1;
}

bool pseudo(string str) {//유사 회문 체크
	string temp1 = str;
	string temp2 = str;
	for (int i = 0; i < str.size(); i++) {
		if (str[i] != str[str.size() - 1 - i])//앞 뒤로 문자 하나씩 비교하다가 다른게 나왔다면
		{
			temp1.erase(i, 1);//왼쪽 문자 하나 제거 temp1
			temp2.erase(str.size() - 1 - i, 1);//오른쪽 문자 하나 제거 temp2
			break;//timeout 방지
		}
	}
	if (palin(temp1) || palin(temp2))	return 1;//temp1이나 temp2중 하나라도 회문이면 유사회문
	return 0;
}