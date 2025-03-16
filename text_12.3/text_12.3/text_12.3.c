#define _CRT_SECURE_NO_WARNINGS

//#include<stdio.h>
//void fun(char* c)
//{
//	int i, j;
//	for (i = j = 0; *(c + i) != '\0'; i++)
//	{
//		if (*(c + i) != ' ')
//		{
//			*(c + j) = *(c + i);
//			j++;
//		}
//	}
//	*(c + j) = '\0';
//}
//char ch[20];
//int main()
//{
//	gets(ch);
//	fun(ch);
//	printf("%s", ch);
//
//
//	return 0;
//}

//#include<stdio.h>
//char ch[20];
//char t[20];
//void fun(char* c)
//{
//	int i;
//	int j = 0;
//	for (i = 0; *(c + i) != '\0'; i++)
//	{
//		if (i % 2 != 0 || (int)*(c + i) % 2 == 0)
//		{
//			t[j] = *(c + i);
//			j++;
//		}
//	}
//}
//
//int main()
//{
//	scanf("%s", ch);
//	fun(ch);
//	printf("%s", t);
//	return 0;
//}

//#include<stdio.h>
//#include<string.h>
//char ch[9][7];
//char c[7];
//int main()
//{
//	int i,j;
//	for (i = 0; i < 9; i++)
//	{
//		scanf("%s", &ch[i]);
//	}
//	for (i = 0; i < 9; i++)
//	{
//		printf("%s ", ch[i]);
//	}
//	printf("\n");
//	for (i = 0; i < 8; i++)
//	{
//		for (j = 0; j < 8-i; j++)
//		{
//			if (strcmp(ch[j], ch[j+1]) > 0)
//			{
//				strcpy(c, ch[j]);
//				strcpy(ch[j], ch[j + 1]);
//				strcpy(ch[j + 1], c);
//			}
//		}
//	}
//	for (i = 0; i < 9; i++)
//	{
//		printf("%s ", ch[i]);
//	}
//	return 0;
//}

#include <stdio.h>
#include <string.h>

// 比较函数，用于字符串排序
int compare(const void* a, const void* b) {
    return strcmp((char*)a, (char*)b);
}

int main() {
    char words[9][7];  // 定义二维字符数组来存放 9 个字符串，每个字符串长度不超过 7

    // 输入数据
    printf("请输入 9 个字符串：\n");
    for (int i = 0; i < 9; i++) {
        scanf("%s", words[i]);
    }

    // 输出处理前的字符串数组
    printf("处理前的字符串数组：\n");
    for (int i = 0; i < 9; i++) {
        printf("%s ", words[i]);
    }
    printf("\n");

    // 对字符串数组进行排序
    qsort(words, 9, sizeof(words[0]), compare);

    // 输出处理后的字符串数组
    printf("处理后的字符串数组：\n");
    for (int i = 0; i < 9; i++) {
        printf("%s ", words[i]);
    }
    printf("\n");

    return 0;
}