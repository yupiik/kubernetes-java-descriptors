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
package io.yupiik.kubernetes.bindings.v1_13_7.v1;

import io.yupiik.kubernetes.bindings.v1_13_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_13_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_13_7.Validable;
import io.yupiik.kubernetes.bindings.v1_13_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StatefulSetUpdateStrategy implements Validable<StatefulSetUpdateStrategy>, Exportable {
    private RollingUpdateStatefulSetStrategy rollingUpdate;
    private String type;

    public StatefulSetUpdateStrategy() {
        // no-op
    }

    public StatefulSetUpdateStrategy(final RollingUpdateStatefulSetStrategy rollingUpdate,
                                     final String type) {
        // no-op
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
        if (!(__other instanceof StatefulSetUpdateStrategy)) {
            return false;
        }
        final StatefulSetUpdateStrategy __otherCasted = (StatefulSetUpdateStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }

    public StatefulSetUpdateStrategy rollingUpdate(final RollingUpdateStatefulSetStrategy rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public StatefulSetUpdateStrategy type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public StatefulSetUpdateStrategy validate() {
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
