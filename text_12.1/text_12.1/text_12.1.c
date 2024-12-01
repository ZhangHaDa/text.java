#define _CRT_SECURE_NO_WARNINGS


//#include<stdio.h>
//int fun(int n)
//{
//	int i = 0;
//	if (n == 1)
//		return 0;
//	if (n == 2)
//		return 1;
//	for (i = 2; i <= n / 2; i++)
//	{
//		if (n % i == 0)
//			return 0;
//	}
//	return 1;
//}
//int main()
//{
//	int n;
//	scanf("%d", &n);
//	int ret = fun(n);
//	if (ret)
//	{
//		printf("Yes");
//	}
//	else
//	{
//		printf("No");
//	}
//	return 0;
//}


//#include<stdio.h>
//int num[20];
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	int i = 0;
//	int sum = 0;
//	for (i = 0; i < n; i++)
//	{
//		scanf("%d", &num[i]);
//		sum += (num[i] - i);
//	}
//	printf("%d", sum);
//	return 0;
//}



//#include <stdio.h>
//float fun(float* a, int n)
//{
//    int i = 0;
//    float sum = 0;
//    for (i = 0; i < n; i++)
//    {
//        sum += *(a + i);
//    }
//    return (sum / n);
//
//}
//void main()
//{
//    int i;
//    float score[5], aver;
//    for (i = 0; i < 5; i++)
//        scanf("%f", &score[i]);
//    aver = fun(score, 5);
//    printf("%5.2f\n", aver);
//}


//#include<stdio.h>
//int fun(int n)
//{
//	int i = 0;
//	int sum = 1;
//	for (i = 2; i <= n; i++)
//	{
//		sum *= i;
//	}
//	return sum;
//
//
//}
//int main()
//{
//	int m = 0;
//	int n = 0;
//	scanf("%d%d", &m, &n);
//	double ret = fun(m) / fun(n) / fun(m - n) / 1.0;
//	printf("%.6lf", ret);
//
//	return 0;
//}
//
//


#include<stdio.h>
#include<string.h>
int fun(char* ch, int n)
{
	int i = 0;
	int sum = 0;
	sum += (int)*(ch + n - 1) - 64;
	if (n >= 2)
	{
		for (i = n - 2; i >= 0; i--)
		{
			sum += ((int)*(ch + i) - 64) * 26;
		}
	}
	
	return sum;
}

int main()
{
	char ch[20];
	scanf("%s", &ch);
	int n = strlen(ch);
	int ret = fun(ch, n);
	printf("%d", ret);


	return 0;
}