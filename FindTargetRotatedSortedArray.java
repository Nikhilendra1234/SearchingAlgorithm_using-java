// Given a rotated sorted array of integers, which contains distinct elements, and an integer target,return the index of the target if it is in the array otherwise return -1;
import java.util.Scanner;
class FindTargetRotatedSortedArray {
    static boolean searchTarget(int[]a,int target,int start,int end){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(a[mid]==target)
                return true;
            else if(a[mid]<a[end]){//mid to end is sorted
                if(a[mid]<=target && target<=a[end])
                    start=mid+1;
                else
                    end=mid-1;
            }
            else{
                if(a[start]<=target && target<=a[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int []a={4,5,6,7,8,1,2,3};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to search");
        int target=sc.nextInt();
        boolean ans=searchTarget(a,target,0,a.length-1);
        if(ans==true)
            System.out.println("The searched number is present in the Array");
        else    
            System.out.println("The search number is not present");
    }
}
