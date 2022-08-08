package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateMetadataInitializersPending {
    private String name;

    public CronJobSpecJobTemplateSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateMetadataInitializersPending __otherCasted = (CronJobSpecJobTemplateSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
