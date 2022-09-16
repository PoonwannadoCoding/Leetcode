public class palindrome{

	public static void main(String args[]){
	
	System.out.println(isPalindrome(121));
	}


	public static boolean isPalindrome(int x){

		if (x < 0) return false;

		else{
			int meep = x;
			int rev = 0;

			while(x > 0){

				rev *= 10;
				rev += x%10;
				
				x = x/10;
			}
			
			return meep == rev;
		}

	}


}
