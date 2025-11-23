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
package io.yupiik.kubernetes.bindings.v1_28_0.v1beta3;

import io.yupiik.kubernetes.bindings.v1_28_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_0.Validable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ObjectMeta implements Validable<ObjectMeta>, Exportable {
    private Map<String, String> annotations;
    private String creationTimestamp;
    private Integer deletionGracePeriodSeconds;
    private String deletionTimestamp;
    private List<String> finalizers;
    private String generateName;
    private Integer generation;
    private Map<String, String> labels;
    private List<ManagedFieldsEntry> managedFields;
    private String name;
    private String namespace;
    private List<OwnerReference> ownerReferences;
    private String resourceVersion;
    private String selfLink;
    private String uid;

    public ObjectMeta() {
        // no-op
    }

    public ObjectMeta(final Map<String, String> annotations,
                      final String creationTimestamp,
                      final Integer deletionGracePeriodSeconds,
                      final String deletionTimestamp,
                      final List<String> finalizers,
                      final String generateName,
                      final Integer generation,
                      final Map<String, String> labels,
                      final List<ManagedFieldsEntry> managedFields,
                      final String name,
                      final String namespace,
                      final List<OwnerReference> ownerReferences,
                      final String resourceVersion,
                      final String selfLink,
                      final String uid) {
        this.annotations = annotations;
        this.creationTimestamp = creationTimestamp;
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
        this.deletionTimestamp = deletionTimestamp;
        this.finalizers = finalizers;
        this.generateName = generateName;
        this.generation = generation;
        this.labels = labels;
        this.managedFields = managedFields;
        this.name = name;
        this.namespace = namespace;
        this.ownerReferences = ownerReferences;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
        this.uid = uid;
    }

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(final Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(final String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Integer getDeletionGracePeriodSeconds() {
        return deletionGracePeriodSeconds;
    }

    public void setDeletionGracePeriodSeconds(final Integer deletionGracePeriodSeconds) {
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    }

    public String getDeletionTimestamp() {
        return deletionTimestamp;
    }

    public void setDeletionTimestamp(final String deletionTimestamp) {
        this.deletionTimestamp = deletionTimestamp;
    }

    public List<String> getFinalizers() {
        return finalizers;
    }

    public void setFinalizers(final List<String> finalizers) {
        this.finalizers = finalizers;
    }

    public String getGenerateName() {
        return generateName;
    }

    public void setGenerateName(final String generateName) {
        this.generateName = generateName;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(final Integer generation) {
        this.generation = generation;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(final Map<String, String> labels) {
        this.labels = labels;
    }

    public List<ManagedFieldsEntry> getManagedFields() {
        return managedFields;
    }

    public void setManagedFields(final List<ManagedFieldsEntry> managedFields) {
        this.managedFields = managedFields;
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

    public List<OwnerReference> getOwnerReferences() {
        return ownerReferences;
    }

    public void setOwnerReferences(final List<OwnerReference> ownerReferences) {
        this.ownerReferences = ownerReferences;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(final String selfLink) {
        this.selfLink = selfLink;
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
                annotations,
                creationTimestamp,
                deletionGracePeriodSeconds,
                deletionTimestamp,
                finalizers,
                generateName,
                generation,
                labels,
                managedFields,
                name,
                namespace,
                ownerReferences,
                resourceVersion,
                selfLink,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ObjectMeta)) {
            return false;
        }
        final ObjectMeta __otherCasted = (ObjectMeta) __other;
        return Objects.equals(annotations, __otherCasted.annotations) &&
            Objects.equals(creationTimestamp, __otherCasted.creationTimestamp) &&
            Objects.equals(deletionGracePeriodSeconds, __otherCasted.deletionGracePeriodSeconds) &&
            Objects.equals(deletionTimestamp, __otherCasted.deletionTimestamp) &&
            Objects.equals(finalizers, __otherCasted.finalizers) &&
            Objects.equals(generateName, __otherCasted.generateName) &&
            Objects.equals(generation, __otherCasted.generation) &&
            Objects.equals(labels, __otherCasted.labels) &&
            Objects.equals(managedFields, __otherCasted.managedFields) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(ownerReferences, __otherCasted.ownerReferences) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(selfLink, __otherCasted.selfLink) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public ObjectMeta annotations(final Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public ObjectMeta creationTimestamp(final String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    public ObjectMeta deletionGracePeriodSeconds(final Integer deletionGracePeriodSeconds) {
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
        return this;
    }

    public ObjectMeta deletionTimestamp(final String deletionTimestamp) {
        this.deletionTimestamp = deletionTimestamp;
        return this;
    }

    public ObjectMeta finalizers(final List<String> finalizers) {
        this.finalizers = finalizers;
        return this;
    }

    public ObjectMeta generateName(final String generateName) {
        this.generateName = generateName;
        return this;
    }

    public ObjectMeta generation(final Integer generation) {
        this.generation = generation;
        return this;
    }

    public ObjectMeta labels(final Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public ObjectMeta managedFields(final List<ManagedFieldsEntry> managedFields) {
        this.managedFields = managedFields;
        return this;
    }

    public ObjectMeta name(final String name) {
        this.name = name;
        return this;
    }

    public ObjectMeta namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ObjectMeta ownerReferences(final List<OwnerReference> ownerReferences) {
        this.ownerReferences = ownerReferences;
        return this;
    }

    public ObjectMeta resourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ObjectMeta selfLink(final String selfLink) {
        this.selfLink = selfLink;
        return this;
    }

    public ObjectMeta uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public ObjectMeta validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (annotations != null ? "\"annotations\":" + annotations.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (creationTimestamp != null ? "\"creationTimestamp\":\"" +  JsonStrings.escapeJson(creationTimestamp) + "\"" : ""),
                    (deletionGracePeriodSeconds != null ? "\"deletionGracePeriodSeconds\":" + deletionGracePeriodSeconds : ""),
                    (deletionTimestamp != null ? "\"deletionTimestamp\":\"" +  JsonStrings.escapeJson(deletionTimestamp) + "\"" : ""),
                    (finalizers != null ? "\"finalizers\":" + finalizers.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (generateName != null ? "\"generateName\":\"" +  JsonStrings.escapeJson(generateName) + "\"" : ""),
                    (generation != null ? "\"generation\":" + generation : ""),
                    (labels != null ? "\"labels\":" + labels.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (managedFields != null ? "\"managedFields\":" + managedFields.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""),
                    (namespace != null ? "\"namespace\":\"" +  JsonStrings.escapeJson(namespace) + "\"" : ""),
                    (ownerReferences != null ? "\"ownerReferences\":" + ownerReferences.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (resourceVersion != null ? "\"resourceVersion\":\"" +  JsonStrings.escapeJson(resourceVersion) + "\"" : ""),
                    (selfLink != null ? "\"selfLink\":\"" +  JsonStrings.escapeJson(selfLink) + "\"" : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
