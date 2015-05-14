import java.util.Scanner;

/**
 * The main entrance to the program.
 *
 * @author Artsiom Kushniarou
 * @since May 13, 2015
 */
public class LoadClass {

    private static String className = "Semaphore";
    private static String methodName = "lever";

    /**
     * Invokes the specified method on the class instance loaded from the disk.
     *
     * @param args command line arguments, should contain path to the file, or the default one will be used
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Please, execute program in the following format: java LoadClass %DRIVE_LETTER%:\\path\\to\\class.");
            return;
        }

        String path2class = args[0];
        do {
            System.out.println("Loading class from '" + path2class + "' directory.");
            ClassLoader classLoader = new DiskClassLoader(path2class);
            Class<?> clazz = classLoader.loadClass(className);
            Object instance = clazz.newInstance();
            clazz.getMethod(methodName).invoke(instance);
            System.out.println("Please, press enter when the '.class' file has been changed for reloading.");
            System.in.read();
        } while (true);
    }
}
