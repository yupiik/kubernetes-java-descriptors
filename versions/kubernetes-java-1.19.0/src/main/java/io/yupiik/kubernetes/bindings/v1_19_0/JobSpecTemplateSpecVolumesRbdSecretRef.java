package io.yupiik.kubernetes.bindings.v1_19_0;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public JobSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (JobSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
