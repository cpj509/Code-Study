#include<iostream>
#include<cstdlib>

#define STACK_SIZE 100

typedef enum{
	lparen, rparen, plus, minus, mul, divide, eos, operand
} precedence;

char symbol[] = {'(', ')', '+', '-', '*', '/'};
int isp[] = {0, 19, 12, 12, 13, 13};
int icp[] = {20, 19, 12, 12, 13, 13};

typedef struct {
	bool isSym;
	int data;
} T;

precedence get_token(int *num, int *u, char *exp)
{
	char toke = exp[*u];
	(*u)++;
	*num = (int)toke - '0';
	if (*num> -1 && *num < 10)
	{
		while (exp[*u]>'0' && exp[*u]<'9')
		{
			*num = *num * 10 + exp[(*u)++] - '0';
		}
		return operand;
	}
	switch(toke)
	{
		case '(':
			return lparen;
		case ')':
			return rparen;
		case '+':
			return plus;
		case '-':
			return minus;
		case '/':
			return divide;
		case '*':
			return mul;
		case '\0':
			return eos;
	}
}
void printT(bool isSym, int data, T *d, int *value)
{
	d[*value].isSym = isSym;
	d[*value].data = data;
	(*value)++;
	if (isSym)
	{
		std::cout << symbol[data];
	}
	else
	{
		std::cout << data;
	}
	return;
}

void postfix(char *exp, T *d, int *value)
{
	int op;
	precedence token;
	precedence stack[STACK_SIZE];
	int n = 0;
	int top = 0;
	std::cout << "Conversion(pistfix form): ";	
	for (token = get_token(&op, &n, exp); token != eos; token = get_token(&op, &n, exp))
	{
		if (token == operand)
		{
			printT(false, op, d, value);
		}
		else if (token == rparen)
		{
			while(top > 0 && (stack[top-1] != lparen))
			{
				printT(true, stack[--top], d, value);
			}
			top--;
		}
		else
		{
			while(top > 0 && (isp[stack[top-1]] >= icp[token]))
			{
				printT(true, stack[--top], d, value);
			}
			stack[top++] = token;
		}
	}
	while (1)
	{
		if (top<=0)
		{
			break;
		}
		token=stack[--top];
		printT(true, token, d, value);
	}
	std::cout << std::endl;
}

int eval(T *d, int size)
{
	int stack[STACK_SIZE];
	int op1, op2;
	int value;
	int n = 0;
	int top = 0;
	for (value = 0; value < size; value++)
	{
		T token=d[value];
		if(!token.isSym)
		{
			stack[top++]=token.data;
		}
		else
		{
			op2 = stack[--top];
			op1 = stack[--top];
			switch((precedence)token.data)
			{
				case plus:stack[top++]=op1 + op2;
					break;
				case minus:stack[top++]=op1 - op2;
					break;
				case mul:stack[top++]=op1 * op2;
					break;
				case divide:stack[top++]=op1 / op2;
					break;
			}
		}
	}
	return stack[--top];
}

int main()
{
	char input[255];
	T d[STACK_SIZE];
	int value = 0;
	int result = 0;
	std::cout << "Enter Data: ";
	std::cin >> input;
	std::cout << "Echo data(infix form): " << input << std::endl;

	postfix(input, d, &value);
	result = eval(d, value);

	std::cout << "Result: " << result << std::endl;
	return 0;
}
