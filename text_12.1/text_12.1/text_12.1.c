#define _CRT_SECURE_NO_WARNINGS


#include<stdio.h>
int fun(int n)
{
	int i = 0;
	if (n == 1)
		return 0;
	if (n == 2)
		return 1;
	for (i = 2; i <= n / 2; i++)
	{
		if (n % i == 0)
			return 0;
	}
	return 1;
}
int main()
{
	int n;
	scanf("%d", &n);
	int ret = fun(n);
	if (ret)
	{
		printf("Yes");
	}
	else
	{
		printf("No");
	}
	return 0;
}