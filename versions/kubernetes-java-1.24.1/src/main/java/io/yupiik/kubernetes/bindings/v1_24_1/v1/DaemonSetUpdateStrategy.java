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
package io.yupiik.kubernetes.bindings.v1_24_1.v1;

import io.yupiik.kubernetes.bindings.v1_24_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DaemonSetUpdateStrategy implements Validable<DaemonSetUpdateStrategy>, Exportable {
    private RollingUpdateDaemonSet rollingUpdate;
    private String type;

    public DaemonSetUpdateStrategy() {
        // no-op
    }

    public DaemonSetUpdateStrategy(final RollingUpdateDaemonSet rollingUpdate,
                                   final String type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    public RollingUpdateDaemonSet getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final RollingUpdateDaemonSet rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rollingUpdate,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetUpdateStrategy)) {
            return false;
        }
        final DaemonSetUpdateStrategy __otherCasted = (DaemonSetUpdateStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }

    public DaemonSetUpdateStrategy rollingUpdate(final RollingUpdateDaemonSet rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public DaemonSetUpdateStrategy type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public DaemonSetUpdateStrategy validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (rollingUpdate != null ? "\"rollingUpdate\":" + rollingUpdate.asJson() : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
