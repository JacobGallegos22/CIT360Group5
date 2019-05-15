import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

/**
 * This program demonstrates the MVC model
 * @Author Jacob Gallegos
 */

public class Main {

    public static void main(String[] args) throws Exception {
        PersonController pc = new PersonController();
        pc.menu();


    }
}