package io.yupiik.kubernetes.bindings.v1_11_6.v1;

import java.util.Objects;

public class EventSource {
    private String component;
    private String host;

    public EventSource() {
        // no-op
    }

    public EventSource(final String component,
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
        if (!(__other instanceof EventSource)) {
            return false;
        }
        final EventSource __otherCasted = (EventSource) __other;
        return Objects.equals(component, __otherCasted.component) &&
            Objects.equals(host, __otherCasted.host);
    }
}
