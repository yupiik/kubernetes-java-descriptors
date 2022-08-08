package io.yupiik.kubernetes.bindings.v1_19_15.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
