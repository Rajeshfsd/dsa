public class Palindrome {
public static void main(String [] args)
{
    String str="madam";
    String ans="";
    for(int i=str.length()-1;i>=0;i--)
    {
        ans+=str.charAt(i);
    }
    if(ans.equals(str)){
        System.out.println("palindrome");
    }else{
        System.out.println("not a palindrome");
    }
}    
}
