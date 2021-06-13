public class HelloWorld {
    public static void main(String args[]){
        int[] arrayOfNumbers = {5,4,3,2,1};
        int res = 1+2;
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
        return 0;
    }
}