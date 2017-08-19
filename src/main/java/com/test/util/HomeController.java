package com.test.util;


import model.DAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld() {
        //define data for the connection
        String dbAddress = "jdbc:mysql://localhost:3306/CoffeeShopDB";
        String username = "guest";
        String password = "Techlover17";

        //load the driver
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //create the db connection object
            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(dbAddress, username,password);

            //create the db statement

            String readItemsCommand = "select name, description, quantity, price from items";

            Statement readItems = mysqlConnection.createStatement(); //creates the statement

            ResultSet results = readItems.executeQuery(readItemsCommand); //executes the statement

            //ArrayList of items
            ArrayList<Items> itemList = new ArrayList<Items>();

            //map from ResultSet to the ArrayList
            while(results.next()){

                Items temp = new Items (results.getString(1),
                        results.getString(2), results.getInt(3), results.getFloat(4));

                //add object to the Arraylist
                itemList.add(temp);
            }
            return new ModelAndView("welcome","itList", itemList);
        }
        catch (Exception ex){

        }
        return null;
    }


    @RequestMapping("/userform")
    public ModelAndView userform(){

        return new ModelAndView("form","inst","Please fill out the form: ");
    }

    @RequestMapping("/formhandler")
    public ModelAndView formhandler(@RequestParam("name") String name,
                                    @RequestParam("bday") int bday,
                                    @RequestParam("email") String email,
                                    @RequestParam("username") String username,
                                    @RequestParam("password") String password)

    {
        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("name", name);
        mv.addObject("bday",bday);
        mv.addObject("email",email);
        mv.addObject("username", username);
        mv.addObject("password", password);

        return mv;
    }

    @RequestMapping(value = "/addUser")
    public ModelAndView addUser (
            @RequestParam("FirstName") String FirstName,
            @RequestParam("Birthday") int Birthday,
            @RequestParam("Email") String Email,
            @RequestParam("UserName") String UserName,
            @RequestParam("Password") String Password)
    {

        //add the info to DB through DAO
       boolean result = DAO.addUsers(FirstName,Birthday,Email,UserName,Password);

       if (result == false) {
        //still have to write this view
        return new ModelAndView("error", "errmsg", "user add failed");
    }


        ModelAndView mv = new ModelAndView("addresult");
        mv.addObject("FirstName", FirstName);
        mv.addObject("Birthday", Birthday);
        mv.addObject("Email", Email);
        mv.addObject("UserName", UserName);
        mv.addObject("Password", Password);

        return mv;
    }
}
