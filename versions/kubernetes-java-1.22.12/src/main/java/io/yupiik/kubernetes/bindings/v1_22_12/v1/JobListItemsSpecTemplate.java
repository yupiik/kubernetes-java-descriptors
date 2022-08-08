package io.yupiik.kubernetes.bindings.v1_22_12.v1;

import java.util.Objects;

public class JobListItemsSpecTemplate {
    private JobListItemsSpecTemplateMetadata metadata;
    private JobListItemsSpecTemplateSpec spec;

    public JobListItemsSpecTemplate() {
        // no-op
    }

    public JobListItemsSpecTemplate(final JobListItemsSpecTemplateMetadata metadata,
                                    final JobListItemsSpecTemplateSpec spec) {
        // no-op
    }

    public JobListItemsSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final JobListItemsSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public JobListItemsSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final JobListItemsSpecTemplateSpec spec) {
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
        if (!(__other instanceof JobListItemsSpecTemplate)) {
            return false;
        }
        final JobListItemsSpecTemplate __otherCasted = (JobListItemsSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
