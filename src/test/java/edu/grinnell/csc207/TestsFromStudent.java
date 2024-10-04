package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Jana Vadillo
 */
public class TestsFromStudent {
  /**
   * A simple test testing the size function
   */
  @Test
  public void vadilloJanaTest1() throws Exception {
    AssociativeArray<String, String> sizeCheck = new AssociativeArray<String, String>();
    sizeCheck.set("elmt1", "if you are reading this your code probably broke");
    sizeCheck.set("elmt2", "if so I am quite sorry");
    sizeCheck.set("elmt3", "good luck debugging");
    try {
      assertEquals(3, sizeCheck.size());
    } catch (Exception e) {
      fail("Array size is not what expected");
    } // try catch
    AssociativeArray<String, String> testSize = new AssociativeArray<String, String>();
    testSize.set("elmt1", "well you made it past the first bit so thats neat");
    testSize.set("elmt2", "overwriting might be broken tho idk");
    testSize.set("elmt3", "or remove, so good luck with that");
    testSize.remove("elmt3");
    try {
      assertEquals(2, testSize.size());
    } catch (Exception e) {
      fail("Array does not have the expected size after removal");
    } // try catch

  } // vadilloJanaTest1

    /**
   * A simple test testing the haskey function
   */
  @Test
  public void vadilloJanaTest2() throws Exception {
    AssociativeArray<String, String> haskeyCheck = new AssociativeArray<String, String>();
    haskeyCheck.set("elmt1", "if you are reading this your code probably broke with haskey");
    haskeyCheck.set("elmt2", "if so I wish you the best");
    haskeyCheck.set("elmt3", "onward");
    try {
      assertEquals(true, haskeyCheck.hasKey("elmt3"));
    } catch (Exception e) {
      fail("Array haskey did not find an added key");
    } // try catch

    haskeyCheck.remove("elmt3");
    try {
      assertEquals(false, haskeyCheck.hasKey("elmt3"));
    } catch (Exception e) {
      fail("array does not handle haskey well when an elmt is removed");
    } // try catch

  } // vadilloJanaTest2



    /**
   * An edge case for testing add and haskey with weird charachters
   */
  @Test
  public void vadilloJanaEdge1() throws Exception {
    AssociativeArray<String, String> haskeyCheck = new AssociativeArray<String, String>();
    haskeyCheck.set("", "empty key could cause some issues");
    haskeyCheck.set("\n", "or maybe new lines are the issue");
    haskeyCheck.set("\0", "Null charachter might be a key, so maybe this will break things");
    try {
      assertEquals(true, haskeyCheck.hasKey(""));
    } catch (Exception e) {
      fail("Array cannot find the empty string");
    } // try catch

    try {
      assertEquals(true, haskeyCheck.hasKey("\n"));
    } catch (Exception e) {
      fail("Array cannot find the newline string key");
    } // try catch

    try {
      assertEquals(true, haskeyCheck.hasKey("\0"));
    } catch (Exception e) {
      fail("Array cannot find the null charachter string");
    } // try catch





  } // vadilloJanaTest2
} // class TestsFromSam
