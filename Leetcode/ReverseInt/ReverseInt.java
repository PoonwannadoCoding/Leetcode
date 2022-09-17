public class ReverseInt{

	public static void main(String args[]){

		System.out.println(rev(-2147483412));

	}


	public static int rev(int x){
	
		int reverse = 0;

		int numfront = 1;

		if (x < 0){
			numfront = -1;
			x = x*numfront;
		}

		while (x >0 ){ 
			if (reverse * numfront > Integer.MAX_VALUE/10 || reverse * numfront < Integer.MIN_VALUE/10) return 0;	
			reverse *= 10;
			reverse += x%10;
			x = x/10;
		}
		return reverse * numfront;
	}

}
