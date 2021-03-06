package search;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] t ={3,4,7,8,10,12,15,19,20};
		
		int n = t.length;
		
		int data = 15;
		
		int idx  =0; 
		
		idx = binarySearch(t,n,data);
		
		System.out.println(idx);

	}
	static int binarySearch(int[] t,int n, int data){
		int idx = -1;
		int low = 0;
		int high =n;
		
		for(;(low <= high)&(idx == -1);){
			int mid =(low + high) /2;
			if(data == t[mid]){
				idx = mid;
			}else{
				if(data > t[mid]){
					low = mid + 1;
				}else{
					high = mid -1;
				}
			}
			
		}
		
		
		
		
		return idx;
	}

}
