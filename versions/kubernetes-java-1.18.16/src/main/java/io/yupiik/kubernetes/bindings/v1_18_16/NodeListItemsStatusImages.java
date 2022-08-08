package io.yupiik.kubernetes.bindings.v1_18_16;

import java.util.List;
import java.util.Objects;

public class NodeListItemsStatusImages {
    private List<String> names;
    private Integer sizeBytes;

    public NodeListItemsStatusImages() {
        // no-op
    }

    public NodeListItemsStatusImages(final List<String> names,
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
        if (!(__other instanceof NodeListItemsStatusImages)) {
            return false;
        }
        final NodeListItemsStatusImages __otherCasted = (NodeListItemsStatusImages) __other;
        return Objects.equals(names, __otherCasted.names) &&
            Objects.equals(sizeBytes, __otherCasted.sizeBytes);
    }
}
