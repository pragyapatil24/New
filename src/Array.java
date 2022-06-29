public class Array {
    public static void main(String[] args) {

        int[] a = {8,4,3,1,5};
        int temp= 0;

        System.out.println("array:");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if (a[i]==a[j]){
                    //temp=a[ ];/
                }
            }
        }

    }
}
