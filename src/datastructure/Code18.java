package datastructure;

import java.util.Scanner;

public class Code18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		bubbleSort( n, data );
		
		
		System.out.println("정렬된 데이터 : ");
		for (int i = 0; i < n; i++)
			System.out.println(data[i]);
	}
	
	static void bubbleSort( int n, int[] arr ) {
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < n; j++) {
				if(data[j]>data[j+1]) {
					int tmp = data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
				}					
			}
		}	
		return;
		//아무것도 리턴하지 않기 때문에 return은 안써도 됨
	}
}