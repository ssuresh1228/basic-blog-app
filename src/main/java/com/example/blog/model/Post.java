package com.example.blog.model;

import com.sun.istack.NotNull;


import javax.persistence.*;
import java.time.Instant;

@Entity
@Table
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column
    private String title;

    @Lob
    @Column
    @NotNull
    private String content;

    @Column
    private Instant createdOn;

    @Column
    private Instant updatedOn;

    @Column
    @NotNull
    private String username;

    //modifiers past this point
    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getContent() {return content;}

    public void setContent(String content) {this.content = content;}

    public Instant getCreatedOn() {return createdOn;}

    public void setCreatedOn(Instant createdOn) {this.createdOn = createdOn;}

    public Instant getUpdatedOn() {return updatedOn;}

    public void setUpdatedOn(Instant updatedOn) {this.updatedOn = updatedOn;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}
}
