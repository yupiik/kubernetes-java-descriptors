package io.yupiik.kubernetes.bindings.v1_17_11;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
