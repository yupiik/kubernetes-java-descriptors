package io.yupiik.kubernetes.bindings.v1_23_5;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public JobSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (JobSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
