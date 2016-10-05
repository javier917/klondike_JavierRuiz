package utils;

public class ClosedIntervalView {

    private String title;

    private ClosedInterval closedInterval;

    private InputOutput io;

    public ClosedIntervalView(String title, ClosedInterval closedInterval) {
        assert title != null;
        assert closedInterval != null;
        this.title = title;
        this.closedInterval = closedInterval;
        io = new InputOutput();
    }

    public void writeln() {
        io.println(title + " " + this.toString());
    }

    @Override
    public String toString() {
        return "[" + closedInterval.getMin() + ", " + closedInterval.getMax() + "]";
    }
}
