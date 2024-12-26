import optifine.Installer;

import java.io.File;

public class Program{
    public static void main(String[] args){
        if (args.length == 0){
            System.err.println("Usage:java -cp \"optifinePath installerpath\" folderPath");
            System.exit(1);
        }
        try
        {
            Installer.doInstall(new File(args[0]));
            System.out.println("Installation successful");
        }
        catch (Exception ex){
            System.err.println(ex.getMessage());
            System.err.print("At:");
            for (var stack : ex.getStackTrace()){
                System.err.println(stack);
            }
            System.exit(1);
        }
    }
}