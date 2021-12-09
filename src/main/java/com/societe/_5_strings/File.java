package com.societe._5_strings;

public class File {

    public static final String SEPARATOR = "/";

    private String absolutePath; //   /Users/ionut/Desktop/java-societe/build.gradle
//    ['/', 'U', 's', 'e' 'r', ...]
//      0    1    2    3

    public File(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public String getFileExtension() {
        int indexOfExtensionSeparator = absolutePath.lastIndexOf(".");
        String extension = absolutePath.substring(indexOfExtensionSeparator);

        return extension;
    }

    public String getFileName() {
        int lastIndexOfSeparator = absolutePath.lastIndexOf(SEPARATOR);
        return absolutePath.substring(lastIndexOfSeparator + 1);
    }

    public int getPathLength() {
        String[] pathElements = absolutePath.split(SEPARATOR);
        return pathElements.length - 1;
    }

    public static void main(String... args) {
        File file = new File("/Users/ionut/Desktop/java-societe/build.gradle");

        System.out.println("file.getFileName() = " + file.getFileName());
        System.out.println("file.getFileExtension() = " + file.getFileExtension());
        System.out.println("file.getPathLength() = " + file.getPathLength());
    }
}
