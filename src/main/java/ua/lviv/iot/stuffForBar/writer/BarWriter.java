package ua.lviv.iot.stuffForBar.writer;

        import ua.lviv.iot.stuffForBar.model.AbstractBar;

        import java.io.Writer;
        import java.io.IOException;
        import java.util.List;

public class BarWriter {
    private Writer csvWriter;

    public void setCsvWriter(Writer csvWriter){
        this.csvWriter = csvWriter;
    }

    public void writeToFile(List<AbstractBar> stuffs) throws IOException{
        for (AbstractBar stuff : stuffs){
            String textWriter = stuff.getHeaders() + ", " + stuff.toCSV() + "\r\n";
            csvWriter.write(textWriter);
        }

    }

    public String stringWriter(){
        return csvWriter.toString();
    }
}
