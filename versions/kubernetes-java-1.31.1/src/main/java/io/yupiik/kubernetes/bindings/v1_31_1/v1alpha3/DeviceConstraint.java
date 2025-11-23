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
package io.yupiik.kubernetes.bindings.v1_31_1.v1alpha3;

import io.yupiik.kubernetes.bindings.v1_31_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_1.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeviceConstraint implements Validable<DeviceConstraint>, Exportable {
    private String matchAttribute;
    private List<String> requests;

    public DeviceConstraint() {
        // no-op
    }

    public DeviceConstraint(final String matchAttribute,
                            final List<String> requests) {
        this.matchAttribute = matchAttribute;
        this.requests = requests;
    }

    public String getMatchAttribute() {
        return matchAttribute;
    }

    public void setMatchAttribute(final String matchAttribute) {
        this.matchAttribute = matchAttribute;
    }

    public List<String> getRequests() {
        return requests;
    }

    public void setRequests(final List<String> requests) {
        this.requests = requests;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchAttribute,
                requests);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeviceConstraint)) {
            return false;
        }
        final DeviceConstraint __otherCasted = (DeviceConstraint) __other;
        return Objects.equals(matchAttribute, __otherCasted.matchAttribute) &&
            Objects.equals(requests, __otherCasted.requests);
    }

    public DeviceConstraint matchAttribute(final String matchAttribute) {
        this.matchAttribute = matchAttribute;
        return this;
    }

    public DeviceConstraint requests(final List<String> requests) {
        this.requests = requests;
        return this;
    }

    @Override
    public DeviceConstraint validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (matchAttribute != null ? "\"matchAttribute\":\"" +  JsonStrings.escapeJson(matchAttribute) + "\"" : ""),
                    (requests != null ? "\"requests\":" + requests.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
