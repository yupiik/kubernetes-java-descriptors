package io.yupiik.kubernetes.bindings.v1_14_7.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public JobSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (JobSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
