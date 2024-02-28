package com.bridgelabz.greetings.service;

import com.bridgelabz.greetings.modal.Greetings;
//import com.bridgelabz.greetings.repository.GreetingsDao;
import com.bridgelabz.greetings.repository.GreetingsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class GreetingServiceImp implements GreetingService {

    @Autowired
    private GreetingsDao greetingsDao;
    List<Greetings> greets;
    public GreetingServiceImp() {
//        greets = new ArrayList<>();
//        greets.add(new Greetings(1,"Hello"));
//        greets.add(new Greetings(2,"Namaste"));
    }

    @Override
    public List<Greetings> getGreets() {
        return greetingsDao.findAll();
    }


    @Override
    public Greetings giveGreeting(Greetings greetings) {
//        greets.add(greetings);
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
        return greetingsDao.getReferenceById(id);
    }

    @Override
    public Greetings updateGreet(Greetings updatedGreeting) {
        greetingsDao.save(updatedGreeting);
        return null;
    }

    @Override
    public void removeGreetings(long id) {
//        if (!greets.isEmpty()){
//            Iterator<Greetings> iterator = greets.iterator();
//            while(iterator.hasNext()){
//                Greetings greet = iterator.next();
//                if(greet.getId() == id){
//                    iterator.remove();
//                    System.out.printf("greeting removed");
//                }
//            }
//        }
        Greetings entity = greetingsDao.getReferenceById(id);
        greetingsDao.delete(entity);
        System.out.printf("greeting removed");
    }
}
