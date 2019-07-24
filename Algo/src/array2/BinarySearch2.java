package array2;

public class BinarySearch2 {
	
	public static int binarysearch2 (int a[], int low, int high, int key) {
		if(low > high) {
			return -1;
			}
		
		int middle = (low + high)/2;
		
		if(key == a[middle]) { 
			return middle;
		}
		else if(key < a[middle]) {
			return binarysearch2(a, low, middle -1 , key);
			}
		else{
			return binarysearch2(a, middle +1, high , key);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,17,28,67,80,92,100};
		int key = 80;
		int result = binarysearch2(a ,0,a.length-1, key);
		System.out.println("a배열 의 " + result + "번째 인덱스에 위치합니다.");
	}

}
