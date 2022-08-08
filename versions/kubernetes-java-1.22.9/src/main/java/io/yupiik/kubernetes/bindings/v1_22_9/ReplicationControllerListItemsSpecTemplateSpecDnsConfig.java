package io.yupiik.kubernetes.bindings.v1_22_9;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<ReplicationControllerListItemsSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public ReplicationControllerListItemsSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                                                   final List<ReplicationControllerListItemsSpecTemplateSpecDnsConfigOptions> options,
                                                                   final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<ReplicationControllerListItemsSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecDnsConfig __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
