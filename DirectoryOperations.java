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

    Path getDir(){
        Path currentPath = Paths.get("").toAbsolutePath();
        return currentPath;
    }

    String[] getSuperDirectories(Path currentPath){
        String superDirs[] = currentPath.toString().split("/");      
        return superDirs;
    }

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