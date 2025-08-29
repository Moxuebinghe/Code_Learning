package array;

public class arrayDemo5 {
    public static void main(String[] args) {
        //getting max value
        int[] facescores = {15, 9000, 10000, 20000, 9500, -5};
        int max = facescores[0];
        for(int i =0; i < facescores.length; i++){
            if (facescores[i] > max){
                max = facescores[i];    //遍历，比较后更新
            }
        }
        System.out.println(max);
    }
}
