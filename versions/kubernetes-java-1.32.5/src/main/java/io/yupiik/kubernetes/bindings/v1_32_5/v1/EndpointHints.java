package io.yupiik.kubernetes.bindings.v1_32_5.v1;

import io.yupiik.kubernetes.bindings.v1_32_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_5.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EndpointHints implements Validable<EndpointHints>, Exportable {
    private List<ForZone> forZones;

    public EndpointHints() {
        // no-op
    }

    public EndpointHints(final List<ForZone> forZones) {
        this.forZones = forZones;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (forZones != null ? "\"forZones\":" + forZones.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
