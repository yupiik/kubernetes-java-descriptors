package io.yupiik.kubernetes.bindings.v1_20_14.v1;

import io.yupiik.kubernetes.bindings.v1_20_14.Validable;
import io.yupiik.kubernetes.bindings.v1_20_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CSINodeSpec implements Validable<CSINodeSpec> {
    private List<CSINodeDriver> drivers;

    public CSINodeSpec() {
        // no-op
    }

    public CSINodeSpec(final List<CSINodeDriver> drivers) {
        // no-op
    }

    public List<CSINodeDriver> getDrivers() {
        return drivers;
    }

    public void setDrivers(final List<CSINodeDriver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                drivers);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSINodeSpec)) {
            return false;
        }
        final CSINodeSpec __otherCasted = (CSINodeSpec) __other;
        return Objects.equals(drivers, __otherCasted.drivers);
    }

    public CSINodeSpec drivers(final List<CSINodeDriver> drivers) {
        this.drivers = drivers;
        return this;
    }

    @Override
    public CSINodeSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (drivers == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "drivers", "drivers",
                "Missing 'drivers' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
