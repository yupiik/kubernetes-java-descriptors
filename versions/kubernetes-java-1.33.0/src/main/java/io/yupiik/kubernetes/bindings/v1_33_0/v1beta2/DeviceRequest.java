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
package io.yupiik.kubernetes.bindings.v1_33_0.v1beta2;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import io.yupiik.kubernetes.bindings.v1_33_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceRequest implements Validable<DeviceRequest>, Exportable {
    private ExactDeviceRequest exactly;
    private List<DeviceSubRequest> firstAvailable;
    private String name;

    public DeviceRequest() {
        // no-op
    }

    public DeviceRequest(final ExactDeviceRequest exactly,
                         final List<DeviceSubRequest> firstAvailable,
                         final String name) {
        this.exactly = exactly;
        this.firstAvailable = firstAvailable;
        this.name = name;
    }

    public ExactDeviceRequest getExactly() {
        return exactly;
    }

    public void setExactly(final ExactDeviceRequest exactly) {
        this.exactly = exactly;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                exactly,
                firstAvailable,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceRequest)) {
            return false;
        }
        final DeviceRequest __otherCasted = (DeviceRequest) __other;
        return Objects.equals(exactly, __otherCasted.exactly) &&
            Objects.equals(firstAvailable, __otherCasted.firstAvailable) &&
            Objects.equals(name, __otherCasted.name);
    }

    public DeviceRequest exactly(final ExactDeviceRequest exactly) {
        this.exactly = exactly;
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
                    (exactly != null ? "\"exactly\":" + exactly.asJson() : ""),
                    (firstAvailable != null ? "\"firstAvailable\":" + firstAvailable.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
