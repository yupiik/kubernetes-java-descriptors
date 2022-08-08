package io.yupiik.kubernetes.bindings.v1_15_11;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public StatefulSetSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (StatefulSetSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
