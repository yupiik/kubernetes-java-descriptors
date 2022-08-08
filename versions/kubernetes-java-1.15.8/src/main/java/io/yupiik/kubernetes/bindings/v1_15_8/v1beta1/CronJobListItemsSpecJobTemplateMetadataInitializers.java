package io.yupiik.kubernetes.bindings.v1_15_8.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateMetadataInitializers {
    private List<CronJobListItemsSpecJobTemplateMetadataInitializersPending> pending;
    private CronJobListItemsSpecJobTemplateMetadataInitializersResult result;

    public CronJobListItemsSpecJobTemplateMetadataInitializers() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateMetadataInitializers(final List<CronJobListItemsSpecJobTemplateMetadataInitializersPending> pending,
                                                               final CronJobListItemsSpecJobTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<CronJobListItemsSpecJobTemplateMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CronJobListItemsSpecJobTemplateMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public CronJobListItemsSpecJobTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CronJobListItemsSpecJobTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateMetadataInitializers)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateMetadataInitializers __otherCasted = (CronJobListItemsSpecJobTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
