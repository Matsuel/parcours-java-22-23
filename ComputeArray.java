public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array==null){
            return array;
        }else{
            int[] tab= new int[array.length];
            for (int i=0;i<array.length;i++ ){
                if (array[i]%3==0){
                    tab[i]= array[i]*5;
                }else if ((array[i]%3)==1){
                    tab[i]=array[i]+7;
                }else {
                    tab[i]=array[i];
                }
            }
            return tab;
        }
    }
}