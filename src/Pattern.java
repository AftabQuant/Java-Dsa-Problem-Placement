public class Pattern {
    static void print(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i%2!=0 && j%2!=0) System.out.print(1 +" ");
                else if(i%2==0 && j%2!=0) System.out.print(0 +" ");
                else if(i%2==0) System.out.print(1 +" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        print(10);
    }
}
