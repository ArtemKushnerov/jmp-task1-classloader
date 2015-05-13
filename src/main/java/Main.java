/**
 * The main entrance to the program.
 *
 * @author Artsiom Kushniarou
 * @since May 13, 2015
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ClassLoader myClassloader = new MyClassloader();
        Class<?> aClass = myClassloader.loadClass("");
        System.out.println("aClass = " + aClass);
    }
}
