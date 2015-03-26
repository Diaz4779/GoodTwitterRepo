
package com.example.test;


import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    private List<String> names;

    @Before
    public void setUp(){
        this.names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");
    }

    @Test
    public void groupsHaveThreePeople() throws Exception{

        App app = new App(names);
        List<String> group = app.createGroup("a");
        assertEquals(group.size(), 3);
    }

    @Test
    public void givenUsernameIsInGroup() throws Exception {

        App app = new App(names);
        String name = "a";
        List<String> group = app.createGroup(name);
        assertEquals(group.contains(name), true);
    }

    @Test
    public void groupsHaveConsistentMembership() throws Exception {

        App app = new App(names);
        List<String> actualA = app.createGroup("a");
        List<String> actualB = app.createGroup("b");
        List<String> actualC = app.createGroup("c");
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        assertEquals(actualA, expected);
        assertEquals(actualB, expected);
        assertEquals(actualC, expected);
    }

    @Test
    public void createSubgroups(){

        App app = new App(names);
        ArrayList<ArrayList<String>> groups = app.createSubgroups();
        assertEquals(groups.size(), 2);
        assertEquals(groups.get(0).size(), 3);

    }

    @Test
    public void findGroup(){

        App app = new App(names);
        ArrayList<ArrayList<String>> groups = app.createSubgroups();
        assertEquals(groups.size(), 2);
        assertEquals(groups.get(0).size(), 3);

    }

    @Test
    public void groupSize() {
        App app = new App(this.names);
        ArrayList<ArrayList<String>> groups =
                app.createSubgroups();
        assertEquals(groups.size(), 2);
    }
}