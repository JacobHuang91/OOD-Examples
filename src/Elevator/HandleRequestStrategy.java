package Elevator;

import java.util.List;

interface HandleRequestStrategy {
    public void handleRequest(ExternalRequest request, List<Elevator> elevators);
}
