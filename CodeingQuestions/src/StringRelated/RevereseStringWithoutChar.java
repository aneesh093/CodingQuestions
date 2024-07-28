package StringRelated;
/**
 * 
 * @author Aneesh.Mathai
 */
public class RevereseStringWithoutChar {

	public static void main(String[] args) {
		 String st="Hell*-o123Hi";
	       int j= st.length()-1;
	        char[] revStrArr =  st.toCharArray();
	     
	        for(int i=0;i<j;){
	            char f= st.charAt(i);
	            char l= st.charAt(j);
	            if(! (Character.isLetterOrDigit(f))){
	                revStrArr[i] =f; i++;
	            }else if(! (Character.isLetterOrDigit(l))){
	                 revStrArr[i] =l;j--;
	            }else{
	                char temp=l;
	                revStrArr[j]=f;
	               revStrArr[i]=temp;
	                i++;j--;
	               
	            }
	        }
	        System.out.println(revStrArr);
	}

}
