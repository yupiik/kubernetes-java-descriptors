package io.yupiik.kubernetes.bindings.v1_22_5.v1;

import io.yupiik.kubernetes.bindings.v1_22_5.Validable;
import io.yupiik.kubernetes.bindings.v1_22_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContainerImage implements Validable<ContainerImage> {
    private List<String> names;
    private Integer sizeBytes;

    public ContainerImage() {
        // no-op
    }

    public ContainerImage(final List<String> names,
                          final Integer sizeBytes) {
        // no-op
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(final List<String> names) {
        this.names = names;
    }

    public Integer getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(final Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                names,
                sizeBytes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerImage)) {
            return false;
        }
        final ContainerImage __otherCasted = (ContainerImage) __other;
        return Objects.equals(names, __otherCasted.names) &&
            Objects.equals(sizeBytes, __otherCasted.sizeBytes);
    }

    public ContainerImage names(final List<String> names) {
        this.names = names;
        return this;
    }

    public ContainerImage sizeBytes(final Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

    @Override
    public ContainerImage validate() {
        return this;
    }
}
