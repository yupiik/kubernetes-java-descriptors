package io.yupiik.kubernetes.bindings.v1_22_0.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpec {
    private Integer minReadySeconds;
    private String podManagementPolicy;
    private Integer replicas;
    private Integer revisionHistoryLimit;
    private StatefulSetListItemsSpecSelector selector;
    private String serviceName;
    private StatefulSetListItemsSpecTemplate template;
    private StatefulSetListItemsSpecUpdateStrategy updateStrategy;
    private List<StatefulSetListItemsSpecVolumeClaimTemplates> volumeClaimTemplates;

    public StatefulSetListItemsSpec() {
        // no-op
    }

    public StatefulSetListItemsSpec(final Integer minReadySeconds,
                                    final String podManagementPolicy,
                                    final Integer replicas,
                                    final Integer revisionHistoryLimit,
                                    final StatefulSetListItemsSpecSelector selector,
                                    final String serviceName,
                                    final StatefulSetListItemsSpecTemplate template,
                                    final StatefulSetListItemsSpecUpdateStrategy updateStrategy,
                                    final List<StatefulSetListItemsSpecVolumeClaimTemplates> volumeClaimTemplates) {
        // no-op
    }

    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    public void setMinReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
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

    public StatefulSetListItemsSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final StatefulSetListItemsSpecSelector selector) {
        this.selector = selector;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    public StatefulSetListItemsSpecTemplate getTemplate() {
        return template;
    }

    public void setTemplate(final StatefulSetListItemsSpecTemplate template) {
        this.template = template;
    }

    public StatefulSetListItemsSpecUpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    public void setUpdateStrategy(final StatefulSetListItemsSpecUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    public List<StatefulSetListItemsSpecVolumeClaimTemplates> getVolumeClaimTemplates() {
        return volumeClaimTemplates;
    }

    public void setVolumeClaimTemplates(final List<StatefulSetListItemsSpecVolumeClaimTemplates> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                minReadySeconds,
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
        if (!(__other instanceof StatefulSetListItemsSpec)) {
            return false;
        }
        final StatefulSetListItemsSpec __otherCasted = (StatefulSetListItemsSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(podManagementPolicy, __otherCasted.podManagementPolicy) &&
            Objects.equals(replicas, __otherCasted.replicas) &&
            Objects.equals(revisionHistoryLimit, __otherCasted.revisionHistoryLimit) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(updateStrategy, __otherCasted.updateStrategy) &&
            Objects.equals(volumeClaimTemplates, __otherCasted.volumeClaimTemplates);
    }
}
