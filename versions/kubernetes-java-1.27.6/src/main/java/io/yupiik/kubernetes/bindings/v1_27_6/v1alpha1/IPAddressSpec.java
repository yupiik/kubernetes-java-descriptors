package io.yupiik.kubernetes.bindings.v1_27_6.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_27_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IPAddressSpec implements Validable<IPAddressSpec>, Exportable {
    private ParentReference parentRef;

    public IPAddressSpec() {
        // no-op
    }

    public IPAddressSpec(final ParentReference parentRef) {
        this.parentRef = parentRef;
    }

    public ParentReference getParentRef() {
        return parentRef;
    }

    public void setParentRef(final ParentReference parentRef) {
        this.parentRef = parentRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                parentRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IPAddressSpec)) {
            return false;
        }
        final IPAddressSpec __otherCasted = (IPAddressSpec) __other;
        return Objects.equals(parentRef, __otherCasted.parentRef);
    }

    public IPAddressSpec parentRef(final ParentReference parentRef) {
        this.parentRef = parentRef;
        return this;
    }

    @Override
    public IPAddressSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (parentRef != null ? "\"parentRef\":" + parentRef.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
