public class subjects {
    public static void main(String args[]) {
      float Maths=85;
      float Physics=90;
      float C_science=98 ;
      float Biology=90;
      float Chemistry=98;
      float per=((Maths+Physics+C_science+Biology+Chemistry)/500)*100;
      if(per>50)
      System.out.println("Percentage="+per+"\npass");
      else
      System.out.println("Percentage="+per+"\nfail");
      
    }
}