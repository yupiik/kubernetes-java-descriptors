package io.yupiik.kubernetes.bindings.v1_20_11;

import java.util.Map;
import java.util.Objects;

public class RuntimeClassSpecOverhead {
    private Map<String, String> podFixed;

    public RuntimeClassSpecOverhead() {
        // no-op
    }

    public RuntimeClassSpecOverhead(final Map<String, String> podFixed) {
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
        if (!(__other instanceof RuntimeClassSpecOverhead)) {
            return false;
        }
        final RuntimeClassSpecOverhead __otherCasted = (RuntimeClassSpecOverhead) __other;
        return Objects.equals(podFixed, __otherCasted.podFixed);
    }
}
