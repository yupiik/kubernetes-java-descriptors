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
package io.yupiik.kubernetes.bindings.v1_31_0.v1;

import io.yupiik.kubernetes.bindings.v1_31_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_0.Validable;
import io.yupiik.kubernetes.bindings.v1_31_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HostAlias implements Validable<HostAlias>, Exportable {
    private List<String> hostnames;
    private String ip;

    public HostAlias() {
        // no-op
    }

    public HostAlias(final List<String> hostnames,
                     final String ip) {
        this.hostnames = hostnames;
        this.ip = ip;
    }

    public List<String> getHostnames() {
        return hostnames;
    }

    public void setHostnames(final List<String> hostnames) {
        this.hostnames = hostnames;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(final String ip) {
        this.ip = ip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hostnames,
                ip);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HostAlias)) {
            return false;
        }
        final HostAlias __otherCasted = (HostAlias) __other;
        return Objects.equals(hostnames, __otherCasted.hostnames) &&
            Objects.equals(ip, __otherCasted.ip);
    }

    public HostAlias hostnames(final List<String> hostnames) {
        this.hostnames = hostnames;
        return this;
    }

    public HostAlias ip(final String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public HostAlias validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (ip == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "ip", "ip",
                "Missing 'ip' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (hostnames != null ? "\"hostnames\":" + hostnames.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (ip != null ? "\"ip\":\"" +  JsonStrings.escapeJson(ip) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
