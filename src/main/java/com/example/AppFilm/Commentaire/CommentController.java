package com.example.AppFilm.Commentaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    private CommentService service;

    @Autowired
    public CommentController(CommentService service) {
        this.service = service;
    }

    @PostMapping("/addComment")
    @CrossOrigin(origins = "http://localhost:4200")
    public Commentaire AddComment(@RequestBody Commentaire comment) {
        return service.AddComment(comment);
    }
    @GetMapping("/comments")
    @CrossOrigin(origins ="http://localhost:4200")
    public List<Commentaire> getAllComments() {
        List<Commentaire> comments = service.getAllComments();
        return comments;
    }
}
