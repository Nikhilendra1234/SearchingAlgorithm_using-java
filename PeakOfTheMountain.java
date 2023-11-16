// given an array where a[0]<..a[i] and a[i]>a[i+1]... and so on which forms a mountain like structure our task is to find the peak index of the array using binary Search.
class PeakOfTheMountain {
    static int searchPeak(int[]a,int start,int end){
        int ans=-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(a[mid]<=a[mid+1])
                {
                    ans=a[mid+1];
                    start=mid+1;
                }
            else if(a[mid]>=a[mid+1])
                end=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int []a={1,3,5,7,6,4,2,0};
        int ans=searchPeak(a,0,a.length-1);
        System.out.println("The peak of the array is "+ans);
    }
}
