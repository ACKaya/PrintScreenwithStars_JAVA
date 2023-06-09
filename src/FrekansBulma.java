import java.util.Arrays;

public class FrekansBulma {
    public static void main(String[] args) {
        int [] list ={2,3,2,1,1};
        int [] newList=new int[list.length];
        for(int i=0;i< list.length;i++){
            newList[i]=1;
        }
        for(int i=0;i< list.length;i++){
            for(int j=0;j< list.length;j++){
                if((i!=j)&&(list[i]==list[j])){
                    list[i]=0;
                }
            }
        }
        for(int i=0;i< list.length;i++){
            for(int j=0;j< list.length;j++){
                if(i!=j&&list[i]==list[j]){
                    newList[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(newList));
        System.out.println(Arrays.toString(list));

    }
}
