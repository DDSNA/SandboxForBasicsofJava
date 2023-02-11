package syntax.demo.nonspecific_examples;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class user_fileImport {
    public static void main(String[] args) throws IOException {
        File currentDirFile = new File(".");
        String helper = currentDirFile.getAbsolutePath();
        String currentDir = helper.substring(0, helper.length() - currentDirFile.getCanonicalPath().length());//this line may need a try-catch block

        File file = new File(currentDirFile.toURI() + "sampleUser.txt");
        System.out.println(currentDir);
        System.out.println(currentDirFile);
    }
}
