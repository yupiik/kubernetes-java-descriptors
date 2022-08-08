package io.yupiik.kubernetes.bindings.v1_23_9.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecImagePullSecrets {
    private String name;

    public CronJobSpecJobTemplateSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecImagePullSecrets __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
