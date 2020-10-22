#include <iostream>
#include <sstream>
#include <algorithm>
#include <vector>

using namespace std;

vector<int> vc;
int dx[4] = {-1,1,0,0 };//x좌표 이동
int dy[4] = { 0,0,-1,1 };//y좌표 이동
int n;//행렬 크기
int area = 0;//공간의 크기

void dfs(int y, int x, int** matrix) {
    matrix[y][x] = 0;
    area++;
    for (int i = 0; i < 4; i++) {//상하좌우 탐색
        if (y + dy[i] < 0 || y + dy[i] >= n || x + dx[i] < 0 || x + dx[i] >= n)    continue;//행렬 내부 벗어나지 않게
        if (matrix[y + dy[i]][x + dx[i]] == 1)    dfs(y + dy[i], x + dx[i], matrix);
    }
}

void solution(int sizeOfMatrix, int** matrix) {
    n = sizeOfMatrix;
    for (int y = 0; y < n; y++) {
        for (int x = 0; x < n; x++) {
            if (matrix[y][x] == 1) {//행렬에서 1인 부분을 찾았다면
                area = 0;
                dfs(y, x, matrix);//dfs 시작
                vc.push_back(area);//공간의 크기 벡터에 넣어줌
            }
        }
    }
    sort(vc.begin(), vc.end());//벡터 오름차순 정렬
    cout << vc.size() << endl;
    for (int i = 0; i < vc.size(); i++) {//결과값 출력
        cout << vc[i] << " ";
    }
}

struct input_data {
    int sizeOfMatrix;
    int** matrix;
};

void process_stdin(struct input_data& inputData) {
    string line;
    istringstream iss;

    getline(cin, line);
    iss.str(line);
    iss >> inputData.sizeOfMatrix;

    inputData.matrix = new int* [inputData.sizeOfMatrix];
    for (int i = 0; i < inputData.sizeOfMatrix; i++) {
        getline(cin, line);
        iss.clear();
        iss.str(line);
        inputData.matrix[i] = new int[inputData.sizeOfMatrix];
        for (int j = 0; j < inputData.sizeOfMatrix; j++) {
            iss >> inputData.matrix[i][j];
        }
    }
}

int main() {
    struct input_data inputData;
    process_stdin(inputData);

    solution(inputData.sizeOfMatrix, inputData.matrix);
    return 0;
}