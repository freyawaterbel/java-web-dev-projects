package org.launchcode;
public abstract class BaseDisc implements OpticalDisc {
    public int rpm;
    public String dataType;
    public String dataCapacity;
    public int meltTempC;
    public int diameterCM;

    public int getRpm() {
        return rpm;
    }
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    public String getDataType() {
        return dataType;
    }
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    public String getDataCapacity() {
        return dataCapacity;
    }
    public void setDataCapacity(String dataCapacity) {
        this.dataCapacity = dataCapacity;
    }
    public int getMeltTempC() {
        return meltTempC;
    }
    public void setMeltTempC(int meltTempC) {
        this.meltTempC = meltTempC;
    }
    public int getDiameterCM() {
        return diameterCM;
    }
    public void setDiameterCM(int diameterCM) {
        this.diameterCM = diameterCM;
    }

    public BaseDisc(int rpm, String dataType, String dataCapacity, int meltTempC, int diameterCM) {
        this.rpm = rpm;
        this.dataType = dataType;
        this.dataCapacity = dataCapacity;
        this.meltTempC = meltTempC;
        this.diameterCM = diameterCM;
    }
    @Override
    public void spinDisc() {

    }
//    public void readData() {
//
//    }
//    public void meltDisc() {
//
//    }
//    void measureCircumference();
//    void loadDisc();
//    void unloadDisc();
}