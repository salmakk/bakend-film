package com.example.AppFilm.registration;

import com.example.AppFilm.Commentaire.Commentaire;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;
@Entity
    public class Users {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private int id;
        private String emailId;
        private String userName;
        private String password;
        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
        @JsonIgnore

        private List<Commentaire> comments;
        public Users(int id, String emailId, String userName, String password) {
            this.id = id;
            this.emailId = emailId;
            this.userName = userName;
            this.password = password;
        }

        public Users() {
        }

    public List<Commentaire> getComments() {
        return comments;
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmail(String emailId) {
            this.emailId = emailId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", emailId='" + emailId + '\'' +
                    ", userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

