public class strictlyIncOrDec {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        System.out.println(solve(nums));
        int[]nums2={5,4,3,2,1};
        System.out.println(solve(nums2));
        int[]nums3={0,2,0};
        System.out.println(solve(nums3));
        int[]nums4={0};
        System.out.println(solve(nums4));
        int[]nums5={0,0};
        System.out.println(solve(nums5));
        }


    public static boolean solve(int[] nums) {
        if (nums.length==1)return true;
        if(nums[0]>nums[nums.length-1] || nums[0]>nums[1]){
            int lastInt=nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]>=lastInt){
                    return false;
                }
                lastInt=nums[i];

            }
        }
        if(nums[0]<nums[nums.length-1] || nums[0]<nums[1]){
            int lastInt=nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]<=lastInt){
                    return false;
                }
                lastInt=nums[i];

            }
        }
        int lastInt=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==lastInt){
                return false;
            }
            lastInt=nums[i];
        }

        return true;
    }

}
