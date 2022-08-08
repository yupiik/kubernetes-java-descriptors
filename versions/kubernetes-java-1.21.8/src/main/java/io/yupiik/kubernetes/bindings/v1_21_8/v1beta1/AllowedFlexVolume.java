package io.yupiik.kubernetes.bindings.v1_21_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_8.Validable;
import io.yupiik.kubernetes.bindings.v1_21_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AllowedFlexVolume implements Validable<AllowedFlexVolume> {
    private String driver;

    public AllowedFlexVolume() {
        // no-op
    }

    public AllowedFlexVolume(final String driver) {
        // no-op
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                driver);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AllowedFlexVolume)) {
            return false;
        }
        final AllowedFlexVolume __otherCasted = (AllowedFlexVolume) __other;
        return Objects.equals(driver, __otherCasted.driver);
    }

    public AllowedFlexVolume driver(final String driver) {
        this.driver = driver;
        return this;
    }

    @Override
    public AllowedFlexVolume validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
