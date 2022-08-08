package io.yupiik.kubernetes.bindings.v1_14_3;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersPending {
    private String name;

    public CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersPending __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
