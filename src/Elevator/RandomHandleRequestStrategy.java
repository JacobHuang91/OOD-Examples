package Elevator;

import java.util.List;
import java.util.Random;

public class RandomHandleRequestStrategy implements HandleRequestStrategy {

    @Override
    public void handleRequest(ExternalRequest request, List<Elevator> elevators) {
        Random random = new Random();

        int n = random.nextInt(elevators.size());

        elevators.get(n).handleExternalRequest(request);
    }
}
