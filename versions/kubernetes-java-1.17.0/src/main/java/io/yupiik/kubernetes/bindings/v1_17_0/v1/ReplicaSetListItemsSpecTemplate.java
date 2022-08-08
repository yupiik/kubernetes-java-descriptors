package io.yupiik.kubernetes.bindings.v1_17_0.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplate {
    private ReplicaSetListItemsSpecTemplateMetadata metadata;
    private ReplicaSetListItemsSpecTemplateSpec spec;

    public ReplicaSetListItemsSpecTemplate() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplate(final ReplicaSetListItemsSpecTemplateMetadata metadata,
                                           final ReplicaSetListItemsSpecTemplateSpec spec) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicaSetListItemsSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicaSetListItemsSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicaSetListItemsSpecTemplateSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetListItemsSpecTemplate)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplate __otherCasted = (ReplicaSetListItemsSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
