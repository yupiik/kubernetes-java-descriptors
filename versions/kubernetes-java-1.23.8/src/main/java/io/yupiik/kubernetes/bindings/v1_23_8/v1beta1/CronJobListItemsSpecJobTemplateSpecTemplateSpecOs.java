package io.yupiik.kubernetes.bindings.v1_23_8.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecOs {
    private String name;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecOs() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecOs)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecOs __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
