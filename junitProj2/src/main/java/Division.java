public class Division {

    public double result(int num1, int num2){
        double res =0;
        if(num2!=0){

            res = num1/num2;
        }
        else {
            throw new IllegalArgumentException("number should not be zero");
        }
        return res;
    }
}
