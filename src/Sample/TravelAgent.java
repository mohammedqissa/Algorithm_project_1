package Sample;

/**
 * Created by mohammedissa on 4/2/16.
 */
public class TravelAgent implements Cloneable{

    String name ;
    String[] flights;
    int[] prices;
    int nbFlights;
    int m = 0;





    public TravelAgent(String name, String[] flights, int[] prices, int nbFlights) {
        this.name = name;
        this.flights = flights;
        this.prices = prices;
        this.nbFlights = nbFlights;
    }

    public void setPrices(int[] prices) {
        this.prices = prices;
    }
    public void setFlights(String[] flights) {
        this.flights = flights;
    }


    public String getName() {
        return name;
    }

    public void setM(int m) {
        this.m = m;
    }

    public String[] getFlights() {
        return flights;
    }
    public int[] getPrices() {
        return prices;
    }

    public int getNbFlights() {
        return nbFlights;
    }

    public  void setFlight(int x , String f , int c){

        flights[x] = f;
        prices[x] = c;

    }

    public String getFlight(int index){
        return flights[index];
    }
    public int getPrice(int index){
        return prices[index];
    }

    public TravelAgent clone(){
        return new TravelAgent(name,flights,prices,nbFlights);
    }

    public String toString() {
        String ret = "";
        ret += name;
        ret += "/";
        for (int i = 0; i < flights.length; i++)
            ret+="," + (flights[i])+(':')+(prices[i])+('$');
        return ret;
    }
}