public class febin {
    public static void main(String args[]) {
     
     int var1=0,var2=1,var3;
     System.out.print(var1+" "+var2+" ");
     for(int i=3;i<=15;i++)
     {var3=var1+var2;
     var2=var3;
     var1=var2;
     System.out.print(var3+" ");}
     
    }
}