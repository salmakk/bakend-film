package com.example.AppFilm.Commentaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private ControllerRepo Repo;

    public CommentService(ControllerRepo repo) {
        this.Repo = repo;
    }



    Commentaire AddComment(Commentaire comment){
       return  Repo.save(comment);
    }
    public List<Commentaire> getAllComments() {
        return Repo.getAllComments();
    }


}
