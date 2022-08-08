package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import io.yupiik.kubernetes.bindings.v1_23_4.Validable;
import io.yupiik.kubernetes.bindings.v1_23_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StatefulSetSpec implements Validable<StatefulSetSpec> {
    private Integer minReadySeconds;
    private StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy;
    private StatefulSetSpecPodManagementPolicy podManagementPolicy;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private LabelSelector selector;
    private String serviceName;
    private PodTemplateSpec template;
    private StatefulSetUpdateStrategy updateStrategy;
    private List<PersistentVolumeClaim> volumeClaimTemplates;

    public StatefulSetSpec() {
        // no-op
    }

    public StatefulSetSpec(final Integer minReadySeconds,
                           final StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy,
                           final StatefulSetSpecPodManagementPolicy podManagementPolicy,
                           final Integer replicas,
                           final Integer revisionHistoryLimit,
                           final LabelSelector selector,
                           final String serviceName,
                           final PodTemplateSpec template,
                           final StatefulSetUpdateStrategy updateStrategy,
                           final List<PersistentVolumeClaim> volumeClaimTemplates) {
        // no-op
    }

    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    public void setMinReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    public StatefulSetPersistentVolumeClaimRetentionPolicy getPersistentVolumeClaimRetentionPolicy() {
        return persistentVolumeClaimRetentionPolicy;
    }

    public void setPersistentVolumeClaimRetentionPolicy(final StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy) {
        this.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
    }

    public StatefulSetSpecPodManagementPolicy getPodManagementPolicy() {
        return podManagementPolicy;
    }

    public void setPodManagementPolicy(final StatefulSetSpecPodManagementPolicy podManagementPolicy) {
        this.podManagementPolicy = podManagementPolicy;
    }

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(final Integer replicas) {
        this.replicas = replicas;
    }

    public Integer getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    public PodTemplateSpec getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateSpec template) {
        this.template = template;
    }

    public StatefulSetUpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    public void setUpdateStrategy(final StatefulSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    public List<PersistentVolumeClaim> getVolumeClaimTemplates() {
        return volumeClaimTemplates;
    }

    public void setVolumeClaimTemplates(final List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                minReadySeconds,
                persistentVolumeClaimRetentionPolicy,
                podManagementPolicy,
                replicas,
                revisionHistoryLimit,
                selector,
                serviceName,
                template,
                updateStrategy,
                volumeClaimTemplates);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpec)) {
            return false;
        }
        final StatefulSetSpec __otherCasted = (StatefulSetSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(persistentVolumeClaimRetentionPolicy, __otherCasted.persistentVolumeClaimRetentionPolicy) &&
            Objects.equals(podManagementPolicy, __otherCasted.podManagementPolicy) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(revisionHistoryLimit, __otherCasted.revisionHistoryLimit) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(updateStrategy, __otherCasted.updateStrategy) &&
            Objects.equals(volumeClaimTemplates, __otherCasted.volumeClaimTemplates);
    }

    public StatefulSetSpec minReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public StatefulSetSpec persistentVolumeClaimRetentionPolicy(final StatefulSetPersistentVolumeClaimRetentionPolicy persistentVolumeClaimRetentionPolicy) {
        this.persistentVolumeClaimRetentionPolicy = persistentVolumeClaimRetentionPolicy;
        return this;
    }

    public StatefulSetSpec podManagementPolicy(final StatefulSetSpecPodManagementPolicy podManagementPolicy) {
        this.podManagementPolicy = podManagementPolicy;
        return this;
    }

    public StatefulSetSpec replicas(final Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public StatefulSetSpec revisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }

    public StatefulSetSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public StatefulSetSpec serviceName(final String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public StatefulSetSpec template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    public StatefulSetSpec updateStrategy(final StatefulSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }

    public StatefulSetSpec volumeClaimTemplates(final List<PersistentVolumeClaim> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
        return this;
    }

    @Override
    public StatefulSetSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (selector == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "selector", "selector",
                "Missing 'selector' attribute.", true));
        }
        if (serviceName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "serviceName", "serviceName",
                "Missing 'serviceName' attribute.", true));
        }
        if (template == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "template", "template",
                "Missing 'template' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
