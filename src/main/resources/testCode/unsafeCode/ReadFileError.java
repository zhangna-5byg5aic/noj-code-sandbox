package com.yupi.nojcodesandbox.unsafe;
/**
 * 读取服务器文件（文件信息泄露）
 */
public class ReadFileError {
    public static void main(String[] args) throws InterruptedException, IOException {
        String userDir = System.getProperty("user.dir");
        String filePath = userDir + File.separator + "src/main/resources/application.yml";
        List<String> allLines = Files.readAllLines(Paths.get(filePath));
        System.out.println(String.join("\n", allLines));
    }
}
