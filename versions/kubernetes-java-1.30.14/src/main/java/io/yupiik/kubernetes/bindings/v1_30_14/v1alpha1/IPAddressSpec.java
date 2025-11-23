package io.yupiik.kubernetes.bindings.v1_30_14.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_30_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_30_14.Validable;
import io.yupiik.kubernetes.bindings.v1_30_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
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
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (parentRef == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "parentRef", "parentRef",
                "Missing 'parentRef' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
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
