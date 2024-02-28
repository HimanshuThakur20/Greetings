package com.bridgelabz.greetings.controller;

import com.bridgelabz.greetings.modal.Greetings;
import com.bridgelabz.greetings.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {

        @Autowired
        private GreetingService greetingService;

        @GetMapping("/greets")
        public List<Greetings> getGreeting(){
            return this.greetingService.getGreets();
        }

        @PostMapping("/greets")
        public Greetings addGreeting(@RequestBody Greetings greetings){
                return this.greetingService.giveGreeting(greetings);

        }

        @GetMapping("/greets/{greetId}")
        public Greetings getGreetingsById(@PathVariable String greetId){
                return  this.greetingService.getGreetsById(Long.parseLong(greetId));
        }

        @PutMapping("/greets")
        public Greetings updateGreeting(@RequestBody Greetings greet){
                return this.greetingService.updateGreet(greet);
        }

        @DeleteMapping("/greets/{greetId}")
        public ResponseEntity<HttpStatus> removeGreeting(@PathVariable String greetId){
                try{
                        this.greetingService.removeGreetings(Long.parseLong(greetId));
                        return new ResponseEntity<>(HttpStatus.OK);
                }catch (Exception e){
                        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
        }


}
