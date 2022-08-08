package io.yupiik.kubernetes.bindings.v1_15_9;

import java.util.List;
import java.util.Objects;

public class ComponentStatusMetadataInitializers {
    private List<ComponentStatusMetadataInitializersPending> pending;
    private ComponentStatusMetadataInitializersResult result;

    public ComponentStatusMetadataInitializers() {
        // no-op
    }

    public ComponentStatusMetadataInitializers(final List<ComponentStatusMetadataInitializersPending> pending,
                                               final ComponentStatusMetadataInitializersResult result) {
        // no-op
    }

    public List<ComponentStatusMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ComponentStatusMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ComponentStatusMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ComponentStatusMetadataInitializersResult result) {
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
        if (!(__other instanceof ComponentStatusMetadataInitializers)) {
            return false;
        }
        final ComponentStatusMetadataInitializers __otherCasted = (ComponentStatusMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
