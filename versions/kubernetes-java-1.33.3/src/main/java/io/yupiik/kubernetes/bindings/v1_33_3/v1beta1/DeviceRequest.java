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
package io.yupiik.kubernetes.bindings.v1_33_3.v1beta1;

import io.yupiik.kubernetes.bindings.v1_33_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_3.Validable;
import io.yupiik.kubernetes.bindings.v1_33_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceRequest implements Validable<DeviceRequest>, Exportable {
    private Boolean adminAccess;
    private String allocationMode;
    private Integer count;
    private String deviceClassName;
    private List<DeviceSubRequest> firstAvailable;
    private String name;
    private List<DeviceSelector> selectors;
    private List<DeviceToleration> tolerations;

    public DeviceRequest() {
        // no-op
    }

    public DeviceRequest(final Boolean adminAccess,
                         final String allocationMode,
                         final Integer count,
                         final String deviceClassName,
                         final List<DeviceSubRequest> firstAvailable,
                         final String name,
                         final List<DeviceSelector> selectors,
                         final List<DeviceToleration> tolerations) {
        this.adminAccess = adminAccess;
        this.allocationMode = allocationMode;
        this.count = count;
        this.deviceClassName = deviceClassName;
        this.firstAvailable = firstAvailable;
        this.name = name;
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

    public List<DeviceSubRequest> getFirstAvailable() {
        return firstAvailable;
    }

    public void setFirstAvailable(final List<DeviceSubRequest> firstAvailable) {
        this.firstAvailable = firstAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
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
                firstAvailable,
                name,
                selectors,
                tolerations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceRequest)) {
            return false;
        }
        final DeviceRequest __otherCasted = (DeviceRequest) __other;
        return Objects.equals(adminAccess, __otherCasted.adminAccess) &&
            Objects.equals(allocationMode, __otherCasted.allocationMode) &&
            Objects.equals(count, __otherCasted.count) &&
            Objects.equals(deviceClassName, __otherCasted.deviceClassName) &&
            Objects.equals(firstAvailable, __otherCasted.firstAvailable) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(selectors, __otherCasted.selectors) &&
            Objects.equals(tolerations, __otherCasted.tolerations);
    }

    public DeviceRequest adminAccess(final Boolean adminAccess) {
        this.adminAccess = adminAccess;
        return this;
    }

    public DeviceRequest allocationMode(final String allocationMode) {
        this.allocationMode = allocationMode;
        return this;
    }

    public DeviceRequest count(final Integer count) {
        this.count = count;
        return this;
    }

    public DeviceRequest deviceClassName(final String deviceClassName) {
        this.deviceClassName = deviceClassName;
        return this;
    }

    public DeviceRequest firstAvailable(final List<DeviceSubRequest> firstAvailable) {
        this.firstAvailable = firstAvailable;
        return this;
    }

    public DeviceRequest name(final String name) {
        this.name = name;
        return this;
    }

    public DeviceRequest selectors(final List<DeviceSelector> selectors) {
        this.selectors = selectors;
        return this;
    }

    public DeviceRequest tolerations(final List<DeviceToleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }

    @Override
    public DeviceRequest validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
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
                    (firstAvailable != null ? "\"firstAvailable\":" + firstAvailable.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (selectors != null ? "\"selectors\":" + selectors.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (tolerations != null ? "\"tolerations\":" + tolerations.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
