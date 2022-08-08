package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecOs {
    private String name;

    public JobListItemsSpecTemplateSpecOs() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecOs)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecOs __otherCasted = (JobListItemsSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
