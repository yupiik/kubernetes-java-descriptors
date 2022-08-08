package io.yupiik.kubernetes.bindings.v1_14_8.v1beta1;

import java.util.List;
import java.util.Objects;

public class RuntimeClassMetadataInitializers {
    private List<RuntimeClassMetadataInitializersPending> pending;
    private RuntimeClassMetadataInitializersResult result;

    public RuntimeClassMetadataInitializers() {
        // no-op
    }

    public RuntimeClassMetadataInitializers(final List<RuntimeClassMetadataInitializersPending> pending,
                                            final RuntimeClassMetadataInitializersResult result) {
        // no-op
    }

    public List<RuntimeClassMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<RuntimeClassMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public RuntimeClassMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final RuntimeClassMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClassMetadataInitializers)) {
            return false;
        }
        final RuntimeClassMetadataInitializers __otherCasted = (RuntimeClassMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
