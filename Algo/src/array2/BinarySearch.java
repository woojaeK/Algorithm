package array2;

public class BinarySearch {

	static int binarysearch(int[] a, int key) {
		
		int start = 0;
		int end = a.length-1;
		
		while(start <= end) {
			
			int middle = (start + end)/2;
			
			if(a[middle] == key) {
				return middle;
			}
			else if (a[middle] > key) {
				end = middle -1;
			}
			else {
				start = middle +1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,17,28,67,80,92,100};
		int key = 80;
		int result = binarysearch(a , key);
		System.out.println("a배열 의 " + result + "번째 인덱스에 위치합니다.");
	}

}
