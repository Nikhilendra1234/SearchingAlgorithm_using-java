// Implementing Binary Search for multiplae target element to search at a time using recursion.
class BinarySearch {
    static boolean binarySearch(int[]a,int target,int l,int r){
        if(l>r)return false;

        int mid=(r-l)/2+l;

        if(a[mid]==target)return true;

        else if(target<a[mid])
            return binarySearch(a,target,l,mid-1);
        else
            return binarySearch(a,target,mid+1,r);
    }
    public static void main(String[] args) {
     int []a={1,2,4,6,7,8,9};
     int target=0;
     while(target<10){
     System.out.printf("%d is present in array %b",target,binarySearch(a,target,0,a.length-1));   
     System.out.println();
     target++;

     }
    }    
}
