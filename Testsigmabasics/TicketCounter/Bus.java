public class Bus {
    int minimunPrice=100;
    int pricePerKm=20;
    class AbcBus{
        public AbcBus(float km) {
            System.out.println("Price for Abc Buses: " + (km * pricePerKm + minimunPrice));
        }
    }
    class EfgBus{
        public EfgBus(float km) {
            System.out.println("Price for Abc Buses: " + (km * (pricePerKm + (0.02*pricePerKm)) + minimunPrice));
        }
    }
    class HijBus{
        public HijBus(float km) {
            System.out.println("Price for Abc Buses: " + (km * (pricePerKm + (0.04*pricePerKm)) + minimunPrice));
        }
    }
}
