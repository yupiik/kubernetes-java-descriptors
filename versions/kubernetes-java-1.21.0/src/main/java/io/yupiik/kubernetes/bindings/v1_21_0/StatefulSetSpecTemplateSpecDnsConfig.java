package io.yupiik.kubernetes.bindings.v1_21_0;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<StatefulSetSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public StatefulSetSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                                final List<StatefulSetSpecTemplateSpecDnsConfigOptions> options,
                                                final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<StatefulSetSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<StatefulSetSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecDnsConfig __otherCasted = (StatefulSetSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
