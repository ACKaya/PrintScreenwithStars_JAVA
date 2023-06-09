import java.util.Scanner;

public class PalindromikKelimeler {
    public static void main(String[] args) {
        System.out.println(isPalindrom2());




    }
    static boolean isPalindrom(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kelimeyi Giriniz:");
        String kelime=scan.nextLine();
        int x=kelime.length()-1;
        int y=0;
        while(0<=x){
            if(kelime.charAt(x)!=kelime.charAt(y)){
                return false;
            }
            x--;
            y++;

        }
        return  true;


    }
    static boolean isPalindrom2(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kelimeyi Giriniz:");
        String kelime=scan.nextLine();
        String newKelime="";
        for(int i= kelime.length()-1;i>=0;i--){
           newKelime+=kelime.charAt(i);
        }
        if(kelime.equals(newKelime )){
            return true;
        }
        return false;



    }
}
