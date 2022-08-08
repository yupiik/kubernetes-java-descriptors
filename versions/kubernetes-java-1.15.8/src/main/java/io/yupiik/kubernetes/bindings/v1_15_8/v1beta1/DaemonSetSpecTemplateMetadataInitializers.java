package io.yupiik.kubernetes.bindings.v1_15_8.v1beta1;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateMetadataInitializers {
    private List<DaemonSetSpecTemplateMetadataInitializersPending> pending;
    private DaemonSetSpecTemplateMetadataInitializersResult result;

    public DaemonSetSpecTemplateMetadataInitializers() {
        // no-op
    }

    public DaemonSetSpecTemplateMetadataInitializers(final List<DaemonSetSpecTemplateMetadataInitializersPending> pending,
                                                     final DaemonSetSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<DaemonSetSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<DaemonSetSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public DaemonSetSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final DaemonSetSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof DaemonSetSpecTemplateMetadataInitializers)) {
            return false;
        }
        final DaemonSetSpecTemplateMetadataInitializers __otherCasted = (DaemonSetSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
