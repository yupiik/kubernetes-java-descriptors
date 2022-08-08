package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.Objects;

public class DaemonSetSpecTemplate {
    private DaemonSetSpecTemplateMetadata metadata;
    private DaemonSetSpecTemplateSpec spec;

    public DaemonSetSpecTemplate() {
        // no-op
    }

    public DaemonSetSpecTemplate(final DaemonSetSpecTemplateMetadata metadata,
                                 final DaemonSetSpecTemplateSpec spec) {
        // no-op
    }

    public DaemonSetSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DaemonSetSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public DaemonSetSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final DaemonSetSpecTemplateSpec spec) {
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
        if (!(__other instanceof DaemonSetSpecTemplate)) {
            return false;
        }
        final DaemonSetSpecTemplate __otherCasted = (DaemonSetSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
