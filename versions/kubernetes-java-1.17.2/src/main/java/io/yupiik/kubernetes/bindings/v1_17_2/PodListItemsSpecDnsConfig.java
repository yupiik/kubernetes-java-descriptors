package io.yupiik.kubernetes.bindings.v1_17_2;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecDnsConfig {
    private List<String> nameservers;
    private List<PodListItemsSpecDnsConfigOptions> options;
    private List<String> searches;

    public PodListItemsSpecDnsConfig() {
        // no-op
    }

    public PodListItemsSpecDnsConfig(final List<String> nameservers,
                                     final List<PodListItemsSpecDnsConfigOptions> options,
                                     final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<PodListItemsSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<PodListItemsSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof PodListItemsSpecDnsConfig)) {
            return false;
        }
        final PodListItemsSpecDnsConfig __otherCasted = (PodListItemsSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
