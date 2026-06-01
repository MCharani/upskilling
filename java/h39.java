import java.lang.reflect.Method;

public class h39 {

    public void show() {
        System.out.println("Reflection Example");
    }

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName("h39");

        Method[] methods =
                cls.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method method =
                cls.getMethod("show");

        method.invoke(obj);
    }
}