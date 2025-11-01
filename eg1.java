public class eg1 {
    public static void main(String gg[]){
        int a = 1;
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(a);
                System.out.print("\t");
                a++;
            }
            System.out.print("\n");
        }
    }
}