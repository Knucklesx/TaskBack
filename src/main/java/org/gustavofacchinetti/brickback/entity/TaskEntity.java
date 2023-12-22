package org.gustavofacchinetti.brickback.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import java.sql.Blob;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class TaskEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
//    @Lob
//    private byte[] image;

    public TaskEntity() {}

//    public TaskEntity(Long id, String title, String description, byte[] image) {
public TaskEntity(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
//        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

//    public byte[] getImage() {
//        return image;
//    }
//
//    public void setImage(byte[] image) {
//        this.image = image;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof TaskEntity that)) return false;
//        return Objects.equals(getId(), that.getId()) && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getDescription(), that.getDescription()) && Arrays.equals(getImage(), that.getImage());
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(getId(), getTitle(), getDescription());
//        result = 31 * result + Arrays.hashCode(getImage());
//        return result;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskEntity that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getDescription());
    }
}
