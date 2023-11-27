// you have 'n'(n<10^5) boxes of chocolate.each box contains a[i](a[i]<=10000) chocolates.you need to distribute these boxes among "m" students such that the maximum number of chocolates allocated to a student is minimum.
// a.one box will allocated to exactly one student.
// b.all the boxes should be allocated.
// c.Each student has to be allocated at least one box.
// d.Allotment should be in contiguous order,for instance,a student can not be allocated box 1 and box 3,skipping 2.
// calculate and return that minimum possible answer.

// Assume that it is always possible to distribute the chocolates.
class DistributeChocolate {
    static boolean isPossible(int[] a,int max,int students){
        int choclate=0,noofstudents=1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max)return false;

            if(choclate+a[i] <=max){
                choclate+=a[i];
            }
            else{
                noofstudents++;
                choclate=a[i];
            }
        }
        return noofstudents<=students;
    }
    static int distributeChocolate(int[] a,int students){
        if(a.length<students)return -1;
        int start=1,end=(int)1e9;
        int mid,ans=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(isPossible(a,mid,students))
            {
                ans=mid;
                end=mid-1;
            }
            else    
                start=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={5,3,1,4,2};
        int students=3;
        System.out.println(distributeChocolate(a,students));
    }

}
