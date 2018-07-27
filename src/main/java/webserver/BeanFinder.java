package webserver;

import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.util.Set;

public class BeanFinder {

    private String defaultPath;
    private Class<? extends Annotation> annotation;

    public BeanFinder(String defaultPath, Class<? extends Annotation> aClass) {
        this.defaultPath = defaultPath;
        this.annotation = aClass;
    }

    public Set<Class<?>> find() {
        Reflections reflections = new Reflections(defaultPath);
        return reflections.getTypesAnnotatedWith(annotation);
    }
}
