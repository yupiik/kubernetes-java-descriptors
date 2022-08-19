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
package io.yupiik.kubernetes.bindings.v1_21_13.v1;

import io.yupiik.kubernetes.bindings.v1_21_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_13.Validable;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class UserInfo implements Validable<UserInfo>, Exportable {
    private JsonObject extra;
    private List<String> groups;
    private String uid;
    private String username;

    public UserInfo() {
        // no-op
    }

    public UserInfo(final JsonObject extra,
                    final List<String> groups,
                    final String uid,
                    final String username) {
        this.extra = extra;
        this.groups = groups;
        this.uid = uid;
        this.username = username;
    }

    public JsonObject getExtra() {
        return extra;
    }

    public void setExtra(final JsonObject extra) {
        this.extra = extra;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(final List<String> groups) {
        this.groups = groups;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                extra,
                groups,
                uid,
                username);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof UserInfo)) {
            return false;
        }
        final UserInfo __otherCasted = (UserInfo) __other;
        return Objects.equals(extra, __otherCasted.extra) &&
            Objects.equals(groups, __otherCasted.groups) &&
            Objects.equals(uid, __otherCasted.uid) &&
            Objects.equals(username, __otherCasted.username);
    }

    public UserInfo extra(final JsonObject extra) {
        this.extra = extra;
        return this;
    }

    public UserInfo groups(final List<String> groups) {
        this.groups = groups;
        return this;
    }

    public UserInfo uid(final String uid) {
        this.uid = uid;
        return this;
    }

    public UserInfo username(final String username) {
        this.username = username;
        return this;
    }

    @Override
    public UserInfo validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (extra != null ? "\"extra\":" + extra : ""),
                    (groups != null ? "\"groups\":" + groups.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""),
                    (username != null ? "\"username\":\"" +  JsonStrings.escapeJson(username) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
