package org.gustavofacchinetti.brickback.model;

import jakarta.persistence.Lob;

import java.util.Arrays;

public class TaskPostRequest {
    private String title;
    private String description;
    private byte[] image;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "TaskPostRequest{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
//                ", image=" + Arrays.toString(image) +
                '}';
    }
}
