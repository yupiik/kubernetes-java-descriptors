package io.yupiik.kubernetes.bindings.v1_18_0.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
