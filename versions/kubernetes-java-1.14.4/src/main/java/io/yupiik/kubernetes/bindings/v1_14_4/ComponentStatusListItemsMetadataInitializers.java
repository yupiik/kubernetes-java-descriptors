package io.yupiik.kubernetes.bindings.v1_14_4;

import java.util.List;
import java.util.Objects;

public class ComponentStatusListItemsMetadataInitializers {
    private List<ComponentStatusListItemsMetadataInitializersPending> pending;
    private ComponentStatusListItemsMetadataInitializersResult result;

    public ComponentStatusListItemsMetadataInitializers() {
        // no-op
    }

    public ComponentStatusListItemsMetadataInitializers(final List<ComponentStatusListItemsMetadataInitializersPending> pending,
                                                        final ComponentStatusListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ComponentStatusListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ComponentStatusListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ComponentStatusListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ComponentStatusListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ComponentStatusListItemsMetadataInitializers)) {
            return false;
        }
        final ComponentStatusListItemsMetadataInitializers __otherCasted = (ComponentStatusListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
