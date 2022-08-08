package io.yupiik.kubernetes.bindings.v1_20_8.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersSecurityContextCapabilities {
    private List<String> add;
    private List<String> drop;

    public PodTemplateTemplateSpecInitContainersSecurityContextCapabilities() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersSecurityContextCapabilities(final List<String> add,
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersSecurityContextCapabilities)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersSecurityContextCapabilities __otherCasted = (PodTemplateTemplateSpecInitContainersSecurityContextCapabilities) __other;
        return Objects.equals(add, __otherCasted.add) &&
            Objects.equals(drop, __otherCasted.drop);
    }
}
