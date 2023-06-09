import java.util.Arrays;
import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dizinin Boyutunu Giriniz:");
        int boyut= scan.nextInt();
        int list[]=new int[boyut];
        int x=0;
        for(int i=0;i<list.length;i++){
            System.out.println("Bir Sayi Giriniz:");
            int sayi= scan.nextInt();
            list[x++]=sayi;

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }

}
