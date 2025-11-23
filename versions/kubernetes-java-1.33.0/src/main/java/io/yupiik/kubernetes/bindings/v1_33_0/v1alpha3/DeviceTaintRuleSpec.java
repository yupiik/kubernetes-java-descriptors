package io.yupiik.kubernetes.bindings.v1_33_0.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import io.yupiik.kubernetes.bindings.v1_33_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceTaintRuleSpec implements Validable<DeviceTaintRuleSpec>, Exportable {
    private DeviceTaintSelector deviceSelector;
    private DeviceTaint taint;

    public DeviceTaintRuleSpec() {
        // no-op
    }

    public DeviceTaintRuleSpec(final DeviceTaintSelector deviceSelector,
                               final DeviceTaint taint) {
        this.deviceSelector = deviceSelector;
        this.taint = taint;
    }

    public DeviceTaintSelector getDeviceSelector() {
        return deviceSelector;
    }

    public void setDeviceSelector(final DeviceTaintSelector deviceSelector) {
        this.deviceSelector = deviceSelector;
    }

    public DeviceTaint getTaint() {
        return taint;
    }

    public void setTaint(final DeviceTaint taint) {
        this.taint = taint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                deviceSelector,
                taint);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceTaintRuleSpec)) {
            return false;
        }
        final DeviceTaintRuleSpec __otherCasted = (DeviceTaintRuleSpec) __other;
        return Objects.equals(deviceSelector, __otherCasted.deviceSelector) &&
            Objects.equals(taint, __otherCasted.taint);
    }

    public DeviceTaintRuleSpec deviceSelector(final DeviceTaintSelector deviceSelector) {
        this.deviceSelector = deviceSelector;
        return this;
    }

    public DeviceTaintRuleSpec taint(final DeviceTaint taint) {
        this.taint = taint;
        return this;
    }

    @Override
    public DeviceTaintRuleSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (taint == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "taint", "taint",
                "Missing 'taint' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (deviceSelector != null ? "\"deviceSelector\":" + deviceSelector.asJson() : ""),
                    (taint != null ? "\"taint\":" + taint.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
