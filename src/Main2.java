public class Main2 {
    public Main2() {
    }

    public static void main(String[] args) {
        try {
            System.out.print(" 0");
            throw new RuntimeException();
        } catch (Exception var2) {
            System.out.print(" 2");
            System.out.println(" 3");
        }
    }
}