import java.util.Arrays; 
 public class Exercise78 {
 public static void main(String[] args)
 {
    int[] array_nums = {5, 7};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	if(array_nums[0] == 4 || array_nums[0] == 7)
		System.out.println("True");
	else
    System.out.println(array_nums[1] == 4 || array_nums[1] == 7);
	 
 }
}
