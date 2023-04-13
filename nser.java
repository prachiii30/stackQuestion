import java.util.Stack;

public class nser {
    //Function to find the next smallest element for right each element of the array.
    public static long[] nextSmallestElement(long[] arr, int n)
    { 
        Stack<Long> stack = new Stack<>();
        long brr[]= new long[n];
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.empty() && arr[i]<=stack.peek()){
                stack.pop();
            }
            if(stack.empty()){
                brr[i]=-1;
            }
            else{
                brr[i]=stack.peek();
            }
            stack.push(arr[i]);
            
        }
        return brr;
    }
}
