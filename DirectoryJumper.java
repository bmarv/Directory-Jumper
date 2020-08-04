class DirectoryJumper{
    DirectoryJumper(){
    }
    public static void main(String args[]){
        // check for correct number of arguments
        if(args.length!=1)
            System.out.println("Please insert only one directory");
        else{
            String targetDirectory = runProgram(args[0]);
            System.out.println(targetDirectory);
        }
    }

    public static String runProgram(String targetDir){
        DirectoryOperations OperationHandler = new DirectoryOperations(targetDir);
        return OperationHandler.targetPathString;
    }
}