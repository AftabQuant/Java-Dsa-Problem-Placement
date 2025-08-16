package BasicsCodingRevision;

import java.util.Scanner;

public class PatternPrinting {
    public static void star_square(int row) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void  number_square(int n) {
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void alphabet_square(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print((char) (j+96)+" ");
            }
            System.out.println();
        }
    }

    public static void star_triangle(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void number_triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void mixture_triangle(int n) {
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                for(int j=1; j<=i; j++) {
                    System.out.print((char)(j+96) + " ");
                }
            }
            else {
                for(int j=1; j<=i; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }

    public static void reverse_triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void odd_num_triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<= i; j++) {
                System.out.print(2*j - 1+" ");
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n) {
        int a = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<= i; j++) {
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }

    public static void star_plus(int n) {
        int mid = n/2+1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i==mid)System.out.print("* ");
                else if(j==mid) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void star_cross(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i==j || i+j == n+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void binary_triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i%2 == 0){
                    if(j%2==1) System.out.print("0 ");
                    else System.out.print("1 ");
                }
                else {
                    if(j%2==1) System.out.print("1 ");
                    else System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void star_triangle_flip(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i+j > n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void number_triangle_flip(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<n-i+1; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int n = sc.nextInt();
        number_triangle_flip(n);
    }
}
