package io.yupiik.kubernetes.bindings.v1_18_16.v1beta1;

import io.yupiik.kubernetes.bindings.v1_18_16.Validable;
import io.yupiik.kubernetes.bindings.v1_18_16.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EventSource implements Validable<EventSource> {
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

    public EventSource component(final String component) {
        this.component = component;
        return this;
    }

    public EventSource host(final String host) {
        this.host = host;
        return this;
    }

    @Override
    public EventSource validate() {
        return this;
    }
}
