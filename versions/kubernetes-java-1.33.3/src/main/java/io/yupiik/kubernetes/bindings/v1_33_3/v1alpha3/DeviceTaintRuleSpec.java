/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_33_3.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import io.yupiik.kubernetes.bindings.v1_33_3.ValidationException;
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
