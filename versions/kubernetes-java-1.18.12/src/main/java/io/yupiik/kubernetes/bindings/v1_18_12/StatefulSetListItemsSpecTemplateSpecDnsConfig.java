package io.yupiik.kubernetes.bindings.v1_18_12;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<StatefulSetListItemsSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public StatefulSetListItemsSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                                         final List<StatefulSetListItemsSpecTemplateSpecDnsConfigOptions> options,
                                                         final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<StatefulSetListItemsSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<StatefulSetListItemsSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecDnsConfig __otherCasted = (StatefulSetListItemsSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
