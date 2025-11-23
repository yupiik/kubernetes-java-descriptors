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
package io.yupiik.kubernetes.bindings.v1_33_0.v1;

import io.yupiik.kubernetes.bindings.v1_33_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_0.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceAttributes implements Validable<ResourceAttributes>, Exportable {
    private FieldSelectorAttributes fieldSelector;
    private String group;
    private LabelSelectorAttributes labelSelector;
    private String name;
    private String namespace;
    private String resource;
    private String subresource;
    private String verb;
    private String version;

    public ResourceAttributes() {
        // no-op
    }

    public ResourceAttributes(final FieldSelectorAttributes fieldSelector,
                              final String group,
                              final LabelSelectorAttributes labelSelector,
                              final String name,
                              final String namespace,
                              final String resource,
                              final String subresource,
                              final String verb,
                              final String version) {
        this.fieldSelector = fieldSelector;
        this.group = group;
        this.labelSelector = labelSelector;
        this.name = name;
        this.namespace = namespace;
        this.resource = resource;
        this.subresource = subresource;
        this.verb = verb;
        this.version = version;
    }

    public FieldSelectorAttributes getFieldSelector() {
        return fieldSelector;
    }

    public void setFieldSelector(final FieldSelectorAttributes fieldSelector) {
        this.fieldSelector = fieldSelector;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public LabelSelectorAttributes getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final LabelSelectorAttributes labelSelector) {
        this.labelSelector = labelSelector;
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

    public String getSubresource() {
        return subresource;
    }

    public void setSubresource(final String subresource) {
        this.subresource = subresource;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(final String verb) {
        this.verb = verb;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fieldSelector,
                group,
                labelSelector,
                name,
                namespace,
                resource,
                subresource,
                verb,
                version);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceAttributes)) {
            return false;
        }
        final ResourceAttributes __otherCasted = (ResourceAttributes) __other;
        return Objects.equals(fieldSelector, __otherCasted.fieldSelector) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(resource, __otherCasted.resource) &&
            Objects.equals(subresource, __otherCasted.subresource) &&
            Objects.equals(verb, __otherCasted.verb) &&
            Objects.equals(version, __otherCasted.version);
    }

    public ResourceAttributes fieldSelector(final FieldSelectorAttributes fieldSelector) {
        this.fieldSelector = fieldSelector;
        return this;
    }

    public ResourceAttributes group(final String group) {
        this.group = group;
        return this;
    }

    public ResourceAttributes labelSelector(final LabelSelectorAttributes labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public ResourceAttributes name(final String name) {
        this.name = name;
        return this;
    }

    public ResourceAttributes namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ResourceAttributes resource(final String resource) {
        this.resource = resource;
        return this;
    }

    public ResourceAttributes subresource(final String subresource) {
        this.subresource = subresource;
        return this;
    }

    public ResourceAttributes verb(final String verb) {
        this.verb = verb;
        return this;
    }

    public ResourceAttributes version(final String version) {
        this.version = version;
        return this;
    }

    @Override
    public ResourceAttributes validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (fieldSelector != null ? "\"fieldSelector\":" + fieldSelector.asJson() : ""),
                    (group != null ? "\"group\":\"" +  JsonStrings.escapeJson(group) + "\"" : ""),
                    (labelSelector != null ? "\"labelSelector\":" + labelSelector.asJson() : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""),
                    (resource != null ? "\"resource\":\"" +  JsonStrings.escapeJson(resource) + "\"" : ""),
                    (subresource != null ? "\"subresource\":\"" +  JsonStrings.escapeJson(subresource) + "\"" : ""),
                    (verb != null ? "\"verb\":\"" +  JsonStrings.escapeJson(verb) + "\"" : ""),
                    (version != null ? "\"version\":\"" +  JsonStrings.escapeJson(version) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
