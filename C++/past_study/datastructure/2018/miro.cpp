#include <iostream>
#include <cstdlib>

#define MIROROW 14//미로의 row 크기 지정
#define MIROCOL 17//미로의 column 크기 지정
#define MAXSTACKSIZE 500//stack의 최대 크기 지정
typedef struct {//stack을 위한 구조체 선언
	int row;//row값 선언.
	int col;//column값 선언
	int dir;//방향값 선언.
}element;
element stack[MAXSTACKSIZE];//위에 선언한 요소들을 포함하는 stack 선언

int top = -1;//stack의 empty, full을 검사할 변수 top선언
int isEmpty() //stack이 비었는지 검사
{
	return top == -1;//비어있으면 1, 아니면 0을 반환
}
int isFull() //stack이 가득 찼는지 검사
{
	return top == MAXSTACKSIZE;//가득 차있으면 1, 아니면 0을 반환
}
void push(element temp) //stack에 push
{
	if (isFull()) //stack이 가득 차있으면
	{
		std::cerr << "stack is full" << std::endl;//"stack is full"을 출력
		exit(-1);//프로그램 종료
	}
	stack[++top] = temp;//빈 공간이 있다면 stack에 값을 넣어줌
}
element pop() //stack에서 pop
{
	if (isEmpty()) //stack이 비어있으면
	{
		std::cerr << "stack is empty" << std::endl;//”stack is empty”출력
		exit(-1);//프로그램 종료
	}
	return stack[top--];//아니라면 stack의 값을 반환해줌
}
typedef struct {//미로의 방향을 위한 구조체 선언
	int vert;//vertical값을 위한 vert 선언
	int horiz;//horizontal값을 위한 horiz 선언
} offset;
offset move[8] = {//각 방향별로 움직일시 변할 값을 지정해줌.
	{ -1, 0 }, // 북
	{ -1, 1 }, // 북동
	{ 0, 1 }, // 동
	{ 1, 1 }, // 남동
	{ 1, 0 }, // 남
	{ 1, -1 }, // 남서
	{ 0, -1 }, // 서
	{ -1, -1 } // 북서
};
int mark[MIROROW][MIROCOL] = {0,};//미로의 마킹할 부분을 0으로 초기화
int maze[MIROROW][MIROCOL] = //미로 설정
{
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,1,0,0,0,1,1,0,0,0,1,1,1,1,1,1},
        {1,1,0,0,0,1,1,0,1,1,1,0,0,1,1,1,1},
        {1,0,0,1,0,0,0,0,1,1,1,1,0,0,1,1,1},
        {1,1,1,0,1,1,1,1,0,1,1,0,1,1,0,0,1},
        {1,1,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1},
        {1,0,0,1,1,0,1,1,1,0,1,0,0,1,0,1,1},
        {1,0,0,1,1,0,1,1,1,0,1,0,0,1,0,1,1},
        {1,0,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1},
        {1,0,0,1,1,0,1,1,0,1,1,1,1,1,0,1,1},
        {1,1,1,0,0,0,1,1,0,1,1,0,0,0,0,0,1},
        {1,0,0,1,1,1,1,1,0,0,0,1,1,1,1,0,1},
        {1,0,1,0,0,1,1,1,1,1,0,1,1,1,1,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
};

int MIRO()//함수 MIRO선언
{
	element temp = { 1, 1, 2 };//시작점(1, 1)과 방향(동쪽으로 초기화)설정
	int found = 0; //도착점 도달여부인 found 선언 및 초기화
	push(temp);//처음 좌표와 방향을 stack에 push
	while (!isEmpty() && !found)//stack이 비어있고 도착점에 도달하지 않았을 때 계속 실행
	{
		element top = pop();//stack의 top에 있는 값을 불러옴
		int row = top.row;//stack의 top에 있는 row값
		int col = top.col;//stack의 top에 있는 col값
		int dir = top.dir;//stack의 top에 있는 dir(방향)
		while (dir < 8 && !found)//모든 방향 중 갈 수 있는 방향이 있고 도착점에 도달 하지 않았다면 계속 실행
		{
			int next_row = row + move[dir].vert;
			int next_col = col + move[dir].horiz;
			if (next_row == (MIROROW - 2) && next_col == (MIROCOL - 2))//다음 지점이 도착점이라면
			{
top.row = row;//top의 row값은 현재 row값
top.col = col;//top의 col값은 현재 col값
push(top);//stack으로 top의 값을 push해줌.
				mark[next_row][next_col] = 1;//도착할 좌표에 1 마킹
				top.row = next_row;//top의 row값은 다음의 row값
				top.col = next_col;//top의 col값은 다음의 col값
				push(top);//stack으로 top의 값을 push
				found = 1;//도착점 도달함
				return found;//found값 반환함.
			}
			else if (!maze[next_row][next_col] && !mark[next_row][next_col])//다음 지점이 간 적이 없고, 통과 할 수 있는 새로운 위치라면
			{
				mark[next_row][next_col] = 1;//1 마킹
				top.row = row;//top의 row값은 현재의 row값
				top.col = col; //top의 col값은 현재의 col값
				top.dir = ++dir;//top의 dir값은 현재의 dir값에 1이 증가한 값
				push(top);//top의 값을 push해줌
				row = next_row;//row는 다음의 row값
				col = next_col;//col은 다음의 col값
				dir = 0;//방향 초기화
			}
			else//위의 경우들에 해당이 안 된다면
			{
				dir++;//방향전환
			}
		}
	}
	return found;//도착점에 도달 못했으면 0을 반환
}

void Path(int found)//함수 Path선언
{
        if(found == 1)//found값이 1이라면
        {
                std::cout << "ROW" << "\t" << "COL" << std::endl;//단어 ”ROW”, “COL”을 출력
                for(int i = 0; i <= top; i++)//stack에 push된 값들을 출력해줌
                {
                        std::cout << stack[i].row << "\t" << stack[i].col << std::endl;//각 stack의 row값과 col값을 출력해줌.
                }
        }
	else//found가 1이 아니라면
	{
		std::cout << "도착점으로 도달하는 길이 없습니다." << std::endl;// "도착점으로 도달하는 길이 없습니다."를 출력
	}
}

void MMatrix(int found)//MMatrix 함수 선언
{
	if (found == 1)//도착점에 도달 했다면
	{
		std::cout << "Marked MIRO" << std::endl;//문장 “Marked MIRO” 출력
		mark[1][1] = 1;//시작점은 1, 1이고 1을 넣어줌
		for (int i = 1; i < MIROROW-1; i++)//미로 출력을 위한 for문
		{
			for (int j = 1; j < MIROCOL-1; j++)//미로 출력을 위한 for문
			{
				std::cout << mark[i][j];//지나온 미로 전체를 출력. 지나온 길은 ‘1’로 아닌 길은 ‘0’으로 나타남
			}
			std::cout << std::endl;//줄 바꿈
		}
	}
	else//도착점에 도달하지 못했다면
	{
		std::cout << "도착점으로 도달하는 길이 없습니다." << std::endl;//도착점 도달 못했다면 "도착점으로 도달하는 길이 없습니다." 출력
	}
}

int main() //main함수 선언
{
	int found = 0;//도착점을 나타내는 found 선언 밑 초기화
	found = MIRO();//found에 MIRO에서 받아온 found값 입력
	Path(found);//Path함수에 found값 입력
	MMatrix(found);//MMatrix함수에 found값 입력
	return 0;//종료
}
