package io.yupiik.kubernetes.bindings.v1_17_8;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
