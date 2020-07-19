package Zip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class squeeze {
    public static void squeezes() throws IOException {
        Path path = Paths.get("e:/FileDemo");
        ArrayList<Path> uncode = Uncode.uncode(path);
        ZipOutputStream z = new ZipOutputStream(new FileOutputStream(path.toFile().getParent() + "Squeeze.zip"));

        for (Path p:uncode)
        {
            File out=p.toFile();
            FileReader fr = new FileReader(out);
            z.putNextEntry(new ZipEntry(out.getName()));
            createFile(fr ,z);
        }
        z.close();
    }
    public static void createFile(FileReader reads, ZipOutputStream zou) throws IOException {
        int temp=0;
        while ((temp=reads.read())!=-1)
        {
            zou.write(temp);
        }

    }
}
