import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCow extends Cow {


    public FileCow(String name, String filename)throws RuntimeException {
        super(name);
        try {
            String Image="";
            FileInputStream fileStream =new FileInputStream(filename);
            Scanner scnr=new Scanner(fileStream);
            while(scnr.hasNextLine()){
            Image=Image+scnr.nextLine()+"\n";}
        super.setImage(Image);}

        catch(IOException a){

        throw new RuntimeException("MOOOOO!!!!!!");

    }
    }

    public void setImage() {
        throw new RuntimeException("Cannot reset FileCow Image");
    }
}