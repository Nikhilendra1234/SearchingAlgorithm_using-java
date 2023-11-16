// Search the targeted value in the 2D integer matrix of dimension m x n and return true if found else return false.
// This matrix has followinig properties.
// 1.integer in each row are sorted from left to right.
// 2. The first integer of each row is greater than the last integer of second row.
import java.util.Scanner;
class FindIn2DArray2 {
    static boolean searchMatrix(int[][]a,int target)
    {
        int n=a.length,m=a[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0)
        {
            if(a[i][j]==target)return true;
            else if(target<a[i][j])
                j--;
            else
                i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][]a={{1,2,3,4},{5,6,7,8},{10,12,15,17}};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number trying to search");
        int target=sc.nextInt();
        boolean res=searchMatrix(a,target);
        if(res==true)
            System.out.println("The searched number is present");
        else
            System.out.println("The searched number is not present");
    }
}
