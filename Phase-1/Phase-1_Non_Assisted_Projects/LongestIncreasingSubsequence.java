package com.mazher.nonassisted;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int my_arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
	    int arr_len = my_arr.length;
	    System.out.println("The length of the longest increasing subsequence is: " +  longIncre_subseq(my_arr, arr_len));
	}
	static int longIncre_subseq(int my_arr[], int arr_len){
	      int sequence_Arr[] = new int[arr_len];
	      int i, j, max = 0;
	      for (i = 0; i < arr_len; i++)
	         sequence_Arr[i] = 1;
	      for (i = 1; i < arr_len; i++)
	      for (j = 0; j < i; j++)
	      if (my_arr[i] > my_arr[j] && sequence_Arr[i] < sequence_Arr[j] + 1)
	      sequence_Arr[i] = sequence_Arr[j] + 1;
	      for (i = 0; i < arr_len; i++)
	      if (max < sequence_Arr[i])
	      max = sequence_Arr[i];
	      return max;
	   }
    

}
