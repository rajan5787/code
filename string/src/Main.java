import java.util.*;
import java.io.*;
class Main
{
	static char arr1[],arr2[];
	static int ntl,tl;
	static String arr3[][],first[],follow[];
	public static void main(String args[]) throws IOException
	{
		String nt,t;
		int i,j,n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the non-terminals");
		nt=br.readLine();
		ntl=nt.length();
		arr1=new char[ntl];
		arr1=nt.toCharArray();
		System.out.println("Enter the terminals");
		t=br.readLine();
		tl=t.length();
		arr2=new char[tl];
		arr2=t.toCharArray();
		System.out.println("Specify the grammar(Enter 9 for epsilon arr4duction)");
		arr3=new String[ntl][];
		for(i=0;i<ntl;i++)
		{
			System.out.println("Enter the number of arr4ductions for "+arr1[i]);
			n=Integer.parseInt(br.readLine());
			arr3[i]=new String[n];
			System.out.println("Enter the arr4ductions");
			for(j=0;j<n;j++)
				arr3[i][j]=br.readLine();
		}
		first=new String[ntl];
		for(i=0;i<ntl;i++)
			first[i]=first(i);
		System.out.println("First Set");
		for(i=0;i<ntl;i++)
			System.out.println(removeDuplicates(first[i]));
		follow=new String[ntl];
		for(i=0;i<ntl;i++)
			follow[i]=follow(i);
		System.out.println("Follow Set");
		for(i=0;i<ntl;i++)
			System.out.println(removeDuplicates(follow[i]));
	}
	static String first(int i)
	{
		int j,k,l=0,found=0;
		String temp="",str="";
		for(j=0;j<arr3[i].length;j++)
		{
			for(k=0;k<arr3[i][j].length();k++,found=0) {
				for(l=0;l<ntl;l++) 
				{
					if(arr3[i][j].charAt(k)==arr1[l])
					{
						str=first(l);
						if(!(str.length()==1 && str.charAt(0)=='9'))
							temp=temp+str;
						found=1;
						break;
					}
				}
				if(found==1)
				{
					if(str.contains("9"))
						continue;
				}
				else
					temp=temp+arr3[i][j].charAt(k);
				break;
			}
		}
		return temp;
	}
	static String follow(int i)
	{
		char arr4[] = null,chr[];
		String temp="";
		int j,k,l = 0,m,n,found=0;
		if(i==0)
			temp="$";
		for(j=0;j<ntl;j++)
		{
			for(k=0;k<arr3[j].length;k++) 
				if(arr4[l]==arr1[i]) 
				{
					if(l==arr4.length-1) {
						if(j<i)
							temp=temp+follow[j];
					}
					else{
						for(m=0;m<ntl;m++){
							if(arr4[l+1]==arr1[m]) {

								chr=new char[first[m].length()];
								chr=first[m].toCharArray();
								for(n=0;n<chr.length;n++){
									if(chr[n]=='9'){
										if(l+1==arr4.length-1)
											temp=temp+follow(j); 
										else
											temp=temp+follow(m);
									}
									else
										temp=temp+chr[n]; 
								}
								found=1;
							}
						}
						if(found!=1)
							temp=temp+arr4[l+1]; 
					}
				}
		}
		return temp;
	}
	
static String removeDuplicates(String str)
{
	int i;
	char ch;
	boolean flag[] = new boolean[256];
	StringBuilder sb = new StringBuilder(flag.length);
	for(i=0;i<str.length();i++)
	{
		ch=str.charAt(i);
		if (!flag[ch])
		{
			flag[ch] = true;
			sb.append(ch);
		}
	}
	return sb.toString();
}
}
