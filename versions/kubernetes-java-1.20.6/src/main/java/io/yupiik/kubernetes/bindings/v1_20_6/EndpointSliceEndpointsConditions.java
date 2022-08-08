package io.yupiik.kubernetes.bindings.v1_20_6;

import java.util.Objects;

public class EndpointSliceEndpointsConditions {
    private Boolean ready;
    private Boolean serving;
    private Boolean terminating;

    public EndpointSliceEndpointsConditions() {
        // no-op
    }

    public EndpointSliceEndpointsConditions(final Boolean ready,
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
        if (!(__other instanceof EndpointSliceEndpointsConditions)) {
            return false;
        }
        final EndpointSliceEndpointsConditions __otherCasted = (EndpointSliceEndpointsConditions) __other;
        return Objects.equals(ready, __otherCasted.ready) &&
            Objects.equals(serving, __otherCasted.serving) &&
            Objects.equals(terminating, __otherCasted.terminating);
    }
}
