package io.yupiik.kubernetes.bindings.v1_18_11.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextCapabilities {
    private List<String> add;
    private List<String> drop;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextCapabilities() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextCapabilities(final List<String> add,
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextCapabilities)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextCapabilities __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersSecurityContextCapabilities) __other;
        return Objects.equals(add, __otherCasted.add) &&
            Objects.equals(drop, __otherCasted.drop);
    }
}
