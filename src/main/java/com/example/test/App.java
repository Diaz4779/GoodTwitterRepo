package com.example.test;

/**
 * Hello world!
 *
*/


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by vagrant on 2/7/15.
 */
public class App {


     String team[] = {"tledford@csumb.edu", "ychino@csumb.edu", "jocortez@csumb.edu", "bensanchez@csumb.edu", "jdiazflores@csumb.edu", "marivera@csumb.edu", "bjaramillo@csumb.edu", "brdamico@csumb.edu", "boody@csumb.edu"};
     ArrayList<String> team1= new ArrayList<String>();
     ArrayList<String> team2 = new ArrayList<String>();
     ArrayList<String> team3 = new ArrayList<String>();


    public static void main(String[] args) {
        String name;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter in your email: ");
        name = ob.nextLine();
        //makeGroup(name, 2);
    }

    public  ArrayList<String> makeGroup(String name, int x){
        Collections.shuffle(Arrays.asList(team), new Random(x));
        for(String var: team){
            System.out.print(var + " ");
        }
        System.out.println();
        for(int i = 0; i < team.length; i++){
            if (i >= 0 && i <= 2)
                team1.add(team[i]);
            else if (3  <= i && i < 6)
                team2.add(team[i]);
            else
                team3.add(team[i]);


        }
        if (team1.contains(name))
        {
            System.out.println(team1);
            return team1;
        }
        else if (team2.contains(name))
        {
            System.out.println(team2);
            return team2;
        }
        else if (team3.contains(name))
        {
            System.out.println(team3);
            return team3;

        }
        else {
            System.out.println("Name does not exist.");

            return null;
        }
    }

}