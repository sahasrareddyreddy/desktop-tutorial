public class Demo021 {
    public static String getFizzBizz(int value) {
        if (value <= 0) {
            return "Error";
        }
        if (value % 3 == 0 && value % 5 == 0) {
            return "FIZZBIZZ";
        }
        if (value % 3 == 0) {
            return "FIZZ";
        }
        if (value % 5 == 0) {
            return "BIZZ";
        }
        return String.valueOf(value);
    }
    public static void main(String[] args) {
        System.out.println(getFizzBizz(33));  
        System.out.println(getFizzBizz(5));   
        System.out.println(getFizzBizz(15));  
        System.out.println(getFizzBizz(7));   
        System.out.println(getFizzBizz(-10)); 
        System.out.println(getFizzBizz(0));   
    }
}