package test;

public class Test2 {

	public static void main(String[] args) {
        for(int i = 0; i <= 6; i++) {
            if(i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("We've finished the loop!");
    }
}
