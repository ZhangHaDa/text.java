#define _CRT_SECURE_NO_WARNINGS

//#define N 20
//#include<stdio.h>
//int num[N][N];
//int main()
//{
//	int x, y;
//	scanf("%d%d", &x, &y);
//	int i, j;
//	for (i = 0; i < x; i++)
//	{
//		for (j = 0; j < y; j++)
//		{
//			num[i][j] = i * j;
//		}
//	}
//	for (i = 0; i < x; i++)
//	{
//		for (j = 0; j < y; j++)
//		{
//			printf("%d", num[i][j]);
//		}
//	}
//
//	return 0;
//}


//#include<stdio.h>
//
//int main()
//{
//	int F1 = 1;
//	int F2 = 2;
//	int n;
//	int i = 3;
//	int Fn = 0;
//	scanf("%d", &n);
//	int N = n;
//	while (n-3)
//	{
//		Fn = F1 + F2;
//		F1 = F2;
//		F2 = Fn;
//		n--;
//	}
//	if (N > 3)
//	{
//      printf("%d", Fn);
//	}
//	
//	else
//	{
//		printf("%d", N);
//	}
//	return 0;
//}



//#include<stdio.h>
//
//int main()
//{
//	int n;
//	int num[20];
//	scanf("%d", &n);
//	int i;
//	for (i = 0; i < n; i++)
//	{
//		scanf("%d", &num[i]);
//	}
//	int t = 0;
//	int ret = 0;
//	for (i = 0; i < n; i++)
//	{
//		if(ret==t)
//		ret = t;
//		if(t + num[i] >= 1)
//		{
//			t = t + num[i];
//			if (i == n - 1)
//			{
//				printf("%d", ret);
//			}
//		}
//		else
//		{
//			i = -1;
//			ret++;
//			t = ret;
//
//		}
//		
//			
//	}
//
//	return 0;
//}


#include<stdio.h>

int main()
{
	int num[20];
	int n, str;
	scanf("%d%d", &n, &str);
	int i = 0;
	int sum = str;
	for (i = 1; i < n; i++)
	{
		num[i] = str + 2 * i;
		sum = sum ^ num[i];
	}
	printf("%d", sum);
	return 0;
}