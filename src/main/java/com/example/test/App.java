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


     static String team[] = {"tledford@csumb.edu", "ychino@csumb.edu", "jocortez@csumb.edu", "bensanchez@csumb.edu", "jdiazflores@csumb.edu", "marivera@csumb.edu", "bjaramillo@csumb.edu", "brdamico@csumb.edu", "boody@csumb.edu"};
     static ArrayList team1= new ArrayList();
     static ArrayList team2 = new ArrayList();
     static ArrayList team3 = new ArrayList();


    public static void main(String[] args) {
        String name = args[0];
        int assignment = Integer.parseInt(args[1]);
        ArrayList myReviewTeam = makeGroup(name, assignment);
    }

    public static ArrayList makeGroup(String name, int x){
        Collections.shuffle(Arrays.asList(team), new Random(x));

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
            System.out.print(team1);
            return team1;
        }
        else if (team2.contains(name))
        {
            System.out.print(team2);
            return team2;
        }
        else if (team3.contains(name))
        {
            System.out.print(team3);
            return team3;

        }
        else {
            System.out.print("Name does not exist.");

            return null;
        }
    }

}