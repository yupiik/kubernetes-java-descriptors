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
package io.yupiik.kubernetes.bindings.v1_19_15.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_15.Validable;
import io.yupiik.kubernetes.bindings.v1_19_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LoadBalancerIngress implements Validable<LoadBalancerIngress>, Exportable {
    private String hostname;
    private String ip;

    public LoadBalancerIngress() {
        // no-op
    }

    public LoadBalancerIngress(final String hostname,
                               final String ip) {
        // no-op
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
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
                hostname,
                ip);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LoadBalancerIngress)) {
            return false;
        }
        final LoadBalancerIngress __otherCasted = (LoadBalancerIngress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip);
    }

    public LoadBalancerIngress hostname(final String hostname) {
        this.hostname = hostname;
        return this;
    }

    public LoadBalancerIngress ip(final String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public LoadBalancerIngress validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (hostname != null ? "\"hostname\":\"" +  JsonStrings.escapeJson(hostname) + "\"" : ""),
                    (ip != null ? "\"ip\":\"" +  JsonStrings.escapeJson(ip) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
