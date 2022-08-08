package io.yupiik.kubernetes.bindings.v1_23_6;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public DaemonSetSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (DaemonSetSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
