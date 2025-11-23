package io.yupiik.kubernetes.bindings.v1_22_8.v1;

import io.yupiik.kubernetes.bindings.v1_22_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_8.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeNodeResources implements Validable<VolumeNodeResources>, Exportable {
    private Integer count;

    public VolumeNodeResources() {
        // no-op
    }

    public VolumeNodeResources(final Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                count);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeNodeResources)) {
            return false;
        }
        final VolumeNodeResources __otherCasted = (VolumeNodeResources) __other;
        return Objects.equals(count, __otherCasted.count);
    }

    public VolumeNodeResources count(final Integer count) {
        this.count = count;
        return this;
    }

    @Override
    public VolumeNodeResources validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (count != null ? "\"count\":" + count : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
