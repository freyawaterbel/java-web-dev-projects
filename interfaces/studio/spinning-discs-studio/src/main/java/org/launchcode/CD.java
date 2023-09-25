package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public String title;
    public String artist;
    public int lengthMinutes;
    public int numTracks;
    public int yearReleased;

    public CD(int rpm, String dataType, String dataCapacity, int meltTempC, int diameterCM, String title, String artist, int lengthMinutes, int numTracks, int yearReleased) {
        super(rpm, dataType, dataCapacity, meltTempC, diameterCM);
        this.title = title;
        this.artist = artist;
        this.lengthMinutes = lengthMinutes;
        this.numTracks = numTracks;
        this.yearReleased = yearReleased;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
