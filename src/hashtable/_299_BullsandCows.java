package hashtable;

public class _299_BullsandCows {
	 public String getHint(String secret, String guess) {
	        if(null == secret || null == guess){
	            return "";
	        }
	        StringBuilder res = new StringBuilder();
	        int[] A = new int[10];
	        int[] B = new int[10];
	        int sameInBit = 0;
	        int sameNotInBit = 0;
	        for(int i = 0; i < secret.length(); i++){
	            if(secret.charAt(i) == guess.charAt(i)){
	                sameInBit++;
	            }
	            A[secret.charAt(i) - '0']++;
	            B[guess.charAt(i) - '0']++;
	        }
	        
	        for(int i = 0; i < 10; i++){
	            sameNotInBit += Math.min(A[i],B[i]);
	        }
	        res.append(""+sameInBit).append("A").append(sameNotInBit - sameInBit).append("B");
	        return res.toString();
	    }

}
