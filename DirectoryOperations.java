import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryOperations {
    String targetDirectory, targetPathString, superDirectories[];
    Path currentDirectory;
    DirectoryOperations(String targetDir){
        this.targetDirectory = targetDir;
        this.currentDirectory = getDir();
        this.superDirectories = getSuperDirectories(this.currentDirectory);
        this.targetPathString = routeToTarget(currentDirectory, targetDir, superDirectories);
    }

    /**
     * gets the current directory of the JVM
     * @return Path of the current directory
     */
    Path getDir(){
        Path currentPath = Paths.get("").toAbsolutePath();
        return currentPath;
    }

    /**
     * splits the directories within the current path
     * @param currentPath
     * @return String-Array of directory names
     */
    String[] getSuperDirectories(Path currentPath){
        String superDirs[] = currentPath.toString().split("/");      
        return superDirs;
    }

    /**
     * searches and matches the user-defined directory with an element
     * of the String-Array with directory names
     * @param currentDir
     * @param target
     * @param superDirs
     * @return String with Path to the target-directory in Unix-Format
     */
    String routeToTarget(Path currentDir, String target, String superDirs[]){
        String targetDirString = null;
        for (String superDir: superDirs){
            if(superDir.equals(target)){
                targetDirString = currentDir.toString().split(target)[0].concat(superDir);
            }
        }
        return targetDirString;
    }

}