package Elevator;

public class Main {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = new ElevatorSystem();

        elevatorSystem.setStrategy(new RandomHandleRequestStrategy());

        ExternalRequest request = new ExternalRequest(Direction.Up, 3);

        elevatorSystem.handleRequest(request);
    }
}
