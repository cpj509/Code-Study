#include<iostream>

using namespace std;

int factorial(int n)
{
	if(n==0)	return 0;
	else
  {
          cout << n << "\t";
          return(n+factorial(n-1));
  }
}


int main()
{
	int n = 0;	

	cout << "input number : ";
	cin >> n;

	cout << factorial(n) <<endl;

	return 0;
}
