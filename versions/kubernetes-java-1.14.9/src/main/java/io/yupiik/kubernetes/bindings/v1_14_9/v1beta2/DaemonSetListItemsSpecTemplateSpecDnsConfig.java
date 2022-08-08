package io.yupiik.kubernetes.bindings.v1_14_9.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<DaemonSetListItemsSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public DaemonSetListItemsSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                                       final List<DaemonSetListItemsSpecTemplateSpecDnsConfigOptions> options,
                                                       final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<DaemonSetListItemsSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<DaemonSetListItemsSpecTemplateSpecDnsConfigOptions> options) {
        this.options = options;
    }

    public List<String> getSearches() {
        return searches;
    }

    public void setSearches(final List<String> searches) {
        this.searches = searches;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nameservers,
                options,
                searches);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecDnsConfig __otherCasted = (DaemonSetListItemsSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
