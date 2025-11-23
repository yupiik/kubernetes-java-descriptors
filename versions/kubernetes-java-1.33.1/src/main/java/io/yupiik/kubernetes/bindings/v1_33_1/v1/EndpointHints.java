package io.yupiik.kubernetes.bindings.v1_33_1.v1;

import io.yupiik.kubernetes.bindings.v1_33_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_1.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EndpointHints implements Validable<EndpointHints>, Exportable {
    private List<ForNode> forNodes;
    private List<ForZone> forZones;

    public EndpointHints() {
        // no-op
    }

    public EndpointHints(final List<ForNode> forNodes,
                         final List<ForZone> forZones) {
        this.forNodes = forNodes;
        this.forZones = forZones;
    }

    public List<ForNode> getForNodes() {
        return forNodes;
    }

    public void setForNodes(final List<ForNode> forNodes) {
        this.forNodes = forNodes;
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
                forNodes,
                forZones);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointHints)) {
            return false;
        }
        final EndpointHints __otherCasted = (EndpointHints) __other;
        return Objects.equals(forNodes, __otherCasted.forNodes) &&
            Objects.equals(forZones, __otherCasted.forZones);
    }

    public EndpointHints forNodes(final List<ForNode> forNodes) {
        this.forNodes = forNodes;
        return this;
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
                    (forNodes != null ? "\"forNodes\":" + forNodes.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (forZones != null ? "\"forZones\":" + forZones.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
