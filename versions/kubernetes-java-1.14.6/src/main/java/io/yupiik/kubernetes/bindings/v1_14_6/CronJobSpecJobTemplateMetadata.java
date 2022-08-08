package io.yupiik.kubernetes.bindings.v1_14_6;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CronJobSpecJobTemplateMetadata {
    private Map<String, String> annotations;
    private String clusterName;
    private String creationTimestamp;
    private Integer deletionGracePeriodSeconds;
    private String deletionTimestamp;
    private List<String> finalizers;
    private String generateName;
    private Integer generation;
    private CronJobSpecJobTemplateMetadataInitializers initializers;
    private Map<String, String> labels;
    private List<CronJobSpecJobTemplateMetadataManagedFields> managedFields;
    private String name;
    private String namespace;
    private List<CronJobSpecJobTemplateMetadataOwnerReferences> ownerReferences;
    private String resourceVersion;
    private String selfLink;
    private String uid;

    public CronJobSpecJobTemplateMetadata() {
        // no-op
    }

    public CronJobSpecJobTemplateMetadata(final Map<String, String> annotations,
                                          final String clusterName,
                                          final String creationTimestamp,
                                          final Integer deletionGracePeriodSeconds,
                                          final String deletionTimestamp,
                                          final List<String> finalizers,
                                          final String generateName,
                                          final Integer generation,
                                          final CronJobSpecJobTemplateMetadataInitializers initializers,
                                          final Map<String, String> labels,
                                          final List<CronJobSpecJobTemplateMetadataManagedFields> managedFields,
                                          final String name,
                                          final String namespace,
                                          final List<CronJobSpecJobTemplateMetadataOwnerReferences> ownerReferences,
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

    public CronJobSpecJobTemplateMetadataInitializers getInitializers() {
        return initializers;
    }

    public void setInitializers(final CronJobSpecJobTemplateMetadataInitializers initializers) {
        this.initializers = initializers;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(final Map<String, String> labels) {
        this.labels = labels;
    }

    public List<CronJobSpecJobTemplateMetadataManagedFields> getManagedFields() {
        return managedFields;
    }

    public void setManagedFields(final List<CronJobSpecJobTemplateMetadataManagedFields> managedFields) {
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

    public List<CronJobSpecJobTemplateMetadataOwnerReferences> getOwnerReferences() {
        return ownerReferences;
    }

    public void setOwnerReferences(final List<CronJobSpecJobTemplateMetadataOwnerReferences> ownerReferences) {
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
        if (!(__other instanceof CronJobSpecJobTemplateMetadata)) {
            return false;
        }
        final CronJobSpecJobTemplateMetadata __otherCasted = (CronJobSpecJobTemplateMetadata) __other;
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
            Objects.equals(managedFields, __otherCasted.managedFields) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(ownerReferences, __otherCasted.ownerReferences) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(selfLink, __otherCasted.selfLink) &&
            Objects.equals(uid, __otherCasted.uid);
    }
}
