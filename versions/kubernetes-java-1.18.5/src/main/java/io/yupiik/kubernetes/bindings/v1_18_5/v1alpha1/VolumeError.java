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
package io.yupiik.kubernetes.bindings.v1_18_5.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_18_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_18_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_18_5.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeError implements Validable<VolumeError>, Exportable {
    private String message;
    private String time;

    public VolumeError() {
        // no-op
    }

    public VolumeError(final String message,
                       final String time) {
        this.message = message;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(final String time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                message,
                time);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeError)) {
            return false;
        }
        final VolumeError __otherCasted = (VolumeError) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(time, __otherCasted.time);
    }

    public VolumeError message(final String message) {
        this.message = message;
        return this;
    }

    public VolumeError time(final String time) {
        this.time = time;
        return this;
    }

    @Override
    public VolumeError validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (message != null ? "\"message\":\"" +  JsonStrings.escapeJson(message) + "\"" : ""),
                    (time != null ? "\"time\":\"" +  JsonStrings.escapeJson(time) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
