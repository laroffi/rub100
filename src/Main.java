public class Main {
    public static void main(String[] args) {
        long account = 200;
        long limit = 1000;
        int add = 2100;
        long bonus;


        if (add > limit) {
             bonus = add / 100;
        }
        else {
            bonus = 0;
        }
        long totalAccount = add + account + bonus;
        System.out.println(totalAccount);
    }
}
