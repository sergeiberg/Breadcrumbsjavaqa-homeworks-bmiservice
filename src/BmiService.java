public class BmiService {
        public int calculate(double heightsm, int weightkg) {
            double result = weightkg / (heightsm * heightsm);
            return (int)result;
        }
}
