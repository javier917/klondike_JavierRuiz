package models;

public enum Suite {
    BASTOS(Color.BASTOS),
    OROS(Color.OROS),
    ESPADAS(Color.ESPADAS),
    COPAS(Color.COPAS);

    private final Color color;

    Suite(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
