package io.yupiik.kubernetes.bindings.v1_21_0;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public JobSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (JobSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
