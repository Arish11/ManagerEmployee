package learn.exception;

import java.io.Serializable;
import java.util.Scanner;

class DuplicateNumberException extends Exception implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public DuplicateNumberException() {
		System.out.println("This is an error and you cannot enter duplicate values");
	}
	
	public DuplicateNumberException(String s) {
		System.out.println();
	}
	
}

public class DuplicateNumber {

	public static void main(String[] args) {
		int arr[];
		arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the list of numbers");
		for(int i=0 ; i < 5; i++) {
			int nextNum =  sc.nextInt();
			try {
				if(checkDuplicate(arr, nextNum)) {
					throw new DuplicateNumberException("This is a duplicate");
				}else {
					arr[i] = nextNum; 
				}
			} catch (Exception e) {
				System.out.println("Not Allowed! ");
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
