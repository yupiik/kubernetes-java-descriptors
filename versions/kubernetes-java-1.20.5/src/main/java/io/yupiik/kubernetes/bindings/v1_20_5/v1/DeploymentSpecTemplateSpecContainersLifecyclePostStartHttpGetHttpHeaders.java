package io.yupiik.kubernetes.bindings.v1_20_5.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders {
    private String name;
    private String value;

    public DeploymentSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders(final String name,
                                                                                    final String value) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders __otherCasted = (DeploymentSpecTemplateSpecContainersLifecyclePostStartHttpGetHttpHeaders) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }
}
