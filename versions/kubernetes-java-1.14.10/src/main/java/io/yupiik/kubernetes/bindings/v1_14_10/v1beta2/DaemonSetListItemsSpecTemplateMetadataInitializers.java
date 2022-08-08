package io.yupiik.kubernetes.bindings.v1_14_10.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateMetadataInitializers {
    private List<DaemonSetListItemsSpecTemplateMetadataInitializersPending> pending;
    private DaemonSetListItemsSpecTemplateMetadataInitializersResult result;

    public DaemonSetListItemsSpecTemplateMetadataInitializers() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateMetadataInitializers(final List<DaemonSetListItemsSpecTemplateMetadataInitializersPending> pending,
                                                              final DaemonSetListItemsSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<DaemonSetListItemsSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<DaemonSetListItemsSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public DaemonSetListItemsSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final DaemonSetListItemsSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateMetadataInitializers)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateMetadataInitializers __otherCasted = (DaemonSetListItemsSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
