// A new racing track for kids is being built in new york with 'n' starting spots.The spots are located along a straight line at positions x1,x2,x3....xn(xi<=10^9).for each 'i',xi+1>xi.
// At a time only 'm'children are allowed to enter the race.since that is for kids they may run into each other while running.To prevent this ,we want to choose the starting spots such that the minimum distance between any two of them is as large as possible.What is the largest minimum distance?

// The first line input will contain the value of n,the number of starting spots
// The second line of input will contain the n number denoting the location of each spot.
// The third line will contain the value of m,number of children.
class RaceTrack {
    static boolean isPossible(int[] a,int kids,int min){
        int noofkids=1,lastPos=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-lastPos >= min){
                lastPos=a[i];
                noofkids++;
            }
        }
        return noofkids>=kids;
    }
    static int raceTrack(int[] a,int kids){
        if(kids>a.length)return -1;
        int mid,ans=0;
        int start=1,end=(int)1e9;
        while(start<=end){
            mid=start+(end-start)/2;
            if(isPossible(a,kids,mid)){
                ans=mid;
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={1,2,4,8,9};
        int kids=3;
        System.out.println(raceTrack(a,kids));
    }   
}
