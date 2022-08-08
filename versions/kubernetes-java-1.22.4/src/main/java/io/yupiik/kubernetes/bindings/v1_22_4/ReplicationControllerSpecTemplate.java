package io.yupiik.kubernetes.bindings.v1_22_4;

import java.util.Objects;

public class ReplicationControllerSpecTemplate {
    private ReplicationControllerSpecTemplateMetadata metadata;
    private ReplicationControllerSpecTemplateSpec spec;

    public ReplicationControllerSpecTemplate() {
        // no-op
    }

    public ReplicationControllerSpecTemplate(final ReplicationControllerSpecTemplateMetadata metadata,
                                             final ReplicationControllerSpecTemplateSpec spec) {
        // no-op
    }

    public ReplicationControllerSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicationControllerSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicationControllerSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicationControllerSpecTemplateSpec spec) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplate)) {
            return false;
        }
        final ReplicationControllerSpecTemplate __otherCasted = (ReplicationControllerSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
