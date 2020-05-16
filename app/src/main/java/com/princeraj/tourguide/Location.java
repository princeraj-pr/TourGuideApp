package com.princeraj.tourguide;

class Location {

    private int name;

    private int location;

    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    Location(int name, int location) {
        this.name = name;
        this.location = location;
    }

    Location(int name, int location, int imageResourceId) {
        this.name = name;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    /**
     * Return the name resource Id of the location.
     */
    int getName() {
        return name;
    }

    /**
     * Return the location resource Id.
     */
    int getLocation() {
        return location;
    }

    /**
     * Return the image resource Id of the location.
     */
    int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * Return whether or not there is an image for this image
     */
    boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
