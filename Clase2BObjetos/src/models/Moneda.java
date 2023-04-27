package models;

import java.util.ArrayList;

public class Moneda {
    public static ArrayList<Moneda> monedas = new ArrayList<>();

    private int id;
    private String nombreMoneda;
    private String simbolo;
    private double valorPesos;

    public Moneda() {
    }

    public Moneda(int id, String nombreMoneda, String simbolo, double valorPesos) {
        this.id = id;
        this.nombreMoneda = nombreMoneda;
        this.simbolo = simbolo;
        this.valorPesos = valorPesos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public double getValorPesos() {
        return valorPesos;
    }

    public void setValorPesos(double valorPesos) {
        this.valorPesos = valorPesos;
    }

    @Override
    public String toString() {
        return "Monedas{" + "id=" + id + ", nombreMoneda=" + nombreMoneda + ", simbolo=" + simbolo + ", valorPesos=" + valorPesos + '}';
    }
//    public static ArrayList<Moneda> monedas = new ArrayList<>();
    public static void llenarMonedas(){
        monedas.add(new Moneda(1, "Peso", "$", 1));
        monedas.add(new Moneda(2, "Dollar", "$", 19));
        monedas.add(new Moneda(3, "Euro", "E", 25));
        System.out.println(monedas.toString());
        
    }
    public static void actualizarMoneda(int recNo, int id, String nombreMoneda, String simbolo, double valorPesos){
        monedas.get(recNo).setId(id);
        monedas.get(recNo).setNombreMoneda(nombreMoneda);
        monedas.get(recNo).setSimbolo(simbolo);
        monedas.get(recNo).setValorPesos(valorPesos);
    }
    
    public static void borrarMoneda(int recNo){
        monedas.remove(recNo);
    }
      
}
