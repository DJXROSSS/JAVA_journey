package Lecture3.PatternPrinting;
public class Sheet1 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
        int num = 5;
        Q1(num);
        Q2(num);
        Q3(num);
        Q4(num);
        Q5(num);
        Q6(num);
        Q7(num);
        Q8(num);
        Q9(num);
        Q10(num);
        Q11(num);
        Q12(num);
        Q13(num);
        Q14(num);
        Q15(num);
        Q16(num);
        Q17(7);
        Q18(7);
        Q20(7);
        Q19(7);
        Q20(7);
        Q21(7);
        Q22(7);
        Q23(5);
        Q24(5);
        Q25(5);
        Q26(5);
        Q27(5);
        Q28(5);
        Q29(5);
        Q30(5);
        Q31(5);
        Q32(5);
        Q33(10);
    }


    public static void Q1(int n){
        for (int i = 0;i<n;i++){
            System.out.println("*".repeat(n));
        }
    }
    public static void Q2(int n){
        int i;
        for (i = 1; i <= n; i++){
            System.out.println("*".repeat(i));
        }
    }
    public  static void Q3(int n){
        int i;
        for (i = 0; i < n; i++){
            System.out.println("*".repeat(n-i));
        }
    }
    public  static void Q4(int n){
        int i;
        for (i = 1; i <= n; i++){
            System.out.println(" ".repeat(n-i)+"*".repeat(i));
        }
    }
    public static void Q5(int n){
        int i;
        for (i = 0; i < n; i++){
            System.out.println(" ".repeat(i)+"*".repeat(n-i));
        }
    }
    public static void Q6(int n){
        int i;
        for (i = 0; i < n; i++){
            System.out.println(" ".repeat(2*i)+"*".repeat(n-i));
        }
    }
    public static void Q7(int n){
        int i;
        for (i = 1; i <= n; i++){
            if (i==1 || i==n){
                System.out.println("*".repeat(n));
            } else {
                System.out.println("*"+" ".repeat(n-2)+"*");
            }
        }
    }
    public static void Q8(int n){
        int i, j;
        for (i = 1; i < n; i++){
//            System.out.println(" ".repeat(i-1)+"*"+" ".repeat(n-i)+"*");
            for (j = 1; j <= n; j++){
                if ((i == j) || i+j-1 == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void  Q9(int n) {
        int i;
        for (i = 0; i<n; i++) {
            System.out.println(" ".repeat(n-i-1)+"*".repeat(i*2+1));
        }
    }
    public static void Q10(int n) {
        int i;
        for (i=n;i>0;i--){
            System.out.println(" ".repeat(n-i)+"*".repeat(i*2-1));
        }
    }
    public static void Q11(int n) {
        int i, j;
        for (i = 0; i < n; i++){
            System.out.print(" ".repeat(n-i-1));
            for (j = 0; j < 2 * i + 1; j++){
                if (j % 2 == 0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Q12(int n) {
        int i, j;
        for (i = 0; i < n; i++){
            System.out.print(" ".repeat(n-i-1));
            for (j = 0; j < 2 * i + 1; j++){
                if (j % 2 == 0){
                    System.out.print("*");
                } else {
                    System.out.print("!");
                }
            }
            System.out.println();
        }
    }
    public static void Q13(int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("*".repeat(i+1));
        }
        for (i = 0; i < n; i++) {
            System.out.println("*".repeat(n-i-1));
        }
    }
    public static void Q14(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n-i)+"*".repeat(i));
        }
        for (i = n-1; i > 0; i--) {
            System.out.println(" ".repeat(n-i)+"*".repeat(i));
        }
    }
    public static void Q15(int n){
        int i;
        for (i = 0; i < n; i++){
            System.out.println(" ".repeat(2*i)+"*".repeat(n-i));
        }
        for (i = n-2; i >=0; i--){
            System.out.println(" ".repeat(2*i)+"*".repeat(n-i));
        }
    }
    public static void Q16(int n){
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n-i)+"*".repeat(n-i+1));
        }
        for (i = n-2; i >= 0 ; i--) {
            System.out.println(" ".repeat(n-i-1)+"*".repeat(n-i));
        }
    }
    public static void Q17(int n) {
        int i;
        for (i = 0; i < n/2; i++) {
            System.out.println("*".repeat(n/2 - i)+ " ".repeat(1+ 2*i)+"*".repeat(n/2 - i));
        }
        System.out.println(" ".repeat(n));
        for (i = 1; i <= n/2; i++) {
            System.out.println("*".repeat(i)+" ".repeat(n - 2*i)+"*".repeat(i));
        }
    }
    public static void Q18(int n) {
        int i;
        for (i = 0; i < n/2; i++) {
            System.out.println(" ".repeat(n/2 - i)+ "*".repeat(1+ 2*i));
        }
        System.out.println("*".repeat(n));
        for (i = 1; i <= n/2; i++) {
            System.out.println(" ".repeat(i)+"*".repeat(n - 2*i));
        }
    }
    public static void Q19(int n) {
        int i;
        System.out.println("*".repeat(n));
        for (i = 1; i <= n/2; i++) {
            System.out.println("*".repeat(n/2-i+1)+" ".repeat(2*i - 1)+"*".repeat(n/2-i+1));
        }
        for (i = 2; i <= n/2; i++) {
            System.out.println("*".repeat(i)+" ".repeat(n - 2*i)+"*".repeat(i));
        }
        System.out.println("*".repeat(n));
    }
    public static void Q20(int n) {
        int i;
        System.out.println("-".repeat(n/2)+"*");
        for (i = 1; i <= n/2; i++) {
            System.out.println("-".repeat(n/2 - i)+"*"+"-".repeat(i*2 - 1)+"*");
        }
        for (i = 2; i <= n/2; i++){
            System.out.println("-".repeat(i-1)+"*"+"-".repeat(n - 2*i)+"*");
        }
        System.out.println("-".repeat(n/2)+"*");
    }

    public static void Q21(int n) {
        int i;
        for (i = 1; i < n; i++) {
            System.out.println("*".repeat(i)+"-".repeat(2*(n-i)-1)+"*".repeat(i));
        }
            System.out.println("*".repeat(n*2-1));
    }
    public static void Q22(int n) {
        int i;
        System.out.println("*".repeat(n*2 -1));
        for (i = n; i>1; i--) {
            System.out.println("*".repeat(i-1) + "-".repeat(2*(n-i)+1)+"*".repeat(i-1));
        }
    }
    public static void  Q23(int n) {
        int i;
        for (i = 0; i<n; i++) {
            System.out.println(" ".repeat(n-i-1)+"1".repeat(i*2+1));
        }
    }
    public static void  Q24(int n) {
        int i;
        for (i = 1; i<=n; i++) {
            System.out.println(" ".repeat(n-i)+ Integer.toString(i).repeat(i*2-1));
        }
    }
    public static void Q25(int n){
        int i,j,k =1;
        for (i = 1; i <=n;i++) {
            for (j = 1; j<=(n-i);j++){
                System.out.print("   ");
            }
            for (j = 1; j<=2*i -1; j++){
                if (k<10) {
                    System.out.print(Integer.toString(k)+"  ");
                } else {
                    System.out.print(Integer.toString(k)+" ");
                }
                k++;
            }
            System.out.println();
        }
    }
    public static void Q26(int n) {
        int i,j;
        for (i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
            for (j = 1; j < i*2 ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Q27(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (j = i-1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Q28(int n){
        int i, j;
        for (i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
            for (j = i; j < 2*i; j++) {
                System.out.print(j);
            }
            for (j = 2*i-2; j>=i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Q29(int n) {
        int i;
        System.out.println(" ".repeat(n-1)+1);
        for (i=0; i<n-1;i++) {
            System.out.println(" ".repeat(n-2-i)+Integer.toString(i+2)+"0".repeat(i*2+1)+(i+2));
        }
    }
    public static void Q30(int n) {
        int i,j;
        for (i=1; i<=n;i++){
            for (j = n; j > 0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
//        System.out.println("-----------------------------");
    }
    public static void Q31(int n) {
        int i,j;
        for (i=1; i<=n;i++){
            for (j = n; j > 0; j--) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    public static void Q32(int n) {
        int i,j;
        for (i = 1; i<=n;i++){
            for (j =1; j<=i;j++){
                if (j ==i){
                    System.out.print(i);
                } else {
                    System.out.print(i+"*");
                }
            }
            System.out.println();
        }
        for (i = n-1; i>0;i--){
            for (j = i; j>0;j--){
                if (j == 1){
                    System.out.print(i);
                } else {
                    System.out.print(i+"*");
                }
            }
            System.out.println();
        }
    }
    public static void Q33(int n){
        int i,j;
        System.out.println(" ".repeat(n-1)+0);
        for (i = n-1; i>0;i--) {
            for (j = 1; j<i;j++){
                System.out.print(" ");
            }
            for (j = i; j<=n-1;j++){
                System.out.print(j);
            }
            System.out.print(0);
            for (j = n-1; j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

