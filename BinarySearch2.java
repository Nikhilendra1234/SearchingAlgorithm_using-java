class BinarySearch2 {
    static boolean binarySearch(int[]a,int target,int start,int end){
       int mid=0;
        while(start<=end){
             mid=start+(end-start)/2;
                if(a[mid]==target)
                    return true;
                else if(target<a[mid])
                    end=mid-1;
                else
                    start=mid+1;
              }
         return false; 
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
