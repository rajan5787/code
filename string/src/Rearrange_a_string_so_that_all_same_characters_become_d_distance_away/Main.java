package Rearrange_a_string_so_that_all_same_characters_become_d_distance_away;
import java.util.*;

class Node  {
	char ele;
	int value;
	
	
	
}
class Main{
	public static void main(String... a){
		String w = "adcdbada";
		char[] word = w.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<word.length;i++){
			if(map.containsKey(word[i])){
				map.put(word[i],map.get(word[i])+1);
			}
			else{
				map.put(word[i],1);
			}
			word[i]='\0';
		}
		for(int i=0;i<word.length;i++)
             System.out.print(word[i]+" ");
             
             System.out.println();
             
		Node[] arr = new Node[map.size()];
		for(int i=0;i<arr.length;i++){
			arr[i]=new Node();
		}
		int o=0;
		for(Map.Entry m:map.entrySet()){
			char p = (char)m.getKey();
			int q = (int)m.getValue();
			arr[o].value=q;
			arr[o].ele=p;
			o++;
			//System.out.println(m.getKey()+" "+m.getValue());
		}	
		// for(int k=0;k<arr.length;k++){
		// 	System.out.println(arr[k].ele+" "+arr[k].value);
			
		// }

		int n=arr.length;
		Node temp;
		  for(int p=0; p < n; p++){  
                 for(int j=1; j < (n-p); j++){  
                          if(arr[j-1].value < arr[j].value){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         } 
        int d=2;
        for(int i=0;i<n;i++){
        	int k = i;
        	while(word[k]!='\0')
        		k++;
        	System.out.println(k);
        	for(int q=0;q<arr[i].value;q++){

        		word[k+d*q]=arr[i].ele;
        	}
        }
        for(char t:word){
        	System.out.print(t);
        }
	}
}