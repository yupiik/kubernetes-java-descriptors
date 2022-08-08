package io.yupiik.kubernetes.bindings.v1_8_3.v1;

import io.yupiik.kubernetes.bindings.v1_8_3.Validable;
import io.yupiik.kubernetes.bindings.v1_8_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NamespaceSpec implements Validable<NamespaceSpec> {
    private List<String> finalizers;

    public NamespaceSpec() {
        // no-op
    }

    public NamespaceSpec(final List<String> finalizers) {
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
        if (!(__other instanceof NamespaceSpec)) {
            return false;
        }
        final NamespaceSpec __otherCasted = (NamespaceSpec) __other;
        return Objects.equals(finalizers, __otherCasted.finalizers);
    }

    public NamespaceSpec finalizers(final List<String> finalizers) {
        this.finalizers = finalizers;
        return this;
    }

    @Override
    public NamespaceSpec validate() {
        return this;
    }
}
