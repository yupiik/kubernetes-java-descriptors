package io.yupiik.kubernetes.bindings.v1_17_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_1.Validable;
import io.yupiik.kubernetes.bindings.v1_17_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EndpointConditions implements Validable<EndpointConditions> {
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
}
