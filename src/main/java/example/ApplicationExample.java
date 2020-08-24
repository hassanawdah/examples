package example;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class ApplicationExample extends Application {

    private final Set <Class <?>> classes = new HashSet <>();

    {
        classes.add(FirstExampleController.class);
    }

    @Override
    public Set <Class <?>> getClasses() {
        return Collections.unmodifiableSet(classes);
    }
}
