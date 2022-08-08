package io.yupiik.kubernetes.bindings.v1_21_9;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
