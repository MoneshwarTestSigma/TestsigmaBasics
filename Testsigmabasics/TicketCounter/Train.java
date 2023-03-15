public class Train {
    int minimumPrice =50;
    int pricePerKM=10;
    class SeaterTrain{
        public SeaterTrain(float km) {
            System.out.println("For seater Train:" + (km * pricePerKM + minimumPrice));
        }
    }
    class SleeperTrain{
        public SleeperTrain(float km) {
            System.out.println("For Sleeper Train:"+ (km*(pricePerKM + (0.05*pricePerKM)) + minimumPrice));
        }
    }
    class AcTrain{
        public AcTrain(float km) {
            System.out.println("For Ac Train "+(km*(pricePerKM + (0.1*pricePerKM)) + minimumPrice));
        }
    }
}
