package binaySearchTreeSum;

import org.junit.Test;


import static org.junit.Assert.assertTrue;
//Add, edit, or remove tests in this file.
//Treat it as your playground!

public class ProgramTest {
public BST val;

public ProgramTest() {
 val = new BST(100);
 val
     .insert(5)
     .insert(15)
     .insert(5)
     .insert(2)
     .insert(1)
     .insert(22)
     .insert(1)
     .insert(1)
     .insert(3)
     .insert(1)
     .insert(1)
     .insert(502)
     .insert(55000)
     .insert(204)
     .insert(205)
     .insert(207)
     .insert(206)
     .insert(208)
     .insert(203)
     .insert(-51)
     .insert(-403)
     .insert(1001)
     .insert(57)
     .insert(60)
     .insert(4500);
 
}

@Test
public void TestCase1() {
 assertTrue(Program.findClosestValueInBst(val, 100) == 100);
}

@Test
public void TestCase2() {
 assertTrue(Program.findClosestValueInBst(val, 190) == 203);
}

}

