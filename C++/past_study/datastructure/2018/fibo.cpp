#include <iostream>

using namespace std;

int fibo(int num)
{
    if (num == 0)	return 0;
    else if (num == 1)	return 1;
    else return (fibo(num-1)+fibo(num-2));
}

int main() 
{
    int num = 0;
    cout << "input integer :";
    cin >> num;

    cout << fibo(num) << endl;
    
    return 0;
}
