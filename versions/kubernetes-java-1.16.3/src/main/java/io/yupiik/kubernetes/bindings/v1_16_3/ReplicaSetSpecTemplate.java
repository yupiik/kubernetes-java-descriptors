package io.yupiik.kubernetes.bindings.v1_16_3;

import java.util.Objects;

public class ReplicaSetSpecTemplate {
    private ReplicaSetSpecTemplateMetadata metadata;
    private ReplicaSetSpecTemplateSpec spec;

    public ReplicaSetSpecTemplate() {
        // no-op
    }

    public ReplicaSetSpecTemplate(final ReplicaSetSpecTemplateMetadata metadata,
                                  final ReplicaSetSpecTemplateSpec spec) {
        // no-op
    }

    public ReplicaSetSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicaSetSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicaSetSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicaSetSpecTemplateSpec spec) {
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
        if (!(__other instanceof ReplicaSetSpecTemplate)) {
            return false;
        }
        final ReplicaSetSpecTemplate __otherCasted = (ReplicaSetSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
