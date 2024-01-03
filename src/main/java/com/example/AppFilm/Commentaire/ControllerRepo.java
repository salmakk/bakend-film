package com.example.AppFilm.Commentaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface ControllerRepo extends JpaRepository<Commentaire,Integer> {

    @Query("SELECT c FROM Commentaire c")
    public List<Commentaire> getAllComments();
}
