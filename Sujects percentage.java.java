public class subjects {
    public static void main(String args[]) {
      float Maths=95;
      float Physics=87;
      float C_science=98 ;
      float Biology=95;
      float Chemistry=97;
      float avg=(Maths+Physics+C_science+Biology+Chemistry)/5;
      float per=(avg/100)*100;
      if(per>50)
      System.out.println("Percentage="+per+"\npass");
      else
      System.out.println("Percentage="+per+"\nfail");
      
    }
}