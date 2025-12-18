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
package io.yupiik.kubernetes.bindings.v1_28_x.v1;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import io.yupiik.kubernetes.bindings.v1_28_x.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.networking.v1.IPBlock implements Validable<io.k8s.api.networking.v1.IPBlock>, Exportable {
    private String cidr;
    private List<String> except;

    public io.k8s.api.networking.v1.IPBlock() {
        // no-op
    }

    public io.k8s.api.networking.v1.IPBlock(final String cidr,
                                            final List<String> except) {
        this.cidr = cidr;
        this.except = except;
    }

    public String getCidr() {
        return cidr;
    }

    public void setCidr(final String cidr) {
        this.cidr = cidr;
    }

    public List<String> getExcept() {
        return except;
    }

    public void setExcept(final List<String> except) {
        this.except = except;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cidr,
                except);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.networking.v1.IPBlock)) {
            return false;
        }
        final io.k8s.api.networking.v1.IPBlock __otherCasted = (io.k8s.api.networking.v1.IPBlock) __other;
        return Objects.equals(cidr, __otherCasted.cidr) &&
            Objects.equals(except, __otherCasted.except);
    }

    public io.k8s.api.networking.v1.IPBlock cidr(final String cidr) {
        this.cidr = cidr;
        return this;
    }

    public io.k8s.api.networking.v1.IPBlock except(final List<String> except) {
        this.except = except;
        return this;
    }

    @Override
    public io.k8s.api.networking.v1.IPBlock validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (cidr == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "cidr", "cidr",
                "Missing 'cidr' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (cidr != null ? "\"cidr\":\"" +  JsonStrings.escapeJson(cidr) + "\"" : ""),
                    (except != null ? "\"except\":" + except.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
