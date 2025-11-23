package io.yupiik.kubernetes.bindings.v1_28_3.v1;

import io.yupiik.kubernetes.bindings.v1_28_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_3.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StatefulSetOrdinals implements Validable<StatefulSetOrdinals>, Exportable {
    private Integer start;

    public StatefulSetOrdinals() {
        // no-op
    }

    public StatefulSetOrdinals(final Integer start) {
        this.start = start;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(final Integer start) {
        this.start = start;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                start);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetOrdinals)) {
            return false;
        }
        final StatefulSetOrdinals __otherCasted = (StatefulSetOrdinals) __other;
        return Objects.equals(start, __otherCasted.start);
    }

    public StatefulSetOrdinals start(final Integer start) {
        this.start = start;
        return this;
    }

    @Override
    public StatefulSetOrdinals validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (start != null ? "\"start\":" + start : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
