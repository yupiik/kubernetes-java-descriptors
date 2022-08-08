package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.List;
import java.util.Objects;

public class IngressSpecRulesHttp {
    private List<IngressSpecRulesHttpPaths> paths;

    public IngressSpecRulesHttp() {
        // no-op
    }

    public IngressSpecRulesHttp(final List<IngressSpecRulesHttpPaths> paths) {
        // no-op
    }

    public List<IngressSpecRulesHttpPaths> getPaths() {
        return paths;
    }

    public void setPaths(final List<IngressSpecRulesHttpPaths> paths) {
        this.paths = paths;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                paths);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressSpecRulesHttp)) {
            return false;
        }
        final IngressSpecRulesHttp __otherCasted = (IngressSpecRulesHttp) __other;
        return Objects.equals(paths, __otherCasted.paths);
    }
}
