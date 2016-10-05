package models;

public enum Number {
    A(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    J(10),
    Q(11),
    K(12);
    
    private final int number;

    Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    
    public boolean menor(Number number){
        return this.number<number.getNumber();
    }
    
    public boolean consecutivosMenores(Number number){
        return this.ordinal()-number.ordinal()==1;
    }
    
    public boolean consecutivosMayores(Number number){
        return this.ordinal()-number.ordinal()==-1;
    }
}
