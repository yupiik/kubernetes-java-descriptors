package io.yupiik.kubernetes.bindings.v1_11_7.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_11_7.Validable;
import io.yupiik.kubernetes.bindings.v1_11_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Capabilities implements Validable<Capabilities> {
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
}
