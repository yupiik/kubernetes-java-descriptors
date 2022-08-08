package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersStartupProbeHttpGetHttpHeaders {
    private String name;
    private String value;

    public StatefulSetListItemsSpecTemplateSpecContainersStartupProbeHttpGetHttpHeaders() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersStartupProbeHttpGetHttpHeaders(final String name,
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersStartupProbeHttpGetHttpHeaders)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersStartupProbeHttpGetHttpHeaders __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersStartupProbeHttpGetHttpHeaders) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }
}
