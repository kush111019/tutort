class eg6 {
public static void main(String gg[])
{
 for(int i = 1 ; i <= 10 ; i++)
 {
  if(i == 1 || i == 10)
  {
   for(int j = -1 ; j <= 10 ; j++)
   {
    System.out.print("*" + " ");
   }
   System.out.println();
  }
  else
  {
   System.out.print("*" + " ");
   for(int j = 1 ; j <= 10 ; j++)
   {
    System.out.print(" " + " ");
   }
   System.out.print("*" + " ");
   System.out.println();
  }
 }
}
}