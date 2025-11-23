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
package io.yupiik.kubernetes.bindings.v1_28_6.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_28_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_6.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ParentReference implements Validable<ParentReference>, Exportable {
    private String group;
    private String name;
    private String namespace;
    private String resource;
    private String uid;

    public ParentReference() {
        // no-op
    }

    public ParentReference(final String group,
                           final String name,
                           final String namespace,
                           final String resource,
                           final String uid) {
        this.group = group;
        this.name = name;
        this.namespace = namespace;
        this.resource = resource;
        this.uid = uid;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(final String resource) {
        this.resource = resource;
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
                group,
                name,
                namespace,
                resource,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ParentReference)) {
            return false;
        }
        final ParentReference __otherCasted = (ParentReference) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public ParentReference group(final String group) {
        this.group = group;
        return this;
    }

    public ParentReference name(final String name) {
        this.name = name;
        return this;
    }

    public ParentReference namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ParentReference resource(final String resource) {
        this.resource = resource;
        return this;
    }

    public ParentReference uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public ParentReference validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (group != null ? "\"group\":\"" +  JsonStrings.escapeJson(group) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""),
                    (resource != null ? "\"resource\":\"" +  JsonStrings.escapeJson(resource) + "\"" : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
