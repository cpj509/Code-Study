//https://www.hackerrank.com/challenges/2d-array/problem
#include <bits/stdc++.h>

using namespace std;

// Complete the hourglassSum function below.
int hourglassSum(vector<vector<int>> arr)
{
    vector<int> v;
    int sumvar = 0;
    for (int y = 0; y < arr.size() - 2; y++)
    {
        for (int x = 0; x < arr.size() - 2; x++)
        {
            sumvar = 0;
            sumvar += arr[y][x];
            sumvar += arr[y][x + 1];
            sumvar += arr[y][x + 2];
            sumvar += arr[y + 1][x + 1];
            sumvar += arr[y + 2][x];
            sumvar += arr[y + 2][x + 1];
            sumvar += arr[y + 2][x + 2];
            v.push_back(sumvar);
        }
    }
    return *max_element(v.begin(), v.end());
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    vector<vector<int>> arr(6);
    for (int i = 0; i < 6; i++)
    {
        arr[i].resize(6);

        for (int j = 0; j < 6; j++)
        {
            cin >> arr[i][j];
        }

        cin.ignore(numeric_limits<streamsize>::max(), '\n');
    }

    int result = hourglassSum(arr);

    fout << result << "\n";

    fout.close();

    return 0;
}
