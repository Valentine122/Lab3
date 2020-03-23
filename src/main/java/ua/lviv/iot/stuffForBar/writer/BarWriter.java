package ua.lviv.iot.stuffForBar.writer;

        import ua.lviv.iot.stuffForBar.model.AbstractBar;

        import java.io.Writer;
        import java.io.IOException;
        import java.util.List;

public class BarWriter {
    private Writer whiskeyWriter;

    public void setWhiskeyWriter(Writer whiskeyWriter){
        this.whiskeyWriter = whiskeyWriter;
    }

    public void writeToFile(List<AbstractBar> stuffs) throws IOException{
        for (AbstractBar stuff : stuffs){
            String textWriter = stuff.getCubes() + ", " + stuff.toWhiskey() + "\r\n";
            whiskeyWriter.write(textWriter);
        }

    }

    public String stringWriter(){
        return whiskeyWriter.toString();
    }
}
