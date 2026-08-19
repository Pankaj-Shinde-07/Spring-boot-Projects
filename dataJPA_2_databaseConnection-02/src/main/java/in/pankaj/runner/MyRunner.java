package in.pankaj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.pankaj.service.DemoService;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    DemoService service;

    @Override
    public void run(String... args) throws Exception {

        service.saveData();

    }

}