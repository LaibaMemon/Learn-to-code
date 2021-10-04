import java.util.Arrays;
import java.util.Collections;

class SortingOfArrayWithDescending
{
	public static void main(String args[])
	{
	    Integer arr[]={555,22,227,12,0,4};

	    Arrays.sort(arr,Collections.reverseOrder());
	    System.out.println("Descending Order"+Arrays.toString(arr));
	}
}
