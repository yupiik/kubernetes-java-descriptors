package io.yupiik.kubernetes.bindings.v1_12_9.v1;

import io.yupiik.kubernetes.bindings.v1_12_9.Validable;
import io.yupiik.kubernetes.bindings.v1_12_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RawExtension implements Validable<RawExtension> {
    private String Raw;

    public RawExtension() {
        // no-op
    }

    public RawExtension(final String Raw) {
        // no-op
    }

    public String getRaw() {
        return Raw;
    }

    public void setRaw(final String Raw) {
        this.Raw = Raw;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                Raw);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RawExtension)) {
            return false;
        }
        final RawExtension __otherCasted = (RawExtension) __other;
        return Objects.equals(Raw, __otherCasted.Raw);
    }

    public RawExtension Raw(final String Raw) {
        this.Raw = Raw;
        return this;
    }

    @Override
    public RawExtension validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (Raw == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "Raw", "Raw",
                "Missing 'Raw' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
