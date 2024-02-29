package com.bridgelabz.greetings.service;

import com.bridgelabz.greetings.modal.Greetings;
import com.bridgelabz.greetings.repository.GreetingsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImp implements GreetingService {

    @Autowired
    private GreetingsDao greetingsDao;
    List<Greetings> greets;
    public GreetingServiceImp() {
    }

    @Override
    public List<Greetings> getGreets() {
        return greetingsDao.findAll();
    }


    @Override
    public Greetings giveGreeting(Greetings greetings) {
        greetingsDao.save(greetings);
        return greetings;
    }

    @Override
    public Greetings getGreetsById(long id) {
//        for(Greetings greet: greets){
//            if(greet.getId()==id){
//                return greet;
//            }
//        }
        return greetingsDao.findById(id).orElse(null);
    }

    @Override
    public Greetings updateGreet(Greetings updatedGreeting) {
        greetingsDao.save(updatedGreeting);
        return null;
    }

    @Override
    public void removeGreetings(long id) {
        Greetings entity = greetingsDao.getReferenceById(id);
        greetingsDao.delete(entity);
        System.out.printf("greeting removed");
    }
}
