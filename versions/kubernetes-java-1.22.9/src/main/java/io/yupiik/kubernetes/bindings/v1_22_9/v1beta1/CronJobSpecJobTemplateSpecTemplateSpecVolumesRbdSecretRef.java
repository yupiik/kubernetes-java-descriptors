package io.yupiik.kubernetes.bindings.v1_22_9.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
