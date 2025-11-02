class eg3{
public static void main(String gg[])
{
 // upper triangle printing logic
 for(int a = 1 ; a <= 5 ; a++)
 {
 for(int i = 5 ; i >= a ; i--)
 {
  System.out.print(" ");
 }
 for(int j = a ; j >= 1 ; j--)
 {
  System.out.print("*" + " ");
 }
 System.out.print("\n");
 }
 // lower triangle printing logic
 for(int a = 1 ; a < 5 ; a++)
 {
  for(int i = a + 1 ; i >= 1 ; i--)
  {
   System.out.print(" ");
  }
  for(int j = 5 ; j > a ; j--)
  {
   System.out.print("*" + " ");
  }
  System.out.print("\n");
 } 
}
}