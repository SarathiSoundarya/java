import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class Fileexceptions {
    public static void main(String[] args) {
        // With FileReader
        FileReader fr = null;
        try {

            fr = new FileReader("src/file.txt");
            System.out.println("found!!!");
            int ch = 0;
            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch);
            }
            if (fr != null) {
                fr.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        } catch (Exception e) {
            System.out.println("Exception--->");
            System.out.println(e);
        } finally {
            System.out.println("Finallyyy!!");
        }

        // With BUFFER Reader
        BufferedReader reader=null;
        try {
            reader = new BufferedReader(new FileReader("src/file.txt"));
            String line;
            while ((line= reader.readLine())!=null) {
                System.out.println(line);
            }
            reader.close();

        }
        catch (Exception e) {
            System.out.println("Exception------->");
            System.out.println(e);
        }
        //With BUFFER Writer
        BufferedWriter writer=null;
        try{
            writer=new BufferedWriter(new FileWriter("writefile.txt"));
            writer.write("Helloooo");
            writer.newLine();
            writer.write("WORLD!");
            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

}
