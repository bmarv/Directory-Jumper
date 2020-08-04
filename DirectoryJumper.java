class DirectoryJumper{
    DirectoryJumper(){
    }
    /**
     * Main Method that invokes the runProgram-Method after checking that the 
     * size of the passed argument is exactly one
     * @param args
     */
    public static void main(String args[]){
        // check for correct number of arguments
        if(args.length!=1)
            System.out.println("Please insert exactly one directory-name");
        else{
            String targetDirectory = runProgram(args[0]);
            System.out.println(targetDirectory);
        }
    }

    /**
     * Method that invokes the DirectoryOperation-Class, which includes the 
     * program logic
     * @param targetDir
     * @return Path of the user-defined target-directory
     */
    public static String runProgram(String targetDir){
        DirectoryOperations OperationHandler = new DirectoryOperations(targetDir);
        return OperationHandler.targetPathString;
    }
}