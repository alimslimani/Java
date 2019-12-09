package com.highfi.sys.codingame;

import java.io.File;

public class FilePath {

    public static void main(String[] args) {
        locateUniverseFormula();
    }


    static String locateUniverseFormula() {
        String path = "/tmp/documents/";
        String fName = "universe-formula";
        File file = find(path, fName);
        return file.getAbsolutePath();
    }

    public static File find(String path, String fName) {
        File f = new File(path);
        if (fName.equalsIgnoreCase(f.getName()))
            return f;
        if (f.isDirectory()) {
            for (String aChild : f.list()) {
                File ff = find(path + File.separator + aChild, fName);
                if (ff != null)
                    return ff;
            }
        }
        return null;
    }
}
