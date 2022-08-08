package io.yupiik.kubernetes.bindings.v1_20_1.v1;

import java.util.Map;
import java.util.Objects;

public class RuntimeClassListItemsOverhead {
    private Map<String, String> podFixed;

    public RuntimeClassListItemsOverhead() {
        // no-op
    }

    public RuntimeClassListItemsOverhead(final Map<String, String> podFixed) {
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
        if (!(__other instanceof RuntimeClassListItemsOverhead)) {
            return false;
        }
        final RuntimeClassListItemsOverhead __otherCasted = (RuntimeClassListItemsOverhead) __other;
        return Objects.equals(podFixed, __otherCasted.podFixed);
    }
}
