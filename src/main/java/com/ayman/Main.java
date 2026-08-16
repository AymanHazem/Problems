void main()
{
    System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
}
public boolean containsDuplicate(int[] nums)
{
    boolean result = false;
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++)
    {
        if (nums[i]==nums[i+1])
        {
            result = true;
            break;
        }
    }
    return result;
}