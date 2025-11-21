
public class MaxNoOfWordsInSentences {
      public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
           String s=sentences[i];
           int temp=1;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    temp++;
                }
            }
            ans=Math.max(ans,temp);
        }
        return ans;
    }
    public static void main(String [] args){
        String[]  sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        MaxNoOfWordsInSentences m=new MaxNoOfWordsInSentences();
        int result=m.mostWordsFound(sentences);
        System.out.println(result);
    }
}
