package HW2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWrite {

   public static void createFile(List<String> name) throws IOException {
        try {
            File path = new File("winToys.txt");

            if (!path.exists()){
                path.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));

            String writeString = String.join(" ", name);

            bw.write(writeString);
            bw.write("\n\n");
            bw.close();

        } catch (Exception e){
            throw new IOException();
        }
    }
}
