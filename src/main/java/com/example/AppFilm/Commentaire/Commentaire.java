package com.example.AppFilm.Commentaire;

import com.example.AppFilm.registration.Users;
import jakarta.persistence.*;

@Entity
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String content;
    @ManyToOne

    @JoinColumn(name = "user_id")

    private Users user;

    public Commentaire(String content, Users user) {
        this.content = content;
        this.user = user;
    }

    public Commentaire() {
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Users getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
