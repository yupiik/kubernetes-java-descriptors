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
package io.yupiik.kubernetes.bindings.v1_31_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_31_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_5.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceCIDRSpec implements Validable<ServiceCIDRSpec>, Exportable {
    private List<String> cidrs;

    public ServiceCIDRSpec() {
        // no-op
    }

    public ServiceCIDRSpec(final List<String> cidrs) {
        this.cidrs = cidrs;
    }

    public List<String> getCidrs() {
        return cidrs;
    }

    public void setCidrs(final List<String> cidrs) {
        this.cidrs = cidrs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cidrs);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceCIDRSpec)) {
            return false;
        }
        final ServiceCIDRSpec __otherCasted = (ServiceCIDRSpec) __other;
        return Objects.equals(cidrs, __otherCasted.cidrs);
    }

    public ServiceCIDRSpec cidrs(final List<String> cidrs) {
        this.cidrs = cidrs;
        return this;
    }

    @Override
    public ServiceCIDRSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (cidrs != null ? "\"cidrs\":" + cidrs.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
