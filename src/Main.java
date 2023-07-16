public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double heightm = 1.87;
        int weightkg = 98;

        int bmi = service.calculate(heightm, weightkg);
        System.out.println(bmi);
    }
}