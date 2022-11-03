package com.borlok.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt3 implements FilenameFilter {
    private String ext;

    public OnlyExt3(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
