package io.yupiik.kubernetes.bindings.v1_21_8;

import java.util.List;
import java.util.Objects;

public class EphemeralContainersEphemeralContainersSecurityContextCapabilities {
    private List<String> add;
    private List<String> drop;

    public EphemeralContainersEphemeralContainersSecurityContextCapabilities() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersSecurityContextCapabilities(final List<String> add,
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersSecurityContextCapabilities)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersSecurityContextCapabilities __otherCasted = (EphemeralContainersEphemeralContainersSecurityContextCapabilities) __other;
        return Objects.equals(add, __otherCasted.add) &&
            Objects.equals(drop, __otherCasted.drop);
    }
}
