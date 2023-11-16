// Search the targeted value in the 2D integer matrix of dimension m x n and return true if found else return false.
// This matrix has followinig properties.
// 1.integer in each row are sorted from left to right.
// 2. The first integer of each row is greater than the last integer of second row.
import java.util.Scanner;
class FindIn2DArray {
    static boolean searchMatrix(int[][]a,int target,int m,int n){
        int start=0,end=m*n-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            int row,col;
            row=mid/n;
            col=mid%n;
            if(a[row][col]==target)
                return true;
            else if(target>a[row][col])
                start=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
     int[][]a={{1,2,3,4},{5,6,7,8},{10,12,15,17}};
     int m=3,n=4;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number trying to search");
        int target=sc.nextInt();
        boolean res=searchMatrix(a,target,m,n);
        if(res==true)
            System.out.println("The searched number is present");
        else
            System.out.println("The searched number is not present");
    }
}
