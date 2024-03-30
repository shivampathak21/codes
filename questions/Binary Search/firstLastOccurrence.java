
public class firstLastOccurrence {
    public static int findFirst(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) {
                result=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
              high=mid-1;
            }
        }
            return result;



    }
    public static int findLast(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) {
                result=mid;
                low = mid + 1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
             else{
              high=mid-1;
            }
            
        }
            return result;
        }

    public static void main(String[] args) {
        int nums[]={1,10,10,10,4,7};
        int target= 10;
        int firstOcc=findFirst(nums,target);
        int lastOcc=findLast(nums,target);
       System.out.println("first occurence at :"+ firstOcc);
       System.out.println("last occurence at :" +  lastOcc);

    }
}
