package io.yupiik.kubernetes.bindings.v1_16_15.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
