#include <iostream>
#include <fstream>
#include <cstdlib>

using namespace std;

int main()
{
  ifstream instream;
  instream.open("lab0-1.dat");

  if (instream.fail())
  {
          cerr << "file x" << endl;
          exit(1);
  }


  int data[10];
	int size = 10;
	int large, small = 0;
  int i = 0;
  int j = 0;
  int ltag = 0;
  int stag = 0;

  for(int a = 0; a < size; a++)
  {
          instream >> data[a];
  }

	large = data[0];
	small = data[0];
	
	for(i = 1; i < size; i++)
	{
	       	if (data[i] > large)	
          {
                  large = data[i];
                  ltag = i;
          }
	}
	for(j = 1; j < size; j++)
	{
	      	if (data[j] < small)	
          {
                  small = data[j];
                  stag = j;
          }
	}
  ltag = ltag + 1;
  stag = stag + 1;

  cout << "Minimum number is " << small << " at position " << stag << "," << endl;
  cout << "Maximum number is " << large << " at position " << ltag << endl;

	return 0;
}
