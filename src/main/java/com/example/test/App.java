package com.example.test;

/**
 * Hello world!
 *
*/

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by vagrant on 2/7/15.
 */
public class App {

    List<String> names;

    public App(List<String> names){
        this.names = names;
    }

    public ArrayList<String> createGroup(String targetName) throws Exception{

        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();
        ArrayList<String> tmpGroup = new ArrayList<String>();
        for(String name : this.names){
            tmpGroup.add(name);
            if(tmpGroup.size() == 3){
                groups.add(tmpGroup);
                tmpGroup = new ArrayList<String>();
            }
        }

        for(ArrayList<String> group : groups){
            if(group.contains(targetName))
                return group;
        }

        throw new Exception("Target not found");

    }



    public static void main(String[] args) throws Exception{
        String targetName = args[0];
        long assignmentNumber = Long.valueOf(args[1]);

        List<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        Collections.shuffle(names, new Random(assignmentNumber));

        App app = new App(names);

        System.out.print(app.createGroup(targetName));
    }

}