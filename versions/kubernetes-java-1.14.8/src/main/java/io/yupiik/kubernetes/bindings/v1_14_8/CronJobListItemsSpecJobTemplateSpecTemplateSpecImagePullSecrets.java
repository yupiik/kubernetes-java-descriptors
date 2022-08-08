package io.yupiik.kubernetes.bindings.v1_14_8;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecImagePullSecrets {
    private String name;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecImagePullSecrets __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
