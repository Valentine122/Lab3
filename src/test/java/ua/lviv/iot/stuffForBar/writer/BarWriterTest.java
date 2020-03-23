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
        try(Writer file = new FileWriter("Bar.whiskey")){
            BarWriter writer = new BarWriter();
            writer.setWhiskeyWriter(file);
            writer.writeToFile(organizersForTheBar);
        }catch (Exception n) {
            fail("*****The testWriter FAILED******");
        }
    }

    @Test
    public void testFormating(){
        try(Writer whiskeyWriter = new StringWriter()){
            BarWriter writer = new BarWriter();
            writer.setWhiskeyWriter(whiskeyWriter);
            writer.writeToFile(organizersForTheBar);
            String textWriter = "";

            for (AbstractBar stuff : organizersForTheBar) {
                textWriter += stuff.getCubes() + ", " + stuff.toWhiskey() + "\r\n";

            }
            Assertions.assertEquals(textWriter, writer.stringWriter());
        }
        catch (Exception n){
            fail("****The testFormating FAILED****");
        }
    }
}
