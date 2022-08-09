package io.yupiik.kubernetes.bindings.v1_19_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_5.Validable;
import io.yupiik.kubernetes.bindings.v1_19_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EndpointConditions implements Validable<EndpointConditions>, Exportable {
    private Boolean ready;

    public EndpointConditions() {
        // no-op
    }

    public EndpointConditions(final Boolean ready) {
        // no-op
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(final Boolean ready) {
        this.ready = ready;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ready);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointConditions)) {
            return false;
        }
        final EndpointConditions __otherCasted = (EndpointConditions) __other;
        return Objects.equals(ready, __otherCasted.ready);
    }

    public EndpointConditions ready(final Boolean ready) {
        this.ready = ready;
        return this;
    }

    @Override
    public EndpointConditions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ready != null ? "\"ready\":" + ready : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
