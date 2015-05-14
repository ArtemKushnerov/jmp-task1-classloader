/**
 * The main entrance to the program.
 *
 * @author Artsiom Kushniarou
 * @since May 13, 2015
 */
public class LoadClass {

    private static String className = "Semaphore";
    private static String methodName = "lever";
    private static String defaultPath2Class = "d:\\Semaphore.class";

    /**
     * Invokes the specified method on the class instance loaded from the disk.
     *
     * @param args command line arguments, should contain path to the file, or the default one will be used
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String path2class = getPath2ClassFromArgs(args);
        System.out.println("Loading class from '" + path2class + "' directory");
        ClassLoader classLoader = new DiskClassLoader(path2class);
        Class<?> clazz = classLoader.loadClass(className);
        Object instance = clazz.newInstance();
        clazz.getMethod(methodName).invoke(instance);
    }

    /**
     * Gets the path to the class file from command line arguments.
     *
     * @param args command line arguments
     *
     * @return  path to class file, if provided, or default path
     */
    private static String getPath2ClassFromArgs(String[] args) {
        return args.length != 0 && args[0].length()!=0 ? args[0]: defaultPath2Class;
    }
}
