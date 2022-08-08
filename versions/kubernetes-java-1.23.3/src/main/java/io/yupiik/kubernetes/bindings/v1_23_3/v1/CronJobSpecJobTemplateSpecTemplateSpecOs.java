package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecOs {
    private String name;

    public CronJobSpecJobTemplateSpecTemplateSpecOs() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecOs)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecOs __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
