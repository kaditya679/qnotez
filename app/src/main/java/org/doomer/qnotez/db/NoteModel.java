package org.doomer.qnotez.db;

import java.util.Date;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;

@Entity(tableName = "notes")
public class NoteModel {
    @PrimaryKey(autoGenerate = true)
    public int id;

    private String title;
    private String text;

//    @TypeConverter(DateConverter.class)
    private Date created;
//    @TypeConverter(DateConverter.class)
    private Date updated;

    public NoteModel(String title, String text, Date created) {
        this.title = title;
        this.text = text;
        this.created = created;
        this.updated = this.created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }
}
