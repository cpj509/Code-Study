#include <iostream>
#include <fstream>
#include <cstdlib>

using namespace std;

#define MAX_TERMS 100
#define MAX_COL 100
#define ROW 6
#define COL 6
 
typedef struct term {
    int col;
    int row;
    int value;
} term;
 
term a[MAX_TERMS];
term b[MAX_TERMS];
 
static void sparseMatrix(int(*s)[COL]);
static void fastTranspose(term *a, term *b);
static void printSparse(term *a);
 
int main()
{
    int i = 0;
    int j = 0;
    int k[ROW][COL] = { 0 };
    ifstream instream;
    instream.open("fasttranspose.txt");
    if(instream.fail())
    {
            cerr << "input file x" << endl;
            exit(1);
    }
    while(instream)
    {
    instream >> i >> j;
    instream >> k[i][j];
    }
 
    sparseMatrix(k);

    cout << "Input data" << endl;
 
    printSparse(a);
 
    cout << "Output data" << endl;
 
    fastTranspose(a, b);
    printSparse(b);

    instream.close();
    return 0;
}
 
void sparseMatrix(int(*s)[COL])
{
    int i, j, startA;
 
    a[0].row = ROW;
    a[0].col = COL;
 
    startA = 1;
    for (i = 0; i < a[0].row; i++)
        for (j = 0; j < a[0].col; j++)
            if (s[i][j]) {
                a[startA].row = i;
                a[startA].col = j;
                a[startA].value = s[i][j];
                startA++;
            }
 
    a[0].value = startA - 1;
}
 
void fastTranspose(term *a, term *b)
{
    int rowTerms[MAX_COL], startingPos[MAX_COL];
    int i, j, numCols = a[0].col, numTerms = a[0].value;
 
    b[0].row = numCols;
    b[0].col = a[0].row;
    b[0].value = numTerms;
 
    if (numTerms > 0) {
        for (i = 0; i <= numTerms; i++)
            rowTerms[i] = 0;
 
        for (i = 1; i <= numTerms; i++)
            rowTerms[a[i].col]++;
 
        startingPos[0] = 1;
 
        for (i = 1; i < numCols; i++)
 
            startingPos[i] = startingPos[i - 1] + rowTerms[i - 1];
 
        for (i = 1; i <= numTerms; i++) {
            j = startingPos[a[i].col]++;
            b[j].row = a[i].col;
            b[j].col = a[i].row;
            b[j].value = a[i].value;
        }
    }
}
 
void printSparse(term *a)
{
    int i;
    cout << "row\tcol\tvalue" << endl;
    for(i = 0; i <= a[0].value; i++)
    {
    cout << a[i].row << '\t' << a[i].col << '\t' << a[i].value << endl;
    }
}
