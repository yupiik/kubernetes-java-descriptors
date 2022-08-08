package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.Map;
import java.util.Objects;

public class RuntimeClassOverhead {
    private Map<String, String> podFixed;

    public RuntimeClassOverhead() {
        // no-op
    }

    public RuntimeClassOverhead(final Map<String, String> podFixed) {
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
        if (!(__other instanceof RuntimeClassOverhead)) {
            return false;
        }
        final RuntimeClassOverhead __otherCasted = (RuntimeClassOverhead) __other;
        return Objects.equals(podFixed, __otherCasted.podFixed);
    }
}
