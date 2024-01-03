package com.example.AppFilm.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import com.example.AppFilm.Commentaire.Commentaire;
@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepo repo;
    public Users saveUser(Users user){
          return  repo.save(user);
    }
    public Users fetcUserByEmailId(String email){
        return repo.findByEmailId(email);
    }
    public Users fetchUserByEmailAndPassword(String emailid,String password ){
        return repo.findByEmailIdAndPassword(emailid,password);
    }
    public Users getUserById(int id){
        return repo.findById(id);
    }
    public List<Commentaire> getUserComments(int Id) {
        Users user = repo.findById(Id);
        if (user != null) {
            return user.getComments(); // Assuming you have a getComments() method in Users entity
        }
        return Collections.emptyList();
    }



}
