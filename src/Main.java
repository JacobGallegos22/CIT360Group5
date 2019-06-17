import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

/**
 *
 */

public class Main {

    public static void main(String[] args) throws Exception {
        AtomicVariablesExample av = new AtomicVariablesExample();
        av.playPingPong();




        //Create a new person
//        Person person = new Person();
//        person.setFirstName("John");
//        person.setLastName("Doe");
//        //Create a new instance of the ApplicationController
//        ApplicationController ac = new ApplicationController();
//
//        //Call the controller
//        ac.handleRequest("list", person);






//        PersonController pc = new PersonController();
//        pc.menu();
        //Create the session and intialize the Person Class
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
//        HibernatePerson hp = new HibernatePerson(factory);

        //Call the function to add someone to the database
//        Integer id = hp.addPerson("John", "Doe");
//
//        System.out.println("You successfully added " + id);


    }
}