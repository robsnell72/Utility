package robsnell.net.utility;

public class DebugUtil {
    public static void print(int[] arr) {
    	for(int i=0;i <= arr.length-1;i++) {
    		System.out.println(String.format("(%1d) -> %2d", i, arr[i]));    		
    	}
    }
}
