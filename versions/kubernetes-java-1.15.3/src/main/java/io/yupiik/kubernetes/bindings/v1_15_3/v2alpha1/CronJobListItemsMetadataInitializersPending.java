package io.yupiik.kubernetes.bindings.v1_15_3.v2alpha1;

import java.util.Objects;

public class CronJobListItemsMetadataInitializersPending {
    private String name;

    public CronJobListItemsMetadataInitializersPending() {
        // no-op
    }

    public CronJobListItemsMetadataInitializersPending(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsMetadataInitializersPending)) {
            return false;
        }
        final CronJobListItemsMetadataInitializersPending __otherCasted = (CronJobListItemsMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
