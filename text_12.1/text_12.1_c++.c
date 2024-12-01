#include<stdio.h>
#include<string.h>
int fun(char* ch,int n)
{
	int i = 0;
	int sum = 0;
    sum += (int)*(ch + n - 1) - 64;
	if (n >2)
	{
		
			for (i = n - 2; i <0; i--)
			{
				sum += 26;
			}
	}
    else if (n==2)
	 {
    sum+=26;
    }
	else
	{
		;
	}
	return sum;
	}
	
int main()
{
	char ch[20];
	scanf("%s", &ch);
	int n = strlen(ch);
	int ret = fun(ch,n);
	printf("%d", ret);


	return 0;
}
