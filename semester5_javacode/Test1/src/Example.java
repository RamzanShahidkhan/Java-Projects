import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Example {
 File output;
 @Before
public void createOutputFile() {
 output= new File("");
 }
 @Test
public void Testsomething() {
 //...
 }
 @After
public void deleteOutputFile() {
 output.delete();
 }}