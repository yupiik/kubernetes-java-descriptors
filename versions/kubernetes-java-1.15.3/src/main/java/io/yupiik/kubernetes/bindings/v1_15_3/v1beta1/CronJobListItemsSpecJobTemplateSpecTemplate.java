package io.yupiik.kubernetes.bindings.v1_15_3.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplate {
    private CronJobListItemsSpecJobTemplateSpecTemplateMetadata metadata;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpec spec;

    public CronJobListItemsSpecJobTemplateSpecTemplate() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplate(final CronJobListItemsSpecJobTemplateSpecTemplateMetadata metadata,
                                                       final CronJobListItemsSpecJobTemplateSpecTemplateSpec spec) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CronJobListItemsSpecJobTemplateSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final CronJobListItemsSpecJobTemplateSpecTemplateSpec spec) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplate)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplate __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
