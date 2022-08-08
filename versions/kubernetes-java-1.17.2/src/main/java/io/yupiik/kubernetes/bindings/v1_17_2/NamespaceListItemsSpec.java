package io.yupiik.kubernetes.bindings.v1_17_2;

import java.util.List;
import java.util.Objects;

public class NamespaceListItemsSpec {
    private List<String> finalizers;

    public NamespaceListItemsSpec() {
        // no-op
    }

    public NamespaceListItemsSpec(final List<String> finalizers) {
        // no-op
    }

    public List<String> getFinalizers() {
        return finalizers;
    }

    public void setFinalizers(final List<String> finalizers) {
        this.finalizers = finalizers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                finalizers);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NamespaceListItemsSpec)) {
            return false;
        }
        final NamespaceListItemsSpec __otherCasted = (NamespaceListItemsSpec) __other;
        return Objects.equals(finalizers, __otherCasted.finalizers);
    }
}
