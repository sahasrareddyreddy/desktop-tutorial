 package Core_Java;
class NextMultipleOf100 {
    
    public static int getNextMultipleOf100(int num) {
         if (num <= 0)
             return -1;
         return ((num / 100) + 1) * 100;
    }
}

public class PS002 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        NextMultipleOf100 obj = new NextMultipleOf100();
        int num = 223;
        System.out.println(NextMultipleOf100.getNextMultipleOf100(num));
    }
    
}
