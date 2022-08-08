package io.yupiik.kubernetes.bindings.v1_22_2.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector;
    private List<String> namespaces;
    private String topologyKey;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution(final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector,
                                                                                                                            final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector,
                                                                                                                            final List<String> namespaces,
                                                                                                                            final String topologyKey) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
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
                namespaceSelector,
                namespaces,
                topologyKey);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }
}
