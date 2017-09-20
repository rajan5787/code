package aaa;

import java.math.*;
public class Main {

	
	public static void main(String argv[]){
		BigInteger x = new BigInteger("1");
		for(int i=0;i<=200;i++){
			x=x.multiply(new BigInteger("10"));
	}
	
	BigInteger y = new BigInteger("1");
	for(int i=0;i<=199;i++){
		y=y.multiply(new BigInteger("10"));
	
}
	
	
	x = x.subtract(y);
	
	x = x.subtract(new BigInteger("108900000"));
	
	x = x.mod(new BigInteger("1000000007"));
	
	System.out.println(x);

}
}
