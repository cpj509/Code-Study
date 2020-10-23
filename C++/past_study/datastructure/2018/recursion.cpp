#include<iostream>
 
using namespace std;
 
int ite(int num1, int num2)//iterative version
{
        while(num1>0)
        {
                cout << "n=" << num1 << " m=" << num2 << ";" << "\t";
                num1 = num1-1;
                num2 = num2+1;
        }
        cout << "n=" << num1 << " m=" << num2 << ";" << "\t";
        return num2;
}

int re(int num1, int num2)//recursive version
{
        cout << "add(" << num1 << "," << num2 << ")" << "\t";
        if (num1 == 0) return num2;
        else return re(num1-1, num2+1);
}
	
 
int main()
{
      int num1, num2; 
 
      cout << "input two integer";
      cin >> num1 >> num2;
 
      cout << "sum = " << ite(num1, num2) << endl;//iterative version
      cout << "sum = " << re(num1, num2) << endl;//recursive version
 
      return 0;
}
