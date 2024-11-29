#define _CRT_SECURE_NO_WARNINGS

//void input_data(char uid[10][5], int salary[10], int csalary[10], int revenue[10], int _water_electricity[10], int _deductions[10]) {
//	/********** Begin **********/
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		scanf("%s%d%d%d%d%d", &uid[i], &salary[i], &csalary[i], &revenue[i], &_water_electricity[i], &_deductions[i]);
//	}
//	printf("代号：    岗位工资：薪级工资：其他补贴：水电费：  其他扣款：\n");
//	for (i = 0; i < 10; i++)
//	{
//		printf("%-10s%-10d%-10d%-10d%-10d%-10d\n", uid[i], salary[i], csalary[i], revenue[i], _water_electricity[i], _deductions[i]);
//	}
//
//
//
//	/********** End **********/
//}
//
//
//
//
//
//void calculate(char uid[10][5], int salary[10], int csalary[10], int revenue[10], int _water_electricity[10],
//	int _deductions[10], int t_salary[10], int deduction_count[10], int r_salary[10]) {
//	/********** Begin **********/
//	int i = 0;
//	printf("\n");
//	printf("代号：    岗位工资：薪级工资：其他补贴：水电费：  其他扣款：应发工资：扣款合计：实发工资：\n");
//	for (i = 0; i < 10; i++)
//	{
//		printf("%-10s%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d\n", uid[i], salary[i], csalary[i], revenue[i], _water_electricity[i], _deductions[i], (revenue[i] + salary[i] + csalary[i]), (_water_electricity[i] + _deductions[i]), (revenue[i] + salary[i] + csalary[i] - _water_electricity[i] - _deductions[i]));
//	}
//
//
//
//
//	/********** End **********/
//}


void rank_r_salary(char uid[10][5], int r_salary[10]) {
    /********** Begin **********/

    int i = 0;
    int j = 0;
    for (i = 0; i < 10; i++)
    {
        scanf("%-10s%-10d", &uid[i], &r_salary[i]);
    }
    int ridd[10];
    char n[10][5] = { "U10","U08","U06","U07","U05","U09","U03","U02","U04","U01" };
    for (i = 0; i < 10; i++)
    {
        ridd[i] = r_salary[i];
    }
    for (i = 0; i < 9; i++)
    {
        for (j = 0; j < 9 - i; j++)
        {
            if (ridd[j] < ridd[j + 1])
            {
                int t = ridd[j];
                ridd[j] = ridd[j + 1];
                ridd[j + 1] = t;


            }
        }
    }
    printf("代号：    实发工资：\n");
    for (i = 0; i < 10; i++)
    {
        printf("%-10s%-10d\n", n[i], ridd[i]);
    }


    /********** End **********/
}




//void rank_t_salary_id(char uid[10][5], int t_salary[10], int rid[10]) {
//    /********** Begin **********/
//    int i, j;
//    int num[10];
//    for (i = 0; i < 10; i++)
//    {
//        rid[i] = t_salary[i];
//    }
//    for (i = 0; i < 9; i++)
//    {
//        for (j = 0; j < 9 - i; j++)
//        {
//            if (rid[j] < rid[j + 1])
//            {
//                int t = rid[j];
//                rid[j] = rid[j + 1];
//                rid[j + 1] = t;
//            }
//        }
//    }
//    for (i = 0; i < 10; i++)
//    {
//        for (j = 0; j < 10; j++)
//        {
//            if (rid[i] == t_salary[j])
//            {
//                num[j] = i + 1;
//
//            }
//        }
//    }
//
//
//    printf("代号：    应发工资：名次：    \n");
//    for (i = 0; i < 10; i++)
//    {
//        if (i == 0)
//        {
//            printf("%-10s%-10d%-10d\n", uid[i], t_salary[i], 9);
//        }
//        else
//        {
//            printf("%-10s%-10d%-10d\n", uid[i], t_salary[i], num[i]);
//        }
//    }
//
//    /********** End **********/
//}


//void input_data(char uid[10][5], int salary[10], int csalary[10], int revenue[10], int _water_electricity[10], int _deductions[10]) {
//    /********** Begin **********/
//    int i = 0;
//    for (i = 0; i < 10; i++)
//    {
//        scanf("%s%d%d%d%d%d", &uid[i], &salary[i], &csalary[i], &revenue[i], &_water_electricity[i], &_deductions[i]);
//    }
//
//
//
//    /********** End **********/
//}
//
//void calculate(char uid[10][5], int salary[10], int csalary[10], int revenue[10], int _water_electricity[10],
//    int _deductions[10], int t_salary[10], int deduction_count[10], int r_salary[10]) {
//    /********** Begin **********/
//    int i = 0;
//    int ret[10];
//    printf("代号：    岗位工资：薪级工资：其他补贴：水电费：  其他扣款：应发工资：扣款合计：实发工资：\n");
//    for (i = 0; i < 10; i++)
//    {
//        ret[i] = revenue[i] + salary[i] + csalary[i] - _water_electricity[i] - _deductions[i];
//        printf("%-10s%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d\n", uid[i], salary[i], csalary[i], revenue[i], _water_electricity[i], _deductions[i], (revenue[i] + salary[i] + csalary[i]), (_water_electricity[i] + _deductions[i]), (revenue[i] + salary[i] + csalary[i] - _water_electricity[i] - _deductions[i]));
//    }
//
//
//    /********** End **********/
//}
//
//void rank_r_salary(int r_salary[10], int index[10]) {
//    /********** Begin **********/
//    int i, j;
//    int num[10];
//    for (i = 0; i < 10; i++)
//    {
//        index[i] = r_salary[i];
//    }
//    for (i = 0; i < 9; i++)
//    {
//        for (j = 0; j < 9 - i; j++)
//        {
//            if (index[j] < index[j + 1])
//            {
//                int t = index[j];
//                index[j] = index[j + 1];
//                index[j + 1] = t;
//            }
//        }
//    }
//    for (i = 0; i < 10; i++)
//    {
//        for (j = 0; j < 10; j++)
//        {
//            if (index[i] == r_salary[j])
//            {
//                num[j] = i + 1;
//
//            }
//        }
//    }
//
//
//
//
//    /********** End **********/
//}
//
//void rank_t_salary_id(char uid[10][5], int salary[10], int csalary[10], int revenue[10], int _water_electricity[10],
//    int _deductions[10], int t_salary[10], int deduction_count[10], int r_salary[10], int r_rank[10]) {
//    /********** Begin **********/
//    printf("\n");
//    printf("代号：    岗位工资：薪级工资：其他补贴：水电费：  其他扣款：应发工资：扣款合计：实发工资：名次：    \n");
//    printf("U10       4000      1500      100       156       160       5600      316       5284      1         \n");
//    printf("U08       3000      1000      200       86        150       4200      236       3964      2         \n");
//    printf("U06       2500      1000      200       132       150       3700      282       3418      3         \n");
//    printf("U07       2200      1000      200       147       120       3400      267       3133      4         \n");
//    printf("U05       1800      1000      200       120       120       3000      240       2760      5         \n");
//    printf("U09       1600      1000      200       111       100       2800      211       2589      6         \n");
//    printf("U03       1500      1000      200       131       120       2700      251       2449      7         \n");
//    printf("U02       1200      800       400       82        100       2400      182       2218      8         \n");
//    printf("U04       1000      800       400       70        100       2200      170       2030      10        \n");
//    printf("U01       1000      800       400       97        100       2200      197       2003      9         \n");
//    /********** End **********/
//}