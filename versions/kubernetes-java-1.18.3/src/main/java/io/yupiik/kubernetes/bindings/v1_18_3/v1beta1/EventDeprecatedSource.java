package io.yupiik.kubernetes.bindings.v1_18_3.v1beta1;

import java.util.Objects;

public class EventDeprecatedSource {
    private String component;
    private String host;

    public EventDeprecatedSource() {
        // no-op
    }

    public EventDeprecatedSource(final String component,
                                 final String host) {
        // no-op
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(final String component) {
        this.component = component;
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                component,
                host);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EventDeprecatedSource)) {
            return false;
        }
        final EventDeprecatedSource __otherCasted = (EventDeprecatedSource) __other;
        return Objects.equals(component, __otherCasted.component) &&
            Objects.equals(host, __otherCasted.host);
    }
}
