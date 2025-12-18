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
import io.yupiik.kubernetes.bindings.v1_34_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_34_x.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.apps.v1.StatefulSetUpdateStrategy implements Validable<io.k8s.api.apps.v1.StatefulSetUpdateStrategy>, Exportable {
    private RollingUpdateStatefulSetStrategy rollingUpdate;
    private String type;

    public io.k8s.api.apps.v1.StatefulSetUpdateStrategy() {
        // no-op
    }

    public io.k8s.api.apps.v1.StatefulSetUpdateStrategy(final RollingUpdateStatefulSetStrategy rollingUpdate,
                                                        final String type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    public RollingUpdateStatefulSetStrategy getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final RollingUpdateStatefulSetStrategy rollingUpdate) {
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
        if (!(__other instanceof io.k8s.api.apps.v1.StatefulSetUpdateStrategy)) {
            return false;
        }
        final io.k8s.api.apps.v1.StatefulSetUpdateStrategy __otherCasted = (io.k8s.api.apps.v1.StatefulSetUpdateStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }

    public io.k8s.api.apps.v1.StatefulSetUpdateStrategy rollingUpdate(final RollingUpdateStatefulSetStrategy rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public io.k8s.api.apps.v1.StatefulSetUpdateStrategy type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public io.k8s.api.apps.v1.StatefulSetUpdateStrategy validate() {
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
