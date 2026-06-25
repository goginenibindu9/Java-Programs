import java.io.*;

public class FolderAudit {

    public static void main(String[] args) {

        File folder = new File("D:\\TestFolder");

        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("Folder not found.");
            return;
        }

        for (File file : files) {

            if (file.isFile()) {

                System.out.println("\nFile: " + file.getName());

                // Check large files (greater than 1 MB)
                if (file.length() > 1024 * 1024) {
                    System.out.println("Too Large File");
                }

                // Check read-only files
                if (!file.canWrite()) {
                    System.out.println("Read-Only File");
                }

                // Create safety copy for .config files
                if (file.getName().endsWith(".config")) {

                    String newName =
                            file.getParent() + File.separator +
                            file.getName() + "_copy";

                    try (
                        FileInputStream fin =
                                new FileInputStream(file);
                        FileOutputStream fout =
                                new FileOutputStream(newName);
                    ) {
                        int ch;
                        while ((ch = fin.read()) != -1) {
                            fout.write(ch);
                        }

                        System.out.println(
                            "Safety Copy Created: "
                            + file.getName() + "_copy");
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }
}

