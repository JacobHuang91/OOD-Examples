package Elevator;

import java.util.List;

public class AlwaysOneElevatorHandleRequestStrategy implements HandleRequestStrategy {
    @Override
    public void handleRequest(ExternalRequest request, List<Elevator> elevators) {
        elevators.get(0).handleExternalRequest(request);
    }
}
