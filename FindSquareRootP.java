// find the square root of any non negative value x.Round it off to the nearest floor integer value by using Binary Search
// There will be given an integer which defines the presisions returrn the squarte root with given presision.
import java.util.Scanner;
class FindSquareRootP {
    static double findSqRoot(int num,int presision){
        int start=0,end=num;
        double ans=0.0;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(mid*mid == num)return mid;
            else if(mid*mid<num){
                start=mid+1;
                ans=mid;
            }
            else
                end=mid-1;
        }
        double inc=0.1;
        for(int i=0;i<presision;i++){
            while(ans*ans<=num){
                ans+=inc;
            }
            ans=ans-inc;
            inc=inc/10;
        }
        return (float)ans;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num,pres;
    System.out.println("Enter the number want to find the square root");
    num=sc.nextInt();
    System.out.println("enter the presision value");
    pres=sc.nextInt();
    double res=findSqRoot(num,pres);
    System.out.println("The required square root number is "+res);
    }
}
