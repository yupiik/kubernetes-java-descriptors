package io.yupiik.kubernetes.bindings.v1_14_3.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateMetadataInitializersPending {
    private String name;

    public CronJobSpecJobTemplateMetadataInitializersPending() {
        // no-op
    }

    public CronJobSpecJobTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateMetadataInitializersPending)) {
            return false;
        }
        final CronJobSpecJobTemplateMetadataInitializersPending __otherCasted = (CronJobSpecJobTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
