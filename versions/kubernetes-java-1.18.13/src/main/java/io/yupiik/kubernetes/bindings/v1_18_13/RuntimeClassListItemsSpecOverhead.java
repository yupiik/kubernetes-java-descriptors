package io.yupiik.kubernetes.bindings.v1_18_13;

import java.util.Map;
import java.util.Objects;

public class RuntimeClassListItemsSpecOverhead {
    private Map<String, String> podFixed;

    public RuntimeClassListItemsSpecOverhead() {
        // no-op
    }

    public RuntimeClassListItemsSpecOverhead(final Map<String, String> podFixed) {
        // no-op
    }

    public Map<String, String> getPodFixed() {
        return podFixed;
    }

    public void setPodFixed(final Map<String, String> podFixed) {
        this.podFixed = podFixed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                podFixed);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClassListItemsSpecOverhead)) {
            return false;
        }
        final RuntimeClassListItemsSpecOverhead __otherCasted = (RuntimeClassListItemsSpecOverhead) __other;
        return Objects.equals(podFixed, __otherCasted.podFixed);
    }
}
