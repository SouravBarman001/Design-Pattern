package mediator.design.pattern.air.traffic;

public class FlightLanding
{
    public AirPlane flight;
    public Runway runway;

    public FlightLanding(AirPlane flight,Runway runway)
    {
        this.flight = flight;
        this.runway = runway;
    }

    public void execute()
    {
        flight.land();
        runway.land();
    }
}