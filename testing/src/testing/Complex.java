package testing;

public class Complex {

	int real_part,imaginary_part;
	public Complex(int r,int i){
		
		real_part = r;
		imaginary_part = i;
	}
	
	public Complex(){
		
		real_part = 0;
		imaginary_part = 0;
		
	}
	
	public static void main(String argv[]){
		Complex c1 = new Complex(7,2);
		Complex c2 = new Complex(13,4);
		Complex result  = c1.Add(new Complex(5,3));
		
		if(result.get_r()==c2.get_r()&&
				)
	}
	
	public boolean Equal(Complex c){
		boolean result = false;
		
		if((real_part==c.get_r())&&(imaginary_part==c.get_i()))
			result  = true;
			
			return result;
	}
	
	public Complex Add(Complex c){
		Complex result = new
				Complex(c.get_r()+real_part,c.get_i()+imaginary_part);
		
		return result;
	}
	
	public int get_r(){
	
		return real_part;
	}
	
	public int get_i(){
		return imaginary_part;
	}
	
	
}
