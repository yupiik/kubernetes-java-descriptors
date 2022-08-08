package io.yupiik.kubernetes.bindings.v1_16_7;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecContainersSecurityContextCapabilities {
    private List<String> add;
    private List<String> drop;

    public PodListItemsSpecContainersSecurityContextCapabilities() {
        // no-op
    }

    public PodListItemsSpecContainersSecurityContextCapabilities(final List<String> add,
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
        if (!(__other instanceof PodListItemsSpecContainersSecurityContextCapabilities)) {
            return false;
        }
        final PodListItemsSpecContainersSecurityContextCapabilities __otherCasted = (PodListItemsSpecContainersSecurityContextCapabilities) __other;
        return Objects.equals(add, __otherCasted.add) &&
            Objects.equals(drop, __otherCasted.drop);
    }
}
