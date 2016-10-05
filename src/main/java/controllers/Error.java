package controllers;

public enum Error {
    
    SAME_COLOR("No se puede poner cartas contiguas del mismo color"),
    DISTINCT_COLOR("No se pude poner en un palo cartas de otro color"),
    STRAIGHT("Debes seguir el orden númerico de las cartas"),
    EMPTY("El origen se encuentra vacio"),
    FIRSTSUITEDECK("La primera carta de un mazo de color debe ser un as"),
    FIRSTSTRAIGHT("Debe ponerse un rey"),
    EMPTYDECK("La baraja debe estar vacía");
    
    
    private String message;
    
    private Error(String message){
        this.message = message;
    }
    
    @Override
    public String toString(){
        return message;
    }
}
