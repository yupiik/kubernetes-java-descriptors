package io.yupiik.kubernetes.bindings.v1_17_7;

import java.util.List;
import java.util.Objects;

public class NodeStatusImages {
    private List<String> names;
    private Integer sizeBytes;

    public NodeStatusImages() {
        // no-op
    }

    public NodeStatusImages(final List<String> names,
                            final Integer sizeBytes) {
        // no-op
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(final List<String> names) {
        this.names = names;
    }

    public Integer getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(final Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                names,
                sizeBytes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeStatusImages)) {
            return false;
        }
        final NodeStatusImages __otherCasted = (NodeStatusImages) __other;
        return Objects.equals(names, __otherCasted.names) &&
            Objects.equals(sizeBytes, __otherCasted.sizeBytes);
    }
}
