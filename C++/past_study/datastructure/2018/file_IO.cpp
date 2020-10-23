#include <iostream>
#include <fstream>
#include <cstdlib>
#include <string.h>

using namespace std;

int main()
{
	ifstream instream;
	instream.open("lab0-2.dat");//파일 불러옴
	if (instream.fail())
	{
		cerr << "file x" << endl;//파일 없거나 문제있으면 출력
		exit(1);
	}
  int sum = 0;
	int Count = 0;
	char temp[255], word[100];
 
	while(instream.getline(temp, sizeof(temp)))
	{
		int state = 0;
		int i = 0;

		for(i = 0; temp[i] != '\0'; i++)
		{
			if(isalpha(temp[i]))//알파벳 구별
			{
        word[state] = temp[i];
        state++;
			}
			else
			{
			  word[state] = 0;				
				
				if(strlen(word) > 0)
				{
          Count++;//길이 0 이상이면 단어
        }
				state = 0;
      }
		}
		if(state > 0)//줄 마지막 단어 카운트
		{
			word[state] = 0;
			if(strlen(word) > 0)
			{
				Count++;
			}
		}
		cout << temp << endl; // 한 줄씩 출력
		cout << "The number of words : " << Count << endl;//단어 갯수 출력
    sum += Count;//총 단어 갯수 더해줌

		Count = 0;//단어 갯수 초기화(다음줄용)
	}
  cout << "Total number of words: " << sum << endl;//총 단어 갯수 출력
	instream.close();
	return 0;
}
