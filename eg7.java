class eg7 {
public static void main(String gg[])
{
 // logic to print upper half
 for(int i = 1 ; i <= 10 ; i++)
 {
  for(int k = 1 ; k <= i ; k++)
  {
   System.out.print("*");
  }
  for(int j = 9 ; j >= i ; j--)
  {
   System.out.print(" " + " ");
  }
  for(int m = 1 ; m <= i ; m++)
  {
   System.out.print("*");
  }
  System.out.println();
 }
 // logic to print lower half
 for(int i = 1 ; i <= 10 ; i++)
 {
  for(int k = 10 ; k >= i ; k--)
  {
   System.out.print("*");
  }
  for(int j = 1 ; j < i ; j++)
  {
   System.out.print(" " + " ");
  }
  for(int m = 10 ; m >= i ; m--)
  {
   System.out.print("*");
  }
  System.out.println();
 }
}
}