public class HelloWorld {
    enum Color
    {
        RED, GREEN, BLUE;
    }
    public static int a = 5;
    public static int b = 6;
    public static final int z = 101;
    public static void main(String args[]){
        int[] arrayOfNumbers = {5,4,3,2,1};
        int res = sort(arrayOfNumbers, 5);
        int check = 1;
        Color c1 = Color.RED;
    }
    public static int sort(int[] x, int n){
        int i, j, save, im1;
        if (n< 2) 
            return 1;
        for (i=2; i<=n; i++){
            im1=i-1;
            for (j=1; j<=im1; j++){
                if (x[i] < x[j]){
                    save = x[i];
                    x[i] = x[j];
                    x[j] = save;
                }
            }
        }
        int z = HelloWorld.a + HelloWorld.b;
        return 0;
    }
}