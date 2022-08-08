package io.yupiik.kubernetes.bindings.v1_15_1.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecContainersSecurityContextCapabilities {
    private List<String> add;
    private List<String> drop;

    public JobSpecTemplateSpecContainersSecurityContextCapabilities() {
        // no-op
    }

    public JobSpecTemplateSpecContainersSecurityContextCapabilities(final List<String> add,
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
        if (!(__other instanceof JobSpecTemplateSpecContainersSecurityContextCapabilities)) {
            return false;
        }
        final JobSpecTemplateSpecContainersSecurityContextCapabilities __otherCasted = (JobSpecTemplateSpecContainersSecurityContextCapabilities) __other;
        return Objects.equals(add, __otherCasted.add) &&
            Objects.equals(drop, __otherCasted.drop);
    }
}
