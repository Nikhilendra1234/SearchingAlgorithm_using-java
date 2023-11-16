// find the square root of any non negative value x.Round it off to the nearest floor integer value by using Binary Search

import java.util.Scanner;

public class FindSquareRoot {
     static int squareRoot(int square){
        int start=0,end=square;
        int mid;
        int ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            int val=mid*mid;
            if(val==square)
                return mid;
            else if(val< square)
            {
                ans=mid;
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the number to find the square root");
    int square=Sc.nextInt();
    System.out.println(squareRoot(square));
    }
}
