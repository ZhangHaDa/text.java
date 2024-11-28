#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int num[20][20];
int main()
{
    int n, i, j, f, x = 0;
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {

            scanf("%d", &num[i][j]);
        }
    }
    int sum = 0;
    int ret = 0;
    for (i = 0; i < n; i++)
    {
        sum += num[0][i];
    }
    //ÐÐ
    f = 0;
    for (i = 0; i < n; i++)
    {
        x = 0;
        for (j = 0; j < n; j++)
        {
            x += num[i][j];

        }
        if (x == sum)
        {
            f++;
        }

    }
    //ÁÐ
    if (f == n)
    {
        f = 0;
        for (i = 0; i < n; i++)
        {

            x = 0;
            for (j = 0; j < n; j++)
            {
                x += num[j][i];

            }
            if (x == sum)
            {
                f++;
            }

        }


    }
    if (f == n)
    {
        f = 0;
        x = 0;
        for (i = 0; i < n; i++)
        {


            for (j = 0; j < n; j++)
            {
                if (i == j)
                {
                    x += num[i][j];
                }
                if (i == n - 1 - j)
                {
                    ret += num[i][j];
                }


            }


        }


    }
    if (x == sum && sum == ret)
    {
        f = n;
    }
    if (f == n)
    {
        printf("Yes");
    }
    else
    {
        printf("No");
    }
    return 0;
}
