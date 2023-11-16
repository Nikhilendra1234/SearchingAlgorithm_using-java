// A rotated sorted array is a sorted array on which rotation operation has been performed some number of times.given a rotated sorted array find the index of the minimum element in the array .follow 0 based indexing.
// it is guaranteed that all the element are unique in the array.4
class FindMinRotatedSortedArray {
    static int searchMin(int[]a,int start,int end){
        int min=-1,mid;
        int n=a.length;
        while(start<=end){
            mid=start+(end-start)/2;
            if(a[mid]<=a[n-1])
            {
                min=a[mid];
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return min;
    }
    public static void main(String[] args) {
        int []a={4,5,6,7,8,1,2,3};
        int min=searchMin(a,0,a.length-1);
        System.out.println("The minimum value in the array is "+min);
       
    }
}
