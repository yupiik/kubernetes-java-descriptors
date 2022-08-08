package io.yupiik.kubernetes.bindings.v1_17_16.v1beta2;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecImagePullSecrets {
    private String name;

    public StatefulSetSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecImagePullSecrets __otherCasted = (StatefulSetSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
