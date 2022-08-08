package io.yupiik.kubernetes.bindings.v1_14_7.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsMetadataInitializers {
    private List<CronJobListItemsMetadataInitializersPending> pending;
    private CronJobListItemsMetadataInitializersResult result;

    public CronJobListItemsMetadataInitializers() {
        // no-op
    }

    public CronJobListItemsMetadataInitializers(final List<CronJobListItemsMetadataInitializersPending> pending,
                                                final CronJobListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<CronJobListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CronJobListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public CronJobListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CronJobListItemsMetadataInitializersResult result) {
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
        if (!(__other instanceof CronJobListItemsMetadataInitializers)) {
            return false;
        }
        final CronJobListItemsMetadataInitializers __otherCasted = (CronJobListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
