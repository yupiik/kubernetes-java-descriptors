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
package io.yupiik.kubernetes.bindings.v1_34_x.v1;

import io.yupiik.kubernetes.bindings.v1_34_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.core.v1.ClientIPConfig implements Validable<io.k8s.api.core.v1.ClientIPConfig>, Exportable {
    private Integer timeoutSeconds;

    public io.k8s.api.core.v1.ClientIPConfig() {
        // no-op
    }

    public io.k8s.api.core.v1.ClientIPConfig(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                timeoutSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.core.v1.ClientIPConfig)) {
            return false;
        }
        final io.k8s.api.core.v1.ClientIPConfig __otherCasted = (io.k8s.api.core.v1.ClientIPConfig) __other;
        return Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }

    public io.k8s.api.core.v1.ClientIPConfig timeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    @Override
    public io.k8s.api.core.v1.ClientIPConfig validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (timeoutSeconds != null ? "\"timeoutSeconds\":" + timeoutSeconds : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
