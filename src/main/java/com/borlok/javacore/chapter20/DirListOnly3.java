package main.java.com.borlok.javacore.chapter20;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * Применение FilenameFilter
 */
public class DirListOnly3 {
    public DirListOnly3() {
        String dirName = "./Java";
        File f1 = new File(dirName);
        FilenameFilter only = new OnlyExt3("html");
        String [] fileList = f1.list(only);
        for (String x : fileList)
            System.out.println(x);
    }
}
