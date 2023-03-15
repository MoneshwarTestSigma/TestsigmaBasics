public class Flight {
    int minimunPrice=500;
    int pricePerKm =100;
    class AirIndia{
        AirIndia(float km)
        {
            System.out.println("For AirIndia :"+(km* pricePerKm +minimunPrice));
        }
    }
    class IndiGo{
        IndiGo(float km)
        {
            System.out.println("For IndiGo :"+ (km*(pricePerKm +(pricePerKm *0.08))+minimunPrice));
        }

    }
    class GoFirst{
        GoFirst(float km)
        {
            System.out.println("For GoFirst :"+(km*(pricePerKm +(pricePerKm *0.16))+minimunPrice) );
        }
    }
}
