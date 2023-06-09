import java.util.Arrays;

public class Ornek2 {
    public static void main(String[] args) {
        int [] list={0,3,10,2,4,2,4,11,13,4};
        int []newList=new int [list.length];
        int x=0;
        for(int i=0;i< list.length;i++){
            for(int j=0;j< list.length;j++){
                if(i!=j&&list[i]==list[j]){
                    newList[x++]=list[i];
                    break;
                }
            }
        }
        Arrays.sort(newList);
        for(int gez:newList){
            if(gez!=0){
                System.out.print(" "+gez);
            }
        }
    }
}
