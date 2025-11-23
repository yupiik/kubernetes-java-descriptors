package io.yupiik.kubernetes.bindings.v1_33_2.v1;

import io.yupiik.kubernetes.bindings.v1_33_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeSwapStatus implements Validable<NodeSwapStatus>, Exportable {
    private Integer capacity;

    public NodeSwapStatus() {
        // no-op
    }

    public NodeSwapStatus(final Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(final Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                capacity);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSwapStatus)) {
            return false;
        }
        final NodeSwapStatus __otherCasted = (NodeSwapStatus) __other;
        return Objects.equals(capacity, __otherCasted.capacity);
    }

    public NodeSwapStatus capacity(final Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    @Override
    public NodeSwapStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (capacity != null ? "\"capacity\":" + capacity : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
