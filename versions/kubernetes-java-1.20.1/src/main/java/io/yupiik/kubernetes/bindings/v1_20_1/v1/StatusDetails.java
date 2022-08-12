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
package io.yupiik.kubernetes.bindings.v1_20_1.v1;

import io.yupiik.kubernetes.bindings.v1_20_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_1.Validable;
import io.yupiik.kubernetes.bindings.v1_20_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StatusDetails implements Validable<StatusDetails>, Exportable {
    private List<StatusCause> causes;
    private String group;
    private String kind;
    private String name;
    private Integer retryAfterSeconds;
    private String uid;

    public StatusDetails() {
        // no-op
    }

    public StatusDetails(final List<StatusCause> causes,
                         final String group,
                         final String kind,
                         final String name,
                         final Integer retryAfterSeconds,
                         final String uid) {
        // no-op
    }

    public List<StatusCause> getCauses() {
        return causes;
    }

    public void setCauses(final List<StatusCause> causes) {
        this.causes = causes;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getRetryAfterSeconds() {
        return retryAfterSeconds;
    }

    public void setRetryAfterSeconds(final Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                causes,
                group,
                kind,
                name,
                retryAfterSeconds,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatusDetails)) {
            return false;
        }
        final StatusDetails __otherCasted = (StatusDetails) __other;
        return Objects.equals(causes, __otherCasted.causes) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(retryAfterSeconds, __otherCasted.retryAfterSeconds) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public StatusDetails causes(final List<StatusCause> causes) {
        this.causes = causes;
        return this;
    }

    public StatusDetails group(final String group) {
        this.group = group;
        return this;
    }

    public StatusDetails kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public StatusDetails name(final String name) {
        this.name = name;
        return this;
    }

    public StatusDetails retryAfterSeconds(final Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
        return this;
    }

    public StatusDetails uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public StatusDetails validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (causes != null ? "\"causes\":" + causes.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (group != null ? "\"group\":\"" +  JsonStrings.escapeJson(group) + "\"" : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (retryAfterSeconds != null ? "\"retryAfterSeconds\":" + retryAfterSeconds : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
