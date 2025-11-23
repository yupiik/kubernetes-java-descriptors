package io.yupiik.kubernetes.bindings.v1_31_1.v1;

import io.yupiik.kubernetes.bindings.v1_31_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerUser implements Validable<ContainerUser>, Exportable {
    private LinuxContainerUser linux;

    public ContainerUser() {
        // no-op
    }

    public ContainerUser(final LinuxContainerUser linux) {
        this.linux = linux;
    }

    public LinuxContainerUser getLinux() {
        return linux;
    }

    public void setLinux(final LinuxContainerUser linux) {
        this.linux = linux;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                linux);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerUser)) {
            return false;
        }
        final ContainerUser __otherCasted = (ContainerUser) __other;
        return Objects.equals(linux, __otherCasted.linux);
    }

    public ContainerUser linux(final LinuxContainerUser linux) {
        this.linux = linux;
        return this;
    }

    @Override
    public ContainerUser validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (linux != null ? "\"linux\":" + linux.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
