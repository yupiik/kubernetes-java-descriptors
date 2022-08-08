package io.yupiik.kubernetes.bindings.v1_14_4;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateMetadataInitializers {
    private List<StatefulSetSpecTemplateMetadataInitializersPending> pending;
    private StatefulSetSpecTemplateMetadataInitializersResult result;

    public StatefulSetSpecTemplateMetadataInitializers() {
        // no-op
    }

    public StatefulSetSpecTemplateMetadataInitializers(final List<StatefulSetSpecTemplateMetadataInitializersPending> pending,
                                                       final StatefulSetSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<StatefulSetSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<StatefulSetSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public StatefulSetSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final StatefulSetSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof StatefulSetSpecTemplateMetadataInitializers)) {
            return false;
        }
        final StatefulSetSpecTemplateMetadataInitializers __otherCasted = (StatefulSetSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
