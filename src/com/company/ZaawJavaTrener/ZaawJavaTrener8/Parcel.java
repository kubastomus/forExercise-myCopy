package com.company.ZaawJavaTrener.ZaawJavaTrener8;

public class Parcel implements Validator{

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength > 300){
            return false;
        } else if (xLength < 30 || yLength < 30 || zLength < 30){
            return false;
        } else if (weight > 30 && isExpress == false){
            return false;
        } else if (weight > 15 && isExpress == true){
            return false;
        }
        return true;
    }
}
