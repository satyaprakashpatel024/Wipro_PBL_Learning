public class Question1{
    public static int generateSeries(int a,int b, int c,int n){
        int []arr = new int[2];
        arr[0] = b-a;
        arr[1] = c-b;
        int strt = a;
        for(int i=0; i<n-1; i++){
            System.out.print(strt+",");
            strt += arr[i%2];
        }
        return strt;
    }
    public static void main(String[] args) {
        int ans = generateSeries(1,3,6,17);
        System.out.println(ans);
    }
}