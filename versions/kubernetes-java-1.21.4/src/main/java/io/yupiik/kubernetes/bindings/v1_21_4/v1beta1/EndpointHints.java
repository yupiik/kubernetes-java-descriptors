package io.yupiik.kubernetes.bindings.v1_21_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_4.Validable;
import io.yupiik.kubernetes.bindings.v1_21_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EndpointHints implements Validable<EndpointHints> {
    private List<ForZone> forZones;

    public EndpointHints() {
        // no-op
    }

    public EndpointHints(final List<ForZone> forZones) {
        // no-op
    }

    public List<ForZone> getForZones() {
        return forZones;
    }

    public void setForZones(final List<ForZone> forZones) {
        this.forZones = forZones;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                forZones);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointHints)) {
            return false;
        }
        final EndpointHints __otherCasted = (EndpointHints) __other;
        return Objects.equals(forZones, __otherCasted.forZones);
    }

    public EndpointHints forZones(final List<ForZone> forZones) {
        this.forZones = forZones;
        return this;
    }

    @Override
    public EndpointHints validate() {
        return this;
    }
}
