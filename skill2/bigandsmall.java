package skill2;

public class bigandsmall {
	    public static void main(String[] args) {
	        int[] arr = {24, 8, 15, 42, 4};
	        int max = arr[0], min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max)
	                max = arr[i];
	            if (arr[i] < min)
	                min = arr[i];
	        }
	        System.out.println("Maximum = " + max);
	        System.out.println("Minimum = " + min);
	    }
	}
