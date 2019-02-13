package Elevator;

public class ExternalRequest extends Request {
    private Direction d;

    public ExternalRequest(Direction d, int level) {
        super();
        this.level = level;
        this.d = d;
    }
}
