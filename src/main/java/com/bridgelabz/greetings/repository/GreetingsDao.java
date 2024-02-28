package com.bridgelabz.greetings.repository;
import com.bridgelabz.greetings.modal.Greetings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingsDao extends JpaRepository<Greetings,Long>{
}

