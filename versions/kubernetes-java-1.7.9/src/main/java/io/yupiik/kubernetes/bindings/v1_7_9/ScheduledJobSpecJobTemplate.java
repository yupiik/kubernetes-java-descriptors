package io.yupiik.kubernetes.bindings.v1_7_9;

import java.util.Objects;

public class ScheduledJobSpecJobTemplate {
    private ScheduledJobSpecJobTemplateMetadata metadata;
    private ScheduledJobSpecJobTemplateSpec spec;

    public ScheduledJobSpecJobTemplate() {
        // no-op
    }

    public ScheduledJobSpecJobTemplate(final ScheduledJobSpecJobTemplateMetadata metadata,
                                       final ScheduledJobSpecJobTemplateSpec spec) {
        // no-op
    }

    public ScheduledJobSpecJobTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ScheduledJobSpecJobTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public ScheduledJobSpecJobTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final ScheduledJobSpecJobTemplateSpec spec) {
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
        if (!(__other instanceof ScheduledJobSpecJobTemplate)) {
            return false;
        }
        final ScheduledJobSpecJobTemplate __otherCasted = (ScheduledJobSpecJobTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
