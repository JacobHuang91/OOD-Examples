package Elevator;

import java.util.List;

public class Elevator {
    private List<ElevatorButton> buttons;
    private List<Integer> upStops;
    private List<Integer> downStops;
    private int currentLevel;
    private Status status;
    private boolean gateOpen;
    private float weightLimit;

    public void handleExternalRequest(ExternalRequest r) {
    }

    public void handleInternalRequest(InternalRequest r) {
    }

    public void openGate() {
    }

    public void closeGate() {
    }


    private float getCurrentWeight() {
        return 0;
    }

    private boolean isRequestValid(InternalRequest r) {
        return true;
    }
}
