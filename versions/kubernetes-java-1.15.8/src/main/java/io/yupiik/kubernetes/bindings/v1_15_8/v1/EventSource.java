package io.yupiik.kubernetes.bindings.v1_15_8.v1;

import io.yupiik.kubernetes.bindings.v1_15_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_15_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_15_8.Validable;
import io.yupiik.kubernetes.bindings.v1_15_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EventSource implements Validable<EventSource>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (component != null ? "\"component\":\"" +  JsonStrings.escapeJson(component) + "\"" : ""),
                    (host != null ? "\"host\":\"" +  JsonStrings.escapeJson(host) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
