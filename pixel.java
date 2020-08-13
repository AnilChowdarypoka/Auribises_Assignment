
public class pixel {
	
	static void normal_display(int image  [][][]) {
		System.out.println("                Normal Image");
		System.out.println("                ~~~~~~~~~~~~");
		for (int [][] i :  image ) {
			for (int [] j : i){
				System.out.print("("+ " ");
				for (int k : j){
					System.out.print(k+ " ");
				
				}
				System.out.print(")"+ " ");
			}
			System.out.println(" ");
	}}
	
	static void grey_scale(int image  [][][], int avg [] ){
		
			
		int z = 0;
		
		for (int [][] i :  image ) {
			
			for (int [] j : i){
				int temp = 0;
				for (int k : j){
					temp = temp+k;}		 
				avg[z] = temp/3;
				 z  =z+1;
			}	
		}}	
static void assign(int [][][] image , int avg[]) {	
	System.out.println();
	System.out.println("             Grey Scale Image");
	System.out.println("             ~~~~~~~~~~~~~~~~");
	int f = 0;
	for (int [][] i :  image ) {
		for (int [] j : i){
			System.out.print("("+ " ");
			for (int k : j){
				System.out.print(avg[f]+ " ");
			}
			f = f + 1;
			System.out.print(")"+ " ");
		}
		System.out.println();
	}	
}


	public static void main(String[] args) {
		int arr1[] = { 120, 130 , 140};
		int arr2[] = { 121, 130 , 140};
		int arr3[] = { 122, 130 , 140};
		int arr4[] = { 123, 130 , 140};
		int arr5[] = { 124, 130 , 140};
		int arr6[] = { 125, 130 , 140};
		int arr7[] = { 126, 130 , 140};
		int arr8[] = { 127, 130 , 140};
		int arr9[] = { 128, 130 , 140};
		int image [][][] = {
				{arr1,arr2,arr3},
				{arr4,arr5,arr6},
				{arr7,arr8,arr9},
		};
		int avg [] = new int[9];
		
		
	normal_display(image);
	grey_scale(image,avg);
	assign(image , avg);

}
	

}
