package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplate {
    private ReplicationControllerListItemsSpecTemplateMetadata metadata;
    private ReplicationControllerListItemsSpecTemplateSpec spec;

    public ReplicationControllerListItemsSpecTemplate() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplate(final ReplicationControllerListItemsSpecTemplateMetadata metadata,
                                                      final ReplicationControllerListItemsSpecTemplateSpec spec) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ReplicationControllerListItemsSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public ReplicationControllerListItemsSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final ReplicationControllerListItemsSpecTemplateSpec spec) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplate)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplate __otherCasted = (ReplicationControllerListItemsSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
