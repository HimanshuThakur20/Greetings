package com.bridgelabz.greetings.service;

import com.bridgelabz.greetings.modal.Greetings;

import java.util.List;

public interface GreetingService {
    public List<Greetings> getGreets();
    public Greetings giveGreeting(Greetings greetings);
    public Greetings getGreetsById(long id);
    public  Greetings updateGreet(Greetings greetings);
    public  void removeGreetings(long id);

}
