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
package io.yupiik.kubernetes.bindings.v1_23_9.v1;

import io.yupiik.kubernetes.bindings.v1_23_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_9.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_9.Validable;
import io.yupiik.kubernetes.bindings.v1_23_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodIP implements Validable<PodIP>, Exportable {
    private String ip;

    public PodIP() {
        // no-op
    }

    public PodIP(final String ip) {
        // no-op
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
                ip);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodIP)) {
            return false;
        }
        final PodIP __otherCasted = (PodIP) __other;
        return Objects.equals(ip, __otherCasted.ip);
    }

    public PodIP ip(final String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public PodIP validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (ip != null ? "\"ip\":\"" +  JsonStrings.escapeJson(ip) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
