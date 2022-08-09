package io.yupiik.kubernetes.bindings.v1_22_5.v1;

import io.yupiik.kubernetes.bindings.v1_22_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_5.Validable;
import io.yupiik.kubernetes.bindings.v1_22_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EndpointConditions implements Validable<EndpointConditions>, Exportable {
    private Boolean ready;
    private Boolean serving;
    private Boolean terminating;

    public EndpointConditions() {
        // no-op
    }

    public EndpointConditions(final Boolean ready,
                              final Boolean serving,
                              final Boolean terminating) {
        // no-op
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(final Boolean ready) {
        this.ready = ready;
    }

    public Boolean getServing() {
        return serving;
    }

    public void setServing(final Boolean serving) {
        this.serving = serving;
    }

    public Boolean getTerminating() {
        return terminating;
    }

    public void setTerminating(final Boolean terminating) {
        this.terminating = terminating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ready,
                serving,
                terminating);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointConditions)) {
            return false;
        }
        final EndpointConditions __otherCasted = (EndpointConditions) __other;
        return Objects.equals(ready, __otherCasted.ready) &&
            Objects.equals(serving, __otherCasted.serving) &&
            Objects.equals(terminating, __otherCasted.terminating);
    }

    public EndpointConditions ready(final Boolean ready) {
        this.ready = ready;
        return this;
    }

    public EndpointConditions serving(final Boolean serving) {
        this.serving = serving;
        return this;
    }

    public EndpointConditions terminating(final Boolean terminating) {
        this.terminating = terminating;
        return this;
    }

    @Override
    public EndpointConditions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ready != null ? "\"ready\":" + ready : ""),
                    (serving != null ? "\"serving\":" + serving : ""),
                    (terminating != null ? "\"terminating\":" + terminating : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
