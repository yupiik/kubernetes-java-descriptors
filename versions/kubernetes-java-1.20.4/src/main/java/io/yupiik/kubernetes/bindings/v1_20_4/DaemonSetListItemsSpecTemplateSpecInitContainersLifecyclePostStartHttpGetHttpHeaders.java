package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders {
    private String name;
    private String value;

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders(final String name,
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGetHttpHeaders) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }
}
