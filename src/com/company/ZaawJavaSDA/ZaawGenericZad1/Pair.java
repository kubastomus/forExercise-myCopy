package com.company.ZaawJavaSDA.ZaawGenericZad1;

public class Pair<K, V> {

    private K valueK;
    private V valueV;

    public Pair(K valueK, V valueV) {
        this.valueK = valueK;
        this.valueV = valueV;
    }

    public K getValueK() {
        return valueK;
    }

    public void setValueK(K valueK) {
        this.valueK = valueK;
    }

    public V getValueV() {
        return valueV;
    }

    public void setValueV(V valueV) {
        this.valueV = valueV;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "valueK=" + valueK +
                ", valueV=" + valueV +
                '}';
    }
}
