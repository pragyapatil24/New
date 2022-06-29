public class Pattern {
    public static void main(String[] args) {

        int noRow=5;
        for(int r=1;r<=noRow;r++) {

            for(int sp=1;sp<=noRow;sp++) {
                System.out.print(" ");
            }
            for(int st=1;st<=noRow-r+1;st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
