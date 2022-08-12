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
package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import jakarta.json.JsonArray;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Patch implements Validable<Patch>, Exportable {
    private String descriptorName;
    private Boolean interpolate;
    private JsonArray patch;

    public Patch() {
        // no-op
    }

    public Patch(final String descriptorName,
                 final Boolean interpolate,
                 final JsonArray patch) {
        // no-op
    }

    public String getDescriptorName() {
        return descriptorName;
    }

    public void setDescriptorName(final String descriptorName) {
        this.descriptorName = descriptorName;
    }

    public Boolean getInterpolate() {
        return interpolate;
    }

    public void setInterpolate(final Boolean interpolate) {
        this.interpolate = interpolate;
    }

    public JsonArray getPatch() {
        return patch;
    }

    public void setPatch(final JsonArray patch) {
        this.patch = patch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                descriptorName,
                interpolate,
                patch);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Patch)) {
            return false;
        }
        final Patch __otherCasted = (Patch) __other;
        return Objects.equals(descriptorName, __otherCasted.descriptorName) &&
            Objects.equals(interpolate, __otherCasted.interpolate) &&
            Objects.equals(patch, __otherCasted.patch);
    }

    public Patch descriptorName(final String descriptorName) {
        this.descriptorName = descriptorName;
        return this;
    }

    public Patch interpolate(final Boolean interpolate) {
        this.interpolate = interpolate;
        return this;
    }

    public Patch patch(final JsonArray patch) {
        this.patch = patch;
        return this;
    }

    @Override
    public Patch validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (descriptorName != null ? "\"descriptorName\":\"" +  JsonStrings.escapeJson(descriptorName) + "\"" : ""),
                    (interpolate != null ? "\"interpolate\":" + interpolate : ""),
                    (patch != null ? "\"patch\":" + patch : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
