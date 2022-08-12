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
package io.yupiik.kubernetes.bindings.v1_21_14.v1;

import io.yupiik.kubernetes.bindings.v1_21_14.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_14.Validable;
import io.yupiik.kubernetes.bindings.v1_21_14.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EndpointHints implements Validable<EndpointHints>, Exportable {
    private List<ForZone> forZones;

    public EndpointHints() {
        // no-op
    }

    public EndpointHints(final List<ForZone> forZones) {
        // no-op
    }

    public List<ForZone> getForZones() {
        return forZones;
    }

    public void setForZones(final List<ForZone> forZones) {
        this.forZones = forZones;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                forZones);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointHints)) {
            return false;
        }
        final EndpointHints __otherCasted = (EndpointHints) __other;
        return Objects.equals(forZones, __otherCasted.forZones);
    }

    public EndpointHints forZones(final List<ForZone> forZones) {
        this.forZones = forZones;
        return this;
    }

    @Override
    public EndpointHints validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (forZones != null ? "\"forZones\":" + forZones.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
