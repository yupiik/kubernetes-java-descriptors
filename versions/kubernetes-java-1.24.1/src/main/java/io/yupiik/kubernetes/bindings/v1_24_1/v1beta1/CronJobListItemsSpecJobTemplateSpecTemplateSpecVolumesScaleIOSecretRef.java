package io.yupiik.kubernetes.bindings.v1_24_1.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
