/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_24_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_24_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_1.Validable;
import io.yupiik.kubernetes.bindings.v1_24_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AllowedFlexVolume implements Validable<AllowedFlexVolume>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
