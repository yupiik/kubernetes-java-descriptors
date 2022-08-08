package io.yupiik.kubernetes.bindings.v1_14_5.v1beta1;

import java.util.List;
import java.util.Objects;

public class IngressListItemsSpecRulesHttp {
    private List<IngressListItemsSpecRulesHttpPaths> paths;

    public IngressListItemsSpecRulesHttp() {
        // no-op
    }

    public IngressListItemsSpecRulesHttp(final List<IngressListItemsSpecRulesHttpPaths> paths) {
        // no-op
    }

    public List<IngressListItemsSpecRulesHttpPaths> getPaths() {
        return paths;
    }

    public void setPaths(final List<IngressListItemsSpecRulesHttpPaths> paths) {
        this.paths = paths;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                paths);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressListItemsSpecRulesHttp)) {
            return false;
        }
        final IngressListItemsSpecRulesHttp __otherCasted = (IngressListItemsSpecRulesHttp) __other;
        return Objects.equals(paths, __otherCasted.paths);
    }
}
