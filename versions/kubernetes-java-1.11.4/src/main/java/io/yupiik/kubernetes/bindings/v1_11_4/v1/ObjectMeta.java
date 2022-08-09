package io.yupiik.kubernetes.bindings.v1_11_4.v1;

import io.yupiik.kubernetes.bindings.v1_11_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_11_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_11_4.Validable;
import io.yupiik.kubernetes.bindings.v1_11_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ObjectMeta implements Validable<ObjectMeta>, Exportable {
    private Map<String, String> annotations;
    private String clusterName;
    private String creationTimestamp;
    private Integer deletionGracePeriodSeconds;
    private String deletionTimestamp;
    private List<String> finalizers;
    private String generateName;
    private Integer generation;
    private Initializers initializers;
    private Map<String, String> labels;
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
                      final String clusterName,
                      final String creationTimestamp,
                      final Integer deletionGracePeriodSeconds,
                      final String deletionTimestamp,
                      final List<String> finalizers,
                      final String generateName,
                      final Integer generation,
                      final Initializers initializers,
                      final Map<String, String> labels,
                      final String name,
                      final String namespace,
                      final List<OwnerReference> ownerReferences,
                      final String resourceVersion,
                      final String selfLink,
                      final String uid) {
        // no-op
    }

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(final Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(final String clusterName) {
        this.clusterName = clusterName;
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

    public Initializers getInitializers() {
        return initializers;
    }

    public void setInitializers(final Initializers initializers) {
        this.initializers = initializers;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(final Map<String, String> labels) {
        this.labels = labels;
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
                clusterName,
                creationTimestamp,
                deletionGracePeriodSeconds,
                deletionTimestamp,
                finalizers,
                generateName,
                generation,
                initializers,
                labels,
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
            Objects.equals(clusterName, __otherCasted.clusterName) &&
            Objects.equals(creationTimestamp, __otherCasted.creationTimestamp) &&
            Objects.equals(deletionGracePeriodSeconds, __otherCasted.deletionGracePeriodSeconds) &&
            Objects.equals(deletionTimestamp, __otherCasted.deletionTimestamp) &&
            Objects.equals(finalizers, __otherCasted.finalizers) &&
            Objects.equals(generateName, __otherCasted.generateName) &&
            Objects.equals(generation, __otherCasted.generation) &&
            Objects.equals(initializers, __otherCasted.initializers) &&
            Objects.equals(labels, __otherCasted.labels) &&
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

    public ObjectMeta clusterName(final String clusterName) {
        this.clusterName = clusterName;
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

    public ObjectMeta initializers(final Initializers initializers) {
        this.initializers = initializers;
        return this;
    }

    public ObjectMeta labels(final Map<String, String> labels) {
        this.labels = labels;
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
                    (clusterName != null ? "\"clusterName\":\"" +  JsonStrings.escapeJson(clusterName) + "\"" : ""),
                    (creationTimestamp != null ? "\"creationTimestamp\":\"" +  JsonStrings.escapeJson(creationTimestamp) + "\"" : ""),
                    (deletionGracePeriodSeconds != null ? "\"deletionGracePeriodSeconds\":" + deletionGracePeriodSeconds : ""),
                    (deletionTimestamp != null ? "\"deletionTimestamp\":\"" +  JsonStrings.escapeJson(deletionTimestamp) + "\"" : ""),
                    (finalizers != null ? "\"finalizers\":" + finalizers.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (generateName != null ? "\"generateName\":\"" +  JsonStrings.escapeJson(generateName) + "\"" : ""),
                    (generation != null ? "\"generation\":" + generation : ""),
                    (initializers != null ? "\"initializers\":" + initializers.asJson() : ""),
                    (labels != null ? "\"labels\":" + labels.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
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
