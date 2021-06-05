public class DNA_Repeats
{
  public static void main(String[] args)
   {
     String dna="ATAGAATTCCTAGGATTTGAATTCCCTAGTACGGAATTCTCGTAT";
     String rep_seq="GAATTC";
     int count=0,k,number=0;
     for(int i=0;i<dna.length();i++)
      {
        if(dna.charAt(i)==rep_seq.charAt(0))
          {
            k=i;
            for(int j=0;j<rep_seq.length();j++)
             { 
               if(dna.charAt(k)==rep_seq.charAt(j))
                {
                  count++;
                  k++;
                }
             }  
                 if(count==rep_seq.length())
                { number++;}
             }
               count=0;
            
      }    
       System.out.println("The Given sequence is"+" "+dna) ;
       System.out.println("The repeat sequence is"+" "+rep_seq);
       System.out.println("No: of times this particular repeat sequence is present in the sequence is"+" "+number);  
        
       
      }
}