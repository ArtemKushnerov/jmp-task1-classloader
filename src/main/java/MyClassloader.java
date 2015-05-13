/**
 * The class that intended to load other classes into the memory.
 *
 * @author Artsiom Kushniarou
 * @since May 13, 2015
 */
public class MyClassloader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return String.class;
    }
}
