package com.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author jingLv
 * @date 2020/12/21
 */
public class FileException {

    /**
     * try...catch..finally异常处理
     */
    public static void fileMethod() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("fr.txt");
            fileWriter = new FileWriter("fw.txt");

            char[] chars = new char[1024];
            int len;
            while ((len = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * JDK1.7提供TWR的改进异常处理
     */
    public static void fileMethodNew() {
        try (
                FileReader fileReader = new FileReader("fr.txt");
                FileWriter fileWriter = new FileWriter("fw.txt");
        ) {
            char[] chars = new char[1024];
            int len;
            while ((len = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * JDK9提供改进异常处理
     */
    public static void fileMethodNews() throws IOException {
        FileReader fileReader = new FileReader("fr.txt");
        FileWriter fileWriter = new FileWriter("fw.txt");
        try (fileReader; fileWriter) {
            char[] chars = new char[1024];
            int len;
            while ((len = fileReader.read(chars)) != -1) {
                fileWriter.write(chars, 0, len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
