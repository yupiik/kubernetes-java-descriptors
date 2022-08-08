package io.yupiik.kubernetes.bindings.v1_14_5;

import java.util.List;
import java.util.Objects;

public class ControllerRevisionListItemsMetadataInitializers {
    private List<ControllerRevisionListItemsMetadataInitializersPending> pending;
    private ControllerRevisionListItemsMetadataInitializersResult result;

    public ControllerRevisionListItemsMetadataInitializers() {
        // no-op
    }

    public ControllerRevisionListItemsMetadataInitializers(final List<ControllerRevisionListItemsMetadataInitializersPending> pending,
                                                           final ControllerRevisionListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<ControllerRevisionListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<ControllerRevisionListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public ControllerRevisionListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final ControllerRevisionListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof ControllerRevisionListItemsMetadataInitializers)) {
            return false;
        }
        final ControllerRevisionListItemsMetadataInitializers __otherCasted = (ControllerRevisionListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
