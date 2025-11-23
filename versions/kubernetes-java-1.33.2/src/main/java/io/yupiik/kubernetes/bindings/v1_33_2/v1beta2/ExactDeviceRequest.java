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
package io.yupiik.kubernetes.bindings.v1_33_2.v1beta2;

import io.yupiik.kubernetes.bindings.v1_33_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_2.Validable;
import io.yupiik.kubernetes.bindings.v1_33_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ExactDeviceRequest implements Validable<ExactDeviceRequest>, Exportable {
    private Boolean adminAccess;
    private String allocationMode;
    private Integer count;
    private String deviceClassName;
    private List<DeviceSelector> selectors;
    private List<DeviceToleration> tolerations;

    public ExactDeviceRequest() {
        // no-op
    }

    public ExactDeviceRequest(final Boolean adminAccess,
                              final String allocationMode,
                              final Integer count,
                              final String deviceClassName,
                              final List<DeviceSelector> selectors,
                              final List<DeviceToleration> tolerations) {
        this.adminAccess = adminAccess;
        this.allocationMode = allocationMode;
        this.count = count;
        this.deviceClassName = deviceClassName;
        this.selectors = selectors;
        this.tolerations = tolerations;
    }

    public Boolean getAdminAccess() {
        return adminAccess;
    }

    public void setAdminAccess(final Boolean adminAccess) {
        this.adminAccess = adminAccess;
    }

    public String getAllocationMode() {
        return allocationMode;
    }

    public void setAllocationMode(final String allocationMode) {
        this.allocationMode = allocationMode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    public String getDeviceClassName() {
        return deviceClassName;
    }

    public void setDeviceClassName(final String deviceClassName) {
        this.deviceClassName = deviceClassName;
    }

    public List<DeviceSelector> getSelectors() {
        return selectors;
    }

    public void setSelectors(final List<DeviceSelector> selectors) {
        this.selectors = selectors;
    }

    public List<DeviceToleration> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<DeviceToleration> tolerations) {
        this.tolerations = tolerations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                adminAccess,
                allocationMode,
                count,
                deviceClassName,
                selectors,
                tolerations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExactDeviceRequest)) {
            return false;
        }
        final ExactDeviceRequest __otherCasted = (ExactDeviceRequest) __other;
        return Objects.equals(adminAccess, __otherCasted.adminAccess) &&
            Objects.equals(allocationMode, __otherCasted.allocationMode) &&
            Objects.equals(count, __otherCasted.count) &&
            Objects.equals(deviceClassName, __otherCasted.deviceClassName) &&
            Objects.equals(selectors, __otherCasted.selectors) &&
            Objects.equals(tolerations, __otherCasted.tolerations);
    }

    public ExactDeviceRequest adminAccess(final Boolean adminAccess) {
        this.adminAccess = adminAccess;
        return this;
    }

    public ExactDeviceRequest allocationMode(final String allocationMode) {
        this.allocationMode = allocationMode;
        return this;
    }

    public ExactDeviceRequest count(final Integer count) {
        this.count = count;
        return this;
    }

    public ExactDeviceRequest deviceClassName(final String deviceClassName) {
        this.deviceClassName = deviceClassName;
        return this;
    }

    public ExactDeviceRequest selectors(final List<DeviceSelector> selectors) {
        this.selectors = selectors;
        return this;
    }

    public ExactDeviceRequest tolerations(final List<DeviceToleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }

    @Override
    public ExactDeviceRequest validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (deviceClassName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "deviceClassName", "deviceClassName",
                "Missing 'deviceClassName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (adminAccess != null ? "\"adminAccess\":" + adminAccess : ""),
                    (allocationMode != null ? "\"allocationMode\":\"" +  JsonStrings.escapeJson(allocationMode) + "\"" : ""),
                    (count != null ? "\"count\":" + count : ""),
                    (deviceClassName != null ? "\"deviceClassName\":\"" +  JsonStrings.escapeJson(deviceClassName) + "\"" : ""),
                    (selectors != null ? "\"selectors\":" + selectors.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (tolerations != null ? "\"tolerations\":" + tolerations.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
