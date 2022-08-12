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
package io.yupiik.kubernetes.bindings.v1_19_1.v1;

import io.yupiik.kubernetes.bindings.v1_19_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_19_1.Validable;
import io.yupiik.kubernetes.bindings.v1_19_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SELinuxOptions implements Validable<SELinuxOptions>, Exportable {
    private String level;
    private String role;
    private String type;
    private String user;

    public SELinuxOptions() {
        // no-op
    }

    public SELinuxOptions(final String level,
                          final String role,
                          final String type,
                          final String user) {
        // no-op
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(final String level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public void setRole(final String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                level,
                role,
                type,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SELinuxOptions)) {
            return false;
        }
        final SELinuxOptions __otherCasted = (SELinuxOptions) __other;
        return Objects.equals(level, __otherCasted.level) &&
            Objects.equals(role, __otherCasted.role) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(user, __otherCasted.user);
    }

    public SELinuxOptions level(final String level) {
        this.level = level;
        return this;
    }

    public SELinuxOptions role(final String role) {
        this.role = role;
        return this;
    }

    public SELinuxOptions type(final String type) {
        this.type = type;
        return this;
    }

    public SELinuxOptions user(final String user) {
        this.user = user;
        return this;
    }

    @Override
    public SELinuxOptions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (level != null ? "\"level\":\"" +  JsonStrings.escapeJson(level) + "\"" : ""),
                    (role != null ? "\"role\":\"" +  JsonStrings.escapeJson(role) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""),
                    (user != null ? "\"user\":\"" +  JsonStrings.escapeJson(user) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
