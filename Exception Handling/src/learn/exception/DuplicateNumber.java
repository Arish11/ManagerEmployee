package learn.exception;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		int arr[];
		arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the list of numbers");
		for(int i=0 ; i < 5; i++) {
			int nextNum =  sc.nextInt();
			if(checkDuplicate(arr, nextNum)) {
				System.out.println("The number is a duplicate and already exists");
			}else {
				arr[i] = nextNum; 
			}
		}
		sc.close();
	}
	
	public static boolean checkDuplicate(int[] arr, int num) {
		boolean flag = false;
		for(int i : arr) {
			if(arr[i] == num) {
				flag = true;
				break;
			}
		}
		return flag ;
	}

}
