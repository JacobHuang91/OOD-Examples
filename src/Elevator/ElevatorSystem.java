package Elevator;

import java.util.ArrayList;
import java.util.List;

/**
 * An elevator
 * checks if overweight;
 * close the door;
 * then check stops corresponds to current status;
 * if no stops left,
 * check the reserve direction stops;
 * change status to reserve direction or idle.
 */

public class ElevatorSystem {
    private HandleRequestStrategy strategy;
    private List<Elevator> elevators = new ArrayList<Elevator>();

    public void setStrategy(HandleRequestStrategy strategy) {
        this.strategy = strategy;
    }

    public void handleRequest(ExternalRequest request) {
        this.strategy.handleRequest(request, elevators);
    }


}
