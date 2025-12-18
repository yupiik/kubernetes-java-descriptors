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
package io.yupiik.kubernetes.bindings.v1_28_x.v1;

import io.yupiik.kubernetes.bindings.v1_28_x.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_x.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_x.Validable;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class io.k8s.api.authorization.v1.SubjectAccessReviewSpec implements Validable<io.k8s.api.authorization.v1.SubjectAccessReviewSpec>, Exportable {
    private JsonObject extra;
    private List<String> groups;
    private NonResourceAttributes nonResourceAttributes;
    private ResourceAttributes resourceAttributes;
    private String uid;
    private String user;

    public io.k8s.api.authorization.v1.SubjectAccessReviewSpec() {
        // no-op
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewSpec(final JsonObject extra,
                                                               final List<String> groups,
                                                               final NonResourceAttributes nonResourceAttributes,
                                                               final ResourceAttributes resourceAttributes,
                                                               final String uid,
                                                               final String user) {
        this.extra = extra;
        this.groups = groups;
        this.nonResourceAttributes = nonResourceAttributes;
        this.resourceAttributes = resourceAttributes;
        this.uid = uid;
        this.user = user;
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

    public NonResourceAttributes getNonResourceAttributes() {
        return nonResourceAttributes;
    }

    public void setNonResourceAttributes(final NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
    }

    public ResourceAttributes getResourceAttributes() {
        return resourceAttributes;
    }

    public void setResourceAttributes(final ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
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
                extra,
                groups,
                nonResourceAttributes,
                resourceAttributes,
                uid,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof io.k8s.api.authorization.v1.SubjectAccessReviewSpec)) {
            return false;
        }
        final io.k8s.api.authorization.v1.SubjectAccessReviewSpec __otherCasted = (io.k8s.api.authorization.v1.SubjectAccessReviewSpec) __other;
        return Objects.equals(extra, __otherCasted.extra) &&
            Objects.equals(groups, __otherCasted.groups) &&
            Objects.equals(nonResourceAttributes, __otherCasted.nonResourceAttributes) &&
            Objects.equals(resourceAttributes, __otherCasted.resourceAttributes) &&
            Objects.equals(uid, __otherCasted.uid) &&
            Objects.equals(user, __otherCasted.user);
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewSpec extra(final JsonObject extra) {
        this.extra = extra;
        return this;
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewSpec groups(final List<String> groups) {
        this.groups = groups;
        return this;
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewSpec nonResourceAttributes(final NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        return this;
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewSpec resourceAttributes(final ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewSpec uid(final String uid) {
        this.uid = uid;
        return this;
    }

    public io.k8s.api.authorization.v1.SubjectAccessReviewSpec user(final String user) {
        this.user = user;
        return this;
    }

    @Override
    public io.k8s.api.authorization.v1.SubjectAccessReviewSpec validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (extra != null ? "\"extra\":" + extra : ""),
                    (groups != null ? "\"groups\":" + groups.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (nonResourceAttributes != null ? "\"nonResourceAttributes\":" + nonResourceAttributes.asJson() : ""),
                    (resourceAttributes != null ? "\"resourceAttributes\":" + resourceAttributes.asJson() : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""),
                    (user != null ? "\"user\":\"" +  JsonStrings.escapeJson(user) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
