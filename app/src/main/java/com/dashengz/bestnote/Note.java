package com.dashengz.bestnote;

/**
 * Note Object
 */

public class Note {
    private String imageUrl;
    private String note;
    private String title;
    private String uid;
    private long timeCreated;
    private long timeLastUpdated;

    public Note() {
    }

    public Note(String imageUrl, String note, String title, String uid) {
        this.imageUrl = imageUrl;
        this.note = note;
        this.title = title;
        this.uid = uid;
    }

    public Note(String imageUrl, String note, String title, String uid, long timeCreated, long timeLastUpdated) {
        this.imageUrl = imageUrl;
        this.note = note;
        this.title = title;
        this.uid = uid;
        this.timeCreated = timeCreated;
        this.timeLastUpdated = timeLastUpdated;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public long getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(long timeCreated) {
        this.timeCreated = timeCreated;
    }

    public long getTimeLastUpdated() {
        return timeLastUpdated;
    }

    public void setTimeLastUpdated(long timeLastUpdated) {
        this.timeLastUpdated = timeLastUpdated;
    }

    @Override
    public String toString() {
        return "Note{" +
                "imageUrl='" + imageUrl + '\'' +
                ", note='" + note + '\'' +
                ", title='" + title + '\'' +
                ", uid='" + uid + '\'' +
                ", timeCreated=" + timeCreated +
                ", timeLastUpdated=" + timeLastUpdated +
                '}';
    }
}
