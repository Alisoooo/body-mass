public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int result = service.calculate(50, 1.90);

        System.out.println(result);
    }
}