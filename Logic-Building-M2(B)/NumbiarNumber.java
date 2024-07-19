public class NumbiarNumber {
    public int nngenerator(String input1){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input1.length(); i++){
            int firstDigit = Integer.parseInt(String.valueOf(input1.charAt(i)));
            int firstDigitEvenOrOdd = firstDigit%2 == 0 ? 0 : 1;
            int sum = firstDigit;
            int j= i+1;
            if(j==input1.length()){
                sb.append(firstDigit);
                break;
            }
            while(true){
                sum+=Integer.parseInt(String.valueOf(input1.charAt(j++)));
                if(sum%2 != firstDigitEvenOrOdd || j>=input1.length()){
                    sb.append(sum);
                    i=j-1;
                    break;
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        NumbiarNumber n = new NumbiarNumber();
        int ans = n.nngenerator("9898989899");
        System.out.println(ans);
    }
}
