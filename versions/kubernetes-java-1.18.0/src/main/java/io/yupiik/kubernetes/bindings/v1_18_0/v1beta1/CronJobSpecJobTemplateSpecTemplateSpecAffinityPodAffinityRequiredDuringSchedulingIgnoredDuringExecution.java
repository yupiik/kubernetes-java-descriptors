package io.yupiik.kubernetes.bindings.v1_18_0.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector;
    private List<String> namespaces;
    private String topologyKey;

    public CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution(final CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector,
                                                                                                                   final List<String> namespaces,
                                                                                                                   final String topologyKey) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(final List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                labelSelector,
                namespaces,
                topologyKey);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }
}
