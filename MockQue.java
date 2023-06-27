import java.util.Arrays;
public class MockQue {
     public static int[] moveZeroes(int[] nums) {
        int m=-1;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                if(m==-1 || nums[m]!=0)
                {
                    m=i;
                }
            }
            else
            {
                if(m!=-1)
                {
                    int temp = nums[i];
                    nums[i]=nums[m];
                    nums[m]=temp;
                    m++;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] nums = { 0 , 1 , 0 , 3 , 12 };
        
        System.out.println(Arrays.toString(moveZeroes(nums)));

    }
}
