package io.yupiik.kubernetes.bindings.v1_14_4.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateMetadataInitializers {
    private List<StatefulSetListItemsSpecTemplateMetadataInitializersPending> pending;
    private StatefulSetListItemsSpecTemplateMetadataInitializersResult result;

    public StatefulSetListItemsSpecTemplateMetadataInitializers() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateMetadataInitializers(final List<StatefulSetListItemsSpecTemplateMetadataInitializersPending> pending,
                                                                final StatefulSetListItemsSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<StatefulSetListItemsSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<StatefulSetListItemsSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public StatefulSetListItemsSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final StatefulSetListItemsSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateMetadataInitializers)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateMetadataInitializers __otherCasted = (StatefulSetListItemsSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
