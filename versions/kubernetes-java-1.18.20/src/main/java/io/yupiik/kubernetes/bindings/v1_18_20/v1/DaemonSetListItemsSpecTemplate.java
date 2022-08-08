package io.yupiik.kubernetes.bindings.v1_18_20.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplate {
    private DaemonSetListItemsSpecTemplateMetadata metadata;
    private DaemonSetListItemsSpecTemplateSpec spec;

    public DaemonSetListItemsSpecTemplate() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplate(final DaemonSetListItemsSpecTemplateMetadata metadata,
                                          final DaemonSetListItemsSpecTemplateSpec spec) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DaemonSetListItemsSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public DaemonSetListItemsSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final DaemonSetListItemsSpecTemplateSpec spec) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplate)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplate __otherCasted = (DaemonSetListItemsSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
