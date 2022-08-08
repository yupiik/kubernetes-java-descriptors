package io.yupiik.kubernetes.bindings.v1_11_6;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class StatefulSetSpec {
    private String podManagementPolicy;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private StatefulSetSpecSelector selector;
    private String serviceName;
    private StatefulSetSpecTemplate template;
    private StatefulSetSpecUpdateStrategy updateStrategy;
    private List<JsonValue> volumeClaimTemplates;

    public StatefulSetSpec() {
        // no-op
    }

    public StatefulSetSpec(final String podManagementPolicy,
                           final Integer replicas,
                           final Integer revisionHistoryLimit,
                           final StatefulSetSpecSelector selector,
                           final String serviceName,
                           final StatefulSetSpecTemplate template,
                           final StatefulSetSpecUpdateStrategy updateStrategy,
                           final List<JsonValue> volumeClaimTemplates) {
        // no-op
    }

    public String getPodManagementPolicy() {
        return podManagementPolicy;
    }

    public void setPodManagementPolicy(final String podManagementPolicy) {
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

    public StatefulSetSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final StatefulSetSpecSelector selector) {
        this.selector = selector;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    public StatefulSetSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final StatefulSetSpecTemplate template) {
        this.template = template;
    }

    public StatefulSetSpecUpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    public void setUpdateStrategy(final StatefulSetSpecUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    public List<JsonValue> getVolumeClaimTemplates() {
        return volumeClaimTemplates;
    }

    public void setVolumeClaimTemplates(final List<JsonValue> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
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
        return Objects.equals(podManagementPolicy, __otherCasted.podManagementPolicy) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(revisionHistoryLimit, __otherCasted.revisionHistoryLimit) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(updateStrategy, __otherCasted.updateStrategy) &&
            Objects.equals(volumeClaimTemplates, __otherCasted.volumeClaimTemplates);
    }
}
