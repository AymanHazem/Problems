void main()
{
    for (int i : nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}))
        System.out.print(i+" ");
    for (int i : nextGreaterElementV2(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}))
        System.out.print(i+" ");

}
public int[] nextGreaterElement(int[] nums1, int[] nums2)
{
    int size = nums1.length;
    int [] ans = new int[size];
    for (int i = 0; i < size; i++)
    {
        int idx=-1;
        for (int j = 0; j < nums2.length; j++)
        {
            if (nums2[j]==nums1[i])
            {
                idx=j;
                break;
            }
        }
        ans[i]=-1;
        for (int j = idx+1; j < nums2.length; j++)
        {
            if (nums2[j]>nums1[i])
            {
                ans[i]=nums2[j];
                break;
            }
        }
    }
    return ans;
}

public int[] nextGreaterElementV2(int[] nums1, int[] nums2)
{
    Map<Integer, Integer> nextGreater = new HashMap<>();
    Deque<Integer> stack = new ArrayDeque<>();
    for (Integer num : nums2)
    {
        while (!stack.isEmpty() && stack.peek() < num) nextGreater.put(stack.poll() , num);
        stack.push(num);
    }
    for (int i = 0; i < nums1.length; i++)
        nums1[i]= nextGreater.getOrDefault(nums1[i],-1);

    return nums1;
}