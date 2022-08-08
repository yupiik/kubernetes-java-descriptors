package io.yupiik.kubernetes.bindings.v1_14_1.v2alpha1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializers {
    private List<CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersPending> pending;
    private CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersResult result;

    public CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializers() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializers(final List<CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersPending> pending,
                                                                           final CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializers)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializers __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
