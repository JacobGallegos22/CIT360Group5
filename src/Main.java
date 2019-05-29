import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

/**
 * This program demonstrates Hibernate
 * This program relies on teh tutorial found at
 * https://www.tutorialspoint.com/hibernate/hibernate_examples.htm
 * @Author Jacob Gallegos
 */

public class Main {

    public static void main(String[] args) throws Exception {
//        PersonController pc = new PersonController();
//        pc.menu();

        //Create the session and intialize the Person Class
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        HibernatePerson hp = new HibernatePerson(factory);

        //Call the function to add someone to the database
        Integer id = hp.addPerson("John", "Doe");

        System.out.println("You successfully added " + id);


    }
}