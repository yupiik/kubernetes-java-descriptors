package io.yupiik.kubernetes.bindings.v1_16_2.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecImagePullSecrets {
    private String name;

    public DaemonSetSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecImagePullSecrets __otherCasted = (DaemonSetSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
