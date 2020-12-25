package com.demo.cases;

import java.io.*;
import java.util.Objects;

/**
 * @author jingLv
 * @date 2020/12/21
 */
public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建数据源File对象：路径：/test
        File srcFile = new File("");
        // 2. 创建目的地File对象，路径：/test_copy
        File destFile = new File("");
        // 3. 写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
        copyFolder(srcFile, destFile);
    }

    /**
     * 复制文件夹
     *
     * @param srcFile  数据源File对象
     * @param destFile 目的地File对象
     */
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        // 4. 判断数据源是否是目录
        if (srcFile.isDirectory()) {
            // 在目的地下创建和数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            // 在目的地目录下，创建于源目录同名的文件夹
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
            // 获取数据源File下所有文件或目录的File数组
            File[] files = srcFile.listFiles();
            // 遍历该File数组，得到每一个File对象
            for (File file : Objects.requireNonNull(files)) {
                // 把改File作为数据源File对象，递归调用复制文件夹的方法
                copyFolder(file, newFolder);
            }
        } else {
            // 说明是文件，直接复制，使用字节流
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    /**
     * 复制文件
     *
     * @param file     数据源File对象
     * @param destFile 目的地File对象
     */
    private static void copyFile(File file, File destFile) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
