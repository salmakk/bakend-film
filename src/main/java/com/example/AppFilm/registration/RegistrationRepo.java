package com.example.AppFilm.registration;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Users,Integer> {
    public Users findByEmailId(String emailId);
    public Users findByEmailIdAndPassword(String emailId,String password);
    public Users findById(int id);

}
