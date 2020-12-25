package com.demo.cases;

import java.io.*;

/**
 * @author jingLv
 * @date 2020/12/17
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建数据源目录File对象，路径是：/test
        File srcFolder = new File("");
        // 2. 获取数据源目录File对象的名称（test）
        String srcFolderName = srcFolder.getName();
        // 3. 创建目的地目录File对象，路径名是模块名+test组成（file-class/test）
        File destFolder = new File("java-file-class", srcFolderName);
        // 4. 判断目的地的目录对应的File是否存在，如果不存在，就创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        // 5. 获取数据源目录下所有文件的File数组
        File[] listFiles = srcFolder.listFiles();
        // 6. 遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件 - 数据源文件：/test/image.jpg
        for (File file : listFiles) {
            // 7. 获取数据源文件File对象的名称（image.jpg）
            String fileName = file.getName();
            // 8. 创建目的地文件File对象，路径名是目的地目录+image.jpg组成（file-class/test/image.jpg）
            File destFile = new File(destFolder, fileName);
            // 9. 复制文件 - 由于文件不仅仅是文本文件，还有图片，视频等文件，所以采用字节流复制文件
            copyFile(file, destFile);
        }
    }

    /**
     * 复制文件
     *
     * @param file
     * @param destFile
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
