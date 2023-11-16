// find the first occurence of the  given element in an sorted array.using binary search
import java.util.Scanner;
class FirstOccurence{
    static int firstOccurence(int[]a,int target,int start,int end){
        int mid;
        int ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(a[mid]==target){
            ans=mid;
            end=mid-1;
            }
            else if(target>a[mid])
                start=mid+1;
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []a={1,2,3,3,3,4,5,5,5,6,8};
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the number trying  to know the first ocurence");
        int target=Sc.nextInt();  
        int index=firstOccurence(a,target,0,a.length-1);
        if(index==-1)
        System.out.println("The number is not present in the array");
        else    
        System.out.println("The number is first present at index "+index);
    }
}