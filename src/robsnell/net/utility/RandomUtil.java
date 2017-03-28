package robsnell.net.utility;

import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

public class RandomUtil {
	Random rnd;
	int availableSetCondensed[];
	int maxNumber;
	
	public RandomUtil(int maxNumber, int[] excludes) {
		rnd = new Random();
		
		int[] availableSet = new int[maxNumber+1];
		int value = 0;
		int maxIdx = 0;

		for(int idx=0;idx <= maxNumber;idx++) {
		    while(ArrayUtils.contains(excludes, value)) {
		        value++;
		    }

		    if (value > maxNumber) {
		    	maxIdx = idx;
		    	break;
		    }
		    
		    availableSet[idx] = value;

		    maxIdx = idx;
		    value++;
		}
		
		availableSetCondensed = new int[maxIdx];
		java.lang.System.arraycopy(availableSet, 0, availableSetCondensed, 0, maxIdx);
		
		DebugUtil.print(availableSet);
		DebugUtil.print(availableSetCondensed);
	}
	
	public int next() {
		int fromRnd = rnd.nextInt(availableSetCondensed.length);
		return availableSetCondensed[fromRnd];
	}
}
