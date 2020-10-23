#include<iostream>
#include<cstdlib>
#include<fstream>
#include<string.h>

#define MAX 100
using namespace std;

int top = -1;
int stack[MAX];
void push(char);
char pop();
int match(char a, char b);
int check(char exp[]);

int main()
{
        ifstream instream("paren.txt");
        if(instream.fail())
        {
                cerr << "input file x" << endl;
                exit(1);
        }

    char exp[MAX];
    cout << "Output:" << endl;
    while(instream)
    {
            instream >> exp;
    cout << exp << "\t";
    check(exp);
    }
    instream.close();
    return 0;
}

int check(char exp[])
{
    int i;
    char temp;
    for(i=0; i<strlen(exp); i++)
    {
        if(exp[i]=='(' || exp[i]=='{' || exp[i]=='[')
        {
                push(exp[i]);
        }
        if(exp[i]==')' || exp[i]=='}' || exp[i]==']')
        {
            if(top == -1)
            {
                cout << "UnBalanced, ";
                cout << "Right parentheses are more than left parentheses" << endl;
                return 0;
            }
            else
            {
                temp = pop();
                if(!match(temp, exp[i]))
                {
                    cout << "UnBalanced, ";
                    cout << "Mismatched parentheses are : ";
                    cout << temp << ',' << exp[i] << endl;
                    return 0;
                }
            }
        }
    }
    if(top==-1)
    {
        cout << "Balenced" << endl;
        return 0;
    }
    else{
            cout << "UnBalenced, ";
        cout << "Left parentheses are more than right parentheses" << endl;
        return 0;
    }
}
int match(char a, char b)
{
    if(a=='{' && b=='}')
        return 1;
    if(a=='(' && b==')')
        return 1;
    if(a=='[' && b==']')
        return 1;
    return 0;
}
void push(char item)
{
    if(top==MAX-1)
    {
        cout << "Stack Overflow" << endl;
        return;
    }
    stack[++top]=item;
}
char pop()
{
    if(top==-1)
    {
        cout << "Stack Underflow" << endl;
        return 0;
    }
    return (stack[top--]);
}
