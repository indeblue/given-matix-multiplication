import java.util.Scanner;
class matrix 
{

public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
    int r=8,c=8,p=8,q=8;
    int arr[][] = { {11,2,3,4,-15,6,17,8},
                    {3,-7,16,5,14,3,22,1},
                    {22,3,6,25,24,23,12,3},
                    {7,6,35,4,23,2,-11,22},
                    {26,6,7,28,11,-12,3,4},
                    {6,-15,8,7,-24,3,23,-4},
                    {-11,2,2,-11,5,6,27,18},
                    {12,7,24,15,6,17,8,19},
                };
    int arr2[][]= { {5,12,8,-11,4,18,6,2},
                    {-23,15,9,7,22,11,14,16},
                    {-5,-18,23,28,-34,26,6,9},
                    {7,14,11,6,9,-4,-7,6},
                    {4,5,-6,-7,11,8,9,10,-11},
                    {12,-13,14,15,16,-17,18,19},
                    {-20,21,22,-23,24,-25,26,27},
                    {4,3,2,1,9,8,7,6},
                };
    
  

    int arr3 [][]=new int[r][q];

    int sum=0;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<q;j++)
        {
for (int k=0;k<r;k++)
{

sum=sum+arr[i][k]*arr2[k][j];

}

arr3[i][j] = sum;
sum=0;

        }
 
}
System.out.println("product is");
for(int i=0;i<r;i++)
{
    for(int j=0;j<q;j++)
    {
        System.out.print(arr3[i][j]+"    ");

    }
    System.out.println();
}
}
}