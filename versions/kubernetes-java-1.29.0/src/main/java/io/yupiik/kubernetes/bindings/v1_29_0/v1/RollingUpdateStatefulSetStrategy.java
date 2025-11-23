package io.yupiik.kubernetes.bindings.v1_29_0.v1;

import io.yupiik.kubernetes.bindings.v1_29_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_0.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RollingUpdateStatefulSetStrategy implements Validable<RollingUpdateStatefulSetStrategy>, Exportable {
    private String maxUnavailable;
    private Integer partition;

    public RollingUpdateStatefulSetStrategy() {
        // no-op
    }

    public RollingUpdateStatefulSetStrategy(final String maxUnavailable,
                                            final Integer partition) {
        this.maxUnavailable = maxUnavailable;
        this.partition = partition;
    }

    public String getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    public Integer getPartition() {
        return partition;
    }

    public void setPartition(final Integer partition) {
        this.partition = partition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxUnavailable,
                partition);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RollingUpdateStatefulSetStrategy)) {
            return false;
        }
        final RollingUpdateStatefulSetStrategy __otherCasted = (RollingUpdateStatefulSetStrategy) __other;
        return Objects.equals(maxUnavailable, __otherCasted.maxUnavailable) &&
            Objects.equals(partition, __otherCasted.partition);
    }

    public RollingUpdateStatefulSetStrategy maxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    public RollingUpdateStatefulSetStrategy partition(final Integer partition) {
        this.partition = partition;
        return this;
    }

    @Override
    public RollingUpdateStatefulSetStrategy validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (maxUnavailable != null ? "\"maxUnavailable\":\"" +  JsonStrings.escapeJson(maxUnavailable) + "\"" : ""),
                    (partition != null ? "\"partition\":" + partition : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
