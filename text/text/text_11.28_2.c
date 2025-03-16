#define _CRT_SECURE_NO_WARNINGS

void Swap(char* a, char* b, int wig);
#include<stdio.h>
#include<stdlib.h>
 struct str
{
	char numm[20];
	int age;
};
void fun(void* bass, int math, int wig, int(*com)(const void* e1, const void* e2))
{
	
	int i = 0;
	int j = 0;
	for (i = 0; i < math - 1; i++)
	{
		int flg = 1;
		for ( j = 0; j < math-1-i; j++)
		{
			if (com(((char*)bass + j * wig), (char*)bass + (j + 1) * wig)>0)
			{
				Swap((char*)bass + j * wig, (char*)bass + (j + 1) * wig, wig);
				 flg = 0;
			}
		}
		if (flg)
		{
			break;
		}
	}
}
int cop(const void* e1, const void* e2)
{
	return (*(int*)e2 - *(int*)e1);
}
int copp(const void* e1, const void* e2)
{
	return strcmp(((struct str*)e1)->numm,((struct st*)e2)->numm);
}
void Swap(char* a, char* b, int wig)
{
	int i = 0;
	for ( i = 0; i < wig; i++)
	{
		char t = *a;
		*a = *b;
		*b = t;
		a++;
		b++;
	}

}
void text1()
{
	int num[] = { 9,8,7,6,5,4,3,2,1 };
	int len = sizeof(num) / sizeof(num[0]);
	fun(num, len, sizeof(num[0]), cop);
	int i = 0;
	for (i = 0; i < len; i++)
	{
		printf("%d", num[i]);
	}
}

void text2()
{
	struct str s[] = { {"zhanghada",18},{"xiaonib",19},{"lihua",56} };
	int len = sizeof(s) / sizeof(s[0]);
	fun(s, len, sizeof(s[0]), copp);
	/*int i = 0;
	for (i = 0; i < len; i++)
	{
		printf("%d", s[i]);
	}*/
}
int main()
{
	//text1();
	text2();
	


	return 0;
}