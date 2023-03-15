import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome\n" +
                "1.Bus\n" +
                "2.Train\n" +
                "3.Fligth");
        int vehicalType=s.nextInt();
        switch(vehicalType)
        {
            case 1:
                System.out.println("Choose the Bus type\n" +
                        "1.Abc Buses\n" +
                        "2.Efg Buses\n" +
                        "3.Hij Buses");
                int busType=s.nextInt();
                System.out.println("Enter KM to travel:");
                float kmToTravelBus=s.nextFloat();
                busFunction(busType,kmToTravelBus);
                break;
            case 2:
                System.out.println("Choose the train type\n" +
                        "1.Seater Train\n" +
                        "2.Sleeper Train\n" +
                        "3.Ac Train");
                int trainType=s.nextInt();
                System.out.println("Enter KM to travel:");
                float kmToTravelTrain=s.nextFloat();
                trainFunction(trainType,kmToTravelTrain);
                break;
            case 3:
                System.out.println("Choose the Flight Type\n" +
                        "1.Air India\n" +
                        "2.Indigo\n" +
                        "3.Go First");
                int flightType=s.nextInt();
                System.out.println("Enter KM to travel:");
                float kmToTravelFlight=s.nextFloat();
                flightFunction(flightType,kmToTravelFlight);
                break;
            default:
                System.out.println("Invalid Vehical Selection");

        }

    }

    private static void flightFunction(int flightType, float kmToTravelFlight) {
        Flight flight=new Flight();
        switch (flightType)
        {
            case 1:
                Flight.AirIndia airIndia =flight.new AirIndia(kmToTravelFlight);
                break;
            case 2:
                Flight.IndiGo indiGo=flight.new IndiGo(kmToTravelFlight);
                break;
            case 3:
                Flight.GoFirst goFirst=flight.new GoFirst(kmToTravelFlight);
                break;
            default:
                System.out.println("Invalid Fligt selection");
        }
    }

    private static void trainFunction(int trainType, float kmToTravelTrain) {
        Train train=new Train();
        switch (trainType)
        {
            case 1:
                Train.SeaterTrain seaterTrain =train.new SeaterTrain(kmToTravelTrain);
                break;
            case 2:
                Train.SleeperTrain sleeperTrain=train.new SleeperTrain(kmToTravelTrain);
                break;
            case 3:
                Train.AcTrain acTrain=train.new AcTrain(kmToTravelTrain);
                break;
            default:
                System.out.println("Invalid Train selection");
        }
    }

    private static void busFunction(int busType, float kmToTravel) {
        Bus bus=new Bus();
        switch (busType)
        {
            case 1:
                Bus.AbcBus busAbc =bus.new AbcBus(kmToTravel);
                break;
            case 2:
                Bus.EfgBus efgBus=bus.new EfgBus(kmToTravel);
                break;
            case 3:
                Bus.HijBus hijBus=bus.new HijBus(kmToTravel);
                break;
            default:
                System.out.println("Invalid bus selection");
        }
    }
}