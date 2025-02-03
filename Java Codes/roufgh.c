// #include <stdio.h>

// int main()
// {
//     int UL = 30;
//     int LL = 10;
//     int arr[30];
//     int k = 0;

//     for (int i = LL; i <= UL; i++)
//     {
//         if (i % 2 != 0)
//         {
//             int Prime = 1;
//             for (int j = 2; j <= i / 2; j++)
//             {
//                 if (i % j == 0)
//                 {
//                     Prime = 0;
//                     break;
//                 }
//             }
//             if (Prime)
//             {
//                 arr[k++] = i;
//             }
//         }
//     }
//     for (int i = 0; i < k; i++)
//     {
//         printf("%d ", arr[i]);
//     }
//     printf("\n");

//     return 0;
// }
// #include <stdio.h>
// int main()
// {
//     int num = 0;

//     for (int i = 0; i < 8; i++)
//     {
//         for (int j = 0; j < i; j++)
//         {
//             printf("%d ", num);
//         }
//         num++;
//         printf("\n");
//     }
//     return 0;
// }
// #include <stdio.h>
// #include <math.h>
// int armstrong(int a)
// {
//     int rem, n = a;
//     int sum = 0;
//     while (a != 0)
//     {
//         rem = a % 10;
//         sum = sum + pow(rem, 3);
//         a = a / 10;
//     }
//     if (sum == n)
//     {
//         printf("Armstrong Number\n");
//     }
//     else
//     {
//         printf("No Armstrong Number\n");
//     }
//     printf("%d", sum);
//     return 0;
// }
// int main()
// {
//     int a, b = 1;
//     printf("Enter a number: ");
//     scanf("%d", &a);

//     if (a <= 1)
//     {
//         printf("No Prime\n");
//         return 0;
//     }
//     if (a == 2)
//     {
//         printf("Prime\n");
//         return 0;
//     }

//     for (int i = 3; i <= a / 2; i++)
//     {
//         if (a % i == 0)
//         {
//             b = 0;
//             break;
//         }
//     }

//     if (b == 0)
//         printf("No Prime\n");
//     else
//         printf("Prime\n");
//     armstrong(a);
//     return 0;
// }
// #include <stdio.h>
// int main()
// {
//     int c = 'A';
//     for (int i = 0; i < 6; i++)
//     {
//         for (int j = 0; j < i; j++)
//         {
//             printf("%c ", c);
//             c++;
//         }
//         printf("\n");
//         c = 'A';
//     }
//     return 0;
// }
//         *
//      *     *
//   *     *     *
//*     *     *      *
// #include <stdio.h>
// int main()
// {
//     int a = 17;
//     int arr[50], i = 0;
//     while (a > 0)
//     {
//         arr[i] = a % 2;
//         a = a / 2;
//         i++;
//     }
//     printf("Binary representation: ");
//     for (int j = i - 1; j >= 0; j--)
//     {
//         printf("%d", arr[j]);
//     }
//     printf("\n");
//     printf("%d", i);
//     return 0;
// }
