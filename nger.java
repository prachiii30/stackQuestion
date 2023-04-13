import java.util.Stack;

class nger {
    public static void main(String[] args) {
        
        int[] arr= {1,5,6,2,4,6,7,12};
        nextGreaterElements(arr);
        
    }
    public static void nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
          Stack<Integer> stack = new Stack<>();
          for (int i =  nums.length - 1; i >= 0; --i) {
              while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) {
                  stack.pop();
              }
              res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
              stack.push(i % nums.length);
          }
          for(int i=0;i<nums.length;i++){
            System.out.println(res[i]);
          }
             
      }
}
