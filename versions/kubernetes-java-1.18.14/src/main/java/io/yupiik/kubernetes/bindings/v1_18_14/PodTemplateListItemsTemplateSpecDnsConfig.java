package io.yupiik.kubernetes.bindings.v1_18_14;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<PodTemplateListItemsTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public PodTemplateListItemsTemplateSpecDnsConfig() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecDnsConfig(final List<String> nameservers,
                                                     final List<PodTemplateListItemsTemplateSpecDnsConfigOptions> options,
                                                     final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<PodTemplateListItemsTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<PodTemplateListItemsTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecDnsConfig)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecDnsConfig __otherCasted = (PodTemplateListItemsTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
