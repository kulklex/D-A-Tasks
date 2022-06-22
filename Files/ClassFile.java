import java.io.File;

public class ClassFile {
    public void analyzePath(String path){
        File name = new File(path);
        if(name.exists()){
            System.out.println(name.getName() + " exists\n" + 
            (name.isFile() ? " is a file\n" :  "is not a file\n")+
            (name.isDirectory() ? " is a directory\n" : " is not a directory\n" ) +
            (name.isDirectory() ? " is absolute path\n" : " is not absolute path\n" ) + 
            "Last modified: " + name.lastModified() + "\nLength: " + name.length() +
            "\nPath: " + name.getPath() + "\nAbsolute path: " + name.getAbsolutePath() + "\nParent: " + name.getParent());
            
            if(name.isDirectory()){
                String directory[] = name.list();
                System.out.println("\n\nDirectory contents:\n");

                for(String directoryName : directory){
                    System.out.printf("%s\n", directoryName);
                }
            } else {
                System.out.printf("%s %s", path, " does not exist.");
            }
        }
    }
}
