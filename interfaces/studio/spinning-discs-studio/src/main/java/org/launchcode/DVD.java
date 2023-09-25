package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public String title;
    public String director;
    public int yearReleased;
    public int lengthMin;

    public DVD(int rpm, String dataType, String dataCapacity, int meltTempC, int diameterCM, String title, String director, int yearReleased, int lengthMin) {
        super(int rpm, String dataType, String dataCapacity, int meltTempC, int diameterCM);
        this.title = title;
        this.director = director;
        this.yearReleased = yearReleased;
        this.lengthMin = lengthMin;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
