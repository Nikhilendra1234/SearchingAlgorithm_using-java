// Given a sorted array with dupicate elements.find the target element last ocdurence by using Binary Search .
import java.util.Scanner;
class LastOccurence {
    static int lastOccurence(int[]a,int target,int start,int end){
        int mid;
        int ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(a[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(target>a[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]a={1,2,4,4,4,6,6,7,8,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element in the array");
        int target=sc.nextInt();
        int lastIndex=lastOccurence(a,target,0,a.length-1);
        if(lastIndex==-1)
            System.out.println("The number is not present");
        else    
            System.out.println("The searched last occurence present at index"+lastIndex);
    }
}
