import java.util.Arrays;

public class MatrisTranspozu {
    public static void main(String[] args) {
        int [][]list=new int[2][3];
        int x=1;
        for(int i=0;i< list.length;i++){
            for(int j=0;j<list[0].length;j++){
                list[i][j]=x++;

                System.out.print(list[i][j]);
            }
            System.out.println();

        }

        for(int i=0;i< list[0].length;i++){
            for(int j=0;j< list.length;j++){

                System.out.print(list[j][i]);

            }
            System.out.println();
        }



    }
}
