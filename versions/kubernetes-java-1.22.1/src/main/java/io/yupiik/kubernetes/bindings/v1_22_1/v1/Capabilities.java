package io.yupiik.kubernetes.bindings.v1_22_1.v1;

import io.yupiik.kubernetes.bindings.v1_22_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_1.Validable;
import io.yupiik.kubernetes.bindings.v1_22_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Capabilities implements Validable<Capabilities>, Exportable {
    private List<String> add;
    private List<String> drop;

    public Capabilities() {
        // no-op
    }

    public Capabilities(final List<String> add,
                        final List<String> drop) {
        // no-op
    }

    public List<String> getAdd() {
        return add;
    }

    public void setAdd(final List<String> add) {
        this.add = add;
    }

    public List<String> getDrop() {
        return drop;
    }

    public void setDrop(final List<String> drop) {
        this.drop = drop;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                add,
                drop);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Capabilities)) {
            return false;
        }
        final Capabilities __otherCasted = (Capabilities) __other;
        return Objects.equals(add, __otherCasted.add) &&
            Objects.equals(drop, __otherCasted.drop);
    }

    public Capabilities add(final List<String> add) {
        this.add = add;
        return this;
    }

    public Capabilities drop(final List<String> drop) {
        this.drop = drop;
        return this;
    }

    @Override
    public Capabilities validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (add != null ? "\"add\":" + add.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (drop != null ? "\"drop\":" + drop.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
