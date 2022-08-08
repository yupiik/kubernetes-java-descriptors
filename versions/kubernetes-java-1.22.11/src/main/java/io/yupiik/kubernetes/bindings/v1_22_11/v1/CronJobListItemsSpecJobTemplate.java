package io.yupiik.kubernetes.bindings.v1_22_11.v1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplate {
    private CronJobListItemsSpecJobTemplateMetadata metadata;
    private CronJobListItemsSpecJobTemplateSpec spec;

    public CronJobListItemsSpecJobTemplate() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplate(final CronJobListItemsSpecJobTemplateMetadata metadata,
                                           final CronJobListItemsSpecJobTemplateSpec spec) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CronJobListItemsSpecJobTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public CronJobListItemsSpecJobTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final CronJobListItemsSpecJobTemplateSpec spec) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplate)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplate __otherCasted = (CronJobListItemsSpecJobTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
