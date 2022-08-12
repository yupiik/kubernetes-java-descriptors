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
package io.yupiik.kubernetes.bindings.v1_17_11.v1;

import io.yupiik.kubernetes.bindings.v1_17_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_11.Validable;
import io.yupiik.kubernetes.bindings.v1_17_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ClientIPConfig implements Validable<ClientIPConfig>, Exportable {
    private Integer timeoutSeconds;

    public ClientIPConfig() {
        // no-op
    }

    public ClientIPConfig(final Integer timeoutSeconds) {
        // no-op
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
        if (!(__other instanceof ClientIPConfig)) {
            return false;
        }
        final ClientIPConfig __otherCasted = (ClientIPConfig) __other;
        return Objects.equals(timeoutSeconds, __otherCasted.timeoutSeconds);
    }

    public ClientIPConfig timeoutSeconds(final Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    @Override
    public ClientIPConfig validate() {
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
