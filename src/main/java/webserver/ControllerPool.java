package webserver;

import java.util.Set;

public class ControllerPool implements BeanPool{

    private BeanFinder finder;

    public ControllerPool(BeanFinder finder) {
        this.finder = finder;
    }

    @Override
    public Set<Class<?>> getControllers() {
        return finder.find();
    }
}
