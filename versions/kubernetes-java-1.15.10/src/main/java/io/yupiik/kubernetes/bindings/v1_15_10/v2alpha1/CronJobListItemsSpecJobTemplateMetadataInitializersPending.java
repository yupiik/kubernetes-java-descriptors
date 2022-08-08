package io.yupiik.kubernetes.bindings.v1_15_10.v2alpha1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateMetadataInitializersPending {
    private String name;

    public CronJobListItemsSpecJobTemplateMetadataInitializersPending() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateMetadataInitializersPending)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateMetadataInitializersPending __otherCasted = (CronJobListItemsSpecJobTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
