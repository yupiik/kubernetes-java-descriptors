package io.yupiik.kubernetes.bindings.v1_15_4;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public StatefulSetSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (StatefulSetSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
