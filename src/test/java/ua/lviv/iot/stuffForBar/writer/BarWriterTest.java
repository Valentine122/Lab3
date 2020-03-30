package ua.lviv.iot.stuffForBar.writer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.stuffForBar.manager.BaseBarManagerTest;
import ua.lviv.iot.stuffForBar.model.AbstractBar;
import java.io.*;

import static org.junit.jupiter.api.Assertions.fail;

public class BarWriterTest extends BaseBarManagerTest {

    @Test
    public void testWriter(){
        try(Writer file = new FileWriter("Bar.csv")){
            BarWriter writer = new BarWriter();
            writer.setCsvWriter(file);
            writer.writeToFile(organizersForTheBar);
        }catch (Exception n) {
            fail("*****The testWriter FAILED******");
        }
    }

    @Test
    public void testFormating(){
        try(Writer csvWriter = new StringWriter()){
            BarWriter writer = new BarWriter();
            writer.setCsvWriter(csvWriter);
            writer.writeToFile(organizersForTheBar);
            String textWriter = "";

            for (AbstractBar stuff : organizersForTheBar) {
                textWriter += stuff.getHeaders() + ", " + stuff.toCSV() + "\r\n";

            }
            Assertions.assertEquals(textWriter, writer.stringWriter());
        }
        catch (Exception n){
            fail("****The testFormating FAILED****");
        }
    }
}
