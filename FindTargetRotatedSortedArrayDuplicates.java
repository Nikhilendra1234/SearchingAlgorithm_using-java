// Given a Rotated sorted array.search an element in the Rotated sorted array with duplicate element.Return true if the element is found , else return false.
import java.util.Scanner;
class FindTargetRotatedSortedArrayDuplicates {
    static int searchTarget(int[]a,int target,int start,int end){
        int mid;
        while (start<=end) {
            mid=start+(end-start)/2;
            if(a[mid]==target)
                return mid;
            else if(a[start]==a[mid] && a[mid]==end){
                start++;
                end--;
            }
            else if(a[mid]<=a[end]){//mid to end is sorted
                if(target>a[mid] && target<=a[end])
                    start=mid+1;
                else    
                    end=mid-1;
            }
            else //start to mid is sorted
            {
                if(target>a[start] && target<=a[mid])
                    end=mid-1;
                else    
                    start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []a={1,2,2,3,4,4,5,1};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number want to search");
        int target=sc.nextInt();
        int ans=searchTarget(a,target,0,a.length-1);
        if(ans==-1)
            System.out.println("The searched number is not present");
        else   
            System.out.println("The search number is present at index "+ans);
    }
}