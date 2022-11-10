

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
        System.out.println("Задание 2");
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
        System.out.println("Задание 3");
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2,3));
        System.out.println(animals(5, 2, 8));
        System.out.println("Задание 4");
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1,2));
        System.out.println(profitableGamble(0.9, 3, 2));
        System.out.println("Задание 5");
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26,2));
        System.out.println(operation(15, 11, 11));
        System.out.println("Задание 6");
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));
        System.out.println("Задание 7");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
        System.out.println("Задание 8");
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
        System.out.println("Задание 9");
        System.out.println(sumOfCubes(new int[] {1,5, 9}));
        System.out.println(sumOfCubes(new int[] {3, 4, 5}));
        System.out.println(sumOfCubes(new int[] {2}));
        System.out.println(sumOfCubes(new int[] {}));
        System.out.println("Задание 10");
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2,1));
        System.out.println(abcmath(1, 2, 3));
    }

    public static int remainder(int a, int b){
        return a%b;
    }
    public static double triArea(int a, int b) {
        return 0.5*a*b;
    }
    public static int animals(int a, int b, int c) {
        return a*2+b*4+c*4;
    }
    public static boolean profitableGamble(double a, int b, int c) {
        if (a*b>c){
            return true;
        } return false;
    }
    public static String operation(int N, int a, int b) {
        if (a+b==N){
            return "сложить";
        }
        if (a-b==N){
            return "вычесть";
        }
        if (a*b==N){
            return "умножить";
        }
        if (a/b==N){
            return "разделить";
        } return "ничего, просто поплачь";
    }
    public static int ctoa(char a) {
        return a;
    }
    public static int addUpTo(int a) {
        int s=0;
        while (a!=0) {
            s = s + a;
            a = a - 1;
        } return s;
    }
    public static int nextEdge(int a, int b) {
        return a+b-1;
    }
    public static double sumOfCubes(int [] a) {
        double s=0;
        for (int i=0; i<a.length; i++){
            s=s+Math.pow(a[i],3);
        } return s;
    }
    public static boolean abcmath(int a, int b, int c) {
        while (b!=0){
            a=a+a;
            b=b-1;
        }
        if (a%c==0){
            return true;
        } return false;
    }
}