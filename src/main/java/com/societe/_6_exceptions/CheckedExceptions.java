package com.societe._6_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CheckedExceptions {

    public static void main(String... args) {
        Path path = Paths.get("bla-.txt");

        writeAString(path);
    }

    //in general, o metoda ar trebui sa gestioneze o exceptie si atat
    private static void writeAString(Path path) { //declare

        try {
            writeContentToFile(path, "\nOne line in file");
        } catch (IOException ex) {
//           log.error(ex);
            ex.printStackTrace();
        }
    }

    private static void writeContentToFile(Path path, String content) throws IOException {
        System.out.println("Prepare file content");
        Files.writeString(path, content, StandardOpenOption.APPEND);
        System.out.println("Finishing write");
    }
}